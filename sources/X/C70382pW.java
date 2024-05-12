package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.api.AutoMessageAPI;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.api.AutoMessageResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.AutoMsgFetchNode$tryToTriggerAutoMessage$1", f = "AutoMsgFetchNode.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.2pW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70382pW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C70392pX LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70382pW(C70392pX c70392pX, InterfaceC67352kd<? super C70382pW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c70392pX;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70382pW c70382pW = new C70382pW(this.LJLJI, interfaceC67352kd);
        c70382pW.LJLILLLLZI = obj;
        return c70382pW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
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
                InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                this.LJLJI.LJIIIZ.setValue(C70202pE.LIZ);
                if (C70412pZ.LIZ()) {
                    this.LJLJI.LIZ();
                    XKX.LIZLLL(interfaceC70422pa, null, null, new C70122p6(this.LJLJI, null), 3);
                }
                AutoMessageAPI autoMessageAPI = AutoMessageAPI.LIZIZ;
                long parseLong = CastLongProtector.parseLong(this.LJLJI.LIZIZ);
                long parseLong2 = CastLongProtector.parseLong(this.LJLJI.LIZLLL);
                C70392pX c70392pX = this.LJLJI;
                String str = c70392pX.LIZ;
                String str2 = c70392pX.LJ;
                String str3 = c70392pX.LJFF;
                this.LJLIL = 1;
                obj = autoMessageAPI.triggerAutomessage(parseLong, parseLong2, str, str2, str3, 1, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            int i2 = ((AutoMessageResponse) obj).sendStatus;
            if (i2 != 1) {
                if (i2 == 2) {
                    obj2 = new AbstractC70462pe() { // from class: X.2pd
                    };
                } else {
                    obj2 = new AbstractC70462pe() { // from class: X.2pg
                    };
                }
            } else {
                obj2 = new AbstractC70462pe() { // from class: X.2pf
                };
            }
            boolean LJ = o.LJ(obj2, new AbstractC70462pe() { // from class: X.2pf
            });
            XLM xlm = this.LJLJI.LJIIIZ;
            if (LJ) {
                z = true;
            } else {
                z = false;
            }
            xlm.setValue(new C70302pO(Boolean.valueOf(z)));
            this.LJLJI.LJII.invoke();
            if (LJ && !C115074fP.LIZJ()) {
                C106674Gp.LJIIJJI("link_auto_message", true);
            }
        } catch (Exception unused) {
            this.LJLJI.LJIIIZ.setValue(C70022ow.LIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
