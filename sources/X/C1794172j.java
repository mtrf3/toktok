package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.72j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1794172j implements InterfaceC177046xA {
    public static Aweme LJLILLLLZI;
    public static InterfaceC1794272k LJLJJI;
    public static boolean LJLJJL;
    public static final C1794172j LJLIL = new C1794172j();
    public static String LJLJI = "";

    @Override // X.InterfaceC177046xA
    public final boolean checkCommentInputable() {
        C49133JQb.LIZ("OnlyCommentHelper", new Object[0]);
        return true;
    }

    @Override // X.InterfaceC177046xA
    public final Aweme getCommentInputAweme() {
        C49133JQb.LIZ("OnlyCommentHelper", new Object[0]);
        Aweme aweme = LJLILLLLZI;
        if (aweme != null) {
            return aweme;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC177046xA
    public final int getCommentInputViewType() {
        C49133JQb.LIZ("OnlyCommentHelper", new Object[0]);
        return 9;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final String getEventType() {
        C49133JQb.LIZ("OnlyCommentHelper", new Object[0]);
        return "";
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
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean upvoteWhenComment() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishStart(Comment comment) {
        C49133JQb.LIZ("OnlyCommentHelper", new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (r2 == null) goto L40;
     */
    @Override // X.InterfaceC177046xA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCommentInputPublishSuccess(com.ss.android.ugc.aweme.comment.model.Comment r9) {
        /*
            r8 = this;
            if (r9 == 0) goto Lf
            r9.getText()
            r9.getCid()
            X.72k r0 = X.C1794172j.LJLJJI
            if (r0 == 0) goto Lf
            r0.LIZ(r9)
        Lf:
            r3 = 0
            if (r9 != 0) goto L18
        L12:
            X.C1794172j.LJLJJI = r3
            r0 = 0
            X.C1794172j.LJLJJL = r0
            return
        L18:
            X.8l2 r5 = X.C220488l2.LIZIZ
            X.7au r4 = new X.7au
            r4.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1794172j.LJLILLLLZI
            java.lang.String r7 = "aweme"
            if (r0 == 0) goto Ldd
            java.lang.String r1 = r0.getAuthorUid()
            java.lang.String r0 = "author_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = X.C1794172j.LJLJI
            java.lang.String r0 = "search_id"
            r4.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1794172j.LJLILLLLZI
            if (r0 == 0) goto Ld9
            java.lang.String r1 = r0.getAid()
            java.lang.String r6 = ""
            if (r1 != 0) goto L42
            r1 = r6
        L42:
            java.lang.String r0 = "group_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "general_search"
            r4.LJIIIZ(r1, r0)
            java.lang.String r1 = "comment_enter_method"
            java.lang.String r0 = "click_comment_button"
            r4.LJIIIZ(r1, r0)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click_comment_icon"
            r4.LJIIIZ(r1, r0)
            java.lang.String r1 = "comment_position"
            java.lang.String r0 = "search_discussion"
            r4.LJIIIZ(r1, r0)
            java.lang.String r1 = r9.getCid()
            if (r1 != 0) goto L6a
            r1 = r6
        L6a:
            java.lang.String r0 = "comment_id"
            r4.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getUser()
            if (r0 == 0) goto L7b
            java.lang.String r1 = r0.getUid()
            if (r1 != 0) goto L7c
        L7b:
            r1 = r6
        L7c:
            java.lang.String r0 = "comment_user_id"
            r4.LJIIIZ(r0, r1)
            X.Yp3 r2 = X.C88545Yp3.LIZIZ
            if (r2 == 0) goto L8b
            java.lang.String r1 = r2.LJ()
            if (r1 != 0) goto L8e
        L8b:
            r1 = r6
            if (r2 == 0) goto Lcf
        L8e:
            boolean r0 = r2.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L96:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.LJIIIZ(r1, r0)
            if (r2 == 0) goto La5
            java.lang.String r1 = r2.LIZIZ()
            if (r1 != 0) goto La8
        La5:
            r1 = r6
            if (r2 == 0) goto Lae
        La8:
            java.lang.String r0 = r2.LJIILJJIL()
            if (r0 != 0) goto Lcd
        Lae:
            r4.LJIIIZ(r1, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1794172j.LJLILLLLZI
            if (r0 == 0) goto Ld5
            java.lang.Object r2 = r5.LJII(r0, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = X.C1794172j.LJLILLLLZI
            if (r1 == 0) goto Ld1
            r0 = 14
            X.C222578oP.LIZJ(r2, r1, r3, r3, r0)
            X.7au r2 = (X.C188727au) r2
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "post_comment"
            X.FMX.LJIIL(r0, r1)
            goto L12
        Lcd:
            r6 = r0
            goto Lae
        Lcf:
            r0 = r3
            goto L96
        Ld1:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        Ld5:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        Ld9:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        Ldd:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1794172j.onCommentInputPublishSuccess(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    @Override // X.InterfaceC177046xA
    public void onEvent(C174266sg c174266sg) {
        C49133JQb.LIZ("OnlyCommentHelper", c174266sg);
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL) {
        if (LJLJJL) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "dismiss");
            InterfaceC1794272k interfaceC1794272k = LJLJJI;
            if (interfaceC1794272k != null) {
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "cancelAction.toString()");
                interfaceC1794272k.LIZIZ(null, jSONObject2);
            }
        } catch (Exception unused) {
            C78983UzD.LJIILL("search_jsb_json");
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "general_search");
        Aweme aweme = LJLILLLLZI;
        if (aweme != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c188727au.LJIIIZ("group_id", aid);
            c188727au.LJIIIZ("enter_method", "auto_open");
            c188727au.LJIIIZ("from_location", "input_box");
            c188727au.LJIIIZ("comment_position", "search_discussion");
            FMX.LJIIL("enter_text", c188727au.LIZ);
            return;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        if (comment != null) {
            comment.getText();
            comment.getCid();
            InterfaceC1794272k interfaceC1794272k = LJLJJI;
            if (interfaceC1794272k != null) {
                interfaceC1794272k.LIZIZ(exc, "");
            }
        }
        LJLJJI = null;
        LJLJJL = false;
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishClick(int i, int i2, CharSequence content, String str, String str2, boolean z, C177156xL c177156xL) {
        o.LJIIIZ(content, "content");
        LJLJJL = true;
    }
}
