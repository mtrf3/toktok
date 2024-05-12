package X;

import android.text.TextUtils;
import ccb.t;
import com.ss.videoarch.live.LiveIOWrapper;

/* renamed from: X.VAb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79293VAb {
    public long LIZ = -1;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public String LJIIJJI = "";
    public String LJIIL = "";
    public String LJIILIIL = "";
    public final /* synthetic */ t LJIILJJIL;

    public final void LIZ() {
        boolean z;
        long longValueByStr = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1101);
        if (longValueByStr != -1 && longValueByStr != this.LIZ) {
            this.LIZ = longValueByStr;
            z = true;
        } else {
            z = false;
        }
        long longValueByStr2 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1102);
        if (longValueByStr2 != -1 && longValueByStr2 != this.LIZIZ) {
            this.LIZIZ = longValueByStr2;
            z = true;
        }
        long longValueByStr3 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1103);
        if (longValueByStr3 != -1 && longValueByStr3 != this.LIZJ) {
            this.LIZJ = longValueByStr3;
            z = true;
        }
        long longValueByStr4 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1126);
        if (longValueByStr4 != -1 && longValueByStr4 != this.LIZLLL) {
            this.LIZLLL = longValueByStr4;
            z = true;
        }
        long longValueByStr5 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1127);
        if (longValueByStr5 != -1 && longValueByStr5 != this.LJ) {
            this.LJ = longValueByStr5;
            z = true;
        }
        long longValueByStr6 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1128);
        if (longValueByStr6 != -1 && longValueByStr6 != this.LJFF) {
            this.LJFF = longValueByStr6;
            z = true;
        }
        long longValueByStr7 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1131);
        if (longValueByStr7 != -1 && longValueByStr7 != this.LJI) {
            this.LJI = longValueByStr7;
            z = true;
        }
        long longValueByStr8 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1133);
        if (longValueByStr8 != -1 && longValueByStr8 != this.LJIIIIZZ) {
            this.LJIIIIZZ = longValueByStr8;
            z = true;
        }
        long longValueByStr9 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1134);
        if (longValueByStr9 != -1 && longValueByStr9 != this.LJII) {
            this.LJII = longValueByStr9;
            z = true;
        }
        if (this.LJII != -1) {
            String stringValueByStr = LiveIOWrapper.getInstance().getStringValueByStr(this.LJIILJJIL.f107v5, 1135);
            if (!TextUtils.isEmpty(stringValueByStr) && !stringValueByStr.equals(this.LJIIJJI)) {
                this.LJIIJJI = stringValueByStr;
                VAD vad = this.LJIILJJIL.LJLJJI;
                vad.LJLLL = stringValueByStr;
                vad.LJLLLL = true;
                z = true;
            }
        }
        if (this.LJI != 0) {
            String stringValueByStr2 = LiveIOWrapper.getInstance().getStringValueByStr(this.LJIILJJIL.f107v5, 1132);
            if (!TextUtils.isEmpty(stringValueByStr2) && !stringValueByStr2.equals(this.LJIILIIL)) {
                this.LJIILIIL = stringValueByStr2;
                z = true;
            }
        }
        String stringValueByStr3 = LiveIOWrapper.getInstance().getStringValueByStr(this.LJIILJJIL.f107v5, 1130);
        if (!TextUtils.isEmpty(stringValueByStr3) && !stringValueByStr3.equals(this.LJIIL)) {
            this.LJIIL = stringValueByStr3;
            z = true;
        }
        long longValueByStr10 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1145);
        if (longValueByStr10 != -1 && longValueByStr10 != this.LJIIIZ) {
            this.LJIIIZ = longValueByStr10;
            z = true;
        }
        long longValueByStr11 = LiveIOWrapper.getInstance().getLongValueByStr(this.LJIILJJIL.f107v5, 1144);
        if (longValueByStr11 != -1 && longValueByStr11 != this.LJIIJ) {
            this.LJIIJ = longValueByStr11;
        } else if (!z) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("liveio updateLogInfo, PlayerDNSTimestamp: ");
        LIZ.append(this.LIZ);
        LIZ.append(", TcpConnectTimestamp: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", TcpFirstPacketTimestamp: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", HitCDNCache: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", CDNBackToSourceRequestTime: ");
        LIZ.append(this.LJ);
        LIZ.append(", CDNBackToSourceToTalTime: ");
        LIZ.append(this.LJFF);
        LIZ.append(", RedirectTimestamp: ");
        LIZ.append(this.LJI);
        LIZ.append(", mHttpNotFoundTime: ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", mTaskDispatchCost: ");
        LIZ.append(this.LJIIJ);
        LIZ.append(", RaceResult: ");
        LIZ.append(this.LJII);
        LIZ.append(", RaceConnectCost: ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", RaceResultIP: ");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", RealIP: ");
        LIZ.append(this.LJIIL);
        LIZ.append(", RedirectURL: ");
        C64504PTg.LIZLLL(LIZ, this.LJIILIIL, LIZ);
    }

    public C79293VAb(t tVar) {
        this.LJIILJJIL = tVar;
    }
}
