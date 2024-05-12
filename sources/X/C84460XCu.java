package X;

import Y.ARunnableS51S0100000_15;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XCu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84460XCu extends XCZ {
    public final XCG LJI;
    public final ProviderEffect LJII;
    public final String LJIIIIZZ;

    @Override // X.XCZ
    public final void LIZ() {
        C84418XBe LJI;
        int i = this.LJI.LJIILL;
        XDM xdm = XDM.LIZ;
        ProviderEffect providerEffect = this.LJII;
        xdm.getClass();
        String LIZLLL = XDM.LIZLLL(providerEffect);
        if (LIZLLL != null) {
            String str = null;
            String str2 = null;
            for (int i2 = 0; i2 < i && !this.LIZIZ; i2++) {
                try {
                    if (C107244Iu.LIZIZ(this.LJII.getPath())) {
                        XDM xdm2 = XDM.LIZ;
                        String str3 = this.LJI.LJIIIIZZ;
                        ProviderEffect providerEffect2 = this.LJII;
                        xdm2.getClass();
                        XDM.LJIIIIZZ(str3, providerEffect2);
                    }
                    try {
                        LJI = LJI(LIZLLL, this.LJII.getPath());
                    } catch (Exception e) {
                        e = e;
                        str2 = LIZLLL;
                        if (i2 == i - 1) {
                            C84418XBe c84418XBe = new C84418XBe(e);
                            if (str2 != null) {
                                str = "";
                            }
                            c84418XBe.LIZ(str2, "", str);
                            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 60), 64));
                            return;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (LJI == null) {
                    C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, this.LJII, 62), 64));
                } else if (i2 == i - 1) {
                    C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, LJI, 60), 64));
                } else {
                    str2 = LIZLLL;
                }
                return;
            }
        }
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 725), 64));
    }

    public final C84418XBe LJI(String str, String str2) {
        VNB fetchFromNetwork;
        if (str2 != null) {
            XD6 xd6 = new XD6(str, null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
            X62 x62 = (X62) this.LJI.LJIJI.LIZ;
            if (x62 == null || (fetchFromNetwork = x62.fetchFromNetwork(xd6)) == null || fetchFromNetwork.LIZIZ != 200) {
                return new C84418XBe(LiveChatShowDelayForHotLiveSetting.DEFAULT);
            }
            XBM.LIZIZ(new C84426XBm(fetchFromNetwork.LIZJ), C10820be.LJIIL(str2, false), fetchFromNetwork.LIZLLL, new AqS197S0100000_15(this, 42));
            return null;
        }
        return new C84418XBe(10014);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84460XCu(XCG effectConfig, ProviderEffect effect, String taskFlag) {
        super(taskFlag, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(effect, "effect");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJI = effectConfig;
        this.LJII = effect;
        this.LJIIIIZZ = taskFlag;
    }
}
