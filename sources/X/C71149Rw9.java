package X;

import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* renamed from: X.Rw9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71149Rw9 implements InterfaceC78660Uu0 {
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        this.LJLIL.LJ(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLIL.LJ(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        String str;
        String str2 = this.LJLILLLLZI;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        if (C71150RwA.LIZJ) {
            EnumC53638L3i enumC53638L3i = EnumC53638L3i.PIN_CARD;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("image_url", str2);
            C66832jn.LIZIZ("rd_tiktokec_pop_product_exception", enumC53638L3i, 1002, str, linkedHashMap);
        }
        this.LJLIL.LJ(C76800UCe.LIZ);
    }

    public C71149Rw9(InterfaceC43919HLn<C76800UCe> interfaceC43919HLn, String str) {
        this.LJLIL = interfaceC43919HLn;
        this.LJLILLLLZI = str;
    }
}
