package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.96o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2314696o extends FrameLayout {
    public InterfaceC59495NWp LJLIL;
    public String LJLILLLLZI;
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

    public final void LJ() {
        int LJIILL = C17N.LJIILL(12.0d);
        ((ImageView) LIZ(R.id.hxn)).setVisibility(0);
        ((ImageView) LIZ(R.id.hxk)).setVisibility(8);
        LIZ(R.id.hx8).setPadding(LJIILL, LJIILL, LJIILL, LJIILL);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.hxr).getLayoutParams();
        layoutParams.height = C17N.LJIILL(52.5d);
        LIZ(R.id.hxr).setLayoutParams(layoutParams);
        LIZ(R.id.hxr).setBackgroundResource(R.drawable.a0t);
    }

    public final void LIZJ() {
        ((ImageView) LIZ(R.id.hx9)).setVisibility(8);
    }

    public final String getDefTitle() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC59495NWp getTitleBarListener() {
        return this.LJLIL;
    }

    public final void LIZIZ(String str) {
        TextView textView = (TextView) LIZ(R.id.hxp);
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.LJLILLLLZI)) {
                str = getContext().getString(R.string.rkd);
            } else {
                str = this.LJLILLLLZI;
            }
        }
        textView.setText(str);
    }

    public final void LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.rkd);
        }
        this.LJLILLLLZI = str;
        ((TextView) LIZ(R.id.hxp)).setText(this.LJLILLLLZI);
    }

    public final void setDefTitle(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setTitleBarListener(InterfaceC59495NWp interfaceC59495NWp) {
        this.LJLIL = interfaceC59495NWp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314696o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dtc, this, true);
    }
}
