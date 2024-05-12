package X;

import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;

/* renamed from: X.Wwn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83929Wwn implements InterfaceC83931Wwp {
    public final int LJLIL;
    public final int[] LJLILLLLZI;
    public final boolean LJLJI;
    public final /* synthetic */ InterfaceC83931Wwp LJLJJI;

    @Override // X.InterfaceC83931Wwp
    public final YZL LIZ() {
        return this.LJLJJI.LIZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final VECameraSettings.CAMERA_MODE_TYPE LIZLLL() {
        return this.LJLJJI.LIZLLL();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJ() {
        return this.LJLJJI.LJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJI() {
        return this.LJLJJI.LJI();
    }

    @Override // X.InterfaceC83931Wwp
    public final int LJII() {
        return this.LJLJJI.LJII();
    }

    @Override // X.InterfaceC83931Wwp
    public final Boolean LJIIIIZZ() {
        return this.LJLJJI.LJIIIIZZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final byte LJIIIZ() {
        return this.LJLJJI.LJIIIZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIILIIL() {
        return this.LJLJJI.LJIILIIL();
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIILL() {
        return this.LJLJJI.LJIILL();
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIJ() {
        return this.LJLJJI.LJIJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final VEDisplaySettings LJIJJ() {
        return this.LJLJJI.LJIJJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJIJJLI() {
        return this.LJLJJI.LJIJJLI();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJII() {
        return this.LJLJJI.LJJII();
    }

    @Override // X.InterfaceC83931Wwp
    public final VEDisplaySettings LJJIII(VESize vESize) {
        return this.LJLJJI.LJJIII(vESize);
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJIIJ() {
        return this.LJLJJI.LJJIIJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final int LJJIIJZLJL() {
        return this.LJLJJI.LJJIIJZLJL();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJIIZ() {
        return this.LJLJJI.LJJIIZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJIIZI() {
        return this.LJLJJI.LJJIIZI();
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIIJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJIIJJI() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC83931Wwp
    public final int LJIILLIIL() {
        return this.LJLIL;
    }

    public C83929Wwn(C83924Wwi c83924Wwi) {
        int i;
        InterfaceC83931Wwp interfaceC83931Wwp = c83924Wwi.LJLIL;
        this.LJLJJI = interfaceC83931Wwp;
        if (interfaceC83931Wwp.LJIILLIIL() != 0) {
            i = c83924Wwi.LJLIL.LJIILLIIL();
        } else {
            c83924Wwi.LJLL.getAttrsHelper().getClass();
            i = 0;
        }
        this.LJLIL = i;
        this.LJLILLLLZI = c83924Wwi.LJLIL.LJIIJ();
        this.LJLJI = c83924Wwi.LJLIL.LJIIJJI();
    }
}
