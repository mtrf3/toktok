package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusInAppPushHandler$interceptInnerPushClick$1", f = "ActivityStatusInAppPushHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3UB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InnerPushMessage LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3UB(InnerPushMessage innerPushMessage, InterfaceC67352kd<? super C3UB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = innerPushMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3UB(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        C141335gf.LIZJ(obj);
        ActivityStatus activityStatus = (ActivityStatus) C62070OXq.LIZ(ActivityStatus.class, this.LJLIL.getBizExtraJsonStr());
        if (activityStatus == null || (str = activityStatus.userID) == null) {
            return C76800UCe.LIZ;
        }
        C89253er c89253er = C89253er.LIZ;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("enter_from", "inner_push");
        if (this.LJLIL.getType() == 32) {
            str2 = "dm_permissions_receiver_open";
        } else {
            str2 = "inner_push_active_status";
        }
        oszArr[1] = new OSZ("enter_method", str2);
        int type = this.LJLIL.getType();
        if (type != 27) {
            if (type != 31) {
                str3 = "";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str3 = "1";
        }
        oszArr[2] = new OSZ("online_order", str3);
        c89253er.LIZLLL(str, C113554cx.LJJJLZIJ(oszArr));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
