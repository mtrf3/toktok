package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZlP, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90867ZlP extends AbstractC90599Zh5 implements ZY8 {
    public final String LJFF;
    public String LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public ZY7 LJIIJJI;
    public final /* synthetic */ ServiceConnectionC90609ZhF LJIILIIL;
    public int LJIIIZ = -1;
    public int LJIIL = -1;

    @Override // X.AbstractC90096ZXo
    public final void LJFF() {
        this.LJIIIIZZ = true;
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            zy7.LIZ(this.LJIIL);
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJII() {
        LJIIIIZZ(0);
    }

    @Override // X.ZY8
    public final void LIZ() {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            int i = this.LJIIL;
            int i2 = zy7.LJLJJI;
            zy7.LJLJJI = i2 + 1;
            zy7.LIZJ(4, i2, i, null, null);
            this.LJIIJJI = null;
            this.LJIIL = 0;
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJ() {
        ServiceConnectionC90609ZhF serviceConnectionC90609ZhF = this.LJIILIIL;
        serviceConnectionC90609ZhF.LJLLI.remove(this);
        LIZ();
        serviceConnectionC90609ZhF.LJIJJ();
    }

    @Override // X.ZY8
    public final int LIZIZ() {
        return this.LJIIL;
    }

    @Override // X.AbstractC90599Zh5
    public final String LJIIJ() {
        return this.LJI;
    }

    @Override // X.AbstractC90599Zh5
    public final String LJIIJJI() {
        return this.LJII;
    }

    @Override // X.ZY8
    public final void LIZJ(ZY7 zy7) {
        C90607ZhD c90607ZhD = new C90607ZhD(this);
        this.LJIIJJI = zy7;
        String str = this.LJFF;
        int i = zy7.LJLJJL;
        zy7.LJLJJL = i + 1;
        int i2 = zy7.LJLJJI;
        zy7.LJLJJI = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        zy7.LIZJ(11, i2, i, null, bundle);
        zy7.LJLJLJ.put(i2, c90607ZhD);
        this.LJIIL = i;
        if (this.LJIIIIZZ) {
            zy7.LIZ(i);
            int i3 = this.LJIIIZ;
            if (i3 >= 0) {
                zy7.LIZLLL(this.LJIIL, i3);
                this.LJIIIZ = -1;
            }
            int i4 = this.LJIIJ;
            if (i4 != 0) {
                zy7.LJ(this.LJIIL, i4);
                this.LJIIJ = 0;
            }
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJI(int i) {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            zy7.LIZLLL(this.LJIIL, i);
        } else {
            this.LJIIIZ = i;
            this.LJIIJ = 0;
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIIZZ(int i) {
        this.LJIIIIZZ = false;
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            int i2 = this.LJIIL;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = zy7.LJLJJI;
            zy7.LJLJJI = i3 + 1;
            zy7.LIZJ(6, i3, i2, null, bundle);
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIZ(int i) {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            zy7.LJ(this.LJIIL, i);
        } else {
            this.LJIIJ += i;
        }
    }

    @Override // X.AbstractC90599Zh5
    public final void LJIILIIL(String str) {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            int i = this.LJIIL;
            zy7.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = zy7.LJLJJI;
            zy7.LJLJJI = i2 + 1;
            zy7.LIZJ(12, i2, i, null, bundle);
        }
    }

    @Override // X.AbstractC90599Zh5
    public final void LJIILJJIL(String str) {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            int i = this.LJIIL;
            zy7.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = zy7.LJLJJI;
            zy7.LJLJJI = i2 + 1;
            zy7.LIZJ(13, i2, i, null, bundle);
        }
    }

    @Override // X.AbstractC90599Zh5
    public final void LJIILL(List<String> list) {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            int i = this.LJIIL;
            zy7.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = zy7.LJLJJI;
            zy7.LJLJJI = i2 + 1;
            zy7.LIZJ(14, i2, i, null, bundle);
        }
    }

    public C90867ZlP(ServiceConnectionC90609ZhF serviceConnectionC90609ZhF, String str) {
        this.LJIILIIL = serviceConnectionC90609ZhF;
        this.LJFF = str;
    }

    @Override // X.AbstractC90096ZXo
    public final boolean LIZLLL(Intent intent, AbstractC90104ZXw abstractC90104ZXw) {
        ZY7 zy7 = this.LJIIJJI;
        if (zy7 != null) {
            return zy7.LIZIZ(this.LJIIL, intent, abstractC90104ZXw);
        }
        return false;
    }
}
