package X;

import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextFontBean$isFontFileExit$2", f = "EffectTextBean.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157906Hq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C157916Hr LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157906Hq(C157916Hr c157916Hr, InterfaceC67352kd<? super C157906Hq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c157916Hr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C157906Hq(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            if (!C157986Hy.LIZ(this.LJLIL.effect)) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(new File(this.LJLIL.LJLIL.LIZ).exists());
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
