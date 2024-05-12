package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.2Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57442Ng extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final LinearLayout getExtensionView() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.d2c));
        if (view == null) {
            view = findViewById(R.id.d2c);
            if (view != null) {
                linkedHashMap.put(Integer.valueOf(R.id.d2c), view);
            } else {
                view = null;
            }
        }
        return (LinearLayout) view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57442Ng(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
    }
}
