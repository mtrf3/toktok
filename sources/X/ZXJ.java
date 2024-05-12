package X;

import Y.IDAListenerS240S0100000_24;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes29.dex */
public final class ZXJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ java.util.Map LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ DialogC90914ZmA LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ZX6 zx6;
        int i;
        this.LJLJI.LLI.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        DialogC90914ZmA dialogC90914ZmA = this.LJLJI;
        java.util.Map map = this.LJLIL;
        java.util.Map map2 = this.LJLILLLLZI;
        java.util.Set<ZY4> set = dialogC90914ZmA.LLIIII;
        if (set == null || dialogC90914ZmA.LLIIIILZ == null) {
            return;
        }
        int size = set.size() - dialogC90914ZmA.LLIIIILZ.size();
        IDAListenerS240S0100000_24 iDAListenerS240S0100000_24 = new IDAListenerS240S0100000_24(dialogC90914ZmA, 1);
        int firstVisiblePosition = dialogC90914ZmA.LLI.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < dialogC90914ZmA.LLI.getChildCount(); i2++) {
            View childAt = dialogC90914ZmA.LLI.getChildAt(i2);
            ZY4 item = dialogC90914ZmA.LLIFFJFJJ.getItem(firstVisiblePosition + i2);
            Rect rect = (Rect) map.get(item);
            int top = childAt.getTop();
            if (rect != null) {
                i = rect.top;
            } else {
                i = (dialogC90914ZmA.LLIIL * size) + top;
            }
            AnimationSet animationSet = new AnimationSet(true);
            java.util.Set<ZY4> set2 = dialogC90914ZmA.LLIIII;
            if (set2 != null && set2.contains(item)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(dialogC90914ZmA.LLJILJILJ);
                animationSet.addAnimation(alphaAnimation);
                i = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i - top, 0.0f);
            translateAnimation.setDuration(dialogC90914ZmA.LLJILJIL);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dialogC90914ZmA.LLJJ);
            if (!z) {
                animationSet.setAnimationListener(iDAListenerS240S0100000_24);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(item);
            map2.remove(item);
        }
        for (Map.Entry entry : map2.entrySet()) {
            ZY4 zy4 = (ZY4) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(zy4);
            if (dialogC90914ZmA.LLIIIILZ.contains(zy4)) {
                zx6 = new ZX6(bitmapDrawable, rect2);
                zx6.LJII = 1.0f;
                zx6.LJIIIIZZ = 0.0f;
                zx6.LJ = dialogC90914ZmA.LLJILLL;
                zx6.LIZLLL = dialogC90914ZmA.LLJJ;
            } else {
                int i3 = dialogC90914ZmA.LLIIL * size;
                zx6 = new ZX6(bitmapDrawable, rect2);
                zx6.LJI = i3;
                zx6.LJ = dialogC90914ZmA.LLJILJIL;
                zx6.LIZLLL = dialogC90914ZmA.LLJJ;
                zx6.LJIIL = new C90576Zgi(dialogC90914ZmA, zy4);
                ((HashSet) dialogC90914ZmA.LLIIIJ).add(zy4);
            }
            ((ArrayList) dialogC90914ZmA.LLI.LJLIL).add(zx6);
        }
    }

    public ZXJ(DialogC90914ZmA dialogC90914ZmA, java.util.Map map, java.util.Map map2) {
        this.LJLJI = dialogC90914ZmA;
        this.LJLIL = map;
        this.LJLILLLLZI = map2;
    }
}
