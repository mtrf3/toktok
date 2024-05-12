package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.LandAutoMsgReceiverToChatNode$collectToLandToChat$2$2", f = "LandAutoMsgReceiverToChatNode.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98903uQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C70172pB LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ C109544Rq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98903uQ(C70172pB c70172pB, Context context, Aweme aweme, C109544Rq c109544Rq, InterfaceC67352kd<? super C98903uQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c70172pB;
        this.LJLILLLLZI = context;
        this.LJLJI = aweme;
        this.LJLJJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C98903uQ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C98593tv LIZJ;
        C99033ud c98523to;
        boolean z;
        C109544Rq c109544Rq;
        C141335gf.LIZJ(obj);
        C70172pB c70172pB = this.LJLIL;
        Context context2 = this.LJLILLLLZI;
        Aweme aweme = this.LJLJI;
        C109544Rq chatMessage = this.LJLJJI;
        c70172pB.getClass();
        if (C00F.LIZ(31744, 0, "im_land_auto_message", true) == 2) {
            context = context2;
            LIZJ = C70172pB.LIZJ(c70172pB, context, chatMessage, true, false, 8);
        } else {
            context = context2;
            LIZJ = C70172pB.LIZJ(c70172pB, context, chatMessage, false, true, 4);
        }
        if (LIZJ.getChatType() == 3) {
            c98523to = new C98563ts(LIZJ.getUuid());
        } else {
            c98523to = new C98523to(LIZJ.getUuid());
        }
        List LJJIJ = C47261Igj.LJJIJ(chatMessage);
        Bundle bundle = new Bundle();
        bundle.putSerializable("enter_chat_param", LIZJ);
        String aid = c70172pB.LIZIZ;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(chatMessage, "chatMessage");
        InterfaceC83383Pa interfaceC83383Pa = C85773Yf.LJLJI;
        if (interfaceC83383Pa != null) {
            C77876UhM c77876UhM = (C77876UhM) interfaceC83383Pa;
            C100023wE LJ = C77876UhM.LJ();
            if (LJ != null) {
                z = LJ.LIZJ;
            } else {
                z = false;
            }
            boolean LIZJ2 = C98913uR.LIZJ(LJJIJ);
            if (aweme == null) {
                C84973Vd.LIZ.getClass();
                OSZ LIZLLL = C84973Vd.LIZLLL(aid);
                if (LIZLLL == null || (aweme = (Aweme) LIZLLL.getSecond()) == null) {
                    aweme = AwemeService.LIZ().i6(aid);
                }
            }
            if (!z && aweme != null) {
                String conversationId = chatMessage.getConversationId();
                o.LJIIIIZZ(conversationId, "chatMessage.conversationId");
                c109544Rq = chatMessage;
                C55457Lpd.LJLJLLL = new C102203zk(conversationId, c109544Rq, aweme, LIZJ2, null, true, LJJIJ);
            } else {
                c109544Rq = chatMessage;
            }
            if (aweme != null) {
                if (C98923uS.LIZ()) {
                    C54502LaE.LIZ("detail_page_loading");
                    IWF.LJJLIIIIJ().LJJJJJ(aweme, true, false);
                }
                Bundle bundle2 = new Bundle();
                C98913uR.LIZ(bundle2, aid, c109544Rq, c98523to.getChatType(), LIZJ2, true, null);
                bundle2.putAll(bundle);
                c77876UhM.LIZ(context, aid, "link_auto_message", "from_auto_message", aweme.getEnterpriseType(), null, bundle2);
            } else {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, new C39061g6(i0.LJFF("aweme://aweme/detail/", aid)).LIZJ());
                o.LJIIIIZZ(buildRoute, "buildRoute(context, builder.build())");
                C98913uR.LIZIZ(buildRoute, aid, c109544Rq, c98523to.getChatType(), LIZJ2, true, null, "link_auto_message");
                buildRoute.open();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
