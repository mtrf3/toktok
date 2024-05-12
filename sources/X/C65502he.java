package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "live.ss.android.common.util.UtilityKotlinExtentionsKt$setBackgroundResourceAsync$1", f = "UtilityKotlinExtentions.kt", l = {100}, m = "invokeSuspend")
/* renamed from: X.2he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65502he extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65502he(int i, View view, InterfaceC67352kd<? super C65502he> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65502he(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            int i2 = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C65522hg(i2, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Drawable drawable = (Drawable) obj;
        if (C29306Beo.LIZIZ(this.LJLJI.getContext()) == null) {
            return C76800UCe.LIZ;
        }
        this.LJLJI.setBackground(drawable);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
