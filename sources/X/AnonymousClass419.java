package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.419, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass419 extends AbstractC1036945d<C41D> {
    public final View LIZIZ;
    public final InterfaceC88472Yns<IMUser, InterfaceC65784Pro<C76800UCe>> LIZJ;
    public final AnonymousClass412 LIZLLL;
    public final /* synthetic */ C1028942b LJ;
    public AnonymousClass465 LJFF;
    public Emoji LJI;

    @Override // X.AbstractC1036945d, X.AnonymousClass412
    public final void pause() {
        this.LIZLLL.pause();
    }

    @Override // X.AbstractC1036945d, X.AnonymousClass412
    public final void resume() {
        this.LIZLLL.resume();
    }

    @Override // X.AbstractC1036945d
    public final void LIZIZ() {
        AnonymousClass465 anonymousClass465 = this.LJFF;
        if (anonymousClass465 != null) {
            anonymousClass465.dismiss();
        }
    }

    @Override // X.AbstractC1036945d
    public final void LIZJ(C41D nextTask) {
        o.LJIIIZ(nextTask, "nextTask");
        this.LJFF = null;
    }

    public final boolean LJII(IMUser user) {
        o.LJIIIZ(user, "user");
        if (this.LJFF == null || this.LIZIZ.getVisibility() != 0) {
            return false;
        }
        AnonymousClass465 anonymousClass465 = this.LJFF;
        if (anonymousClass465 != null) {
            anonymousClass465.v0(C41B.LIZ(this.LJ.LIZ, user));
        }
        return true;
    }

    @Override // X.AbstractC1036945d
    public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
        IMUser iMUser;
        String str;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        String str2;
        C98523to c98523to;
        C41D c41d2 = c41d;
        C99033ud c99033ud = this.LJ.LIZJ;
        if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null) {
            iMUser = c98523to.getFromUser();
        } else {
            iMUser = null;
        }
        if (C52454KiI.LIZ() && iMUser != null && iMUser.getFollowStatus() == 0) {
            if (iMUser.getFollowerStatus() != 1 && o.LJ(c41d2.LIZIZ.getNoticeCode(), "ice_breaking_say_hi_follow_back")) {
                iMUser.setFollowerStatus(1);
            }
            str = C41B.LIZ(this.LJ.LIZ, iMUser);
            interfaceC65784Pro = this.LIZJ.invoke(iMUser);
        } else {
            str = null;
            interfaceC65784Pro = null;
        }
        AnonymousClass465 anonymousClass465 = new AnonymousClass465(this.LIZIZ, EnumC110124Tw.SAY_HELLO, true, interfaceC65784Pro, c99033ud.getEnterMethod());
        C109544Rq c109544Rq = new C109544Rq();
        c109544Rq.setConversationId(c99033ud.getConversationId());
        c109544Rq.setMsgType(15);
        if (iMUser != null) {
            str2 = iMUser.getDisplayName();
        } else {
            str2 = null;
        }
        Emoji[] emojiArr = new Emoji[1];
        Emoji emoji = this.LJI;
        if (emoji != null) {
            emojiArr[0] = emoji;
            anonymousClass465.p0(c109544Rq, null, new SayHelloContent(str2, str, null, C47261Igj.LJJIJIL(emojiArr)), 0);
            Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZLLL, this.LJ.LIZ);
            if (LJI != null) {
                this.LIZIZ.setBackgroundColor(LJI.intValue());
            }
            this.LIZIZ.setVisibility(0);
            this.LJFF = anonymousClass465;
            return anonymousClass465;
        }
        o.LJIJI("emoji");
        throw null;
    }

    @Override // X.AbstractC1036945d
    public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
        String str;
        C41D c41d2 = c41d;
        if (this.LIZ.isDebugMode()) {
            return Boolean.TRUE;
        }
        C99033ud c99033ud = this.LJ.LIZJ;
        boolean LJ = o.LJ(c41d2.LIZIZ.getNoticeCode(), "recommended_chat");
        if ((!(c99033ud instanceof C98523to) || c99033ud.hasChatHistory() || C89263es.LIZIZ(c99033ud.getSingleChatFromUserId())) && !LJ) {
            return Boolean.FALSE;
        }
        IMFromMessageTips msgContent = c41d2.LIZIZ.getMsgContent();
        if (msgContent != null) {
            str = msgContent.getTips();
        } else {
            str = null;
        }
        Emoji emoji = (Emoji) C62070OXq.LIZ(Emoji.class, str);
        if (emoji == null) {
            return Boolean.FALSE;
        }
        this.LJI = emoji;
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass419(C1028942b c1028942b, View view, C89193el c89193el) {
        super(C41X.SAY_HI);
        AnonymousClass410 anonymousClass410 = new AnonymousClass410(view);
        this.LIZIZ = view;
        this.LIZJ = c89193el;
        this.LIZLLL = anonymousClass410;
        this.LJ = c1028942b;
    }
}
