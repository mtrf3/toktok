package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.List;

/* renamed from: X.PtO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65882PtO extends AbstractC65440PmG {
    public C65882PtO(C65889PtV c65889PtV) {
        super(c65889PtV);
    }

    @Override // X.AbstractC65440PmG
    public final C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt c64797Pbt) {
        int i;
        C36910EeA c36910EeA;
        String str;
        C65442PmI c65442PmI = AbstractC65440PmG.LIZIZ;
        if (!TextUtils.isEmpty(request.getUrl()) && c64797Pbt != null) {
            C65436PmC c65436PmC = c65441PmH.LIZ;
            if (c65436PmC != null) {
                i = c65436PmC.LIZ;
            } else {
                i = 0;
            }
            if (request.getUrl().contains("/passport/") && i == 0 && (c36910EeA = c64797Pbt.LIZ) != null) {
                List<EJ6> LIZIZ = c36910EeA.LIZIZ("d-ticket");
                String str2 = "";
                if (LIZIZ == null || LIZIZ.size() <= 0) {
                    str = "";
                } else {
                    str = ((EJ6) ListProtector.get(LIZIZ, 0)).LIZIZ;
                }
                List<EJ6> LIZIZ2 = c64797Pbt.LIZ.LIZIZ("d-ticket-sec-uid");
                if (LIZIZ2 != null && LIZIZ2.size() > 0) {
                    str2 = ((EJ6) ListProtector.get(LIZIZ2, 0)).LIZIZ;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    HG3.LJIIIIZZ().saveDTicket(str, str2);
                }
            }
        }
        return c65442PmI;
    }
}
