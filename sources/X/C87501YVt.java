package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.YVt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87501YVt implements InterfaceC50666JuY {
    public final /* synthetic */ C87497YVp LJLIL;

    public C87501YVt(C87497YVp c87497YVp) {
        this.LJLIL = c87497YVp;
    }

    @Override // X.InterfaceC50666JuY
    public final void Yv(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBatchDetailFailed: ");
        LIZ.append(exc);
        C36922EeM.LIZLLL(6, "ExtDetailChatOperator2", X1D.LIZIZ(LIZ));
        if (exc instanceof C38306F1q) {
            C38306F1q c38306F1q = (C38306F1q) exc;
            if (c38306F1q.getErrorCode() == 2053 || c38306F1q.getErrorCode() == 5) {
                s00(null);
                return;
            }
        }
        C87497YVp c87497YVp = this.LJLIL;
        KQA kqa = c87497YVp.LJLJLLL;
        if (kqa != null) {
            kqa.c0(c87497YVp.LJLJI);
        }
        C87497YVp c87497YVp2 = this.LJLIL;
        boolean z = c87497YVp2.LJLJI;
        c87497YVp2.LJLJI = false;
        if (!z) {
            int i = c87497YVp2.LJLILLLLZI;
            if (i != 1) {
                if (i != 2) {
                    KQA kqa2 = c87497YVp2.LJLJLLL;
                    if (kqa2 != null) {
                        kqa2.nc(exc);
                        return;
                    }
                    return;
                }
                KQA kqa3 = c87497YVp2.LJLJLLL;
                if (kqa3 == null) {
                    return;
                }
                kqa3.Qw(exc);
                return;
            }
            KQA kqa4 = c87497YVp2.LJLJLLL;
            if (kqa4 == null) {
                return;
            }
            kqa4.cb0(exc);
        }
    }

    @Override // X.InterfaceC50666JuY
    public final void s00(List<Aweme> list) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBatchDetailSuccess: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C36922EeM.LIZLLL(4, "ExtDetailChatOperator2", X1D.LIZIZ(LIZ));
        this.LJLIL.LIZJ(list);
    }
}
