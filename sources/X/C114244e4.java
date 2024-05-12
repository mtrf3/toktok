package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4e4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114244e4 extends TuxTextView {
    public final java.util.Map<Integer, View> LJLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        LinearLayout.LayoutParams layoutParams;
        o.LJIIIZ(params, "params");
        if ((params instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) params) != null) {
            layoutParams.weight = 1.0f;
        }
        super.setLayoutParams(params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114244e4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ku);
        this.LJLLLL = C62850Ola.LJFF(context, "context");
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        float LJJIJIIJI;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            LJJIJIIJI = OUP.LJJIJIIJI(this, getText().toString());
            int paddingRight = getPaddingRight() + getPaddingLeft() + O6R.LJJIIZ(LJJIJIIJI);
            if (paddingRight < size) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode, paddingRight), i2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
