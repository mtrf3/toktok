package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.418, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass418 extends AbstractC1036945d<C41D> {
    public final ViewGroup LIZIZ;
    public final C98523to LIZJ;
    public final InterfaceC88472Yns<IMUser, InterfaceC65784Pro<C76800UCe>> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final /* synthetic */ AnonymousClass410 LJFF;
    public AnonymousClass465 LJI;
    public Emoji LJII;
    public final Context LJIIIIZZ;

    @Override // X.AbstractC1036945d, X.AnonymousClass412
    public final void pause() {
        this.LJFF.pause();
    }

    @Override // X.AbstractC1036945d, X.AnonymousClass412
    public final void resume() {
        this.LJFF.resume();
    }

    @Override // X.AbstractC1036945d
    public final void LIZIZ() {
        AnonymousClass465 anonymousClass465 = this.LJI;
        if (anonymousClass465 != null) {
            anonymousClass465.dismiss();
        }
    }

    public final boolean LJII() {
        IMUser fromUser;
        AnonymousClass465 anonymousClass465 = this.LJI;
        if (anonymousClass465 == null || (fromUser = this.LIZJ.getFromUser()) == null) {
            return false;
        }
        Context context = this.LIZIZ.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        anonymousClass465.v0(C41C.LIZ(context, fromUser));
        return true;
    }

    @Override // X.AbstractC1036945d
    public final void LIZJ(C41D nextTask) {
        o.LJIIIZ(nextTask, "nextTask");
        this.LJI = null;
        this.LJII = null;
    }

    @Override // X.AbstractC1036945d
    public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
        String str;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        String str2;
        List list;
        C41D c41d2 = c41d;
        View LJJIIZ = C17N.LJJIIZ(R.layout.b4b, this.LIZIZ);
        LJJIIZ.setOnTouchListener(new View.OnTouchListener() { // from class: X.41A
            public final int LJLIL;
            public float LJLILLLLZI;
            public float LJLJI;
            public boolean LJLJJI;

            {
                this.LJLIL = ViewConfiguration.get(AnonymousClass418.this.LIZIZ.getContext()).getScaledTouchSlop();
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Integer num;
                if (motionEvent != null) {
                    num = Integer.valueOf(motionEvent.getActionMasked());
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == 0) {
                        this.LJLILLLLZI = motionEvent.getX();
                        this.LJLJI = motionEvent.getY();
                        this.LJLJJI = false;
                        return true;
                    }
                    if (num.intValue() == 2) {
                        if (this.LJLJJI) {
                            return true;
                        }
                        if (Math.abs(motionEvent.getX() - this.LJLILLLLZI) < this.LJLIL && Math.abs(motionEvent.getY() - this.LJLJI) < this.LJLIL) {
                            return true;
                        }
                        this.LJLJJI = true;
                        AnonymousClass418.this.LJ.invoke();
                        return false;
                    }
                }
                return false;
            }
        });
        View sayHiContainer = LJJIIZ.findViewById(R.id.jaz);
        IMUser fromUser = this.LIZJ.getFromUser();
        if (C52454KiI.LIZ() && fromUser != null && fromUser.getFollowStatus() == 0) {
            if (fromUser.getFollowerStatus() != 1 && o.LJ(c41d2.LIZIZ.getNoticeCode(), "ice_breaking_say_hi_follow_back")) {
                fromUser.setFollowerStatus(1);
            }
            Context context = this.LJIIIIZZ;
            o.LJIIIIZZ(context, "context");
            str = C41C.LIZ(context, fromUser);
            interfaceC65784Pro = this.LIZLLL.invoke(fromUser);
        } else {
            str = null;
            interfaceC65784Pro = null;
        }
        o.LJIIIIZZ(sayHiContainer, "sayHiContainer");
        AnonymousClass465 anonymousClass465 = new AnonymousClass465(sayHiContainer, EnumC110124Tw.SAY_HELLO, true, interfaceC65784Pro, this.LIZJ.getEnterMethod());
        C109544Rq c109544Rq = new C109544Rq();
        c109544Rq.setConversationId(this.LIZJ.getConversationId());
        c109544Rq.setMsgType(15);
        if (fromUser != null) {
            str2 = fromUser.getDisplayName();
        } else {
            str2 = null;
        }
        Emoji emoji = this.LJII;
        if (emoji != null) {
            list = C47261Igj.LJJIJ(emoji);
        } else {
            list = C61878OQg.INSTANCE;
        }
        anonymousClass465.p0(c109544Rq, null, new SayHelloContent(str2, str, null, list), 0);
        Context context2 = this.LJIIIIZZ;
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZLLL, context2);
        if (LJI != null) {
            sayHiContainer.setBackgroundColor(LJI.intValue());
        }
        sayHiContainer.setVisibility(0);
        this.LJI = anonymousClass465;
        return anonymousClass465;
    }

    @Override // X.AbstractC1036945d
    public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
        String str;
        C41D c41d2 = c41d;
        if (this.LIZ.isDebugMode()) {
            return Boolean.TRUE;
        }
        boolean LJ = o.LJ(c41d2.LIZIZ.getNoticeCode(), "recommended_chat");
        if ((this.LIZJ.hasChatHistory() || C89263es.LIZIZ(this.LIZJ.getSingleChatFromUserId())) && !LJ) {
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
        this.LJII = emoji;
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass418(ViewGroup viewGroup, C98523to singleSessionInfo, C89203em c89203em, AnonymousClass414 sayHiPanelMoveAction) {
        super(C41X.SAY_HI);
        o.LJIIIZ(singleSessionInfo, "singleSessionInfo");
        o.LJIIIZ(sayHiPanelMoveAction, "sayHiPanelMoveAction");
        this.LIZIZ = viewGroup;
        this.LIZJ = singleSessionInfo;
        this.LIZLLL = c89203em;
        this.LJ = sayHiPanelMoveAction;
        this.LJFF = new AnonymousClass410(viewGroup);
        this.LJIIIIZZ = viewGroup.getContext();
    }
}
