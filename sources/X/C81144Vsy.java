package X;

import Y.ARunnableS50S0100000_14;
import Y.IDDListenerS395S0100000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.a1;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Vsy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81144Vsy extends View {
    public static final C81143Vsx LJLLLL = new C81143Vsx();
    public View LJLIL;
    public Bitmap LJLILLLLZI;
    public Canvas LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int[] LJLJJLL;
    public int[] LJLJL;
    public Boolean LJLJLJ;
    public int LJLJLLL;
    public final Object LJLL;
    public InterfaceC81146Vt0 LJLLI;
    public final Handler LJLLILLLL;
    public final ARunnableS50S0100000_14 LJLLJ;
    public final IDDListenerS395S0100000_14 LJLLL;

    public final void LIZ() {
        ((ExecutorService) C224688ro.LIZ.getValue()).execute(new ARunnableS50S0100000_14(this, 30));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        if (!this.LJLJJL) {
            super.onDetachedFromWindow();
            return;
        }
        View view = this.LJLIL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.LJLLL);
        }
        Bitmap bitmap = this.LJLILLLLZI;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.LJLILLLLZI = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (!this.LJLJJL) {
            return;
        }
        View rootView = getRootView();
        this.LJLIL = rootView;
        if (rootView != null) {
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(this.LJLLL);
            }
            if ((!o.LJ(rootView, getRootView())) && (view = this.LJLIL) != null) {
                view.postInvalidate();
            }
        }
    }

    public final InterfaceC81146Vt0 getAutoDarkListener() {
        return this.LJLLI;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.LJLJJI) {
            super.draw(canvas);
            return;
        }
        throw LJLLLL;
    }

    public final void setAutoDarkListener(InterfaceC81146Vt0 interfaceC81146Vt0) {
        this.LJLLI = interfaceC81146Vt0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81144Vsy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = new int[16];
        this.LJLJL = new int[16];
        this.LJLL = new Object();
        this.LJLLILLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJLLJ = new ARunnableS50S0100000_14(this, 180);
        this.LJLLL = new IDDListenerS395S0100000_14(this, 1);
    }
}
