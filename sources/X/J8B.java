package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class J8B implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ FriendsTabContainerFragment LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Object LIZ;
        Field field;
        String str;
        String str2;
        int currentItem;
        FriendsTabContainerFragment friendsTabContainerFragment = this.LJLILLLLZI;
        try {
            C80261Vej c80261Vej = friendsTabContainerFragment.LJLJLJ;
            Object obj = null;
            if (c80261Vej != null) {
                field = c80261Vej.getClass().getDeclaredField("slidingTabIndicator");
            } else {
                field = null;
            }
            if (field != null) {
                field.setAccessible(true);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            C80261Vej c80261Vej2 = friendsTabContainerFragment.LJLJLJ;
            if (c80261Vej2 != null) {
                str = c80261Vej2.getClass().getName();
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append("$SlidingTabIndicator");
            Method declaredMethod = Class.forName(X1D.LIZIZ(LIZ2)).getDeclaredMethod("setIndicatorPositionFromTabPosition", Integer.TYPE, Float.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            C80261Vej c80261Vej3 = friendsTabContainerFragment.LJLJLJ;
            if (c80261Vej3 != null) {
                str2 = c80261Vej3.getClass().getName();
            } else {
                str2 = null;
            }
            LIZ3.append(str2);
            LIZ3.append("$SlidingTabIndicator");
            Method declaredMethod2 = Class.forName(X1D.LIZIZ(LIZ3)).getDeclaredMethod("jumpIndicatorToSelectedPosition", new Class[0]);
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
            if (field != null) {
                obj = field.get(friendsTabContainerFragment.LJLJLJ);
            }
            VW3 vw3 = (VW3) friendsTabContainerFragment._$_findCachedViewById(R.id.nb6);
            if (vw3 != null && (currentItem = vw3.getCurrentItem()) >= 0) {
                if (declaredMethod != null) {
                    declaredMethod.invoke(obj, Integer.valueOf(currentItem), Float.valueOf(0.0f));
                }
                if (declaredMethod2 != null) {
                    declaredMethod2.invoke(obj, new Object[0]);
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }

    public J8B(View view, FriendsTabContainerFragment friendsTabContainerFragment) {
        this.LJLIL = view;
        this.LJLILLLLZI = friendsTabContainerFragment;
    }
}
