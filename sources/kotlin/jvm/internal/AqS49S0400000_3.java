package kotlin.jvm.internal;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2V;
import X.ARN;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C00F;
import X.C16880lQ;
import X.C175496uf;
import X.C175506ug;
import X.C175516uh;
import X.C175886vI;
import X.C177336xd;
import X.C188497aX;
import X.C188727au;
import X.C189487c8;
import X.C191327f6;
import X.C191337f7;
import X.C192217gX;
import X.C1DH;
import X.C200617u5;
import X.C2068389v;
import X.C209988Ly;
import X.C211248Qu;
import X.C218158hH;
import X.C224258r7;
import X.C226108u6;
import X.C227768wm;
import X.C228108xK;
import X.C228118xL;
import X.C228228xW;
import X.C229258zB;
import X.C2298890m;
import X.C25840ACe;
import X.C26338AVi;
import X.C2NU;
import X.C32I;
import X.C34K;
import X.C38306F1q;
import X.C3A5;
import X.C3C1;
import X.C3C5;
import X.C3C7;
import X.C3C8;
import X.C43I;
import X.C55723Ltv;
import X.C56509MFt;
import X.C56892Ld;
import X.C61878OQg;
import X.C65777Prh;
import X.C68322mC;
import X.C72242sW;
import X.C72912tb;
import X.C72922tc;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76732zl;
import X.C76800UCe;
import X.C78685UuP;
import X.C79043V0l;
import X.C88545Yp3;
import X.C8DU;
import X.C8NF;
import X.C8O4;
import X.C8O8;
import X.C8O9;
import X.C8OA;
import X.C8OB;
import X.C8OC;
import X.C8OD;
import X.C8OE;
import X.C8OF;
import X.C8VL;
import X.C8VR;
import X.C8VZ;
import X.C8YM;
import X.C90R;
import X.FMX;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.JBR;
import X.ORZ;
import X.Q8U;
import X.RBX;
import X.SY4;
import X.TCM;
import X.UC0;
import X.X1D;
import X.Z9N;
import Y.ARunnableS14S0300000_3;
import Y.ARunnableS1S0500000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentGiftSelectAssem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideComponent;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfig;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class AqS49S0400000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(List<C192217gX> it) {
        String str;
        String string;
        o.LJIIIZ(it, "it");
        if (it.isEmpty()) {
            ((View) this.l0).setVisibility(8);
            C73305Spp c73305Spp = (C73305Spp) this.l1;
            C73306Spq c73306Spq = new C73306Spq();
            String string2 = ((Context) this.l2).getString(R.string.gbh);
            o.LJIIIIZZ(string2, "context.getString(R.stri…select_videos_none_title)");
            c73306Spq.LJFF = string2;
            String string3 = ((Context) this.l2).getString(R.string.gbg);
            o.LJIIIIZZ(string3, "context.getString(R.stri…_select_videos_none_desc)");
            c73306Spq.LJI = string3;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_bookmark;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73305Spp.setStatus(c73306Spq);
            ((C73305Spp) this.l1).setVisibility(0);
        } else {
            ((View) this.l0).setVisibility(0);
            ((C73305Spp) this.l1).setVisibility(8);
        }
        ArrayList arrayList = new ArrayList();
        for (C192217gX c192217gX : it) {
            if (c192217gX.LJLILLLLZI == 2) {
                arrayList.add(c192217gX);
            }
        }
        ((SY4) this.l3).setEnabled(!arrayList.isEmpty());
        SY4 sy4 = (SY4) this.l3;
        Context context = (Context) this.l2;
        if (context != null && (string = context.getString(R.string.gbb)) != null) {
            str = Q8U.LIZIZ(new Object[]{String.valueOf(arrayList.size())}, 1, string, "format(this, *args)");
        } else {
            str = null;
        }
        sy4.setText(str);
    }

    public final void invoke$1(Assembler assemble) {
        o.LJIIIZ(assemble, "$this$assemble");
        ((ReusedUIAssem) this.l0).setContainerView((View) this.l1);
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) this.l0;
        if (reusedUIAssem instanceof ReusedUISlotAssem) {
            if (!(((C8VZ) this.l2) instanceof AssemPowerCell)) {
                View view = (View) this.l1;
                if ((view instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) reusedUIAssem;
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), reusedUISlotAssem.W3(), viewGroup, false);
                    if (LLLLIILL != null) {
                        viewGroup.addView(LLLLIILL);
                        reusedUISlotAssem.LJZL = LLLLIILL;
                    }
                }
            } else {
                ReusedUISlotAssem reusedUISlotAssem2 = (ReusedUISlotAssem) reusedUIAssem;
                View view2 = (View) this.l1;
                reusedUISlotAssem2.getClass();
                o.LJIIIZ(view2, "<set-?>");
                reusedUISlotAssem2.LJZL = view2;
            }
        }
        ReusedUIAssem reusedUIAssem2 = (ReusedUIAssem) this.l0;
        reusedUIAssem2.LJLLL = true;
        AssemSupervisor lv0 = assemble.lv0((LifecycleOwner) this.l3);
        if (lv0 != null) {
            reusedUIAssem2.setSupervisor(lv0);
            ((ReusedUIAssem) this.l0).setParent((C8VZ) this.l2);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final Object invoke$0(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        Set set = (Set) aqS49S0400000_3.l0;
        return C175886vI.LIZ(setState, null, null, null, new C43I(new C175496uf(((C76732zl) aqS49S0400000_3.l3).element, (Map) aqS49S0400000_3.l1, (Map) aqS49S0400000_3.l2, set)), null, false, 55);
    }

    public static final Object invoke$1(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        Set set = (Set) aqS49S0400000_3.l0;
        return C175886vI.LIZ(setState, null, null, null, new C43I(new C175506ug(20004, ((C76732zl) aqS49S0400000_3.l3).element, (Map) aqS49S0400000_3.l1, (Map) aqS49S0400000_3.l2, set)), null, false, 55);
    }

    public static final Object invoke$10(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        Aweme aweme;
        String str;
        GiftStruct giftStruct;
        MutableLiveData<GiftStruct> jv0;
        ARN actionEventArgs = (ARN) obj;
        o.LJIIIZ(actionEventArgs, "actionEventArgs");
        actionEventArgs.LIZJ = true;
        FragmentManager supportFragmentManager = ((ActivityC45651qj) aqS49S0400000_3.l0).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        C188497aX.LIZ((ActivityC45651qj) aqS49S0400000_3.l0, ((GiftStruct) aqS49S0400000_3.l1).getDiamondCount(), (GiftViewModel) aqS49S0400000_3.l2, supportFragmentManager, false);
        CommentGiftSelectAssem commentGiftSelectAssem = (CommentGiftSelectAssem) aqS49S0400000_3.l3;
        C177336xd I3 = commentGiftSelectAssem.I3();
        Long l = null;
        if (I3 != null) {
            aweme = I3.LJLLI;
        } else {
            aweme = null;
        }
        C177336xd I32 = commentGiftSelectAssem.I3();
        if (I32 != null) {
            str = I32.LJLJJLL;
        } else {
            str = null;
        }
        GiftViewModel H3 = commentGiftSelectAssem.H3();
        if (H3 != null && (jv0 = H3.jv0()) != null) {
            giftStruct = jv0.getValue();
        } else {
            giftStruct = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        commentGiftSelectAssem.I3();
        c188727au.LJIIIZ("enter_method", null);
        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(aweme));
        if (giftStruct != null) {
            l = Long.valueOf(giftStruct.getId());
        }
        c188727au.LJFF(l, "gift_id");
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
        FMX.LJIIL("click_comment_recharge_popup", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        BaseFeedPageParams baseFeedPageParams = ((C8O4) aqS49S0400000_3.l0).LJ;
        if (baseFeedPageParams != null) {
            CellConfig cellConfig = (CellConfig) aqS49S0400000_3.l1;
            View view = (View) aqS49S0400000_3.l2;
            cellConfig.getClass();
            InteractAreaComponent interactAreaComponent = new InteractAreaComponent();
            View findViewById = view.findViewById(R.id.niu);
            o.LJIIIIZZ(findViewById, "parentView.findViewById(R.id.widget_container)");
            interactAreaComponent.LL = findViewById;
            interactAreaComponent.LLD = baseFeedPageParams;
            cellConfig.LJLIL = interactAreaComponent;
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, new AqS169S0100000_3((CellConfig) aqS49S0400000_3.l1, 777));
        }
        if (C226108u6.LIZ()) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, new AqS169S0100000_3(new CellGradualComponent(), 778));
        }
        if (C90R.LIZ()) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, new AqS169S0100000_3((CellConfig) aqS49S0400000_3.l1, 779));
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8O9.LJLIL);
        }
        if (C224258r7.LIZIZ) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8OA.LJLIL);
        }
        if (C2298890m.LIZ()) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8OE.LJLIL);
        }
        assemble.qv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8NF.LJLIL);
        TCM.LJIILJJIL(assemble, (BaseCellContentComponent) aqS49S0400000_3.l3, new AqS169S0100000_3((View) aqS49S0400000_3.l2, 780));
        if (baseFeedPageParams != null && Z9N.LIZIZ.LJJIIZI(baseFeedPageParams.eventType)) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8OF.LJLIL);
        }
        CommentService.LIZ.getClass();
        if (CommentServiceImpl.LJJL().LJJIJIIJIL(Integer.MAX_VALUE) || C25840ACe.LIZIZ != 0) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8OC.LJLIL);
        }
        assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8O8.LJLIL);
        if (C56509MFt.LJIIJ(((BaseCellContentComponent) aqS49S0400000_3.l3).a1().LIZIZ())) {
            EcVideoGuideComponent LLILLIZIL = ECommerceMallService.v3().LLILLIZIL();
            if ((LLILLIZIL instanceof BaseCellTriggerComponent) && LLILLIZIL != null) {
                TCM.LJIILJJIL(assemble, (BaseCellContentComponent) aqS49S0400000_3.l3, new AqS134S0200000_3((BaseCellTriggerComponent) LLILLIZIL, (BaseCellTriggerComponent<? extends C3C8>) aqS49S0400000_3.l2, (View) 227));
            }
        }
        if (C8OB.LIZ()) {
            TCM.LJIILJJIL(assemble, (BaseCellContentComponent) aqS49S0400000_3.l3, C209988Ly.LJLIL);
        }
        if (C56892Ld.LIZ()) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, C8OD.LJLIL);
        }
        InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> castingCellComponent = C88545Yp3.LIZIZ.LIZLLL().getCastingCellComponent();
        if (castingCellComponent != null) {
            assemble.rv0((BaseCellContentComponent) aqS49S0400000_3.l3, new AqS169S0100000_3(castingCellComponent, (InterfaceC65350Pko<? extends UISlotAssem>) 776));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        AbstractC72932td async = (AbstractC72932td) obj;
        o.LJIIIZ(async, "async");
        C3C8 actualReceiver = ((InterfaceC212848Wy) aqS49S0400000_3.l0).getActualReceiver();
        if (actualReceiver != null) {
            C8VR.LIZIZ(actualReceiver, new C3C7(async, (InterfaceC88472Yns) aqS49S0400000_3.l1, (InterfaceC88471Ynr) aqS49S0400000_3.l2, (InterfaceC88471Ynr) aqS49S0400000_3.l3, actualReceiver));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        AbstractC72932td async = (AbstractC72932td) obj;
        o.LJIIIZ(async, "async");
        C3C8 receiverForHostVM = ((C8YM) aqS49S0400000_3.l0).getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = ((C8YM) aqS49S0400000_3.l0).getActualReceiverHolder().getActualReceiver()) != null) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS49S0400000_3.l1;
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS49S0400000_3.l2;
            InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) aqS49S0400000_3.l3;
            if (async instanceof C72922tc) {
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(receiverForHostVM);
                }
            } else if (async instanceof C3C1) {
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(receiverForHostVM, ((C3C1) async).LIZ);
                }
            } else if ((async instanceof C72912tb) && interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(receiverForHostVM, ((C72912tb) async).LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS49S0400000_3 aqS49S0400000_3, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC65784Pro) aqS49S0400000_3.l0).invoke();
        ((C191327f6) aqS49S0400000_3.l1).LJLJI = ((C8DU) aqS49S0400000_3.l2).LJJJI();
        C8DU c8du = (C8DU) aqS49S0400000_3.l2;
        c8du.LJJIZ(new AqS107S0300000_3((C191327f6) aqS49S0400000_3.l1, c8du, (C191337f7) aqS49S0400000_3.l3, 35));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        C8DU iMap = (C8DU) obj;
        o.LJIIIZ(iMap, "iMap");
        C191327f6 c191327f6 = (C191327f6) aqS49S0400000_3.l0;
        c191327f6.post(new ARunnableS1S0500000_3(c191327f6, (C191337f7) aqS49S0400000_3.l1, iMap, (InterfaceC65784Pro) aqS49S0400000_3.l2, (InterfaceC65784Pro) aqS49S0400000_3.l3, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        Aweme aweme = (Aweme) obj;
        o.LJIIIZ(aweme, "aweme");
        Aweme aweme2 = (Aweme) aqS49S0400000_3.l0;
        if (aweme2 != null && o.LJ(aweme2.getAid(), aweme.getAid()) && ((Aweme) aqS49S0400000_3.l0).getInteractionTagInfo() != null) {
            InteractionTagInfo interactionTagInfo = ((Aweme) aqS49S0400000_3.l0).getInteractionTagInfo();
            if (interactionTagInfo != null) {
                interactionTagInfo.setVideoLabelText("");
            }
            C211248Qu c211248Qu = (C211248Qu) aqS49S0400000_3.l1;
            Aweme aweme3 = (Aweme) aqS49S0400000_3.l0;
            C1DH.LJJIJIIJI(new ARunnableS14S0300000_3((Fragment) aqS49S0400000_3.l3, (VideoViewCell) aqS49S0400000_3.l2, aweme3, c211248Qu, 9));
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        aqS49S0400000_3.invoke$1((Assembler) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public static final Object invoke$18(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        List list;
        C228228xW it = (C228228xW) obj;
        o.LJIIIZ(it, "it");
        List<Aweme> list2 = it.LJLIL;
        C68322mC c68322mC = new C68322mC();
        ?? arrayList = new ArrayList();
        c68322mC.element = arrayList;
        if (list2 != null) {
            List list3 = (List) aqS49S0400000_3.l3;
            MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) aqS49S0400000_3.l0;
            UC0.LIZLLL(arrayList, ORZ.LLJI(list2));
            ArrayList arrayList2 = (ArrayList) c68322mC.element;
            if (list3 != null) {
                list = ORZ.LLJI(list3);
            } else {
                list = null;
            }
            UC0.LIZLLL(arrayList2, list);
            if (!mixVideosManageViewModel.LJLJJL && C00F.LIZ(31744, 0, "playlist_reverse_order", true) == 1) {
                UC0.LIZLLL((ArrayList) c68322mC.element, it.LJLJJLL);
            }
        }
        ((MixVideosManageViewModel) aqS49S0400000_3.l0).setState(new AqS169S0100000_3(c68322mC, (C68322mC<List<Aweme>>) 993));
        if (((MixVideosManageViewModel) aqS49S0400000_3.l0).LJLJJL) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS49S0400000_3.l1;
            A2F a2f = A2G.LIZ;
            Long valueOf = Long.valueOf(((MixVideosResponse) aqS49S0400000_3.l2).maxCursor);
            List list4 = (List) aqS49S0400000_3.l3;
            o.LJI(list4);
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C228108xK((Aweme) it2.next()));
            }
            A2V LJ = A2F.LJ(a2f, null, valueOf, arrayList3, 1);
            C3C5.m7constructorimpl(LJ);
            interfaceC67352kd.resumeWith(LJ);
        } else {
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) aqS49S0400000_3.l1;
            A2H LIZIZ = A2F.LIZIZ(A2G.LIZ);
            C3C5.m7constructorimpl(LIZIZ);
            interfaceC67352kd2.resumeWith(LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, new C43I(new C175516uh(10006, (Exception) ((Throwable) aqS49S0400000_3.l0), (Set) aqS49S0400000_3.l1, (Map) aqS49S0400000_3.l2, ((C76732zl) aqS49S0400000_3.l3).element)), null, null, false, 59);
    }

    public static final Object invoke$3(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        int ov0;
        C189487c8 setState = (C189487c8) obj;
        o.LJIIIZ(setState, "$this$setState");
        Aweme aweme = (Aweme) aqS49S0400000_3.l0;
        if (aweme == null) {
            aweme = C55723Ltv.LIZIZ.LJIL().LJI();
        }
        StoryFeedViewModel storyFeedViewModel = (StoryFeedViewModel) aqS49S0400000_3.l1;
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "myStoryCollection.authorUid");
        storyFeedViewModel.Fv0(aweme, authorUid);
        ((StoryGalleryListViewModel) aqS49S0400000_3.l2).LJLJJI = aweme.getUserStory();
        StoryFeedViewModel storyFeedViewModel2 = (StoryFeedViewModel) aqS49S0400000_3.l1;
        ((StoryGalleryListViewModel) aqS49S0400000_3.l2).getClass();
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(uid, "uid");
        List<Aweme> qv0 = storyFeedViewModel2.qv0(uid);
        if (qv0 == null) {
            qv0 = C61878OQg.INSTANCE;
        }
        Aweme aweme2 = (Aweme) aqS49S0400000_3.l3;
        if (aweme2 != null) {
            Integer valueOf = Integer.valueOf(qv0.indexOf(aweme2));
            if (valueOf.intValue() >= 0) {
                ov0 = valueOf.intValue();
                return ((StoryGalleryListViewModel) aqS49S0400000_3.l2).iv0(setState, qv0, ov0, new C43I<>(Integer.valueOf(ov0)));
            }
        }
        StoryFeedViewModel storyFeedViewModel3 = (StoryFeedViewModel) aqS49S0400000_3.l1;
        String authorUid2 = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid2, "myStoryCollection.authorUid");
        ov0 = storyFeedViewModel3.ov0(authorUid2, qv0);
        return ((StoryGalleryListViewModel) aqS49S0400000_3.l2).iv0(setState, qv0, ov0, new C43I<>(Integer.valueOf(ov0)));
    }

    public static final Object invoke$4(AqS49S0400000_3 aqS49S0400000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        Object obj = aqS49S0400000_3.l0;
        o.LJII(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<S of com.bytedance.assem.arch.viewModel.AssemViewModel, kotlin.Any?, kotlin.collections.List<kotlin.Any?>?{ com.bytedance.assem.arch.reused.IListItemKt.AssemPayLoads }, S of com.bytedance.assem.arch.viewModel.AssemViewModel>");
        C65777Prh.LJ(3, obj);
        Object invoke = ((InterfaceC88473Ynt) obj).invoke(setState, aqS49S0400000_3.l1, (List) aqS49S0400000_3.l2);
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS49S0400000_3.l3;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(aqS49S0400000_3.l1, (List) aqS49S0400000_3.l2);
        }
        return invoke;
    }

    public static final Object invoke$5(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.hv0((DetailPageContainerAssem) aqS49S0400000_3.l0, (List) aqS49S0400000_3.l1);
        C79043V0l.LIZJ((DetailPageContainerAssem) aqS49S0400000_3.l0, new AqS134S0200000_3((Map) aqS49S0400000_3.l2, (Map<String, C8VL>) aqS49S0400000_3.l3, (List<String>) 37));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        aqS49S0400000_3.invoke$0((List) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        C38306F1q c38306F1q;
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        ((ImageView) ((View) aqS49S0400000_3.l0)).setVisibility(8);
        ((C73305Spp) aqS49S0400000_3.l1).setVisibility(0);
        if (C2NU.LIZ.LIZIZ()) {
            if ((it instanceof C38306F1q) && (c38306F1q = (C38306F1q) it) != null && c38306F1q.getErrorCode() == 7) {
                C26338AVi.LJI((C73305Spp) aqS49S0400000_3.l1, null, 0, null, null, false, 29);
                C73305Spp c73305Spp = (C73305Spp) aqS49S0400000_3.l1;
                C73306Spq c73306Spq = new C73306Spq();
                String string = ((Context) aqS49S0400000_3.l2).getString(R.string.dgw);
                o.LJIIIIZZ(string, "context.getString(R.stri…ction_not_availble_error)");
                c73306Spq.LJFF = string;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_favorites_collection;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                c73305Spp.setStatus(c73306Spq);
            } else {
                C73305Spp c73305Spp2 = (C73305Spp) aqS49S0400000_3.l1;
                C73306Spq c73306Spq2 = new C73306Spq();
                C73312Spw.LJIIJ(c73306Spq2, new AqS153S0100000_3((CollectionContentManageAssem) aqS49S0400000_3.l3, 266));
                c73305Spp2.setStatus(c73306Spq2);
            }
            return C76800UCe.LIZ;
        }
        C73305Spp c73305Spp3 = (C73305Spp) aqS49S0400000_3.l1;
        C73306Spq c73306Spq3 = new C73306Spq();
        C73312Spw.LJI(c73306Spq3, new AqS153S0100000_3((CollectionContentManageAssem) aqS49S0400000_3.l3, 267));
        c73305Spp3.setStatus(c73306Spq3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS49S0400000_3 aqS49S0400000_3, Object obj) {
        C200617u5 setState = (C200617u5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C200617u5.LIZ(setState, ((VideoDiggVM) aqS49S0400000_3.l0).lv0(((C72242sW) aqS49S0400000_3.l1).element, (Aweme) aqS49S0400000_3.l2, ((C34K) aqS49S0400000_3.l3).element), null, null, null, 29);
    }

    public static final Object invoke$9(AqS49S0400000_3 aqS49S0400000_3, Object it) {
        String str;
        Aweme aweme;
        Long valueOf;
        Aweme aweme2;
        String str2;
        String str3;
        o.LJIIIZ(it, "it");
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS49S0400000_3.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        C218158hH c218158hH = C3A5.LIZ;
        LogPbBean logPbBean = mixVideosResponse.logPb;
        Long l = null;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        c218158hH.LJFF(str, ((MixVideosResponse) aqS49S0400000_3.l0).logPb);
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list != null) {
                    aweme2 = (Aweme) ListProtector.get(list, i);
                } else {
                    aweme2 = null;
                }
                Aweme R1 = AwemeService.LIZ().R1(aweme2);
                IRequestIdService LJ = RequestIdService.LJ();
                StringBuilder LIZ = X1D.LIZ();
                if (R1 != null) {
                    str2 = R1.getAid();
                } else {
                    str2 = null;
                }
                String LJFF = JBR.LJFF(LIZ, str2, "19", LIZ);
                LogPbBean logPbBean2 = ((MixVideosResponse) aqS49S0400000_3.l0).logPb;
                if (logPbBean2 != null) {
                    str3 = logPbBean2.getImprId();
                } else {
                    str3 = null;
                }
                LJ.LIZJ(i, LJFF, str3);
            }
        }
        C76732zl c76732zl = (C76732zl) aqS49S0400000_3.l1;
        int i2 = c76732zl.element;
        if (i2 == 4) {
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS49S0400000_3.l2;
            MixVideosResponse mixVideosResponse2 = (MixVideosResponse) aqS49S0400000_3.l0;
            mixVideosViewModel.LJLJLLL = mixVideosResponse2.hasMoreLadBefore;
            mixVideosViewModel.LJLL = mixVideosResponse2.hasMoreLoadMore;
        } else if (i2 == 1) {
            ((MixVideosViewModel) aqS49S0400000_3.l2).LJLL = ((MixVideosResponse) aqS49S0400000_3.l0).hasMore;
        } else if (i2 == 2) {
            MixVideosViewModel mixVideosViewModel2 = (MixVideosViewModel) aqS49S0400000_3.l2;
            if (mixVideosViewModel2.LLD) {
                mixVideosViewModel2.LJLJLLL = ((MixVideosResponse) aqS49S0400000_3.l0).hasMore;
                mixVideosViewModel2.LJLL = false;
                c76732zl.element = 1;
            }
        }
        MixVideosViewModel mixVideosViewModel3 = (MixVideosViewModel) aqS49S0400000_3.l2;
        MixVideosResponse mixVideosResponse3 = (MixVideosResponse) aqS49S0400000_3.l0;
        mixVideosViewModel3.LJLLI = mixVideosResponse3.minCursor;
        mixVideosViewModel3.LJLLILLLL = mixVideosResponse3.maxCursor;
        List<? extends Aweme> list2 = mixVideosResponse3.mixVideos;
        if (list2 == null || list2.isEmpty()) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS49S0400000_3.l3;
            A2F a2f = A2G.LIZ;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            a2f.getClass();
            A2H LIZ2 = A2F.LIZ(c61878OQg);
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd.resumeWith(LIZ2);
            ((MixVideosViewModel) aqS49S0400000_3.l2).setState(C229258zB.LJLIL);
        } else {
            MixVideosViewModel mixVideosViewModel4 = (MixVideosViewModel) aqS49S0400000_3.l2;
            Aweme aweme3 = mixVideosViewModel4.LJLJJLL;
            if (aweme3 != null) {
                mixVideosViewModel4.tv0(aweme3);
            } else if (!list2.isEmpty()) {
                if ((C228118xL.LIZ() || C228118xL.LIZJ()) && C78685UuP.LJJJZ(((MixVideosViewModel) aqS49S0400000_3.l2).nv0())) {
                    MixVideosViewModel mixVideosViewModel5 = (MixVideosViewModel) aqS49S0400000_3.l2;
                    Iterator<? extends Aweme> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            aweme = it2.next();
                            if (o.LJ(aweme.getAid(), mixVideosViewModel5.nv0())) {
                                break;
                            }
                        } else {
                            aweme = null;
                            break;
                        }
                    }
                    Aweme aweme4 = aweme;
                    if (aweme4 != null) {
                        ((MixVideosViewModel) aqS49S0400000_3.l2).tv0(aweme4);
                    } else {
                        MixVideosViewModel mixVideosViewModel6 = (MixVideosViewModel) aqS49S0400000_3.l2;
                        if (mixVideosViewModel6.LLD && mixVideosViewModel6.LLF > 1) {
                            mixVideosViewModel6.LJLJLLL = ((MixVideosResponse) aqS49S0400000_3.l0).hasMore;
                            mixVideosViewModel6.LJLL = false;
                            ((C76732zl) aqS49S0400000_3.l1).element = 1;
                            mixVideosViewModel6.tv0((Aweme) ORZ.LLFF(list2));
                        } else {
                            mixVideosViewModel6.tv0((Aweme) ListProtector.get(list2, 0));
                        }
                    }
                } else {
                    MixVideosViewModel mixVideosViewModel7 = (MixVideosViewModel) aqS49S0400000_3.l2;
                    if (mixVideosViewModel7.LLD && mixVideosViewModel7.LLF > 1) {
                        mixVideosViewModel7.LJLJLLL = ((MixVideosResponse) aqS49S0400000_3.l0).hasMore;
                        mixVideosViewModel7.LJLL = false;
                        ((C76732zl) aqS49S0400000_3.l1).element = 1;
                        mixVideosViewModel7.tv0((Aweme) ORZ.LLFF(list2));
                    } else {
                        mixVideosViewModel7.tv0((Aweme) ListProtector.get(list2, 0));
                    }
                }
            }
            MixVideosViewModel mixVideosViewModel8 = (MixVideosViewModel) aqS49S0400000_3.l2;
            if (!mixVideosViewModel8.LJLL) {
                if (mixVideosViewModel8.LJLJLLL) {
                    valueOf = null;
                } else {
                    InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) aqS49S0400000_3.l3;
                    A2F a2f2 = A2G.LIZ;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                    Iterator<? extends Aweme> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C228108xK(it3.next()));
                    }
                    a2f2.getClass();
                    A2H LIZ3 = A2F.LIZ(arrayList);
                    C3C5.m7constructorimpl(LIZ3);
                    interfaceC67352kd2.resumeWith(LIZ3);
                }
            } else {
                valueOf = Long.valueOf(((MixVideosResponse) aqS49S0400000_3.l0).maxCursor);
            }
            if (((MixVideosViewModel) aqS49S0400000_3.l2).LJLJLLL) {
                l = Long.valueOf(((MixVideosResponse) aqS49S0400000_3.l0).minCursor);
            }
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) aqS49S0400000_3.l3;
            A2F a2f3 = A2G.LIZ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<? extends Aweme> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(new C228108xK(it4.next()));
            }
            a2f3.getClass();
            A2V LIZLLL = A2F.LIZLLL(l, valueOf, arrayList2);
            C3C5.m7constructorimpl(LIZLLL);
            interfaceC67352kd3.resumeWith(LIZLLL);
        }
        if (list != null) {
            ((MixVideosViewModel) aqS49S0400000_3.l2).setState(new AqS134S0200000_3((List) list, (List<? extends Aweme>) aqS49S0400000_3.l1, (C76732zl) 98));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(ActivityC45651qj activityC45651qj, GiftStruct giftStruct, GiftViewModel giftViewModel, CommentGiftSelectAssem commentGiftSelectAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = giftStruct;
        this.l2 = giftViewModel;
        this.l3 = commentGiftSelectAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(C191327f6 c191327f6, C191337f7 c191337f7, AqS153S0100000_3 aqS153S0100000_3, AqS92S0300000_3 aqS92S0300000_3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c191327f6;
        this.l1 = c191337f7;
        this.l2 = aqS153S0100000_3;
        this.l3 = aqS92S0300000_3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(C8O4 c8o4, C8O4 c8o42, CellConfig cellConfig, View view, BaseCellContentComponent<? extends C3C8> baseCellContentComponent) {
        super(1);
        this.$t = baseCellContentComponent;
        this.l0 = c8o4;
        this.l1 = c8o42;
        this.l2 = cellConfig;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(InterfaceC212848Wy interfaceC212848Wy, InterfaceC212848Wy<? extends RECEIVER> interfaceC212848Wy2, InterfaceC88472Yns<? super RECEIVER, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super RECEIVER, ? super T, C76800UCe> interfaceC88471Ynr2) {
        super(1);
        this.$t = interfaceC88471Ynr2;
        this.l0 = interfaceC212848Wy;
        this.l1 = interfaceC212848Wy2;
        this.l2 = interfaceC88472Yns;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(C8YM c8ym, C8YM<RECEIVER> c8ym2, InterfaceC88472Yns<? super RECEIVER, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super RECEIVER, ? super T, C76800UCe> interfaceC88471Ynr2) {
        super(1);
        this.$t = interfaceC88471Ynr2;
        this.l0 = c8ym;
        this.l1 = c8ym2;
        this.l2 = interfaceC88472Yns;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, C191327f6 c191327f6, C8DU c8du, C191337f7 c191337f7) {
        super(1);
        this.$t = c191337f7;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = c191327f6;
        this.l3 = c8du;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(View view, C73305Spp c73305Spp, Context context, SY4 sy4, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = c73305Spp;
        this.l2 = context;
        this.l3 = sy4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(View view, C73305Spp c73305Spp, Context context, CollectionContentManageAssem collectionContentManageAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = c73305Spp;
        this.l2 = context;
        this.l3 = collectionContentManageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(Fragment fragment, VideoViewCell videoViewCell, Aweme aweme, C211248Qu c211248Qu, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = c211248Qu;
        this.l2 = videoViewCell;
        this.l3 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(ReusedUIAssem reusedUIAssem, ReusedUIAssem<?> reusedUIAssem2, View view, C8VZ c8vz, LifecycleOwner lifecycleOwner) {
        super(1);
        this.$t = lifecycleOwner;
        this.l0 = reusedUIAssem;
        this.l1 = reusedUIAssem2;
        this.l2 = view;
        this.l3 = c8vz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(DetailPageContainerAssem detailPageContainerAssem, DetailPageContainerAssem detailPageContainerAssem2, List<C8VL> list, Map<String, C8VL> map, List<String> list2) {
        super(1);
        this.$t = list2;
        this.l0 = detailPageContainerAssem;
        this.l1 = detailPageContainerAssem2;
        this.l2 = list;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(VideoDiggVM videoDiggVM, C72242sW c72242sW, Aweme aweme, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.l1 = c72242sW;
        this.l2 = aweme;
        this.l3 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(Aweme aweme, StoryFeedViewModel storyFeedViewModel, StoryGalleryListViewModel storyGalleryListViewModel, Aweme aweme2, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = storyFeedViewModel;
        this.l2 = storyGalleryListViewModel;
        this.l3 = aweme2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(MixVideosResponse mixVideosResponse, MixVideosResponse mixVideosResponse2, C76732zl c76732zl, MixVideosViewModel mixVideosViewModel, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        super(1);
        this.$t = interfaceC67352kd;
        this.l0 = mixVideosResponse;
        this.l1 = mixVideosResponse2;
        this.l2 = c76732zl;
        this.l3 = mixVideosViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(MixVideosManageViewModel mixVideosManageViewModel, MixVideosManageViewModel mixVideosManageViewModel2, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd, MixVideosResponse mixVideosResponse, List<? extends Aweme> list) {
        super(1);
        this.$t = list;
        this.l0 = mixVideosManageViewModel;
        this.l1 = mixVideosManageViewModel2;
        this.l2 = interfaceC67352kd;
        this.l3 = mixVideosResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0400000_3(Object obj, List list, Object obj2, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(1);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = list;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(Throwable th, Throwable th2, Set<String> set, Map<String, ? extends Comment> map, C76732zl c76732zl) {
        super(1);
        this.$t = c76732zl;
        this.l0 = th;
        this.l1 = th2;
        this.l2 = set;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0400000_3(Set set, Set<String> set2, Map<String, ? extends Comment> map, Map<String, ? extends Comment> map2, C76732zl c76732zl) {
        super(1);
        this.$t = c76732zl;
        this.l0 = set;
        this.l1 = set2;
        this.l2 = map;
        this.l3 = map2;
    }
}
