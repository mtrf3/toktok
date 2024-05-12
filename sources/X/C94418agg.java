package X;

import Y.IDCListenerS249S0100000_42;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.agg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94418agg extends C94152acO implements InterfaceC93642aUA {
    public View LJLLL;

    @Override // X.C94152acO
    public int getDrawerViewBgRes() {
        return R.drawable.dfg;
    }

    @Override // X.InterfaceC93642aUA
    public final TextView zh() {
        return null;
    }

    @Override // X.InterfaceC93642aUA
    public final TextView f8() {
        View view = this.LJLLL;
        if (view != null) {
            return (TextView) view.findViewById(R.id.m0_);
        }
        return null;
    }

    @Override // X.InterfaceC93642aUA
    public final TextView zg() {
        View view = this.LJLLL;
        if (view != null) {
            return (TextView) view.findViewById(R.id.mo6);
        }
        return null;
    }

    @Override // X.C94152acO
    public final View LJFF(LinearLayout parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dux, null, false);
        C93902aYM.LJI(LLLLIILL, new ViewGroup.MarginLayoutParams(-1, -2));
        LLLLIILL.addOnAttachStateChangeListener(new IDCListenerS249S0100000_42(this, 2));
        return LLLLIILL;
    }

    @Override // X.C94152acO
    public final boolean LJI(MotionEvent e) {
        boolean z;
        LiveData<Rect> topToolPanelLocationInWindow;
        Rect value;
        o.LJIIIZ(e, "e");
        IMain LIZ = C93723aVT.LIZ();
        if (LIZ != null && (topToolPanelLocationInWindow = LIZ.getTopToolPanelLocationInWindow()) != null && (value = topToolPanelLocationInWindow.getValue()) != null && e.getX() >= value.left && e.getX() <= value.right && e.getY() >= value.top && e.getY() <= value.bottom) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94418agg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        setMinHeight((int) (C116504hi.LIZ(context) * 0.88f));
        setMaxHeight((int) (C116504hi.LIZ(context) * 0.88f));
        setCriticalHeight(0);
        setCurrentHeight((int) (C116504hi.LIZ(context) * 0.88f));
    }
}
