package Y;

import X.AD7;
import X.ARH;
import X.ARI;
import X.ASL;
import X.ActivityC45651qj;
import X.AnonymousClass745;
import X.C00F;
import X.C03660Ck;
import X.C158056If;
import X.C176016vV;
import X.C176286vw;
import X.C176996x5;
import X.C177156xL;
import X.C178686zo;
import X.C1794072i;
import X.C188727au;
import X.C1DG;
import X.C224738rt;
import X.C224748ru;
import X.C26045AKb;
import X.C26227ARb;
import X.C26231ARf;
import X.C2U8;
import X.C2YJ;
import X.C32I;
import X.C3AW;
import X.C41424GNo;
import X.C45507HtX;
import X.C51325KCj;
import X.C61200O0e;
import X.C6ZT;
import X.C71Y;
import X.C73318Sq2;
import X.C73969T1h;
import X.C73G;
import X.C74Z;
import X.C77321UWf;
import X.C78847Ux1;
import X.C79061V1d;
import X.C7YC;
import X.EF7;
import X.EFJ;
import X.FMX;
import X.InterfaceC177046xA;
import X.InterfaceC178496zV;
import X.InterfaceC789838c;
import X.InterfaceC88472Yns;
import X.K56;
import X.K75;
import X.KL2;
import X.KMV;
import X.KNV;
import X.M89;
import X.MFS;
import X.OZ1;
import X.T16;
import X.WUK;
import X.X1D;
import X.XX7;
import X.XYM;
import X.Y87;
import X.Z89;
import X.Z9N;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchDeleteResponse;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchManagementApi;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGSupportPanelFragment;
import com.ss.android.ugc.aweme.commercialize.model.NonstandardAdStruct;
import com.ss.android.ugc.aweme.creatortools.api.CanQuitBusinessAccountApi;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.main.service.ICommerceService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS22S0101000_3 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void onClick$11(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                CommentListFragment.Gl((CommentListFragment) ((Fragment) aCListenerS22S0101000_3.l0));
                return;
            default:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS22S0101000_3.l0)).lambda$initUnits$78(view);
                return;
        }
    }

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
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        Comment comment;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                ((XX7) aCListenerS22S0101000_3.l0).LJLJI.onInternalEvent(new XYM("local_edit_click"));
                return;
            case 1:
                AnonymousClass745 anonymousClass745 = (AnonymousClass745) aCListenerS22S0101000_3.l0;
                if (anonymousClass745.LLF == null || (comment = anonymousClass745.LLFF) == null || comment.getUser() == null || anonymousClass745.LLFF.getCid() == null || anonymousClass745.T()) {
                    return;
                }
                ((CommentListFragment) anonymousClass745.LLF).An(anonymousClass745.LLFFF, anonymousClass745.LLFF);
                return;
            case 2:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS22S0101000_3.l0;
                keyboardDialogFragment.LJZI.setVisibility(8);
                keyboardDialogFragment.LJZL.setImageBitmap(null);
                keyboardDialogFragment.LLJ = null;
                C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
                if (c176996x5 != null) {
                    c176996x5.LJJJLZIJ(null);
                }
                keyboardDialogFragment.Tl(true, true);
                return;
            default:
                Fragment fragment = (Fragment) aCListenerS22S0101000_3.l0;
                Context context = fragment.getContext();
                if (context == null) {
                    return;
                }
                ARI ari = new ARI(fragment.requireContext());
                String text = fragment.getString(R.string.p2);
                o.LJIIIZ(text, "text");
                ari.LJII(text, null);
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LIZIZ(fragment.getString(R.string.p_6));
                c26227ARb.LJII = true;
                c26227ARb.LJIIL = ari;
                new C26231ARf(c26227ARb).LIZLLL();
                return;
        }
    }

    public static final void onClick$1(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) ((Fragment) aCListenerS22S0101000_3.l0);
                List<CommentImageModel> list = keyboardDialogFragment.LLJILJIL.LJZL;
                if (list != null && !list.isEmpty()) {
                    Y87.LIZ((CommentImageModel) ListProtector.get(list, 0));
                }
                keyboardDialogFragment.BU(null);
                C74Z.LJIJI(keyboardDialogFragment.LLIZLLLIL, "delete");
                return;
            default:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS22S0101000_3.l0)).lambda$initUnits$51(view);
                return;
        }
    }

    public static final void onClick$10(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        int i;
        Object obj;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                CommentListFragment commentListFragment = (CommentListFragment) aCListenerS22S0101000_3.l0;
                CommentBatchManagementViewModel commentBatchManagementViewModel = commentListFragment.LLLF;
                if (commentBatchManagementViewModel == null) {
                    return;
                }
                Map<String, Comment> map = commentBatchManagementViewModel.LJLJJI;
                if (commentListFragment.LLLFZ == null) {
                    C41424GNo c41424GNo = new C41424GNo(commentListFragment.mo49getActivity());
                    commentListFragment.LLLFZ = c41424GNo;
                    c41424GNo.LIZ(new String[]{commentListFragment.mo49getActivity().getResources().getString(R.string.djg), commentListFragment.mo49getActivity().getResources().getString(R.string.dj3)}, new IDCListenerS47S0200000_3(commentListFragment, map, 9));
                }
                commentListFragment.LLLLLLIL = commentListFragment.LLLFZ.LIZIZ();
                Iterator it = ((HashMap) map).entrySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((Comment) ((Map.Entry) it.next()).getValue()).getAliasAweme() != null) {
                        i2++;
                    }
                }
                C74Z.LJIILJJIL(i2, commentListFragment.LJLILLLLZI.getEnterFrom());
                return;
            case 1:
                ((MFS) aCListenerS22S0101000_3.l0).P();
                return;
            case 2:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS22S0101000_3.l0;
                i18nSettingManageMyAccountActivity.getClass();
                if (C6ZT.LIZ(view)) {
                    return;
                }
                i18nSettingManageMyAccountActivity.LLILLL();
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(0, "status");
                FMX.LJIIL("ttelite_click_backto_PA_button", c188727au.LIZ);
                MixFeedService.LJJIJIIJIL().LJFF(true);
                if (i18nSettingManageMyAccountActivity.LJLIL.getAccountType() == 3) {
                    C73318Sq2 c73318Sq2 = i18nSettingManageMyAccountActivity.LLFZ;
                    CanQuitBusinessAccountApi.LIZ.getClass();
                    String str = EFJ.LIZJ;
                    InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
                    if (LJI != null) {
                        obj = LJI.create(CanQuitBusinessAccountApi.class);
                    } else {
                        obj = null;
                    }
                    o.LJI(obj);
                    c73318Sq2.LIZ(((CanQuitBusinessAccountApi) obj).check().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS38S0101000_10(3, i18nSettingManageMyAccountActivity, 0), new AfS35S0101000_3(3, i18nSettingManageMyAccountActivity, 2)));
                    return;
                }
                if (i18nSettingManageMyAccountActivity.LJLIL.getAccountType() == 2) {
                    if (AD7.LJIIIIZZ() && AD7.LJIIIZ()) {
                        i = R.string.cf0;
                    } else {
                        i = R.string.phz;
                    }
                } else if (AD7.LJIIIIZZ() && AD7.LJIIIZ()) {
                    i = R.string.s5h;
                } else {
                    i = R.string.ehq;
                }
                i18nSettingManageMyAccountActivity.LLJJIJIIJIL(i, R.string.rz1);
                return;
            default:
                ((C45507HtX) aCListenerS22S0101000_3.l0).LJLJLLL.performClick();
                return;
        }
    }

    public static final void onClick$12(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                C176996x5 c176996x5 = ((CommentListFragment) aCListenerS22S0101000_3.l0).LLIZ;
                if (c176996x5 != null) {
                    c176996x5.LIZ();
                    return;
                }
                return;
            case 1:
                Context context = (Context) aCListenerS22S0101000_3.l0;
                context.getClass();
                SmartRouter.buildRoute(context, "//setting/account/third_party_binding").open();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS22S0101000_3.l0).lambda$initUnits$72(view);
                return;
        }
    }

    public static final void onClick$13(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        Aweme aweme;
        int i;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                ((AnonymousClass745) ((LifecycleOwner) aCListenerS22S0101000_3.l0)).N(view, "click_button");
                return;
            case 1:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) ((LifecycleOwner) aCListenerS22S0101000_3.l0);
                keyboardDialogFragment.getClass();
                if (C6ZT.LIZIZ(view, 500L) || (aweme = keyboardDialogFragment.LLIZ) == null || keyboardDialogFragment.LLJILJIL.LJJLIIIJJI(aweme.getAid(), keyboardDialogFragment.LLIZLLLIL, "click_comment_photo")) {
                    return;
                }
                C71Y.LIZ("PhotoComment", "photo select clicked, fragment = ${this}");
                keyboardDialogFragment.LLJILJIL.LL = true;
                if (keyboardDialogFragment.LLILZ) {
                    i = 10003;
                } else if (keyboardDialogFragment.LLILZIL) {
                    i = 10005;
                } else {
                    i = 10002;
                }
                keyboardDialogFragment.xl(0);
                C77321UWf.LJIIL(keyboardDialogFragment, keyboardDialogFragment.LLJZ, i, new AObjectS48S0101000_3(i, keyboardDialogFragment, 0));
                C74Z.LJIIZILJ(keyboardDialogFragment.LLIZLLLIL);
                return;
            default:
                ((SettingNewVersionFragment) ((LifecycleOwner) aCListenerS22S0101000_3.l0)).lambda$initUnits$49(view);
                return;
        }
    }

    public static final void onClick$2(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        C7YC c7yc;
        InterfaceC177046xA interfaceC177046xA;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) ((Fragment) aCListenerS22S0101000_3.l0);
                if (keyboardDialogFragment.Il() && (c7yc = keyboardDialogFragment.LLIIZ) != null && (interfaceC177046xA = ((C176996x5) c7yc).LJLJJI) != null) {
                    interfaceC177046xA.onEmojiToKeyboard("box");
                }
                keyboardDialogFragment.Ll(0);
                keyboardDialogFragment.LLILZ = false;
                keyboardDialogFragment.LLILZIL = false;
                return;
            default:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS22S0101000_3.l0)).lambda$initUnits$53(view);
                return;
        }
    }

    public static final void onClick$3(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        Aweme aweme;
        String str;
        Integer num;
        String str2;
        ArrayList arrayList;
        Integer num2;
        int i;
        String str3;
        Integer num3;
        int i2;
        int i3;
        String str4;
        String str5;
        NowFeedMobHierarchyData nowFeedMobHierarchyData;
        NowFeedMobHierarchyData nowFeedMobHierarchyData2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData3;
        Aweme aweme2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData4;
        NowFeedMobHierarchyData nowFeedMobHierarchyData5;
        String obj = ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).H3().getEditableText().toString();
        NowKeyboardVM K3 = ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).K3();
        NowFakeCommentInputAssem nowFakeCommentInputAssem = (NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0;
        K3.gv0(nowFakeCommentInputAssem.LJLZ, obj, nowFakeCommentInputAssem.H3().getTextExtraStructList(), ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).LJZ);
        C73G I3 = ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).I3();
        String str6 = null;
        if (I3 != null && (aweme = I3.LJLIL) != null) {
            NowFakeCommentInputAssem nowFakeCommentInputAssem2 = (NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0;
            int i4 = aCListenerS22S0101000_3.i1;
            C73G I32 = nowFakeCommentInputAssem2.I3();
            if (I32 != null && (nowFeedMobHierarchyData5 = I32.LJLJJL) != null) {
                str = nowFeedMobHierarchyData5.getEnterFrom();
            } else {
                str = null;
            }
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            if (author != null) {
                num = Integer.valueOf(author.getFollowStatus());
            } else {
                num = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str2 = nowPostInfo.getNowMediaType();
            } else {
                str2 = null;
            }
            Comment comment = nowFakeCommentInputAssem2.LJZ;
            String str7 = nowFakeCommentInputAssem2.I3().LJLJJLL;
            ArrayList<TextExtraStruct> textExtraStructList = nowFakeCommentInputAssem2.H3().getTextExtraStructList();
            if (textExtraStructList != null) {
                arrayList = new ArrayList(C32I.LJJL(textExtraStructList, 10));
                Iterator<TextExtraStruct> it = textExtraStructList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUserId());
                }
            } else {
                arrayList = null;
            }
            ArrayList<TextExtraStruct> textExtraStructList2 = nowFakeCommentInputAssem2.H3().getTextExtraStructList();
            if (textExtraStructList2 != null) {
                num2 = Integer.valueOf(textExtraStructList2.size());
            } else {
                num2 = null;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData6 = nowFakeCommentInputAssem2.I3().LJLJJL;
            if (nowFeedMobHierarchyData6 != null) {
                i = nowFeedMobHierarchyData6.isBlueVUser();
            } else {
                i = 0;
            }
            String LJIIZILJ = Z89.LIZIZ.LJIIZILJ(nowFakeCommentInputAssem2.I3().LJLIL);
            NowFeedMobHierarchyData nowFeedMobHierarchyData7 = nowFakeCommentInputAssem2.I3().LJLJJL;
            if (nowFeedMobHierarchyData7 != null) {
                str3 = nowFeedMobHierarchyData7.getEnterPosition();
            } else {
                str3 = null;
            }
            C73G I33 = nowFakeCommentInputAssem2.I3();
            if (I33 != null && (nowFeedMobHierarchyData4 = I33.LJLJJL) != null) {
                num3 = nowFeedMobHierarchyData4.isNowClear();
            } else {
                num3 = null;
            }
            C73G I34 = nowFakeCommentInputAssem2.I3();
            if (I34 != null && (aweme2 = I34.LJLIL) != null) {
                i2 = C78847Ux1.LJJIJIIJI(aweme2);
            } else {
                i2 = 1;
            }
            int LJJJJ = C78847Ux1.LJJJJ(nowFakeCommentInputAssem2.I3().LJLIL);
            C73G I35 = nowFakeCommentInputAssem2.I3();
            if (I35 != null && (nowFeedMobHierarchyData3 = I35.LJLJJL) != null) {
                i3 = nowFeedMobHierarchyData3.isNewPage();
            } else {
                i3 = 0;
            }
            C73G I36 = nowFakeCommentInputAssem2.I3();
            if (I36 != null && (nowFeedMobHierarchyData2 = I36.LJLJJL) != null) {
                str4 = nowFeedMobHierarchyData2.getPreviousPage();
            } else {
                str4 = null;
            }
            C73G I37 = nowFakeCommentInputAssem2.I3();
            if (I37 != null && (nowFeedMobHierarchyData = I37.LJLJJL) != null) {
                str5 = nowFeedMobHierarchyData.getNowTabEnterMethod();
            } else {
                str5 = null;
            }
            C1794072i.LJII(str, aid, authorUid, num, str2, comment, obj, str7, arrayList, num2, i, LJIIZILJ, str3, i4, num3, i2, LJJJJ, i3, str4, str5);
        }
        ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).H3().getEditableText().clear();
        C224738rt H3 = ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).H3();
        Context context = ((NowFakeCommentInputAssem) aCListenerS22S0101000_3.l0).getContext();
        if (context != null) {
            str6 = context.getString(R.string.izt);
        }
        H3.setHint(str6);
    }

    public static final void onClick$4(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                C61200O0e.LIZLLL().LJII(((AwemeHybridLabelModel) aCListenerS22S0101000_3.l0).getRefUrl());
                return;
            case 1:
                CommentListFragment commentListFragment = (CommentListFragment) aCListenerS22S0101000_3.l0;
                if (commentListFragment.LLLLLLLZIL.LIZ(commentListFragment.LJLJI) && commentListFragment.LLIZ != null && commentListFragment.LJLZ != null) {
                    if (C00F.LIZ(31744, 0, "video_gifts_supporter_panel", true) == 1) {
                        ActivityC45651qj act = commentListFragment.mo49getActivity();
                        C176996x5 manager = commentListFragment.LLIZ;
                        Aweme aweme = commentListFragment.LJLJI;
                        o.LJIIIZ(act, "act");
                        o.LJIIIZ(manager, "manager");
                        VGSupportPanelFragment vGSupportPanelFragment = new VGSupportPanelFragment();
                        vGSupportPanelFragment.LJLIL = manager;
                        vGSupportPanelFragment.LJLJJI = aweme;
                        ASL asl = new ASL();
                        asl.LIZ.LJLLILLLL = vGSupportPanelFragment;
                        asl.LJI(1);
                        TuxSheet tuxSheet = asl.LIZ;
                        tuxSheet.LJLLLLLL = (int) (KL2.LJIIIZ(act) * 0.66d);
                        tuxSheet.LJZI = false;
                        tuxSheet.LJZL = true;
                        tuxSheet.LJLLJ = false;
                        tuxSheet.LJLILLLLZI = new IDDListenerS141S0100000_1(aweme, 2);
                        vGSupportPanelFragment.LJLJI = tuxSheet;
                        C1DG.LJII(act, "act.supportFragmentManager", tuxSheet, "VGSupportPanelFragment");
                        return;
                    }
                    C224748ru c224748ru = commentListFragment.LJLZ;
                    if (c224748ru == null) {
                        return;
                    }
                    commentListFragment.LLIZ.LJJLIIIJ(c224748ru.getHint(), "click_gift_summary_stripe");
                    return;
                }
                C26045AKb c26045AKb = new C26045AKb(commentListFragment);
                c26045AKb.LJIIIIZZ(R.string.tpn);
                c26045AKb.LJIIJ();
                return;
            case 2:
                ((SettingNewVersionFragment) aCListenerS22S0101000_3.l0).lambda$initUnits$90(view);
                return;
            case 3:
                ((VideoShare2GifEditActivity) aCListenerS22S0101000_3.l0).resolveUiClickEvent(view);
                return;
            default:
                ((WUK) aCListenerS22S0101000_3.l0).LIZJ();
                return;
        }
    }

    public static final void onClick$5(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        String str;
        M89 s3;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                ((LiveRoomNotifyWidget) ((LifecycleOwner) aCListenerS22S0101000_3.l0)).LJZI();
                return;
            case 1:
                CommentInputFragment commentInputFragment = (CommentInputFragment) ((LifecycleOwner) aCListenerS22S0101000_3.l0);
                Aweme aweme = commentInputFragment.getAweme();
                InterfaceC178496zV interfaceC178496zV = commentInputFragment.LL;
                if (interfaceC178496zV != null && (s3 = interfaceC178496zV.s3()) != null) {
                    str = s3.getEventType();
                } else {
                    str = "";
                }
                Z9N.LIZIZ.LLILZ().LJII(commentInputFragment.mo49getActivity(), commentInputFragment, aweme, str);
                return;
            default:
                BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) ((LifecycleOwner) aCListenerS22S0101000_3.l0);
                baseDiscoverAndSearchFragmentNew.getClass();
                if (C6ZT.LIZ(view)) {
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", baseDiscoverAndSearchFragmentNew.Ml());
                c188727au.LJIIIZ("action_type", "click");
                FMX.LJIIL("scan_icon", c188727au.LIZ);
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", baseDiscoverAndSearchFragmentNew.Ml());
                FMX.LJIIL("qr_code_scan_enter", c188727au2.LIZ);
                OZ1.LIZIZ.LIZIZ(baseDiscoverAndSearchFragmentNew.getContext(), -1, false);
                return;
        }
    }

    public static final void onClick$6(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                MusicClassDetailFragment musicClassDetailFragment = (MusicClassDetailFragment) aCListenerS22S0101000_3.l0;
                musicClassDetailFragment.getClass();
                if (C00F.LIZ(31744, 0, "non_standard_ad_music_list_style", true) != 1) {
                    HashMap LIZJ = C03660Ck.LIZJ("enter_from", "change_music_page");
                    LIZJ.put("category_name", musicClassDetailFragment.LJLLLL);
                    FMX.LJIIL("click_ad_sticker", LIZJ);
                    if (!CommerceServiceImpl.LIZJ().LIZ(musicClassDetailFragment.getContext(), musicClassDetailFragment.LJZI.ad.openUrl)) {
                        ICommerceService LIZJ2 = CommerceServiceImpl.LIZJ();
                        Context context = musicClassDetailFragment.getContext();
                        NonstandardAdStruct nonstandardAdStruct = musicClassDetailFragment.LJZI.ad;
                        LIZJ2.openAdWebUrl(context, nonstandardAdStruct.webUrl, nonstandardAdStruct.webTitle);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                final CommentListFragment commentListFragment = (CommentListFragment) aCListenerS22S0101000_3.l0;
                CommentBatchManagementViewModel commentBatchManagementViewModel = commentListFragment.LLLF;
                if (commentBatchManagementViewModel == null) {
                    return;
                }
                Map<String, Comment> map = commentBatchManagementViewModel.LJLJJI;
                final HashSet hashSet = new HashSet();
                final HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = (HashMap) map;
                int i6 = 0;
                int i7 = 0;
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object key = entry.getKey();
                    Comment comment = (Comment) entry.getValue();
                    if (comment != null) {
                        if (comment.getCommentType() == i5) {
                            hashSet3.add(key);
                            i6 = (int) (comment.getReplyCommentTotal() + 1 + i6);
                        } else if (comment.getCommentType() == 2) {
                            hashMap.put(key, comment.getReplyId());
                        }
                        if (comment.getUser() != null) {
                            hashSet2.add(comment.getUser().getUid());
                        }
                        if (comment.getAliasAweme() != null) {
                            i7++;
                        }
                        i5 = 1;
                    }
                }
                if (hashSet3.size() > 0) {
                    hashSet.addAll(hashSet3);
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    if (!hashSet3.contains(entry2.getValue())) {
                        hashSet.add(entry2.getKey());
                        i6++;
                    }
                }
                final int size = hashMap2.size();
                C74Z.LJIIL(size, hashSet2.size(), i7, commentListFragment.LJLILLLLZI.getEnterFrom());
                if (C176286vw.LIZ().length == 3) {
                    i = C176286vw.LIZ()[0];
                } else {
                    i = 100;
                }
                if (size > i) {
                    if (commentListFragment.getContext() == null) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(commentListFragment.getContext().getResources().getQuantityString(R.plurals.c3, size, Integer.valueOf(size)));
                    LIZ.append(commentListFragment.getContext().getResources().getQuantityString(R.plurals.c4, i, Integer.valueOf(i)));
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C26045AKb c26045AKb = new C26045AKb(commentListFragment);
                    c26045AKb.LJIIIZ(LIZIZ);
                    c26045AKb.LJIIJ();
                    return;
                }
                if (hashSet.size() <= 0 || commentListFragment.LJLJI == null) {
                    return;
                }
                ARI ari = new ARI(commentListFragment.getContext());
                commentListFragment.LLLF.LJLJI = i6;
                if (size == 1 && i7 == 1) {
                    z = true;
                    i2 = R.string.dlg;
                } else {
                    z = false;
                    i2 = R.string.dj8;
                }
                final int i8 = i7;
                ari.LJI(i2, new InterfaceC88472Yns() { // from class: X.6vT
                    @Override // X.InterfaceC88472Yns
                    public final Object invoke(Object obj) {
                        final CommentListFragment commentListFragment2 = CommentListFragment.this;
                        final java.util.Set set = hashSet;
                        int i9 = size;
                        java.util.Set set2 = hashSet2;
                        int i10 = i8;
                        commentListFragment2.getClass();
                        CommentBatchManagementApi.LIZ.getClass();
                        C25909AEv.LIZ().commentBatchDelete(TextUtils.join(",", set), commentListFragment2.LJLJI.getAid()).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new InterfaceC73463SsN<CommentBatchDeleteResponse>() { // from class: X.6tx
                            @Override // X.InterfaceC73463SsN
                            public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
                            }

                            @Override // X.InterfaceC73463SsN
                            public final void onError(Throwable th) {
                                C174436sx c174436sx;
                                long j;
                                if (!C79004UzY.LJJIFFI(set) && (th instanceof C38333F2r)) {
                                    C38333F2r c38333F2r = (C38333F2r) th;
                                    if (c38333F2r.getErrorCode() == 3017005) {
                                        String str = ((CommentBatchDeleteResponse) c38333F2r.getRawResponse()).failedCids;
                                        if (CommentListFragment.this.LLLF == null || TextUtils.isEmpty(str)) {
                                            C26045AKb c26045AKb2 = new C26045AKb(CommentListFragment.this.mo49getActivity());
                                            c26045AKb2.LJIIIIZZ(R.string.dj9);
                                            c26045AKb2.LJIIJ();
                                            return;
                                        }
                                        CommentBatchManagementViewModel commentBatchManagementViewModel2 = CommentListFragment.this.LLLF;
                                        java.util.Map<String, Comment> map2 = commentBatchManagementViewModel2.LJLJJI;
                                        int i11 = commentBatchManagementViewModel2.LJLJI;
                                        HashMap hashMap3 = (HashMap) map2;
                                        if (hashMap3.size() > 0 && i11 > 0) {
                                            String[] split = str.split(",");
                                            if (hashMap3.size() == split.length) {
                                                C26045AKb c26045AKb3 = new C26045AKb(CommentListFragment.this.mo49getActivity());
                                                c26045AKb3.LJIIIIZZ(R.string.dj9);
                                                c26045AKb3.LJIIJ();
                                                return;
                                            }
                                            for (String str2 : split) {
                                                set.remove(str2);
                                                i11--;
                                                if (hashMap3.get(str2) != null) {
                                                    i11 = (int) (i11 - ((Comment) hashMap3.get(str2)).getReplyCommentTotal());
                                                }
                                            }
                                            if (set.size() > 0 && (c174436sx = CommentListFragment.this.LLILZLL) != null) {
                                                c174436sx.LJIIIZ(hashMap3, set);
                                                CommentListFragment commentListFragment3 = CommentListFragment.this;
                                                if (i11 > 0) {
                                                    j = -i11;
                                                } else {
                                                    j = 0;
                                                }
                                                commentListFragment3.Xo(j);
                                                CommentListFragment.this.no(hashMap3);
                                                CommentListFragment.this.LLLF.iv0().postValue(Integer.valueOf(hashMap3.size()));
                                            }
                                            C26045AKb c26045AKb4 = new C26045AKb(CommentListFragment.this.mo49getActivity());
                                            c26045AKb4.LJIIIIZZ(R.string.djd);
                                            c26045AKb4.LJIIJ();
                                            return;
                                        }
                                        return;
                                    }
                                    C178296zB.LIZJ(CommentListFragment.this.getContext(), c38333F2r, R.string.dj9);
                                    return;
                                }
                                C26045AKb c26045AKb5 = new C26045AKb(CommentListFragment.this.mo49getActivity());
                                c26045AKb5.LJIIIIZZ(R.string.dj9);
                                c26045AKb5.LJIIJ();
                            }

                            @Override // X.InterfaceC73463SsN
                            public final void onSuccess(CommentBatchDeleteResponse commentBatchDeleteResponse) {
                                CommentListFragment commentListFragment3 = CommentListFragment.this;
                                CommentBatchManagementViewModel commentBatchManagementViewModel2 = commentListFragment3.LLLF;
                                if (commentBatchManagementViewModel2 == null) {
                                    return;
                                }
                                commentListFragment3.co(commentBatchManagementViewModel2.LJLJI, commentBatchManagementViewModel2.LJLJJI, set, true);
                                C26045AKb c26045AKb2 = new C26045AKb(CommentListFragment.this.mo49getActivity());
                                c26045AKb2.LJIIIIZZ(R.string.dj_);
                                c26045AKb2.LJIIJ();
                                CommentListFragment.this.Rn(0);
                                CommentListFragment.this.Un(set);
                            }
                        });
                        C74Z.LJIILIIL(i9, set2.size(), i10, commentListFragment2.LJLILLLLZI.getEnterFrom());
                        return C76800UCe.LIZ;
                    }
                });
                ari.LJIIIIZZ(R.string.dj7, new AObjectS45S0101000_13(3, commentListFragment, 0));
                if (i7 > 0 && C176016vV.LIZ()) {
                    if (z) {
                        i3 = R.string.dli;
                        i4 = R.string.dlh;
                    } else {
                        i3 = R.string.dld;
                        i4 = R.string.dlc;
                    }
                    C26227ARb LIZ2 = C3AW.LIZ(commentListFragment.requireContext());
                    LIZ2.LJ(i3);
                    LIZ2.LIZIZ(commentListFragment.mo49getActivity().getResources().getString(i4));
                    LIZ2.LJIIL = ari;
                    LIZ2.LJII = false;
                    C26231ARf LJI = LIZ2.LJI();
                    commentListFragment.LLLLLL = LJI;
                    LJI.LIZLLL();
                } else {
                    C26227ARb LIZ3 = C3AW.LIZ(commentListFragment.requireContext());
                    LIZ3.LJFF(commentListFragment.mo49getActivity().getResources().getQuantityString(R.plurals.c1, size, Integer.valueOf(size)));
                    LIZ3.LIZIZ(commentListFragment.mo49getActivity().getResources().getQuantityString(R.plurals.c0, size, Integer.valueOf(size)));
                    LIZ3.LJIIL = ari;
                    LIZ3.LJII = false;
                    C26231ARf LJI2 = LIZ3.LJI();
                    commentListFragment.LLLLLL = LJI2;
                    LJI2.LIZLLL();
                }
                String enterFrom = commentListFragment.LJLILLLLZI.getEnterFrom();
                C188727au LIZLLL = KNV.LIZLLL(enterFrom, "enterFrom");
                LIZLLL.LJIIIZ("enter_from", enterFrom);
                FMX.LJIIL("comment_batch_management_delete_confirm_sw", LIZLLL.LIZ);
                return;
            case 2:
                ((MFS) aCListenerS22S0101000_3.l0).P();
                return;
            case 3:
                aCListenerS22S0101000_3.l0.getClass();
                FMX.LJIIL("enter_request_verification", new HashMap());
                try {
                    C61200O0e.LIZLLL().LJII(C2YJ.LIZIZ.LIZ.getMtcertSettings().getCertUrlSchema());
                    return;
                } catch (C158056If unused) {
                    SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2fmain%2fverification%2f%3fhide_nav_bar%3d1&hide_nav_bar=1").open();
                    return;
                }
            default:
                ((C45507HtX) aCListenerS22S0101000_3.l0).LJLJLLL.performClick();
                return;
        }
    }

    public static final void onClick$7(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        String str;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                CommentInputFragment commentInputFragment = (CommentInputFragment) ((Fragment) aCListenerS22S0101000_3.l0);
                InterfaceC178496zV interfaceC178496zV = commentInputFragment.LL;
                Aweme aweme = commentInputFragment.getAweme();
                InterfaceC178496zV interfaceC178496zV2 = commentInputFragment.LL;
                if (interfaceC178496zV2 != null && interfaceC178496zV2.s3() != null) {
                    str = commentInputFragment.LL.s3().getCid();
                } else {
                    str = "";
                }
                interfaceC178496zV.l(str, aweme);
                return;
            default:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS22S0101000_3.l0)).lambda$initUnits$104(view);
                return;
        }
    }

    public static final void onClick$8(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        int i;
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                CommentInputFragment commentInputFragment = (CommentInputFragment) aCListenerS22S0101000_3.l0;
                Aweme aweme = commentInputFragment.getAweme();
                if (aweme != null && !aweme.getAwemeControl().canComment()) {
                    return;
                }
                GiftViewModel giftViewModel = (GiftViewModel) ViewModelProviders.of(commentInputFragment.mo49getActivity()).get(GiftViewModel.class);
                GiftStruct value = giftViewModel.jv0().getValue();
                if (VideoGiftService.LJI().LIZIZ() && value != null && !value.isFromGiftBag() && giftViewModel.iv0().getValue().longValue() != Long.MIN_VALUE && value.getDiamondCount() > giftViewModel.iv0().getValue().longValue()) {
                    ARH arh = new ARH(commentInputFragment.mo49getActivity());
                    arh.LJ(R.string.tq2, new AObjectS85S0300000_3(commentInputFragment, value, giftViewModel, 2));
                    arh.LJI(R.string.cg_, new AObjectS121S0200000_3(giftViewModel, view, 3));
                    C26227ARb c26227ARb = new C26227ARb(commentInputFragment.mo49getActivity());
                    c26227ARb.LJ(R.string.tpe);
                    c26227ARb.LJIIL = arh;
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                if (commentInputFragment.LLD.LJJLIIIJILLIZJL(1)) {
                    return;
                }
                commentInputFragment.LLIIIILZ = "keyboard_enter";
                commentInputFragment.LLD.LJJJJJL("comment_panel");
                C177156xL c177156xL = new C177156xL();
                c177156xL.LJIIIIZZ = commentInputFragment.LJLJJL.getEmojiSpanList();
                C176996x5 c176996x5 = commentInputFragment.LLD;
                Editable text = commentInputFragment.LJLJJL.getText();
                ArrayList<TextExtraStruct> mentionExtraStructList = commentInputFragment.LJLJJL.getMentionExtraStructList();
                C176996x5 c176996x52 = commentInputFragment.LLD;
                c176996x5.LJJJI(text, mentionExtraStructList, c176996x52.LJZI, c176996x52.LJZL, true, c177156xL);
                return;
            case 1:
                ((KMV) aCListenerS22S0101000_3.l0).onBackPressed();
                return;
            default:
                C51325KCj c51325KCj = (C51325KCj) aCListenerS22S0101000_3.l0;
                if (c51325KCj.LJLLLLLL != null) {
                    SearchSugMobHelper searchSugMobHelper = c51325KCj.LLD;
                    if (searchSugMobHelper != null) {
                        searchSugMobHelper.gv0("sug", Integer.valueOf(c51325KCj.LJZ), "complete", c51325KCj.LJLLLLLL);
                    }
                    C2U8.LIZ(new C178686zo(c51325KCj.LJLLLLLL.content));
                    K75 k75 = c51325KCj.LJLLLL;
                    if (k75 != null && k75.LIZIZ() != null) {
                        i = c51325KCj.LJLLLL.LIZIZ().LIZIZ();
                    } else {
                        i = 0;
                    }
                    K56.LJ(c51325KCj.LJZ, c51325KCj.LJLLLLLL, c51325KCj.LJLZ, i);
                    return;
                }
                return;
        }
    }

    public static final void onClick$9(ACListenerS22S0101000_3 aCListenerS22S0101000_3, View view) {
        switch (aCListenerS22S0101000_3.i1) {
            case 0:
                CommentListFragment commentListFragment = (CommentListFragment) ((Fragment) aCListenerS22S0101000_3.l0);
                Aweme aweme = commentListFragment.LJLJI;
                if ((aweme != null && !aweme.getAwemeControl().canComment()) || commentListFragment.LLIZ.LJIIIZ()) {
                    return;
                }
                GiftViewModel giftViewModel = (GiftViewModel) ViewModelProviders.of(commentListFragment.mo49getActivity()).get(GiftViewModel.class);
                GiftStruct value = giftViewModel.jv0().getValue();
                if (VideoGiftService.LJI().LIZIZ() && value != null && !value.isFromGiftBag() && giftViewModel.iv0().getValue().longValue() != Long.MIN_VALUE && value.getDiamondCount() > giftViewModel.iv0().getValue().longValue()) {
                    ARH arh = new ARH(commentListFragment.mo49getActivity());
                    arh.LJ(R.string.tq2, new AObjectS85S0300000_3(commentListFragment, value, giftViewModel, 4));
                    arh.LJI(R.string.cg_, new AObjectS121S0200000_3(giftViewModel, view, 6));
                    C26227ARb c26227ARb = new C26227ARb(commentListFragment.LLLLJ);
                    c26227ARb.LJ(R.string.tpe);
                    c26227ARb.LJIIL = arh;
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                commentListFragment.LLIZ.LJJJJJL("comment_panel");
                commentListFragment.LLLLLLZ = "keyboard_enter";
                if (commentListFragment.LJLZ != null) {
                    C177156xL c177156xL = new C177156xL();
                    c177156xL.LJII = Integer.valueOf(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(commentListFragment.getContext(), commentListFragment.LJLJI));
                    c177156xL.LJIIIIZZ = commentListFragment.LJLZ.getEmojiSpanList();
                    C176996x5 c176996x5 = commentListFragment.LLIZ;
                    Editable text = commentListFragment.LJLZ.getText();
                    ArrayList<TextExtraStruct> mentionExtraStructList = commentListFragment.LJLZ.getMentionExtraStructList();
                    C176996x5 c176996x52 = commentListFragment.LLIZ;
                    c176996x5.LJJJI(text, mentionExtraStructList, c176996x52.LJZI, c176996x52.LJZL, true, c177156xL);
                }
                commentListFragment.Ho();
                commentListFragment.Lo();
                return;
            default:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS22S0101000_3.l0)).lambda$initUnits$11(view);
                return;
        }
    }

    public ACListenerS22S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
