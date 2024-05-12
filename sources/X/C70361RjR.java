package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.payment.PdpPaymentModuleViewHolder;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RjR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70361RjR implements InterfaceC70369RjZ {
    public final /* synthetic */ PdpPaymentModuleViewHolder LIZ;

    public C70361RjR(PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder) {
        this.LIZ = pdpPaymentModuleViewHolder;
    }

    @Override // X.InterfaceC70369RjZ
    public final void LIZ(int i, int i2) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("x: ");
        LIZ.append(i);
        LIZ.append(", oldX: ");
        LIZ.append(i2);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (Math.abs(i - i2) < 2) {
            if (i > i2) {
                str = "show_right";
            } else {
                str = "show_left";
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.LIZ.LJLJI > 200) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("x: ");
                LIZ2.append(i);
                LIZ2.append(", oldX: ");
                LIZ2.append(i2);
                C36746EbW.LIZ(4, X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("slideType: ");
                CK3.LIZIZ(LIZ3, str, LIZ3, 4);
                View itemView = this.LIZ.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C78946Uyc.LJJIIJ(itemView, new C70876Rrk(), new AqS35S1000000_12(str, 3));
                this.LIZ.LJLJI = currentTimeMillis;
            }
        }
    }
}
