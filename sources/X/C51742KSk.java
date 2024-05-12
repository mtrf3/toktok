package X;

import android.graphics.Bitmap;

/* renamed from: X.KSk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51742KSk extends AbstractC85293Wj {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        EnumC46462ILi enumC46462ILi;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTabV3 ImgPreload onCompleted pageName:");
        LIZ.append(this.LJLIL);
        LIZ.append(" requestType:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" loadSur: ");
        CK3.LIZIZ(LIZ, this.LJLJI, LIZ, 3);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        String value = EnumC51745KSn.LOAD_IN_MEMORY.getValue();
        String str3 = this.LJLJI;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        if (C51741KSj.LIZ) {
            enumC46462ILi = EnumC46462ILi.DELAY_SUCCESS;
        } else {
            enumC46462ILi = EnumC46462ILi.SUCCESS;
        }
        String state = enumC46462ILi.getState();
        String str4 = this.LJLJJL;
        c56092Lzs.getClass();
        C56092Lzs.LJII(str, str2, currentTimeMillis, value, str3, state, str4);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTabV3 ImgPreload onFailed pageName:");
        LIZ.append(this.LJLIL);
        LIZ.append(" requestType:");
        CK3.LIZIZ(LIZ, this.LJLILLLLZI, LIZ, 3);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        String value = EnumC51745KSn.LOAD_IN_MEMORY.getValue();
        String str3 = this.LJLJI;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        String state = EnumC46462ILi.FAILURE.getState();
        String str4 = this.LJLJJL;
        c56092Lzs.getClass();
        C56092Lzs.LJII(str, str2, currentTimeMillis, value, str3, state, str4);
    }

    public C51742KSk(String str, String str2, String str3, long j, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = j;
        this.LJLJJL = str4;
    }
}
