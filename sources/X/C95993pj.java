package X;

import Y.ARunnableS37S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.friends.services.FollowService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.FollowTask$run$1", f = "FollowTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95993pj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C95993pj(C109544Rq c109544Rq, View view, InterfaceC67352kd<? super C95993pj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C95993pj(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        OSZ osz;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String LIZIZ;
        C141335gf.LIZJ(obj);
        C110134Tx c110134Tx = EnumC110124Tw.Companion;
        C109544Rq c109544Rq = this.LJLIL;
        c110134Tx.getClass();
        BaseContent LIZJ = C110134Tx.LIZJ(c109544Rq);
        if (LIZJ == null) {
            return C76800UCe.LIZ;
        }
        String str3 = "";
        if (LIZJ instanceof ShareUserContent) {
            ShareUserContent shareUserContent = (ShareUserContent) LIZJ;
            String secUid = shareUserContent.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            String uid = shareUserContent.getUid();
            if (uid == null) {
                uid = "";
            }
            osz = new OSZ(secUid, uid);
        } else if (LIZJ instanceof ShareAwemeContent) {
            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) LIZJ;
            String secUid2 = shareAwemeContent.getSecUid();
            if (secUid2 == null) {
                secUid2 = "";
            }
            String user = shareAwemeContent.getUser();
            if (user == null) {
                user = "";
            }
            osz = new OSZ(secUid2, user);
        } else if (LIZJ instanceof ShareLiveContent) {
            ShareLiveContent shareLiveContent = (ShareLiveContent) LIZJ;
            String roomSecOwnerId = shareLiveContent.getRoomSecOwnerId();
            if (roomSecOwnerId == null) {
                roomSecOwnerId = "";
            }
            String roomOwnerId = shareLiveContent.getRoomOwnerId();
            if (roomOwnerId == null) {
                roomOwnerId = "";
            }
            osz = new OSZ(roomSecOwnerId, roomOwnerId);
        } else {
            osz = new OSZ("", "");
        }
        String str4 = (String) osz.getFirst();
        String str5 = (String) osz.getSecond();
        if (str5.length() == 0) {
            return C76800UCe.LIZ;
        }
        String conversationId = this.LJLIL.getConversationId();
        if (this.LJLIL.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null && c88545Yp3.isConnected()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        if (c88545Yp3 == null || (str = c88545Yp3.LJIILJJIL()) == null) {
            str = "";
        }
        long LIZLLL = C81273Gx.LIZLLL(conversationId);
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZLLL);
        LIZ3.append("");
        LIZ2.put("to_user_id", X1D.LIZIZ(LIZ3));
        LIZ2.put("previous_page", "message");
        LIZ2.put("previous_page_position", "other_places");
        if (z) {
            LIZ2.put("enter_from", "group_chat");
        } else {
            LIZ2.put("enter_from", "chat");
        }
        LIZ2.put("enter_method", "card");
        if (c88545Yp3 == null || (str2 = c88545Yp3.LJ()) == null) {
            str2 = "";
        }
        LIZ2.put(str2, String.valueOf(valueOf));
        if (c88545Yp3 != null && (LIZIZ = c88545Yp3.LIZIZ()) != null) {
            str3 = LIZIZ;
        }
        LIZ2.put(str3, str);
        LIZ.LIZIZ("follow", LIZ2);
        IFollowService createIFollowServicebyMonsterPlugin = FollowService.createIFollowServicebyMonsterPlugin(false);
        final View view = this.LJLILLLLZI;
        createIFollowServicebyMonsterPlugin.sendRequest(str5, str4, 1, new AnonymousClass400() { // from class: X.3pk
            @Override // X.AnonymousClass400
            public final void LIZIZ() {
                C93493lh.LIZ(new ARunnableS37S0100000_1(view, 155));
            }

            @Override // X.AnonymousClass400
            public final void LIZ(Exception exc) {
                C93493lh.LIZ(new ARunnableS37S0100000_1(view, 154));
            }
        });
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
