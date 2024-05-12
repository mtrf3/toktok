package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.3RA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RA extends AbstractC65781Prl implements InterfaceC65784Pro<C3R0> {
    public final /* synthetic */ SharePackage LJLIL;
    public final /* synthetic */ EnumC84123Rw LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RA(SharePackage sharePackage, EnumC84123Rw enumC84123Rw, EnumC84133Rx enumC84133Rx, boolean z, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, boolean z2, boolean z3, boolean z4, int i) {
        super(0);
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = enumC84123Rw;
        this.LJLJI = z;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = z4;
        this.LJLJLLL = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C3R0 invoke() {
        String str;
        Bundle bundle;
        C3R9 c3r9 = new C3R9(1, C3RJ.LIZ(this.LJLIL));
        c3r9.LJIIJJI = this.LJLILLLLZI;
        SharePackage sharePackage = this.LJLIL;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        } else {
            str = null;
        }
        c3r9.LIZLLL = str;
        c3r9.LIZJ = Boolean.TRUE;
        c3r9.LJII = this.LJLJI;
        c3r9.LJIILIIL = this.LJLJJI.element;
        c3r9.LJIILJJIL = this.LJLJJL.element;
        c3r9.LJIIL = this.LJLJJLL;
        c3r9.LJIILLIIL = this.LJLJL;
        c3r9.LJIIJ = this.LJLJLJ;
        boolean z = false;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            z = bundle.getBoolean("is_video_only", false);
        }
        c3r9.LJIIZILJ = z;
        return new C3R0(c3r9, this.LJLJLLL);
    }
}
