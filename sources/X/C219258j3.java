package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailAwemeModel$handleData$1$1", f = "AddYoursDetailAwemeModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219258j3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AddYoursTopic LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219258j3(AddYoursTopic addYoursTopic, InterfaceC67352kd<? super C219258j3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = addYoursTopic;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219258j3(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C2U8.LIZ(new C219248j2(this.LJLIL, EnumC219268j4.NETWORK));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
