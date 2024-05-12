package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.58w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301458w extends AbstractC1301158t {
    public final C29S LJIIJ;
    public C5BJ LJIIJJI;

    @Override // X.InterfaceC1304259y
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
    }

    @Override // X.InterfaceC1304259y
    public final C5A5 LIZJ(int i, C1303859u parent) {
        o.LJIIIZ(parent, "parent");
        AnonymousClass593 anonymousClass593 = new AnonymousClass593(this.LJIIJ);
        C5BJ c5bj = this.LJIIJJI;
        if (c5bj != null) {
            anonymousClass593.LJLJJI.setTtsWavePainter(c5bj);
        }
        return anonymousClass593;
    }

    @Override // X.InterfaceC1304259y
    public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
        C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
        if (trackGroupActionListener != null) {
            trackGroupActionListener.LIZ(j, nLETrackSlot, j2, j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301458w(C29S activity, C1303859u c1303859u, C1303959v c1303959v, C1299358b c1299358b, C58R c58r) {
        super(c1303859u, c1303959v, c1299358b, c58r);
        o.LJIIIZ(activity, "activity");
        this.LJIIJ = activity;
    }
}
