package defpackage;

import X.C16880lQ;
import X.C78685UuP;
import X.OUP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ColorText;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class k1 extends ConstraintLayout {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
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

    public final void setDesc(ColorText colorText) {
        String str;
        Integer num;
        Integer num2;
        TuxTextView setDesc$lambda$3 = (TuxTextView) _$_findCachedViewById(R.id.hcs);
        o.LJIIIIZZ(setDesc$lambda$3, "setDesc$lambda$3");
        if (colorText != null) {
            str = colorText.text;
        } else {
            str = null;
        }
        OUP.LJJLIIIJILLIZJL(setDesc$lambda$3, str);
        if (colorText != null) {
            num = colorText.textColor;
        } else {
            num = null;
        }
        setDesc$lambda$3.setTextColorRes(C78685UuP.LJLI(num, null));
        if (colorText != null) {
            num2 = colorText.textFont;
        } else {
            num2 = null;
        }
        setDesc$lambda$3.setTuxFont(C78685UuP.LJLIIIL(num2, null));
    }

    public k1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a0z, this, true);
    }
}
