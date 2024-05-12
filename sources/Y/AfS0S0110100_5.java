package Y;

import X.BZI;
import X.C28787BRn;
import X.C29306Beo;
import X.C29401Dk;
import X.C30868C9o;
import X.CVL;
import X.CVT;
import X.InterfaceC64592gB;
import android.os.Message;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS0S0110100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e4, code lost:
    
        if (r7.size() == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01e6, code lost:
    
        r6 = (com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog) r16.l0;
        r6.LLFZ++;
        r6.LLI++;
        r6.LLIFFJFJJ = (java.lang.System.currentTimeMillis() - r16.j2) + r6.LLIFFJFJJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0204, code lost:
    
        ((com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog) r16.l0).LLII++;
        r2 = ((tikcast.api.privilege.StarCommentPurchasePageResponse.Data) r8.data).errorCode;
        r14 = java.lang.System.currentTimeMillis() - r16.j2;
        r5 = r8.LIZIZ;
        kotlin.jvm.internal.o.LJIIIIZZ(r5, "it.logId");
        r4 = X.C28787BRn.LIZ("livesdk_star_comment_purchase_page_polling_request");
        r4.LJIIZILJ();
        X.CVL.LIZ(r4);
        r4.LJIJJ(java.lang.Long.valueOf(r2), "status_code");
        r4.LJIJJ(1, "is_successful");
        r4.LJIJJ(java.lang.Long.valueOf(r14), "duration");
        X.C0JT.LIZJ(r4, r5, "log_id", 0, "is_empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01de, code lost:
    
        if (r7 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c3, code lost:
    
        if (r1 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS0S0110100_5 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0110100_5.accept$0(Y.AfS0S0110100_5, java.lang.Object):void");
    }

    public static final void accept$1(AfS0S0110100_5 afS0S0110100_5, Object obj) {
        C29401Dk c29401Dk;
        String prompt;
        Throwable it = (Throwable) obj;
        if (it instanceof C29401Dk) {
            c29401Dk = (C29401Dk) it;
        } else {
            c29401Dk = null;
        }
        if (afS0S0110100_5.z1) {
            CVT cvt = ((StarCommentPaymentDialog) afS0S0110100_5.l0).LJLLILLLL;
            if (cvt != null) {
                cvt.setVisibility(8);
            }
            LinearLayout linearLayout = ((StarCommentPaymentDialog) afS0S0110100_5.l0).LJLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (c29401Dk != null && (prompt = c29401Dk.getPrompt()) != null && C29306Beo.LJIJJLI(prompt)) {
                C30868C9o.LJI(c29401Dk.getPrompt());
            }
            String str = ((StarCommentPaymentDialog) afS0S0110100_5.l0).LLIIIJ;
            if (str == null) {
                str = "";
            }
            o.LJIIIIZZ(it, "it");
            BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_error_panel_show");
            LIZ.LJIIZILJ();
            CVL.LIZ(LIZ);
            CVL.LIZIZ(LIZ, it, "error_code");
            LIZ.LJIJJ(str, "enter_from");
            LIZ.LJJIIJZLJL();
            long currentTimeMillis = System.currentTimeMillis() - afS0S0110100_5.j2;
            BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_purchase_page_init_request");
            LIZ2.LJIIZILJ();
            CVL.LIZ(LIZ2);
            CVL.LIZIZ(LIZ2, it, "status_code");
            LIZ2.LJIJJ(0, "is_successful");
            LIZ2.LJIJJ(Long.valueOf(currentTimeMillis), "duration");
            LIZ2.LJJIIJZLJL();
            return;
        }
        StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) afS0S0110100_5.l0;
        starCommentPaymentDialog.LLFZ++;
        starCommentPaymentDialog.LLIFFJFJJ = (System.currentTimeMillis() - afS0S0110100_5.j2) + starCommentPaymentDialog.LLIFFJFJJ;
        Message obtainMessage = ((StarCommentPaymentDialog) afS0S0110100_5.l0).LLIIIZ.obtainMessage(1);
        o.LJIIIIZZ(obtainMessage, "handler.obtainMessage(QUERY_TIME)");
        ((StarCommentPaymentDialog) afS0S0110100_5.l0).LLIIIZ.sendMessageDelayed(obtainMessage, LiveStarCommentPurchaseConfig.INSTANCE.getSettingValue().refreshTime * 1000);
        long currentTimeMillis2 = System.currentTimeMillis() - afS0S0110100_5.j2;
        o.LJIIIIZZ(it, "it");
        BZI LIZ3 = C28787BRn.LIZ("livesdk_star_comment_purchase_page_polling_request");
        LIZ3.LJIIZILJ();
        CVL.LIZ(LIZ3);
        CVL.LIZIZ(LIZ3, it, "status_code");
        LIZ3.LJIJJ(0, "is_successful");
        LIZ3.LJIJJ(Long.valueOf(currentTimeMillis2), "duration");
        LIZ3.LJIJJ(1, "is_empty");
        LIZ3.LJJIIJZLJL();
    }

    public AfS0S0110100_5(boolean z, StarCommentPaymentDialog starCommentPaymentDialog, long j, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = starCommentPaymentDialog;
        this.j2 = j;
    }
}
