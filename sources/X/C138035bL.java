package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneComponent$makeVoiceClonePreHeat$1", f = "VoiceCloneComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5bL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138035bL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138035bL(String str, String str2, boolean z, InterfaceC67352kd<? super C138035bL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138035bL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        int LIZ = C138025bK.LIZ();
        String str2 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        Integer num = new Integer(LIZ);
        if (this.LJLJI) {
            str = "Vop";
        } else {
            str = "TTS";
        }
        C141265gY.LIZ(num, str2, str3, str);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
