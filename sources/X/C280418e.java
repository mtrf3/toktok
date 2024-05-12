package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.18e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C280418e extends AnonymousClass021 {
    public final C19E LIZ;
    public final Window.Callback LIZIZ;
    public final C02B LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final ArrayList<InterfaceC009501z> LJI = new ArrayList<>();
    public final IDRunnableS85S0100000 LJII = new IDRunnableS85S0100000(this, 4);

    @Override // X.AnonymousClass021
    public final void LJII() {
    }

    @Override // X.AnonymousClass021
    public final void LJIIL(boolean z) {
    }

    @Override // X.AnonymousClass021
    public final void LJIILL(boolean z) {
    }

    @Override // X.AnonymousClass021
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.AnonymousClass021
    public final boolean LIZIZ() {
        if (this.LIZ.LJIILL()) {
            this.LIZ.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass021
    public final int LIZLLL() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.AnonymousClass021
    public final Context LJ() {
        return this.LIZ.getContext();
    }

    @Override // X.AnonymousClass021
    public final void LJFF() {
        this.LIZ.setVisibility(8);
    }

    @Override // X.AnonymousClass021
    public final boolean LJI() {
        this.LIZ.LIZ.removeCallbacks(this.LJII);
        C16300kU.LJIIL(this.LIZ.LIZ, this.LJII);
        return true;
    }

    @Override // X.AnonymousClass021
    public final void LJIIIIZZ() {
        this.LIZ.LIZ.removeCallbacks(this.LJII);
    }

    @Override // X.AnonymousClass021
    public final boolean LJIIJJI() {
        return this.LIZ.LJ();
    }

    @Override // X.AnonymousClass021
    public final void LJIILJJIL() {
        C19E c19e = this.LIZ;
        c19e.LJII(c19e.LIZIZ & (-9));
    }

    public final Menu LJIJ() {
        if (!this.LJ) {
            C19E c19e = this.LIZ;
            C02N c02n = new C02N() { // from class: X.18c
                public boolean LJLIL;

                @Override // X.C02N
                public final boolean LIZIZ(C281318n c281318n) {
                    C280418e.this.LIZIZ.onMenuOpened(108, c281318n);
                    return true;
                }

                @Override // X.C02N
                public final void LIZ(C281318n c281318n, boolean z) {
                    if (this.LJLIL) {
                        return;
                    }
                    this.LJLIL = true;
                    C280418e.this.LIZ.LJIIJJI();
                    C280418e.this.LIZIZ.onPanelClosed(108, c281318n);
                    this.LJLIL = false;
                }
            };
            C02J c02j = new C02J() { // from class: X.18d
                @Override // X.C02J
                public final boolean LIZIZ(C281318n c281318n, MenuItem menuItem) {
                    return false;
                }

                @Override // X.C02J
                public final void LIZ(C281318n c281318n) {
                    if (C280418e.this.LIZ.LJFF()) {
                        C280418e.this.LIZIZ.onPanelClosed(108, c281318n);
                    } else {
                        if (!C280418e.this.LIZIZ.onPreparePanel(0, null, c281318n)) {
                            return;
                        }
                        C280418e.this.LIZIZ.onMenuOpened(108, c281318n);
                    }
                }
            };
            C011902x c011902x = c19e.LIZ;
            c011902x.LLIILZL = c02n;
            c011902x.LLIIZ = c02j;
            AnonymousClass191 anonymousClass191 = c011902x.LJLIL;
            if (anonymousClass191 != null) {
                anonymousClass191.LL = c02n;
                anonymousClass191.LLD = c02j;
            }
            this.LJ = true;
        }
        return this.LIZ.LIZ.getMenu();
    }

    @Override // X.AnonymousClass021
    public final void LIZJ(boolean z) {
        if (z == this.LJFF) {
            return;
        }
        this.LJFF = z;
        int size = this.LJI.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC009501z) ListProtector.get(this.LJI, i)).LIZ();
        }
    }

    @Override // X.AnonymousClass021
    public final boolean LJIIJ(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            LJIIJJI();
        }
        return true;
    }

    @Override // X.AnonymousClass021
    public final void LJIILIIL(boolean z) {
        C19E c19e = this.LIZ;
        c19e.LJII((c19e.LIZIZ & (-5)) | 4);
    }

    @Override // X.AnonymousClass021
    public final void LJIILLIIL(CharSequence charSequence) {
        this.LIZ.setWindowTitle(charSequence);
    }

    @Override // X.AnonymousClass021
    public final boolean LJIIIZ(int i, KeyEvent keyEvent) {
        int i2;
        Menu LJIJ = LJIJ();
        if (LJIJ == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        int keyboardType = KeyCharacterMap.load(i2).getKeyboardType();
        boolean z = true;
        if (keyboardType == 1) {
            z = false;
        }
        LJIJ.setQwertyMode(z);
        return LJIJ.performShortcut(i, keyEvent, 0);
    }

    public C280418e(C011902x c011902x, CharSequence charSequence, C18O c18o) {
        C280118b c280118b = new C280118b(this);
        c011902x.getClass();
        C19E c19e = new C19E(c011902x, false);
        this.LIZ = c19e;
        c18o.getClass();
        this.LIZIZ = c18o;
        c19e.LJIIJJI = c18o;
        c011902x.setOnMenuItemClickListener(c280118b);
        c19e.setWindowTitle(charSequence);
        this.LIZJ = new C02B(this);
    }
}
