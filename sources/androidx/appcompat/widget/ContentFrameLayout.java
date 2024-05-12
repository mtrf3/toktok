package androidx.appcompat.widget;

import X.AnonymousClass037;
import X.C16650l3;
import X.C18X;
import X.C281318n;
import X.InterfaceC010202g;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue LJLIL;
    public TypedValue LJLILLLLZI;
    public TypedValue LJLJI;
    public TypedValue LJLJJI;
    public TypedValue LJLJJL;
    public TypedValue LJLJJLL;
    public final Rect LJLJL;
    public InterfaceC010202g LJLJLJ;

    public TypedValue getFixedHeightMajor() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new TypedValue();
        }
        return this.LJLJJL;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new TypedValue();
        }
        return this.LJLJJLL;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.LJLJI == null) {
            this.LJLJI = new TypedValue();
        }
        return this.LJLJI;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new TypedValue();
        }
        return this.LJLJJI;
    }

    public TypedValue getMinWidthMajor() {
        if (this.LJLIL == null) {
            this.LJLIL = new TypedValue();
        }
        return this.LJLIL;
    }

    public TypedValue getMinWidthMinor() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new TypedValue();
        }
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC010202g interfaceC010202g = this.LJLJLJ;
        if (interfaceC010202g != null) {
            interfaceC010202g.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC010202g interfaceC010202g = this.LJLJLJ;
        if (interfaceC010202g != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((C18X) interfaceC010202g).LIZ;
            AnonymousClass037 anonymousClass037 = appCompatDelegateImpl.LJLLILLLL;
            if (anonymousClass037 != null) {
                anonymousClass037.LJIIIIZZ();
            }
            if (appCompatDelegateImpl.LJLZ != null) {
                appCompatDelegateImpl.LJLJJLL.getDecorView().removeCallbacks(appCompatDelegateImpl.LJZ);
                if (appCompatDelegateImpl.LJLZ.isShowing()) {
                    try {
                        appCompatDelegateImpl.LJLZ.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.LJLZ = null;
            }
            C16650l3 c16650l3 = appCompatDelegateImpl.LJZI;
            if (c16650l3 != null) {
                c16650l3.LIZIZ();
            }
            C281318n c281318n = appCompatDelegateImpl.LJJJJ(0).LJII;
            if (c281318n != null) {
                c281318n.LIZJ(true);
            }
        }
    }

    public void setAttachListener(InterfaceC010202g interfaceC010202g) {
        this.LJLJLJ = interfaceC010202g;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJL = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }
}
