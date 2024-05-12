package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181467Ag implements InterfaceC177046xA {
    public final InterfaceC181487Ai LJLIL;

    @Override // X.InterfaceC177046xA
    public final boolean checkCommentInputable() {
        return true;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC177046xA
    public final int getCommentInputViewType() {
        return 2;
    }

    @Override // X.InterfaceC177046xA
    public final String getEnterMethod() {
        return "click_repost_button";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean hasUpvoteOption() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onClickCloseUpvotePanel() {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onCommentInputClick() {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC177046xA
    public void onEvent(C174266sg c174266sg) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    @Override // X.InterfaceC177046xA
    public final boolean upvoteWhenComment() {
        return true;
    }

    @Override // X.InterfaceC177046xA
    public final Aweme getCommentInputAweme() {
        return this.LJLIL.f2().getAweme();
    }

    @Override // X.InterfaceC177046xA
    public final String getEventType() {
        String str = this.LJLIL.f2().mEventType;
        o.LJIIIIZZ(str, "upvoteBubbleContext.getVideoItemParams().eventType");
        return str;
    }

    public C181467Ag(InterfaceC181487Ai upvoteBubbleContext) {
        o.LJIIIZ(upvoteBubbleContext, "upvoteBubbleContext");
        this.LJLIL = upvoteBubbleContext;
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishStart(Comment comment) {
        String str;
        if (((Number) C181497Aj.LIZ.getValue()).intValue() > 0) {
            if (comment == null || (str = comment.getAwemeId()) == null) {
                str = "";
            }
            C178646zk c178646zk = new C178646zk(0);
            c178646zk.LJLILLLLZI = str;
            C2U8.LIZ(c178646zk);
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishSuccess(Comment comment) {
        Fragment fragment;
        Aweme commentInputAweme;
        if (comment == null || (fragment = this.LJLIL.f2().fragment) == null) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(fragment);
        c26045AKb.LJIIIIZZ(R.string.dl4);
        c26045AKb.LJIIJ();
        String awemeId = comment.getAwemeId();
        if (awemeId == null && ((commentInputAweme = getCommentInputAweme()) == null || (awemeId = commentInputAweme.getAid()) == null)) {
            awemeId = "";
        }
        C2U8.LIZ(new C174046sK(3, new Object[]{awemeId, comment.m103clone()}));
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL) {
        this.LJLIL.z1();
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        User author;
        String uid;
        VideoItemParams f2 = this.LJLIL.f2();
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ(f2.mEventType, "enter_from");
        Aweme aweme = f2.getAweme();
        String str2 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ(str2, "group_id");
        oszArr[2] = new OSZ(1, "show_exposed_emoji");
        oszArr[3] = new OSZ("click_repost_button", "enter_method");
        Aweme aweme2 = f2.getAweme();
        if (aweme2 != null && (author = aweme2.getAuthor()) != null && (uid = author.getUid()) != null) {
            str3 = uid;
        }
        oszArr[4] = new OSZ(str3, "author_id");
        FMX.LJIILL("enter_text", oszArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r1 != 2) goto L29;
     */
    @Override // X.InterfaceC177046xA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCommentInputPublishFailed(java.lang.Exception r15, int r16, com.ss.android.ugc.aweme.comment.model.Comment r17) {
        /*
            r14 = this;
            X.7Ai r0 = r14.LJLIL
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r0.f2()
            androidx.fragment.app.Fragment r3 = r0.fragment
            if (r3 != 0) goto Lb
            return
        Lb:
            if (r17 == 0) goto L13
            java.lang.String r2 = r17.getAwemeId()
            if (r2 != 0) goto L21
        L13:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.getCommentInputAweme()
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.getAid()
            if (r2 != 0) goto L21
        L1f:
            java.lang.String r2 = ""
        L21:
            X.7HV r4 = X.C7HV.LIZIZ
            X.6u4 r0 = r4.LJIILJJIL()
            boolean r0 = r0.LJIIIZ(r15)
            if (r0 == 0) goto L37
            X.6u4 r1 = r4.LJIILJJIL()
            X.6yI r0 = X.EnumC177746yI.PERMISSION_DENIED
            r1.LJII(r2, r0)
            return
        L37:
            X.6uY r0 = com.ss.android.ugc.aweme.comment.services.CommentService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.comment.services.CommentService r1 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            android.content.Context r0 = r3.getContext()
            boolean r0 = r1.LJJIFFI(r0, r15)
            if (r0 == 0) goto L7f
            X.C7H1.LIZ(r2)
            X.1qj r1 = r3.mo49getActivity()
            if (r1 != 0) goto L54
            return
        L54:
            java.lang.Class<com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM> r0 = com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.class
            X.Prg r6 = X.C65352Pkq.LIZ(r0)
            r7 = 0
            X.7Ah r11 = X.C181477Ah.INSTANCE
            kotlin.jvm.internal.AqS153S0100000_3 r12 = X.C78926UyI.LJIIJJI(r1)
            kotlin.jvm.internal.AqS153S0100000_3 r13 = X.C78926UyI.LJIILL(r1)
            X.8bB r5 = new X.8bB
            X.8bQ r8 = X.C214528bQ.LJLIL
            r3 = 0
            kotlin.jvm.internal.AqS61S0110000_4 r9 = X.C78926UyI.LJJII(r1, r3)
            X.7Kh r10 = X.C184077Kh.LJLIL
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = r4.LJIIIZ(r2)
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r4 = X.C1FP.LJIIIIZZ(r0)
            if (r4 != 0) goto L80
        L7f:
            return
        L80:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState r0 = r4.getCacheState()
            if (r0 != 0) goto L91
        L86:
            r3 = 1
        L87:
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r5.getValue()
            com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM r0 = (com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM) r0
            r0.gv0(r3, r4, r2)
            goto L7f
        L91:
            int[] r1 = X.C181597At.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L87
            r3 = 2
            if (r1 == r3) goto L87
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181467Ag.onCommentInputPublishFailed(java.lang.Exception, int, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishClick(int i, int i2, CharSequence content, String str, String str2, boolean z, C177156xL c177156xL) {
        o.LJIIIZ(content, "content");
        this.LJLIL.T(content.toString());
        c177156xL.LIZLLL = true;
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJIJJ(getCommentInputAweme(), content, getEventType(), null, "click_repost_button", "click_input_box_direct", i, c177156xL);
    }
}
