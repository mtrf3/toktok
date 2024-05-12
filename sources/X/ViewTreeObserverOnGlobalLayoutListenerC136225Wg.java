package X;

import Y.IDTListenerS69S0000000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC136225Wg extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C136215Wf LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLIL.LIZJ = false;
        C136215Wf c136215Wf = this.LJLIL;
        c136215Wf.LIZ.evictAll();
        ((ArrayList) c136215Wf.LIZIZ).clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTreeObserverOnGlobalLayoutListenerC136225Wg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLIL = new C136215Wf();
        C16880lQ.LLLZIIL(R.layout.bmq, C16880lQ.LLZIL(getContext()), this);
        findViewById(R.id.ewf).setOnTouchListener(new IDTListenerS69S0000000_2(0));
        findViewById(R.id.ewv).setOnTouchListener(new IDTListenerS69S0000000_2(0));
        boolean z = findViewById(R.id.ewo).getLayoutParams() instanceof RelativeLayout.LayoutParams;
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
