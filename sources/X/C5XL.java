package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5XL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XL extends AbstractC65781Prl implements InterfaceC88472Yns<C136595Xr, C136595Xr> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C5XK LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5XL(int i, C5XK c5xk, int i2, boolean z, boolean z2, String str) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = c5xk;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C136595Xr invoke(C136595Xr setState) {
        o.LJIIIZ(setState, "$this$setState");
        int i = this.LJLIL;
        int i2 = (int) (this.LJLILLLLZI.LLLLIL().musicVolume * 100);
        int i3 = this.LJLJI;
        C08630Vn c08630Vn = new C08630Vn(Boolean.valueOf(this.LJLILLLLZI.LLLLIL().hasMusic()));
        C08630Vn c08630Vn2 = new C08630Vn(Boolean.valueOf(this.LJLJJI));
        C08630Vn c08630Vn3 = new C08630Vn(Boolean.valueOf(this.LJLJJL));
        String musicDetail = this.LJLJJLL;
        o.LJIIIZ(musicDetail, "musicDetail");
        return new C136595Xr(i, i2, i3, c08630Vn, c08630Vn2, c08630Vn3, musicDetail);
    }
}
