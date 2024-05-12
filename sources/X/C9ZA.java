package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setWelcomeMessageUI$1", f = "BaMessageSettingActivity.kt", l = {387}, m = "invokeSuspend")
/* renamed from: X.9ZA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaMessageSettingActivity LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZA(BaMessageSettingActivity baMessageSettingActivity, boolean z, InterfaceC67352kd<? super C9ZA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baMessageSettingActivity;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9ZA c9za = new C9ZA(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c9za.LJLILLLLZI = obj;
        return c9za;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        C9ZN c9zn;
        String string;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        int i2 = 1;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                    C141335gf.LIZJ(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj2);
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                IBaAutoMessageService iBaAutoMessageService = this.LJLJI.LJLJJI;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 1;
                obj2 = iBaAutoMessageService.LJIIL(this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            c9zn = (C9ZN) obj2;
        } catch (Exception unused) {
        }
        if (c9zn == null) {
            return C76800UCe.LIZ;
        }
        int i3 = c9zn.LIZIZ;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 || i3 != 4) {
                    string = "";
                } else {
                    string = this.LJLJI.getString(R.string.q73);
                }
            } else {
                string = this.LJLJI.getString(R.string.tda);
            }
        } else {
            string = this.LJLJI.getString(R.string.kh);
        }
        o.LJIIIIZZ(string, "when (welMessage.status)…e -> \"\"\n                }");
        XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9ZD(this.LJLJI, this.LJLJJI, c9zn, string, null), 2);
        BaMessageSettingActivity baMessageSettingActivity = this.LJLJI;
        int i4 = c9zn.LIZIZ;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        baMessageSettingActivity.LJLLJ = i2;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
