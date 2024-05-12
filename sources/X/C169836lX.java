package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169836lX implements InterfaceC82863Wfb {
    public final ActivityC45651qj LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;
    public final InterfaceC88472Yns<Float, Long> LIZJ;
    public final InterfaceC88475Ynv<Boolean, Float, Float, Integer, Float, Float> LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC82863Wfb
    public final C170636mp LIZIZ() {
        Float valueOf = Float.valueOf(0.0f);
        return new C170636mp(2, new OSZ(valueOf, valueOf));
    }

    @Override // X.InterfaceC82863Wfb
    public final String getName() {
        return C16880lQ.LJLLJ(C169836lX.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C169836lX(ActivityC45651qj mActivity, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super Float, Long> interfaceC88472Yns, InterfaceC88475Ynv<? super Boolean, ? super Float, ? super Float, ? super Integer, ? super Float, Float> interfaceC88475Ynv) {
        o.LJIIIZ(mActivity, "mActivity");
        this.LIZ = mActivity;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC88475Ynv;
        this.LJ = true;
    }

    @Override // X.InterfaceC82863Wfb
    public final C170636mp LIZ(float f, float f2, float f3, int i) {
        return LIZLLL(false, f2, f, i, f3);
    }

    @Override // X.InterfaceC82863Wfb
    public final C170636mp LIZJ(float f, float f2, float f3, int i) {
        return LIZLLL(true, f, f2, i, f3);
    }

    public final C170636mp<Float> LIZLLL(boolean z, float f, float f2, int i, float f3) {
        OSZ osz;
        boolean booleanValue = this.LIZIZ.invoke().booleanValue();
        Float valueOf = Float.valueOf(0.0f);
        if (booleanValue) {
            if (!C169816lV.LJ(this.LIZJ.invoke(Float.valueOf(Math.abs((f2 - f) - i) * f3)).longValue())) {
                osz = new OSZ(Boolean.FALSE, valueOf);
            } else {
                osz = new OSZ(Boolean.TRUE, Float.valueOf(this.LIZLLL.invoke(Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3)).floatValue()));
            }
        } else {
            osz = new OSZ(Boolean.FALSE, valueOf);
        }
        if (((Boolean) osz.getFirst()).booleanValue()) {
            if (this.LJ) {
                C78920UyC.LIZLLL(R.string.fsp, this.LIZ, 3063);
                this.LJ = false;
            }
        } else {
            this.LJ = true;
        }
        if (((Boolean) osz.getFirst()).booleanValue()) {
            return new C170636mp<>(1, osz.getSecond());
        }
        return new C170636mp<>(2, valueOf);
    }
}
