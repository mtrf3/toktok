package Y;

import X.AbstractC26082ALm;
import X.C03150Al;
import X.C06140Ly;
import X.C0NB;
import X.C113554cx;
import X.C26045AKb;
import X.C28043AzX;
import X.C2U8;
import X.C34K;
import X.C47261Igj;
import X.C49355JYp;
import X.C49485JbV;
import X.C57939MoZ;
import X.C71945SLl;
import X.C72027SOp;
import X.C72039SPb;
import X.C72041SPd;
import X.C72042SPe;
import X.C72281SYj;
import X.C72283SYl;
import X.C72284SYm;
import X.C72287SYp;
import X.C72708SgC;
import X.C73129Smz;
import X.C73139Sn9;
import X.C73296Spg;
import X.C73454SsE;
import X.C73849Syb;
import X.C73969T1h;
import X.C74391THn;
import X.C74496TLo;
import X.C76800UCe;
import X.C82890Wg2;
import X.C82894Wg6;
import X.C87277YNd;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC69056R8i;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.ORZ;
import X.OSZ;
import X.PH3;
import X.PH4;
import X.RBY;
import X.SL9;
import X.SNL;
import X.SYR;
import X.SZ0;
import X.T16;
import X.TEA;
import X.TF6;
import X.TG6;
import X.TGU;
import X.TGZ;
import X.THZ;
import X.TJI;
import X.TJK;
import X.TJU;
import X.TJW;
import X.TM3;
import X.TMB;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.api.PaPromptResponse;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.keywords.KeyWordsViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviListResponse;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tpsc.data.restriction.PrivacyRestrictionResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AfS61S0200000_12 implements InterfaceC64592gB {
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
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        ((JediViewModel) afS61S0200000_12.l0).setState(new AqS143S0200000_12(afS61S0200000_12, (AbstractC26082ALm) obj, 22));
    }

    public static final void accept$1(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        ((C73139Sn9) afS61S0200000_12.l0).LJI(new AqS143S0200000_12(afS61S0200000_12, (AbstractC26082ALm) obj, 19));
    }

    public static final void accept$10(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        C03150Al diffResult = (C03150Al) obj;
        o.LJIIIZ(diffResult, "diffResult");
        C73129Smz c73129Smz = (C73129Smz) afS61S0200000_12.l0;
        c73129Smz.LJLIL = (List) afS61S0200000_12.l1;
        try {
            diffResult.LIZJ(c73129Smz);
        } catch (Exception e) {
            C0NB.LIZIZ("MultiGuestMultiTypeAdapter", e.getMessage());
            ((C73129Smz) afS61S0200000_12.l0).notifyDataSetChanged();
        }
        ((ArrayList) ((C73129Smz) afS61S0200000_12.l0).LJLJI).clear();
        List list = (List) afS61S0200000_12.l1;
        C73129Smz c73129Smz2 = (C73129Smz) afS61S0200000_12.l0;
        for (Object obj2 : list) {
            if (obj2 != null) {
                ((ArrayList) c73129Smz2.LJLJI).add(obj2);
            }
        }
    }

    public static final void accept$11(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C74391THn) afS61S0200000_12.l0).LIZIZ = true;
        }
        ((Runnable) afS61S0200000_12.l1).run();
    }

    public static final void accept$12(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        TF6 tf6 = (TF6) obj;
        if (tf6.LJLIL) {
            AbstractStickerView.LIZJ((AbstractStickerView) afS61S0200000_12.l0).bb(true);
            ((TGU) afS61S0200000_12.l1).LIZIZ(tf6.LJLJJI);
        } else {
            if (tf6.LJLILLLLZI || (((AbstractStickerView) afS61S0200000_12.l0).LLIIIJ.LJLJL == 2 && tf6.LJLJI)) {
                AbstractStickerView.LIZJ((AbstractStickerView) afS61S0200000_12.l0).bb(false);
            }
            ((TGU) afS61S0200000_12.l1).LIZJ(tf6.LJLJI);
        }
        ((AbstractStickerView) afS61S0200000_12.l0).LL.onNext(Boolean.valueOf(tf6.LJLIL));
    }

    public static final void accept$13(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        THZ thz = (THZ) obj;
        ((MutableLiveData) afS61S0200000_12.l0).setValue(thz);
        if (thz == null) {
            return;
        }
        int i = TG6.LIZ[thz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((AbstractStickerView) afS61S0200000_12.l1).LLII.LIZJ.LJFF().LJLLLL();
            return;
        }
        ((AbstractStickerView) afS61S0200000_12.l1).LLFF = true;
        if (C82894Wg6.LIZIZ.LIZJ().LIZJ()) {
            TGZ tgz = ((AbstractStickerView) afS61S0200000_12.l1).LJLJL;
            if (tgz != null) {
                tgz.E3();
                C73296Spg c73296Spg = ((AbstractStickerView) afS61S0200000_12.l1).LLFFF;
                if (c73296Spg != null) {
                    C87277YNd.LJJIJIIJI(c73296Spg, false);
                }
            } else {
                o.LJIJI("tabListView");
                throw null;
            }
        }
        ((AbstractStickerView) afS61S0200000_12.l1).LLII.LIZJ.LJFF().LIZ("end_sticker_anim");
    }

    public static final void accept$14(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        Integer value;
        Activity activity;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.status_code != 0) {
            KeyWordsViewModel keyWordsViewModel = (KeyWordsViewModel) afS61S0200000_12.l0;
            String str = baseResponse.status_msg;
            o.LJIIIIZZ(str, "it.status_msg");
            KeyWordsViewModel.gv0(keyWordsViewModel, str);
            return;
        }
        Integer value2 = ((KeyWordsViewModel) afS61S0200000_12.l0).LJLILLLLZI.getValue();
        if ((value2 != null && value2.intValue() == 1 && ((List) afS61S0200000_12.l1).isEmpty()) || (value = ((KeyWordsViewModel) afS61S0200000_12.l0).LJLILLLLZI.getValue()) == null || value.intValue() != 1) {
            UserSetSettingApi.LIZ.getClass();
            C73454SsE LJJJ = SL9.LIZ("comment_filter_status", 2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
            KeyWordsViewModel keyWordsViewModel2 = (KeyWordsViewModel) afS61S0200000_12.l0;
            LJJJ.LJJJLIIL(new AfS62S0100000_10(keyWordsViewModel2, 41), new AfS64S0100000_12(keyWordsViewModel2, 139));
            return;
        }
        WeakReference<Activity> weakReference = ((KeyWordsViewModel) afS61S0200000_12.l0).LJLIL;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJ(R.style.ul);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIIIZZ(R.string.dk0);
        c26045AKb.LJIIJ();
    }

    public static final void accept$15(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        u.LJJIIJZLJL("wait error 2", ((IPdpStarter.PdpEnterParam) afS61S0200000_12.l0).getTrackParams());
        ((C34K) afS61S0200000_12.l1).element = true;
    }

    public static final void accept$16(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        OSZ osz = (OSZ) obj;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C72708SgC) afS61S0200000_12.l0).LJIIIIZZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C72708SgC) afS61S0200000_12.l0).LIZ((Effect) osz.getSecond(), (List) afS61S0200000_12.l1, (List) osz.getFirst());
    }

    public static final void accept$17(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        List it = (List) obj;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C72708SgC) afS61S0200000_12.l0).LJIIIIZZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C72708SgC c72708SgC = (C72708SgC) afS61S0200000_12.l0;
        List list = (List) afS61S0200000_12.l1;
        o.LJIIIIZZ(it, "it");
        c72708SgC.LIZ(null, list, it);
    }

    public static final void accept$18(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        C73849Syb<OSZ<String, TJU<?>>> c73849Syb = ((TJK) afS61S0200000_12.l0).LJFF;
        TJI tji = (TJI) afS61S0200000_12.l1;
        c73849Syb.onNext(new OSZ<>(tji.LIZ, new TJW(tji.LJI)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$19(Y.AfS61S0200000_12 r9, java.lang.Object r10) {
        /*
            X.TJU r10 = (X.TJU) r10
            boolean r0 = r10 instanceof X.TJS
            if (r0 == 0) goto Lb4
            T r3 = r10.LIZ
            boolean r0 = r3 instanceof com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel
            r5 = 0
            if (r0 != 0) goto Le
            r3 = r5
        Le:
            com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate r3 = (com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate) r3
            if (r3 == 0) goto L5d
            com.ss.ugc.effectplatform.model.CategoryPageModel$Extra r0 = r3.getExtra()
            if (r0 == 0) goto L7b
            java.util.List r1 = r0.getFiltered_effects()
            if (r1 == 0) goto L7b
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L2d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r7 = r8.next()
            com.ss.ugc.effectplatform.model.CategoryPageModel$FilterEffect r7 = (com.ss.ugc.effectplatform.model.CategoryPageModel.FilterEffect) r7
            X.TJT r6 = new X.TJT
            java.lang.Long r0 = r7.getId()
            if (r0 == 0) goto L5a
            long r0 = r0.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L5a
        L4b:
            java.lang.Long r1 = r7.getReasonCode()
            java.lang.String r0 = r7.getReasonMsg()
            r6.<init>(r2, r1, r0)
            r4.add(r6)
            goto L2d
        L5a:
            java.lang.String r2 = ""
            goto L4b
        L5d:
            r1 = r5
            goto L85
        L5f:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r9.l0
            X.TJK r0 = (X.TJK) r0
            X.Syb<X.OSZ<java.lang.String, java.util.List<X.TJT>>> r2 = r0.LJ
            java.lang.Object r0 = r9.l1
            X.TJI r0 = (X.TJI) r0
            java.lang.String r1 = r0.LIZ
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r4)
            r2.onNext(r0)
        L7b:
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r3.getCategoryEffects()
            if (r0 == 0) goto L5d
            com.ss.ugc.effectplatform.model.CategoryEffectModel r1 = r0.getKCategoryEffect()
        L85:
            boolean r0 = r1 instanceof com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel
            if (r0 != 0) goto L8a
            r1 = r5
        L8a:
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r1 = (com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel) r1
            if (r1 == 0) goto Lad
            r5 = r1
        L8f:
            java.lang.Object r0 = r9.l0
            X.TJK r0 = (X.TJK) r0
            X.Syb<X.OSZ<java.lang.String, X.TJU<?>>> r4 = r0.LJFF
            java.lang.Object r0 = r9.l1
            X.TJI r0 = (X.TJI) r0
            java.lang.String r3 = r0.LIZ
            X.TJS r2 = new X.TJS
            int r1 = r0.LJI
            int r0 = r0.LIZIZ
            r2.<init>(r1, r0, r5)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r3, r2)
            r4.onNext(r0)
            goto Lc8
        Lad:
            if (r3 == 0) goto L8f
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r3.getCategoryEffects()
            goto L8f
        Lb4:
            java.lang.Object r0 = r9.l0
            X.TJK r0 = (X.TJK) r0
            X.Syb<X.OSZ<java.lang.String, X.TJU<?>>> r2 = r0.LJFF
            java.lang.Object r0 = r9.l1
            X.TJI r0 = (X.TJI) r0
            java.lang.String r1 = r0.LIZ
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r10)
            r2.onNext(r0)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS61S0200000_12.accept$19(Y.AfS61S0200000_12, java.lang.Object):void");
    }

    public static final void accept$2(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        ((InterfaceC69056R8i) afS61S0200000_12.l0).ee(0);
        ((C34K) afS61S0200000_12.l1).element = true;
    }

    public static final void accept$20(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        C72287SYp c72287SYp;
        InterfaceC88472Yns<C72284SYm, C76800UCe> interfaceC88472Yns;
        C57939MoZ config = (C57939MoZ) obj;
        o.LJIIIIZZ(config, "config");
        C72281SYj c72281SYj = new C72281SYj(config, ((SYR) afS61S0200000_12.l0).LIZ, (SZ0) afS61S0200000_12.l1);
        SYR syr = (SYR) afS61S0200000_12.l0;
        C72281SYj c72281SYj2 = syr.LJ;
        if (c72281SYj2 != null) {
            C06140Ly.LIZJ(c72281SYj2.LJIILLIIL());
            if (c72281SYj2.LJLJJL) {
                c72281SYj2.LJLJJL = false;
                ((PH4) c72281SYj2.LJLJJI.getValue()).LJ();
            }
            c72281SYj2.LJLILLLLZI.LJJLL(c72281SYj2);
        }
        syr.LJ = c72281SYj;
        String LJIILLIIL = c72281SYj.LJIILLIIL();
        if (LJIILLIIL != null && LJIILLIIL.length() > 0 && (c72287SYp = C72283SYl.LIZ) != null && (interfaceC88472Yns = c72287SYp.LJLIL) != null) {
            interfaceC88472Yns.invoke(new C72284SYm(c72281SYj.LJLILLLLZI, LJIILLIIL));
        }
        if (C72283SYl.LIZIZ || C72283SYl.LIZJ) {
            c72281SYj.LJLILLLLZI.LJIIJJI(c72281SYj);
            ((PH4) c72281SYj.LJLJJI.getValue()).LIZJ(c72281SYj);
            PH4 ph4 = (PH4) c72281SYj.LJLJJI.getValue();
            PH3 ph3 = ph4.LJ;
            if (ph3 != null) {
                ph3.LJ = c72281SYj;
            }
            ph4.LIZLLL = c72281SYj;
        }
        OptimizeAbility optimizeAbility = config.LJFF;
        if (optimizeAbility != null && optimizeAbility.enable) {
            SYR syr2 = (SYR) afS61S0200000_12.l0;
            C49485JbV c49485JbV = new C49485JbV(optimizeAbility, syr2.LIZ, syr2.LIZLLL);
            C49485JbV c49485JbV2 = syr2.LJFF;
            if (c49485JbV2 != null) {
                c49485JbV2.LJLJI.clear();
                c49485JbV2.LJLJJL.LIZIZ(null);
                c49485JbV2.LJLILLLLZI.LJJLL(c49485JbV2);
                c49485JbV2.LJLILLLLZI.setViewCacheExtension(null);
            }
            syr2.LJFF = c49485JbV;
            c49485JbV.LJIILLIIL();
            c49485JbV.LJLILLLLZI.LJIIJJI(c49485JbV);
            c49485JbV.LJLILLLLZI.setViewCacheExtension(new C49355JYp(c49485JbV, c49485JbV));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        Map<String, PrivacySettingsRestrictionItem> account;
        Map linkedHashMap;
        Map linkedHashMap2;
        PrivacyRestrictionResponse privacyRestrictionResponse;
        PrivacySettingsRestriction privacySettingsRestriction;
        Map<String, PrivacySettingsRestrictionItem> videoPrivacy;
        PrivacySettingsRestriction privacySettingsRestriction2;
        Map<String, PrivacySettingsRestrictionItem> account2;
        Integer num;
        Integer num2;
        PaPromptResponse paPromptResponse = (PaPromptResponse) obj;
        if (paPromptResponse.privacySettingsRestriction != null && paPromptResponse.privacyUserSettings != null) {
            ((PaPromptViewModel) afS61S0200000_12.l0).getClass();
            SNL.LIZIZ().getClass();
            PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
            boolean z = false;
            if (LJI == null) {
                LJI = new PrivacyUserSettingsV2(0);
            }
            for (Object target : C47261Igj.LJJIJIIJI("private_account", "duet", "stitch", "comment", "direct_message")) {
                o.LJIIIZ(target, "target");
                Map<String, Integer> map = paPromptResponse.privacyUserSettings;
                if (map != null && (num2 = map.get(target)) != null) {
                    LJI.LJLIL.put(target, Integer.valueOf(num2.intValue()));
                }
            }
            RBY LJFF = C71945SLl.LJ().LJFF();
            Map<String, Integer> map2 = paPromptResponse.privacyUserSettings;
            if (map2 != null && (num = map2.get("private_account")) != null && num.intValue() == 1) {
                z = true;
            }
            LJFF.updateCurSecret(z);
            C72041SPd.LIZ.getClass();
            C72042SPe.LIZJ(LJI);
            PrivacySettingsRestriction privacySettingsRestriction3 = paPromptResponse.privacySettingsRestriction;
            if (privacySettingsRestriction3 != null && (account = privacySettingsRestriction3.getAccount()) != null) {
                SNL.LIZIZ().getClass();
                PrivacyRestrictionResponse LIZ = C72039SPb.LIZ();
                if (LIZ != null && (privacySettingsRestriction2 = LIZ.getPrivacySettingsRestriction()) != null && (account2 = privacySettingsRestriction2.getAccount()) != null) {
                    linkedHashMap = C113554cx.LJJLIL(account2);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                PrivacyRestrictionResponse LIZ2 = C72039SPb.LIZ();
                if (LIZ2 != null && (privacySettingsRestriction = LIZ2.getPrivacySettingsRestriction()) != null && (videoPrivacy = privacySettingsRestriction.getVideoPrivacy()) != null) {
                    linkedHashMap2 = C113554cx.LJJLIL(videoPrivacy);
                } else {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap.putAll(account);
                PrivacySettingsRestriction privacySettingsRestriction4 = new PrivacySettingsRestriction(linkedHashMap, linkedHashMap2);
                PrivacyRestrictionResponse LIZ3 = C72039SPb.LIZ();
                if (LIZ3 == null || (privacyRestrictionResponse = PrivacyRestrictionResponse.copy$default(LIZ3, privacySettingsRestriction4, null, null, null, 14, null)) == null) {
                    privacyRestrictionResponse = new PrivacyRestrictionResponse(privacySettingsRestriction4, C113554cx.LJJJLIIL(), C113554cx.LJJJLIIL(), null);
                }
                C72039SPb.LJII(privacyRestrictionResponse);
            }
            ((PaPromptViewModel) afS61S0200000_12.l0).LJLILLLLZI.postValue(Boolean.FALSE);
            C2U8.LIZ(new C72027SOp());
            ((InterfaceC65784Pro) afS61S0200000_12.l1).invoke();
            return;
        }
        throw new Exception();
    }

    public static final void accept$4(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        ((PaPromptViewModel) afS61S0200000_12.l0).LJLILLLLZI.postValue(Boolean.FALSE);
        ((InterfaceC65784Pro) afS61S0200000_12.l1).invoke();
    }

    public static final void accept$5(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        Object obj2;
        Response response = (Response) obj;
        if (response != null) {
            obj2 = response.data;
        } else {
            obj2 = null;
        }
        if (((InterfaceC88473Ynt) afS61S0200000_12.l0) == null) {
            ((PdpViewModel) afS61S0200000_12.l1).nx0(obj2);
        }
    }

    public static final void accept$6(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        List arrayList;
        ProfileNaviListResponse profileNaviListResponse = (ProfileNaviListResponse) obj;
        if (profileNaviListResponse != null && profileNaviListResponse.error_code == 0) {
            List<ProfileNaviDataModel> naviList = ((ProfileNaviSwitcherState) afS61S0200000_12.l0).getNaviList();
            if (naviList != null) {
                arrayList = ORZ.LLJILJILJ(naviList);
            } else {
                arrayList = new ArrayList();
            }
            List<ProfileNaviDataModel> list = profileNaviListResponse.naviList;
            if (list != null) {
                arrayList.addAll(list);
            }
            ((ProfileNaviSwitcherViewModel) afS61S0200000_12.l1).setState(new AqS143S0200000_12(arrayList, (List<ProfileNaviDataModel>) profileNaviListResponse, (ProfileNaviListResponse) 65));
        }
    }

    public static final void accept$7(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        Map<Object, OSZ<TEA, Integer>> linkedHashMap;
        BaseInfoStickerStateViewModel baseInfoStickerStateViewModel = (BaseInfoStickerStateViewModel) afS61S0200000_12.l0;
        Map<Object, OSZ<TEA, Integer>> value = baseInfoStickerStateViewModel.LJLIL.getValue();
        if (value != null) {
            linkedHashMap = C113554cx.LJJLIL(value);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.remove(afS61S0200000_12.l1);
        baseInfoStickerStateViewModel.LJLIL.setValue(linkedHashMap);
        BaseInfoStickerStateViewModel.hv0(((BaseInfoStickerStateViewModel) afS61S0200000_12.l0).LJLJI, afS61S0200000_12.l1);
    }

    public static final void accept$8(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        C28043AzX c28043AzX = (C28043AzX) afS61S0200000_12.l0;
        View view = (View) afS61S0200000_12.l1;
        c28043AzX.getClass();
        if (view != null) {
            c28043AzX.LLLLZLLIL(new AqS162S0100000_12(view, 1049));
        }
    }

    public static final void accept$9(AfS61S0200000_12 afS61S0200000_12, Object obj) {
        if (((ProviderEffect) obj).getPath() != null) {
            ((TM3) afS61S0200000_12.l0).getClass();
            C74496TLo c74496TLo = ((TM3) afS61S0200000_12.l0).LJLILLLLZI;
            if (c74496TLo != null) {
                c74496TLo.destroy();
                return;
            } else {
                o.LJIJI("giphyListView");
                throw null;
            }
        }
        TMB.LIZIZ(C82890Wg2.LJFF, (Context) afS61S0200000_12.l1, R.string.g5t).LIZ();
    }

    public AfS61S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
