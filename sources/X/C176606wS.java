package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.upvote.model.RepostCommentResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.6wS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176606wS extends C8BR<C8BS<?>, InterfaceC176716wd> implements C7B1 {
    public Aweme LJLJJI;
    public LifecycleOwner LJLJJL;
    public Y88 LJLJJLL;

    @Override // X.C7B1
    public final void LJ(UpvoteStruct upvoteStruct) {
    }

    @Override // X.C7B1
    public final void LJI(Throwable th, UpvoteStruct upvoteStruct) {
    }

    @Override // X.C7B1
    public final void LJIIIZ(UpvoteStruct upvoteStruct) {
    }

    @Override // X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        InterfaceC174526t6 LJIJJ = C7HV.LIZIZ.LJIJJ(this.LJLJJL);
        if (LJIJJ != null) {
            LJIJJ.LIZ(this);
        }
        Y88 y88 = this.LJLJJLL;
        if (y88 != null) {
            y88.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    @Override // X.C7B1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L18
            java.lang.String r1 = r5.getItemId()
        L7:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJLJJI
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getAid()
        Lf:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L1a
            return
        L16:
            r0 = r3
            goto Lf
        L18:
            r1 = r3
            goto L7
        L1a:
            X.7HV r1 = X.C7HV.LIZIZ
            androidx.lifecycle.LifecycleOwner r0 = r4.LJLJJL
            X.6t6 r0 = r1.LJIJJ(r0)
            if (r0 == 0) goto L27
            r0.LIZ(r4)
        L27:
            if (r5 == 0) goto L76
            java.lang.String r0 = r5.getItemId()
        L2d:
            r2 = 1
            if (r0 == 0) goto L36
            int r0 = r0.length()
            if (r0 != 0) goto L57
        L36:
            if (r5 == 0) goto L3c
            X.8qC r3 = X.V16.LJJLIIIJLJLI(r5)
        L3c:
            K extends X.2K3 r0 = r4.LJLILLLLZI
            X.6wd r0 = (X.InterfaceC176716wd) r0
            if (r0 == 0) goto L45
            r0.Td0(r3)
        L45:
            boolean r0 = X.C78886Uxe.LJJIIJ(r3)
            if (r0 == 0) goto L56
            if (r3 == 0) goto L56
            java.lang.String r0 = r3.getFakeId()
            if (r0 == 0) goto L56
            X.Y89.LIZLLL(r2, r0)
        L56:
            return
        L57:
            if (r5 == 0) goto L3c
            java.lang.String r0 = r5.getText()
            if (r0 == 0) goto L36
            int r0 = r0.length()
            if (r0 != 0) goto L66
            goto L36
        L66:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            if (r5 == 0) goto L74
            java.lang.String r0 = r5.getItemId()
        L70:
            r1.e6(r0)
            goto L36
        L74:
            r0 = r3
            goto L70
        L76:
            r0 = r3
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176606wS.LJIJI(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct):void");
    }

    @Override // X.C7B1
    public final void LJIIL(Throwable th, UpvoteStruct upvoteStruct) {
        String str;
        String str2;
        Exception exc;
        String fakeId;
        C223688qC c223688qC = null;
        if (upvoteStruct != null) {
            str = upvoteStruct.getItemId();
        } else {
            str = null;
        }
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2) || !(th instanceof Exception) || (exc = (Exception) th) == null) {
            return;
        }
        InterfaceC174526t6 LJIJJ = C7HV.LIZIZ.LJIJJ(this.LJLJJL);
        if (LJIJJ != null) {
            LJIJJ.LIZ(this);
        }
        if (upvoteStruct != null) {
            c223688qC = V16.LJJLIIIJLJLI(upvoteStruct);
        }
        InterfaceC176716wd interfaceC176716wd = (InterfaceC176716wd) this.LJLILLLLZI;
        if (interfaceC176716wd != null) {
            interfaceC176716wd.cj0(exc, c223688qC);
        }
        if (C78886Uxe.LJJIIJ(c223688qC) && c223688qC != null && (fakeId = c223688qC.getFakeId()) != null) {
            Y89.LIZLLL(-1, fakeId);
        }
    }

    @Override // X.C7B1
    public final void LJFF(CommentRethinkPopup commentRethinkPopup, UpvoteStruct upvoteStruct, Boolean bool) {
        String str;
        String itemId = upvoteStruct.getItemId();
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(itemId, str)) {
            return;
        }
        C38333F2r c38333F2r = new C38333F2r(3017002);
        RepostCommentResponse repostCommentResponse = new RepostCommentResponse();
        repostCommentResponse.commentRethinkPopup = commentRethinkPopup;
        repostCommentResponse.onlyAddCommentToRepost = bool;
        c38333F2r.setResponse(repostCommentResponse);
        InterfaceC174526t6 LJIJJ = C7HV.LIZIZ.LJIJJ(this.LJLJJL);
        if (LJIJJ != null) {
            LJIJJ.LIZ(this);
        }
        InterfaceC176716wd interfaceC176716wd = (InterfaceC176716wd) this.LJLILLLLZI;
        if (interfaceC176716wd != null) {
            interfaceC176716wd.cj0(c38333F2r, V16.LJJLIIIJLJLI(upvoteStruct));
        }
    }
}
