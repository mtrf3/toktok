package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.core.ui.SkeletonShareManager$doRealSetupChannels$1$onChannelRealClicked$1$preShareJob$1", f = "SkeletonShareManager.kt", l = {152}, m = "invokeSuspend")
/* renamed from: X.OgW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62536OgW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C62535OgV LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62536OgW(C62535OgV c62535OgV, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c62535OgV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C62536OgW(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C62535OgV c62535OgV = this.LJLILLLLZI;
            C62534OgU c62534OgU = c62535OgV.LJLJI;
            C62387Oe7 c62387Oe7 = c62534OgU.LJLJI;
            InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
            if (interfaceC62474OfW != null) {
                InterfaceC62225ObV interfaceC62225ObV = c62535OgV.LJLJJI;
                BaseSharePackage baseSharePackage = c62387Oe7.LJIIJ;
                Context context = c62534OgU.LJLJJL;
                this.LJLIL = 1;
                if (interfaceC62474OfW.LIZJ(context, baseSharePackage, interfaceC62225ObV, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                return null;
            }
        }
        return C76800UCe.LIZ;
    }
}
