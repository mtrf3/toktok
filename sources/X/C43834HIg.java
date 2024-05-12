package X;

import Y.AfS56S0200000_7;
import Y.IDuS2S1200000_7;
import Y.IDuS319S0100000_7;
import Y.IDuS78S0200000_7;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.HIg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43834HIg implements InterfaceC43874HJu {
    public final /* synthetic */ C43833HIf LIZ;

    public C43834HIg(C43833HIf c43833HIf) {
        this.LIZ = c43833HIf;
    }

    @Override // X.InterfaceC43874HJu
    public final void LIZ(int i, String str, String str2, String str3) {
        AbstractC73672Svk LJJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiEditLog: concat statusCode");
        LIZ.append(i);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        G8G.LIZ.step("av_video_edit", "concatEnd");
        C43840HIm c43840HIm = new C43840HIm(str, str2, str3, i);
        C43833HIf c43833HIf = this.LIZ;
        C43598H9e J0 = c43833HIf.LJLJJI.J0();
        J0.LIZ = C43597H9d.L(J0.LIZ, System.currentTimeMillis(), 0L, null, 6);
        C73390SrC LJIIJ = AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(c43833HIf.LJLJLJ, 5));
        ShortVideoContext shortVideoContext = c43833HIf.LJLJLJ;
        o.LJIIIIZZ(str3, "event.metadata");
        if (shortVideoContext.LJJIJIIJI()) {
            LJJJ = AbstractC73672Svk.LJIIJ(C43839HIl.LJLIL);
        } else {
            LJJJ = AbstractC73672Svk.LJIIJ(new IDuS2S1200000_7(shortVideoContext, c43833HIf, str3, 3)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        }
        AbstractC73672Svk.LJJLJLI(LJIIJ, LJJJ, AbstractC73672Svk.LJIIJ(new IDuS78S0200000_7(c43833HIf, c43840HIm, 5)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()), C45439HsR.LJLJJL).LJJJLIIL(new AfS56S0200000_7(c43833HIf, c43840HIm, 13), C171206nk.LJLIL);
    }
}
