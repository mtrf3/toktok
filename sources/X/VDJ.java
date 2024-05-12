package X;

import android.content.IntentFilter;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkEnableTfoPreconnectSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FirstScreenOptSwitcher;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes15.dex */
public final class VDJ implements InterfaceC30713C3p {
    public VDR LIZ;

    @Override // X.InterfaceC30713C3p
    public final void LIZ() {
        String str;
        int[] iArr;
        try {
            if (!C21090sD.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context())) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (DnsOptMethodSetting.INSTANCE.getValue() == 1 && FirstScreenOptSwitcher.INSTANCE.getValue()) {
            C28645BMb.LIZ().getClass();
            if (((InterfaceC30713C3p) VCT.LIZIZ(InterfaceC30713C3p.class)).LIZJ() == null) {
                if (CN1.LIZ(IHostAppContext.class) != null && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                    str = "https://hotapi-sg.tiktokv.com";
                } else {
                    str = "https://hotapi-va.tiktokv.com";
                }
                VDL vdl = new VDL();
                vdl.LIZ = str;
                ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getUpdateVersionCode();
                vdl.LIZIZ = new C65252PjE();
                vdl.LIZJ = LiveSdkEnableTfoPreconnectSetting.INSTANCE.getValue();
                VDN.LIZIZ().LIZ(new VDM(vdl));
                VDR vdr = new VDR(C16880lQ.LLLLL(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()));
                int i = 0;
                vdr.LIZ = new O6R(i);
                VDK.LIZ().LIZ = vdr.LIZ;
                VDK LIZ = VDK.LIZ();
                if (LIZ.LIZ != null) {
                    LIZ.LJFF = ((Integer) O6R.LJIJJLI("min_start_play_buffer", 600)).intValue();
                    LIZ.LIZ.getClass();
                    LIZ.LJI = ((Integer) O6R.LJIJJLI("max_start_play_buffer", 1000)).intValue();
                    O6R o6r = LIZ.LIZ;
                    Double valueOf = Double.valueOf(0.1d);
                    o6r.getClass();
                    LIZ.LJII = ((Double) O6R.LJIJJLI("attenuation_coefficient", valueOf)).doubleValue();
                    LIZ.LIZ.getClass();
                    LIZ.LJIIIIZZ = ((Integer) O6R.LJIJJLI("attenuation_time_offset", 1000)).intValue();
                }
                double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                while (true) {
                    if (i >= LIZ.LIZLLL.length) {
                        break;
                    }
                    d2 += Math.cbrt(8 - r1[i]);
                    i++;
                }
                int i2 = LIZ.LJI;
                int i3 = LIZ.LJFF;
                int i4 = i2 - i3;
                int i5 = 1;
                while (true) {
                    iArr = LIZ.LIZLLL;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    d += Math.cbrt(8 - iArr[i5]);
                    int i6 = (int) (((d / d2) * i4) + LIZ.LJFF);
                    LIZ.LJ.put(Integer.valueOf(LIZ.LIZLLL[i5 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(i6)));
                    i5++;
                    i3 = i6;
                }
                if (i5 == iArr.length) {
                    LIZ.LJ.put(Integer.valueOf(LIZ.LIZLLL[i5 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(LIZ.LJI)));
                }
                C28645BMb.LIZ().getClass();
                ((InterfaceC30713C3p) VCT.LIZIZ(InterfaceC30713C3p.class)).LIZIZ(vdr);
                try {
                    vdr.LJIIIIZZ = true;
                    C16880lQ.LJJLIIIJILLIZJL(vdr.LJ, vdr.LIZLLL, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    VDN.LIZIZ().LIZJ.LIZ();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    @Override // X.InterfaceC30713C3p
    public final VDR LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC30713C3p
    public final void LIZIZ(VDR vdr) {
        this.LIZ = vdr;
    }
}
