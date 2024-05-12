package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.core.viewmodel.SearchSuggestListWidgetManager$updateWidgetData$1", f = "SearchSuggestListWidgetManager.kt", l = {54}, m = "invokeSuspend")
/* renamed from: X.2lV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67892lV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67892lV(Context context, String str, InterfaceC67352kd<? super C67892lV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = context;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67892lV c67892lV = new C67892lV(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c67892lV.LJLILLLLZI = obj;
        return c67892lV;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                Object obj3 = this.LJLILLLLZI;
                Context context = this.LJLJI;
                String str = this.LJLJJI;
                this.LJLILLLLZI = obj3;
                this.LJLIL = 1;
                Object LJI = XKX.LJI(C78613UtF.LIZJ, new C67912lX(context, str, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            }
        } catch (Exception unused) {
            C67932lZ.LIZIZ(this.LJLJJI, null, false);
            C67932lZ.LIZ(this.LJLJI, this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
