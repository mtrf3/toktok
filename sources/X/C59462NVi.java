package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NVi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59462NVi extends FrameLayout {
    public InterfaceC59463NVj LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
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

    public final InterfaceC59463NVj getTitleWrap() {
        return this.LJLIL;
    }

    public final void setBackgroundAlpha(float f) {
        LIZ(R.id.aj1).setAlpha(f);
    }

    public final void setTitle(CharSequence str) {
        o.LJIIIZ(str, "str");
        ((TextView) LIZ(R.id.title)).setText(str);
    }

    public final void setTitleWrap(InterfaceC59463NVj interfaceC59463NVj) {
        this.LJLIL = interfaceC59463NVj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59462NVi(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LJLILLLLZI = new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.uu, this, true);
        setBackgroundResource(R.drawable.a7f);
        setMinimumHeight((int) getResources().getDimension(R.dimen.a8q));
    }
}
