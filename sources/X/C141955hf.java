package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate$fetchAlgorithmModel2$2", f = "MusicBeatGenerate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141955hf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public C141955hf(InterfaceC67352kd<? super C141955hf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C141955hf(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XBE.LJIIIIZZ.getClass();
        String findResourceUri = C84419XBf.LIZ().LIZLLL().findResourceUri("bt_espresso_mobile_offline");
        if (findResourceUri == null) {
            return "";
        }
        return findResourceUri;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return new C141955hf(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
