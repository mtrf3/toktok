package X;

import com.bytedance.ies.im.core.exp.WsIMReconnectExp;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.sdk.SDKBridge$reconnectWsIfNeed$1", f = "SDKBridge.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4en, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114694en extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EnumC114894f7 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114694en(EnumC114894f7 enumC114894f7, InterfaceC67352kd<? super C114694en> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = enumC114894f7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C114694en(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        C141335gf.LIZJ(obj);
        if (this.LJLIL == null) {
            return C76800UCe.LIZ;
        }
        C115104fS LIZ = C4Z8.LIZ();
        if (o.LJ(LIZ, C115104fS.LIZLLL) || LIZ.LIZ == EnumC66933QOr.CONNECTION_UNKNOWN) {
            return C76800UCe.LIZ;
        }
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            int i = C114884f6.LIZ[this.LJLIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        booleanValue = ((Boolean) WsIMReconnectExp.LJ.getValue()).booleanValue();
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    booleanValue = ((Boolean) WsIMReconnectExp.LIZLLL.getValue()).booleanValue();
                }
            } else {
                booleanValue = ((Boolean) WsIMReconnectExp.LIZJ.getValue()).booleanValue();
            }
            if (booleanValue) {
                C4Z8.LJFF(this.LJLIL.name());
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
