package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.59G, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C59G implements C59H {
    public final /* synthetic */ C59H LJLIL;

    public abstract void LIZIZ();

    public abstract Long LIZJ(long j, long j2);

    @Override // X.C59H
    public final void LIZLLL(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.LJLIL.LIZLLL(z, z2, i, i2, z3);
    }

    public abstract long LJ(NLETrackSlot nLETrackSlot, C5AE c5ae, long j, long j2, long j3, long j4);

    public abstract void LJI();

    public abstract void LJII(long j);

    public abstract void LJIIIZ();

    public abstract void LJIIJ(NLETrackSlot nLETrackSlot);

    public abstract void LJIIJJI(NLETrackSlot nLETrackSlot);

    @Override // X.C59H
    public final void LJJIIZI(int i) {
        this.LJLIL.LJJIIZI(i);
    }

    @Override // X.C59H
    public final void LJJJJJ(int i, boolean z) {
        this.LJLIL.LJJJJJ(i, true);
    }

    public C59G(C59H scrollHandler) {
        o.LJIIIZ(scrollHandler, "scrollHandler");
        this.LJLIL = scrollHandler;
    }

    public final void LJIILIIL(C1303859u trackGroup, int i, int i2, boolean z, boolean z2) {
        o.LJIIIZ(trackGroup, "trackGroup");
        if (!z2 ? i > 0 : i < 0) {
            LJJIIZI(Math.abs(trackGroup.getScrollX() + i));
        }
        C59I.LIZ(this, i, i2, z, false, 24);
    }
}
