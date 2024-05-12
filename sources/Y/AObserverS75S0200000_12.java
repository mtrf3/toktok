package Y;

import X.AbstractC73638SvC;
import X.C208298Fl;
import X.C32I;
import X.C34K;
import X.C3C5;
import X.C42229Ghl;
import X.C42230Ghm;
import X.C47261Igj;
import X.C48841JEv;
import X.C54838Lfe;
import X.C61328O5c;
import X.C61447O9r;
import X.C61878OQg;
import X.C63025OoP;
import X.C71939SLf;
import X.C71945SLl;
import X.C71955SLv;
import X.C71957SLx;
import X.C71961SMb;
import X.C71963SMd;
import X.C71966SMg;
import X.C71973SMn;
import X.C72724SgS;
import X.C72725SgT;
import X.C73296Spg;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74100T6i;
import X.C74125T7h;
import X.C74141T7x;
import X.C74216TAu;
import X.C74266TCs;
import X.C74310TEk;
import X.C74320TEu;
import X.C74413TIj;
import X.C78596Usy;
import X.C78613UtF;
import X.C82894Wg6;
import X.C87277YNd;
import X.DialogC72721SgP;
import X.EF7;
import X.EnumC74323TEx;
import X.GAE;
import X.H78;
import X.InterfaceC2068089s;
import X.InterfaceC72668SfY;
import X.InterfaceC74309TEj;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.KKR;
import X.O3U;
import X.OI6;
import X.ORZ;
import X.OSJ;
import X.OSZ;
import X.SGP;
import X.SKJ;
import X.SKZ;
import X.SLJ;
import X.SM0;
import X.SM2;
import X.SM5;
import X.SM7;
import X.SMA;
import X.SME;
import X.SMG;
import X.SMJ;
import X.SMN;
import X.SMP;
import X.SMR;
import X.SMW;
import X.SMX;
import X.SMY;
import X.SMZ;
import X.SPE;
import X.SY4;
import X.T4A;
import X.T4I;
import X.T8U;
import X.T8V;
import X.TEN;
import X.TFA;
import X.TFB;
import X.TG6;
import X.TKA;
import X.TLH;
import X.TLI;
import X.X1D;
import X.XJL;
import X.XKX;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateConfirmationFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateExistingStartFragment;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.qa.QAInviteViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.autocaption.AutoCaptionViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.SingleLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerBottomSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectTemplateEffect;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.duet.DuetViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.sticker.StickerViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.stitch.StitchViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.story.StoryViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AObserverS75S0200000_12 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            case 24:
                onChanged$24(this, obj);
                return;
            case 25:
                onChanged$25(this, obj);
                return;
            case 26:
                onChanged$26(this, obj);
                return;
            case 27:
                onChanged$27(this, obj);
                return;
            case 28:
                onChanged$28(this, obj);
                return;
            case 29:
                onChanged$29(this, obj);
                return;
            case 30:
                onChanged$30(this, obj);
                return;
            case 31:
                onChanged$31(this, obj);
                return;
            case 32:
                onChanged$32(this, obj);
                return;
            case 33:
                onChanged$33(this, obj);
                return;
            case 34:
                onChanged$34(this, obj);
                return;
            case 35:
                onChanged$35(this, obj);
                return;
            case 36:
                onChanged$36(this, obj);
                return;
            case 37:
                onChanged$37(this, obj);
                return;
            case 38:
                onChanged$38(this, obj);
                return;
            case 39:
                onChanged$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onChanged$40(this, obj);
                return;
            case 41:
                onChanged$41(this, obj);
                return;
            case 42:
                onChanged$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onChanged$43(this, obj);
                return;
            case 44:
                onChanged$44(this, obj);
                return;
            case 45:
                onChanged$45(this, obj);
                return;
            case 46:
                onChanged$46(this, obj);
                return;
            case 47:
                onChanged$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onChanged$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                onChanged$49(this, obj);
                return;
            case 50:
                onChanged$50(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        Integer value;
        Integer num = (Integer) obj;
        boolean z = true;
        if (!C54838Lfe.LJJI(((AutoCaptionViewModel) aObserverS75S0200000_12.l0).nv0()) && ((num == null || num.intValue() != 0) && (value = ((AutoCaptionViewModel) aObserverS75S0200000_12.l0).LJLJI.getValue()) != null && value.intValue() == 1 && !GAE.LIZ())) {
            ((AutoCaptionViewModel) aObserverS75S0200000_12.l0).lv0(-1);
        }
        SPE spe = (SPE) aObserverS75S0200000_12.l1;
        if (num != null && num.intValue() == 0) {
            z = false;
        }
        spe.LJLZ = z;
        SLJ.LLD((SPE) aObserverS75S0200000_12.l1);
    }

    public static final void onChanged$1(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        SKJ skj;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS75S0200000_12.l0;
        if ((lifecycleOwner instanceof SKJ) && (skj = (SKJ) lifecycleOwner) != null) {
            skj.Ra();
        }
        SLJ.LLD((SME) aObserverS75S0200000_12.l1);
    }

    public static final void onChanged$10(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        Integer it = (Integer) obj;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        Keva keva = C63025OoP.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("comment_dislike_filter_spam_");
        LIZ.append(C71945SLl.LIZIZ());
        keva.storeInt(X1D.LIZIZ(LIZ), intValue);
        ((C71939SLf) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$11(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (((SingleLiveData) aObserverS75S0200000_12.l0).pending.compareAndSet(true, false)) {
            ((Observer) aObserverS75S0200000_12.l1).onChanged(obj);
        }
    }

    public static final void onChanged$12(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        int i;
        Boolean it = (Boolean) obj;
        ProgressBar progressBar = ((FavoriteVideoPickerBottomSheet) aObserverS75S0200000_12.l0).LJLJI;
        if (progressBar != null) {
            o.LJIIIIZZ(it, "it");
            int i2 = 8;
            if (it.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            progressBar.setVisibility(i);
            View view = ((FavoriteVideoPickerBottomSheet) aObserverS75S0200000_12.l0).LJLJJI;
            if (view != null) {
                List<Aweme> value = ((FavoriteVideoPickerViewModel) aObserverS75S0200000_12.l1).LJLJL.getValue();
                if ((value == null || value.isEmpty()) && it.booleanValue()) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                return;
            }
            o.LJIJI("loadingViewContainer");
            throw null;
        }
        o.LJIJI("progressBar");
        throw null;
    }

    public static final void onChanged$13(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        String str;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && c74413TIj.LIZ != 0) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aObserverS75S0200000_12.l0;
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ORZ.LJLLLL(((InterfaceC74309TEj) aObserverS75S0200000_12.l1).LJ());
            if (effectCategoryModel != null) {
                str = effectCategoryModel.getKey();
            } else {
                str = null;
            }
            interfaceC88472Yns.invoke(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$14(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        EnumC74323TEx enumC74323TEx;
        List<Effect> list;
        C74413TIj wrapper = (C74413TIj) obj;
        o.LJIIIZ(wrapper, "wrapper");
        if (!((XJL) aObserverS75S0200000_12.l0).isActive() || (enumC74323TEx = wrapper.LIZIZ) == null) {
            return;
        }
        int i = C74320TEu.LIZ[enumC74323TEx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((LiveData) aObserverS75S0200000_12.l1).removeObserver(aObserverS75S0200000_12);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch mobile effect templates error, e = ");
            LIZ.append(wrapper.LIZJ);
            H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
            XJL xjl = (XJL) aObserverS75S0200000_12.l0;
            OSZ osz = new OSZ(wrapper.LIZJ, C61878OQg.INSTANCE);
            C3C5.m7constructorimpl(osz);
            xjl.resumeWith(osz);
            return;
        }
        ((LiveData) aObserverS75S0200000_12.l1).removeObserver(aObserverS75S0200000_12);
        CategoryEffectModelTemplate categoryEffectModelTemplate = (CategoryEffectModelTemplate) wrapper.LIZ;
        if (categoryEffectModelTemplate == null || (list = categoryEffectModelTemplate.getEffects()) == null) {
            list = C61878OQg.INSTANCE;
        }
        XJL xjl2 = (XJL) aObserverS75S0200000_12.l0;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Effect> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MobileEffectTemplateEffect(it.next()));
        }
        OSZ osz2 = new OSZ(null, arrayList);
        C3C5.m7constructorimpl(osz2);
        xjl2.resumeWith(osz2);
    }

    public static final void onChanged$15(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        C42230Ghm c42230Ghm;
        TLI tli = (TLI) aObserverS75S0200000_12.l0;
        tli.LJJIJIL = (String) obj;
        if (tli.LJJJJ) {
            if (!tli.LJJJJI) {
                C42229Ghl c42229Ghl = tli.LJJIJLIJ;
                if (c42229Ghl != null) {
                    c42229Ghl.notifyItemChanged(0);
                    return;
                }
                return;
            }
            if (!tli.LJJJJI || (c42230Ghm = tli.LJJIL) == null) {
                return;
            }
            tli.LJJIIZI(c42230Ghm);
        }
    }

    public static final void onChanged$16(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        C42230Ghm c42230Ghm;
        TLI tli = (TLI) aObserverS75S0200000_12.l0;
        if (tli.LJJJJ) {
            if (!tli.LJJJJI) {
                C42229Ghl c42229Ghl = tli.LJJIJLIJ;
                if (c42229Ghl != null) {
                    c42229Ghl.notifyItemChanged(0);
                    return;
                }
                return;
            }
            if (!tli.LJJJJI || (c42230Ghm = tli.LJJIL) == null) {
                return;
            }
            tli.LJJIIZI(c42230Ghm);
        }
    }

    public static final void onChanged$17(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        C42230Ghm c42230Ghm;
        TLH tlh = (TLH) aObserverS75S0200000_12.l0;
        tlh.LJJIJIL = (String) obj;
        if (tlh.LJJJJI && tlh.LJJJJIZL && tlh.LJJJJIZL && (c42230Ghm = tlh.LJJIL) != null) {
            tlh.LJJIIZI(c42230Ghm);
        }
    }

    public static final void onChanged$18(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        C42230Ghm c42230Ghm;
        TLH tlh = (TLH) aObserverS75S0200000_12.l0;
        if ((!tlh.LJJJJI || tlh.LJJJJIZL) && (c42230Ghm = tlh.LJJIL) != null) {
            tlh.LJJIIZI(c42230Ghm);
        }
    }

    public static final void onChanged$19(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        SKJ skj;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS75S0200000_12.l0;
        if ((lifecycleOwner instanceof SKJ) && (skj = (SKJ) lifecycleOwner) != null) {
            skj.Ra();
        }
        SLJ.LLD((SMX) aObserverS75S0200000_12.l1);
    }

    public static final void onChanged$2(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SME) aObserverS75S0200000_12.l0).LJLLJ = ((CommentViewModel) aObserverS75S0200000_12.l1).LJLJI.getValue();
        }
        SLJ.LLD((SME) aObserverS75S0200000_12.l0);
    }

    public static final void onChanged$20(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SMX) aObserverS75S0200000_12.l0).LJLLJ = ((DuetViewModel) aObserverS75S0200000_12.l1).LJLJI.getValue();
        }
        SLJ.LLD((SMX) aObserverS75S0200000_12.l0);
    }

    public static final void onChanged$21(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((C71963SMd) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$22(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SM5) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$23(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        AbstractC73638SvC abstractC73638SvC = (AbstractC73638SvC) obj;
        if (abstractC73638SvC == null) {
            ((InfoStickerListRecommendViewModel) aObserverS75S0200000_12.l0).gv0((List) aObserverS75S0200000_12.l1);
            return;
        }
        InterfaceC92693kP LJJII = abstractC73638SvC.LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS64S0100000_12(aObserverS75S0200000_12, 73), new AfS64S0100000_12(aObserverS75S0200000_12, 76));
        InfoStickerListRecommendViewModel infoStickerListRecommendViewModel = (InfoStickerListRecommendViewModel) aObserverS75S0200000_12.l0;
        C73318Sq2 c73318Sq2 = infoStickerListRecommendViewModel.LJLJJLL;
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            infoStickerListRecommendViewModel.LJLJJLL = c73318Sq2;
        }
        c73318Sq2.LIZ(LJJII);
    }

    public static final void onChanged$24(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((C71973SMn) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$25(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        String tabKey;
        EnumC74323TEx enumC74323TEx;
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
        if (stickerTagChangeData == null || (tabKey = stickerTagChangeData.getTabKey()) == null || tabKey.length() == 0) {
            ((TKA) aObserverS75S0200000_12.l0).LIZJ = "";
            return;
        }
        if (o.LJ(stickerTagChangeData.getTabKey(), "sticker_category:search")) {
            if (((TKA) aObserverS75S0200000_12.l0).LIZJ.length() > 0) {
                TKA tka = (TKA) aObserverS75S0200000_12.l0;
                tka.LIZ(tka.LIZJ, false).removeObserver((AObserverS80S0100000_12) aObserverS75S0200000_12.l1);
            }
            ((TKA) aObserverS75S0200000_12.l0).LIZJ = "";
            return;
        }
        if (o.LJ(stickerTagChangeData.getTabKey(), ((TKA) aObserverS75S0200000_12.l0).LIZJ)) {
            return;
        }
        if (((TKA) aObserverS75S0200000_12.l0).LIZJ.length() > 0) {
            TKA tka2 = (TKA) aObserverS75S0200000_12.l0;
            tka2.LIZ(tka2.LIZJ, false).removeObserver((AObserverS80S0100000_12) aObserverS75S0200000_12.l1);
        }
        LiveData<C74413TIj<CategoryEffectModel>> LIZ = ((TKA) aObserverS75S0200000_12.l0).LIZ(stickerTagChangeData.getTabKey(), false);
        C74413TIj<CategoryEffectModel> value = LIZ.getValue();
        EnumC74323TEx enumC74323TEx2 = null;
        if (value != null) {
            enumC74323TEx = value.LIZIZ;
        } else {
            enumC74323TEx = null;
        }
        if (enumC74323TEx != EnumC74323TEx.SUCCESS) {
            LIZ.observe(((TKA) aObserverS75S0200000_12.l0).LIZ.getLifecycleOwner(), (AObserverS80S0100000_12) aObserverS75S0200000_12.l1);
            C74413TIj<CategoryEffectModel> value2 = LIZ.getValue();
            if (value2 != null) {
                enumC74323TEx2 = value2.LIZIZ;
            }
            if (enumC74323TEx2 == EnumC74323TEx.ERROR && ((TKA) aObserverS75S0200000_12.l0).LIZLLL()) {
                ((TKA) aObserverS75S0200000_12.l0).LIZIZ().LIZ();
            }
        }
        ((TKA) aObserverS75S0200000_12.l0).LIZJ = stickerTagChangeData.getTabKey();
    }

    public static final void onChanged$26(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SM2) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$27(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        SingleLiveEvent.m149observe$lambda0((SingleLiveEvent) aObserverS75S0200000_12.l0, (Observer) aObserverS75S0200000_12.l1, obj);
    }

    public static final void onChanged$28(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        SKJ skj;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS75S0200000_12.l0;
        if ((lifecycleOwner instanceof SKJ) && (skj = (SKJ) lifecycleOwner) != null) {
            skj.Ra();
        }
        SLJ.LLD((SMZ) aObserverS75S0200000_12.l1);
    }

    public static final void onChanged$29(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SMZ) aObserverS75S0200000_12.l0).LJLLJ = ((StickerViewModel) aObserverS75S0200000_12.l1).LJLJI.getValue();
        }
        SLJ.LLD((SMZ) aObserverS75S0200000_12.l0);
    }

    public static final void onChanged$3(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SMG) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$30(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SMP) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$31(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        SKJ skj;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS75S0200000_12.l0;
        if ((lifecycleOwner instanceof SKJ) && (skj = (SKJ) lifecycleOwner) != null) {
            skj.Ra();
        }
        SLJ.LLD((SMY) aObserverS75S0200000_12.l1);
    }

    public static final void onChanged$32(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SMY) aObserverS75S0200000_12.l0).LJLLJ = ((StitchViewModel) aObserverS75S0200000_12.l1).LJLJI.getValue();
        }
        SLJ.LLD((SMY) aObserverS75S0200000_12.l0);
    }

    public static final void onChanged$33(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((C71966SMg) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$34(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        SKJ skj;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS75S0200000_12.l0;
        if ((lifecycleOwner instanceof SKJ) && (skj = (SKJ) lifecycleOwner) != null) {
            skj.Ra();
        }
        SLJ.LLD((SMW) aObserverS75S0200000_12.l1);
    }

    public static final void onChanged$35(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            SMW smw = (SMW) aObserverS75S0200000_12.l0;
            ((StoryViewModel) aObserverS75S0200000_12.l1).LJLJI.getValue();
            smw.getClass();
        }
        SLJ.LLD((SMW) aObserverS75S0200000_12.l0);
    }

    public static final void onChanged$36(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SMR) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$37(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SM7) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$38(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        TEN ten = (TEN) obj;
        if (ten != null) {
            int i = TG6.LIZIZ[ten.ordinal()];
            boolean z = false;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ((InterfaceC2068089s) aObserverS75S0200000_12.l0).show(false);
                }
            } else {
                if (((AbstractStickerView) aObserverS75S0200000_12.l1).LLFII && C74216TAu.LIZIZ.LIZIZ()) {
                    C78596Usy.LJJJLIIL(((AbstractStickerView) aObserverS75S0200000_12.l1).LLFZ, true);
                }
                ((AbstractStickerView) aObserverS75S0200000_12.l1).LLFII = true;
                ((InterfaceC2068089s) aObserverS75S0200000_12.l0).show(true);
            }
            AbstractStickerView abstractStickerView = (AbstractStickerView) aObserverS75S0200000_12.l1;
            if (ten == TEN.LOADING && !abstractStickerView.LLFF && C82894Wg6.LIZIZ.LIZJ().LIZJ()) {
                z = true;
            }
            C73296Spg c73296Spg = abstractStickerView.LLFFF;
            if (c73296Spg != null) {
                C87277YNd.LJJIJIIJI(c73296Spg, z);
            }
        }
    }

    public static final void onChanged$39(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SMA) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$4(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((C71955SLv) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$40(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        OSJ osj = (OSJ) obj;
        if (osj != null) {
            C74266TCs c74266TCs = (C74266TCs) aObserverS75S0200000_12.l0;
            EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) aObserverS75S0200000_12.l1;
            Object first = osj.getFirst();
            int LJLZ = c74266TCs.LJLZ(first);
            if (LJLZ >= 0) {
                effectTemplateCategoryFragment.getClass();
                c74266TCs.notifyItemChanged(LJLZ + 1, first);
            }
        }
    }

    public static final void onChanged$41(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            num.intValue();
            ((QAInviteViewModel) aObserverS75S0200000_12.l1).LJLJL.setValue(((InterfaceC88471Ynr) aObserverS75S0200000_12.l0).invoke(((QAInviteViewModel) aObserverS75S0200000_12.l1).LJLJL.getValue(), num));
        }
    }

    public static final void onChanged$42(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SM0) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$43(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SMJ) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$44(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((SMN) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$45(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        CategoryEffectModel categoryEffectModel;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && (categoryEffectModel = (CategoryEffectModel) c74413TIj.LIZ) != null) {
            C74310TEk.LIZ(((TFB) aObserverS75S0200000_12.l1).LJLILLLLZI.LJJJJLL().LIZ(), ((CategoryEffectModel) aObserverS75S0200000_12.l0).getCategoryKey(), false, 14).removeObserver(aObserverS75S0200000_12);
            SearchStickerViewModel searchStickerViewModel = ((TFB) aObserverS75S0200000_12.l1).LJLIL;
            searchStickerViewModel.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new TFA(searchStickerViewModel, categoryEffectModel, null), 3);
        }
    }

    public static final void onChanged$46(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((C71961SMb) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$47(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (!O3U.LIZ(OI6.LIZ, "ug_resource")) {
            OI6.LIZIZ(new C72725SgT((C208298Fl) aObserverS75S0200000_12.l1));
        }
        ((DialogC72721SgP) aObserverS75S0200000_12.l0).LJJIJIIJI();
        List<InterfaceC72668SfY> gv0 = ((DialogC72721SgP) aObserverS75S0200000_12.l0).LJJIII().gv0(((DialogC72721SgP) aObserverS75S0200000_12.l0).LJLLJ);
        C72724SgS c72724SgS = ((DialogC72721SgP) aObserverS75S0200000_12.l0).LLF;
        if (c72724SgS != null) {
            c72724SgS.LJLJI = gv0;
            c72724SgS.notifyDataSetChanged();
        }
        if (gv0 == null) {
            C208298Fl c208298Fl = (C208298Fl) aObserverS75S0200000_12.l1;
            c208298Fl.getClass();
            c208298Fl.post(new ARunnableS39S0100000_3(c208298Fl, 8));
        }
    }

    public static final void onChanged$48(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        T4A t4a = (T4A) aObserverS75S0200000_12.l0;
        T4I t4i = (T4I) aObserverS75S0200000_12.l1;
        t4a.getClass();
        Object first = ((OSJ) obj).getFirst();
        int L4 = t4i.L4(first);
        if (L4 >= 0) {
            t4a.LIZIZ.notifyItemChanged(L4, first);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$49(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        List texts;
        List<C74125T7h> list;
        C74141T7x c74141T7x;
        String str;
        if (((C74100T6i) obj).LIZ == KKR.SUCCESS) {
            C74100T6i c74100T6i = (C74100T6i) ((QnaSuggestedTabViewModel) aObserverS75S0200000_12.l0).LJLL.getValue();
            texts = null;
            texts = null;
            if (c74100T6i != null && (list = (List) c74100T6i.LIZ) != null) {
                ArrayList arrayList = new ArrayList();
                for (C74125T7h c74125T7h : list) {
                    if ((c74125T7h instanceof C74141T7x) && (c74141T7x = (C74141T7x) c74125T7h) != null && (str = c74141T7x.LJFF) != null) {
                        arrayList.add(str);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                texts = arrayList;
                if (isEmpty) {
                    String string = EF7.LIZIZ().getString(R.string.g58);
                    o.LJIIIIZZ(string, "ctx.getString(R.string.eoy_qa_page_entry_string)");
                    texts = C47261Igj.LJJIJ(string);
                }
            }
        } else {
            String string2 = EF7.LIZIZ().getString(R.string.g58);
            o.LJIIIIZZ(string2, "ctx.getString(R.string.eoy_qa_page_entry_string)");
            texts = C47261Igj.LJJIJ(string2);
        }
        T8U t8u = (T8U) aObserverS75S0200000_12.l1;
        if (t8u != null) {
            o.LJIIIZ(texts, "texts");
            if (texts.isEmpty()) {
                return;
            }
            T8V t8v = t8u.LJLILLLLZI;
            t8v.LIZ().removeCallbacks((Runnable) t8v.LJIIIZ.getValue());
            t8v.LIZJ = true;
            T8V t8v2 = t8u.LJLILLLLZI;
            t8v2.LJ = C61328O5c.LJ(texts);
            t8v2.LJFF = -1;
            t8u.LJLILLLLZI.LIZIZ(0L);
        }
    }

    public static final void onChanged$5(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        if (((com.ss.android.ugc.aweme.comment.viewmodel.SingleLiveEvent) aObserverS75S0200000_12.l0).pending.compareAndSet(true, false)) {
            ((Observer) aObserverS75S0200000_12.l1).onChanged(obj);
        }
    }

    public static final void onChanged$50(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        ((C71957SLx) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$6(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        String str = (String) obj;
        if (str != null) {
            C34K c34k = (C34K) aObserverS75S0200000_12.l0;
            AgeGateConfirmationFragment ageGateConfirmationFragment = (AgeGateConfirmationFragment) aObserverS75S0200000_12.l1;
            c34k.element = true;
            ageGateConfirmationFragment._$_findCachedViewById(R.id.bqz).setVisibility(8);
            ageGateConfirmationFragment._$_findCachedViewById(R.id.cyh).setVisibility(0);
            ((TextView) ageGateConfirmationFragment._$_findCachedViewById(R.id.cyr)).setText(str);
            ((SY4) ageGateConfirmationFragment._$_findCachedViewById(R.id.b1t)).setEnabled(false);
        }
    }

    public static final void onChanged$7(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        Integer it = (Integer) obj;
        ((SGP) aObserverS75S0200000_12.l0).notifyDataSetChanged();
        ViewPager viewPager = (ViewPager) ((AgeGateExistingStartFragment) aObserverS75S0200000_12.l1)._$_findCachedViewById(R.id.n9y);
        int currentItem = ((ViewPager) ((AgeGateExistingStartFragment) aObserverS75S0200000_12.l1)._$_findCachedViewById(R.id.n9y)).getCurrentItem();
        o.LJIIIIZZ(it, "it");
        viewPager.setCurrentItem(it.intValue() + currentItem);
    }

    public static final void onChanged$8(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        Integer it = (Integer) obj;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        Keva keva = C63025OoP.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("comment_dislike_filter_offensive_");
        LIZ.append(C71945SLl.LIZIZ());
        keva.storeInt(X1D.LIZIZ(LIZ), intValue);
        ((C71939SLf) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public static final void onChanged$9(AObserverS75S0200000_12 aObserverS75S0200000_12, Object obj) {
        Integer it = (Integer) obj;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        Keva keva = C63025OoP.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("comment_dislike_filter_profanity_");
        LIZ.append(C71945SLl.LIZIZ());
        keva.storeInt(X1D.LIZIZ(LIZ), intValue);
        ((C71939SLf) aObserverS75S0200000_12.l0).LLF((SKZ) aObserverS75S0200000_12.l1, null);
    }

    public AObserverS75S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
