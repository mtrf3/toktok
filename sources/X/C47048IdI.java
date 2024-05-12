package X;

import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.IdI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47048IdI implements InterfaceC46895Iap {
    public final C46894Iao LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC46895Iap
    public void LJIILLIIL() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJIIZILJ() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJIJ() {
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIJI() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJIJJ() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJIJJLI() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJIL() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJJ() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJJI() {
    }

    @Override // X.InterfaceC46895Iap
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC46895Iap
    public void LJJII() {
    }

    public C47048IdI(C46894Iao playEvent) {
        o.LJIIIZ(playEvent, "playEvent");
        this.LIZ = playEvent;
        this.LIZIZ = TimeUnit.SECONDS.toMillis(1L);
        this.LIZJ = playEvent.LIZ;
        this.LIZLLL = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void LIZJ(String str, String str2) {
        int i;
        if (C47047IdH.LIZ(str2) > C47047IdH.LIZ(this.LIZLLL)) {
            this.LIZLLL = str2;
            C46894Iao c46894Iao = this.LIZ;
            c46894Iao.getClass();
            c46894Iao.LIZLLL = str2;
            switch (str2.hashCode()) {
                case -1472362992:
                    if (str2.equals("Not-Render")) {
                        i = 104;
                        break;
                    }
                    i = -1;
                    break;
                case -782671117:
                    if (str2.equals("Short-Stop")) {
                        i = 102;
                        break;
                    }
                    i = -1;
                    break;
                case -355504186:
                    if (str2.equals("Stop-B4-Render")) {
                        i = 101;
                        break;
                    }
                    i = -1;
                    break;
                case 16226426:
                    if (str2.equals("Pause-B4-Render")) {
                        i = 100;
                        break;
                    }
                    i = -1;
                    break;
                case 1503668517:
                    if (str2.equals("Short-Pause")) {
                        i = 103;
                        break;
                    }
                    i = -1;
                    break;
                case 1909244093:
                    if (str2.equals("IE-HideCoverTimeout")) {
                        i = 200;
                        break;
                    }
                    i = -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            c46894Iao.LIZJ = i;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("postTag:[");
            LIZ.append(str2);
            LIZ.append(',');
            LIZ.append((Object) str);
            LIZ.append(']');
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            IRadarTransmitter LJII = C46982IcE.LJII();
            if (LJII == null) {
                return;
            }
            LJII.tag(str2);
        }
    }

    public static void LIZIZ(String str, AbstractC46689IUb abstractC46689IUb, Object... objArr) {
        SimRadar.errorScan("Analyzer", str, abstractC46689IUb, Arrays.copyOf(objArr, objArr.length));
    }
}
