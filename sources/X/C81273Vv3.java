package X;

import Y.ACListenerS31S0100000_11;
import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* renamed from: X.Vv3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81273Vv3 {
    public final String LIZ;
    public final WeakReference<View> LIZIZ;
    public final Context LIZJ;
    public C81275Vv5 LIZLLL;
    public PopupWindow LJ;
    public EnumC66451Q6d LJFF = EnumC66451Q6d.BLUE;
    public long LJI = 6000;
    public final ViewTreeObserverOnScrollChangedListenerC81274Vv4 LJII = new ViewTreeObserverOnScrollChangedListenerC81274Vv4(this);

    public final void LIZ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LIZJ();
            PopupWindow popupWindow = this.LJ;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZIZ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (this.LIZIZ.get() != null) {
                C81275Vv5 c81275Vv5 = new C81275Vv5(this.LIZJ);
                this.LIZLLL = c81275Vv5;
                ((TextView) c81275Vv5.findViewById(R.id.biu)).setText(this.LIZ);
                if (this.LJFF == EnumC66451Q6d.BLUE) {
                    this.LIZLLL.LJLJI.setBackgroundResource(R.drawable.aaf);
                    this.LIZLLL.LJLILLLLZI.setImageResource(R.drawable.aag);
                    this.LIZLLL.LJLIL.setImageResource(R.drawable.aah);
                    this.LIZLLL.LJLJJI.setImageResource(R.drawable.aai);
                } else {
                    this.LIZLLL.LJLJI.setBackgroundResource(R.drawable.aab);
                    this.LIZLLL.LJLILLLLZI.setImageResource(R.drawable.aac);
                    this.LIZLLL.LJLIL.setImageResource(R.drawable.aad);
                    this.LIZLLL.LJLJJI.setImageResource(R.drawable.aae);
                }
                View decorView = ((Activity) this.LIZJ).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!C40700FyC.LIZ(this)) {
                    try {
                        LIZJ();
                        if (this.LIZIZ.get() != null) {
                            this.LIZIZ.get().getViewTreeObserver().addOnScrollChangedListener(this.LJII);
                        }
                    } catch (Throwable unused) {
                    }
                }
                this.LIZLLL.measure(View.MeasureSpec.makeMeasureSpec(width, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(height, LiveLayoutPreloadThreadPriority.DEFAULT));
                C81275Vv5 c81275Vv52 = this.LIZLLL;
                PopupWindow popupWindow = new PopupWindow(c81275Vv52, c81275Vv52.getMeasuredWidth(), this.LIZLLL.getMeasuredHeight());
                this.LJ = popupWindow;
                C16880lQ.LLJJLIIIJLLLLLLLZ(popupWindow, this.LIZIZ.get());
                if (!C40700FyC.LIZ(this)) {
                    try {
                        PopupWindow popupWindow2 = this.LJ;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            if (this.LJ.isAboveAnchor()) {
                                C81275Vv5 c81275Vv53 = this.LIZLLL;
                                c81275Vv53.LJLIL.setVisibility(4);
                                c81275Vv53.LJLILLLLZI.setVisibility(0);
                            } else {
                                C81275Vv5 c81275Vv54 = this.LIZLLL;
                                c81275Vv54.LJLIL.setVisibility(0);
                                c81275Vv54.LJLILLLLZI.setVisibility(4);
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                long j = this.LJI;
                if (j > 0) {
                    this.LIZLLL.postDelayed(new ARunnableS47S0100000_11(this, 107), j);
                }
                this.LJ.setTouchable(true);
                this.LIZLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS31S0100000_11(this, 14)));
            }
        } catch (Throwable unused3) {
        }
    }

    public final void LIZJ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (this.LIZIZ.get() != null) {
                this.LIZIZ.get().getViewTreeObserver().removeOnScrollChangedListener(this.LJII);
            }
        } catch (Throwable unused) {
        }
    }

    public C81273Vv3(View view, String str) {
        this.LIZ = str;
        this.LIZIZ = new WeakReference<>(view);
        this.LIZJ = view.getContext();
    }
}
