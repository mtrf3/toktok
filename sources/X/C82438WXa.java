package X;

import kotlin.jvm.internal.AqS196S0100000_14;

/* renamed from: X.WXa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82438WXa implements InterfaceC82441WXd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final WXY LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI = -1;
    public final C82632Wbs LJLJJL;
    public InterfaceC82440WXc LJLJJLL;
    public boolean LJLJL;

    static {
        TBT tbt = new TBT(C82438WXa.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC82441WXd
    public final void LIZ() {
        LIZLLL(3);
    }

    @Override // X.InterfaceC82441WXd
    public final void b() {
        LIZLLL(0);
    }

    @Override // X.InterfaceC82441WXd
    public final void LIZIZ() {
        if (this.LJLJL) {
            LIZJ().s9(0);
            this.LJLJL = false;
        }
    }

    public final InterfaceC82086WJm LIZJ() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.InterfaceC82441WXd
    public final void LJJJJIZL() {
        this.LJLILLLLZI.LJJJJIZL();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LIZLLL(int i) {
        if (this.LJLJJI == i) {
            return;
        }
        this.LJLJJI = i;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 3) {
                    return;
                }
                LIZJ().e8().getViewFunction().getView().setVisibility(8);
                this.LJLILLLLZI.X0();
                return;
            }
            if (this.LJLILLLLZI.Y0()) {
                LIZJ().s9(1);
            }
            if (this.LJLJI != 2) {
                z = false;
            }
            this.LJLILLLLZI.Z0(C82447WXj.LJLIL, new AqS196S0100000_14(this, 34), z);
            return;
        }
        this.LJLILLLLZI.W0();
    }

    @Override // X.InterfaceC82441WXd
    public final void start(int i) {
        this.LJLJI = i;
        if (ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{1, 2})) {
            LIZLLL(1);
            return;
        }
        if (this.LJLILLLLZI.Y0()) {
            LIZJ().s9(2);
            this.LJLJL = true;
        }
        this.LJLILLLLZI.LLJJJJ();
    }

    public C82438WXa(C82622Wbi c82622Wbi, WY8 wy8) {
        this.LJLIL = c82622Wbi;
        this.LJLILLLLZI = wy8;
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC82086WJm.class, null);
    }
}
