package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JAZ extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final JAZ LJLIL = new JAZ();

    public JAZ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Boolean> c43i) {
        String str;
        C2MA c2ma;
        String aid;
        InterfaceC222708oc interfaceC222708oc;
        IViewPagerComponentAbility viewPagerComponentAbility;
        int i;
        ViewGroup rootView;
        InterfaceC48722JAg LIZIZ;
        String str2;
        String str3;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue() && selectSubscribe.LLIILII && selectSubscribe.LLIIJLIL) {
            Aweme aweme = selectSubscribe.A4().LJLJLLL;
            String str4 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (!JAY.LIZ(str)) {
                IWF.LJJLIIIIJ().LJIILJJIL();
                IAdReRankServiceManagerService LIZJ = AdReRankServiceManager.LIZJ();
                if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ(ILE.FEED)) != null) {
                    Aweme aweme2 = selectSubscribe.A4().LJLJLLL;
                    if (aweme2 != null) {
                        str2 = aweme2.getAid();
                    } else {
                        str2 = null;
                    }
                    Aweme aweme3 = selectSubscribe.A4().LJLL;
                    if (aweme3 != null) {
                        str3 = aweme3.getAid();
                    } else {
                        str3 = null;
                    }
                    LIZIZ.LJIIJJI(System.currentTimeMillis() / 1000, str2, str3);
                }
                Context context = selectSubscribe.getContext();
                if (context != null) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setId(R.id.su);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Integer LJI = C79045V0n.LJI(R.attr.d4, context);
                    if (LJI != null) {
                        i = LJI.intValue();
                    } else {
                        i = 0;
                    }
                    frameLayout.setBackgroundColor(i);
                    IMidAdAbility z4 = selectSubscribe.z4();
                    if (z4 != null && (rootView = z4.getRootView()) != null) {
                        rootView.addView(frameLayout);
                    }
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) selectSubscribe.LLIIIJ.getValue();
                if (iFeedPanelPlatformAbility != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null) {
                    c2ma = viewPagerComponentAbility.getCurViewHolder();
                } else {
                    c2ma = null;
                }
                if ((c2ma instanceof InterfaceC222708oc) && (interfaceC222708oc = (InterfaceC222708oc) c2ma) != null) {
                    interfaceC222708oc.eg(false);
                }
                VideoSeekBarMaskView videoSeekBarMaskView = selectSubscribe.LLIIJI;
                if (videoSeekBarMaskView != null) {
                    videoSeekBarMaskView.setDownInRect(false);
                }
                IClearModePanelComponent iClearModePanelComponent = (IClearModePanelComponent) selectSubscribe.LLIIII.getValue();
                if (iClearModePanelComponent != null) {
                    iClearModePanelComponent.kW();
                }
                IMidAdAbility z42 = selectSubscribe.z4();
                if (z42 != null) {
                    z42.LJJIIZ();
                }
                selectSubscribe.getContainerView().postDelayed(new ARunnableS44S0100000_8(selectSubscribe, 88), 50L);
                Aweme aweme4 = selectSubscribe.A4().LJLJLLL;
                if (aweme4 != null && (aid = aweme4.getAid()) != null) {
                    JAY.LJ.add(aid);
                }
                Aweme aweme5 = selectSubscribe.A4().LJLJLLL;
                if (aweme5 != null) {
                    str4 = aweme5.getAid();
                }
                Aweme aweme6 = selectSubscribe.A4().LJLL;
                if (str4 != null && aweme6 != null) {
                    JAY.LIZIZ.put(str4, aweme6);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
