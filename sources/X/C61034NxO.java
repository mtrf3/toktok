package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NxO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61034NxO {
    public static final WeakHashMap<Integer, C61035NxP> LIZ = new WeakHashMap<>();

    public static void LIZIZ(Rect rect, View view) {
        ViewParent viewRootImpl = view.getRootView().getParent();
        int i = Build.VERSION.SDK_INT;
        if (i != 29) {
            if (i != 30) {
                o.LJIIIIZZ(viewRootImpl, "viewRootImpl");
                int hashCode = viewRootImpl.hashCode();
                WeakHashMap<Integer, C61035NxP> weakHashMap = LIZ;
                C61035NxP c61035NxP = weakHashMap.get(Integer.valueOf(hashCode));
                if (c61035NxP == null) {
                    Object LJFF = C36512EUq.LJFF(viewRootImpl, "mWinFrame");
                    o.LJII(LJFF, "null cannot be cast to non-null type android.graphics.Rect");
                    Object LJFF2 = C36512EUq.LJFF(viewRootImpl, "mPendingVisibleInsets");
                    o.LJII(LJFF2, "null cannot be cast to non-null type android.graphics.Rect");
                    c61035NxP = new C61035NxP();
                    c61035NxP.LIZ = (Rect) LJFF;
                    c61035NxP.LIZIZ = (Rect) LJFF2;
                    weakHashMap.put(Integer.valueOf(hashCode), c61035NxP);
                }
                LIZ(c61035NxP.LIZ, c61035NxP.LIZIZ, rect);
            } else {
                o.LJIIIIZZ(viewRootImpl, "viewRootImpl");
                int hashCode2 = viewRootImpl.hashCode();
                WeakHashMap<Integer, C61035NxP> weakHashMap2 = LIZ;
                C61035NxP c61035NxP2 = weakHashMap2.get(Integer.valueOf(hashCode2));
                if (c61035NxP2 == null) {
                    Object LJFF3 = C36512EUq.LJFF(viewRootImpl, "mTmpFrame");
                    o.LJII(LJFF3, "null cannot be cast to non-null type android.graphics.Rect");
                    Object LJFF4 = C36512EUq.LJFF(C36512EUq.LJFF(viewRootImpl, "mAttachInfo"), "mVisibleInsets");
                    o.LJII(LJFF4, "null cannot be cast to non-null type android.graphics.Rect");
                    c61035NxP2 = new C61035NxP();
                    c61035NxP2.LIZ = (Rect) LJFF3;
                    c61035NxP2.LIZIZ = (Rect) LJFF4;
                    weakHashMap2.put(Integer.valueOf(hashCode2), c61035NxP2);
                }
                LIZ(c61035NxP2.LIZ, c61035NxP2.LIZIZ, rect);
            }
        } else {
            o.LJIIIIZZ(viewRootImpl, "viewRootImpl");
            int hashCode3 = viewRootImpl.hashCode();
            WeakHashMap<Integer, C61035NxP> weakHashMap3 = LIZ;
            C61035NxP c61035NxP3 = weakHashMap3.get(Integer.valueOf(hashCode3));
            if (c61035NxP3 == null) {
                Object LJFF5 = C36512EUq.LJFF(viewRootImpl, "mTmpFrame");
                o.LJII(LJFF5, "null cannot be cast to non-null type android.graphics.Rect");
                Object LJFF6 = C36512EUq.LJFF(viewRootImpl, "mPendingVisibleInsets");
                o.LJII(LJFF6, "null cannot be cast to non-null type android.graphics.Rect");
                c61035NxP3 = new C61035NxP();
                c61035NxP3.LIZ = (Rect) LJFF5;
                c61035NxP3.LIZIZ = (Rect) LJFF6;
                weakHashMap3.put(Integer.valueOf(hashCode3), c61035NxP3);
            }
            LIZ(c61035NxP3.LIZ, c61035NxP3.LIZIZ, rect);
        }
        if (rect.right > 0 && rect.bottom > 0) {
            return;
        }
        view.getWindowVisibleDisplayFrame(rect);
    }

    public static void LIZ(Rect rect, Rect rect2, Rect rect3) {
        if (rect == null || rect2 == null) {
            return;
        }
        rect3.set(rect);
        rect3.left += rect2.left;
        rect3.top += rect2.top;
        rect3.right -= rect2.right;
        rect3.bottom -= rect2.bottom;
    }
}
