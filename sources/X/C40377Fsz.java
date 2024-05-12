package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedInput;

/* renamed from: X.Fsz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40377Fsz implements InterfaceC36621EYv<TypedInput> {
    public final /* synthetic */ InterfaceC40375Fsx LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;
    public final /* synthetic */ C56236M5g LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        C56235M5f.LIZLLL = System.currentTimeMillis();
        this.LJLIL.LIZJ();
        C56235M5f.LIZLLL(2004, this.LJLILLLLZI, "short_2_long");
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
        String str;
        C56235M5f.LIZLLL = System.currentTimeMillis();
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        int i = c36910EeA.LIZIZ;
        if (i >= 300 && i < 400) {
            str = C38588FCm.LIZ(c36910EeA.LIZLLL);
            if (interfaceC37276Ek4 != null) {
                interfaceC37276Ek4.cancel();
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            this.LJLIL.LIZJ();
            C56235M5f.LIZLLL(2004, this.LJLILLLLZI, "short_2_long");
            return;
        }
        this.LJLJI.LIZLLL(this.LJLILLLLZI, str);
        boolean z = C84763XOl.LJIIJJI;
        C56235M5f.LJ = z;
        this.LJLIL.LIZ(z);
        this.LJLJI.LIZJ(this.LJLILLLLZI, str);
    }

    public C40377Fsz(C56236M5g c56236M5g, InterfaceC40375Fsx interfaceC40375Fsx, android.net.Uri uri) {
        this.LJLJI = c56236M5g;
        this.LJLIL = interfaceC40375Fsx;
        this.LJLILLLLZI = uri;
    }
}
