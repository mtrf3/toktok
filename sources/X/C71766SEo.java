package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SEo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71766SEo extends C113664d8 {
    public final /* synthetic */ SubPaymentListAssem LJLIL;

    public C71766SEo(SubPaymentListAssem subPaymentListAssem) {
        this.LJLIL = subPaymentListAssem;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (charSequence != null) {
            SubPaymentListAssem subPaymentListAssem = this.LJLIL;
            SubPaymentListViewModel x3 = subPaymentListAssem.x3();
            String text = charSequence.toString();
            x3.getClass();
            o.LJIIIZ(text, "text");
            x3.withState(new AqS65S1100000_12(text, x3, 21));
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View tvCancel = subPaymentListAssem._$_findCachedViewById(R.id.lvo);
                o.LJIIIIZZ(tvCancel, "tvCancel");
                OUP.LJIJJLI(tvCancel);
                View iconClear = subPaymentListAssem._$_findCachedViewById(R.id.ea2);
                o.LJIIIIZZ(iconClear, "iconClear");
                OUP.LJIJJLI(iconClear);
                return;
            }
            View tvCancel2 = subPaymentListAssem._$_findCachedViewById(R.id.lvo);
            o.LJIIIIZZ(tvCancel2, "tvCancel");
            OUP.LJJLIIIJ(tvCancel2);
            View iconClear2 = subPaymentListAssem._$_findCachedViewById(R.id.ea2);
            o.LJIIIIZZ(iconClear2, "iconClear");
            OUP.LJJLIIIJ(iconClear2);
            subPaymentListAssem.v3().LJLJJL.LIZIZ("cancel");
        }
    }
}
