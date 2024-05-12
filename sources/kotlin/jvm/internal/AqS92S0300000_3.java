package kotlin.jvm.internal;

import X.ASL;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass886;
import X.AnonymousClass887;
import X.C0NY;
import X.C113554cx;
import X.C16880lQ;
import X.C169576l7;
import X.C176356w3;
import X.C176996x5;
import X.C186897Vd;
import X.C191327f6;
import X.C191337f7;
import X.C193227iA;
import X.C1B3;
import X.C214368bA;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C53947LFf;
import X.C55096Ljo;
import X.C55480Lq0;
import X.C76800UCe;
import X.C78613UtF;
import X.C793439m;
import X.C7AL;
import X.C7XD;
import X.C8V8;
import X.C8VA;
import X.C8VR;
import X.C8XD;
import X.C8XO;
import X.C8YR;
import X.EF7;
import X.EnumC42934Gt8;
import X.FMX;
import X.InterfaceC178516zX;
import X.InterfaceC193237iB;
import X.InterfaceC218828iM;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.LFH;
import X.M7D;
import X.O6R;
import X.OSZ;
import X.TCM;
import X.X1D;
import X.XKX;
import Y.ARunnableS22S0200000_3;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListFragmentForMineProfile;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.interaction.assem.NowLikeAssem;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.api.RemoveTemplateApi;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.ss.android.ugc.now.interaction.api.LikeState;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.PadAdaptionFragment;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AqS92S0300000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            C16880lQ.LJLLJ(((ReusedAssem) this.l0).getClass());
            c8v8.LIZIZ("assem_bind_");
        }
        ((C8XO) this.l1).q4(((C8XD) this.l2).LJLIL);
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            c8v82.end(C16880lQ.LJLLJ(((ReusedAssem) this.l0).getClass()), "assem_bind_");
        }
    }

    public static final Object invoke$0(AqS92S0300000_3 aqS92S0300000_3) {
        AssemViewModel assemViewModel = (AssemViewModel) aqS92S0300000_3.l0;
        assemViewModel.initialState = (S) ((InterfaceC88472Yns) aqS92S0300000_3.l1).invoke(assemViewModel.defaultState());
        AssemViewModel assemViewModel2 = (AssemViewModel) aqS92S0300000_3.l0;
        C8YR c8yr = (C8YR) aqS92S0300000_3.l2;
        c8yr.LIZLLL(assemViewModel2.getAssemVMScope());
        S s = assemViewModel2.initialState;
        o.LJII(s, "null cannot be cast to non-null type S of com.bytedance.assem.arch.viewModel.AssemViewModel.initialize.<no name provided>.invoke$lambda$0");
        c8yr.LJ(s);
        assemViewModel2.setVmDispatcher(c8yr);
        ((AssemViewModel) aqS92S0300000_3.l0).onPrepared();
        ((AssemViewModel) aqS92S0300000_3.l0)._initialized = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS92S0300000_3 aqS92S0300000_3) {
        FragmentManager supportFragmentManager = ((ActivityC45651qj) aqS92S0300000_3.l0).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        String string = ((CollectionListFragmentForMineProfile) aqS92S0300000_3.l1).requireContext().getString(R.string.gb1);
        o.LJIIIIZZ(string, "requireContext().getStri…c_add_create_sheet_title)");
        String string2 = ((CollectionListFragmentForMineProfile) aqS92S0300000_3.l1).requireContext().getString(R.string.ipo);
        o.LJIIIIZZ(string2, "requireContext().getString(R.string.next)");
        final InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS92S0300000_3.l2;
        C193227iA.LIZJ(supportFragmentManager, string, string2, new InterfaceC193237iB() { // from class: X.7hA
            @Override // X.InterfaceC193237iB
            public final void LIZ(int i, String s) {
                o.LJIIIZ(s, "s");
                interfaceC88471Ynr.invoke(s, Integer.valueOf(i));
            }
        });
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AqS92S0300000_3 aqS92S0300000_3) {
        aqS92S0300000_3.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS92S0300000_3 aqS92S0300000_3) {
        ReusedAssem reusedAssem = (ReusedAssem) aqS92S0300000_3.l0;
        C8VR.LIZIZ(reusedAssem, new AqS92S0300000_3(reusedAssem, (ReusedAssem<? extends C3C8>) aqS92S0300000_3.l1, (C8XO<Object>) aqS92S0300000_3.l2, (C8XD) 10));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS92S0300000_3 aqS92S0300000_3) {
        if (AVExternalServiceImpl.LIZ().publishService().enablePublishAsTemplate() && TCM.LJIIJ((Aweme) aqS92S0300000_3.l0)) {
            C793439m c793439m = (C793439m) aqS92S0300000_3.l1;
            Context context = (Context) aqS92S0300000_3.l2;
            Aweme aweme = (Aweme) aqS92S0300000_3.l0;
            c793439m.getClass();
            RemoveTemplateApi.LIZ(context, String.valueOf(EF7.LJIIIZ), TCM.LJIIIIZZ(aweme), new AqS153S0100000_3(aweme, 1511));
        }
        if (e1.LIZ(31744, "enable_pugc_template_anchor", true, false) && TCM.LJIIIZ((Aweme) aqS92S0300000_3.l0)) {
            C793439m c793439m2 = (C793439m) aqS92S0300000_3.l1;
            Context context2 = (Context) aqS92S0300000_3.l2;
            Aweme aweme2 = (Aweme) aqS92S0300000_3.l0;
            c793439m2.getClass();
            String valueOf = String.valueOf(EF7.LJIIIZ);
            List<AnchorCommonStruct> anchors = aweme2.getAnchors();
            o.LJIIIIZZ(anchors, "awesome.anchors");
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    RemoveTemplateApi.LIZ(context2, valueOf, anchorCommonStruct.getId(), new AqS153S0100000_3(aweme2, 1510));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS92S0300000_3 aqS92S0300000_3) {
        ((InterfaceC88471Ynr) aqS92S0300000_3.l0).invoke((C3C8) aqS92S0300000_3.l1, aqS92S0300000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS92S0300000_3 aqS92S0300000_3) {
        ((InterfaceC88471Ynr) aqS92S0300000_3.l0).invoke((C3C8) aqS92S0300000_3.l1, aqS92S0300000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS92S0300000_3 aqS92S0300000_3) {
        ((InterfaceC88471Ynr) aqS92S0300000_3.l0).invoke((C3C8) aqS92S0300000_3.l1, (C33Q) aqS92S0300000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS92S0300000_3 aqS92S0300000_3) {
        ((InterfaceC88472Yns) aqS92S0300000_3.l0).invoke(Boolean.FALSE);
        C191327f6 c191327f6 = (C191327f6) aqS92S0300000_3.l1;
        c191327f6.LJLIL.post(new ARunnableS22S0200000_3(c191327f6, (C191337f7) aqS92S0300000_3.l2, 67));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS92S0300000_3 aqS92S0300000_3) {
        String str;
        String str2;
        String str3;
        InterfaceC178516zX r4 = ((VideoQuickCommentAssem) aqS92S0300000_3.l0).r4();
        Aweme aweme = (Aweme) aqS92S0300000_3.l1;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        r4.LIZ(str, C7AL.L((C7AL) aqS92S0300000_3.l2, true, false, null, 6));
        InterfaceC178516zX r42 = ((VideoQuickCommentAssem) aqS92S0300000_3.l0).r4();
        Aweme commentInputAweme = ((VideoQuickCommentAssem) aqS92S0300000_3.l0).getCommentInputAweme();
        if (commentInputAweme != null) {
            str2 = commentInputAweme.getAid();
        } else {
            str2 = null;
        }
        C7AL c7al = r42.get(str2);
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) aqS92S0300000_3.l0;
        InterfaceC178516zX r43 = videoQuickCommentAssem.r4();
        Aweme commentInputAweme2 = videoQuickCommentAssem.getCommentInputAweme();
        if (commentInputAweme2 != null) {
            str3 = commentInputAweme2.getAid();
        } else {
            str3 = null;
        }
        r43.LIZ(str3, C7AL.L(c7al, true, false, null, 6));
        ((VideoQuickCommentAssem) aqS92S0300000_3.l0).D4();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS92S0300000_3 aqS92S0300000_3) {
        ((VideoTagContainer) aqS92S0300000_3.l0).n4((Assembler) aqS92S0300000_3.l1, (VideoTagCategoryProtocol) aqS92S0300000_3.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS92S0300000_3 aqS92S0300000_3) {
        int i;
        AnonymousClass886 anonymousClass886;
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aqS92S0300000_3.l0, "//mix/detail");
        M7D m7d = new M7D();
        MixInfo mixInfo = (MixInfo) aqS92S0300000_3.l1;
        m7d.setMixId(mixInfo.id);
        m7d.setMUsrId(mixInfo.authorUid);
        m7d.setMNeedShowDialog(true);
        m7d.setShowLast(true);
        Integer num = mixInfo.totalVideoCount;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        m7d.setTotalVideoCount(i);
        m7d.setMVideoFrom("from_mix_detail_item");
        m7d.setEnterMethod("favourite_playlist");
        m7d.setMEventType("favourite_playlist");
        buildRoute.withParam("mix_video_list_params", m7d);
        buildRoute.withParam("enter_from", "playlist");
        buildRoute.withParam("key_playlist_previous_page", "personal_homepage");
        C0NY.LIZJ(buildRoute, "tab_name", "favourite_playlist", "key_need_preload", false);
        FMX.LJIIL("click_playlist_entrance", C113554cx.LJJL(new OSZ("enter_from", "personal_homepage"), new OSZ("tab_name", "favourite_playlist"), new OSZ("playlist_id", ((MixInfo) aqS92S0300000_3.l1).id)));
        FMX.LJIIL("enter_playlist_detail", C113554cx.LJJL(new OSZ("enter_from", "personal_homepage"), new OSZ("enter_method", "favourite_playlist"), new OSZ("tab_name", "favourite_playlist"), new OSZ("playlist_id", ((MixInfo) aqS92S0300000_3.l1).id), new OSZ("author_id", ((MixInfo) aqS92S0300000_3.l1).authorUid)));
        PlaylistCollectionVM playlistCollectionVM = (PlaylistCollectionVM) ((PlaylistCollectionCell) aqS92S0300000_3.l2).LJLIL.getValue();
        String mixId = ((MixInfo) aqS92S0300000_3.l1).id;
        o.LJIIIZ(mixId, "mixId");
        List<AnonymousClass886> list = ((C186897Vd) playlistCollectionVM.getState()).LJLIL.LJLJJI;
        if (list != null) {
            Iterator<AnonymousClass886> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    anonymousClass886 = it.next();
                    if (o.LJ(anonymousClass886.LJLIL.id, mixId)) {
                        break;
                    }
                } else {
                    anonymousClass886 = null;
                    break;
                }
            }
            AnonymousClass886 anonymousClass8862 = anonymousClass886;
            if (anonymousClass8862 != null) {
                int listIndexOf = playlistCollectionVM.listIndexOf((PlaylistCollectionVM) anonymousClass8862);
                MixInfo mixInfo2 = anonymousClass8862.LJLIL;
                String id = mixInfo2.id;
                String str = mixInfo2.coverUrl;
                String str2 = mixInfo2.name;
                Integer num2 = mixInfo2.totalVideoCount;
                String str3 = mixInfo2.authorUid;
                o.LJIIIZ(id, "id");
                playlistCollectionVM.listSetItemAt(listIndexOf, (int) new AnonymousClass886(new MixInfo(id, str, str2, num2, null, str3)));
            }
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(playlistCollectionVM), C78613UtF.LIZJ, null, new AnonymousClass887(playlistCollectionVM, mixId, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS92S0300000_3 aqS92S0300000_3) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Assem.Supervisor Error: \n eventType:");
            LIZ.append(((VideoBaseCell) aqS92S0300000_3.l0).LJLLILLLL.LJIIIZ);
            LIZ.append(", fragment:");
            LIZ.append(((ReusedUIAssem) aqS92S0300000_3.l1).getParent());
            LIZ.append(", supervisor:");
            LIZ.append((AssemSupervisor) aqS92S0300000_3.l2);
            LIZ.append(", paren state:");
            LIZ.append(((ReusedUIAssem) aqS92S0300000_3.l1).getParent().getLifecycle().getCurrentState());
            LIZ.append(",state:");
            LIZ.append(((ReusedUIAssem) aqS92S0300000_3.l1).getLifecycle().getCurrentState());
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Object invoke$4(AqS92S0300000_3 aqS92S0300000_3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Assem = [");
        LIZ.append((NowLikeAssem) aqS92S0300000_3.l0);
        LIZ.append("] sync ");
        LIZ.append((NowLikeAssem) aqS92S0300000_3.l0);
        LIZ.append(" likeState ");
        LIZ.append((LikeState) aqS92S0300000_3.l1);
        C7XD.LIZ("NowLikeAssem", X1D.LIZIZ(LIZ));
        NowLikeViewModel m4 = ((NowLikeAssem) aqS92S0300000_3.l2).m4();
        boolean isLiked = ((LikeState) aqS92S0300000_3.l1).isLiked();
        m4.mv0(isLiked ? 1 : 0, ((LikeState) aqS92S0300000_3.l1).getLikeCount());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS92S0300000_3 aqS92S0300000_3) {
        ((Map) aqS92S0300000_3.l0).put("action_type", "1");
        FMX.LJIIL("click_discard_pop_up", (Map) aqS92S0300000_3.l0);
        ((AlertDialog) aqS92S0300000_3.l1).dismiss();
        ((InterfaceC65784Pro) aqS92S0300000_3.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS92S0300000_3 aqS92S0300000_3) {
        FragmentManager supportFragmentManager = ((ActivityC45651qj) aqS92S0300000_3.l0).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "fragmentActivity.supportFragmentManager");
        InterfaceC218828iM interfaceC218828iM = (InterfaceC218828iM) aqS92S0300000_3.l1;
        C169576l7 config = (C169576l7) aqS92S0300000_3.l2;
        o.LJIIIZ(config, "config");
        C55480Lq0.LIZIZ.LIZIZ(249372162);
        AddYoursInviteFriendsFragment addYoursInviteFriendsFragment = new AddYoursInviteFriendsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("invite_config", config);
        addYoursInviteFriendsFragment.setArguments(bundle);
        addYoursInviteFriendsFragment.LJLIL = interfaceC218828iM;
        AddYoursInviteFriendsFragment.LJLL = config.getOnSelected();
        if (LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 0) {
            int LIZ = C53947LFf.LIZ();
            ASL asl = new ASL();
            asl.LIZLLL(R.style.ul);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = addYoursInviteFriendsFragment;
            tuxSheet.LJZL = true;
            tuxSheet.LJZI = false;
            double d = LIZ;
            asl.LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(0.74d * d))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(d * 0.9d))));
            asl.LJI(2);
            asl.LIZ.show(supportFragmentManager, "AYInviteFriends");
        } else {
            Integer valueOf = Integer.valueOf(R.style.ul);
            PadAdaptionFragment padAdaptionFragment = new PadAdaptionFragment();
            padAdaptionFragment.LJLIL = addYoursInviteFriendsFragment;
            padAdaptionFragment.LJLILLLLZI = valueOf;
            try {
                Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
                declaredField.setAccessible(true);
                declaredField.set(padAdaptionFragment, Boolean.FALSE);
                Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
                declaredField2.setAccessible(true);
                declaredField2.set(padAdaptionFragment, Boolean.TRUE);
            } catch (Exception unused) {
            }
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            if (padAdaptionFragment.isAdded()) {
                c1b3.LJIIL(padAdaptionFragment);
            } else {
                c1b3.LJIIIIZZ(0, 1, padAdaptionFragment, "PadAdaption");
            }
            c1b3.LJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS92S0300000_3 aqS92S0300000_3) {
        boolean z;
        CommentVideoModel.Type type;
        KeyboardVMV2 I3 = ((CommonCommentKeyboard) aqS92S0300000_3.l0).I3();
        Comment comment = (Comment) aqS92S0300000_3.l1;
        Boolean bool = (Boolean) aqS92S0300000_3.l2;
        I3.getClass();
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        I3.withState(new AqS27S0210000_3(I3, comment, z, 5));
        IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ((CommonCommentKeyboard) aqS92S0300000_3.l0));
        if (LIZ != null) {
            C176996x5 c176996x5 = ((CommonCommentKeyboard) aqS92S0300000_3.l0).LJLLJ;
            if (c176996x5 == null || (type = c176996x5.LJIJ()) == null) {
                type = CommentVideoModel.Type.NONE;
            }
            LIZ.sZ(type);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS92S0300000_3 aqS92S0300000_3) {
        Lifecycle lifecycle = ((ActivityC45651qj) aqS92S0300000_3.l0).getLifecycle();
        final ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS92S0300000_3.l0;
        final C8VA c8va = (C8VA) aqS92S0300000_3.l1;
        final Assembler assembler = (Assembler) aqS92S0300000_3.l2;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.extensions.assemble.ActivityAssembleExtKt$activityAssembleInit$serviceStore$1$1$1
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
            
                if (r6 == java.lang.Object.class) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
            
                r5 = r6.getInterfaces();
                kotlin.jvm.internal.o.LJIIIIZZ(r5, "currentClazz.interfaces");
                r4 = new java.util.ArrayList();
                r3 = r5.length;
                r2 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
            
                if (r2 >= r3) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
            
                r1 = r5[r2];
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
            
                if (X.C8V9.class.isAssignableFrom(r1) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
            
                r4.add(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
            
                r2 = r2 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
            
                r2 = r4.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
            
                if (r2.hasNext() == false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
            
                r1 = (java.lang.Class) r2.next();
                kotlin.jvm.internal.o.LJIIIIZZ(r1, "it");
                r7.LJ(r1, r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
            
                r6 = r6.getSuperclass();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
            
                if (r6 == null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
            
                if (r0.length != 0) goto L13;
             */
            @Override // androidx.lifecycle.LifecycleEventObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner r10, androidx.lifecycle.Lifecycle.Event r11) {
                /*
                    r9 = this;
                    java.lang.String r0 = "source"
                    kotlin.jvm.internal.o.LJIIIZ(r10, r0)
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.LJIIIZ(r11, r0)
                    int[] r1 = X.C8CI.LIZ
                    int r0 = r11.ordinal()
                    r1 = r1[r0]
                    r0 = 1
                    if (r1 != r0) goto L33
                    X.1qj r8 = X.ActivityC45651qj.this
                    boolean r0 = r8 instanceof X.C8V9
                    if (r0 == 0) goto L2c
                    X.8VA r7 = r2
                    X.8V9 r8 = (X.C8V9) r8
                    java.lang.Class r6 = r8.getClass()
                    java.lang.Class[] r0 = r6.getInterfaces()
                    if (r0 == 0) goto L2c
                    int r0 = r0.length
                    if (r0 != 0) goto L36
                L2c:
                    com.bytedance.assem.arch.core.Assembler r1 = r3
                    X.1qj r0 = X.ActivityC45651qj.this
                    r1.iv0(r0)
                L33:
                    return
                L34:
                    if (r6 == 0) goto L2c
                L36:
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    if (r6 == r0) goto L2c
                    java.lang.Class[] r5 = r6.getInterfaces()
                    java.lang.String r0 = "currentClazz.interfaces"
                    kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    int r3 = r5.length
                    r2 = 0
                L4a:
                    if (r2 >= r3) goto L5c
                    r1 = r5[r2]
                    java.lang.Class<X.8V9> r0 = X.C8V9.class
                    boolean r0 = r0.isAssignableFrom(r1)
                    if (r0 == 0) goto L59
                    r4.add(r1)
                L59:
                    int r2 = r2 + 1
                    goto L4a
                L5c:
                    java.util.Iterator r2 = r4.iterator()
                L60:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L75
                    java.lang.Object r1 = r2.next()
                    java.lang.Class r1 = (java.lang.Class) r1
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                    r7.LJ(r1, r8)
                    goto L60
                L75:
                    java.lang.Class r6 = r6.getSuperclass()
                    goto L34
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.extensions.assemble.ActivityAssembleExtKt$activityAssembleInit$serviceStore$1$1$1.onStateChanged(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS92S0300000_3 aqS92S0300000_3) {
        Lifecycle lifecycle = ((Fragment) aqS92S0300000_3.l0).getLifecycle();
        final Fragment fragment = (Fragment) aqS92S0300000_3.l0;
        final C8VA c8va = (C8VA) aqS92S0300000_3.l1;
        final Assembler assembler = (Assembler) aqS92S0300000_3.l2;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.extensions.assemble.FragmentAssembleExtKt$fragmentAssembleInit$serviceStore$1$1$1
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
            
                if (r6 == java.lang.Object.class) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
            
                r5 = r6.getInterfaces();
                kotlin.jvm.internal.o.LJIIIIZZ(r5, "currentClazz.interfaces");
                r4 = new java.util.ArrayList();
                r3 = r5.length;
                r2 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
            
                if (r2 >= r3) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
            
                r1 = r5[r2];
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
            
                if (X.C8V9.class.isAssignableFrom(r1) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
            
                r4.add(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
            
                r2 = r2 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
            
                r2 = r4.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
            
                if (r2.hasNext() == false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
            
                r1 = (java.lang.Class) r2.next();
                kotlin.jvm.internal.o.LJIIIIZZ(r1, "it");
                r7.LJ(r1, r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
            
                r6 = r6.getSuperclass();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
            
                if (r6 == null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
            
                if (r0.length != 0) goto L13;
             */
            @Override // androidx.lifecycle.LifecycleEventObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner r10, androidx.lifecycle.Lifecycle.Event r11) {
                /*
                    r9 = this;
                    java.lang.String r0 = "source"
                    kotlin.jvm.internal.o.LJIIIZ(r10, r0)
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.LJIIIZ(r11, r0)
                    int[] r1 = X.C8CJ.LIZ
                    int r0 = r11.ordinal()
                    r1 = r1[r0]
                    r0 = 1
                    if (r1 != r0) goto L33
                    androidx.fragment.app.Fragment r8 = androidx.fragment.app.Fragment.this
                    boolean r0 = r8 instanceof X.C8V9
                    if (r0 == 0) goto L2c
                    X.8VA r7 = r2
                    X.8V9 r8 = (X.C8V9) r8
                    java.lang.Class r6 = r8.getClass()
                    java.lang.Class[] r0 = r6.getInterfaces()
                    if (r0 == 0) goto L2c
                    int r0 = r0.length
                    if (r0 != 0) goto L36
                L2c:
                    com.bytedance.assem.arch.core.Assembler r1 = r3
                    androidx.fragment.app.Fragment r0 = androidx.fragment.app.Fragment.this
                    r1.iv0(r0)
                L33:
                    return
                L34:
                    if (r6 == 0) goto L2c
                L36:
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    if (r6 == r0) goto L2c
                    java.lang.Class[] r5 = r6.getInterfaces()
                    java.lang.String r0 = "currentClazz.interfaces"
                    kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    int r3 = r5.length
                    r2 = 0
                L4a:
                    if (r2 >= r3) goto L5c
                    r1 = r5[r2]
                    java.lang.Class<X.8V9> r0 = X.C8V9.class
                    boolean r0 = r0.isAssignableFrom(r1)
                    if (r0 == 0) goto L59
                    r4.add(r1)
                L59:
                    int r2 = r2 + 1
                    goto L4a
                L5c:
                    java.util.Iterator r2 = r4.iterator()
                L60:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L75
                    java.lang.Object r1 = r2.next()
                    java.lang.Class r1 = (java.lang.Class) r1
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                    r7.LJ(r1, r8)
                    goto L60
                L75:
                    java.lang.Class r6 = r6.getSuperclass()
                    goto L34
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.extensions.assemble.FragmentAssembleExtKt$fragmentAssembleInit$serviceStore$1$1$1.onStateChanged(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
            }
        });
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(ActivityC45651qj activityC45651qj, C8VA c8va, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c8va;
        this.l2 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(ActivityC45651qj activityC45651qj, InterfaceC218828iM interfaceC218828iM, C169576l7 c169576l7, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = interfaceC218828iM;
        this.l2 = c169576l7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(ActivityC45651qj activityC45651qj, CollectionListFragmentForMineProfile collectionListFragmentForMineProfile, AqS166S0200000_3 aqS166S0200000_3, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = collectionListFragmentForMineProfile;
        this.l2 = aqS166S0200000_3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS92S0300000_3(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<C3C8, C33Q, C76800UCe> interfaceC88471Ynr2, C3C8 c3c8, C33Q c33q) {
        super(0);
        this.$t = c33q;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.l2 = c3c8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS92S0300000_3(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<C3C8, Object, C76800UCe> interfaceC88471Ynr2, C3C8 c3c8, Object obj) {
        super(0);
        this.$t = obj;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.l2 = c3c8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(Context context, MixInfo mixInfo, PlaylistCollectionCell playlistCollectionCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = mixInfo;
        this.l2 = playlistCollectionCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(Context context, Aweme aweme, C793439m c793439m, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = c793439m;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(Fragment fragment, C8VA c8va, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c8va;
        this.l2 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS92S0300000_3(ReusedAssem reusedAssem, ReusedAssem<? extends C3C8> reusedAssem2, C8XO<Object> c8xo, C8XD c8xd) {
        super(0);
        this.$t = c8xd;
        this.l0 = reusedAssem;
        this.l1 = reusedAssem2;
        this.l2 = c8xo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS92S0300000_3(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, InterfaceC88472Yns<? super S, ? extends S> interfaceC88472Yns, C8YR<S> c8yr) {
        super(0);
        this.$t = c8yr;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(CommonCommentKeyboard commonCommentKeyboard, Comment comment, Boolean bool, int i) {
        super(0);
        this.$t = i;
        this.l0 = commonCommentKeyboard;
        this.l1 = comment;
        this.l2 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS92S0300000_3(VideoBaseCell videoBaseCell, VideoBaseCell videoBaseCell2, ReusedUIAssem<?> reusedUIAssem, AssemSupervisor assemSupervisor) {
        super(0);
        this.$t = assemSupervisor;
        this.l0 = videoBaseCell;
        this.l1 = videoBaseCell2;
        this.l2 = reusedUIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(VideoQuickCommentAssem videoQuickCommentAssem, Aweme aweme, C7AL c7al, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoQuickCommentAssem;
        this.l1 = aweme;
        this.l2 = c7al;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(NowLikeAssem nowLikeAssem, LikeState likeState, NowLikeAssem nowLikeAssem2, int i) {
        super(0);
        this.$t = i;
        this.l0 = nowLikeAssem;
        this.l1 = likeState;
        this.l2 = nowLikeAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(VideoTagContainer videoTagContainer, Assembler assembler, VideoTagCategoryProtocol videoTagCategoryProtocol, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoTagContainer;
        this.l1 = assembler;
        this.l2 = videoTagCategoryProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(Map map, AlertDialog alertDialog, AqS153S0100000_3 aqS153S0100000_3, int i) {
        super(0);
        this.$t = i;
        this.l0 = map;
        this.l1 = alertDialog;
        this.l2 = aqS153S0100000_3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS92S0300000_3(AqS180S0100000_14 aqS180S0100000_14, C191327f6 c191327f6, C191337f7 c191337f7, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS180S0100000_14;
        this.l1 = c191327f6;
        this.l2 = c191337f7;
    }
}
