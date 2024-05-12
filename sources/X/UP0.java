package X;

import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UP0 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final C62822Ol8 LJFF;
    public final C54258LRe LJI;
    public final NextLiveData<Boolean> LJII;

    public final void LIZ(String str) {
        UQ4.LJIILIIL(this.LIZIZ, str, "contact", this.LIZJ, "unknown", UQ4.LJII(), null, this.LJ, 64);
    }

    public final void LIZIZ(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z && o.LJ(this.LIZIZ, "version_update")) {
            z2 = true;
        } else {
            z2 = false;
        }
        java.util.Map<String, String> map = this.LJ;
        if (map == null || !map.containsKey("is_passive") || !o.LJ(map.get("is_passive"), "on")) {
            z3 = false;
        }
        if (z2) {
            LIZ("system");
            this.LJII.postValue(Boolean.TRUE);
            return;
        }
        if (z3 || this.LIZLLL) {
            ((C72743Sgl) this.LJFF.getValue()).LIZ();
            LIZ("system");
            this.LJII.postValue(Boolean.TRUE);
        } else {
            LIZ("authorize");
            C26227ARb c26227ARb = new C26227ARb(this.LIZ);
            c26227ARb.LIZIZ(UP3.LIZ());
            UC0.LIZJ(c26227ARb, new AqS179S0100000_13(this, 514));
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
        }
    }

    public UP0(Context context, String enterFrom, String enterMethod, java.util.Map map, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ = context;
        this.LIZIZ = enterFrom;
        this.LIZJ = enterMethod;
        this.LIZLLL = z;
        this.LJ = map;
        this.LJFF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 463));
        this.LJI = LRD.LIZ(context);
        this.LJII = new NextLiveData<>();
    }
}
