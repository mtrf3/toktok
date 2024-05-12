package com.ss.android.ugc.aweme.commerce.tools.tcm.service;

import X.AI8;
import X.AIF;
import X.ASL;
import X.ActivityC45651qj;
import X.C00F;
import X.C145995oB;
import X.C244659iv;
import X.C26220AQu;
import X.C26224AQy;
import X.C26227ARb;
import X.C26231ARf;
import X.C33381Ss;
import X.C38350F3i;
import X.C3AW;
import X.C3C5;
import X.C41457GOv;
import X.C41458GOw;
import X.C41459GOx;
import X.C41460GOy;
import X.C42905Gsf;
import X.C42906Gsg;
import X.C44172HVg;
import X.C44423Hc3;
import X.C56330M8w;
import X.C58096Mr6;
import X.C78555UsJ;
import X.C78915Uy7;
import X.C84654XKg;
import X.C86V;
import X.FMX;
import X.GF4;
import X.GFJ;
import X.GNU;
import X.GP0;
import X.GP1;
import X.GP2;
import X.GTE;
import X.InterfaceC67352kd;
import X.KMP;
import X.UC0;
import X.V8E;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC41455GOt;
import X.X1D;
import X.XKS;
import Y.ACListenerS33S0300000_7;
import Y.AObserverS71S0200000_7;
import Y.IDCListenerS280S0100000_4;
import Y.IDCSpanS32S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BCPageModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.publish.IPublishPageService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPageImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS0S0331000_7;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS47S0400000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes8.dex */
public final class CommerceToolsTcmServiceImpl implements ICommerceToolsTcmService {
    public C56330M8w LIZ;
    public C41460GOy LIZIZ;
    public BCPageModel LIZJ;

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void clear() {
        this.LIZIZ = null;
        this.LIZ = null;
    }

