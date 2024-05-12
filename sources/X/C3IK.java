package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ShareAwemeReceiveAutoPlayViewHolder$fetchPlayerData$1", f = "ShareAwemeReceiveAutoPlayViewHolder.kt", l = {408, 410, 416}, m = "invokeSuspend")
/* renamed from: X.3IK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AnonymousClass476 LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ ShareAwemeContent LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ ShareAwemeContent LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3IK(AnonymousClass476 anonymousClass476, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent, boolean z, ShareAwemeContent shareAwemeContent2, InterfaceC67352kd<? super C3IK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = anonymousClass476;
        this.LJLJI = c109544Rq;
        this.LJLJJI = shareAwemeContent;
        this.LJLJJL = z;
        this.LJLJJLL = shareAwemeContent2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3IK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            View itemView = this.LJLILLLLZI.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C109544Rq c109544Rq = this.LJLJI;
            ShareAwemeContent shareAwemeContent = this.LJLJJI;
            boolean w0 = this.LJLILLLLZI.w0();
            this.LJLIL = 1;
            c84973Vd.getClass();
            if (C84973Vd.LJFF(c109544Rq) || (ShareStoryContent.Companion.isStory(shareAwemeContent) && !C55723Ltv.LIZIZ.LJIIJ())) {
                obj2 = null;
            } else {
                obj2 = XKX.LJI(C78613UtF.LIZJ, new C69882oi(itemView, c109544Rq, shareAwemeContent, null, w0), this);
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
            C3IL c3il = new C3IL(abstractC69952op, this.LJLILLLLZI, this.LJLJJL, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c3il, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        } else if (abstractC69952op instanceof C69962oq) {
            AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
            C3IM c3im = new C3IM(abstractC69952op, this.LJLJJL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJI, null);
            this.LJLIL = 3;
            if (XKX.LJI(abstractC78621UtN2, c3im, this) == enumC58928NAu) {
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
