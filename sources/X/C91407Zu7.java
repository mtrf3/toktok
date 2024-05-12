package X;

import Y.IDRunnableS32S0200000_29;
import Y.IDRunnableS88S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Zu7, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91407Zu7 implements InterfaceC91212Zqy {
    public final C91369ZtV LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC91212Zqy
    public final void dismiss() {
        C91369ZtV c91369ZtV = this.LJLIL;
        if (c91369ZtV != null) {
            c91369ZtV.LJIILL();
        }
    }

    @Override // X.InterfaceC91212Zqy
    public final void show() {
        AppCompatTextView appCompatTextView;
        CharSequence text;
        Integer valueOf;
        C91369ZtV c91369ZtV = this.LJLIL;
        if (c91369ZtV != null) {
            if (c91369ZtV.LIZLLL == null) {
                Context context = c91369ZtV.LIZIZ.getContext();
                o.LJIIIIZZ(context, "viewContainer.context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                o.LJI(LJIJJ);
                View LIZLLL = C16970lZ.LIZLLL(LJIJJ, R.layout.bf);
                c91369ZtV.LIZLLL = LIZLLL;
                o.LJII(LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.ui.guide.SwipeUpGuideStrengthenLayout");
                C91132Zpg c91132Zpg = (C91132Zpg) LIZLLL;
                c91132Zpg.setViewPager(c91369ZtV.LIZJ);
                c91132Zpg.setFallBackRunnable(new IDRunnableS88S0100000_29(c91369ZtV, 11));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("viewPager ");
                LIZ.append(c91369ZtV.LIZJ);
                X1D.LIZIZ(LIZ);
                View view = c91369ZtV.LIZLLL;
                if (view != null && (appCompatTextView = (AppCompatTextView) view.findViewById(R.id.mli)) != null && (text = appCompatTextView.getText()) != null && (valueOf = Integer.valueOf(text.length())) != null) {
                    int intValue = valueOf.intValue();
                    if (1 <= intValue) {
                        if (intValue >= 21) {
                            if (intValue < 41) {
                                appCompatTextView.setTextSize(25.0f);
                            }
                        }
                    }
                    appCompatTextView.setTextSize(20.0f);
                }
            }
            View view2 = c91369ZtV.LIZLLL;
            if (view2 == null || view2.getParent() == null) {
                c91369ZtV.LIZIZ.addView(c91369ZtV.LIZLLL);
            }
            View view3 = c91369ZtV.LIZLLL;
            if (view3 != null) {
                view3.setVisibility(0);
                view3.setAlpha(0.0f);
                view3.animate().alpha(1.0f).setDuration(300L).withStartAction(new IDRunnableS88S0100000_29(c91369ZtV, 12)).withEndAction(new IDRunnableS32S0200000_29(view3, c91369ZtV, 1)).start();
            }
        }
    }

    @Override // X.InterfaceC91212Zqy
    public final int LLLLZLL() {
        return this.LJLJI;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC91212Zqy interfaceC91212Zqy) {
        InterfaceC91212Zqy other = interfaceC91212Zqy;
        o.LJIIIZ(other, "other");
        return LLLLZLL() - other.LLLLZLL();
    }

    public C91407Zu7(C91369ZtV c91369ZtV, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = c91369ZtV;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = EnumC91213Zqz.SWIPE_UP_GUIDE.ordinal();
    }
}
