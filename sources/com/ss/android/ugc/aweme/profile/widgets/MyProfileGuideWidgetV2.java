package com.ss.android.ugc.aweme.profile.widgets;

import X.ASQ;
import X.ASX;
import X.C255199zv;
import X.C84763XOl;
import X.C86034Xpe;
import X.C8BR;
import X.C8BS;
import X.InterfaceC56322M8o;
import X.InterfaceC85901XnV;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.service.PaidContentAwareBannerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MyProfileGuideWidgetV2 extends BaseMyProfileGuideWidget implements InterfaceC85901XnV {
    public final InterfaceC56322M8o LL;
    public final ViewGroup LLD;
    public C8BR<C8BS<PushSettings>, InterfaceC85901XnV> LLF;

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget, com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJ() {
        ProfileAigcIntroFragment profileAigcIntroFragment = this.LJZL;
        if (profileAigcIntroFragment == null) {
            return;
        }
        ASQ.LJ(profileAigcIntroFragment, ASX.LIZ);
        this.LJZL = null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget, com.ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C8BR<C8BS<PushSettings>, InterfaceC85901XnV> providePushSettingFetchPresenter = C86034Xpe.LIZIZ.providePushSettingFetchPresenter();
        this.LLF = providePushSettingFetchPresenter;
        o.LJI(providePushSettingFetchPresenter);
        providePushSettingFetchPresenter.LJJI(this);
        C8BR<C8BS<PushSettings>, InterfaceC85901XnV> c8br = this.LLF;
        o.LJI(c8br);
        c8br.LJIILL(new Object[0]);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget, com.bytedance.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C8BR<C8BS<PushSettings>, InterfaceC85901XnV> c8br = this.LLF;
        if (c8br != null) {
            c8br.LIZIZ();
        }
        PaidContentAwareBannerServiceImpl.LJFF().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget, com.bytedance.widget.Widget
    public final void onResume() {
        super.onResume();
        if (LIZJ().getVisibility() == 0 && C255199zv.LJIIIIZZ()) {
            LIZJ().setVisibility(8);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onStop() {
        super.onStop();
        if (!C84763XOl.LJIIJJI) {
            LIZIZ();
        }
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        if (pushSettings.downloadPrompt == 1) {
            ProfileViewModel LIZ = LIZ();
            int i = pushSettings.downloadSetting;
            LIZ.getClass();
            LIZ.setState(new AqS29S0001000_4(i, 12));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(1:271)(1:11)|12|(1:270)(1:16)|17|(1:269)(1:25)|26|(1:268)(1:30)|31|(4:259|(1:261)|263|(14:265|34|(2:40|(9:42|43|(1:253)(1:51)|52|(1:252)(1:54)|55|56|57|(62:59|60|61|(1:246)(1:65)|66|(1:245)(1:70)|71|(1:244)(1:75)|76|(1:243)(1:80)|81|(1:242)(1:85)|86|(1:241)(1:90)|91|(4:93|(1:239)|95|(46:97|98|(2:108|(42:120|121|(1:237)(1:125)|126|(2:128|(2:132|(2:134|(3:138|139|(2:141|(28:147|148|(1:150)(1:233)|151|152|153|154|(1:230)(1:164)|165|(1:229)(1:175)|176|(1:228)(1:180)|181|(1:227)(1:185)|186|(1:226)(1:190)|191|(1:225)(1:195)|196|(1:224)(1:202)|203|(1:205)(1:223)|206|(1:222)(1:212)|213|(1:221)(1:217)|218|219))))))|236|148|(0)(0)|151|152|153|154|(1:156)|230|165|(1:167)|229|176|(1:178)|228|181|(1:183)|227|186|(1:188)|226|191|(1:193)|225|196|(1:198)|224|203|(0)(0)|206|(1:208)|222|213|(1:215)|221|218|219))|238|121|(1:123)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219))|240|98|(6:100|102|104|106|108|(47:110|112|114|118|120|121|(0)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219))|238|121|(0)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219)(67:247|61|(1:63)|246|66|(1:68)|245|71|(1:73)|244|76|(1:78)|243|81|(1:83)|242|86|(1:88)|241|91|(0)|240|98|(0)|238|121|(0)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219)))|254|43|(1:45)|253|52|(6:250|252|55|56|57|(0)(0))|54|55|56|57|(0)(0)))|33|34|(4:36|38|40|(0))|254|43|(0)|253|52|(0)|54|55|56|57|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:59|60|61|(1:246)(1:65)|66|(1:245)(1:70)|71|(1:244)(1:75)|76|(1:243)(1:80)|81|(1:242)(1:85)|86|(1:241)(1:90)|91|(4:93|(1:239)|95|(46:97|98|(2:108|(42:120|121|(1:237)(1:125)|126|(2:128|(2:132|(2:134|(3:138|139|(2:141|(28:147|148|(1:150)(1:233)|151|152|153|154|(1:230)(1:164)|165|(1:229)(1:175)|176|(1:228)(1:180)|181|(1:227)(1:185)|186|(1:226)(1:190)|191|(1:225)(1:195)|196|(1:224)(1:202)|203|(1:205)(1:223)|206|(1:222)(1:212)|213|(1:221)(1:217)|218|219))))))|236|148|(0)(0)|151|152|153|154|(1:156)|230|165|(1:167)|229|176|(1:178)|228|181|(1:183)|227|186|(1:188)|226|191|(1:193)|225|196|(1:198)|224|203|(0)(0)|206|(1:208)|222|213|(1:215)|221|218|219))|238|121|(1:123)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219))|240|98|(6:100|102|104|106|108|(47:110|112|114|118|120|121|(0)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219))|238|121|(0)|237|126|(0)|236|148|(0)(0)|151|152|153|154|(0)|230|165|(0)|229|176|(0)|228|181|(0)|227|186|(0)|226|191|(0)|225|196|(0)|224|203|(0)(0)|206|(0)|222|213|(0)|221|218|219) */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0621, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0208, code lost:
    
        if ((r10 - r1.longValue()) > java.util.concurrent.TimeUnit.DAYS.toMillis(30)) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0438  */
    @Override // com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSJ[] LJIIJ(com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState r14, com.ss.android.ugc.aweme.profile.viewmodel.ProfileState r15) {
        /*
            Method dump skipped, instructions count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.LJIIJ(com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState, com.ss.android.ugc.aweme.profile.viewmodel.ProfileState):X.OSJ[]");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyProfileGuideWidgetV2(ComponentFragment fragment, ViewGroup contentView, InterfaceC56322M8o popupScene) {
        super(fragment, contentView);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(popupScene, "popupScene");
        this.LL = popupScene;
        this.LLD = contentView;
    }
}
