package X;

import java.io.File;

/* renamed from: X.KSl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51743KSl extends AbstractC38911fr {
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    @Override // X.InterfaceC31104CIq
    public final void LJI(File file) {
        EnumC46462ILi enumC46462ILi;
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String value = EnumC51745KSn.LOAD_IN_DISK.getValue();
        String str3 = this.LJLJJI;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL;
        if (C51741KSj.LIZ) {
            enumC46462ILi = EnumC46462ILi.DELAY_SUCCESS;
        } else {
            enumC46462ILi = EnumC46462ILi.SUCCESS;
        }
        String state = enumC46462ILi.getState();
        String str4 = this.LJLJJLL;
        c56092Lzs.getClass();
        C56092Lzs.LJII(str, str2, currentTimeMillis, value, str3, state, str4);
    }

    @Override // X.InterfaceC31104CIq
    public final void onFailed(Throwable th) {
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String value = EnumC51745KSn.LOAD_IN_DISK.getValue();
        String str3 = this.LJLJJI;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL;
        String state = EnumC46462ILi.FAILURE.getState();
        String str4 = this.LJLJJLL;
        c56092Lzs.getClass();
        C56092Lzs.LJII(str, str2, currentTimeMillis, value, str3, state, str4);
    }

    public C51743KSl(String str, String str2, String str3, long j, String str4) {
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = j;
        this.LJLJJLL = str4;
    }
}
