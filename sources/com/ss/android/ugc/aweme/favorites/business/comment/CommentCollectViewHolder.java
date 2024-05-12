package com.ss.android.ugc.aweme.favorites.business.comment;

import X.ActivityC45651qj;
import X.C00F;
import X.C10K;
import X.C16880lQ;
import X.C174126sS;
import X.C174266sg;
import X.C174356sp;
import X.C174606tE;
import X.C176206vo;
import X.C176436wB;
import X.C176996x5;
import X.C177156xL;
import X.C178216z3;
import X.C178456zR;
import X.C1799274i;
import X.C1800774x;
import X.C188727au;
import X.C1A7;
import X.C245319jz;
import X.C252659vp;
import X.C26045AKb;
import X.C2NU;
import X.C32151Nz;
import X.C41424GNo;
import X.C47261Igj;
import X.C55688LtM;
import X.C62846OlW;
import X.C72434Sbm;
import X.C74Z;
import X.C76S;
import X.C78765Uvh;
import X.C78857UxB;
import X.C78939UyV;
import X.C7TY;
import X.C99W;
import X.FMX;
import X.HG3;
import X.InterfaceC174626tG;
import X.InterfaceC174756tT;
import X.InterfaceC176256vt;
import X.InterfaceC176266vu;
import X.InterfaceC177046xA;
import X.KL2;
import X.OUP;
import X.RBX;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.AgS49S0201000_3;
import Y.IDCListenerS279S0100000_3;
import Y.IDCListenerS47S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentCollectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, InterfaceC176266vu, InterfaceC177046xA, InterfaceC174756tT, InterfaceC174626tG, Observer<C176206vo> {
    public static final int $stable = 8;
    public C72434Sbm commentAvatar;
    public CommentCollectListAdapter commentCollectAdapter;
    public TuxTextView commentMessage;
    public TuxTextView commentUserName;
    public C62846OlW commentVideoCover;
    public final long createTimeMultiplier;
    public final boolean isFromMyProfile;
    public Activity mActivity;
    public InterfaceC176256vt mCommentActionSheetClickListener;
    public C174606tE mCommentDeletePresenter;
    public C176996x5 mCommentInputManager;
    public C178216z3 mCommentTranslateRepository;
    public Fragment mFragment;
    public Comment mItem;
    public TuxTextView regularReplyButton;
    public C76S translateStatusView;
    public TuxActionSheet tuxLongPressDialog;
    public TuxTextView videoReplyButton;

    public boolean checkCommentInputAtUserClickable() {
        return true;
    }

    @Override // X.InterfaceC177046xA
    public boolean checkCommentInputable() {
        return true;
    }

    @Override // X.InterfaceC177046xA
    public int getCommentInputViewType() {
        return 3;
    }

    @Override // X.InterfaceC177046xA
    public String getEnterMethod() {
        return "collection_comment";
    }

    @Override // X.InterfaceC177046xA
    public String getEventType() {
        return "";
    }

    public Comment getForwardComment() {
        return null;
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ boolean hasUpvoteOption() {
        return false;
    }

    public boolean isEventBusRegistered() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ void onClickCloseUpvotePanel() {
    }

    public void onCommentInputAtUserClick(boolean z) {
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputClick() {
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputKeyboardDismiss(boolean z, C177156xL eventTrackingBundle) {
        o.LJIIIZ(eventTrackingBundle, "eventTrackingBundle");
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputPublishStart(Comment comment) {
    }

    @Override // X.InterfaceC177046xA
    public void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC177046xA
    public void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC177046xA
    public void onEvent(C174266sg c174266sg) {
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    @Override // X.InterfaceC174756tT
    public /* bridge */ /* synthetic */ void resetTranslatedMultiComment(List list) {
    }

    @Override // X.InterfaceC174756tT
    public /* bridge */ /* synthetic */ void translateMultiWithReplyComment(List list) {
    }

    @Override // X.InterfaceC177046xA
    public /* bridge */ /* synthetic */ boolean upvoteWhenComment() {
        return false;
    }

    private final InterfaceC176256vt createCommentActionSheetClickListener() {
        return new InterfaceC176256vt() { // from class: X.6vn
            @Override // X.InterfaceC176256vt
            public final /* synthetic */ void LIZLLL() {
            }

            @Override // X.InterfaceC176256vt
            public final void LJ() {
            }

            @Override // X.InterfaceC176256vt
            public final void LJFF() {
            }

            @Override // X.InterfaceC176256vt
            public final void LJII() {
            }

            @Override // X.InterfaceC176256vt
            public final /* synthetic */ void LJIIIZ() {
            }

            @Override // X.InterfaceC176256vt
            public final void LJIIL() {
            }

            @Override // X.InterfaceC176256vt
            public final void LJIILJJIL() {
            }

            @Override // X.InterfaceC176256vt
            public final void onCancel() {
            }

            @Override // X.InterfaceC176256vt
            public final void LIZ() {
                Comment comment;
                CommentCollectViewHolder commentCollectViewHolder = CommentCollectViewHolder.this;
                Activity activity = commentCollectViewHolder.mActivity;
                if (activity != null && (comment = commentCollectViewHolder.mItem) != null) {
                    commentCollectViewHolder.report(activity, comment);
                }
            }

            @Override // X.InterfaceC176256vt
            public final void LIZIZ() {
                CommentCollectViewHolder.this.resetTranslate();
            }

            @Override // X.InterfaceC176256vt
            public final void LIZJ() {
                CommentCollectViewHolder.this.translate();
            }

            @Override // X.InterfaceC176256vt
            public final void LJI() {
                CommentCollectViewHolder commentCollectViewHolder = CommentCollectViewHolder.this;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.commentCollect(comment, 0);
                }
            }

            @Override // X.InterfaceC176256vt
            public final void LJIIIIZZ() {
                CommentCollectViewHolder commentCollectViewHolder = CommentCollectViewHolder.this;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.copy(comment);
                }
            }

            @Override // X.InterfaceC176256vt
            public final void LJIIJ() {
                CommentCollectViewHolder commentCollectViewHolder = CommentCollectViewHolder.this;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.commentCollect(comment, 1);
                }
            }

            @Override // X.InterfaceC176256vt
            public final void LJIIJJI() {
                CommentCollectViewHolder commentCollectViewHolder = CommentCollectViewHolder.this;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.delete(comment);
                }
            }

            @Override // X.InterfaceC176256vt
            public final void LJIILIIL(CommentVideoModel.Type type, Comment comment) {
                C176996x5 c176996x5 = CommentCollectViewHolder.this.mCommentInputManager;
                if (c176996x5 != null && c176996x5.LLILII && type == CommentVideoModel.Type.COMMENT && c176996x5 != null) {
                    c176996x5.LJJJJIZL(comment, type, "comment_press");
                }
            }
        };
    }

    private final boolean invalidNetwork() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return true;
        }
        if (INVOKESTATIC_com_ss_android_ugc_aweme_favorites_business_comment_CommentCollectViewHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(activity)) {
            return false;
        }
        tuxToastGenerator(R.string.img, 0);
        return true;
    }

    private final void onTranslating() {
        this.translateStatusView.setLoading(true);
        this.translateStatusView.setLoadingText(R.string.dm9);
    }

    private final void regularReplyButtonAction() {
        C16880lQ.LJJJJI(this.regularReplyButton, new ACListenerS23S0100000_3(this, 54));
    }

    private final void videoReplyButtonAction() {
        C16880lQ.LJJJJI(this.videoReplyButton, new ACListenerS23S0100000_3(this, 55));
    }

    @Override // X.InterfaceC177046xA
    public Aweme getCommentInputAweme() {
        Comment comment = this.mItem;
        if (comment != null) {
            return comment.getAliasAweme();
        }
        return null;
    }

    @Override // X.InterfaceC176266vu
    public void onShowItem() {
        Comment comment = this.mItem;
        if (comment != null) {
            String cid = comment.getCid();
            String LIZIZ = C178456zR.LIZIZ(1);
            C188727au LIZ = C178456zR.LIZ("comment", "collection_comment");
            LIZ.LJIIIZ("comment_id", cid);
            FMX.LJIIL(LIZIZ, LIZ.LIZ);
        }
    }

    @Override // X.InterfaceC174756tT
    public void resetTranslate() {
        Comment comment = this.mItem;
        if (comment != null && this.mCommentTranslateRepository != null) {
            C178216z3.LJ(C47261Igj.LJJIJ(comment));
        }
    }

    @Override // X.InterfaceC174756tT
    public void translate() {
        String str;
        String str2;
        User author;
        Comment comment = this.mItem;
        if (comment != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (LJIILL != null) {
                str = ((RBX) LJIILL).getCurUserId();
            } else {
                str = null;
            }
            C188727au c188727au = new C188727au();
            Aweme aliasAweme = comment.getAliasAweme();
            if (aliasAweme != null && (author = aliasAweme.getAuthor()) != null) {
                str2 = author.getUid();
            } else {
                str2 = null;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("author_id", str2);
            c188727au.LJIIIZ("enter_from", "collection_comment");
            String cid = comment.getCid();
            if (cid == null) {
                cid = "";
            }
            c188727au.LJIIIZ("comment_id", cid);
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("user_id", str);
            String awemeId = comment.getAwemeId();
            if (awemeId != null) {
                str3 = awemeId;
            }
            c188727au.LJIIIZ("group_id", str3);
            FMX.LJIIL("translate_comment", c188727au.LIZ);
            if (this.mCommentTranslateRepository != null) {
                C178216z3.LJI(C47261Igj.LJJIJ(comment), null, true);
            }
        }
    }

    @Override // X.InterfaceC177046xA
    public Comment getCommentInputReplyComment() {
        return this.mItem;
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_favorites_business_comment_CommentCollectViewHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void onTranslateFailure(C176206vo c176206vo) {
        this.translateStatusView.setLoading(false);
        Activity activity = this.mActivity;
        if (activity != null) {
            C1A7.LJIJJ(activity, c176206vo.LIZJ);
        }
    }

    private final void onTranslateSuccess(Comment comment) {
        this.translateStatusView.setLoading(false);
        Comment comment2 = this.mItem;
        if (comment2 != null) {
            comment2.setTranslated(comment.isTranslated());
        }
        this.commentMessage.setText(comment.getText());
    }

    public final void copy(Comment comment) {
        String str;
        String uid;
        User author;
        o.LJIIIZ(comment, "comment");
        IAccountUserService LJIILL = HG3.LJIILL();
        String str2 = null;
        if (LJIILL != null) {
            str = ((RBX) LJIILL).getCurUserId();
        } else {
            str = null;
        }
        C188727au c188727au = new C188727au();
        Aweme aliasAweme = comment.getAliasAweme();
        if (aliasAweme != null && (author = aliasAweme.getAuthor()) != null) {
            str2 = author.getUid();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("enter_from", "collection_comment");
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        c188727au.LJIIIZ("group_id", awemeId);
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        c188727au.LJIIIZ("comment_id", cid);
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("user_id", str);
        User user = comment.getUser();
        if (user != null && (uid = user.getUid()) != null) {
            str3 = uid;
        }
        c188727au.LJIIIZ("to_user_id", str3);
        FMX.LJIIL("copy_comment", c188727au.LIZ);
        C176996x5 c176996x5 = this.mCommentInputManager;
        if (c176996x5 != null) {
            c176996x5.LJIIL(comment, C78857UxB.LJJIIJ(1476399117, "bpea-copy_favorite_comment"));
        }
        tuxToastGenerator(R.string.ga7, 0);
    }

    public final void delete(Comment comment) {
        C176436wB c176436wB;
        if (invalidNetwork()) {
            return;
        }
        o.LJIIIZ(comment, "comment");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "collection_comment");
        String cid = comment.getCid();
        String str = "";
        if (cid == null) {
            cid = "";
        }
        c188727au.LJIIIZ("comment_id", cid);
        String awemeId = comment.getAwemeId();
        if (awemeId != null) {
            str = awemeId;
        }
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("is_video", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("delete_comment", c188727au.LIZ);
        C174606tE c174606tE = this.mCommentDeletePresenter;
        if (c174606tE != null && (c176436wB = (C176436wB) c174606tE.LJLIL) != null) {
            c176436wB.LJLJJI = new C174126sS(comment);
        }
        C174606tE c174606tE2 = this.mCommentDeletePresenter;
        if (c174606tE2 != null) {
            String cid2 = comment.getCid();
            comment.getAwemeId();
            int LIZ = C55688LtM.LIZ(getEventType());
            c174606tE2.LJLIL.getClass();
            c174606tE2.LJIILL(cid2, Integer.valueOf(LIZ), 0);
        }
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(C176206vo c176206vo) {
        Activity activity;
        if (c176206vo == null || c176206vo.LIZ == null || (activity = this.mActivity) == null || activity.isFinishing()) {
            return;
        }
        if (c176206vo.LIZLLL == 1) {
            onTranslating();
        } else {
            if (c176206vo.LIZIZ) {
                Comment comment = c176206vo.LIZ;
                o.LJIIIIZZ(comment, "event.comment");
                onTranslateSuccess(comment);
                return;
            }
            onTranslateFailure(c176206vo);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        String str;
        Aweme aliasAweme;
        String cid;
        o.LJIIIZ(v, "v");
        Comment comment = this.mItem;
        String str2 = "";
        if (comment != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "collection_comment");
            String awemeId = comment.getAwemeId();
            if (awemeId == null) {
                awemeId = "";
            }
            c188727au.LJIIIZ("group_id", awemeId);
            String cid2 = comment.getCid();
            if (cid2 == null) {
                cid2 = "";
            }
            c188727au.LJIIIZ("trigger_comment_id", cid2);
            FMX.LJIIL("enter_comment_list", c188727au.LIZ);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.mActivity, "aweme://aweme/detail/");
        Comment comment2 = this.mItem;
        String str3 = null;
        if (comment2 == null || (str = comment2.getAwemeId()) == null) {
            str = "";
        }
        buildRoute.withParam("id", str);
        buildRoute.withParam("refer", "collection_comment");
        Comment comment3 = this.mItem;
        if (comment3 != null && (cid = comment3.getCid()) != null) {
            str2 = cid;
        }
        buildRoute.withParam("cid", str2);
        buildRoute.withParam("video_from", "collection_comment");
        buildRoute.withParam("enter_method", "click_comment_icon");
        Comment comment4 = this.mItem;
        if (comment4 != null && (aliasAweme = comment4.getAliasAweme()) != null) {
            str3 = aliasAweme.getAid();
        }
        buildRoute.withParam("last_group_id", str3);
        buildRoute.withParam("is_my_profile", this.isFromMyProfile);
        buildRoute.open();
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputPublishSuccess(Comment comment) {
        tuxToastGenerator(R.string.ga8, R.drawable.atx);
    }

    @Override // X.InterfaceC174626tG
    public void onDeleteFailed(Exception exc) {
        Activity activity = this.mActivity;
        if (activity != null) {
            C1A7.LJIJJ(activity, exc);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Comment comment;
        boolean z;
        User user;
        FragmentManager fragmentManager;
        TuxActionSheet tuxActionSheet;
        String text;
        C252659vp LJJIJL;
        if (view == null || this.mActivity == null || this.mCommentActionSheetClickListener == null || this.mCommentInputManager == null || (comment = this.mItem) == null) {
            return false;
        }
        boolean equals = TextUtils.equals(Comment.getAuthorUid(comment), ((RBX) HG3.LJIILL()).getCurUserId());
        ArrayList arrayList = new ArrayList();
        Activity activity = this.mActivity;
        if (activity != null) {
            String string = activity.getString(R.string.dln);
            o.LJIIIIZZ(string, "it.getString(R.string.comment_reply_with_video)");
            arrayList.add(string);
            String string2 = activity.getString(R.string.ga5);
            o.LJIIIIZZ(string2, "it.getString(R.string.fav_comment_remove)");
            arrayList.add(string2);
            String string3 = activity.getString(R.string.dw4);
            o.LJIIIIZZ(string3, "it.getString(R.string.copy)");
            arrayList.add(string3);
            if (!equals) {
                Comment comment2 = this.mItem;
                if (comment2 != null && comment2.isTranslated()) {
                    String string4 = activity.getString(R.string.dlq);
                    o.LJIIIIZZ(string4, "it.getString(R.string.comment_see_original)");
                    arrayList.add(string4);
                } else {
                    String string5 = activity.getString(R.string.dm8);
                    o.LJIIIIZZ(string5, "it.getString(R.string.comment_translate)");
                    arrayList.add(string5);
                }
            }
            String string6 = activity.getString(R.string.q2_);
            o.LJIIIIZZ(string6, "it.getString(R.string.report)");
            arrayList.add(string6);
            if (equals) {
                String string7 = activity.getString(R.string.efd);
                o.LJIIIIZZ(string7, "it.getString(R.string.delete)");
                arrayList.add(string7);
            }
        }
        int LIZ = C00F.LIZ(31744, 0, "add_comments_to_favorites", false);
        if (LIZ == 2 || LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        ActivityC45651qj activityC45651qj = null;
        String str = null;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C176996x5 c176996x5 = this.mCommentInputManager;
                if (c176996x5 != null && (LJJIJL = c176996x5.LJJIJL(this.mCommentActionSheetClickListener, str2, this.mItem)) != null) {
                    arrayList2.add(LJJIJL);
                }
            }
            Comment comment3 = this.mItem;
            if (comment3 != null) {
                user = comment3.getUser();
            } else {
                user = null;
            }
            String LJ = C1799274i.LJ(user, getEventType());
            Comment comment4 = this.mItem;
            if (comment4 != null && (text = comment4.getText()) != null && text.length() > 0) {
                StringBuilder LIZJ = b1.LIZJ(LJ, ": ");
                Comment comment5 = this.mItem;
                if (comment5 != null) {
                    str = comment5.getText();
                }
                LIZJ.append(str);
                LJ = X1D.LIZIZ(LIZJ);
            }
            C245319jz c245319jz = new C245319jz();
            c245319jz.LJII(LJ);
            c245319jz.LIZ.LJLLL = 2;
            c245319jz.LJ(arrayList2);
            IDCListenerS279S0100000_3 iDCListenerS279S0100000_3 = new IDCListenerS279S0100000_3(this, 2);
            TuxActionSheet tuxActionSheet2 = c245319jz.LIZ;
            tuxActionSheet2.LJLIL = iDCListenerS279S0100000_3;
            tuxActionSheet2.LJLLLL = "";
            this.tuxLongPressDialog = c245319jz.LIZJ();
            if (!(!arrayList2.isEmpty())) {
                return false;
            }
            Comment comment6 = this.mItem;
            if (comment6 != null) {
                C174356sp.LIZ(comment6);
            }
            Fragment fragment = this.mFragment;
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null && (tuxActionSheet = this.tuxLongPressDialog) != null) {
                tuxActionSheet.show(fragmentManager, "CommentCollectViewHolder");
            }
            return true;
        }
        Fragment fragment2 = this.mFragment;
        if (fragment2 != null) {
            activityC45651qj = fragment2.mo49getActivity();
        }
        C41424GNo c41424GNo = new C41424GNo(activityC45651qj);
        c41424GNo.LIZ((CharSequence[]) arrayList.toArray(new String[0]), new IDCListenerS47S0200000_3(this, arrayList, 3));
        c41424GNo.LIZ.LIZ.LJIILIIL = new IDCListenerS279S0100000_3(this, 3);
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        Comment comment7 = this.mItem;
        if (comment7 != null) {
            C174356sp.LIZ(comment7);
        }
        c41424GNo.LIZIZ();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCollectViewHolder(View itemView, boolean z) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.isFromMyProfile = z;
        View findViewById = itemView.findViewById(R.id.jqv);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…ent_button_reply_regular)");
        this.regularReplyButton = (TuxTextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.jqw);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…mment_button_reply_video)");
        this.videoReplyButton = (TuxTextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.jr3);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…setting_item_video_cover)");
        this.commentVideoCover = (C62846OlW) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.jqt);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.setting_item_avatar)");
        this.commentAvatar = (C72434Sbm) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.jqy);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…g_item_comment_user_name)");
        this.commentUserName = (TuxTextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.jqx);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…ing_item_comment_message)");
        this.commentMessage = (TuxTextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.lk9);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.….translation_status_view)");
        this.translateStatusView = (C76S) findViewById7;
        this.createTimeMultiplier = 1000L;
    }

    private final void tuxToastGenerator(int i, int i2) {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (i2 != 0) {
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIZ(activity.getString(i));
                c26045AKb.LJFF(i2);
                c26045AKb.LJIIJ();
                return;
            }
            C26045AKb c26045AKb2 = new C26045AKb(activity);
            c26045AKb2.LJIIIZ(activity.getString(i));
            c26045AKb2.LJIIJ();
        }
    }

    public final void commentCollect(Comment comment, int i) {
        if (invalidNetwork()) {
            return;
        }
        C74Z.LJIJJLI("collection_comment", i, comment);
        C10K<BaseResponse> collectComment = UserFavoritesApi.LIZ.collectComment(comment.getCid(), i);
        if (collectComment != null) {
            collectComment.LJ(new AgS49S0201000_3(this, comment, i, 0), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC174626tG
    public void onDeleteSuccess(String str, C174126sS c174126sS) {
        String str2;
        Aweme aliasAweme;
        Comment comment = this.mItem;
        if (comment != null) {
            CommentCollectListAdapter commentCollectListAdapter = this.commentCollectAdapter;
            if (commentCollectListAdapter != null) {
                commentCollectListAdapter.removeItem(comment);
            }
            Comment comment2 = this.mItem;
            if (comment2 != null && (aliasAweme = comment2.getAliasAweme()) != null) {
                str2 = aliasAweme.getAid();
            } else {
                str2 = null;
            }
            C1800774x.LIZ(str2, null);
        }
    }

    public final void report(Activity activity, Comment comment) {
        String str;
        User author;
        o.LJIIIZ(comment, "comment");
        IAccountUserService LJIILL = HG3.LJIILL();
        String str2 = null;
        if (LJIILL != null) {
            str = ((RBX) LJIILL).getCurUserId();
        } else {
            str = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "collection_comment");
        c188727au.LJIIIZ("enter_method", "click_report_button");
        Aweme aliasAweme = comment.getAliasAweme();
        if (aliasAweme != null && (author = aliasAweme.getAuthor()) != null) {
            str2 = author.getUid();
        }
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        c188727au.LJIIIZ("group_id", awemeId);
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        c188727au.LJIIIZ("comment_id", cid);
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("user_id", str);
        c188727au.LJIIIZ("is_video", CardStruct.IStatusCode.DEFAULT);
        c188727au.LIZLLL(comment.getIsPhotoContained(), "is_photo_contained");
        FMX.LJIIL("report_comment", c188727au.LIZ);
        C7TY.LIZIZ(activity, getCommentInputAweme(), comment, comment.getUser().getUid(), KL2.LJIIIZ(activity));
    }

    @Override // X.InterfaceC177046xA
    public void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        tuxToastGenerator(R.string.q26, 0);
    }

    public final void bindView(Comment comment, Activity activity, Fragment fragment, CommentCollectListAdapter adapter) {
        User user;
        Aweme aliasAweme;
        Video video;
        UrlModel cover;
        User user2;
        UrlModel avatarThumb;
        o.LJIIIZ(adapter, "adapter");
        if (comment == null || activity == null || fragment == null) {
            return;
        }
        this.mActivity = activity;
        this.mFragment = fragment;
        this.mItem = comment;
        this.commentCollectAdapter = adapter;
        String cid = comment.getCid();
        this.translateStatusView.setVisibility(8);
        this.mCommentTranslateRepository = C178216z3.LIZ;
        C178216z3.LIZIZ(cid).observeForever(this, false);
        this.mCommentActionSheetClickListener = createCommentActionSheetClickListener();
        C176996x5 c176996x5 = new C176996x5(fragment, this);
        this.mCommentInputManager = c176996x5;
        c176996x5.LLILII = true;
        c176996x5.LJLLLLLL = "collection_comment";
        C174606tE c174606tE = new C174606tE();
        this.mCommentDeletePresenter = c174606tE;
        c174606tE.LJJ(new C176436wB());
        C174606tE c174606tE2 = this.mCommentDeletePresenter;
        if (c174606tE2 != null) {
            c174606tE2.LJLILLLLZI = this;
        }
        Comment comment2 = this.mItem;
        if (comment2 != null && (user2 = comment2.getUser()) != null && (avatarThumb = user2.getAvatarThumb()) != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
            LJII.LJJIJIIJIL = true;
            LJII.LIZIZ("collection_comment");
            LJII.LJJIIJ = this.commentAvatar;
            C16880lQ.LLJJJ(LJII);
        }
        String str = null;
        if (C99W.LIZ) {
            OUP.LJJJJLI(this.commentVideoCover, Float.valueOf(C32151Nz.LJIIZILJ(5)), null, null, 30);
        }
        Comment comment3 = this.mItem;
        if (comment3 != null && (aliasAweme = comment3.getAliasAweme()) != null && (video = aliasAweme.getVideo()) != null && (cover = video.getCover()) != null) {
            C78765Uvh.LJFF(this.commentVideoCover, cover);
            this.commentVideoCover.setVisibility(0);
        } else {
            this.commentVideoCover.setVisibility(8);
        }
        Comment comment4 = this.mItem;
        if (comment4 != null && comment4.getText() != null) {
            TuxTextView tuxTextView = this.commentMessage;
            Comment comment5 = this.mItem;
            if (comment5 != null) {
                str = comment5.getText();
            }
            tuxTextView.setText(str);
        }
        Comment comment6 = this.mItem;
        if (comment6 != null && (user = comment6.getUser()) != null) {
            this.commentUserName.setText(C1799274i.LJ(user, getEventType()));
        }
        C16880lQ.LJIIJ(this, this.itemView);
        this.itemView.setOnLongClickListener(this);
        regularReplyButtonAction();
        videoReplyButtonAction();
        onShowItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        if (r4 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (r4 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC177046xA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCommentInputPublishClick(int r33, int r34, java.lang.CharSequence r35, java.lang.String r36, java.lang.String r37, boolean r38, X.C177156xL r39) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder.onCommentInputPublishClick(int, int, java.lang.CharSequence, java.lang.String, java.lang.String, boolean, X.6xL):void");
    }
}
