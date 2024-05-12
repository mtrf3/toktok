package Y;

import X.ActivityC45651qj;
import X.C145995oB;
import X.C164236cV;
import X.C188727au;
import X.C235779Nd;
import X.C42241Ghx;
import X.C44172HVg;
import X.C5S1;
import X.C60903NvH;
import X.C6ZT;
import X.C73943T0h;
import X.C8WN;
import X.FMX;
import X.G6E;
import X.G87;
import X.G88;
import X.G8A;
import X.G99;
import X.G9S;
import X.G9Z;
import X.GAY;
import X.GBN;
import X.GQ5;
import X.GS5;
import X.GVN;
import X.HQ7;
import X.InterfaceC88473Ynt;
import X.XXJ;
import X.XXL;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public class ACListenerS25S0101000_7 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS25S0101000_7 aCListenerS25S0101000_7, View view) {
        G87 g87;
        G88 g88;
        switch (aCListenerS25S0101000_7.i1) {
            case 0:
                XXJ xxj = (XXJ) aCListenerS25S0101000_7.l0;
                xxj.getClass();
                if (C6ZT.LIZ(view) || (g87 = xxj.LJLJJL) == null) {
                    return;
                }
                g87.LIZ(null, view, null, 0);
                return;
            case 1:
                ((DialogFragment) aCListenerS25S0101000_7.l0).dismiss();
                return;
            case 2:
                XXL xxl = (XXL) aCListenerS25S0101000_7.l0;
                xxl.getClass();
                if (C6ZT.LIZ(view) || (g88 = xxl.LJLJJL) == null) {
                    return;
                }
                g88.LIZIZ(null, view, null);
                return;
            default:
                final VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCListenerS25S0101000_7.l0;
                videoPublishContainerScene.getClass();
                if (!C44172HVg.LJIJ.isLogin()) {
                    C44172HVg.LJIJ.LJIIIIZZ(videoPublishContainerScene.LLLFF(), "", "", new G6E(videoPublishContainerScene));
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "video_post_page");
                FMX.LJIIL("click_video_tag", c188727au.LIZ);
                G8A g8a = G8A.LIZIZ;
                if (g8a.LIZIZ() >= 3) {
                    g8a.LJFF(videoPublishContainerScene.LLII(), "video_post_page", videoPublishContainerScene.LLIIIILZ.LIZ(), videoPublishContainerScene.LLILZLL.tagUserList, new InterfaceC88473Ynt() { // from class: X.G86
                        @Override // X.InterfaceC88473Ynt
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            VideoPublishContainerScene videoPublishContainerScene2 = VideoPublishContainerScene.this;
                            List list = (List) obj;
                            Boolean bool = (Boolean) obj2;
                            Boolean bool2 = (Boolean) obj3;
                            if (videoPublishContainerScene2.LLILZLL != null && bool2.booleanValue() && bool.booleanValue()) {
                                videoPublishContainerScene2.LLILZLL.tagUserList = (ArrayList) list;
                                videoPublishContainerScene2.LLLII();
                                return null;
                            }
                            return null;
                        }
                    });
                    return;
                } else {
                    g8a.LIZLLL(videoPublishContainerScene.LLII(), "video_post_page", videoPublishContainerScene.LLIIIILZ.LIZ(), videoPublishContainerScene.LLILZLL.tagUserList, new OnActivityResultCallback() { // from class: X.G7u
                        @Override // com.bytedance.router.OnActivityResultCallback
                        public final void onActivityResult(int i, int i2, Intent intent) {
                            VideoPublishContainerScene videoPublishContainerScene2 = VideoPublishContainerScene.this;
                            videoPublishContainerScene2.getClass();
                            if (i2 == -1 && intent != null && intent.getBooleanExtra("need_update", false)) {
                                videoPublishContainerScene2.LLILZLL.tagUserList = (ArrayList) intent.getSerializableExtra("tagged_user_list");
                                videoPublishContainerScene2.LLLII();
                            }
                        }
                    });
                    return;
                }
        }
    }

    public static final void onClick$1(ACListenerS25S0101000_7 aCListenerS25S0101000_7, View view) {
        GAY gay = (GAY) aCListenerS25S0101000_7.l0;
        gay.LJLIL.vh(((G99) ListProtector.get(gay.LJLILLLLZI, aCListenerS25S0101000_7.i1)).LIZ, ((G99) ListProtector.get(((GAY) aCListenerS25S0101000_7.l0).LJLILLLLZI, aCListenerS25S0101000_7.i1)).LIZIZ);
    }

    public static final void onClick$2(ACListenerS25S0101000_7 aCListenerS25S0101000_7, View view) {
        ((GBN) aCListenerS25S0101000_7.l0).LJLIL.invoke(Integer.valueOf(aCListenerS25S0101000_7.i1));
    }

    public static final void onClick$3(ACListenerS25S0101000_7 aCListenerS25S0101000_7, View view) {
        ((ViewPager) aCListenerS25S0101000_7.l0).setCurrentItem(aCListenerS25S0101000_7.i1);
    }

    public static final void onClick$4(ACListenerS25S0101000_7 aCListenerS25S0101000_7, View view) {
        Integer num;
        ExpandedTitleModule expandedTitleModule;
        switch (aCListenerS25S0101000_7.i1) {
            case 0:
                C73943T0h.LIZ().LIZIZ(aCListenerS25S0101000_7.l0);
                return;
            case 1:
                ((Dialog) aCListenerS25S0101000_7.l0).cancel();
                return;
            case 2:
                View view2 = (View) aCListenerS25S0101000_7.l0;
                C235779Nd.LIZ.LJIIIIZZ().LIZLLL(Boolean.TRUE);
                view2.setVisibility(8);
                return;
            default:
                GQ5 gq5 = (GQ5) aCListenerS25S0101000_7.l0;
                GS5 gs5 = gq5.LJIIZILJ;
                int i = 0;
                if (gs5 != null && (expandedTitleModule = gs5.LJIIIZ) != null && expandedTitleModule.LJLLL.getAlpha() < 1.0f) {
                    C5S1 c5s1 = new C5S1(C60903NvH.LJ);
                    c5s1.LIZJ(R.string.p6f);
                    c5s1.LJ();
                    return;
                }
                GVN gvn = G9Z.LIZ;
                C145995oB LIZ = C164236cV.LIZ(gq5.LJIIL);
                LIZ.LJI("enter_method", "button");
                if (gvn != null) {
                    i = 1;
                }
                LIZ.LIZ(i, "after_post");
                if (gvn != null && (num = gvn.LIZLLL) != null) {
                    LIZ.LIZJ(num, "aweme_type");
                }
                FMX.LJIIL("click_video_at", LIZ.LIZ);
                if (gq5.LIZIZ.getSelectionEnd() > gq5.LIZIZ.getSelectionStart()) {
                    return;
                }
                if (!C44172HVg.LJIJ.isLogin()) {
                    HQ7 hq7 = C44172HVg.LJIJ;
                    ActivityC45651qj LLII = gq5.LIZ.LLII();
                    Objects.requireNonNull(LLII);
                    hq7.LIZ(LLII, "", "click_at_friend", null, null);
                    return;
                }
                if (gq5.LIZIZ.LJLLI) {
                    return;
                }
                if ((!gq5.LJIILLIIL.LIZ() && gq5.LIZIZ(true)) || gq5.LIZ.getFragment() == null) {
                    return;
                }
                G9S g9s = C44172HVg.LJ;
                Fragment fragment = gq5.LIZ.getFragment();
                g9s.getClass();
                C8WN.LIZIZ.LJFF(fragment);
                return;
        }
    }

    public static final void onClick$5(ACListenerS25S0101000_7 aCListenerS25S0101000_7, View view) {
        ((C42241Ghx) aCListenerS25S0101000_7.l0).LJLILLLLZI.iv0(aCListenerS25S0101000_7.i1);
    }

    public ACListenerS25S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
