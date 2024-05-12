package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9qT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249339qT extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    public C249339qT(Context context) {
        super(context, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a_c, this, true);
    }

    public final void setCheck(boolean z) {
        ((C63044Ooi) LIZ(R.id.jx8)).setChecked(z);
    }

    public final void setItemText(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null) {
            ((TextView) LIZ(R.id.jx7)).setText(spannableStringBuilder);
        }
    }

    public final void setOnClick(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        View shipping_select_item_radio = LIZ(R.id.jx8);
        o.LJIIIIZZ(shipping_select_item_radio, "shipping_select_item_radio");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(block, 112, 42), shipping_select_item_radio);
    }

    public final void setItemText(String str) {
        if (str != null) {
            ((TextView) LIZ(R.id.jx7)).setText(str);
        }
    }
}
