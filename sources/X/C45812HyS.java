package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.choosemusic.localmusic.LocalMusicProvider$Companion$scanLocalMusicTask$1", f = "LocalMusicProvider.kt", l = {164}, m = "invokeSuspend")
/* renamed from: X.HyS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45812HyS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC43955HMx LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45812HyS(boolean z, Context context, int i, int i2, InterfaceC43955HMx interfaceC43955HMx, InterfaceC67352kd<? super C45812HyS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = context;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = interfaceC43955HMx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45812HyS(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45812HyS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
