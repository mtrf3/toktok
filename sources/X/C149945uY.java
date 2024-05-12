package X;

import Y.ACListenerS37S0200000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5uY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149945uY extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
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

    public final void LIZIZ() {
        setVisibility(4);
        getLoadingAnim().cancel();
        getRetryAnim().cancel();
    }

    public final void LIZJ() {
        setVisibility(0);
        bringToFront();
        LIZ(R.id.hhu).setVisibility(0);
        LIZ(R.id.hhy).setVisibility(4);
        getLoadingAnim().start();
        getRetryAnim().cancel();
    }

    public final void LIZLLL() {
        setVisibility(0);
        bringToFront();
        LIZ(R.id.hhu).setVisibility(4);
        LIZ(R.id.hhy).setVisibility(0);
        getLoadingAnim().cancel();
        getRetryAnim().cancel();
    }

    private final ObjectAnimator getLoadingAnim() {
        return (ObjectAnimator) this.LJLIL.getValue();
    }

    public final ObjectAnimator getRetryAnim() {
        return (ObjectAnimator) this.LJLILLLLZI.getValue();
    }

    public final void setErrorTip(String msg) {
        o.LJIIIZ(msg, "msg");
        ((TextView) LIZ(R.id.hi0)).setText(msg);
    }

    public final void setLoadingTip(String msg) {
        o.LJIIIZ(msg, "msg");
        ((TextView) LIZ(R.id.hhw)).setText(msg);
    }

    public final void setOnRetryClick(InterfaceC88472Yns<? super View, C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.hhy), new ACListenerS37S0200000_2(this, onClick, 7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149945uY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 957));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 958));
        C16880lQ.LLLZIIL(R.layout.ik, C16880lQ.LLZIL(context), this);
    }
}
