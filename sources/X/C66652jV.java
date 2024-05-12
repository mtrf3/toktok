package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.core.viewmodel.SearchWidgetManager$updateSearchWidgets$1", f = "SearchWidgetManager.kt", l = {132}, m = "invokeSuspend")
/* renamed from: X.2jV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66652jV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66652jV(Context context, InterfaceC67352kd<? super C66652jV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66652jV(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                this.LJLIL = 1;
                Object LJI = XKX.LJI(C78613UtF.LIZJ, new C67902lW(null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            }
            MAR.LIZJ(this.LJLILLLLZI, "widget_blank_page");
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