    public static ICommerceToolsTcmService LJIJJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsTcmService.class, false);
        if (LIZ != null) {
            return (ICommerceToolsTcmService) LIZ;
        }
        if (C58096Mr6.LLLIIIL == null) {
            synchronized (ICommerceToolsTcmService.class) {
                if (C58096Mr6.LLLIIIL == null) {
                    C58096Mr6.LLLIIIL = new CommerceToolsTcmServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIILL() {
        return C41458GOw.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIZILJ() {
        return C41458GOw.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIJ() {
        TcmConfig LIZ = C41458GOw.LIZ();
        if (LIZ != null && (LIZ.isTcmCreator() || !LIZ.getUseBcEntranceInPost())) {
            return false;
        }
        return GP0.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean isTcm() {
        TcmConfig LIZ = C41458GOw.LIZ();
        if (LIZ != null) {
            return LIZ.isTcmCreator();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIJ() {
        return GP1.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final CommerceTcmPublishModule LIZ(GF4 gf4) {
        return new CommerceTcmPublishModule(gf4);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LIZIZ(JSONObject obj) {
        Object obj2;
        String str;
        C44423Hc3 currentUser;
        o.LJIIIZ(obj, "obj");
        String brandedContentType = obj.optString("branded_content_type");
        String brandOrganicType = obj.optString("brand_organic_type");
        String optString = obj.optString("campaign_info");
        boolean optBoolean = obj.optBoolean("ads_only");
        boolean optBoolean2 = obj.optBoolean("ads_authorization");
        String optString2 = obj.optString("tcm_params");
        boolean optBoolean3 = obj.optBoolean("is_account_ad_settings_open");
        if (optBoolean3 && (currentUser = C44172HVg.LJIJ.getCurrentUser()) != null) {
            currentUser.LJIILJJIL();
        }
        String optString3 = obj.optString("deliverable_id");
        if (!o.LJ(brandedContentType, CardStruct.IStatusCode.DEFAULT) && !TextUtils.isEmpty(optString3)) {
            str = obj.optString("deliverable_id");
            JSONObject optJSONObject = obj.optJSONObject("submit_text");
            if (optJSONObject != null) {
                obj2 = JsonParseUtils.LIZJ(TCMPostPageSubmitTextModel.class, optJSONObject.toString());
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
            str = null;
        }
        BCPageModel bCPageModel = this.LIZJ;
        if (bCPageModel != null) {
            MutableLiveData<C41457GOv> mutableLiveData = bCPageModel.LJLIL;
            o.LJIIIIZZ(brandedContentType, "brandedContentType");
            o.LJIIIIZZ(brandOrganicType, "brandOrganicType");
            mutableLiveData.setValue(new C41457GOv(brandedContentType, brandOrganicType, optString, optString2, optBoolean, optBoolean2, optBoolean3, str, (TCMPostPageSubmitTextModel) obj2));
            return;
        }
        o.LJIJI("bcPageVM");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIILIIL(CommerceToolsTcmModel model) {
        o.LJIIIZ(model, "model");
        String outerTcmOrder = model.getOuterTcmOrder();
        if (outerTcmOrder != null && outerTcmOrder.length() > 0) {
            JSONObject jSONObject = new JSONObject(outerTcmOrder);
            String optString = jSONObject.optString("campaignInfo");
            if ((!TextUtils.isEmpty(optString)) && optString != null) {
                model.setTcmOrder(true);
                model.setTcmCampaignInfo(optString);
                model.setBrandedContentSwitch("1");
            }
            String optString2 = jSONObject.optString("sparkAdsAuth");
            if ((!TextUtils.isEmpty(optString2)) && optString2 != null) {
                model.setSparkAdsAuth(optString2);
            }
            String optString3 = jSONObject.optString("deliverableId");
            if ((!TextUtils.isEmpty(optString3)) && optString3 != null) {
                model.setDeliverableId(optString3);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("submitText");
            if (optJSONObject != null && optJSONObject != null) {
                model.setSubmitText(new TCMPostPageSubmitTextModel(optJSONObject.optString("submitTitle"), optJSONObject.optString("submitButton")));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIJI(BCPageModel vm) {
        o.LJIIIZ(vm, "vm");
        this.LIZJ = vm;
    }

    public static void LJIJJLI(AwemeDraft awemeDraft, JSONObject jSONObject) {
        CommerceToolsTcmModel tcmModel = awemeDraft.LIZ.commerceModel.getTcmModel();
        tcmModel.setTcmOrder(!TextUtils.isEmpty(jSONObject.optString("campaignInfo")));
        tcmModel.setBrandedContentSwitch("1");
        tcmModel.setTcmCampaignInfo(jSONObject.optString("campaignInfo"));
        tcmModel.setDeliverableId(jSONObject.optString("deliverableId"));
        tcmModel.setSparkAdsAuth(jSONObject.optString("sparkAdsAuth"));
        tcmModel.setOuterTcmOrder(jSONObject.toString());
        JSONObject optJSONObject = jSONObject.optJSONObject("submitText");
        if (optJSONObject != null) {
            tcmModel.setSubmitText(new TCMPostPageSubmitTextModel(optJSONObject.optString("submitTitle"), optJSONObject.optString("submitButton")));
        }
        if (tcmModel.getTcmPreventSelfSee() != 2) {
            tcmModel.setTcmPreventSelfSee(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LIZLLL(boolean z, boolean z2) {
        C44423Hc3 currentUser;
        if (z && !z2 && (currentUser = C44172HVg.LJIJ.getCurrentUser()) != null) {
            currentUser.LJIILJJIL();
        }
        C44423Hc3 currentUser2 = C44172HVg.LJIJ.getCurrentUser();
        if (currentUser2 != null) {
            return currentUser2.LJII();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIIIIZZ(Context context, String enable) {
        View view;
        GTE gte;
        GTE gte2;
        View view2;
        o.LJIIIZ(enable, "enable");
        if (!TextUtils.equals(enable, CardStruct.IStatusCode.DEFAULT)) {
            C56330M8w c56330M8w = this.LIZ;
            if (c56330M8w != null && (view2 = (View) c56330M8w.LIZ) != null) {
                view2.setVisibility(0);
            }
            C56330M8w c56330M8w2 = this.LIZ;
            if (c56330M8w2 != null && (gte2 = (GTE) c56330M8w2.LIZ) != null) {
                gte2.setBrandedContent(TextUtils.equals(enable, "2"));
            }
            C41460GOy c41460GOy = this.LIZIZ;
            if (c41460GOy != null) {
                if (!TextUtils.equals("1", "1")) {
                    TextUtils.equals("1", "2");
                }
                c41460GOy.setLabelText("");
            }
        } else {
            C56330M8w c56330M8w3 = this.LIZ;
            if (c56330M8w3 != null && (view = (View) c56330M8w3.LIZ) != null) {
                view.setVisibility(8);
            }
            C41460GOy c41460GOy2 = this.LIZIZ;
            if (c41460GOy2 != null) {
                c41460GOy2.setLabelText("");
            }
        }
        IPublishPageService LIZJ = PublishPageImpl.LIZJ();
        C56330M8w c56330M8w4 = this.LIZ;
        if (c56330M8w4 != null && (gte = (GTE) c56330M8w4.LIZ) != null) {
            LIZJ.LIZIZ(gte);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIILLIIL(CommerceToolsTcmModel commerceToolsTcmModel, C41457GOv bcPageModel) {
        o.LJIIIZ(bcPageModel, "bcPageModel");
        if (commerceToolsTcmModel != null) {
            int i = 1;
            commerceToolsTcmModel.setTcmOrder(!TextUtils.isEmpty(bcPageModel.LIZJ));
            commerceToolsTcmModel.setBrandedContentSwitch(bcPageModel.LIZ);
            commerceToolsTcmModel.setBrandOrganicType(bcPageModel.LIZIZ);
            commerceToolsTcmModel.setAdsOnlySwitch(bcPageModel.LJ);
            commerceToolsTcmModel.setAdsAuthorizationSwitch(bcPageModel.LJFF);
            commerceToolsTcmModel.setTcmCampaignInfo(bcPageModel.LIZJ);
            commerceToolsTcmModel.setTcmParams(bcPageModel.LIZLLL);
            commerceToolsTcmModel.setAccountAdSettingsBeOpen(bcPageModel.LJI);
            if (!TextUtils.equals(bcPageModel.LIZ, CardStruct.IStatusCode.DEFAULT)) {
                i = 2;
            }
            commerceToolsTcmModel.setTcmPreventSelfSee(i);
            String str = bcPageModel.LJII;
            if (str != null) {
                commerceToolsTcmModel.setDeliverableId(str);
                commerceToolsTcmModel.setSubmitText(bcPageModel.LJIIIIZZ);
            } else {
                commerceToolsTcmModel.setDeliverableId(null);
                commerceToolsTcmModel.setSubmitText(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LIZJ(Context context, CommerceToolsTcmModel commerceToolsTcmModel, AqS173S0100000_7 aqS173S0100000_7) {
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJIIIZ = new C244659iv(context, R.raw.icon_2pt_horn_ltr, null, 12, 0);
        c26227ARb.LJ(R.string.c41);
        c26227ARb.LIZ(R.string.c40);
        UC0.LIZJ(c26227ARb, new AqS111S0300000_7(context, commerceToolsTcmModel, aqS173S0100000_7, 1));
        C26231ARf LJI = c26227ARb.LJI();
        LJI.LJIIIIZZ();
        LJI.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJ(Context context, C42905Gsf c42905Gsf, C42906Gsg c42906Gsg) {
        C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.s5c, R.string.s5b);
        UC0.LIZJ(LIZLLL, new AqS137S0200000_6(c42905Gsf, c42906Gsg, 7));
        LIZLLL.LJII = false;
        LIZLLL.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJI(AI8 ai8, Fragment fragment, VideoPublishEditModel videoPublishEditModel) {
        CommerceToolsTcmModel commerceToolsTcmModel;
        CreativeModel creativeModel;
        CommerceToolsModel commerceToolsModel;
        o.LJIIIZ(fragment, "fragment");
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (commerceToolsModel = creativeModel.commerceModel) != null) {
            commerceToolsTcmModel = commerceToolsModel.getTcmModel();
        } else {
            commerceToolsTcmModel = null;
        }
        Context context = ai8.getContext();
        o.LJIIIIZZ(context, "tcmItem.context");
        AIF aif = new AIF(context, null);
        aif.LJIILJJIL(new ACListenerS33S0300000_7(fragment, videoPublishEditModel, commerceToolsTcmModel, 0));
        ai8.setAccessory(aif);
        BCPageModel bCPageModel = new BCPageModel();
        this.LIZJ = bCPageModel;
        bCPageModel.LJLIL.observe(fragment, new AObserverS71S0200000_7(this, commerceToolsTcmModel, 0));
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIILJJIL(ViewStub viewStub, boolean z, boolean z2) {
        TcmConfig LIZ = C41458GOw.LIZ();
        if (LIZ != null && LIZ.getUseBcEntranceInPost()) {
            this.LIZ = new C56330M8w(viewStub, z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final Object LJFF(Activity activity, AwemeDraft awemeDraft, String str, GNU gnu) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(gnu));
        JSONObject jSONObject = new JSONObject(str);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "deliverableId");
        CommerceToolsTcmModel tcmModel = awemeDraft.LIZ.commerceModel.getTcmModel();
        if (awemeDraft.LJJJJI.creationMode == 2) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.s5f);
            C78915Uy7.LJJIIZI(activity, 6007, creativeToastBuilder);
            C3C5.m7constructorimpl(null);
            c84654XKg.resumeWith(null);
        } else {
            String deliverableId = tcmModel.getDeliverableId();
            if (deliverableId == null || o.LJ(string, deliverableId)) {
                LJIJJLI(awemeDraft, jSONObject);
                C3C5.m7constructorimpl(awemeDraft);
                c84654XKg.resumeWith(awemeDraft);
            } else {
                C26227ARb c26227ARb = new C26227ARb(activity);
                c26227ARb.LJ(R.string.s56);
                c26227ARb.LIZ(R.string.s55);
                UC0.LIZJ(c26227ARb, new AqS47S0400000_1(c84654XKg, this, awemeDraft, jSONObject, 1));
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
            }
        }
        return c84654XKg.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJIIL(Activity activity, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i) {
        C41459GOx.LIZ(activity, z, commerceToolsTcmModel, z2, "post", i);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("user_id", C44172HVg.LJIJ.getCurrentUserID());
        FMX.LJIIL("ttcm_more_page_click_disclosure", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final Object LJIIJJI(Fragment fragment, Aweme aweme, boolean z, boolean z2, boolean z3, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        V8E v8e;
        FragmentManager supportFragmentManager;
        if (aweme != null && aweme.getAwemeType() == 150) {
            return new Integer(0);
        }
        if (!C41458GOw.LJ()) {
            return new Integer(0);
        }
        if (z3 && (z || z2)) {
            return new Integer(0);
        }
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C26224AQy c26224AQy = new C26224AQy();
        Context context = fragment.getContext();
        if (context != null) {
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.bef;
            v8e = c33381Ss.LIZ(context);
        } else {
            v8e = null;
        }
        c26224AQy.LIZ = v8e;
        c26224AQy.LIZLLL = 2;
        String LJFF = C86V.LJFF(R.string.s0w);
        o.LJIIIIZZ(LJFF, "getString(R.string.tagBA_guiding_popup_header)");
        c26224AQy.LJ = LJFF;
        String LJFF2 = C86V.LJFF(R.string.s0t);
        o.LJIIIIZZ(LJFF2, "getString(R.string.tagBA_guiding_popup_body)");
        String LJFF3 = C86V.LJFF(R.string.s0u);
        o.LJIIIIZZ(LJFF3, "getString(R.string.tagBA_guiding_popup_bullet1)");
        String LJFF4 = C86V.LJFF(R.string.s0v);
        o.LJIIIIZZ(LJFF4, "getString(R.string.tagBA_guiding_popup_bullet2)");
        c26224AQy.LJ(new C26220AQu(LJFF2, false), new C26220AQu(LJFF3, true), new C26220AQu(LJFF4, true));
        String LJFF5 = C86V.LJFF(R.string.s0x);
        AqS108S0300000_4 aqS108S0300000_4 = new AqS108S0300000_4(fragment, aweme, xks, 3);
        c26224AQy.LJII = LJFF5;
        c26224AQy.LJIIIZ = aqS108S0300000_4;
        String LJFF6 = C86V.LJFF(R.string.s0y);
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(xks, 152);
        c26224AQy.LJIIIIZZ = LJFF6;
        c26224AQy.LJIIJ = aqS170S0100000_4;
        ASL LIZ = c26224AQy.LIZ();
        IDCListenerS280S0100000_4 iDCListenerS280S0100000_4 = new IDCListenerS280S0100000_4(xks, 1);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLIL = iDCListenerS280S0100000_4;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "showBCSheetOnTagPeople");
        }
        return xks.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final void LJII(Fragment fragment, ViewStub viewStub, CommerceToolsTcmModel commerceToolsTcmModel, boolean z, boolean z2, boolean z3, int i) {
        String str;
        o.LJIIIZ(fragment, "fragment");
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.cpx);
            viewStub.setInflatedId(R.id.l1v);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.tools.tcm.publish.view.TcmPublishSettingItem");
            C41460GOy c41460GOy = (C41460GOy) inflate;
            this.LIZIZ = c41460GOy;
            if (!C41458GOw.LIZJ() && (!C41458GOw.LIZLLL() || !z)) {
                c41460GOy.setVisibility(8);
                return;
            }
            c41460GOy.setVisibility(0);
            String str2 = null;
            if (commerceToolsTcmModel != null) {
                str = commerceToolsTcmModel.getBrandedContentSwitch();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, CardStruct.IStatusCode.DEFAULT)) {
                fragment.getContext();
                if (commerceToolsTcmModel != null) {
                    str2 = commerceToolsTcmModel.getBrandedContentSwitch();
                }
                if (!TextUtils.equals(str2, "1")) {
                    TextUtils.equals(str2, "2");
                }
                c41460GOy.setLabelText("");
            } else {
                c41460GOy.setLabelText("");
            }
            if (z) {
                c41460GOy.setTitle(R.string.s4x);
            }
            c41460GOy.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC41455GOt(fragment, z2, commerceToolsTcmModel, z3, i, z)));
            return;
        }
        this.LIZIZ = (C41460GOy) viewStub.findViewById(R.id.ahu);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService
    public final boolean LJIIIZ(Context context, boolean z, boolean z2, boolean z3, List list, CommerceToolsTcmModel commerceToolsTcmModel, BrandedContentSwitchStatus brandedContentSwitchStatus, int i) {
        String str;
        String str2;
        String str3;
        TcmConfig LIZ;
        List<String> hashtagList;
        int i2;
        int i3;
        int i4;
        int i5;
        String str4;
        Integer LJJIL;
        Integer LJJIL2;
        o.LJIIIZ(brandedContentSwitchStatus, "brandedContentSwitchStatus");
        String str5 = null;
        if (commerceToolsTcmModel != null) {
            str = commerceToolsTcmModel.getBrandedContentSwitch();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "7")) {
            return false;
        }
        if (commerceToolsTcmModel != null) {
            str2 = commerceToolsTcmModel.getBrandOrganicType();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, "1002")) {
            return false;
        }
        if (commerceToolsTcmModel != null) {
            str5 = commerceToolsTcmModel.getBrandedContentSwitch();
            str3 = commerceToolsTcmModel.getBrandOrganicType();
        } else {
            str3 = null;
        }
        if (z && !C41458GOw.LJ()) {
            return false;
        }
        if (!C41458GOw.LIZLLL() && !C41458GOw.LIZJ()) {
            return false;
        }
        if (str5 != null && (LJJIL2 = C38350F3i.LJJIL(str5)) != null && LJJIL2.intValue() > 0) {
            return false;
        }
        if ((str3 != null && (LJJIL = C38350F3i.LJJIL(str3)) != null && LJJIL.intValue() > 0) || (LIZ = C41458GOw.LIZ()) == null || (hashtagList = LIZ.getHashtagList()) == null || hashtagList.isEmpty() || list == null || list.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it.next();
            if (aVTextExtraStruct.type == 1) {
                Iterator<String> it2 = hashtagList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append('#');
                        LIZ2.append(aVTextExtraStruct.hashTagName);
                        if (TextUtils.equals(X1D.LIZIZ(LIZ2), next)) {
                            sb.append(next);
                            sb.append(" ");
                            sb2.append(next);
                            sb2.append(",");
                            i6++;
                            break;
                        }
                    }
                }
            }
        }
        if (i6 == 0) {
            return false;
        }
        String sb3 = sb.toString();
        o.LJIIIIZZ(sb3, "mobHashtags.toString()");
        sb2.deleteCharAt(sb2.length() - 1);
        String sb4 = sb2.toString();
        o.LJIIIIZZ(sb4, "dialogDescHashtag.delete…ag.length - 1).toString()");
        GP2 gp2 = new GP2(i6, sb3, sb4);
        if (gp2 == null) {
            return false;
        }
        if (C41458GOw.LJ()) {
            brandedContentSwitchStatus.LJLIL.setValue("2");
            brandedContentSwitchStatus.LJLJI.setValue(2);
            if (z3) {
                str4 = "commercial_music";
            } else {
                str4 = "original_sound";
            }
            FMX.LJIIL("tcm_bc_toggle", GFJ.LIZIZ(4, "click_toggle").LIZ);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("music_scen", str4);
            c145995oB.LJI("bc_hashtag", gp2.LIZIZ);
            FMX.LJIIL("tcm_bctoggle_auto_on", c145995oB.LIZ);
        }
        if (GP1.LIZ) {
            boolean LJ = C41458GOw.LJ();
            if (LJ || !z) {
                String string = context.getString(R.string.s4p, gp2.LIZJ);
                o.LJIIIIZZ(string, "context.getString(\n     …alogDescHashtag\n        )");
                if (gp2.LIZ == 1) {
                    string = context.getString(R.string.s4o, gp2.LIZJ);
                    o.LJIIIIZZ(string, "context.getString(\n     …DescHashtag\n            )");
                }
                SpannableString spannableString = new SpannableString(string);
                C26227ARb LIZ3 = C3AW.LIZ(context);
                LIZ3.LJ(R.string.s4q);
                LIZ3.LIZIZ(spannableString);
                UC0.LIZJ(LIZ3, new AqS0S0331000_7(i, context, commerceToolsTcmModel, brandedContentSwitchStatus, z2, z3, LJ, 1));
                C26231ARf LJI = LIZ3.LJI();
                LJI.LJIIIIZZ();
                LJI.LIZLLL();
                C145995oB c145995oB2 = new C145995oB();
                c145995oB2.LJI("hashtags", gp2.LIZJ);
                c145995oB2.LIZ(C41458GOw.LIZIZ() ? 1 : 0, "is_tcm_creator");
                c145995oB2.LJI("user_id", C44172HVg.LJIJ.getCurrentUserID());
                FMX.LJIIL("ttcm_turnon_disclosure_setting_show_prompt", c145995oB2.LIZ);
            }
        } else {
            boolean LJ2 = C41458GOw.LJ();
            if (!LJ2) {
                if (!z) {
                    i2 = R.string.s4b;
                }
            } else {
                i2 = R.string.s48;
            }
            String string2 = context.getString(i2, gp2.LIZJ);
            o.LJIIIIZZ(string2, "context.getString(\n     …alogDescHashtag\n        )");
            if (gp2.LIZ == 1) {
                if (LJ2) {
                    i5 = R.string.s49;
                } else {
                    i5 = R.string.s4c;
                }
                string2 = context.getString(i5, gp2.LIZJ);
                o.LJIIIIZZ(string2, "context.getString(\n     …DescHashtag\n            )");
            }
            String string3 = context.getString(R.string.s47);
            o.LJIIIIZZ(string3, "context.getString(R.string.tcm_bc_home_title)");
            if (LJ2) {
                i3 = R.string.s4_;
            } else {
                i3 = R.string.s4d;
            }
            String string4 = context.getString(i3, string3);
            o.LJIIIIZZ(string4, "context.getString(\n     … brandedContent\n        )");
            if (gp2.LIZ > 1) {
                if (LJ2) {
                    i4 = R.string.s4a;
                } else {
                    i4 = R.string.s4e;
                }
                string4 = context.getString(i4, string3);
                o.LJIIIIZZ(string4, "context.getString(\n     …ndedContent\n            )");
            }
            String LIZIZ = C00F.LIZIZ(string2, ' ', string4);
            int LJJLIIJ = s.LJJLIIJ(LIZIZ, string3, 6);
            int length = string3.length() + LJJLIIJ;
            SpannableString spannableString2 = new SpannableString(LIZIZ);
            spannableString2.setSpan(new IDCSpanS32S0100000_7(context, 2), LJJLIIJ, length, 33);
            C26227ARb LIZ4 = C3AW.LIZ(context);
            LIZ4.LJ(R.string.s4i);
            LIZ4.LIZIZ(spannableString2);
            UC0.LIZJ(LIZ4, new AqS0S0331000_7(i, context, commerceToolsTcmModel, brandedContentSwitchStatus, LJ2, z2, z3, 0));
            C26231ARf LJI2 = LIZ4.LJI();
            LJI2.LJIIIIZZ();
            LJI2.LIZLLL();
        }
        return true;
    }
}
