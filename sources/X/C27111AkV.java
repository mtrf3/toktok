package X;

import Y.IDCListenerS157S0200000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AkV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27111AkV extends FrameLayout {
    public PhoneCredit LJLIL;
    public InterfaceC88471Ynr<? super PhoneCredit, ? super Boolean, C76800UCe> LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setErrorInfo(String str) {
        if (str == null) {
            LIZ(R.id.hnt).setVisibility(8);
            ((ImageView) LIZ(R.id.hns)).setVisibility(8);
        } else {
            LIZ(R.id.hnt).setVisibility(0);
            ((ImageView) LIZ(R.id.hns)).setVisibility(0);
            ((TextView) LIZ(R.id.hnt)).setText(str);
        }
    }

    public final void setOnFocusChangeListener(InterfaceC88471Ynr<? super PhoneCredit, ? super Boolean, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLILLLLZI = callback;
        ((C71731SDf) LIZ(R.id.hnv)).setOnEditTextFocusChangeListener(new IDCListenerS157S0200000_4(this, callback, 2));
    }

    public final void setPhoneCredit(PhoneCredit phoneCredit) {
        o.LJIIIZ(phoneCredit, "phoneCredit");
        String countryCode = phoneCredit.getCountryCode();
        if (countryCode != null) {
            ((TextView) LIZ(R.id.bwq)).setText(countryCode);
        }
        String phoneNumber = phoneCredit.getPhoneNumber();
        if (phoneNumber != null) {
            ((C71731SDf) LIZ(R.id.hnv)).setText(phoneNumber);
        }
        String hint = phoneCredit.getHint();
        if (hint != null) {
            ((C71731SDf) LIZ(R.id.hnv)).setHint(hint);
        }
        this.LJLIL = phoneCredit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27111AkV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a_7, this, true);
    }
}
