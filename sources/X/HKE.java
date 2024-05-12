package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS53S0400000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HKE implements HKG {
    public static AbstractC43436H2y LIZ() {
        return C60903NvH.LJIIJJI().getPublishService().LJJIJ().LIZIZ();
    }

    public static I9Z LIZIZ(C82622Wbi diContainer, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(diContainer, "diContainer");
        WRQ wrq = (WRQ) diContainer.LJ(WRQ.class, null);
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
        I9Z i9z = new I9Z(diContainer, new AqS53S0400000_7(activityC45651qj, (ActivityC45651qj) wrq, (WRQ) diContainer.LJ(ShortVideoContext.class, null), (ShortVideoContext) null, (InterfaceC88472Yns<? super C46144I9c, C76800UCe>) 2));
        i9z.Dd(HKF.class, new C43832HIe(activityC45651qj, wrq, i9z, shortVideoContext, diContainer));
        return i9z;
    }

    public static boolean LIZJ(Rect rect, View view) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (true) {
            if (linkedList.isEmpty()) {
                return false;
            }
            View currentView = (View) linkedList.removeFirst();
            o.LJIIIIZZ(currentView, "currentView");
            try {
                int[] iArr = new int[2];
                currentView.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = currentView.getWidth() + i;
                int height = currentView.getHeight() + i2;
                if (i <= rect.left && width >= rect.right && i2 <= rect.top && height >= rect.bottom) {
                    if (currentView.getAlpha() != 0.0f && currentView.getBackground() != null) {
                        Drawable background = currentView.getBackground();
                        o.LJIIIIZZ(background, "view.background");
                        if (background.getOpacity() != -2) {
                            return true;
                        }
                    }
                    if (currentView instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) currentView;
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            linkedList.add(viewGroup.getChildAt(i3));
                        }
                    }
                } else {
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
