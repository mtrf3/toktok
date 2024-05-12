package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.R9x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69097R9x<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC69056R8i LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ EnumC69113RAn LJLJLJ;

    public C69097R9x(int i, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, String str4, String str5, EnumC69113RAn enumC69113RAn) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC69056R8i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = enumC69113RAn;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C69099R9z.LIZIZ(0, this.LJLIL, 0, "", null);
        C68972R5c.LJIIJ(this.LJLILLLLZI.q9().LJJLIIIJJI(), this.LJLILLLLZI.q9().LJJLIIIJLLLLLLLZ(), this.LJLILLLLZI.q9().LLZZ(), 0, this.LJLJI, this.LJLIL, "text", null, this.LJLJJI, this.LJLILLLLZI.Hg(), this.LJLJJL, this.LJLJJLL, this.LJLJL, C69093R9t.LJIJ(this.LJLJLJ), FileUtils.BUFFER_SIZE);
    }
}
