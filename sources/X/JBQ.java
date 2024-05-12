package X;

import Y.ALAdapterS0S0220000_8;
import Y.AfS60S0100000_8;
import Y.IDhS94S0100000_1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JBQ implements IZ2 {
    public static boolean LJLJLJ;
    public final FrameLayout LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final C71799SFv LJLJJI;
    public final C73318Sq2 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // X.IZ2
    public final void Q2() {
    }

    @Override // X.IZ2
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.IZ2
    public final FrameLayout LJJLIIIJLJLI() {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalAccessException("StoryAnimPlaybackHelper, storyPlayerFrameLayout should not be null");
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme.getAwemeType() == 61 || aweme.getAwemeType() == 152 || aweme.getAwemeType() == 160) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(User user) {
        boolean z;
        List<String> urlList;
        boolean LJJI = C79043V0l.LJJI(user, C78688UuS.LJJI(user));
        UrlModel avatarVideoUri = user.getAvatarVideoUri();
        if (avatarVideoUri != null && (urlList = avatarVideoUri.getUrlList()) != null && (!urlList.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (LJJI || !z) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(String str) {
        if (LJLJLJ) {
            return;
        }
        LJLJLJ = true;
        C78999UzT.LJFF(C55723Ltv.LIZIZ.LJIL().LJ(str).LJJIJL(new IDhS94S0100000_1(this, 17)).LJJL(T16.LIZ()).LJJJLIIL(new AfS60S0100000_8(this, 31), C48039ItH.LJLIL), this.LJLJJL);
    }

    public final void LJ(User user, L69 l69, boolean z) {
        if (user == null || !z) {
            return;
        }
        boolean LLLZLL = C16880lQ.LLLZLL();
        int LIZ = JBV.LIZ();
        if (LIZ != 2) {
            if (LIZ != 3) {
                if (LIZ != 4) {
                    return;
                }
                if (l69 != null) {
                    l69.LIZLLL(EnumC53663L4h.STORY, L59.START_ANIMATION);
                }
                if (LLLZLL) {
                    return;
                }
                if (LIZJ(user)) {
                    C26180APg.LIZJ = true;
                    return;
                }
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                LIZLLL(uid);
                return;
            }
            if (LLLZLL) {
                return;
            }
            if (LIZJ(user)) {
                C26180APg.LIZJ = true;
                return;
            }
            String uid2 = user.getUid();
            o.LJIIIIZZ(uid2, "user.uid");
            LIZLLL(uid2);
            return;
        }
        if (l69 == null) {
            return;
        }
        l69.LIZLLL(EnumC53663L4h.STORY, L59.START_ANIMATION);
    }

    public final void LIZ(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.5f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.5f));
        ofPropertyValuesHolder.setDuration(250L);
        ofPropertyValuesHolder.setInterpolator(C55953Lxd.LJFF());
        ofPropertyValuesHolder.addListener(new ALAdapterS0S0220000_8(view2, z, z2, this, 1));
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.5f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.5f, 1.0f));
        ofPropertyValuesHolder2.setDuration(250L);
        ofPropertyValuesHolder2.setStartDelay(50L);
        ofPropertyValuesHolder2.setInterpolator(C55953Lxd.LJFF());
        ofPropertyValuesHolder2.addListener(new ALAdapterS0S0220000_8(view, z, z2, this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
        animatorSet.start();
    }

    public JBQ(FrameLayout frameLayout, FrameLayout frameLayout2, SmartImageView smartImageView, C71799SFv c71799SFv, C73318Sq2 disposables) {
        o.LJIIIZ(disposables, "disposables");
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = frameLayout2;
        this.LJLJI = smartImageView;
        this.LJLJJI = c71799SFv;
        this.LJLJJL = disposables;
        this.LJLJJLL = C221108m2.LIZIZ(C48037ItF.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(JBO.LJLIL);
    }
}
