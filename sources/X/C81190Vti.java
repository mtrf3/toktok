package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.Vti, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81190Vti implements InterfaceC70769Rq1 {
    public final /* synthetic */ C81188Vtg LJLIL;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public C81190Vti(C81188Vtg c81188Vtg) {
        this.LJLIL = c81188Vtg;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        if (c2047581v != null) {
            C81188Vtg c81188Vtg = this.LJLIL;
            int i = c2047581v.LIZ;
            int i2 = c2047581v.LIZIZ;
            ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = c81188Vtg.LJLJLJ;
            if (viewOnTouchListenerC81187Vtf != null) {
                viewOnTouchListenerC81187Vtf.LJLLLL = i;
                viewOnTouchListenerC81187Vtf.LJLLL = i2;
                if (i == -1 && i2 == -1) {
                    return;
                }
                VA9<V92> LJ = viewOnTouchListenerC81187Vtf.LJ();
                if (LJ != null) {
                    int i3 = (int) (((r4.heightPixels * 1.0f) / viewOnTouchListenerC81187Vtf.LJLLL) * viewOnTouchListenerC81187Vtf.LJLLLL);
                    int i4 = LJ.getContext().getResources().getDisplayMetrics().widthPixels;
                    if (i3 < i4) {
                        float f = (i4 * 1.0f) / i3;
                        if (f > 1.0f) {
                            viewOnTouchListenerC81187Vtf.LIZIZ();
                            RectF LIZLLL = viewOnTouchListenerC81187Vtf.LIZLLL(viewOnTouchListenerC81187Vtf.LJLLJ);
                            if (LIZLLL != null) {
                                viewOnTouchListenerC81187Vtf.LJLJJI = 1.0f * f;
                                viewOnTouchListenerC81187Vtf.LJLJJL = 1.75f * f;
                                viewOnTouchListenerC81187Vtf.LJLJJLL = 3.0f * f;
                                LJ.post(new RunnableC81192Vtk(viewOnTouchListenerC81187Vtf, f, f, LIZLLL.centerX(), 0.0f));
                            }
                        }
                    }
                }
                viewOnTouchListenerC81187Vtf.LJLLJ.reset();
                Matrix matrix = viewOnTouchListenerC81187Vtf.LJLLJ;
                VA9<V92> LJ2 = viewOnTouchListenerC81187Vtf.LJ();
                if (LJ2 != null) {
                    LJ2.setImageMatrix(matrix);
                }
                viewOnTouchListenerC81187Vtf.LIZIZ();
                if (LJ == null) {
                    return;
                }
                LJ.invalidate();
            }
        }
    }
}
