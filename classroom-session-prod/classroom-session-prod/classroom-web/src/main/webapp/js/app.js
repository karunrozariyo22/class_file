// Remembers ticked homework items in the browser.
(function () {
  document.querySelectorAll('#tasks input').forEach(function (box) {
    try { box.checked = localStorage.getItem('cls-' + box.dataset.k) === '1'; } catch (e) {}
    box.addEventListener('change', function () {
      try { localStorage.setItem('cls-' + box.dataset.k, box.checked ? '1' : '0'); } catch (e) {}
    });
  });
})();
