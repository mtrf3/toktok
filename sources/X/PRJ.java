package X;

import Y.AObjectS22S0001000_6;
import Y.AObjectS23S0000000_6;
import Y.ARunnableS47S0100000_11;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PRJ implements InterfaceC55057LjB {
    public final String LIZ;
    public PRT LIZIZ;
    public PRT LIZJ;

    @Override // X.InterfaceC55057LjB
    public final void LIZIZ() {
        this.LIZJ = null;
    }

    @Override // X.InterfaceC55057LjB
    public final void LJIIIZ() {
        C1DH.LJJIJIIJIL(3000L, new ARunnableS47S0100000_11(this, 168));
    }

    @Override // X.InterfaceC55057LjB
    public final void start() {
        C06140Ly.LIZ(this.LIZ);
        PQG.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC55057LjB
    public final void stop() {
        C06140Ly.LIZJ(this.LIZ);
        PQG.LIZJ(this.LIZ);
    }

    public PRJ(String scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
        PRN prn = new PRN(this);
        OM4 om4 = PQG.LIZLLL;
        if (om4 != null) {
            synchronized (om4) {
                ((ArrayList) om4.LJLILLLLZI).add(prn);
            }
        } else {
            o.LJIJI("fluencyObserverList");
            throw null;
        }
    }

    @Override // X.InterfaceC55057LjB
    public final void LIZLLL(AbstractC55114Lk6 abstractC55114Lk6) {
        C222248ns.LIZ(this.LIZ);
        if (abstractC55114Lk6 != null) {
            abstractC55114Lk6.LJI(new PRP(this));
        }
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LJ(C78588Usq listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZIZ = listener;
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final void LJFF(ViewPager viewPager) {
        C222248ns.LIZ(this.LIZ);
        String str = this.LIZ;
        if (viewPager != null) {
            if (str != null) {
                viewPager.addOnPageChangeListener(new PRR(str));
                return;
            }
            throw new IllegalArgumentException("param scene is null");
        }
        throw new IllegalArgumentException("param viewPager is null");
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LJI(PRT listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZJ = listener;
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final void LJIIIIZZ(RecyclerView recyclerView) {
        if (!TextUtils.equals(this.LIZ, "user_profile")) {
            C222248ns.LIZ(this.LIZ);
        }
        String str = this.LIZ;
        if (recyclerView != null) {
            if (str != null) {
                recyclerView.LJIIJJI(new PRQ(str));
                return;
            }
            throw new IllegalArgumentException("param scene is null");
        }
        throw new IllegalArgumentException("param recyclerView is null");
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        PQG.LIZ(this.LIZ, str, value);
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LJII(Object value, String str) {
        o.LJIIIZ(value, "value");
        if (value instanceof String) {
            PQG.LIZ(this.LIZ, str, (String) value);
        }
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final void LIZJ(C80796VnM c80796VnM, AObjectS23S0000000_6 aObjectS23S0000000_6, AObjectS22S0001000_6 aObjectS22S0001000_6, AObjectS22S0001000_6 aObjectS22S0001000_62) {
        C222248ns.LIZ(this.LIZ);
        if (c80796VnM != null) {
            c80796VnM.LJI(new PRK(aObjectS22S0001000_62, aObjectS22S0001000_6, c80796VnM, aObjectS23S0000000_6, this));
        }
    }
}
