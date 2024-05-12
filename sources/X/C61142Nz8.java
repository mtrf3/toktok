package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.elearning.lingo.gecko.GeckoAPI;

/* renamed from: X.Nz8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61142Nz8 extends LynxViewClient {
    public final /* synthetic */ C68322mC<EnumC61143Nz9> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.Nz9] */
    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        C68322mC<EnumC61143Nz9> c68322mC = this.LIZ;
        ?? r2 = EnumC61143Nz9.STEP_RENDER_NATIVE;
        c68322mC.element = r2;
        C79081V1x.LJJIII(r2, this.LIZIZ, false, 0L, null, null, null, String.valueOf(GeckoAPI.LIZ.LIZ()), 252);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.Nz9] */
    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        C68322mC<EnumC61143Nz9> c68322mC = this.LIZ;
        ?? r1 = EnumC61143Nz9.STEP_LOAD;
        c68322mC.element = r1;
        C79081V1x.LJJIII(r1, this.LIZIZ, false, 0L, this.LIZJ, null, null, null, 492);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        EnumC61143Nz9 enumC61143Nz9 = this.LIZ.element;
        String str = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxViewClient:onReceivedError:");
        LIZ.append(lynxError.LIZ());
        C79081V1x.LJJIIJ(enumC61143Nz9, str, X1D.LIZIZ(LIZ), String.valueOf(lynxError.LIZ));
    }

    public C61142Nz8(C68322mC<EnumC61143Nz9> c68322mC, String str, String str2) {
        this.LIZ = c68322mC;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
