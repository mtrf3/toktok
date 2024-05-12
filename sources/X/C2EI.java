package X;

import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel$processDownload$1", f = "BaseEffectViewModel.kt", l = {32, 36, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40, 44}, m = "invokeSuspend")
/* renamed from: X.2EI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ BaseEffectViewModel<Object> LJLJI;
    public final /* synthetic */ Object LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EI(int i, BaseEffectViewModel<Object> baseEffectViewModel, Object obj, InterfaceC67352kd<? super C2EI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = baseEffectViewModel;
        this.LJLJJI = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            int i2 = this.LJLILLLLZI;
            if (i2 != -3) {
                if (i2 != -2) {
                    if (i2 != -1) {
                        XLL xll = this.LJLJI.LJLJI;
                        C37101cw c37101cw = new C37101cw(i2, this.LJLJJI);
                        this.LJLIL = 4;
                        if (xll.emit(c37101cw, this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    } else {
                        XLL xll2 = this.LJLJI.LJLJI;
                        C37081cu c37081cu = new C37081cu(this.LJLJJI);
                        this.LJLIL = 1;
                        if (xll2.emit(c37081cu, this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    }
                } else {
                    XLL xll3 = this.LJLJI.LJLJI;
                    C37091cv c37091cv = new C37091cv(this.LJLJJI);
                    this.LJLIL = 2;
                    if (xll3.emit(c37091cv, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } else {
                XLL xll4 = this.LJLJI.LJLJI;
                C37071ct c37071ct = new C37071ct(this.LJLJJI);
                this.LJLIL = 3;
                if (xll4.emit(c37071ct, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
