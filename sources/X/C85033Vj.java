package X;

import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.imagecard.ImageCardSimpleReceiveViewHolder$bindIcon$1", f = "ImageCardSimpleReceiveViewHolder.kt", l = {147, 149, 155}, m = "invokeSuspend")
/* renamed from: X.3Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85033Vj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C1048749r LJLJI;
    public final /* synthetic */ ImageCardTemplate LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85033Vj(C109544Rq c109544Rq, C1048749r c1048749r, ImageCardTemplate imageCardTemplate, InterfaceC67352kd<? super C85033Vj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c1048749r;
        this.LJLJJI = imageCardTemplate;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85033Vj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ImageCardTemplate imageCardTemplate;
        BaseRequestComponent LLLL;
        QueryDataComponent queryDataComponent;
        String str;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            C84973Vd c84973Vd = C84973Vd.LIZ;
            C109544Rq c109544Rq = this.LJLILLLLZI;
            this.LJLIL = 1;
            c84973Vd.getClass();
            obj2 = null;
            if (c109544Rq.getMsgType() == 1801 && o.LJ(c109544Rq.getScene(), "now_post") && c109544Rq.getMsgType() == 1801 && o.LJ(c109544Rq.getScene(), "now_post") && (imageCardTemplate = (ImageCardTemplate) C1DJ.LJIILL(c109544Rq)) != null && (LLLL = imageCardTemplate.LLLL()) != null && (queryDataComponent = LLLL.queryData) != null && (str = queryDataComponent.resourceID) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("asynUpdateNowCoverImage aweme id: ");
                LIZ.append(str);
                C34B.LIZJ("AwemeCoverManager", X1D.LIZIZ(LIZ));
                obj2 = XKX.LJI(C78613UtF.LIZJ, new C69872oh(str, null), this);
            }
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC69952op abstractC69952op = (AbstractC69952op) obj2;
        if (abstractC69952op == null) {
            return C76800UCe.LIZ;
        }
        if (abstractC69952op instanceof C69942oo) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C85023Vi c85023Vi = new C85023Vi(abstractC69952op, this.LJLJI, this.LJLILLLLZI, this.LJLJJI, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c85023Vi, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        } else if (abstractC69952op instanceof C69962oq) {
            AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
            C85043Vk c85043Vk = new C85043Vk(abstractC69952op, this.LJLJI, this.LJLILLLLZI, this.LJLJJI, null);
            this.LJLIL = 3;
            if (XKX.LJI(abstractC78621UtN2, c85043Vk, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
