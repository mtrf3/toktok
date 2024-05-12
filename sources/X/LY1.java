package X;

import Y.ARunnableS45S0100000_9;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LY1 implements LDY {
    public final /* synthetic */ FollowSkyLightHelper LJLIL;

    public LY1(FollowSkyLightHelper followSkyLightHelper) {
        this.LJLIL = followSkyLightHelper;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        WeakReference<ActivityC45651qj> weakReference;
        ActivityC45651qj activityC45651qj;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        WeakReference<ActivityC45651qj> weakReference2;
        ActivityC45651qj activityC45651qj2;
        MainActivityScope LJJLIIIJJI2;
        HomeTabAbility LJIL2;
        View view;
        o.LJIIIZ(to, "to");
        LYB lyb = this.LJLIL.LIZ;
        if (lyb != null && (view = lyb.LJIIIZ) != null) {
            view.postDelayed(new ARunnableS45S0100000_9(lyb, 252), 0L);
        }
        boolean z = true;
        if (TextUtils.equals(to, "HOME") && (weakReference2 = this.LJLIL.LJII) != null && (activityC45651qj2 = weakReference2.get()) != null && (LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(activityC45651qj2)) != null && (LJIL2 = C87277YNd.LJIL(LJJLIIIJJI2)) != null && LJIL2.zW("Following")) {
            this.LJLIL.LJFF();
        }
        FeedFollowFragment feedFollowFragment = this.LJLIL.LJIIL;
        if (feedFollowFragment != null && !feedFollowFragment.LJZL) {
            return;
        }
        if (!TextUtils.equals(to, "HOME") || (weakReference = this.LJLIL.LJII) == null || (activityC45651qj = weakReference.get()) == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj)) == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) == null || !LJIL.zW("Following")) {
            z = false;
        }
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.LJLIL.LJIILIIL.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.valueOf(z));
        }
        if (!z) {
            C73353Sqb.LJFF().LIZJ();
        }
    }
}
