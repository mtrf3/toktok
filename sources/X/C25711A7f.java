package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$updatePopupStatus$2", f = "LinkPrivacyNoticeController.kt", l = {302}, m = "invokeSuspend")
/* renamed from: X.A7f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25711A7f extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C25710A7e LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25711A7f(C25710A7e c25710A7e, InterfaceC67352kd<? super C25711A7f> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c25710A7e;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25711A7f(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                AbstractC73638SvC<BaseResponse> updateLinkPrivacyPopupStatus = this.LJLILLLLZI.LJ.updateLinkPrivacyPopupStatus(true);
                this.LJLIL = 1;
                if (C77318UWc.LIZ(updateLinkPrivacyPopupStatus, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C25706A7a.LIZIZ().storeBoolean(this.LJLILLLLZI.LIZLLL, true);
            String uid = this.LJLILLLLZI.LIZLLL;
            o.LJIIIZ(uid, "uid");
            ((Keva) C25715A7j.LIZ.getValue()).storeBoolean(uid, true);
            z = true;
        } catch (Throwable th) {
            C221018lt.LIZJ("@LinkRelation", "update status fail", th);
            z = false;
        }
        OSZ[] oszArr = new OSZ[2];
        String str = "1";
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("result", obj2);
        if (!this.LJLILLLLZI.LIZIZ) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("is_sharer", str);
        FMX.LJIIL("update_link_popup_status", C113554cx.LJJL(oszArr));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
