package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.AiE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26970AiE extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

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

    public final void setTitle(String str) {
        ((TextView) _$_findCachedViewById(R.id.mxm)).setText(str);
    }

    public C26970AiE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.zf, this, true);
    }

    public final void LJJLJLI(Integer num, Integer num2, String str) {
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.mxl);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(C78685UuP.LJLIIIL(num, null));
        tuxTextView.setTextColorRes(C78685UuP.LJLI(num2, null));
    }
}
