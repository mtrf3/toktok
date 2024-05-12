package X;

import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XeN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85335XeN extends AbstractC65781Prl implements InterfaceC88472Yns<C85333XeL, C76800UCe> {
    public final /* synthetic */ PoiPublishExtensionVMV2 LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85335XeN(PoiPublishExtensionVMV2 poiPublishExtensionVMV2, double d, double d2, String str, boolean z, long j) {
        super(1);
        this.LJLIL = poiPublishExtensionVMV2;
        this.LJLILLLLZI = d;
        this.LJLJI = d2;
        this.LJLJJI = str;
        this.LJLJJL = z;
        this.LJLJJLL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C85333XeL c85333XeL) {
        C85333XeL it = c85333XeL;
        o.LJIIIZ(it, "it");
        if (!(it.LJLIL instanceof C72922tc)) {
            this.LJLIL.setState(C85334XeM.LJLIL);
            ((InterfaceC85336XeO) this.LJLIL.LJLL.getValue().getOperator()).LJJZZIII(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, new IDqS439S0100000_15(this.LJLIL, 9), new AqS181S0100000_15(this.LJLIL, 228), this.LJLIL.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
