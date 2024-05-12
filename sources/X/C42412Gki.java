package X;

import Y.ACallableS110S0100000_7;
import Y.ACallableS25S1300000_7;
import Y.ACallableS34S1100000_7;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gki, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42412Gki extends AbstractC42411Gkh {
    public final /* synthetic */ InterfaceC42413Gkj LIZJ;
    public final /* synthetic */ List<String> LIZLLL;

    @Override // X.AbstractC42411Gkh
    public final String LIZ() {
        if (!this.LIZLLL.isEmpty()) {
            return ORZ.LLD(this.LIZLLL, ",", null, null, null, 62);
        }
        return "";
    }

    @Override // X.AbstractC42411Gkh
    public final void LIZLLL() {
        super.LIZLLL();
        C10K.LIZIZ(new ACallableS110S0100000_7(this.LIZJ, 57), C10K.LJIIIIZZ, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42412Gki(C42427Gkx c42427Gkx, List list) {
        super("video_2_sticker");
        this.LIZJ = c42427Gkx;
        this.LIZLLL = list;
    }

    @Override // X.AbstractC42411Gkh
    public final void LJ(String str, String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        super.LJ(str, fullFilePath);
        C10K.LIZIZ(new ACallableS34S1100000_7(this.LIZJ, fullFilePath, 7), C10K.LJIIIIZZ, null);
    }

    @Override // X.AbstractC42411Gkh
    public final void LIZIZ(Exception exc, Integer num, String str) {
        super.LIZIZ(exc, num, str);
        C10K.LIZIZ(new ACallableS25S1300000_7(this.LIZJ, exc, str, num, 3), C10K.LJIIIIZZ, null);
    }

    @Override // X.AbstractC42411Gkh
    public final void LIZJ(int i, long j, long j2) {
        C10K.LIZIZ(new ACallableS110S0100000_7(this.LIZJ, i, j, j2, 56), C10K.LJIIIIZZ, null);
    }
}
