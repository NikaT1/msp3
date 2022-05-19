$(function () {
    const hr = document.getElementById('hour');
    const mn = document.getElementById('min');
    const sc = document.getElementById('sec');
    const date = document.getElementById("date");
    let day = new Date();
    let hh = day.getHours() * 30;
    let mm = day.getMinutes() * 6;
    let ss = day.getSeconds() * 6;
    date.innerText = day.toLocaleDateString() + " " + day.toLocaleTimeString();
    hr.style.transform = `rotateZ(${(hh) + (mm / 12)}deg)`;
    mn.style.transform = `rotateZ(${mm}deg)`;
    sc.style.transform = `rotateZ(${ss}deg)`;

    setInterval(() => {
        day = new Date();
        date.innerText = day.toLocaleDateString() + " " + day.toLocaleTimeString();
        hh = day.getHours() * 30;
        mm = day.getMinutes() * 6;
        ss = day.getSeconds() * 6;

        hr.style.transform = `rotateZ(${(hh) + (mm / 12)}deg)`;
        mn.style.transform = `rotateZ(${mm}deg)`;
        sc.style.transform = `rotateZ(${ss}deg)`;
    }, 12000);
});