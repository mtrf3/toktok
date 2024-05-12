package X;

import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;

/* renamed from: X.Wwm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83928Wwm implements InterfaceC83931Wwp {
    public final /* synthetic */ InterfaceC83931Wwp LJLIL;
    public final /* synthetic */ C83925Wwj LJLILLLLZI;

    @Override // X.InterfaceC83931Wwp
    public final YZL LIZ() {
        return this.LJLIL.LIZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final VECameraSettings.CAMERA_MODE_TYPE LIZLLL() {
        return this.LJLIL.LIZLLL();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJ() {
        return this.LJLIL.LJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJI() {
        return this.LJLIL.LJI();
    }

    @Override // X.InterfaceC83931Wwp
    public final int LJII() {
        return this.LJLIL.LJII();
    }

    @Override // X.InterfaceC83931Wwp
    public final byte LJIIIZ() {
        return this.LJLIL.LJIIIZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIIJ() {
        return this.LJLIL.LJIIJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJIIJJI() {
        return this.LJLIL.LJIIJJI();
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIILIIL() {
        return new int[]{this.LJLILLLLZI.LJLJJI.LJLJJI.getWidth(), this.LJLILLLLZI.LJLJJI.LJLJJI.getHeight()};
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIILL() {
        return new int[]{this.LJLILLLLZI.LJLJJI.LJLJI.getWidth(), this.LJLILLLLZI.LJLJJI.LJLJI.getHeight()};
    }

    @Override // X.InterfaceC83931Wwp
    public final int LJIILLIIL() {
        return this.LJLIL.LJIILLIIL();
    }

    @Override // X.InterfaceC83931Wwp
    public final VEDisplaySettings LJIJJ() {
        return this.LJLIL.LJIJJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJIJJLI() {
        return this.LJLIL.LJIJJLI();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJII() {
        return this.LJLIL.LJJII();
    }

    @Override // X.InterfaceC83931Wwp
    public final VEDisplaySettings LJJIII(VESize vESize) {
        return this.LJLIL.LJJIII(vESize);
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJIIJ() {
        return this.LJLIL.LJJIIJ();
    }

    @Override // X.InterfaceC83931Wwp
    public final int LJJIIJZLJL() {
        return this.LJLIL.LJJIIJZLJL();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJIIZ() {
        return this.LJLIL.LJJIIZ();
    }

    @Override // X.InterfaceC83931Wwp
    public final boolean LJJIIZI() {
        return this.LJLIL.LJJIIZI();
    }

    @Override // X.InterfaceC83931Wwp
    public final Boolean LJIIIIZZ() {
        return this.LJLILLLLZI.LJLJJI.LJLJLLL;
    }

    @Override // X.InterfaceC83931Wwp
    public final int[] LJIJ() {
        Integer num;
        C83935Wwt c83935Wwt = this.LJLILLLLZI.LJLJJI;
        if (c83935Wwt.LJLJLJ == null || (num = c83935Wwt.LJLJL) == null) {
            return null;
        }
        return new int[]{num.intValue(), this.LJLILLLLZI.LJLJJI.LJLJLJ.intValue()};
    }

    public C83928Wwm(C83925Wwj c83925Wwj) {
        this.LJLILLLLZI = c83925Wwj;
        this.LJLIL = c83925Wwj.LJLJJL.LJJJJJL();
    }
}
