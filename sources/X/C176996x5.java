package X;

import Y.ACListenerS10S2100000_3;
import Y.ACListenerS20S0201000_2;
import Y.ACListenerS21S0201000_3;
import Y.ACListenerS29S0300000_3;
import Y.ACListenerS38S0200000_3;
import Y.AObjectS42S0201000_13;
import Y.AObjectS45S0101000_13;
import Y.ARunnableS17S0101000_13;
import Y.AfS1S2200000_3;
import Y.AfS23S0110000_3;
import Y.AfS36S0101000_5;
import Y.IDDListenerS143S0100000_3;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ad.comment.pitaya.PitayaServiceManager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRepostCardAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.bottom.BottomBarViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.zhiliaoapp.musically.R;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.6x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176996x5 implements C7YC, InterfaceC177116xH, InterfaceC176716wd, C7AY, InterfaceC1791671k, InterfaceC40402FtO, G27 {
    public C177146xK LJLIL;
    public C224748ru LJLILLLLZI;
    public Fragment LJLJI;
    public final InterfaceC177046xA LJLJJI;
    public java.util.Map<String, C176646wW> LJLJJLL;
    public final C176606wS LJLJL;
    public C175226uE LJLJLJ;
    public C174386ss LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public String LJZ;
    public Emoji LJZI;
    public List<CommentImageModel> LJZL;
    public ViewOnTouchListenerC177066xC LLF;
    public ACListenerS10S2100000_3 LLFF;
    public View LLFFF;
    public View LLFII;
    public View LLFZ;
    public DataCenter LLI;
    public TextView LLIFFJFJJ;
    public TuxActionSheet LLIIIL;
    public DialogInterfaceC39771hF LLIIIZ;
    public ViewGroup LLIIJI;
    public final GiftViewModel LLIIJLIL;
    public final BottomBarViewModel LLIIL;
    public View LLIILII;
    public boolean LLIIZ;
    public boolean LLILZLL;
    public final HashSet<User> LJLJJL = new HashSet<>();
    public String LJLLJ = "";
    public boolean LJLLL = true;
    public boolean LJLLLL = true;
    public String LJLLLLLL = "";
    public EnumC177736yH LJLZ = EnumC177736yH.DEFAULT;
    public boolean LL = false;
    public int LLD = 0;
    public boolean LLII = false;
    public String LLIIII = "";
    public boolean LLIIIILZ = false;
    public final List<EditText> LLIIIJ = new CopyOnWriteArrayList();
    public final IVideoGiftService LLIILZL = VideoGiftService.LJI();
    public final List<InterfaceC177096xF> LLIL = new CopyOnWriteArrayList();
    public boolean LLILII = false;
    public boolean LLILIL = false;
    public boolean LLILL = false;
    public int LLILLIZIL = -1;
    public int LLILLJJLI = -1;
    public int LLILLL = -1;
    public boolean LLILZ = false;
    public boolean LLILZIL = false;

    public final void LJJJLL() {
        int i;
        String string;
        String string2;
        boolean z;
        boolean z2;
        if (!LJJIJIIJI()) {
            return;
        }
        if (C72O.LIZ()) {
            Context context = this.LJLJI.getContext();
            Aweme commentInputAweme = this.LJLJJI.getCommentInputAweme();
            if (this.LJLZ == EnumC177736yH.POST_MODE) {
                z = true;
            } else {
                z = false;
            }
            if (LJIJ() != CommentVideoModel.Type.COMMENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLL = new C177026x8(context, commentInputAweme, this, z, z2, true).LIZ();
        } else {
            InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
            if (interfaceC177046xA != null) {
                i = LJIJJ(interfaceC177046xA.getCommentInputAweme());
            } else {
                i = 4;
            }
            if (i == 4) {
                this.LJLL = this.LJLJI.getResources().getString(R.string.dix);
            } else if (i == 0) {
                this.LJLL = this.LJLJI.getResources().getString(R.string.qa6);
            } else if (i == 1) {
                Aweme commentInputAweme2 = this.LJLJJI.getCommentInputAweme();
                Resources resources = this.LJLJI.getResources();
                if (commentInputAweme2 != null && AV1.LJIJI(commentInputAweme2.getAuthorUid())) {
                    if (this.LJLZ == EnumC177736yH.POST_MODE) {
                        string2 = resources.getString(R.string.dix);
                    } else {
                        string2 = resources.getString(R.string.dks);
                    }
                    this.LJLL = string2;
                } else {
                    if (this.LJLZ == EnumC177736yH.POST_MODE) {
                        string = resources.getString(R.string.dix);
                    } else {
                        string = resources.getString(R.string.dm_);
                    }
                    this.LJLL = string;
                }
            } else if (i == 2) {
                this.LJLL = this.LJLJI.getResources().getString(R.string.dk7);
            } else {
                int commentInputViewType = this.LJLJJI.getCommentInputViewType();
                if (commentInputViewType != 1) {
                    if (commentInputViewType != 2) {
                        if (commentInputViewType != 3) {
                            if (commentInputViewType != 4) {
                                if (commentInputViewType != 7) {
                                    if (commentInputViewType != 10) {
                                        this.LJLL = this.LJLJI.getResources().getString(R.string.dix);
                                    } else if (this.LJZL != null) {
                                        this.LJLL = this.LJLJI.getResources().getString(R.string.dih);
                                    }
                                } else {
                                    this.LJLL = this.LJLJI.getResources().getString(R.string.bf8);
                                }
                            } else {
                                this.LJLL = this.LJLJI.getResources().getString(R.string.gll);
                            }
                        } else {
                            Comment commentInputReplyComment = this.LJLJJI.getCommentInputReplyComment();
                            if (commentInputReplyComment != null) {
                                this.LJLL = this.LJLJI.getResources().getString(R.string.q22, C1799274i.LJ(commentInputReplyComment.getUser(), this.LJLJJI.getEventType()));
                            }
                        }
                    } else if (LJJIIZ()) {
                        this.LJLL = this.LJLJI.getResources().getString(R.string.q3o);
                    } else if (C7HV.LIZIZ.LJIL().LIZJ(LJIIZILJ()) && this.LJLZ != EnumC177736yH.POST_MODE) {
                        this.LJLL = this.LJLJI.getResources().getString(R.string.q3p);
                    } else {
                        this.LJLL = C178406zM.LJI(LJIIZILJ(), this.LJLJI.getResources().getString(R.string.dix));
                    }
                } else {
                    this.LJLL = C178406zM.LJI(LJIIZILJ(), this.LJLJI.getResources().getString(R.string.dix));
                }
            }
        }
        C224748ru c224748ru = this.LJLILLLLZI;
        if (c224748ru != null && TextUtils.isEmpty(c224748ru.getText())) {
            this.LJLILLLLZI.setHint(this.LJLL);
        }
    }

    @Override // X.C7AY
    public final void LIZJ() {
        C174076sN.LIZIZ(Boolean.FALSE);
    }

    public final boolean LJIIIZ() {
        Aweme commentInputAweme = this.LJLJJI.getCommentInputAweme();
        if (commentInputAweme != null && commentInputAweme.isCmtSwt()) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.b84);
            c5s1.LJ();
            return true;
        }
        Aweme commentInputAweme2 = this.LJLJJI.getCommentInputAweme();
        if (commentInputAweme2 != null && commentInputAweme2.isScheduleVideo()) {
            return true;
        }
        Aweme commentInputAweme3 = this.LJLJJI.getCommentInputAweme();
        if (commentInputAweme3 != null && commentInputAweme3.getVideoControl() != null && commentInputAweme3.getVideoControl().timerStatus == 0) {
            Fragment fragment = this.LJLJI;
            if (fragment == null || fragment.getContext() == null) {
                EF7.LIZIZ();
            }
            return true;
        }
        if (this.LJLJJI.checkCommentInputable()) {
            CommentService.LIZ.getClass();
            if (!CommentServiceImpl.LJJL().LJIILLIIL(this.LJLJJI.getCommentInputAweme()) && CommentServiceImpl.LJJL().LJJIJIIJI(this.LJLJJI.getCommentInputAweme()) && !C80S.LJFF(this.LJLJJI.getCommentInputAweme()) && !AV1.LJIIJJI()) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJIIJ() {
        if (this.LJLJJI.isLandscapeMode()) {
            return false;
        }
        return true;
    }

    public final C176646wW LJIILIIL() {
        C176646wW c176646wW = new C176646wW();
        c176646wW.LJLILLLLZI = this;
        this.LJLJJI.getEventType();
        return c176646wW;
    }

    public final void LJIILJJIL() {
        TuxActionSheet tuxActionSheet = this.LLIIIL;
        if (tuxActionSheet != null) {
            tuxActionSheet.dismiss();
            this.LLIIIL = null;
        }
    }

    public final String LJIILL() {
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null && interfaceC177046xA.getCommentInputAweme() != null) {
            return this.LJLJJI.getCommentInputAweme().getAid();
        }
        return "";
    }

    public final String LJIILLIIL() {
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null && interfaceC177046xA.getCommentInputAweme() != null) {
            return this.LJLJJI.getCommentInputAweme().getAuthorUid();
        }
        return "";
    }

    public final Aweme LJIIZILJ() {
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA == null) {
            return null;
        }
        return interfaceC177046xA.getCommentInputAweme();
    }

    public final CommentVideoModel.Type LJIJ() {
        CommentVideoModel.Type type;
        CommentVideoModel.Type type2 = CommentVideoModel.Type.NONE;
        Fragment fragment = this.LJLJI;
        if ((fragment instanceof CommentListFragment) && ((CommentListFragment) fragment).vn() && !LJJIJ(LJIIZILJ())) {
            type = CommentVideoModel.Type.COMMENT;
        } else {
            type = type2;
        }
        if (this.LLILII && !LJJIJ(LJIIZILJ())) {
            type = CommentVideoModel.Type.COMMENT;
        }
        if (this.LJLJJI.isLandscapeMode()) {
            return type2;
        }
        return type;
    }

    public final String LJIJJLI() {
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            return this.LJLLLLLL;
        }
        if (this.LJLJJI.getEventType() == null) {
            return "";
        }
        return this.LJLJJI.getEventType();
    }

    public final String LJIL() {
        if (this.LJLJJI.getFromPage() == null) {
            return "";
        }
        return this.LJLJJI.getFromPage();
    }

    public final int LJJ() {
        boolean z;
        if (this.LJLJJI.getCommentInputViewType() == 4) {
            z = true;
        } else {
            z = false;
        }
        return LJJI(z);
    }

    public final String LJJIFFI() {
        return this.LJLJI.getString(C7HV.LIZIZ.LJIIJ(R.string.ptn, R.string.q2m));
    }

    public final boolean LJJIII() {
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if ((interfaceC177046xA != null && "click_repost_button".equals(interfaceC177046xA.getEnterMethod())) || "click_add_recommendation".equals(this.LJLLJ)) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIZ() {
        String str = this.LJLLJ;
        if (TextUtils.equals(this.LJLJJI.getEnterMethod(), "click_repost_button") || "click_add_recommendation".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIZI() {
        int i;
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null) {
            i = LJIJJ(interfaceC177046xA.getCommentInputAweme());
        } else {
            i = 4;
        }
        if (i != 1 && i != 2) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJIIJI() {
        Fragment fragment = this.LJLJI;
        if (fragment != null && fragment.isAdded()) {
            return true;
        }
        return false;
    }

    public final void LJJIJIIJIL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("position", "comment");
        c188727au.LJIIIZ("enter_from", this.LJLLLLLL);
        FMX.LJIIL("click_emoji_entrance", c188727au.LIZ);
    }

    public final void LJJJJLI() {
        GiftStruct value;
        C224748ru c224748ru = this.LJLILLLLZI;
        if (c224748ru != null) {
            c224748ru.setText("");
            LJJJLL();
            this.LJLILLLLZI.setHint(this.LJLL);
            View view = this.LLFII;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            LJJIJLIJ(this.LJLILLLLZI);
        }
        this.LJZL = null;
        GiftViewModel giftViewModel = this.LLIIJLIL;
        if (giftViewModel != null) {
            MutableLiveData<GiftStruct> jv0 = giftViewModel.jv0();
            if (jv0.getValue() != null && (value = this.LLIIJLIL.jv0().getValue()) != null) {
                this.LLILLJJLI = value.getDiamondCount();
                if (value.getSelectedIndex() != null) {
                    this.LLILLL = value.getSelectedIndex().intValue();
                }
            }
            jv0.setValue(null);
            this.LLIIJLIL.LJLLLL = false;
        }
        this.LJLJJL.clear();
    }

    public final void LJJJJZI() {
        InterfaceC177046xA interfaceC177046xA;
        if (this.LJLJI.mo49getActivity() != null && (interfaceC177046xA = this.LJLJJI) != null && interfaceC177046xA.getCommentInputReplyComment() != null) {
            Comment commentInputReplyComment = this.LJLJJI.getCommentInputReplyComment();
            String awemeId = commentInputReplyComment.getAwemeId();
            String cid = commentInputReplyComment.getCid();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", awemeId);
            c188727au.LJIIIZ("reply_comment_id", cid);
            c188727au.LJIIIZ("author_id", ((RBX) HG3.LJIILL()).getCurUserId());
            FMX.LJIIL("comment_reply_toast_show", c188727au.LIZ);
        }
    }

    @Override // X.C7AY
    public final void LIZ() {
        if (!LJJIJIIJI()) {
            return;
        }
        LJJJLL();
        LJJLI(this.LJLL, false);
    }

    @Override // X.C7AY
    public final void LIZLLL() {
        InterfaceC177046xA interfaceC177046xA;
        long j;
        if (!LJJIJIIJI() || (interfaceC177046xA = this.LJLJJI) == null || interfaceC177046xA.getCommentInputAweme() == null) {
            return;
        }
        Bundle LJIJI = LJIJI(this.LJLL);
        LJIJI.putInt("publishScenario", 2);
        LJIJI.putBoolean("hideGiftIcon", true);
        C186577Tx.LIZIZ("quick_comment", LJIJJLI());
        KeyboardDialogFragment Al = KeyboardDialogFragment.Al(this.LJLJJI.getCommentInputViewType(), this.LJLJJI.hasUpvoteOption(), LJIJJLI(), LJIJI, this.LLILZ);
        if (C72O.LIZ()) {
            C174076sN.LIZ();
        }
        LJIIJJI(Al);
        Aweme commentInputAweme = this.LJLJJI.getCommentInputAweme();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LJIJJLI());
        c188727au.LJIIIZ("group_id", commentInputAweme.getAid());
        c188727au.LJIIIZ("action_type", "text");
        c188727au.LJIIIZ("author_id", commentInputAweme.getAuthorUid());
        FMX.LJIIL("click_quick_comment_panel", c188727au.LIZ);
        if (C77321UWf.LIZLLL(commentInputAweme, false)) {
            C74Z.LJJIIJ(LJIJJLI());
        }
        if (LJIIZILJ() != null && LJIIZILJ().getStatistics() != null) {
            j = LJIIZILJ().getStatistics().getCommentCount();
        } else {
            j = 0;
        }
        C1793872g.LJII(LJIJJLI(), commentInputAweme, "", "click_quick_panel", null, j, 1);
    }

    @Override // X.C7AY
    public final boolean LJI() {
        if (C175276uJ.LIZJ() && this.LJZL != null && !this.LLILZIL) {
            return true;
        }
        return false;
    }

    public final void LJJIIJ() {
        DialogFragment dialogFragment;
        if (LJJIJIIJI() && (dialogFragment = (DialogFragment) this.LJLJI.getChildFragmentManager().LJJJIL("CommentInputManager")) != null) {
            try {
                dialogFragment.dismiss();
            } catch (IllegalStateException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static int LJIJJ(Aweme aweme) {
        if (aweme == null) {
            return 4;
        }
        if (aweme.isScheduleVideo()) {
            return 0;
        }
        CommentService.LIZ.getClass();
        if (CommentServiceImpl.LJJL().LJIILLIIL(aweme)) {
            return 1;
        }
        if (!CommentServiceImpl.LJJL().LJJIJIIJI(aweme)) {
            return 2;
        }
        return 3;
    }

    public static int LJJI(boolean z) {
        if (z) {
            return 60;
        }
        if (((Number) C177126xI.LIZ.getValue()).intValue() == 150) {
            return 150;
        }
        return C177126xI.LIZ();
    }

    public static final boolean LJJIJ(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return false;
        }
        if (aweme.nowPostInfo != null) {
            z = true;
        } else {
            z = false;
        }
        if (!C54218LPq.LJLIL.LIZ() || !z) {
            return false;
        }
        return true;
    }

    public static boolean LJJL(Aweme aweme) {
        if (aweme == null || aweme.isProhibited() || aweme.getCommentSetting() == 3) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        int commentSetting = author.getCommentSetting();
        int commentSetting2 = aweme.getCommentSetting();
        if (commentSetting == 3 || commentSetting2 == 3) {
            return true;
        }
        if (AccountService.LJIJ().LJFF().isMe(author.getUid())) {
            if (AccountService.LJIJ().LJFF().getCurUser().getCommentSetting() == 3 || aweme.getCommentSetting() == 3) {
                return true;
            }
            return false;
        }
        if (commentSetting == 1) {
            if (!C80S.LIZLLL(aweme)) {
                return true;
            }
        } else if (commentSetting == 2 && !C80S.LIZIZ(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC176716wd
    public final void He(Comment comment) {
        LJJJJL(comment.getFakeId());
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null) {
            interfaceC177046xA.onCommentInputPublishOnlyGiftSuccess(comment);
            LJJII(comment);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6xC] */
    @Override // X.C7AY
    public final void LIZIZ(C177056xB c177056xB) {
        C224748ru c224748ru;
        int i;
        this.LJLLL = c177056xB.LJIIIIZZ;
        final C224748ru c224748ru2 = c177056xB.LIZIZ;
        View view = c177056xB.LIZJ;
        View view2 = c177056xB.LIZLLL;
        View view3 = c177056xB.LJ;
        TextView textView = c177056xB.LJFF;
        final String str = c177056xB.LJI;
        final String str2 = c177056xB.LJII;
        this.LJLZ = c177056xB.LJIIIZ;
        this.LJZ = str;
        this.LJLLLLLL = str2;
        this.LLILIL = false;
        if (LJIIZILJ() != null) {
            GiftViewModel giftViewModel = this.LLIIJLIL;
            String str3 = this.LJLLLLLL;
            String groupId = LJIIZILJ().getGroupId();
            String LJIILLIIL = LJIILLIIL();
            String requestId = LJIIZILJ().getRequestId();
            giftViewModel.LJLJJLL = str3;
            giftViewModel.LJLJL = groupId;
            giftViewModel.LJLJLJ = LJIILLIIL;
            giftViewModel.LJLJLLL = requestId;
        }
        this.LJLILLLLZI = c224748ru2;
        LJIIIIZZ(c224748ru2);
        this.LLIFFJFJJ = textView;
        if (textView != null) {
            if (this.LLII) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
        if (this.LJLJI == null || (c224748ru = this.LJLILLLLZI) == null) {
            return;
        }
        this.LLFF = new ACListenerS10S2100000_3(this, str2, str, 0);
        this.LLF = new View.OnTouchListener() { // from class: X.6xC
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                C176996x5 c176996x5 = C176996x5.this;
                String str4 = str2;
                String str5 = str;
                if (c176996x5.LJLILLLLZI.isFocused() || c176996x5.LJLILLLLZI.isFocusable() || c176996x5.LJLILLLLZI.isFocusableInTouchMode()) {
                    c176996x5.LJLILLLLZI.setFocusable(false);
                    c176996x5.LJLILLLLZI.setFocusableInTouchMode(false);
                }
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            return false;
                        }
                    } else {
                        view4.performClick();
                        c176996x5.LJJJJLL(view4, str4, str5);
                    }
                }
                return true;
            }
        };
        c224748ru.setFocusable(false);
        this.LJLILLLLZI.setFocusableInTouchMode(false);
        this.LJLILLLLZI.setInputType(0);
        this.LJLILLLLZI.setOnClickListener(new ViewOnClickListenerC13880ga(this.LLFF));
        this.LJLILLLLZI.setOnTouchListener(this.LLF);
        if (view != null) {
            this.LLFII = view;
            if (AV1.LJIIJJI() || this.LLII) {
                LJJJZ(this.LLFII, false);
            }
            C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.6x6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    Fragment fragment;
                    C176996x5 c176996x5 = C176996x5.this;
                    String str4 = str;
                    String str5 = str2;
                    C224748ru c224748ru3 = c224748ru2;
                    if (!c176996x5.LJJIJIIJI()) {
                        return;
                    }
                    C224748ru c224748ru4 = c176996x5.LJLILLLLZI;
                    if (c224748ru4 != null && c224748ru4.getMentionExtraStructList() != null && c176996x5.LJLILLLLZI.getMentionExtraStructList().size() >= 5 && (fragment = c176996x5.LJLJI) != null) {
                        C31811Ce7.LIZJ(fragment, R.string.i1y);
                        return;
                    }
                    if (c176996x5.LJJLIIIJJI(str4, str5, "click_comment_at") || c176996x5.LJLJJI.getCommentInputAweme() == null || C80S.LJFF(c176996x5.LJLJJI.getCommentInputAweme())) {
                        return;
                    }
                    c176996x5.LJLLILLLL = true;
                    if (C72O.LIZ()) {
                        Fragment fragment2 = c176996x5.LJLJI;
                        if ((fragment2 instanceof CommentInputFragment) || (fragment2 instanceof BottomBarFragment)) {
                            C174076sN.LIZ();
                        } else if (C7HV.LIZIZ.LJIL().LIZJ(c176996x5.LJIIZILJ())) {
                            C174076sN.LIZIZ(Boolean.TRUE);
                        }
                    }
                    CharSequence hint = c224748ru3.getHint();
                    if (!c176996x5.LJJIJIIJI()) {
                        return;
                    }
                    Bundle LJIJI = c176996x5.LJIJI(hint);
                    LJIJI.putBoolean("clickAt", true);
                    C186577Tx.LIZIZ("mention", c176996x5.LJIJJLI());
                    c176996x5.LJIIJJI(KeyboardDialogFragment.Al(c176996x5.LJLJJI.getCommentInputViewType(), c176996x5.LJLJJI.hasUpvoteOption(), c176996x5.LJIJJLI(), LJIJI, c176996x5.LLILZ));
                }
            }, this.LLFII);
        }
        if (view2 != null) {
            this.LLFZ = view2;
            if (AV1.LJIIJJI() || this.LLII) {
                view2.setVisibility(8);
            }
            new C116974iT(view2).LJJLIIIJILLIZJL(1L, TimeUnit.SECONDS).LJJJJZI(new AfS1S2200000_3(this, c224748ru2, str, str2, 0));
        }
        Aweme LJIIZILJ = LJIIZILJ();
        if (view3 != null && LJIIZILJ != null) {
            this.LLIILII = view3;
            if (this.LLIILZL.LIZ(LJIIZILJ)) {
                LJJJZ(this.LLIILII, true);
            } else {
                LJJJZ(this.LLIILII, false);
            }
            new C116974iT(this.LLIILII).LJJLIIIJILLIZJL(1L, TimeUnit.SECONDS).LJJJJZI(new AfS36S0101000_5(2, this, 2));
        }
        C88463da c88463da = C88463da.LIZ;
        c88463da.LIZ(this.LLFII, EnumC1796673i.ALPHA_BUTTON);
        View view4 = this.LLFZ;
        EnumC1796673i enumC1796673i = EnumC1796673i.BUTTON;
        c88463da.LIZ(view4, enumC1796673i);
        c88463da.LIZ(this.LLIILII, enumC1796673i);
        LJJJLL();
    }

    @Override // X.C7AY
    public final void LJ(String str) {
        InterfaceC177046xA interfaceC177046xA;
        C74Z.LJJIIJZLJL(str, "quick_panel", 3, 0, "");
        if (!LJJIJIIJI() || (interfaceC177046xA = this.LJLJJI) == null || interfaceC177046xA.getCommentInputAweme() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(str);
            i++;
        } while (i < 3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
        spannableStringBuilder.setSpan(new CommentEmojiSpan(str, 0, "", "quick_panel", 3), 0, spannableStringBuilder.length(), 33);
        this.LJLLI = 1;
        this.LJLJJI.onCommentInputPublishClick(1, sb.length() / 2, spannableStringBuilder, "", "", false, new C177156xL());
        String eventType = this.LJLJJI.getEventType();
        Aweme commentInputAweme = this.LJLJJI.getCommentInputAweme();
        C176696wb c176696wb = new C176696wb();
        c176696wb.LIZ = commentInputAweme.getAid();
        c176696wb.LIZIZ = sb.toString();
        c176696wb.LIZLLL = null;
        o.LJIIIZ(eventType, "eventType");
        c176696wb.LJIILL = eventType;
        c176696wb.LJFF = C55688LtM.LIZ(eventType);
        c176696wb.LJIIJJI = 1;
        c176696wb.LJIILIIL = 1;
        String authorUid = LJIILLIIL();
        o.LJIIIZ(authorUid, "authorUid");
        c176696wb.LJIJ = authorUid;
        C176646wW LJIILIIL = LJIILIIL();
        LJIILIIL.LJLJJLL = 1;
        LJIILIIL.LJJIIZI(c176696wb.LIZ());
        LJJJJZ(LJIILIIL);
        LJJJLZIJ(null);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LJIJJLI());
        c188727au.LJIIIZ("group_id", commentInputAweme.getAid());
        c188727au.LJIIIZ("action_type", "emoji");
        c188727au.LJIIIZ("emoji_id", str);
        c188727au.LJIIIZ("author_id", commentInputAweme.getAuthorUid());
        FMX.LJIIL("click_quick_comment_panel", c188727au.LIZ);
    }

    @Override // X.C7AY
    public final void LJFF(View view) {
        this.LLILLIZIL = 0;
        LJJJJLL(view, LJIJJLI(), this.LJZ);
    }

    public final void LJIIIIZZ(C224748ru c224748ru) {
        if (c224748ru == null || ((CopyOnWriteArrayList) this.LLIIIJ).contains(c224748ru)) {
            return;
        }
        c224748ru.addTextChangedListener(new TextWatcher() { // from class: X.6xE
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (i3 > 0) {
                    C1801075a.LIZIZ(i, i3, charSequence);
                }
            }
        });
        C224748ru c224748ru2 = this.LJLILLLLZI;
        if (c224748ru2 != null) {
            c224748ru.setText(c224748ru2.getText());
        }
        ((CopyOnWriteArrayList) this.LLIIIJ).add(c224748ru);
    }

    public final void LJIIJJI(KeyboardDialogFragment keyboardDialogFragment) {
        CommentListFragment commentListFragment;
        Aweme aweme;
        Bundle arguments = keyboardDialogFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("argIsInvokedFromFakeEditText", this.LLILLIZIL);
            this.LLILLIZIL = -1;
            if (!arguments.containsKey("hideGiftIcon")) {
                arguments.putBoolean("hideGiftIcon", LJJIII());
            }
            arguments.putString("fromPage", LJIL());
            arguments.putBoolean("arg_require_gray_background", this.LJLLL);
        }
        keyboardDialogFragment.LLIL = this;
        keyboardDialogFragment.LLIIZ = this;
        keyboardDialogFragment.LLILII = this;
        keyboardDialogFragment.LLIZ = LJIIZILJ();
        keyboardDialogFragment.LLJILJIL = this;
        C224748ru c224748ru = keyboardDialogFragment.LJLJL;
        if (c224748ru != null) {
            LJIIIIZZ(c224748ru);
        }
        keyboardDialogFragment.LLJJ = this.LLIIJLIL;
        C1791071e.LIZIZ.LJFF(C8W2.ON_RESET);
        Emoji emoji = this.LJZI;
        keyboardDialogFragment.LLJ = emoji;
        C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
        if (c176996x5 != null) {
            c176996x5.LJJJLZIJ(emoji);
        }
        CommentVideoModel.Type LJIJ = LJIJ();
        Fragment fragment = this.LJLJI;
        if ((fragment instanceof CommentListFragment) && (aweme = (commentListFragment = (CommentListFragment) fragment).LJLJI) != null && C54838Lfe.LJIIZILJ(aweme)) {
            commentListFragment.LJLJI.getStory().getTotalComments();
        }
        keyboardDialogFragment.LLJILJILJ = LJIJ;
        try {
            keyboardDialogFragment.show(this.LJLJI.getChildFragmentManager(), "CommentInputManager");
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (LJIIZILJ() != null && LJIIZILJ().isAd() && C19N.LJ("promote_comment_emotion_function", false)) {
            PitayaServiceManager.LJFF().LIZJ();
        }
    }

    public final Bundle LJIJI(CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("hint", charSequence);
        bundle.putInt("maxLength", LJJ());
        bundle.putBoolean("showAt", true);
        bundle.putString("arg_event_type", this.LJLJJI.getEventType());
        bundle.putBoolean("isLandscapeMode", this.LJLJJI.isLandscapeMode());
        return bundle;
    }

    public final void LJJII(Comment comment) {
        if (comment.getFakeIsFromGiftBag()) {
            Aweme LJIIZILJ = LJIIZILJ();
            if (((RBX) HG3.LJIILL()).getCurUser().getGiftBagStatus() == 1) {
                ((RBX) HG3.LJIILL()).getCurUser().setGiftBagStatus(0);
                ((LiveData) this.LLIIL.LJLIL.getValue()).postValue(Boolean.FALSE);
                if (LJIIZILJ != null) {
                    this.LLIIJLIL.hv0(LJIIZILJ.getAid(), LJIIZILJ.getAuthorUid());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (r0.isLike() == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(java.lang.String r4) {
        /*
            r3 = this;
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = r3.LJLLLLLL
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = r3.LJIILL()
            java.lang.String r0 = "group_id"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = r3.LJIILLIIL()
            java.lang.String r0 = "author_id"
            r2.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            r2.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIIZILJ()
            int r1 = X.C178526zY.LIZ(r0)
            java.lang.String r0 = "is_follow"
            r2.LIZLLL(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIIZILJ()
            if (r0 == 0) goto L59
            boolean r0 = r0.isLike()
            r1 = 1
            if (r0 != r1) goto L59
        L47:
            java.lang.String r0 = "is_like"
            r2.LIZLLL(r1, r0)
            java.lang.String r0 = "enter_method"
            r2.LJIIIZ(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_gift_panel"
            X.FMX.LJIIL(r0, r1)
            return
        L59:
            r1 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176996x5.LJJIJIL(java.lang.String):void");
    }

    public final void LJJIJLIJ(C224748ru c224748ru) {
        if (c224748ru == null || !((CopyOnWriteArrayList) this.LLIIIJ).contains(c224748ru) || this.LLIIIILZ) {
            return;
        }
        this.LLIIIILZ = true;
        Iterator it = ((CopyOnWriteArrayList) this.LLIIIJ).iterator();
        while (it.hasNext()) {
            EditText editText = (EditText) it.next();
            if (editText != c224748ru && !C70657RoD.LJII(editText.getText(), c224748ru.getText())) {
                editText.setText(c224748ru.getText());
            }
        }
        this.LLIIIILZ = false;
    }

    public final void LJJIL(String str) {
        String str2;
        String str3;
        if (this.LJLJJI.getCommentInputAweme() != null) {
            Aweme commentInputAweme = this.LJLJJI.getCommentInputAweme();
            String LJIJJLI = LJIJJLI();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", str);
            String str4 = null;
            if (commentInputAweme != null) {
                str2 = commentInputAweme.getAid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("group_id", str2);
            if (commentInputAweme != null) {
                str3 = commentInputAweme.getAuthorUid();
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("author_id", str3);
            c188727au.LJIIIZ("now_type", C178406zM.LJIIIZ(commentInputAweme));
            if (C227768wm.LJJIIJ(LJIJJLI)) {
                C218158hH c218158hH = C3A5.LIZ;
                if (commentInputAweme != null) {
                    str4 = commentInputAweme.getRequestId();
                }
                c188727au.LJI("log_pb", c218158hH.LIZIZ(str4));
                FMX.LJIILLIIL("search_comment_at", C227768wm.LJJIIZI(c188727au.LIZ));
                return;
            }
            FMX.LJIIL("search_comment_at", c188727au.LIZ);
        }
    }

    public final void LJJIZ(CommentVideoModel.Type type) {
        if (type != CommentVideoModel.Type.NONE) {
            if (this.LLILII) {
                LJJJJIZL(this.LJLJJI.getCommentInputReplyComment(), type, "collection_text_panel");
            } else {
                LJJJJIZL(this.LJLJJI.getCommentInputReplyComment(), type, "comment_click");
            }
        }
    }

    public final void LJJJIL(User user) {
        Context LIZIZ;
        final IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        final IMUser fromUser = IMUser.fromUser(user);
        Fragment fragment = this.LJLJI;
        if (fragment == null || (LIZIZ = fragment.getContext()) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        final Aweme LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null) {
            createIIMServicebyMonsterPlugin.getShareService().LIZIZ(fromUser, C4LD.LIZ.LJJIJIIJI(0, LIZIZ, LJIIZILJ, LJIJJLI(), "comment_at", "share_panel"), new C4L0() { // from class: X.Mgg
                @Override // X.C4L0
                public final void run(Object obj) {
                    String str;
                    C176996x5 c176996x5 = C176996x5.this;
                    Aweme aweme = LJIIZILJ;
                    IMContact iMContact = fromUser;
                    IIMService iIMService = createIIMServicebyMonsterPlugin;
                    c176996x5.getClass();
                    String str2 = "";
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("share_prop");
                    LIZ.append(System.currentTimeMillis());
                    String LIZIZ2 = X1D.LIZIZ(LIZ);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(LIZIZ2.getBytes("UTF8"));
                        str = "";
                        for (byte b : messageDigest.digest()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(Integer.toHexString((b & 255) | (-256)).substring(6));
                            str = X1D.LIZIZ(LIZ2);
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        str = null;
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", c176996x5.LJIJJLI());
                    c188727au.LJIIIZ("platform", "chat");
                    c188727au.LJIIIZ("group_id", aweme.getAid());
                    c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
                    if (!(iMContact instanceof IMUser)) {
                        if (iMContact instanceof IMConversation) {
                            int conversationType = ((IMConversation) iMContact).getConversationType();
                            if (conversationType != 1) {
                                if (conversationType == 2) {
                                    str2 = "group";
                                }
                            }
                        }
                        c188727au.LJIIIZ("chat_type", str2);
                        c188727au.LIZLLL(1, "chat_cnt");
                        c188727au.LIZLLL(0, "is_with_text");
                        c188727au.LJIIIZ("enter_method", "comment_at");
                        c188727au.LJIIIZ("bind_id", str);
                        C78866UxK.LJIILLIIL(c188727au, aweme.getAuthor());
                        if (c176996x5.LJIJJLI() != "from_music" && c176996x5.LJLJI != null) {
                            c188727au.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(c176996x5.LJLJI.getContext(), aweme), "music_name");
                        }
                        java.util.Map<String, String> map = c188727au.LIZ;
                        C220488l2.LIZIZ.LJII(aweme, c188727au);
                        C222578oP.LIZIZ(c188727au, aweme, null, null, null);
                        FMX.LJIIL("share_video_to_chat", c188727au.LIZ);
                        FMX.LJIIL("share_video_success", map);
                        C3GF imUserService = iIMService.getImUserService();
                        C188727au c188727au2 = new C188727au();
                        c188727au2.LJIIIZ("conversation_id", imUserService.LJIJI(iMContact));
                        c188727au2.LJIIIZ("to_user_id", imUserService.LJIJJ(iMContact));
                        c188727au2.LJIIIZ("bind_id", str);
                        C78866UxK.LJIILLIIL(c188727au2, aweme.getAuthor());
                        java.util.Map<String, String> map2 = c188727au2.LIZ;
                        FMX.LJIIL("share_video_to_chat_info", map2);
                        FMX.LJIIL("share_video_success_info", map2);
                    }
                    str2 = "private";
                    c188727au.LJIIIZ("chat_type", str2);
                    c188727au.LIZLLL(1, "chat_cnt");
                    c188727au.LIZLLL(0, "is_with_text");
                    c188727au.LJIIIZ("enter_method", "comment_at");
                    c188727au.LJIIIZ("bind_id", str);
                    C78866UxK.LJIILLIIL(c188727au, aweme.getAuthor());
                    if (c176996x5.LJIJJLI() != "from_music") {
                        c188727au.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(c176996x5.LJLJI.getContext(), aweme), "music_name");
                    }
                    java.util.Map<String, String> map3 = c188727au.LIZ;
                    C220488l2.LIZIZ.LJII(aweme, c188727au);
                    C222578oP.LIZIZ(c188727au, aweme, null, null, null);
                    FMX.LJIIL("share_video_to_chat", c188727au.LIZ);
                    FMX.LJIIL("share_video_success", map3);
                    C3GF imUserService2 = iIMService.getImUserService();
                    C188727au c188727au22 = new C188727au();
                    c188727au22.LJIIIZ("conversation_id", imUserService2.LJIJI(iMContact));
                    c188727au22.LJIIIZ("to_user_id", imUserService2.LJIJJ(iMContact));
                    c188727au22.LJIIIZ("bind_id", str);
                    C78866UxK.LJIILLIIL(c188727au22, aweme.getAuthor());
                    java.util.Map<String, String> map22 = c188727au22.LIZ;
                    FMX.LJIIL("share_video_to_chat_info", map22);
                    FMX.LJIIL("share_video_success_info", map22);
                }
            });
        }
    }

    public final void LJJJJ(boolean z) {
        if (this.LJLILLLLZI == null || !LJJIJIIJI() || LJIIIZ()) {
            return;
        }
        if (z) {
            if (C72O.LIZ()) {
                Fragment fragment = this.LJLJI;
                if ((fragment instanceof CommentInputFragment) || (fragment instanceof BottomBarFragment)) {
                    C174076sN.LIZ();
                } else if (C7HV.LIZIZ.LJIL().LIZJ(LJIIZILJ())) {
                    C174076sN.LIZIZ(Boolean.TRUE);
                }
            }
            LJJLIIIJ(this.LJLILLLLZI.getHint(), "click_gift_icon");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLLLLLL);
            c188727au.LJIIIZ("group_id", LJIILL());
            c188727au.LJIIIZ("author_id", LJIILLIIL());
            FMX.LJIIL("click_comment_tray_gift_icon", c188727au.LIZ);
            return;
        }
        C5S1 c5s1 = new C5S1(this.LJLJI.getContext());
        c5s1.LIZJ(R.string.tpf);
        c5s1.LJ();
    }

    public final void LJJJJI(C177156xL c177156xL) {
        C177146xK c177146xK;
        if (TextUtils.isEmpty(this.LJLLJ) && (c177146xK = this.LJLIL) != null) {
            this.LJLLJ = c177146xK.LIZ;
        }
        this.LLILZIL = true;
        this.LJLJJI.onCommentInputKeyboardShow(this.LJLLILLLL, this.LJLLJ, c177156xL);
        this.LJLLILLLL = false;
        this.LJLLJ = "";
    }

    public final void LJJJJJL(String str) {
        GiftViewModel giftViewModel = this.LLIIJLIL;
        if (giftViewModel != null && giftViewModel.jv0().getValue() != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", str);
            c188727au.LJIIIZ("author_id", LJIILLIIL());
            c188727au.LJIIIZ("group_id", LJIILL());
            c188727au.LJIIIZ("enter_from", LJIJJLI());
            c188727au.LJFF(this.LLIIJLIL.iv0().getValue(), "current_balance");
            FMX.LJIIL("video_gift_send_click", c188727au.LIZ);
        }
    }

    public final void LJJJJL(String str) {
        if (this.LJLJJLL != null && !TextUtils.isEmpty(str)) {
            C8BR c8br = (C8BR) ((ConcurrentHashMap) this.LJLJJLL).remove(str);
            if (c8br != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("removePublishedPresenter ");
                LIZ.append(str);
                LIZ.append(" presenter: ");
                LIZ.append(c8br);
                C71Y.LIZ("CommentInputManager", X1D.LIZIZ(LIZ));
                c8br.LJJII();
                c8br.LIZIZ();
                return;
            }
            C71Y.LIZ("CommentInputManager", "removePublishedPresenter not find presenter");
            return;
        }
        C71Y.LIZ("CommentInputManager", "removePublishedPresenter: fakeId is null");
    }

    public final void LJJJJZ(C176646wW c176646wW) {
        String str;
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new ConcurrentHashMap();
        }
        Comment comment = c176646wW.LJLJLLL;
        if (comment != null) {
            str = comment.getFakeId();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("savePublishingPresenter: ");
            LIZ.append(str);
            LIZ.append(" presenter: ");
            LIZ.append(c176646wW);
            C71Y.LIZ("CommentInputManager", X1D.LIZIZ(LIZ));
            ((ConcurrentHashMap) this.LJLJJLL).put(str, c176646wW);
            return;
        }
        C71Y.LIZ("CommentInputManager", "savePublishingPresenter: fakeId is null ");
    }

    public final void LJJJLIIL(boolean z) {
        this.LLII = z;
        if (z) {
            TextView textView = this.LLIFFJFJJ;
            if (textView != null) {
                textView.setVisibility(0);
            }
            C224748ru c224748ru = this.LJLILLLLZI;
            if (c224748ru != null) {
                c224748ru.setVisibility(8);
            }
            LJJJZ(this.LLFII, false);
            View view = this.LLFZ;
            if (view != null) {
                view.setVisibility(8);
            }
            FMX.LJIIL("tns_ags_float_comment_ban", new C188727au().LIZ);
            return;
        }
        TextView textView2 = this.LLIFFJFJJ;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        C224748ru c224748ru2 = this.LJLILLLLZI;
        if (c224748ru2 != null) {
            c224748ru2.setVisibility(0);
        }
        LJJJZ(this.LLFII, true);
        View view2 = this.LLFZ;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    public final void LJJJLZIJ(Emoji emoji) {
        if (this.LJZI == emoji) {
            return;
        }
        this.LJZI = emoji;
        Iterator it = ((CopyOnWriteArrayList) this.LLIL).iterator();
        while (it.hasNext()) {
            InterfaceC177096xF interfaceC177096xF = (InterfaceC177096xF) it.next();
            if (interfaceC177096xF != null) {
                interfaceC177096xF.LIZ();
            }
        }
    }

    public final boolean LJJLIIIJILLIZJL(int i) {
        String str;
        if (this.LLD == 1) {
            if (i == 0) {
                str = "click_input_box";
            } else if (i == 1) {
                str = "click_send_button";
            } else if (i == 5) {
                str = "click_gift";
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.LJLLLLLL;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str2);
                c188727au.LJIIIZ("enter_method", str);
                c188727au.LJIIIZ("invalid_reason", "loading_comment");
                FMX.LJIIL("invalid_post_comment", c188727au.LIZ);
            }
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJIIIIZZ(R.string.c4x);
            c26045AKb.LJIIJ();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC176716wd
    public final void Nl0(Comment comment) {
        Editable editable;
        String str;
        Aweme aweme;
        LJJJLZIJ(null);
        C224748ru c224748ru = this.LJLILLLLZI;
        if (c224748ru != null) {
            editable = c224748ru.getText();
            if (!this.LLILII) {
                this.LJLILLLLZI.setText("");
            }
        } else {
            editable = null;
        }
        C177146xK c177146xK = this.LJLIL;
        if (c177146xK != null) {
            C224748ru c224748ru2 = c177146xK.LIZIZ.LJLLLLLL;
            if (c224748ru2 != null) {
                editable = c224748ru2.getText();
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        if (V16.LJJIZ(comment) && this.LJLJLJ == null) {
            this.LJLJLJ = new C175226uE(this);
        }
        C175226uE c175226uE = this.LJLJLJ;
        if (c175226uE != null) {
            List<CommentImageModel> list = this.LJZL;
            Comment commentInputReplyComment = this.LJLJJI.getCommentInputReplyComment();
            if (comment != null && !TextUtils.isEmpty(editable)) {
                ((HashMap) c175226uE.LIZ).put(comment.getFakeId(), editable);
                if (list != null && !list.isEmpty()) {
                    ((HashMap) c175226uE.LIZIZ).put(comment.getFakeId(), list);
                }
                if (commentInputReplyComment != null) {
                    ((HashMap) c175226uE.LIZJ).put(comment.getFakeId(), commentInputReplyComment);
                }
            }
        }
        if (this.LJZL != null) {
            this.LJZL = null;
        }
        if (comment != null && comment.getShouldDisplayFakeComment() && this.LLILL) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJIIIIZZ(R.string.dl4);
            c26045AKb.LJIIJ();
        }
        LJJJLL();
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null) {
            interfaceC177046xA.onCommentInputPublishStart(comment);
        }
        if (comment == null || !comment.isStoryEmojiComment()) {
            LJJIIJ();
        }
        C177146xK c177146xK2 = this.LJLIL;
        if (c177146xK2 != null) {
            c177146xK2.LIZIZ.K3().iv0(C177916yZ.LIZ, false);
            c177146xK2.LIZIZ.Q3(false);
            KeyboardInputV2Assem keyboardInputV2Assem = c177146xK2.LIZIZ;
            C0M6<String, Editable> c0m6 = keyboardInputV2Assem.LJLJLLL;
            C177336xd I3 = keyboardInputV2Assem.I3();
            if (I3 == null || (aweme = I3.LJLLI) == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            c0m6.LIZLLL(str);
            C224748ru c224748ru3 = c177146xK2.LIZIZ.LJLLLLLL;
            if (c224748ru3 != null) {
                c224748ru3.setText("");
                c177146xK2.LIZIZ.BU(null);
                c177146xK2.LIZIZ.X3(null);
                return;
            }
            o.LJIJI("editTextComment");
            throw null;
        }
    }

    @Override // X.InterfaceC176716wd
    public final void Td0(Comment comment) {
        LJJJJL(comment.getFakeId());
        Aweme aweme = null;
        if (this.LJLJJI != null) {
            Comment LIZJ = C178216z3.LIZJ(comment.getCid());
            if (LIZJ != null) {
                comment.setText(C1799274i.LIZLLL(LIZJ));
                comment.setTextExtra(LIZJ.getTextExtra());
            }
            List<Comment> replyComments = comment.getReplyComments();
            if (!C79004UzY.LJJIFFI(replyComments)) {
                for (Comment comment2 : replyComments) {
                    Comment LIZJ2 = C178216z3.LIZJ(comment2.getCid());
                    if (LIZJ2 != null) {
                        comment2.setText(C1799274i.LIZLLL(LIZJ2));
                        comment2.setTextExtra(LIZJ2.getTextExtra());
                    }
                }
            }
            this.LJLJJI.onCommentInputPublishSuccess(comment);
            this.LJLJJI.getCommentInputAweme();
            if (this.LJLJJI.getCommentInputAweme() != null) {
                C1800774x.LIZ(this.LJLJJI.getCommentInputAweme().getAid(), null);
            }
        }
        C2U8.LIZ(new C56262Is(comment.getLabelInfo(), comment.getAwemeId()));
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("comment", new IDRunnableS6S0101000(6, this, 14), new ARunnableS17S0101000_13(2, this, 12));
        if (this.LJLJI.mo49getActivity() != null) {
            Z8A.LIZIZ.showRemindUserCompleteProfileDialog(this.LJLJI.mo49getActivity(), LJIJJLI(), "comment", new IDDListenerS143S0100000_3(this, 0));
        }
        if (comment.getGift() != null) {
            LJJII(comment);
        }
        C175226uE c175226uE = this.LJLJLJ;
        if (c175226uE != null) {
            c175226uE.LIZ(comment);
        }
        SpecActServiceImpl.LJJJIL().LJIIZILJ("post_comment", "");
        if (this.LJLJJI != null && V16.LJJIZ(comment)) {
            this.LJLJJI.onUpvotePublishProcessChanged(false);
        }
        C176106ve c176106ve = C176096vd.LIZIZ;
        c176106ve.LIZJ = System.currentTimeMillis();
        C176096vd.LIZJ(c176106ve);
        C177146xK c177146xK = this.LJLIL;
        if (c177146xK != null) {
            if (C72O.LIZ()) {
                InterfaceC175156u7 LJIL = C7HV.LIZIZ.LJIL();
                C177336xd I3 = c177146xK.LIZIZ.I3();
                if (I3 != null) {
                    aweme = I3.LJLLI;
                }
                if (LJIL.LIZJ(aweme)) {
                    C174076sN.LIZIZ(Boolean.TRUE);
                } else {
                    C174076sN.LIZ();
                }
            }
            IRepostCardAssemAbility LIZIZ = C176356w3.LIZIZ(C55096Ljo.LJIIZILJ(c177146xK.LIZIZ));
            if (LIZIZ != null) {
                LIZIZ.r70();
            }
            c177146xK.LIZIZ.P3(C177076xD.LJLIL);
        }
    }

    public C176996x5(Fragment fragment, InterfaceC177046xA interfaceC177046xA) {
        this.LLILZLL = false;
        if (fragment != null && interfaceC177046xA != null) {
            this.LJLJI = fragment;
            this.LJLJJI = interfaceC177046xA;
            C176606wS c176606wS = new C176606wS();
            this.LJLJL = c176606wS;
            c176606wS.LJLILLLLZI = this;
            c176606wS.LJLJJL = fragment;
            this.LJLL = this.LJLJI.getResources().getString(R.string.dix);
            if (this.LJLJI instanceof CommentListFragment) {
                this.LJLJLJ = new C175226uE(this);
            }
            GiftViewModel giftViewModel = (GiftViewModel) ViewModelProviders.of(fragment.mo49getActivity()).get(GiftViewModel.class);
            this.LLIIJLIL = giftViewModel;
            if (LJIIZILJ() != null) {
                giftViewModel.LJLLLLLL = LJIIZILJ();
            }
            this.LLIIL = (BottomBarViewModel) ViewModelProviders.of(fragment.mo49getActivity()).get(BottomBarViewModel.class);
            this.LLILZLL = C53946LFe.LIZJ(null, null).LJFF;
            if (fragment.mo49getActivity() != null) {
                C9XU.LIZIZ(fragment.mo49getActivity(), this);
                return;
            }
            return;
        }
        throw new RuntimeException("Empty fragment/service!");
    }

    public final void LJIIL(Comment comment, C78862UxG c78862UxG) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EF7.LIZIZ().getResources().getString(R.string.dw7, C1799274i.LJ(comment.getUser(), this.LJLJJI.getEventType())));
            LIZ.append(comment.getText());
            OHT.LIZ("copy_label", X1D.LIZIZ(LIZ), EF7.LIZIZ(), c78862UxG);
        } catch (Exception unused) {
        }
    }

    public final void LJJIIJZLJL(Emoji emoji, C177156xL c177156xL) {
        boolean z;
        boolean z2;
        KeyboardDialogFragment keyboardDialogFragment;
        CommentEditText$MentionSpan[] mentionSpan;
        Editable text;
        C224748ru c224748ru = this.LJLILLLLZI;
        if (c224748ru != null && ((text = c224748ru.getText()) == null || text.length() == 0)) {
            z = true;
        } else {
            z = false;
        }
        C177146xK c177146xK = this.LJLIL;
        if (c177146xK != null) {
            C224748ru c224748ru2 = c177146xK.LIZIZ.LJLLLLLL;
            if (c224748ru2 != null) {
                Editable text2 = c224748ru2.getText();
                if (text2 == null || text2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                o.LJIJI("editTextComment");
                throw null;
            }
        }
        LJJJLL();
        if (z && emoji == null && this.LJZL == null && !this.LL) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJI.onCommentInputKeyboardDismiss(z2, c177156xL);
        if (LJJIJIIJI() && (keyboardDialogFragment = (KeyboardDialogFragment) this.LJLJI.getChildFragmentManager().LJJJIL("CommentInputManager")) != null) {
            C224748ru c224748ru3 = keyboardDialogFragment.LJLJL;
            if (c224748ru3 == null || (mentionSpan = c224748ru3.getMentionSpan()) == null || mentionSpan.length == 0) {
                this.LJLJJL.clear();
            } else {
                Iterator<User> it = this.LJLJJL.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    boolean z3 = false;
                    for (CommentEditText$MentionSpan commentEditText$MentionSpan : mentionSpan) {
                        if (TextUtils.equals(next.getUid(), commentEditText$MentionSpan.uid)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        it.remove();
                    }
                }
            }
        }
        if (z2) {
            LJJJJLI();
            LJJJLZIJ(null);
        } else {
            LJJJLZIJ(emoji);
        }
        View view = this.LLFFF;
        if (view != null && view.getVisibility() == 0) {
            this.LLFFF.setVisibility(8);
        }
        View view2 = this.LLIILII;
        if (view2 != null && (view2 instanceof TuxIconView) && !this.LJLJJI.isLandscapeMode()) {
            if (this.LJLJJI.getCommentInputViewType() == 1 || this.LJLJJI.getCommentInputViewType() == 2) {
                Aweme LJIIZILJ = LJIIZILJ();
                if (LJIIZILJ != null && this.LLIILZL.LIZ(LJIIZILJ)) {
                    this.LLIILII.setVisibility(0);
                }
                this.LLIILII.setAlpha(1.0f);
                new C116974iT(this.LLIILII).LJJLIIIJILLIZJL(1L, TimeUnit.SECONDS).LJJJJZI(new AfS23S0110000_3(this, true, 0));
                return;
            }
            this.LLIILII.setVisibility(8);
        }
    }

    public final void LJJJZ(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (this.LJLJJI.isLandscapeMode()) {
            C78886Uxe.LJJLIIIJILLIZJL(view);
        } else if (z) {
            C78886Uxe.LJJLIIIJJI(view);
        } else {
            C78886Uxe.LJJLIIIJILLIZJL(view);
        }
    }

    public final void LJJLI(CharSequence charSequence, boolean z) {
        String str;
        boolean z2;
        if (!LJJIJIIJI() || !LJJIJIIJI()) {
            return;
        }
        if (z) {
            str = "emoji";
        } else {
            str = "input";
        }
        C186577Tx.LIZIZ(str, LJIJJLI());
        Fragment fragment = this.LJLJI;
        if ((fragment instanceof CommentInputFragment) || (fragment instanceof BottomBarFragment)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C72O.LIZ() && z2) {
            C174076sN.LIZ();
        }
        DataCenter dataCenter = this.LLI;
        if (dataCenter != null) {
            dataCenter.jv0(6, "comment_dialog_state");
        }
        C177146xK c177146xK = this.LJLIL;
        if (c177146xK != null && (this.LJLJJI instanceof CommentListFragment)) {
            c177146xK.LIZ = this.LJLLJ;
            c177146xK.LIZ(new AObjectS45S0101000_13(4, this, 0));
            C177146xK c177146xK2 = this.LJLIL;
            C177906yY panelType = C177906yY.LIZ;
            String str2 = this.LJLLJ;
            c177146xK2.getClass();
            o.LJIIIZ(panelType, "panelType");
            c177146xK2.LIZIZ.O3(panelType, str2);
            return;
        }
        Bundle LJIJI = LJIJI(charSequence);
        LJIJI.putBoolean("showEmojiPanel", z);
        LJIJI.putBoolean("isCommentDesc", this.LLILIL);
        LJIJI.putCharSequence("defaultContent", "");
        LJIJI.putString("fromPage", LJIL());
        LJIJI.putString("click_from", this.LJLLJ);
        LJIJI.putBoolean("ignore_upvote_card", z2);
        LJIJI.putString("enter_method", this.LJLJJI.getEnterMethod());
        LJIIJJI(KeyboardDialogFragment.Al(this.LJLJJI.getCommentInputViewType(), this.LJLJJI.hasUpvoteOption(), LJIJJLI(), LJIJI, this.LLILZ));
    }

    public final void LJJLIIIJ(CharSequence charSequence, String str) {
        if (!LJJIJIIJI()) {
            return;
        }
        C186577Tx.LIZIZ("gift", LJIJJLI());
        this.LLIIJLIL.LJLLILLLL = str;
        this.LLIIII = str;
        LJJIJIL(str);
        DataCenter dataCenter = this.LLI;
        if (dataCenter != null) {
            dataCenter.jv0(6, "comment_dialog_state");
        }
        C177146xK c177146xK = this.LJLIL;
        if (c177146xK != null && (this.LJLJJI instanceof CommentListFragment)) {
            c177146xK.LIZ = this.LJLLJ;
            c177146xK.LIZ(new AObjectS45S0101000_13(2, this, 8));
            C177146xK c177146xK2 = this.LJLIL;
            C177896yX panelType = C177896yX.LIZ;
            String str2 = this.LJLLJ;
            c177146xK2.getClass();
            o.LJIIIZ(panelType, "panelType");
            c177146xK2.LIZIZ.O3(panelType, str2);
            return;
        }
        Bundle LJIJI = LJIJI(charSequence);
        LJIJI.putBoolean("showGiftPanel", true);
        LJIJI.putString("click_from", this.LLIIII);
        LJIIJJI(KeyboardDialogFragment.Al(this.LJLJJI.getCommentInputViewType(), this.LJLJJI.hasUpvoteOption(), LJIJJLI(), LJIJI, this.LLILZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC176716wd
    public final void cj0(final Exception exc, final Comment comment) {
        CommentRethinkPopup commentRethinkPopup;
        CommentResponse commentResponse;
        LJJJJL(comment.getFakeId());
        final C175226uE c175226uE = this.LJLJLJ;
        if (c175226uE != null) {
            final int i = this.LJLLI;
            if (exc instanceof C38333F2r) {
                C38333F2r c38333F2r = (C38333F2r) exc;
                if (c38333F2r.getErrorCode() == 3017002) {
                    Object rawResponse = c38333F2r.getRawResponse();
                    if (!(rawResponse instanceof CommentResponse) || (commentResponse = (CommentResponse) rawResponse) == null || (commentRethinkPopup = commentResponse.commentRethinkPopup) == null) {
                        commentRethinkPopup = new CommentRethinkPopup(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
                    }
                    if (commentRethinkPopup != null && c175226uE.LJII.LJLJI != null) {
                        c175226uE.LJ = comment;
                        Comment comment2 = c175226uE.LJFF;
                        if (comment2 == null) {
                            c175226uE.LJI = false;
                            c175226uE.LJFF = comment;
                        } else {
                            if (TextUtils.equals(comment2.getText(), comment.getText())) {
                                c175226uE.LJI = true;
                            } else {
                                c175226uE.LJI = false;
                            }
                            c175226uE.LJFF = comment;
                        }
                        if ((c175226uE.LJII.LJLJI instanceof CommentListFragment) || V16.LJJIZ(comment)) {
                            Fragment fragment = c175226uE.LJII.LJLJI;
                            if ((!(fragment instanceof CommentListFragment) || ((CommentListFragment) fragment).isShowing()) && c175226uE.LJII.LJLJI.getChildFragmentManager().LJJJIL("CommentInputManager") == null && c175226uE.LJII.LJLJI.getChildFragmentManager().LJJJIL("comment_rethink") == null) {
                                Context context = c175226uE.LJII.LJLJI.getContext();
                                if (context != null) {
                                    c175226uE.LIZLLL = C78Z.LIZIZ(context, commentRethinkPopup, new InterfaceC178306zC() { // from class: X.6x4
                                        @Override // X.InterfaceC178306zC
                                        public final void LIZJ() {
                                        }

                                        @Override // X.InterfaceC178306zC
                                        public final void LIZ() {
                                            boolean z;
                                            if (C175226uE.this.LJII.LJLJJI != null && V16.LJJIZ(comment)) {
                                                C175226uE.this.LJII.LJLJJI.onUpvotePublishProcessChanged(false);
                                            }
                                            InterfaceC177046xA interfaceC177046xA = C175226uE.this.LJII.LJLJJI;
                                            if (interfaceC177046xA != null) {
                                                interfaceC177046xA.onCommentInputPublishFailed(exc, i, comment);
                                            }
                                            Comment comment3 = (Comment) ((HashMap) C175226uE.this.LIZJ).get(comment.getFakeId());
                                            boolean z2 = C175226uE.this.LJII.LJLJI instanceof CommentListFragment;
                                            if (comment.getCommentType() == 223) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (comment3 != null && z2) {
                                                ((CommentListFragment) C175226uE.this.LJII.LJLJI).ho(comment3, "");
                                            } else if (z && C72O.LIZ() && C7HV.LIZIZ.LJFF(C175226uE.this.LJII.LJIILL())) {
                                                C174076sN.LIZIZ(Boolean.valueOf(z2));
                                                C176996x5 c176996x5 = C175226uE.this.LJII;
                                                c176996x5.LJJLI(c176996x5.LJLL, false);
                                            } else {
                                                C176996x5 c176996x52 = C175226uE.this.LJII;
                                                C224748ru c224748ru = c176996x52.LJLILLLLZI;
                                                if (c224748ru != null) {
                                                    c224748ru.performClick();
                                                } else {
                                                    c176996x52.LLILLIZIL = 1;
                                                    c176996x52.LJJJJLL(null, c176996x52.LJLLLLLL, c176996x52.LJZ);
                                                }
                                            }
                                            CharSequence charSequence = (CharSequence) ((HashMap) C175226uE.this.LIZ).get(comment.getFakeId());
                                            C224748ru c224748ru2 = C175226uE.this.LJII.LJLILLLLZI;
                                            if (c224748ru2 != null) {
                                                c224748ru2.setText(charSequence);
                                            }
                                            List<CommentImageModel> list = (List) ((HashMap) C175226uE.this.LIZIZ).get(comment.getFakeId());
                                            C176996x5 c176996x53 = C175226uE.this.LJII;
                                            c176996x53.LJZL = list;
                                            C177146xK c177146xK = c176996x53.LJLIL;
                                            if (c177146xK != null) {
                                                C224748ru c224748ru3 = c177146xK.LIZIZ.LJLLLLLL;
                                                if (c224748ru3 != null) {
                                                    c224748ru3.setText(charSequence);
                                                    if (list != null && !list.isEmpty()) {
                                                        c177146xK.LIZIZ.BU(list);
                                                    }
                                                } else {
                                                    o.LJIJI("editTextComment");
                                                    throw null;
                                                }
                                            }
                                            C175226uE c175226uE2 = C175226uE.this;
                                            ((HashMap) c175226uE2.LIZ).clear();
                                            ((HashMap) c175226uE2.LIZIZ).clear();
                                            ((HashMap) c175226uE2.LIZJ).clear();
                                            c175226uE2.LJ = null;
                                        }

                                        @Override // X.InterfaceC178306zC
                                        public final void LIZIZ() {
                                            C175226uE.this.LIZIZ(comment, false);
                                        }
                                    }, c175226uE.LJI, "comment", comment.getAwemeId());
                                }
                                try {
                                    c175226uE.LIZLLL.show(c175226uE.LJII.LJLJI.getChildFragmentManager(), "comment_rethink");
                                    return;
                                } catch (IllegalStateException unused) {
                                    c175226uE.LIZIZ(comment, true);
                                    return;
                                }
                            }
                        }
                        c175226uE.LIZIZ(comment, true);
                        return;
                    }
                }
            }
            this.LJLJLJ.LIZ(comment);
        }
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null) {
            interfaceC177046xA.onCommentInputPublishFailed(exc, this.LJLLI, comment);
        }
        if (this.LJLJJI != null && V16.LJJIZ(comment)) {
            this.LJLJJI.onUpvotePublishProcessChanged(false);
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        boolean z = C53946LFe.LIZJ(activity, null).LJFF;
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        if (C53816LAe.LJI(activity, configuration) || (this.LLILZ && z != this.LLILZLL)) {
            LJIILJJIL();
            DialogInterfaceC39771hF dialogInterfaceC39771hF = this.LLIIIZ;
            if (dialogInterfaceC39771hF != null) {
                dialogInterfaceC39771hF.dismiss();
                this.LLIIIZ = null;
            }
            this.LLILZLL = z;
        }
    }

    @Override // X.InterfaceC176716wd
    public final void onImageUploadProgress(String str, int i) {
        InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
        if (interfaceC177046xA != null) {
            interfaceC177046xA.onImageUploadProgress(str, i);
        }
    }

    public final C252659vp LJJIJL(InterfaceC176256vt interfaceC176256vt, String content, Comment comment) {
        if (comment == null) {
            return null;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.q2_))) {
            C252659vp c252659vp = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp.LIZ = content;
            c252659vp.LIZJ(R.raw.icon_flag);
            c252659vp.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 6);
            return c252659vp;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.h1h))) {
            C252659vp c252659vp2 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp2.LIZ = content;
            c252659vp2.LIZJ(R.raw.icon_arrow_turn_up_right);
            c252659vp2.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 7);
            return c252659vp2;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.efd))) {
            C252659vp c252659vp3 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp3.LIZ = content;
            c252659vp3.LIZJ(R.raw.icon_trash_bin);
            c252659vp3.LIZJ = 1;
            c252659vp3.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 8);
            return c252659vp3;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.dw4))) {
            C252659vp c252659vp4 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp4.LIZ = content;
            c252659vp4.LIZJ(R.raw.icon_doc_on_doc);
            c252659vp4.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 9);
            return c252659vp4;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.dm8))) {
            C252659vp c252659vp5 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp5.LIZ = content;
            c252659vp5.LIZJ(R.raw.icon_globe);
            c252659vp5.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 10);
            return c252659vp5;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.dlq))) {
            C252659vp c252659vp6 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp6.LIZ = content;
            c252659vp6.LIZJ(R.raw.icon_globe);
            c252659vp6.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 0);
            return c252659vp6;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.dkw))) {
            C252659vp c252659vp7 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp7.LIZ = content;
            c252659vp7.LIZJ(R.raw.icon_pin);
            c252659vp7.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 1);
            return c252659vp7;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.dme))) {
            C252659vp c252659vp8 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp8.LIZ = content;
            c252659vp8.LIZJ(R.raw.icon_pin_fill);
            c252659vp8.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 2);
            return c252659vp8;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.dln))) {
            C252659vp c252659vp9 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp9.LIZ = content;
            c252659vp9.LIZJ(R.raw.icon_video);
            c252659vp9.LJ = new ACListenerS29S0300000_3(this, interfaceC176256vt, comment, 0);
            return c252659vp9;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.djf))) {
            C252659vp c252659vp10 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp10.LIZ = content;
            c252659vp10.LIZJ(R.raw.icon_pen_on_paper);
            c252659vp10.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 3);
            return c252659vp10;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.ga2)) || TextUtils.equals(content, this.LJLJI.getString(R.string.ga3))) {
            C252659vp c252659vp11 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp11.LIZ = content;
            c252659vp11.LIZJ(R.raw.icon_bookmark);
            c252659vp11.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 4);
            return c252659vp11;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.ga5))) {
            C252659vp c252659vp12 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp12.LIZ = content;
            c252659vp12.LIZJ(R.raw.icon_bookmark_fill);
            c252659vp12.LJ = new ACListenerS38S0200000_3(interfaceC176256vt, this, 5);
            return c252659vp12;
        }
        if (TextUtils.equals(content, this.LJLJI.getString(R.string.k2))) {
            C252659vp c252659vp13 = new C252659vp();
            o.LJIIIZ(content, "content");
            c252659vp13.LIZ = content;
            c252659vp13.LIZJ(R.raw.icon_thumbs_up);
            c252659vp13.LIZJ = 1;
            c252659vp13.LJ = new ACListenerS20S0201000_2(0, this, interfaceC176256vt, 0);
            return c252659vp13;
        }
        if (!TextUtils.equals(content, this.LJLJI.getString(R.string.k1))) {
            return null;
        }
        C252659vp c252659vp14 = new C252659vp();
        o.LJIIIZ(content, "content");
        c252659vp14.LIZ = content;
        c252659vp14.LIZJ(R.raw.icon_thumbs_up_fill);
        c252659vp14.LIZJ = 1;
        c252659vp14.LJ = new ACListenerS21S0201000_3(0, this, interfaceC176256vt, 0);
        return c252659vp14;
    }

    public final void LJJJJIZL(Comment comment, CommentVideoModel.Type type, String str) {
        User user;
        String cid;
        String str2;
        String eventType;
        String text;
        String str3;
        String cid2;
        String str4;
        if (LJJIJIIJI() && this.LJLJI.mo49getActivity() != null && this.LJLJJI != null && comment != null && (user = comment.getUser()) != null) {
            String eventType2 = this.LJLJJI.getEventType();
            String str5 = "";
            if (comment.getCommentType() == 2) {
                cid = comment.getReplyId();
                str2 = comment.getCid();
            } else {
                cid = comment.getCid();
                str2 = "";
            }
            if (this.LJLJJI.getEventType().isEmpty()) {
                eventType = LJIJJLI();
            } else {
                eventType = this.LJLJJI.getEventType();
            }
            String str6 = "comment_press";
            if (this.LLILII && (str.equals("collection_text_panel") || str.equals("comment_press") || str.equals("collection_reply_button"))) {
                eventType = "collection_comment";
            }
            if (comment.getImageList() != null && !comment.getImageList().isEmpty()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(comment.getText());
                LIZ.append(" ");
                LIZ.append(this.LJLJI.getString(R.string.dih));
                text = X1D.LIZIZ(LIZ);
            } else {
                text = comment.getText();
            }
            ActivityC45651qj mo49getActivity = this.LJLJI.mo49getActivity();
            String uid = user.getUid();
            String LIZLLL = AV1.LIZLLL(user);
            UrlModel avatarThumb = user.getAvatarThumb();
            String cid3 = comment.getCid();
            String awemeId = comment.getAwemeId();
            String LJIILLIIL = LJIILLIIL();
            int LIZ2 = C55688LtM.LIZ(eventType2);
            CommentVideoModel.Type type2 = CommentVideoModel.Type.COMMENT;
            if (type == type2) {
                str3 = "comment_reply";
            } else {
                str3 = "question_and_answer";
            }
            HPW.LIZ(mo49getActivity, new CommentVideoModel(uid, LIZLLL, avatarThumb, text, cid3, awemeId, LJIILLIIL, cid, str2, LIZ2, str, 0, 0, type, str3, eventType));
            if (type == type2) {
                Fragment fragment = this.LJLJI;
                if (fragment instanceof CommentListFragment) {
                    C73W c73w = ((CommentListFragment) fragment).LLILII;
                    if (c73w != null) {
                        if (!TextUtils.equals("comment_press", str)) {
                            str6 = "comment_click";
                        }
                        c73w.LLIIL(comment, "reply_via_video", str6);
                    }
                    LJJIIJ();
                }
            }
            if (eventType.equals("collection_comment")) {
                if (comment.getCommentType() == 2) {
                    cid2 = comment.getReplyId();
                } else {
                    cid2 = comment.getCid();
                }
                if (!TextUtils.isEmpty(comment.getReplyToReplyCommentId()) && !TextUtils.equals(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
                    str4 = "reply_to_reply";
                } else if (!TextUtils.isEmpty(comment.getReplyId()) && !TextUtils.equals(comment.getReplyId(), CardStruct.IStatusCode.DEFAULT)) {
                    str4 = "reply";
                } else {
                    str4 = "original";
                }
                if (comment.getAliasAweme() != null) {
                    str5 = comment.getAliasAweme().getAuthorUid();
                }
                C1793872g.LJIIJ(str, comment.getAwemeId(), comment.getCid(), comment.getUser().getUid(), cid2, -1, -1, str4, eventType, null, !TextUtils.equals(str5, ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0, V16.LJJIZ(comment));
            }
            LJJIIJ();
        }
    }

    public final void LJJJJLL(View view, String str, String str2) {
        Context LIZIZ;
        Fragment fragment = this.LJLJI;
        if (fragment == null || (LIZIZ = fragment.getContext()) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        if (!LJJIJIIJI()) {
            return;
        }
        if ((C6ZT.LIZ(view) && view != null) || LJJLIIIJJI(str2, str, "click_type_comment")) {
            return;
        }
        if (AV1.LJIIJJI()) {
            C05L.LIZLLL(LIZIZ, R.string.cq5);
            return;
        }
        if (this.LJLJJI.getCommentInputAweme() != null && !C80S.LJFF(this.LJLJJI.getCommentInputAweme())) {
            this.LJLLILLLL = true;
            if (this.LJLIL != null) {
                this.LJLLJ = "click_input_box";
                LJJLI(null, false);
            } else if (view instanceof C224748ru) {
                CharSequence hint = ((TextView) view).getHint();
                this.LJLLJ = "click_input_box";
                LJJLI(hint, false);
            } else {
                LIZ();
            }
        }
        this.LJLJJI.onCommentInputClick();
    }

    public final void LJJLIIIIJ(Comment comment, User user, String str) {
        if (!LJJIJIIJI()) {
            return;
        }
        this.LJLLJ = str;
        if (C72O.LIZ()) {
            C174596tD.LJIIIIZZ = EnumC177726yG.REPLY_COMMENT;
            C174596tD.LJIIIZ = Boolean.FALSE;
        }
        C186577Tx.LIZIZ("reply", LJIJJLI());
        C177146xK c177146xK = this.LJLIL;
        if (c177146xK != null) {
            c177146xK.LIZ = this.LJLLJ;
            c177146xK.LIZ(new AObjectS42S0201000_13(2, this, user, 1));
            C177146xK c177146xK2 = this.LJLIL;
            CommentVideoModel.Type viewType = LJIJ();
            c177146xK2.getClass();
            o.LJIIIZ(comment, "comment");
            o.LJIIIZ(viewType, "viewType");
            c177146xK2.LIZIZ.P3(new AqS169S0100000_3(viewType, 91));
            c177146xK2.LIZIZ.X3(null);
            KeyboardVMV2 K3 = c177146xK2.LIZIZ.K3();
            K3.getClass();
            K3.withState(new AqS46S1200000_3(comment, str, K3, 3));
            return;
        }
        int LJJ = LJJ();
        int commentInputViewType = this.LJLJJI.getCommentInputViewType();
        boolean hasUpvoteOption = this.LJLJJI.hasUpvoteOption();
        String LJIJJLI = LJIJJLI();
        Bundle LJIJI = LJIJI(this.LJLL);
        KeyboardDialogFragment wl = KeyboardDialogFragment.wl(commentInputViewType, LJIJJLI, hasUpvoteOption, this.LLILZ);
        Bundle arguments = wl.getArguments();
        if (arguments != null) {
            arguments.putAll(LJIJI);
            arguments.putSerializable("user", user);
            arguments.putInt("maxLength", LJJ);
            arguments.putBoolean("showAt", true);
        }
        if (wl.getArguments() != null) {
            wl.getArguments().putString("fromPage", LJIL());
            wl.getArguments().putString("rec_type", user.getAccurateRecType());
        }
        LJIIJJI(wl);
        if (C77321UWf.LIZLLL(LJIIZILJ(), false)) {
            C74Z.LJJIIJ(LJIJJLI());
        }
    }

    public final boolean LJJLIIIJJI(String str, String str2, String str3) {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            ActivityC45651qj mo49getActivity = this.LJLJI.mo49getActivity();
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", str);
            c40883G2t.LIZLLL("author_id", LJIILLIIL());
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str));
            J9P.LIZIZ(mo49getActivity, str2, str3, (Bundle) c40883G2t.LIZ, null);
            return true;
        }
        if (LJIIIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC40402FtO
    public final void onActivityResult(int i, int i2, Intent intent) {
        final User user;
        if (LJJIJIIJI() && i == 111) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.LJLJI.getChildFragmentManager().LJJJIL("CommentInputManager");
            if (keyboardDialogFragment != null) {
                keyboardDialogFragment.LLILLJJLI = true;
            }
            if (intent != null && (user = (User) intent.getSerializableExtra("extra_data")) != null) {
                this.LJLJJL.add(user);
                if (keyboardDialogFragment != null) {
                    if (!keyboardDialogFragment.LJLJL.LJI(C1799274i.LJ(user, this.LJLJJI.getEventType()), user.getUid(), user.getSecUid()) && this.LJLJI.getContext() != null) {
                        C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
                        c26045AKb.LJIIIIZZ(R.string.bnk);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    return;
                }
                new Handler().post(new Runnable() { // from class: X.6x9
                    public final void LIZ() {
                        if (C176996x5.this.LJLJJL.isEmpty()) {
                            C176996x5 c176996x5 = C176996x5.this;
                            User user2 = user;
                            if (!c176996x5.LJJIJIIJI()) {
                                return;
                            }
                            int LJJ = c176996x5.LJJ();
                            int commentInputViewType = c176996x5.LJLJJI.getCommentInputViewType();
                            boolean hasUpvoteOption = c176996x5.LJLJJI.hasUpvoteOption();
                            String LJIJJLI = c176996x5.LJIJJLI();
                            Bundle LJIJI = c176996x5.LJIJI(c176996x5.LJLL);
                            KeyboardDialogFragment wl = KeyboardDialogFragment.wl(commentInputViewType, LJIJJLI, hasUpvoteOption, c176996x5.LLILZ);
                            Bundle arguments = wl.getArguments();
                            if (arguments != null) {
                                arguments.putAll(LJIJI);
                                arguments.putSerializable("atUser", user2);
                                arguments.putInt("maxLength", LJJ);
                                arguments.putBoolean("showAt", true);
                            }
                            c176996x5.LJIIJJI(wl);
                            return;
                        }
                        C176996x5 c176996x52 = C176996x5.this;
                        HashSet<User> hashSet = c176996x52.LJLJJL;
                        if (!c176996x52.LJJIJIIJI()) {
                            return;
                        }
                        int LJJ2 = c176996x52.LJJ();
                        int commentInputViewType2 = c176996x52.LJLJJI.getCommentInputViewType();
                        boolean hasUpvoteOption2 = c176996x52.LJLJJI.hasUpvoteOption();
                        String LJIJJLI2 = c176996x52.LJIJJLI();
                        Bundle LJIJI2 = c176996x52.LJIJI(c176996x52.LJLL);
                        KeyboardDialogFragment wl2 = KeyboardDialogFragment.wl(commentInputViewType2, LJIJJLI2, hasUpvoteOption2, c176996x52.LLILZ);
                        Bundle arguments2 = wl2.getArguments();
                        if (arguments2 != null) {
                            arguments2.putAll(LJIJI2);
                            arguments2.putSerializable("atUserSet", hashSet);
                            arguments2.putInt("maxLength", LJJ2);
                            arguments2.putBoolean("showAt", true);
                        }
                        c176996x52.LJIIJJI(wl2);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
    }

    public final void LJJJI(CharSequence charSequence, List list, Emoji emoji, List list2, boolean z, C177156xL c177156xL) {
        LJJJ(charSequence, list, emoji, list2, z, 0, c177156xL);
    }

    public final void LJJJ(CharSequence charSequence, List list, Emoji emoji, List list2, boolean z, int i, C177156xL c177156xL) {
        boolean z2;
        int i2;
        boolean z3;
        String eventType;
        String str;
        Aweme LJIIZILJ = LJIIZILJ();
        GiftViewModel giftViewModel = this.LLIIJLIL;
        if (giftViewModel != null && giftViewModel.jv0().getValue() != null) {
            z2 = true;
        } else {
            z2 = false;
            if (TextUtils.isEmpty(charSequence) && (list2 == null || list2.isEmpty())) {
                return;
            }
        }
        if (!LJJIJIIJI()) {
            return;
        }
        if (AV1.LJIIJJI()) {
            C5S1 c5s1 = new C5S1(this.LJLJI.getContext());
            c5s1.LIZJ(R.string.cq5);
            c5s1.LJ();
            return;
        }
        this.LJLJI.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            Context context = this.LJLJI.getContext();
            if (context != null) {
                context = C45804HyK.LJIJJ(context);
            }
            CommentService.LIZ.getClass();
            if (CommentServiceImpl.LJJL().LJIILLIIL(LJIIZILJ)) {
                CommentServiceImpl.LJJL().LJJIZ(context, R.string.djp, this.LJLJI.getString(R.string.dm_));
                return;
            }
            if (!CommentServiceImpl.LJJL().LJJIJIIJI(LJIIZILJ)) {
                CommentServiceImpl.LJJL().LJJIZ(context, R.string.dk8, this.LJLJI.getString(R.string.dk7));
                return;
            }
            if (charSequence.length() > LJJI(false)) {
                C5S1 c5s12 = new C5S1(this.LJLJI.getContext());
                c5s12.LIZJ(R.string.c8n);
                c5s12.LJ();
                return;
            }
            if (z2) {
                i2 = 5;
            } else {
                i2 = 1;
            }
            if (LJJLIIIJILLIZJL(i2)) {
                return;
            }
            int i3 = 2;
            if (this.LJLJJI.getCommentInputReplyComment() != null) {
                this.LJLLI = 2;
            } else {
                this.LJLLI = 1;
            }
            this.LLIIZ = false;
            c177156xL.LIZJ = list;
            if (list2 != null && !list2.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            c177156xL.LJ = z3;
            if (!this.LLIIZ) {
                if (z) {
                    str = "close_text_button_send";
                } else {
                    str = "button_send";
                }
                this.LJLJJI.onCommentInputPublishClick(this.LJLLI, C1801075a.LIZJ(charSequence.toString()), charSequence, str, "", false, c177156xL);
            }
            InterfaceC177046xA interfaceC177046xA = this.LJLJJI;
            String str2 = "";
            if (interfaceC177046xA == null) {
                eventType = "";
            } else {
                eventType = interfaceC177046xA.getEventType();
            }
            if (LJIIZILJ != null) {
                str2 = LJIIZILJ.getAid();
            }
            C176696wb c176696wb = new C176696wb();
            c176696wb.LIZ = str2;
            c176696wb.LIZIZ = charSequence.toString();
            o.LJIIIZ(eventType, "eventType");
            c176696wb.LJIILL = eventType;
            c176696wb.LIZLLL = list;
            c176696wb.LJIIZILJ = list2;
            c176696wb.LJFF = C55688LtM.LIZ(eventType);
            c176696wb.LJIIL = false;
            c176696wb.LJIILIIL = i;
            String authorUid = LJIILLIIL();
            o.LJIIIZ(authorUid, "authorUid");
            c176696wb.LJIJ = authorUid;
            C176646wW LJIILIIL = LJIILIIL();
            InterfaceC177046xA interfaceC177046xA2 = this.LJLJJI;
            if (interfaceC177046xA2 != null && interfaceC177046xA2.getCommentInputReplyComment() != null) {
                Comment commentInputReplyComment = this.LJLJJI.getCommentInputReplyComment();
                if (commentInputReplyComment.getCommentType() == 2) {
                    LJIILIIL.LJLJJLL = 2;
                    c176696wb.LIZJ = commentInputReplyComment.getReplyId();
                    c176696wb.LJ = commentInputReplyComment.getCid();
                } else {
                    if (!this.LJLLLL) {
                        i3 = 0;
                    }
                    LJIILIIL.LJLJJLL = i3;
                    c176696wb.LIZJ = commentInputReplyComment.getCid();
                }
                if (commentInputReplyComment.getCommentType() == 223 || commentInputReplyComment.parentCommentType == 223) {
                    c176696wb.LJIILLIIL = 223;
                }
                c177156xL.LJFF = C78886Uxe.LJJIIJ(commentInputReplyComment);
            } else {
                LJIILIIL.LJLJJLL = this.LJLLLL ? 1 : 0;
            }
            GiftViewModel giftViewModel2 = this.LLIIJLIL;
            if (giftViewModel2 != null && giftViewModel2.jv0().getValue() != null) {
                long id = this.LLIIJLIL.jv0().getValue().getId();
                boolean isFromGiftBag = this.LLIIJLIL.jv0().getValue().isFromGiftBag();
                c176696wb.LJII = id;
                c176696wb.LJIIIIZZ = isFromGiftBag;
                c176696wb.LJI = LJIILLIIL();
                if (this.LLIIJLIL.kv0().getValue() != null) {
                    c176696wb.LJIIIZ = this.LLIIJLIL.kv0().getValue().get(Long.valueOf(id));
                }
                if (!this.LLIILZL.LJFF()) {
                    this.LLIILZL.LIZJ();
                }
            }
            if (this.LJLJI instanceof CommentListFragment) {
                c176696wb.LJIIJJI = 0;
            }
            InterfaceC177046xA interfaceC177046xA3 = this.LJLJJI;
            if (interfaceC177046xA3 != null && interfaceC177046xA3.upvoteWhenComment()) {
                c176696wb.LJIILJJIL = 1;
                LJIILIIL.LJLJJLL = 223;
            }
            c176696wb.LJIIJ = 0;
            c176696wb.LJIJI = c177156xL;
            C176676wZ LIZ = c176696wb.LIZ();
            boolean LJFF = C7HV.LIZIZ.LJFF(str2);
            InterfaceC177046xA interfaceC177046xA4 = this.LJLJJI;
            if (interfaceC177046xA4 != null && interfaceC177046xA4.upvoteWhenComment()) {
                LJJJJJ(LIZ, charSequence.toString(), list, list2, false, false, LJFF);
            } else {
                LJIILIIL.LJJIIZI(LIZ);
                LJJJJZ(LJIILIIL);
            }
            if (list != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TextExtraStruct) it.next()).getUserId());
                }
                String LJIJJLI = LJIJJLI();
                C188727au c188727au = new C188727au();
                c188727au.LJFF(arrayList, "to_user_id");
                c188727au.LJIIIZ("group_id", LJIIZILJ.getAid());
                c188727au.LJIIIZ("author_id", LJIIZILJ.getAuthorUid());
                c188727au.LJIIIZ("enter_from", LJIJJLI);
                FMX.LJIIL("send_comment_at", c188727au.LIZ);
            }
            LJJJLZIJ(null);
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    public final void LJJJJJ(AbstractC176686wa abstractC176686wa, final String str, final List<TextExtraStruct> list, final List<CommentImageModel> list2, boolean z, final boolean z2, final boolean z3) {
        String str2;
        String str3;
        C223688qC c223688qC;
        String str4;
        UrlModel urlModel;
        String uri;
        User author;
        String num;
        boolean LJJIIZI;
        this.LJLJJI.onUpvotePublishProcessChanged(true);
        boolean z4 = false;
        if (abstractC176686wa != null && abstractC176686wa.LJIIIIZZ != 0 && !TextUtils.isEmpty(abstractC176686wa.LJII) && (abstractC176686wa instanceof C176676wZ)) {
            C176676wZ c176676wZ = (C176676wZ) abstractC176686wa;
            C176646wW LJIILIIL = LJIILIIL();
            Comment LIZ = C174446sy.LIZ(c176676wZ.LJI);
            if (z) {
                if (LIZ != null) {
                    LJIILIIL.LJLJLLL = LIZ;
                }
                LJIILIIL.LJJIIJ();
                LJJIIZI = LJIILIIL.LJIILL(c176676wZ);
            } else if (z2) {
                c176676wZ.LJIIL = 1;
                if (LIZ != null) {
                    LJIILIIL.LJLJLLL = LIZ;
                }
                LJJIIZI = LJIILIIL.LJJIIJZLJL(c176676wZ);
            } else {
                LJJIIZI = LJIILIIL.LJJIIZI(c176676wZ);
            }
            LJJJJZ(LJIILIIL);
            if (!LJJIIZI) {
                this.LJLJJI.onUpvotePublishProcessChanged(false);
                return;
            }
            return;
        }
        final C176606wS c176606wS = this.LJLJL;
        Aweme commentInputAweme = this.LJLJJI.getCommentInputAweme();
        String eventType = this.LJLJJI.getEventType();
        String enterMethod = this.LJLJJI.getEnterMethod();
        c176606wS.LJLJJI = commentInputAweme;
        String str5 = null;
        if (commentInputAweme != null) {
            str2 = commentInputAweme.getAid();
        } else {
            str2 = null;
        }
        String str6 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (eventType == null) {
            eventType = "";
        }
        if (enterMethod == null || enterMethod.length() == 0) {
            enterMethod = "post_comment";
        }
        if (commentInputAweme == null || (str3 = commentInputAweme.getAuthorUid()) == null) {
            str3 = "";
        }
        if (commentInputAweme != null && (author = commentInputAweme.getAuthor()) != null && (num = Integer.valueOf(author.getFollowStatus()).toString()) != null) {
            str6 = num;
        }
        final UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(eventType, enterMethod, str2, str3, str6, str5, str5, str5, z4, str5, 4064);
        C7HV c7hv = C7HV.LIZIZ;
        InterfaceC174526t6 LJIJJ = c7hv.LJIJJ(c176606wS.LJLJJL);
        if (LJIJJ != null) {
            LJIJJ.LIZIZ(c176606wS);
        }
        c7hv.LJIILJJIL().LJFF(str2, str, z3, list, list2);
        UpvoteStruct LJIIIIZZ = V16.LJIIIIZZ(c7hv.LJIIIZ(str2));
        if (LJIIIIZZ != null) {
            c223688qC = V16.LJJLIIIJLJLI(LJIIIIZZ);
        } else {
            c223688qC = null;
        }
        if (abstractC176686wa != null) {
            C174446sy.LJIIIIZZ(c223688qC, abstractC176686wa);
        }
        if (c223688qC != null) {
            C174446sy.LJ(c223688qC);
            InterfaceC176716wd interfaceC176716wd = (InterfaceC176716wd) c176606wS.LJLILLLLZI;
            if (interfaceC176716wd != null) {
                interfaceC176716wd.Nl0(c223688qC);
            }
            str4 = c223688qC.getFakeId();
        } else {
            str4 = null;
        }
        if (list2 != null && (urlModel = (UrlModel) ListProtector.get(list2, 0)) != null && ((uri = urlModel.getUri()) == null || uri.length() == 0)) {
            final CommentImageModel commentImageModel = (CommentImageModel) ListProtector.get(list2, 0);
            if (c176606wS.LJLJJLL == null) {
                c176606wS.LJLJJLL = new Y88();
            }
            if (str4 != null && str4.length() != 0 && commentImageModel != null) {
                Y89.LJIIIZ(commentImageModel, str4);
            }
            Y88 y88 = c176606wS.LJLJJLL;
            if (y88 != null) {
                final String str7 = str2;
                final C223688qC c223688qC2 = c223688qC;
                final String str8 = str4;
                y88.LIZJ(commentImageModel, new SH7() { // from class: X.6wY
                    @Override // X.SH7
                    public final void onError() {
                        C174446sy.LJFF(c223688qC2);
                        InterfaceC176716wd interfaceC176716wd2 = (InterfaceC176716wd) C176606wS.this.LJLILLLLZI;
                        if (interfaceC176716wd2 != null) {
                            interfaceC176716wd2.onImageUploadProgress(str8, -1);
                        }
                        String str9 = str8;
                        if (str9 == null || str9.length() == 0) {
                            return;
                        }
                        Y89.LIZLLL(-1, str8);
                    }

                    @Override // X.SH7
                    public final void onComplete(String str9) {
                        CommentImageModel commentImageModel2 = commentImageModel;
                        if (commentImageModel2 != null) {
                            commentImageModel2.setUri(str9);
                        }
                        C113294cX.LIZ(C7HV.LIZIZ, str7, upvotePublishMobParam, str, list, list2, z2, null, null, z3, 192);
                    }

                    @Override // X.SH7
                    public final void onProgress(long j) {
                        InterfaceC176716wd interfaceC176716wd2 = (InterfaceC176716wd) C176606wS.this.LJLILLLLZI;
                        if (interfaceC176716wd2 != null) {
                            interfaceC176716wd2.onImageUploadProgress(str8, (int) j);
                        }
                    }
                });
                return;
            }
            return;
        }
        C113294cX.LIZ(c7hv, str2, upvotePublishMobParam, str, list, list2, z2, null, null, z3, 192);
    }
}
