package X;

import Y.ARunnableS20S0200000_1;
import Y.AUListenerS90S0100000_1;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C107114Ih extends FrameLayout {
    public Widget LJLIL;
    public final AUListenerS90S0100000_1 LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public View LIZ(int i) {
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

    public int getLayoutResource() {
        return R.layout.b8h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C34B.LIZIZ("SharePanelTipLayout", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C34B.LIZIZ("SharePanelTipLayout", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        Widget widget = this.LJLIL;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void LIZIZ() {
        View view;
        if (getVisibility() == 0) {
            return;
        }
        Object parent = getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        post(new ARunnableS20S0200000_1(this, view, 19));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C107114Ih(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0179, code lost:
    
        if (r0 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r0 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (r0 == 1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C107124Ii r15) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107114Ih.LIZJ(X.4Ii):void");
    }

    public final void LIZLLL(boolean z) {
        int i;
        ImageView imageView = (ImageView) LIZ(R.id.l8k);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        Widget widget;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowVisibilityChanged: ");
        LIZ.append(i);
        C34B.LIZIZ("SharePanelTipLayout", X1D.LIZIZ(LIZ));
        super.onWindowVisibilityChanged(i);
        if (i == 0 && (widget = this.LJLIL) != null) {
            widget.resume();
        }
    }

    public final void setTipTextColor(int i) {
        TextView textView = (TextView) LIZ(R.id.l8l);
        if (textView != null) {
            textView.setTextColor(i);
        }
        ((ImageView) LIZ(R.id.l8k)).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }

    public final void setWidget(Widget widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLIL = widget;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C107114Ih(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107114Ih(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        View.inflate(getContext(), getLayoutResource(), this);
        this.LJLILLLLZI = new AUListenerS90S0100000_1(this, 15);
    }
}
