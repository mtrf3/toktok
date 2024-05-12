package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wko, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83186Wko {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C1HQ<String, Boolean> LIZ;
    public final C62822Ol8 LIZIZ;
    public final InterfaceC84497XEf LIZJ;

    public final C83310Wmo<C83160WkO, Void> LIZJ() {
        return (C83310Wmo) this.LIZIZ.getValue();
    }

    public C83186Wko(InterfaceC84497XEf effectDownloader) {
        o.LJIIIZ(effectDownloader, "effectDownloader");
        this.LIZJ = effectDownloader;
        this.LIZ = new C1HQ<>();
        this.LIZIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 338));
    }

    public final synchronized void LIZ(ComposerBeauty composerBeauty) {
        this.LIZ.put(composerBeauty.getEffect().getEffectId(), Boolean.TRUE);
    }

    public final int LIZIZ(ComposerBeauty beautyBean, boolean z) {
        boolean LJ;
        o.LJIIIZ(beautyBean, "beautyBean");
        if (C1DH.LJJJIL(beautyBean.getEffect().getEffectId()) < 0) {
            return 4;
        }
        synchronized (this) {
            LJ = o.LJ(this.LIZ.getOrDefault(beautyBean.getEffect().getEffectId(), null), Boolean.TRUE);
        }
        if (LJ) {
            return 4;
        }
        if (z) {
            if (!ujb.o.LJJJJJL(beautyBean.getEffect().getUnzipPath()) && C10820be.LJ(beautyBean.getEffect().getUnzipPath())) {
                return 4;
            }
        } else if (this.LIZJ.LJJIL(beautyBean.getEffect())) {
            LIZ(beautyBean);
            return 4;
        }
        if (LIZJ().LJI(new C83160WkO(beautyBean)) || LIZJ().LJFF(new C83160WkO(beautyBean))) {
            return 8;
        }
        return 2;
    }

    public final boolean LIZLLL(ComposerBeauty beautyBean, boolean z) {
        o.LJIIIZ(beautyBean, "beautyBean");
        if (4 == LIZIZ(beautyBean, z)) {
            return true;
        }
        return false;
    }
}
