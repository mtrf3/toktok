package Y;

import X.ARI;
import X.ActivityC45651qj;
import X.AnonymousClass744;
import X.BVK;
import X.BZI;
import X.C008901t;
import X.C0K6;
import X.C12830et;
import X.C147105py;
import X.C1539962p;
import X.C1545664u;
import X.C157196Ex;
import X.C164236cV;
import X.C17240m0;
import X.C188727au;
import X.C1I0;
import X.C211068Qc;
import X.C211088Qe;
import X.C220488l2;
import X.C221018lt;
import X.C222578oP;
import X.C224498rV;
import X.C26227ARb;
import X.C26231ARf;
import X.C28207B5f;
import X.C28787BRn;
import X.C2U8;
import X.C36922EeM;
import X.C38891fp;
import X.C40949G5h;
import X.C41424GNo;
import X.C42131l3;
import X.C48263Iwt;
import X.C57362MfG;
import X.C57386Mfe;
import X.C5S1;
import X.C60903NvH;
import X.C67P;
import X.C68M;
import X.C68W;
import X.C6ZT;
import X.C73943T0h;
import X.C78127UlP;
import X.C78598Ut0;
import X.C7ZV;
import X.CN1;
import X.DialogC77438UaI;
import X.EnumC2049482o;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.FMX;
import X.GQ5;
import X.GS5;
import X.GSR;
import X.InterfaceC139695e1;
import X.InterfaceC1546465c;
import X.TAV;
import X.TAW;
import X.UPJ;
import X.X1D;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.facebook.login.DeviceAuthDialog;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.deeplink.UpdateTipActivity;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.ss.android.ugc.aweme.relation.experiment.ClickMutualLabelToMutualListSetting;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDCListenerS10S0101000 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return;
        }
    }

    public static final void onClick$0(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                ((C42131l3) iDCListenerS10S0101000.l0).LJLIL.retry();
                return;
            case 1:
                ((BVK) iDCListenerS10S0101000.l0).LJLIL.retry();
                return;
            case 2:
            default:
                ((SettingNewVersionFragment) iDCListenerS10S0101000.l0).lambda$initUnits$15(view);
                return;
            case 3:
                BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) iDCListenerS10S0101000.l0;
                baseDiscoverAndSearchFragmentNew.getClass();
                if (C6ZT.LIZ(view) || C157196Ex.LIZ()) {
                    return;
                }
                baseDiscoverAndSearchFragmentNew.pm();
                return;
        }
    }

    public static final void onClick$1(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                ((Dialog) ((View.OnCreateContextMenuListener) iDCListenerS10S0101000.l0)).cancel();
                return;
            case 1:
                DialogC77438UaI dialogC77438UaI = (DialogC77438UaI) ((View.OnCreateContextMenuListener) iDCListenerS10S0101000.l0);
                DialogC77438UaI.LJJIIJZLJL(false, dialogC77438UaI.LLD);
                new Handler().postDelayed(new IDRunnableS6S0101000(1, dialogC77438UaI, 25), 100L);
                return;
            default:
                ((CommentListFragment) ((View.OnCreateContextMenuListener) iDCListenerS10S0101000.l0)).oo();
                return;
        }
    }

    public static final void onClick$2(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        Editable text;
        ExpandedTitleModule expandedTitleModule;
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                C17240m0 c17240m0 = (C17240m0) iDCListenerS10S0101000.l0;
                c17240m0.LIZJ.accept(c17240m0);
                return;
            case 1:
                DialogC77438UaI dialogC77438UaI = (DialogC77438UaI) iDCListenerS10S0101000.l0;
                DialogC77438UaI.LJJIIJZLJL(false, dialogC77438UaI.LLD);
                new Handler().postDelayed(new ARunnableS11S0101000_7(1, dialogC77438UaI, 10), 100L);
                return;
            case 2:
                ((SettingNewVersionFragment) iDCListenerS10S0101000.l0).lambda$initUnits$82(view);
                return;
            default:
                GQ5 gq5 = (GQ5) iDCListenerS10S0101000.l0;
                VideoPublishEditModel videoPublishEditModel = gq5.LJIIL;
                EditDescMobModel editDescMobModel = videoPublishEditModel.creativeModel.commonMobModel.editDescMobModel;
                if (!editDescMobModel.isMobClickTagButton) {
                    editDescMobModel.isMobClickTagButton = true;
                    FMX.LJIIL("click_tag_button", C164236cV.LIZ(videoPublishEditModel).LIZ);
                }
                GS5 gs5 = gq5.LJIIZILJ;
                if (gs5 != null && (expandedTitleModule = gs5.LJIIIZ) != null && expandedTitleModule.LJLLL.getAlpha() < 1.0f) {
                    C5S1 c5s1 = new C5S1(C60903NvH.LJ);
                    c5s1.LIZJ(R.string.p6f);
                    c5s1.LJ();
                    return;
                }
                if (gq5.LIZIZ.getSelectionEnd() > gq5.LIZIZ.getSelectionStart()) {
                    return;
                }
                GSR gsr = gq5.LIZIZ;
                if (gsr.LJLLI || (text = gsr.getText()) == null) {
                    return;
                }
                int length = text.toString().replace("\n", "").length();
                if (!TextUtils.isEmpty(gq5.LIZIZ.getAdTag())) {
                    length = gq5.LIZIZ.getNoAdTagText().replace("\n", "").length();
                }
                int LIZIZ = gq5.LJIILLIIL.LIZIZ() + C40949G5h.LIZ;
                if (length <= LIZIZ || gq5.LJIILLIIL.LIZ()) {
                    int selectionStart = Selection.getSelectionStart(text);
                    if (gq5.LJI != null && !text.toString().endsWith("#")) {
                        BaseTitleHelper baseTitleHelper = gq5.LJI;
                        String obj = text.toString();
                        baseTitleHelper.getClass();
                        o.LJIIIZ(obj, "<set-?>");
                        baseTitleHelper.LJLIL = obj;
                    }
                    HashTagMobHelper hashTagMobHelper = gq5.LJII;
                    if (hashTagMobHelper != null) {
                        hashTagMobHelper.jv0("click_tag_button");
                    }
                    if (selectionStart < 0 || gq5.LIZIZ.LJLLI) {
                        return;
                    }
                    text.insert(selectionStart, "#");
                    gq5.LIZIZ.requestFocus();
                    KeyboardUtils.LIZLLL(gq5.LIZIZ);
                    return;
                }
                C1I0.LIZIZ().LJ(GQ5.LJIJJLI, C48263Iwt.LIZLLL("#Hash unclickable because of caption length limit, caption length=", length, ", limit=", LIZIZ));
                return;
        }
    }

    public static final void onClick$3(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        String str;
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                LiveSheetFragment liveSheetFragment = (LiveSheetFragment) iDCListenerS10S0101000.l0;
                if (liveSheetFragment.LJZI > 0) {
                    liveSheetFragment.Hl(false);
                    return;
                }
                C12830et c12830et = liveSheetFragment.LJLZ;
                if (c12830et == null) {
                    return;
                }
                c12830et.LIZ();
                return;
            default:
                C1545664u c1545664u = (C1545664u) iDCListenerS10S0101000.l0;
                c1545664u.LJLLLL = c1545664u.LIZLLL(c1545664u.LJLLLL);
                c1545664u.LJJIIZ();
                c1545664u.LJLJI.setAligin(c1545664u.LJLLLL);
                InterfaceC139695e1 interfaceC139695e1 = c1545664u.LLIIIL;
                if (interfaceC139695e1 != null) {
                    String valueOf = String.valueOf(c1545664u.LJLLLL);
                    if (c1545664u.LLILZLL) {
                        str = "caption";
                    } else {
                        str = "text";
                    }
                    interfaceC139695e1.LJFF(0, valueOf, str, null);
                    return;
                }
                return;
        }
    }

    public static final void onClick$4(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        boolean z;
        String str;
        String str2;
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                LiveSheetFragment liveSheetFragment = (LiveSheetFragment) iDCListenerS10S0101000.l0;
                liveSheetFragment.Hl(false);
                liveSheetFragment.LJLLI.setState(4);
                return;
            case 1:
                MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) iDCListenerS10S0101000.l0;
                multiGuestPreviewFragment.LLJJJ = "outside";
                multiGuestPreviewFragment.Gl();
                return;
            case 2:
                DeviceAuthDialog this$0 = (DeviceAuthDialog) iDCListenerS10S0101000.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.xl();
                return;
            default:
                C1545664u c1545664u = (C1545664u) iDCListenerS10S0101000.l0;
                if (c1545664u.LLIILZL) {
                    return;
                }
                InterfaceC1546465c interfaceC1546465c = c1545664u.LLJJIII;
                if (interfaceC1546465c != null) {
                    interfaceC1546465c.LIZ();
                }
                if (c1545664u.LLIIIL == null) {
                    return;
                }
                TextFontStyleData LJFF = C68M.LJIIJ().LJFF(c1545664u.getScene());
                C67P c67p = c1545664u.LLFFF;
                if (c67p != null && c67p.getData() != null) {
                    z = c1545664u.LLFFF.getData().getHasReadTextAudio();
                } else {
                    z = false;
                }
                C67P c67p2 = c1545664u.LLFFF;
                String str3 = "";
                if (c67p2 == null || c67p2.getData() == null) {
                    str = "";
                } else {
                    str = c1545664u.LLFFF.getData().getSpeakerID();
                }
                InterfaceC139695e1 interfaceC139695e1 = c1545664u.LLIIIL;
                boolean LJIIJJI = C68W.LJIIJJI(c1545664u.getTextWrapList());
                boolean LJIIJ = C68W.LJIIJ(c1545664u.getTextWrapList());
                String str4 = c1545664u.LLIIIILZ;
                if (c1545664u.LLILZLL) {
                    str2 = "caption";
                } else {
                    str2 = "text";
                }
                if (LJFF != null) {
                    str3 = LJFF.title;
                }
                interfaceC139695e1.LJII(new C147105py(LJIIJJI, LJIIJ, str4, 0, str2, null, str3, z, str, false));
                return;
        }
    }

    public static final void onClick$5(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                ((LiveSheetFragment) iDCListenerS10S0101000.l0).LJLZ.LIZ();
                return;
            case 1:
                LiveNewAudienceEndFragment liveNewAudienceEndFragment = (LiveNewAudienceEndFragment) iDCListenerS10S0101000.l0;
                liveNewAudienceEndFragment.getClass();
                if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_exit_liveroom_click", 0.1d)) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_exit_liveroom_click");
                    LIZ.LJIILLIIL(liveNewAudienceEndFragment.LJLJJI);
                    LIZ.LJJIIJZLJL();
                }
                C28207B5f.LIZ(liveNewAudienceEndFragment.LJLJJI, "normal");
                UPJ.LJFF(5, C73943T0h.LIZ());
                return;
            case 2:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) iDCListenerS10S0101000.l0;
                i18nSettingManageMyAccountActivity.getClass();
                AdAutofillService.LJIIIIZZ().LIZJ(i18nSettingManageMyAccountActivity);
                return;
            default:
                ((SettingNewVersionFragment) iDCListenerS10S0101000.l0).lambda$initUnits$88(view);
                return;
        }
    }

    public static final void onClick$6(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        int i = 0;
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                ((LiveSheetFragment) iDCListenerS10S0101000.l0).LJLZ.LJIIJ();
                return;
            case 1:
                LiveNewAudienceEndFragment liveNewAudienceEndFragment = (LiveNewAudienceEndFragment) iDCListenerS10S0101000.l0;
                if (liveNewAudienceEndFragment.LJLJJLL != null) {
                    liveNewAudienceEndFragment.LJZL.setVisibility(8);
                    liveNewAudienceEndFragment.LLFFF.setVisibility(0);
                    IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
                    if (iMicRoomService != null && iMicRoomService.jT(liveNewAudienceEndFragment.LJLJJLL) && iMicRoomService.Nl()) {
                        liveNewAudienceEndFragment.LJLJI.followOfficial(liveNewAudienceEndFragment.LJLJJLL, null);
                    } else {
                        liveNewAudienceEndFragment.LJLJI.followAnchor(liveNewAudienceEndFragment.LJLJJLL, null);
                    }
                    liveNewAudienceEndFragment.LLFFF.LJII();
                }
                liveNewAudienceEndFragment.LLII = true;
                liveNewAudienceEndFragment.Il(false);
                return;
            case 2:
                TagLayout tagLayout = (TagLayout) iDCListenerS10S0101000.l0;
                if (tagLayout.LJLJI == null) {
                    return;
                }
                C211088Qe.LIZ.getClass();
                if (C211088Qe.LIZ() && (!TagLayout.LJFF(tagLayout.LJLJI).isEmpty() || !TagLayout.LIZLLL(tagLayout.LJLJI).isEmpty())) {
                    String LIZIZ = C211068Qc.LIZIZ(tagLayout.LJLJI);
                    if (LIZIZ.equals("3-1") || LIZIZ.equals("3-2") || LIZIZ.equals("3-3")) {
                        C221018lt.LIZ("TagLayout", "[click event]");
                        if (((ClickMutualLabelToMutualListSetting) C211088Qe.LIZJ.getValue()).isMutualSheetStyle) {
                            ActivityC45651qj fragmentActivity = (ActivityC45651qj) tagLayout.LJLIL;
                            ArrayList<String> LJFF = TagLayout.LJFF(tagLayout.LJLJI);
                            ArrayList<String> LIZLLL = TagLayout.LIZLLL(tagLayout.LJLJI);
                            MutualStruct LJ = TagLayout.LJ(tagLayout.LJLJI);
                            if (LJ != null) {
                                i = LJ.getTotal();
                            }
                            o.LJIIIZ(fragmentActivity, "fragmentActivity");
                            MutualRelationServiceImpl.LIZJ().LIZIZ(fragmentActivity, LJFF, LIZLLL, i);
                        } else {
                            C57386Mfe.LIZ(tagLayout.LJLIL, tagLayout.LJLJI.getAuthor(), tagLayout.LJLILLLLZI);
                        }
                        C57362MfG c57362MfG = new C57362MfG();
                        c57362MfG.LJJIIZI(tagLayout.LJLILLLLZI);
                        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.CLICK_REC_LABEL;
                        c57362MfG.LJJIJIIJI(EnumC2049482o.CLICK_REC_LABEL);
                        c57362MfG.LJJIIZ(tagLayout.LJLJI);
                        c57362MfG.LJJJJIZL(tagLayout.LJLJI.getAuthor());
                        c57362MfG.LJJJJ(tagLayout.LJLJI.getLogPbString());
                        c57362MfG.LJJLI = EnumC57366MfK.ITEM;
                        c57362MfG.LJJJJI();
                        C220488l2.LIZIZ.LJII(tagLayout.LJLJI, c57362MfG);
                        C222578oP.LIZIZ(c57362MfG, tagLayout.LJLJI, null, null, null);
                        c57362MfG.LJJIZ();
                        return;
                    }
                }
                C2U8.LIZ(new C224498rV(tagLayout.LJLIL.hashCode(), 0));
                C7ZV c7zv = new C7ZV();
                C220488l2 c220488l2 = C220488l2.LIZIZ;
                c220488l2.LJII(tagLayout.LJLJI, c7zv);
                C222578oP.LIZIZ(c7zv, tagLayout.LJLJI, null, null, null);
                c7zv.LIZLLL = tagLayout.LJLILLLLZI;
                c7zv.LJJLIIIJJIZ = tagLayout.LJLJI.getAuthorUid();
                c7zv.LJLLLL = Boolean.TRUE;
                c7zv.LJIJI = C211068Qc.LIZIZ(tagLayout.LJLJI);
                c7zv.LJJLI = "click_rec_label";
                c7zv.LJIILIIL();
                C57362MfG c57362MfG2 = new C57362MfG();
                c57362MfG2.LJJIIZI(tagLayout.LJLILLLLZI);
                c57362MfG2.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
                c57362MfG2.LJJIJIIJI(EnumC2049482o.CLICK_REC_LABEL);
                c57362MfG2.LJJIIZ(tagLayout.LJLJI);
                c57362MfG2.LJJJJIZL(tagLayout.LJLJI.getAuthor());
                c57362MfG2.LJJJJ(tagLayout.LJLJI.getLogPbString());
                c57362MfG2.LJJLI = EnumC57366MfK.ITEM;
                c57362MfG2.LJJJJI();
                c220488l2.LJII(tagLayout.LJLJI, c57362MfG2);
                C222578oP.LIZIZ(c57362MfG2, tagLayout.LJLJI, null, null, null);
                c57362MfG2.LJJIZ();
                return;
            case 3:
                C1545664u c1545664u = (C1545664u) iDCListenerS10S0101000.l0;
                c1545664u.getClass();
                C1539962p.LIZIZ().LIZJ();
                c1545664u.LLFII.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
                return;
            case 4:
                ChooseMusicActivity chooseMusicActivity = (ChooseMusicActivity) iDCListenerS10S0101000.l0;
                chooseMusicActivity.LLFII();
                chooseMusicActivity.finish();
                return;
            default:
                ((SettingNewVersionFragment) iDCListenerS10S0101000.l0).lambda$maybeCreateRemoveAccountOption$115(view);
                return;
        }
    }

    public static final void onClick$7(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                LiveDialog liveDialog = (LiveDialog) iDCListenerS10S0101000.l0;
                liveDialog.cancel();
                C0K6 c0k6 = liveDialog.LLIIJLIL;
                if (c0k6 != null) {
                    c0k6.LIZ(liveDialog, view);
                    return;
                }
                return;
            case 1:
                UserProfileEvent userProfileEvent = new UserProfileEvent(((Room) iDCListenerS10S0101000.l0).getOwner().getId());
                userProfileEvent.mSource = "video_head";
                C73943T0h.LIZ().LIZIZ(userProfileEvent);
                return;
            case 2:
                ContextWrapper contextWrapper = (ContextWrapper) iDCListenerS10S0101000.l0;
                contextWrapper.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "reactive_account");
                FMX.LJIIL("enter_data_download", c188727au.LIZ);
                Context applicationContext = contextWrapper.getApplicationContext();
                if (C38891fp.LJLJI && applicationContext == null) {
                    applicationContext = C38891fp.LJLILLLLZI;
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(applicationContext, "aweme://hyd_action/dyd_main");
                buildRoute.withParam("enter_from", "reactive_account");
                buildRoute.withParam("hide_nav_bar", true);
                buildRoute.open();
                return;
            case 3:
                ((BaseDiscoverMusicFragment) iDCListenerS10S0101000.l0).wl();
                return;
            case 4:
                ((UpdateTipActivity) iDCListenerS10S0101000.l0).LLFII();
                return;
            case 5:
                LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = (LiveWallPaperPreviewActivity) iDCListenerS10S0101000.l0;
                liveWallPaperPreviewActivity.getClass();
                C41424GNo c41424GNo = new C41424GNo(liveWallPaperPreviewActivity);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new TAW(liveWallPaperPreviewActivity.getResources().getString(R.string.efd)));
                arrayList.add(new TAW(liveWallPaperPreviewActivity.getResources().getString(R.string.cg_)));
                TAV tav = new TAV(liveWallPaperPreviewActivity, arrayList);
                IDCListenerS51S0200000_9 iDCListenerS51S0200000_9 = new IDCListenerS51S0200000_9(tav, liveWallPaperPreviewActivity, 2);
                C008901t c008901t = c41424GNo.LIZ.LIZ;
                c008901t.LJIILLIIL = tav;
                c008901t.LJIIZILJ = iDCListenerS51S0200000_9;
                try {
                    c41424GNo.LIZIZ();
                    return;
                } catch (Resources.NotFoundException e) {
                    C36922EeM.LJFF(e);
                    return;
                }
            default:
                Fragment fragment = (Fragment) iDCListenerS10S0101000.l0;
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

    public static final void onClick$8(IDCListenerS10S0101000 iDCListenerS10S0101000, View view) {
        switch (iDCListenerS10S0101000.i1) {
            case 0:
                ((Dialog) iDCListenerS10S0101000.l0).cancel();
                return;
            case 1:
                ((AnonymousClass744) iDCListenerS10S0101000.l0).P(view, "click_comment_head");
                return;
            case 2:
                UpdateTipActivity updateTipActivity = (UpdateTipActivity) iDCListenerS10S0101000.l0;
                updateTipActivity.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("market://details?id=");
                    LIZ.append(updateTipActivity.getPackageName());
                    intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
                    intent.setPackage("com.android.vending");
                    if (intent.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
                        C78598Ut0.LJIJJ(intent, updateTipActivity);
                        updateTipActivity.startActivity(intent);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("https://play.google.com/store/apps/details?id=");
                        LIZ2.append(updateTipActivity.getPackageName());
                        intent2.setData(UriProtector.parse(X1D.LIZIZ(LIZ2)));
                        if (intent2.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                            intent2.putExtra("pns.sandbox.dataflow_id", 1207965953);
                            C78598Ut0.LJIJJ(intent2, updateTipActivity);
                            updateTipActivity.startActivity(intent2);
                        }
                    }
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("https://play.google.com/store/apps/details?id=");
                    LIZ3.append(updateTipActivity.getPackageName());
                    intent3.setData(UriProtector.parse(X1D.LIZIZ(LIZ3)));
                    if (intent3.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                        C78598Ut0.LJIJJ(intent3, updateTipActivity);
                        updateTipActivity.startActivity(intent3);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("schema_url", updateTipActivity.LJLIL);
                hashMap.put("click_position", "update");
                FMX.LJIIL("schema_update_toast_click", hashMap);
                return;
            case 3:
                ((LiveWallPaperPreviewActivity) iDCListenerS10S0101000.l0).showSettingDialog(view);
                return;
            case 4:
                Fragment fragment = (Fragment) iDCListenerS10S0101000.l0;
                if (!PushSettingManagerFragmentSecondVersion.wl(fragment.getContext())) {
                    return;
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(fragment.getContext(), "aweme://push_setting_notification_choice");
                buildRoute.withParam("enter_from", "settings_page");
                buildRoute.open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("label", "live_push");
                FMX.LJIIL("enter_push_setting_detail", c188727au.LIZ);
                return;
            default:
                ((SettingNewVersionFragment) iDCListenerS10S0101000.l0).lambda$initUnits$59(view);
                return;
        }
    }

    public IDCListenerS10S0101000(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
