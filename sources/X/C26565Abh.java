package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddressStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Abh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26565Abh extends ConstraintLayout {
    public int LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    private final void setSuffixType(int i) {
        int i2;
        this.LJLIL = i;
        ImageView us_order_submit_address_forward = (ImageView) _$_findCachedViewById(R.id.mvp);
        o.LJIIIIZZ(us_order_submit_address_forward, "us_order_submit_address_forward");
        int i3 = 0;
        if (this.LJLIL == 2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        us_order_submit_address_forward.setVisibility(i2);
        View us_order_submit_address_change_button = _$_findCachedViewById(R.id.mvn);
        o.LJIIIIZZ(us_order_submit_address_change_button, "us_order_submit_address_change_button");
        if (this.LJLIL != 4) {
            i3 = 8;
        }
        us_order_submit_address_change_button.setVisibility(i3);
    }

    public final void setAddressCardInfo(C26566Abi item) {
        boolean z;
        int i;
        String str;
        int i2;
        BillStarlingText billStarlingText;
        o.LJIIIZ(item, "item");
        int i3 = 0;
        if (item.LJIIL || o.LJ(item.LJIIJ, Boolean.FALSE)) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.mvu);
        tuxTextView.setText(item.LIZIZ);
        int i4 = R.attr.go;
        if (z) {
            i = R.attr.gp;
        } else {
            i = R.attr.go;
        }
        tuxTextView.setTextColorRes(i);
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.mvt);
        tuxTextView2.setText(item.LJIIJJI);
        if (z) {
            i4 = R.attr.gp;
        }
        tuxTextView2.setTextColorRes(i4);
        TextView textView = (TextView) _$_findCachedViewById(R.id.mvq);
        textView.setText(item.LJIIIIZZ);
        if (!o.LJ(item.LJIIJ, Boolean.FALSE)) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.mvn);
        AddressStarling addressStarling = item.LJIILJJIL;
        if (addressStarling == null || (billStarlingText = addressStarling.changeAddressStarling) == null || (str = billStarlingText.text) == null) {
            str = "Change address";
        }
        textView2.setText(str);
        if (z) {
            java.util.Map LJJLIL = C113554cx.LJJLIL(C27949Ay1.LIZIZ);
            LJJLIL.put("button_name", "change_address");
            C76542zS.LIZ("tiktokec_button_show", LJJLIL);
            i2 = 4;
        } else {
            i2 = 2;
        }
        setSuffixType(i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26565Abh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26565Abh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.z5, this, true);
        setVisibility(0);
        this.LJLIL = 2;
    }
}
