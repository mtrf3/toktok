package X;

import Y.ALAdapterS11S0100000_14;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;

/* renamed from: X.Vde, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80194Vde implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            AccessibilityManager accessibilityManager = baseTransientBottomBar.LJIIJJI;
            if ((accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) && baseTransientBottomBar.LIZJ.getVisibility() == 0) {
                if (baseTransientBottomBar.LIZJ.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(C80237VeL.LIZ);
                    ofFloat.addUpdateListener(new C80011Vah(baseTransientBottomBar));
                    ofFloat.setDuration(75L);
                    ofFloat.addListener(new ALAdapterS11S0100000_14(baseTransientBottomBar, i2, 3));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = baseTransientBottomBar.LIZJ.getHeight();
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.LIZJ.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(C80237VeL.LIZIZ);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new ALAdapterS11S0100000_14(baseTransientBottomBar, i2, 5));
                    valueAnimator.addUpdateListener(new C80010Vag(baseTransientBottomBar));
                    valueAnimator.start();
                }
            } else {
                baseTransientBottomBar.LIZJ();
            }
            return true;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
        baseTransientBottomBar2.LIZJ.setOnAttachStateChangeListener(new C80195Vdf(baseTransientBottomBar2));
        if (baseTransientBottomBar2.LIZJ.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar2.LIZJ.getLayoutParams();
            if (layoutParams2 instanceof C06F) {
                C06F c06f = (C06F) layoutParams2;
                BaseTransientBottomBar.Behavior behavior = new BaseTransientBottomBar.Behavior();
                C80200Vdk c80200Vdk = behavior.LJIIIIZZ;
                c80200Vdk.getClass();
                c80200Vdk.LIZ = baseTransientBottomBar2.LJIIL;
                behavior.LIZIZ = new C80203Vdn(baseTransientBottomBar2);
                c06f.LIZIZ(behavior);
                c06f.LJI = 80;
            }
            baseTransientBottomBar2.LJFF();
            baseTransientBottomBar2.LIZJ.setVisibility(4);
            baseTransientBottomBar2.LIZ.addView(baseTransientBottomBar2.LIZJ);
        }
        if (C16330kX.LIZJ(baseTransientBottomBar2.LIZJ)) {
            baseTransientBottomBar2.LJ();
        } else {
            baseTransientBottomBar2.LIZJ.setOnLayoutChangeListener(new C80196Vdg(baseTransientBottomBar2));
        }
        return true;
    }
}
