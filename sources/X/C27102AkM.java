package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPBottomNotice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AkM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27102AkM extends AbstractC65781Prl implements InterfaceC88475Ynv<AML, OSPBottomNotice, Boolean, Boolean, C27724AuO, C76800UCe> {
    public final /* synthetic */ OrderSubmitBottomWidget LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27102AkM(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
        super(5);
        this.LJLIL = orderSubmitBottomWidget;
        this.LJLILLLLZI = view;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(AML selectSubscribe, OSPBottomNotice oSPBottomNotice, Boolean bool, Boolean bool2, C27724AuO c27724AuO) {
        String str;
        HashMap<String, String> hashMap;
        java.util.Set<String> keySet;
        java.util.Set<String> keySet2;
        String str2;
        String str3;
        OSPBottomNotice oSPBottomNotice2 = oSPBottomNotice;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        this.LJLIL.handlePromotionBanner(this.LJLILLLLZI, bool2.booleanValue(), c27724AuO);
        if (oSPBottomNotice2 == null || (str = oSPBottomNotice2.text) == null || str.length() == 0 || (hashMap = oSPBottomNotice2.arguments) == null || hashMap.isEmpty() || (keySet = oSPBottomNotice2.arguments.keySet()) == null || keySet.isEmpty() || booleanValue) {
            this.LJLILLLLZI.findViewById(R.id.aqp).setVisibility(8);
        } else {
            String str4 = oSPBottomNotice2.text;
            HashMap<String, String> hashMap2 = oSPBottomNotice2.arguments;
            if (hashMap2 != null && (keySet2 = hashMap2.keySet()) != null && (str2 = (String) ORZ.LJLLILLLL(keySet2)) != null && (str3 = oSPBottomNotice2.arguments.get(str2)) != null && str4 != null) {
                int LJJLIIIJL = s.LJJLIIIJL(str4, str2, 0, false, 6);
                int length = str2.length() + LJJLIIIJL;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                View view = this.LJLILLLLZI;
                String substring = str4.substring(0, LJJLIIIJL);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                spannableStringBuilder.append((CharSequence) substring);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new ForegroundColorSpan(C1EU.LIZ(view, "context", R.attr.eb)), 0, str3.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                String substring2 = str4.substring(length);
                o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                spannableStringBuilder.append((CharSequence) substring2);
                ((TextView) this.LJLILLLLZI.findViewById(R.id.aqp)).setText(spannableStringBuilder);
                this.LJLILLLLZI.findViewById(R.id.aqp).setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }
}
