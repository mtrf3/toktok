package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.handlers.SpeechToSongFetchHandler$handleData$2", f = "SpeechToSongFetchHandler.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.6gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166846gi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C166856gj LJLJI;
    public final /* synthetic */ C166876gl LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166846gi(C166856gj c166856gj, C166876gl c166876gl, InterfaceC67352kd<? super C166846gi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c166856gj;
        this.LJLJJI = c166876gl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C166846gi c166846gi = new C166846gi(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c166846gi.LJLILLLLZI = obj;
        return c166846gi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166846gi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
