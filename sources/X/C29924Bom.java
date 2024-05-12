package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bom, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29924Bom extends C47141t8 {
    public final java.util.Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.jm0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.jm0);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public C29924Bom(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.dlm, this);
        setBackgroundColor(ColorProtector.parseColor("#33000000"));
    }

    public final void setBgVisible(boolean z) {
        if (z) {
            ((AppCompatTextView) LIZ(R.id.jm0)).setBackgroundResource(R.drawable.clb);
        } else {
            LIZ(R.id.jm0).setBackground(null);
        }
    }

    public final void setPollText(String string) {
        o.LJIIIZ(string, "string");
        ((TextView) LIZ(R.id.jm0)).setText(string);
    }

    public final void setTextSize(float f) {
        ((C47121t6) LIZ(R.id.jm0)).setTextSize(1, f);
    }
}
