package X;

import android.graphics.drawable.Drawable;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.uikit.remoteimage.GeckoRemoteImage$loader$1$start$1", f = "GeckoRemoteImage.kt", l = {29}, m = "invokeSuspend")
/* renamed from: X.BZn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28995BZn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C28997BZp LJLILLLLZI;
    public final /* synthetic */ C28998BZq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28995BZn(C28997BZp c28997BZp, C28998BZq c28998BZq, InterfaceC67352kd<? super C28995BZn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c28997BZp;
        this.LJLJI = c28998BZq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28995BZn(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C0NF c0nf;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        Drawable drawable = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                XIA xia = C78613UtF.LIZJ;
                C28996BZo c28996BZo = new C28996BZo(this.LJLJI, null);
                this.LJLIL = 1;
                obj = XKX.LJI(xia, c28996BZo, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            drawable = (Drawable) obj;
        } catch (Exception e) {
            C0NB.LIZ(e.getMessage());
        }
        if (this.LJLILLLLZI.LIZIZ && (c0nf = this.LJLJI.LIZ) != null) {
            c0nf.LIZ(drawable);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
