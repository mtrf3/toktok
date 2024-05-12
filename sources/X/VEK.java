package X;

import com.lynx.tasm.core.ExternalSourceLoader;

/* loaded from: classes15.dex */
public final class VEK extends QXX {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ExternalSourceLoader LJLJI;

    @Override // X.QXX
    public final void LLLILZJ(VEH<byte[]> veh) {
        String str;
        ExternalSourceLoader externalSourceLoader = this.LJLJI;
        String str2 = this.LJLIL;
        int i = this.LJLILLLLZI;
        byte[] bArr = veh.LIZJ;
        Throwable th = veh.LIZ;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        externalSourceLoader.LIZ(i, str2, str, bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VEK(int i, ExternalSourceLoader externalSourceLoader, String str) {
        super((Object) null);
        this.LJLJI = externalSourceLoader;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
