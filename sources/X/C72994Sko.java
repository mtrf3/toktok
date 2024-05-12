package X;

import android.content.Context;
import kotlin.jvm.internal.AqS6S2300000_12;
import kotlin.jvm.internal.AqS87S1100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sko, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72994Sko extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe> {
    public final /* synthetic */ C31824CeK LJLIL;
    public final /* synthetic */ A90 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ float LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72994Sko(C31824CeK c31824CeK, A90 a90, String str, Context context, String str2, float f) {
        super(1);
        this.LJLIL = c31824CeK;
        this.LJLILLLLZI = a90;
        this.LJLJI = str;
        this.LJLJJI = context;
        this.LJLJJL = str2;
        this.LJLJJLL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
        InterfaceC72996Skq download = interfaceC72996Skq;
        o.LJIIIZ(download, "$this$download");
        download.LIZLLL(new AqS6S2300000_12(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, 1));
        download.LIZJ(new AqS87S1100000_12(this.LJLJI, this.LJLILLLLZI, 0));
        download.LIZ(C72995Skp.LJLIL);
        download.LIZIZ(new C72997Skr(this.LJLJJLL, this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
