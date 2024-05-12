package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.K9o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51252K9o extends C8BR<C8BS<EcSearchSugResponse>, KCL> {
    public static Long LJLLI = 0L;
    public static Long LJLLILLLL = 0L;
    public C51259K9v LJLJJLL;
    public final InterfaceC55235Lm3 LJLJLJ;
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public long LJLJJL = 0;
    public final Deque<KBZ> LJLJL = new LinkedList();
    public final ConcurrentHashMap<String, EcSearchSugResponse> LJLJLLL = new ConcurrentHashMap<>();
    public final ARunnableS44S0100000_8 LJLL = new ARunnableS44S0100000_8(this, 95);

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        EcSearchSugResponse ecSearchSugResponse;
        T t = this.LJLIL;
        if (t != 0) {
            ecSearchSugResponse = (EcSearchSugResponse) t.getData();
        } else {
            ecSearchSugResponse = null;
        }
        K k = this.LJLILLLLZI;
        if (k != 0) {
            if (ecSearchSugResponse != null) {
                C3A5.LIZ.LJFF(ecSearchSugResponse.requestId, ecSearchSugResponse.logPb);
                if (KD5.LJLILLLLZI.LJJII()) {
                    this.LJLJLLL.put(ecSearchSugResponse.LJLJI, ecSearchSugResponse);
                }
                KAD.LIZIZ(ecSearchSugResponse.LJLJI);
                ((KCL) this.LJLILLLLZI).ox(ecSearchSugResponse, false);
                return;
            }
            ((KCL) k).r0();
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((KCL) k).r0();
        }
    }

    public C51252K9o(ActivityC45651qj activityC45651qj, InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LJLJLJ = interfaceC55235Lm3;
        LJJ(new C51263K9z(this, activityC45651qj));
    }
}
