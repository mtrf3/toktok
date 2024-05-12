package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService$setAutoSoundStatus$1$1", f = "AutoSoundCheckService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63342eA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63342eA(InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63342eA(interfaceC67352kd, this.LJLIL, this.LJLILLLLZI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.valueOf(this.LJLILLLLZI));
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
