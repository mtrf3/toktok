package X;

import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HGI extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends String>, C76800UCe> {
    public final /* synthetic */ C43786HGk LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HGI(C43786HGk c43786HGk, String str, boolean z) {
        super(1);
        this.LJLIL = c43786HGk;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends String> list) {
        List<? extends String> it = list;
        o.LJIIIZ(it, "it");
        C6QQ.LIZ(new AqS154S0200000_7(this, it, 124));
        return C76800UCe.LIZ;
    }
}
