package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.18n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C281318n implements C0XT {
    public static final int[] LJJI = {1, 4, 5, 3, 2, 0};
    public final Context LIZ;
    public final Resources LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C02J LJ;
    public final ArrayList<C281618q> LJFF;
    public final ArrayList<C281618q> LJI;
    public boolean LJII;
    public final ArrayList<C281618q> LJIIIIZZ;
    public final ArrayList<C281618q> LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public CharSequence LJIIL;
    public Drawable LJIILIIL;
    public View LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public C281618q LJIJJLI;
    public boolean LJJ;
    public final ArrayList<C281618q> LJIJI = new ArrayList<>();
    public final CopyOnWriteArrayList<WeakReference<C02O>> LJIJJ = new CopyOnWriteArrayList<>();
    public boolean LJIL = false;

    public String LJIIIZ() {
        return "android:menu:actionviewstates";
    }

    public C281318n LJIIJ() {
        return this;
    }

    public final void LJJ() {
        this.LJIILL = false;
        if (this.LJIILLIIL) {
            this.LJIILLIIL = false;
            LJIILL(this.LJIIZILJ);
        }
    }

    public final void clearHeader() {
        this.LJIILIIL = null;
        this.LJIIL = null;
        this.LJIILJJIL = null;
        LJIILL(false);
    }

    @Override // android.view.Menu
    public final void close() {
        LIZJ(true);
    }

    public final ArrayList<C281618q> LJIIJJI() {
        if (!this.LJII) {
            return this.LJI;
        }
        this.LJI.clear();
        int size = this.LJFF.size();
        for (int i = 0; i < size; i++) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJFF, i);
            if (c281618q.isVisible()) {
                this.LJI.add(c281618q);
            }
        }
        this.LJII = false;
        this.LJIIJ = true;
        return this.LJI;
    }

    public final void LJJI() {
        if (!this.LJIILL) {
            this.LJIILL = true;
            this.LJIILLIIL = false;
            this.LJIIZILJ = false;
        }
    }

    @Override // android.view.Menu
    public final void clear() {
        C281618q c281618q = this.LJIJJLI;
        if (c281618q != null) {
            LIZLLL(c281618q);
        }
        this.LJFF.clear();
        LJIILL(true);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.LJJ) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C281618q) ListProtector.get(this.LJFF, i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final int size() {
        return this.LJFF.size();
    }

    public final void LJIIIIZZ() {
        ArrayList<C281618q> LJIIJJI = LJIIJJI();
        if (!this.LJIIJ) {
            return;
        }
        Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<C02O> next = it.next();
            C02O c02o = next.get();
            if (c02o == null) {
                this.LJIJJ.remove(next);
            } else {
                z |= c02o.LJII();
            }
        }
        if (z) {
            this.LJIIIIZZ.clear();
            this.LJIIIZ.clear();
            int size = LJIIJJI.size();
            for (int i = 0; i < size; i++) {
                C281618q c281618q = (C281618q) ListProtector.get(LJIIJJI, i);
                if ((c281618q.LJJ & 32) == 32) {
                    this.LJIIIIZZ.add(c281618q);
                } else {
                    this.LJIIIZ.add(c281618q);
                }
            }
        } else {
            this.LJIIIIZZ.clear();
            this.LJIIIZ.clear();
            this.LJIIIZ.addAll(LJIIJJI());
        }
        this.LJIIJ = false;
    }

    public boolean LJIIL() {
        return this.LJIL;
    }

    public boolean LJIILIIL() {
        return this.LIZJ;
    }

    public boolean LJIILJJIL() {
        return this.LIZLLL;
    }

    public C281318n(Context context) {
        Resources resources;
        int identifier;
        boolean z = false;
        this.LIZ = context;
        Resources resources2 = context.getResources();
        this.LIZIZ = resources2;
        this.LJFF = new ArrayList<>();
        this.LJI = new ArrayList<>();
        this.LJII = true;
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = new ArrayList<>();
        this.LJIIJ = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : C16510kp.LIZIZ(viewConfiguration)) {
                z = true;
            }
        }
        this.LIZLLL = z;
    }

    public final void LIZJ(boolean z) {
        if (this.LJIJ) {
            return;
        }
        this.LJIJ = true;
        Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
        while (it.hasNext()) {
            WeakReference<C02O> next = it.next();
            C02O c02o = next.get();
            if (c02o == null) {
                this.LJIJJ.remove(next);
            } else {
                c02o.LIZ(this, z);
            }
        }
        this.LJIJ = false;
    }

    public boolean LIZLLL(C281618q c281618q) {
        boolean z = false;
        if (!this.LJIJJ.isEmpty() && this.LJIJJLI == c281618q) {
            LJJI();
            Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
            while (it.hasNext()) {
                WeakReference<C02O> next = it.next();
                C02O c02o = next.get();
                if (c02o == null) {
                    this.LJIJJ.remove(next);
                } else {
                    z = c02o.LJ(c281618q);
                    if (z) {
                        break;
                    }
                }
            }
            LJJ();
            if (z) {
                this.LJIJJLI = null;
            }
        }
        return z;
    }

    public boolean LJFF(C281618q c281618q) {
        boolean z = false;
        if (this.LJIJJ.isEmpty()) {
            return false;
        }
        LJJI();
        Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
        while (it.hasNext()) {
            WeakReference<C02O> next = it.next();
            C02O c02o = next.get();
            if (c02o == null) {
                this.LJIJJ.remove(next);
            } else {
                z = c02o.LJI(c281618q);
                if (z) {
                    break;
                }
            }
        }
        LJJ();
        if (z) {
            this.LJIJJLI = c281618q;
        }
        return z;
    }

    public void LJIILL(boolean z) {
        if (!this.LJIILL) {
            if (z) {
                this.LJII = true;
                this.LJIIJ = true;
            }
            if (this.LJIJJ.isEmpty()) {
                return;
            }
            LJJI();
            Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
            while (it.hasNext()) {
                WeakReference<C02O> next = it.next();
                C02O c02o = next.get();
                if (c02o == null) {
                    this.LJIJJ.remove(next);
                } else {
                    c02o.LIZJ(z);
                }
            }
            LJJ();
            return;
        }
        this.LJIILLIIL = true;
        if (!z) {
            return;
        }
        this.LJIIZILJ = true;
    }

    public final void LJIIZILJ(C02O c02o) {
        Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
        while (it.hasNext()) {
            WeakReference<C02O> next = it.next();
            C02O c02o2 = next.get();
            if (c02o2 == null || c02o2 == c02o) {
                this.LJIJJ.remove(next);
            }
        }
    }

    public final void LJIJ(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(LJIIIZ());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C281318n) item.getSubMenu()).LJIJ(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public final void LJIJI(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.LJIJJ.isEmpty()) {
            return;
        }
        Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
        while (it.hasNext()) {
            WeakReference<C02O> next = it.next();
            C02O c02o = next.get();
            if (c02o == null) {
                this.LJIJJ.remove(next);
            } else {
                int id = c02o.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    c02o.LJIIJ(parcelable);
                }
            }
        }
    }

    public final void LJIJJ(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C281318n) item.getSubMenu()).LJIJJ(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(LJIIIZ(), sparseArray);
        }
    }

    public final void LJIJJLI(Bundle bundle) {
        Parcelable LIZIZ;
        if (this.LJIJJ.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<C02O>> it = this.LJIJJ.iterator();
        while (it.hasNext()) {
            WeakReference<C02O> next = it.next();
            C02O c02o = next.get();
            if (c02o == null) {
                this.LJIJJ.remove(next);
            } else {
                int id = c02o.getId();
                if (id > 0 && (LIZIZ = c02o.LIZIZ()) != null) {
                    sparseArray.put(id, LIZIZ);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return LIZ(0, 0, 0, this.LIZIZ.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.LIZIZ.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJFF, i2);
            if (c281618q.LIZ == i) {
                return c281618q;
            }
            if (c281618q.hasSubMenu() && (findItem = c281618q.LJIILJJIL.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) ListProtector.get(this.LJFF, i);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((C281618q) ListProtector.get(this.LJFF, i3)).LIZIZ == i) {
                if (i3 >= 0) {
                    int size2 = this.LJFF.size() - i3;
                    while (true) {
                        int i4 = i2 + 1;
                        if (i2 >= size2 || ((C281618q) ListProtector.get(this.LJFF, i3)).LIZIZ != i) {
                            break;
                        }
                        if (i3 < this.LJFF.size()) {
                            ListProtector.remove(this.LJFF, i3);
                        }
                        i2 = i4;
                    }
                    LJIILL(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C281618q) ListProtector.get(this.LJFF, i2)).LIZ == i) {
                if (i2 < 0 || i2 >= this.LJFF.size()) {
                    return;
                }
                ListProtector.remove(this.LJFF, i2);
                LJIILL(true);
                return;
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.LJIL = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.LIZJ = z;
        LJIILL(false);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return LIZ(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void LIZIZ(C02O c02o, Context context) {
        this.LJIJJ.add(new WeakReference<>(c02o));
        c02o.LJIIIIZZ(context, this);
        this.LJIIJ = true;
    }

    public boolean LJ(C281318n c281318n, MenuItem menuItem) {
        C02J c02j = this.LJ;
        if (c02j != null && c02j.LIZIZ(c281318n, menuItem)) {
            return true;
        }
        return false;
    }

    public final C281618q LJI(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C281618q> arrayList = this.LJIJI;
        arrayList.clear();
        LJII(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C281618q) ListProtector.get(arrayList, 0);
        }
        boolean LJIILIIL = LJIILIIL();
        for (int i2 = 0; i2 < size; i2++) {
            C281618q c281618q = (C281618q) ListProtector.get(arrayList, i2);
            if (LJIILIIL) {
                c = c281618q.LJIIIZ;
            } else {
                c = c281618q.LJII;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (LJIILIIL && c == '\b' && i == 67))) {
                return c281618q;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (LJI(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return LJIILLIIL(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.LJFF.size();
        for (int i2 = 0; i2 < size; i2++) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJFF, i2);
            if (c281618q.LIZIZ == i) {
                c281618q.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        int size = this.LJFF.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJFF, i3);
            if (c281618q.LIZIZ == i) {
                int i4 = c281618q.LJJ;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                c281618q.LJJ = i6;
                if (i4 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            LJIILL(true);
        }
    }

    public final void LJII(List<C281618q> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean LJIILIIL = LJIILIIL();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.LJFF.size();
        for (int i3 = 0; i3 < size; i3++) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJFF, i3);
            if (c281618q.hasSubMenu()) {
                c281618q.LJIILJJIL.LJII(list, i, keyEvent);
            }
            if (LJIILIIL) {
                c = c281618q.LJIIIZ;
                i2 = c281618q.LJIIJ;
            } else {
                c = c281618q.LJII;
                i2 = c281618q.LJIIIIZZ;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                char[] cArr = keyData.meta;
                if ((c == cArr[0] || c == cArr[2] || (LJIILIIL && c == '\b' && i == 67)) && c281618q.isEnabled()) {
                    ((ArrayList) list).add(c281618q);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(android.view.MenuItem r9, X.C02O r10, int r11) {
        /*
            r8 = this;
            X.18q r9 = (X.C281618q) r9
            r3 = 0
            if (r9 == 0) goto Lb
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto Lc
        Lb:
            return r3
        Lc:
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.LJIILL
            r2 = 1
            if (r0 == 0) goto La4
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto La4
        L17:
            r7 = 1
        L18:
            X.0kF r6 = r9.LJJII
            if (r6 == 0) goto La2
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto La2
            r4 = 1
        L23:
            boolean r0 = r9.LJ()
            if (r0 == 0) goto L34
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L33
            r8.LIZJ(r2)
        L33:
            return r7
        L34:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L3c
            if (r4 == 0) goto L9a
        L3c:
            r0 = r11 & 4
            if (r0 != 0) goto L43
            r8.LIZJ(r3)
        L43:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L57
            X.1hN r1 = new X.1hN
            android.content.Context r0 = r8.LIZ
            r1.<init>(r0, r8, r9)
            r9.LJIILJJIL = r1
            java.lang.CharSequence r0 = r9.LJ
            r1.setHeaderTitle(r0)
        L57:
            X.1hN r5 = r9.LJIILJJIL
            if (r4 == 0) goto L5e
            r6.LJFF(r5)
        L5e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<X.02O>> r0 = r8.LJIJJ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6d
        L66:
            r7 = r7 | r3
            if (r7 != 0) goto L33
            r8.LIZJ(r2)
            goto L33
        L6d:
            if (r10 == 0) goto L73
            boolean r3 = r10.LJFF(r5)
        L73:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<X.02O>> r0 = r8.LJIJJ
            java.util.Iterator r4 = r0.iterator()
        L79:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r4.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.02O r0 = (X.C02O) r0
            if (r0 != 0) goto L93
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<X.02O>> r0 = r8.LJIJJ
            r0.remove(r1)
            goto L79
        L93:
            if (r3 != 0) goto L79
            boolean r3 = r0.LJFF(r5)
            goto L79
        L9a:
            r0 = r11 & 1
            if (r0 != 0) goto L33
            r8.LIZJ(r2)
            goto L33
        La2:
            r4 = 0
            goto L23
        La4:
            X.18n r0 = r9.LJIILIIL
            boolean r0 = r0.LJ(r0, r9)
            if (r0 == 0) goto Lae
            goto L17
        Lae:
            android.content.Intent r1 = r9.LJI
            if (r1 == 0) goto Lbb
            X.18n r0 = r9.LJIILIIL     // Catch: android.content.ActivityNotFoundException -> Lbb
            android.content.Context r0 = r0.LIZ     // Catch: android.content.ActivityNotFoundException -> Lbb
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> Lbb
            goto L17
        Lbb:
            X.0kF r0 = r9.LJJII
            if (r0 == 0) goto Lc7
            boolean r0 = r0.LJ()
            if (r0 == 0) goto Lc7
            goto L17
        Lc7:
            r7 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C281318n.LJIILLIIL(android.view.MenuItem, X.02O, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C281618q LJI = LJI(i, keyEvent);
        if (LJI != null) {
            z = LJIILLIIL(LJI, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            LIZJ(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.LJFF.size();
        for (int i2 = 0; i2 < size; i2++) {
            C281618q c281618q = (C281618q) ListProtector.get(this.LJFF, i2);
            if (c281618q.LIZIZ == i) {
                c281618q.LJI(z2);
                c281618q.setCheckable(z);
            }
        }
    }

    public C281618q LIZ(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (LJJI[i5] << 16) | (65535 & i3);
            C281618q c281618q = new C281618q(this, i, i2, i3, i6, charSequence, this.LJIIJJI);
            ArrayList<C281618q> arrayList = this.LJFF;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((C281618q) ListProtector.get(arrayList, size)).LIZLLL <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            ListProtector.add(arrayList, i4, c281618q);
            LJIILL(true);
            return c281618q;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return LIZ(i, i2, i3, this.LIZIZ.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C281618q LIZ = LIZ(i, i2, i3, charSequence);
        SubMenuC39851hN subMenuC39851hN = new SubMenuC39851hN(this.LIZ, this, LIZ);
        LIZ.LJIILJJIL = subMenuC39851hN;
        subMenuC39851hN.setHeaderTitle(LIZ.LJ);
        return subMenuC39851hN;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return LIZ(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.LIZIZ.getString(i4));
    }

    public final void LJIL(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.LIZIZ;
        if (view != null) {
            this.LJIILJJIL = view;
            this.LJIIL = null;
            this.LJIILIIL = null;
        } else {
            if (i > 0) {
                this.LJIIL = resources.getText(i);
            } else if (charSequence != null) {
                this.LJIIL = charSequence;
            }
            if (i2 > 0) {
                this.LJIILIIL = C04270Et.LIZIZ(this.LIZ, i2);
            } else if (drawable != null) {
                this.LJIILIIL = drawable;
            }
            this.LJIILJJIL = null;
        }
        LJIILL(false);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.LIZ.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = (ResolveInfo) ListProtector.get(queryIntentActivityOptions, i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C281618q LIZ = LIZ(i, i2, i3, resolveInfo.loadLabel(packageManager));
            LIZ.setIcon(resolveInfo.loadIcon(packageManager));
            LIZ.LJI = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = LIZ;
            }
        }
        return i5;
    }
}
