package X;

import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.component.biz.MusicBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MEV implements C2MJ {
    public final /* synthetic */ MusicBottomComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public MEV(MusicBottomComponent musicBottomComponent) {
        this.LJLIL = musicBottomComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        IFeedPanelPlatformAbility H3;
        Aweme currentAweme;
        CCTemplateInfo ccTemplateInfo;
        Aweme currentAweme2;
        CCTemplateInfo ccTemplateInfo2;
        View view;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        IFeedPanelPlatformAbility H32;
        Aweme currentAweme3;
        CCTemplateInfo ccTemplateInfo3;
        MusicBottomComponent musicBottomComponent = this.LJLIL;
        Aweme aweme = null;
        String str = null;
        String str2 = null;
        if (musicBottomComponent.I3()) {
            musicBottomComponent.K3();
            TextView textView = musicBottomComponent.LJLLJ;
            if (textView != null) {
                Context context = musicBottomComponent.getContext();
                if (context != null) {
                    str = context.getString(R.string.tij);
                }
                textView.setText(str);
            }
        } else {
            IFeedPanelPlatformAbility H33 = musicBottomComponent.H3();
            if (H33 != null && (currentAweme2 = H33.getCurrentAweme()) != null && (ccTemplateInfo2 = currentAweme2.getCcTemplateInfo()) != null && ccTemplateInfo2.isTemplateBottomStyleSingleBtn()) {
                musicBottomComponent.K3();
                TextView textView2 = musicBottomComponent.LJLLJ;
                if (textView2 != null) {
                    Context context2 = musicBottomComponent.getContext();
                    if (context2 != null) {
                        str2 = context2.getString(R.string.ciu);
                    }
                    textView2.setText(str2);
                }
            } else {
                View view2 = musicBottomComponent.LJLLILLLL;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = musicBottomComponent.LJLJJI;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                C81156VtA c81156VtA = musicBottomComponent.LJLLL;
                if (c81156VtA != null) {
                    c81156VtA.setVisibility(0);
                }
                TuxIconView tuxIconView = musicBottomComponent.LJLLLL;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                }
                View view4 = musicBottomComponent.LJLLLLLL;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = musicBottomComponent.LJLZ;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                IFeedPanelPlatformAbility H34 = musicBottomComponent.H3();
                if (H34 != null) {
                    aweme = H34.getCurrentAweme();
                }
                if (C224868s6.LIZJ(aweme) && (H3 = musicBottomComponent.H3()) != null && (currentAweme = H3.getCurrentAweme()) != null && (ccTemplateInfo = currentAweme.getCcTemplateInfo()) != null && ccTemplateInfo.isTemplateBottomStyleDoubleBtn()) {
                    C81156VtA c81156VtA2 = musicBottomComponent.LJLLL;
                    if (c81156VtA2 != null) {
                        c81156VtA2.setVisibility(8);
                    }
                    TuxIconView tuxIconView2 = musicBottomComponent.LJLLLL;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setVisibility(8);
                    }
                    View view6 = musicBottomComponent.LJLLLLLL;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    }
                    View view7 = musicBottomComponent.LJLZ;
                    if (view7 != null) {
                        view7.setVisibility(0);
                    }
                }
            }
        }
        if ((musicBottomComponent.I3() || ((H32 = musicBottomComponent.H3()) != null && (currentAweme3 = H32.getCurrentAweme()) != null && (ccTemplateInfo3 = currentAweme3.getCcTemplateInfo()) != null && ccTemplateInfo3.isTemplateBottomStyleSingleBtn())) && (view = musicBottomComponent.LJLLILLLL) != null) {
            view.post(new ARunnableS45S0100000_9(musicBottomComponent, 163));
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LIZIZ()) {
            View view8 = musicBottomComponent.LJLLLLLL;
            if (view8 != null) {
                view8.setVisibility(8);
            }
            TuxIconView tuxIconView3 = musicBottomComponent.LJLLLL;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
            }
            int LJIIJJI = KL2.LJIIJJI(musicBottomComponent.getContext()) - ((int) KL2.LIZJ(musicBottomComponent.getContext(), 24.0f));
            View view9 = musicBottomComponent.LJLJJI;
            if (view9 != null && (layoutParams2 = view9.getLayoutParams()) != null) {
                layoutParams2.width = LJIIJJI;
            }
            View view10 = musicBottomComponent.LJLJJI;
            if (view10 == null || (layoutParams = view10.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = (int) KL2.LIZJ(musicBottomComponent.getContext(), 38.0f);
        }
    }
}
