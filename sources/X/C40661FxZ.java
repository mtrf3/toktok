package X;

import com.google.android.play.core.assetpacks.x1;
import com.google.android.play.core.assetpacks.y;

/* renamed from: X.FxZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40661FxZ implements InterfaceC153055zZ {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    public /* synthetic */ C40661FxZ(InterfaceC153055zZ interfaceC153055zZ, C40632Fx6 c40632Fx6) {
        this.LJLIL = interfaceC153055zZ;
        this.LJLILLLLZI = c40632Fx6;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new x1((y) ((InterfaceC153055zZ) this.LJLIL).a(), C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLILLLLZI));
    }

    public C40661FxZ(int i) {
        byte[] bArr = new byte[i];
        this.LJLILLLLZI = bArr;
        this.LJLIL = new C87155YIl(bArr, i);
    }
}
