package X;

import Y.ARunnableS2S0500000_5;
import com.bytedance.android.livesdk.comp.api.game.data.GameUploadResult;

/* renamed from: X.Chc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32028Chc<T> implements InterfaceC86003Zc {
    public final /* synthetic */ C32026Cha LJLIL;
    public final /* synthetic */ byte[] LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ InterfaceC32032Chg LJLJJI;

    public C32028Chc(C32026Cha c32026Cha, byte[] bArr, C68322mC<String> c68322mC, InterfaceC32032Chg interfaceC32032Chg) {
        this.LJLIL = c32026Cha;
        this.LJLILLLLZI = bArr;
        this.LJLJI = c68322mC;
        this.LJLJJI = interfaceC32032Chg;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C28467BFf<GameUploadResult>> interfaceC73573Su9) {
        C38995FSd.LIZLLL().submit(new ARunnableS2S0500000_5((C73433Srt) interfaceC73573Su9, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 0));
    }
}
