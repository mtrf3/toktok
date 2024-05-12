package Y;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C36691Ead;
import X.C36887Edn;
import X.C37179EiV;
import X.C38795FKl;
import X.C38796FKm;
import X.C39342FcI;
import X.C39603FgV;
import X.C40461FuL;
import X.C68322mC;
import X.C73454SsE;
import X.C73969T1h;
import X.C78565UsT;
import X.E9K;
import X.E9M;
import X.E9N;
import X.FJI;
import X.G2M;
import X.InterfaceC40458FuI;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.RunnableC39607FgZ;
import X.T16;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.experiment.TrimMemorySettingParam;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi;
import com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageComponent;
import com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageComponent;
import com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment;
import com.ss.android.ugc.aweme.journey.step.lynx.LynxExperienceFragment;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishTestSupportTask;
import com.ss.android.ugc.aweme.legoimpl.service.Dex2OatTask;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AfS55S0200000_6 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004f, code lost:
    
        if (r8 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x002d, code lost:
    
        if (r8 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0029, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS55S0200000_6 r7, java.lang.Object r8) {
        /*
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r8 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r8
            r6 = 0
            if (r8 == 0) goto L80
            T r0 = r8.data
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData) r0
            if (r0 == 0) goto L28
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PipoTokenInfo r0 = r0.pipoTokenInfo
            if (r0 == 0) goto L28
            java.lang.String r5 = r0.token
        L11:
            T r0 = r8.data
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData) r0
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PipoTokenInfo r0 = r0.pipoTokenInfo
            if (r0 == 0) goto L2c
            java.lang.String r4 = r0.host
        L1d:
            T r0 = r8.data
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData) r0
            if (r0 == 0) goto L4e
            com.google.gson.m r2 = r0.cashier
            if (r2 == 0) goto L4e
            goto L30
        L28:
            r5 = r6
            if (r8 == 0) goto L2c
            goto L11
        L2c:
            r4 = r6
            if (r8 == 0) goto L4e
            goto L1d
        L30:
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L4e
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier> r0 = com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L4e
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L4e
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L4e
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier     // Catch: com.google.gson.s -> L4e
            if (r0 != 0) goto L47
            r1 = r6
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r1 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) r1     // Catch: com.google.gson.s -> L4e
            if (r1 == 0) goto L4e
            java.lang.String r3 = r1.merchantId
            goto L51
        L4e:
            r3 = r6
            if (r8 == 0) goto L78
        L51:
            T r0 = r8.data
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData) r0
            if (r0 == 0) goto L78
            com.google.gson.m r2 = r0.cashier
            if (r2 == 0) goto L78
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L78
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier> r0 = com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L78
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L78
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L78
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier     // Catch: com.google.gson.s -> L78
            if (r0 != 0) goto L72
            r1 = r6
        L72:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r1 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) r1     // Catch: com.google.gson.s -> L78
            if (r1 == 0) goto L78
            java.lang.String r6 = r1.merchantUserId
        L78:
            if (r5 == 0) goto L80
            if (r4 == 0) goto L80
            if (r3 == 0) goto L80
            if (r6 != 0) goto L92
        L80:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "pay/auth response is not complete."
            r1.<init>(r0)
            java.lang.Object r0 = r7.l0
            X.Yns r0 = (X.InterfaceC88472Yns) r0
            r0.invoke(r1)
            X.C78983UzD.LJIIZILJ(r1)
        L91:
            return
        L92:
            java.lang.Object r0 = r7.l1
            X.Ynu r0 = (X.InterfaceC88474Ynu) r0
            r0.invoke(r5, r4, r3, r6)
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S0200000_6.accept$0(Y.AfS55S0200000_6, java.lang.Object):void");
    }

    public static final void accept$1(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null && iTpcConsentService.LJ(null) && ((ChooseAppLanguageComponent) afS55S0200000_6.l0).mo49getActivity() != null) {
            ChooseAppLanguageComponent chooseAppLanguageComponent = (ChooseAppLanguageComponent) afS55S0200000_6.l0;
            chooseAppLanguageComponent.LJLLJ = "consent_box";
            ActivityC45651qj mo49getActivity = chooseAppLanguageComponent.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            iTpcConsentService.LJIIIZ(mo49getActivity, "app_language");
        }
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS55S0200000_6.l1).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$10(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        for (Music music : ((MusicList) obj).musicList) {
            o.LJIIIIZZ(music, "response.musicList");
            Music music2 = music;
            Map<String, MusicModel> map = E9N.LJLJI;
            String idStr = music2.getIdStr();
            o.LJIIIIZZ(idStr, "musicModel.idStr");
            MusicModel convertToMusicModel = music2.convertToMusicModel();
            o.LJIIIIZZ(convertToMusicModel, "musicModel.convertToMusicModel()");
            map.put(idStr, convertToMusicModel);
        }
        List list = (List) afS55S0200000_6.l0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (E9N.LJLJI.get(((E9M) obj2).LJLIL) != null) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        OSZ osz = new OSZ(arrayList, arrayList2);
        List list2 = (List) osz.getFirst();
        for (E9M e9m : (List) osz.getSecond()) {
            E9K e9k = E9N.LJLILLLLZI;
            String musicId = e9m.LJLIL;
            e9k.getClass();
            o.LJIIIZ(musicId, "musicId");
            e9k.LIZIZ.remove(musicId);
            e9k.LIZ.remove(musicId);
        }
        InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) afS55S0200000_6.l1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            MusicModel musicModel = E9N.LJLJI.get(((E9M) it.next()).LJLIL);
            if (musicModel != null) {
                arrayList3.add(musicModel);
            }
        }
        interfaceC73573Su9.onNext(arrayList3);
    }

    public static final void accept$11(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        C73454SsE LJJJ = ((CustomStickerApi) ((EditPreviewStickerViewModel) afS55S0200000_6.l0).LJLJL.getValue()).cutoutSticker(new TypedFile("image/*", (File) obj)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) afS55S0200000_6.l0;
        LJJJ.LJJJLIIL(new C36691Ead(editPreviewStickerViewModel, (CreativeInfo) afS55S0200000_6.l1, currentTimeMillis), new AfS58S0100000_6(editPreviewStickerViewModel, 46));
    }

    public static final void accept$12(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        Activity activity = (Activity) obj;
        o.LJIIIIZZ(activity, "activity");
        C39342FcI c39342FcI = (C39342FcI) afS55S0200000_6.l0;
        PopupManager.LJIIL(new C40461FuL(activity, c39342FcI.LIZLLL, (InterfaceC40458FuI) afS55S0200000_6.l1, new AqS156S0100000_6(c39342FcI, LiveTryModeCountDownThresholdSetting.DEFAULT)));
    }

    public static final void accept$13(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        Boolean bool = (Boolean) obj;
        if (!C39603FgV.LIZ) {
            return;
        }
        if (bool.booleanValue()) {
            ((Handler) afS55S0200000_6.l0).postDelayed((RunnableC39607FgZ) afS55S0200000_6.l1, 60000L);
        } else {
            ((Handler) afS55S0200000_6.l0).removeCallbacks((RunnableC39607FgZ) afS55S0200000_6.l1);
        }
    }

    public static final void accept$2(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null && iTpcConsentService.LJ(null)) {
            ContentLanguageComponent contentLanguageComponent = (ContentLanguageComponent) afS55S0200000_6.l0;
            contentLanguageComponent.LJLLJ = "consent_box";
            if (contentLanguageComponent.mo49getActivity() != null) {
                ActivityC45651qj mo49getActivity = ((ContentLanguageComponent) afS55S0200000_6.l0).mo49getActivity();
                o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.LJIIIZ(mo49getActivity, "content_language");
            }
        }
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS55S0200000_6.l1).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$3(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        G2M g2m = (G2M) obj;
        if (g2m.LIZIZ) {
            AbstractSelectInterestFragment abstractSelectInterestFragment = (AbstractSelectInterestFragment) afS55S0200000_6.l0;
            abstractSelectInterestFragment.getClass();
            abstractSelectInterestFragment.LJLLLL = "consent_box";
            if (((AbstractSelectInterestFragment) afS55S0200000_6.l0).mo49getActivity() != null) {
                AbstractSelectInterestFragment abstractSelectInterestFragment2 = (AbstractSelectInterestFragment) afS55S0200000_6.l0;
                ITpcConsentService iTpcConsentService = g2m.LIZ;
                ActivityC45651qj mo49getActivity = abstractSelectInterestFragment2.mo49getActivity();
                o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.LJIIIZ(mo49getActivity, "interest_selection");
            }
        }
        T t = ((C68322mC) afS55S0200000_6.l1).element;
        if (t != 0) {
            ((InterfaceC92693kP) t).dispose();
        } else {
            o.LJIJI("consentDisposable");
            throw null;
        }
    }

    public static final void accept$4(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null && iTpcConsentService.LJ(null)) {
            LynxExperienceFragment lynxExperienceFragment = (LynxExperienceFragment) afS55S0200000_6.l0;
            lynxExperienceFragment.LJLJLJ = "consent_box";
            if (lynxExperienceFragment.mo49getActivity() != null) {
                LynxExperienceFragment lynxExperienceFragment2 = (LynxExperienceFragment) afS55S0200000_6.l0;
                if (iTpcConsentService != null) {
                    ActivityC45651qj mo49getActivity = lynxExperienceFragment2.mo49getActivity();
                    o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    iTpcConsentService.LJIIIZ(mo49getActivity, "interest_selection");
                }
            }
        }
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS55S0200000_6.l1).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$5(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        IPublishDrillService iPublishDrillService;
        PublishTestSupportTask publishTestSupportTask = (PublishTestSupportTask) afS55S0200000_6.l0;
        Context context = (Context) afS55S0200000_6.l1;
        publishTestSupportTask.getClass();
        try {
            String obj2 = FJI.LIZ.get("strategy_platform_test_data").getValue().toString();
            if (!TextUtils.isEmpty(obj2) && (iPublishDrillService = publishTestSupportTask.LJLIL) != null) {
                iPublishDrillService.LIZIZ(context, obj2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void accept$6(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (((Dex2OatTask) afS55S0200000_6.l0).LJLJI) {
            return;
        }
        if (booleanValue) {
            C37179EiV.LJFF.postDelayed((Runnable) afS55S0200000_6.l1, ((Number) C36887Edn.LIZIZ.getValue()).intValue() * 1000);
        } else {
            C37179EiV.LJFF.removeCallbacks((Runnable) afS55S0200000_6.l1);
        }
    }

    public static final void accept$7(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        C38795FKl c38795FKl = (C38795FKl) afS55S0200000_6.l0;
        TrimMemorySettingParam trimMemorySettingParam = (TrimMemorySettingParam) afS55S0200000_6.l1;
        Activity activity = (Activity) obj;
        c38795FKl.getClass();
        if ((activity.getComponentName().getClassName().contains(trimMemorySettingParam.activity_name1) || activity.getComponentName().getClassName().contains(trimMemorySettingParam.activity_name2) || activity.getComponentName().getClassName().contains(trimMemorySettingParam.activity_name3)) && !C38795FKl.LIZJ) {
            long j = trimMemorySettingParam.post_duration;
            if (j > 0) {
                String str = trimMemorySettingParam.action;
                C38796FKm c38796FKm = c38795FKl.LIZIZ;
                if (c38796FKm != null) {
                    c38796FKm.dispose();
                    c38795FKl.LIZIZ = null;
                }
                C73454SsE LJJJ = AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ());
                C38796FKm c38796FKm2 = new C38796FKm(c38795FKl, str);
                LJJJ.LIZ(c38796FKm2);
                c38795FKl.LIZIZ = c38796FKm2;
                return;
            }
            C38795FKl.LIZ(trimMemorySettingParam.action);
            return;
        }
        C38796FKm c38796FKm3 = c38795FKl.LIZIZ;
        if (c38796FKm3 == null) {
            return;
        }
        c38796FKm3.dispose();
        c38795FKl.LIZIZ = null;
    }

    public static final void accept$8(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        final BaseResponse baseResponse = (BaseResponse) obj;
        UserPresenter userPresenter = ((ProfileNaviHubViewModel) afS55S0200000_6.l0).LJLJJLL;
        final InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS55S0200000_6.l1;
        userPresenter.bindView(new C78565UsT() { // from class: X.2yn
            @Override // X.InterfaceC26189APp
            public final void Pp0(User user, int i) {
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                BaseResponse baseResponse2 = baseResponse;
                boolean z = false;
                if (baseResponse2 != null && baseResponse2.error_code == 0 && user != null) {
                    z = true;
                }
                interfaceC88472Yns2.invoke(Boolean.valueOf(z));
            }

            @Override // X.C78565UsT, X.InterfaceC26189APp
            public final void Xa(Exception exc, int i) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
        });
        ((ProfileNaviHubViewModel) afS55S0200000_6.l0).LJLJJLL.queryUser();
    }

    public static final void accept$9(AfS55S0200000_6 afS55S0200000_6, Object obj) {
        if (((Boolean) ((InterfaceC88472Yns) afS55S0200000_6.l0).invoke(obj)).booleanValue()) {
            ((InterfaceC65784Pro) afS55S0200000_6.l1).invoke();
        }
    }

    public AfS55S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
