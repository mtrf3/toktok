package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.ZhE, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90608ZhE extends AbstractC90096ZXo implements ZY8 {
    public final String LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = -1;
    public int LJ;
    public ZY7 LJFF;
    public int LJI;
    public final /* synthetic */ ServiceConnectionC90609ZhF LJII;

    @Override // X.AbstractC90096ZXo
    public final void LJFF() {
        this.LIZJ = true;
        ZY7 zy7 = this.LJFF;
        if (zy7 != null) {
            zy7.LIZ(this.LJI);
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJII() {
        LJIIIIZZ(0);
    }

    @Override // X.ZY8
    public final void LIZ() {
        ZY7 zy7 = this.LJFF;
        if (zy7 != null) {
            int i = this.LJI;
            int i2 = zy7.LJLJJI;
            zy7.LJLJJI = i2 + 1;
            zy7.LIZJ(4, i2, i, null, null);
            this.LJFF = null;
            this.LJI = 0;
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJ() {
        ServiceConnectionC90609ZhF serviceConnectionC90609ZhF = this.LJII;
        serviceConnectionC90609ZhF.LJLLI.remove(this);
        LIZ();
        serviceConnectionC90609ZhF.LJIJJ();
    }

    @Override // X.ZY8
    public final int LIZIZ() {
        return this.LJI;
    }

    @Override // X.ZY8
    public final void LIZJ(ZY7 zy7) {
        this.LJFF = zy7;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        int i = zy7.LJLJJL;
        zy7.LJLJJL = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = zy7.LJLJJI;
        zy7.LJLJJI = i2 + 1;
        zy7.LIZJ(3, i2, i, null, bundle);
        this.LJI = i;
        if (this.LIZJ) {
            zy7.LIZ(i);
            int i3 = this.LIZLLL;
            if (i3 >= 0) {
                zy7.LIZLLL(this.LJI, i3);
                this.LIZLLL = -1;
            }
            int i4 = this.LJ;
            if (i4 != 0) {
                zy7.LJ(this.LJI, i4);
                this.LJ = 0;
            }
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJI(int i) {
        ZY7 zy7 = this.LJFF;
        if (zy7 != null) {
            zy7.LIZLLL(this.LJI, i);
        } else {
            this.LIZLLL = i;
            this.LJ = 0;
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIIZZ(int i) {
        this.LIZJ = false;
        ZY7 zy7 = this.LJFF;
        if (zy7 != null) {
            int i2 = this.LJI;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = zy7.LJLJJI;
            zy7.LJLJJI = i3 + 1;
            zy7.LIZJ(6, i3, i2, null, bundle);
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIZ(int i) {
        ZY7 zy7 = this.LJFF;
        if (zy7 != null) {
            zy7.LJ(this.LJI, i);
        } else {
            this.LJ += i;
        }
    }

    @Override // X.AbstractC90096ZXo
    public final boolean LIZLLL(Intent intent, AbstractC90104ZXw abstractC90104ZXw) {
        ZY7 zy7 = this.LJFF;
        if (zy7 != null) {
            return zy7.LIZIZ(this.LJI, intent, abstractC90104ZXw);
        }
        return false;
    }

    public C90608ZhE(ServiceConnectionC90609ZhF serviceConnectionC90609ZhF, String str, String str2) {
        this.LJII = serviceConnectionC90609ZhF;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
