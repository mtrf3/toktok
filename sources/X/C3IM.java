package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ShareAwemeReceiveAutoPlayViewHolder$fetchPlayerData$1$2", f = "ShareAwemeReceiveAutoPlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3IM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC69952op LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ AnonymousClass476 LJLJI;
    public final /* synthetic */ ShareAwemeContent LJLJJI;
    public final /* synthetic */ C109544Rq LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3IM(AbstractC69952op abstractC69952op, boolean z, AnonymousClass476 anonymousClass476, ShareAwemeContent shareAwemeContent, C109544Rq c109544Rq, InterfaceC67352kd<? super C3IM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC69952op;
        this.LJLILLLLZI = z;
        this.LJLJI = anonymousClass476;
        this.LJLJJI = shareAwemeContent;
        this.LJLJJL = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3IM(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Aweme aweme = ((C69962oq) this.LJLIL).LIZIZ;
        if (aweme == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("queryNotAweme ");
            LIZ.append(this.LJLILLLLZI);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            AnonymousClass476 anonymousClass476 = this.LJLJI;
            if (!this.LJLILLLLZI) {
                anonymousClass476.LLIIZ.setVisibility(8);
            } else {
                anonymousClass476.getClass();
            }
            return C76800UCe.LIZ;
        }
        this.LJLJI.LLIIIL = aweme;
        if (TextUtils.isEmpty(aweme.getAid()) || !TextUtils.equals(this.LJLJJI.getItemId(), ((C69962oq) this.LJLIL).LIZIZ.getAid())) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("aid not match ");
            LIZ2.append(this.LJLILLLLZI);
            String msg2 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg2, "msg");
            AnonymousClass476 anonymousClass4762 = this.LJLJI;
            if (!this.LJLILLLLZI) {
                anonymousClass4762.LLIIZ.setVisibility(8);
            } else {
                anonymousClass4762.getClass();
            }
        }
        if (((C69962oq) this.LJLIL).LIZIZ.getAuthor() != null && ((C69962oq) this.LJLIL).LIZIZ.getAuthor().isAdFake() && !TextUtils.equals(((C69962oq) this.LJLIL).LIZIZ.getAuthor().getNickname(), this.LJLJI.LLIIL.toString())) {
            this.LJLJJI.setAuthorUsername(((C69962oq) this.LJLIL).LIZIZ.getAuthor().getNickname());
            this.LJLJI.LLIIL.setText(((C69962oq) this.LJLIL).LIZIZ.getAuthor().getNickname());
        }
        this.LJLJI.x0(this.LJLJJL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
