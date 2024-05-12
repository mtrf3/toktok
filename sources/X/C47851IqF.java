package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.IqF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47851IqF extends C47854IqI implements InterfaceC47869IqX {
    public final int LJFF;
    public int LJI;
    public final int[] LJII;
    public C47854IqI LJIIIIZZ;
    public final Context LJIIIZ;
    public boolean LJIIJ;
    public final C47857IqL LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public JSONObject LJIJ;
    public long LJIJI;
    public long LJIJJ;

    @Override // X.InterfaceC47869IqX
    public final void LIZ(C47789IpF c47789IpF) {
    }

    @Override // X.InterfaceC47869IqX
    public final void onCancelled() {
    }

    @Override // X.C47854IqI
    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        C47854IqI c47854IqI = this.LJIIIIZZ;
        if (c47854IqI != null) {
            c47854IqI.LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d7, code lost:
    
        if (r0 > 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d9, code lost:
    
        r0 = r13.LJIIJJI.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dd, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00df, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e2, code lost:
    
        r13.LJIIJJI.getClass();
        X.C47857IqL.LIZJ = r8;
        r13.LJIIJJI.getClass();
        X.C47857IqL.LIZIZ = r9;
        LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cc, code lost:
    
        if (r12 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    @Override // X.C47854IqI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47851IqF.LJFF():void");
    }

    public final void LJI() {
        int i = this.LJII[this.LJI];
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LJIIIIZZ = new C47852IqG(this.LIZJ, this.LJ, 2);
                }
            } else {
                this.LJIIIIZZ = new C47852IqG(this.LIZJ, this.LJ, 1);
            }
        } else {
            this.LJIIIIZZ = new C47856IqK(this.LIZJ);
        }
        C47854IqI c47854IqI = this.LJIIIIZZ;
        if (c47854IqI != null) {
            c47854IqI.LIZLLL = this;
            c47854IqI.LJFF();
        }
    }

    @Override // X.InterfaceC47869IqX
    public final void LIZIZ(JSONObject jSONObject, C47789IpF c47789IpF) {
        JSONArray jSONArray;
        if (this.LIZIZ) {
            if (!this.LJIIJ || this.LJIIL) {
                this.LIZ.sendEmptyMessage(0);
                return;
            }
            return;
        }
        if (c47789IpF == null) {
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("ips");
            } else {
                jSONArray = null;
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                if (this.LJII[this.LJI] == 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("dns result empty,type:");
                    LIZ.append(this.LJII[this.LJI]);
                    LJ(new C47789IpF("kTTVideoErrorDomainLocalDNS", -9997, 0, X1D.LIZIZ(LIZ)));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("dns result empty,type:");
                    LIZ2.append(this.LJII[this.LJI]);
                    LJ(new C47789IpF("kTTVideoErrorDomainHTTPDNS", -9997, 0, X1D.LIZIZ(LIZ2)));
                }
                TTVideoEngineLog.d("DNSParser", "ips empty");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C63832P3k.LIZ, jSONArray.optString(0));
            } catch (Exception unused) {
            }
            long optLong = jSONObject.optLong("ttl");
            if (optLong == 0) {
                optLong = this.LJIILL;
            }
            LJII(jSONObject2, optLong);
            if (!this.LJIIJ || this.LJIIL) {
                try {
                    jSONObject2.put("time", jSONObject.optLong("time"));
                    jSONObject2.put("dns_type", jSONObject.optString("dns_type"));
                } catch (Exception e) {
                    TTVideoEngineLog.d("DNSParser", e.toString());
                }
                this.LIZ.sendMessage(this.LIZ.obtainMessage(3, jSONObject2));
                return;
            }
            return;
        }
        if (this.LJI == this.LJFF - 1) {
            if (!this.LJIIJ || this.LJIIL) {
                LJ(c47789IpF);
                return;
            }
            return;
        }
        if (!this.LJIIJ || this.LJIIL) {
            this.LIZ.sendMessage(this.LIZ.obtainMessage(1, c47789IpF));
        }
        this.LJI++;
        LJFF();
    }

    public final void LJII(JSONObject jSONObject, long j) {
        if (this.LJIIJJI != null) {
            C47863IqR c47863IqR = new C47863IqR();
            c47863IqR.LIZ = jSONObject;
            c47863IqR.LIZIZ = (j * 1000) + SystemClock.elapsedRealtime();
            C47857IqL c47857IqL = this.LJIIJJI;
            String str = this.LIZJ;
            ConcurrentHashMap<String, C47863IqR> concurrentHashMap = c47857IqL.LIZ;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, c47863IqR);
            }
        }
    }

    public C47851IqF(Context context, AbstractC47819Ipj abstractC47819Ipj, String str) {
        super(str, abstractC47819Ipj);
        int[] iArr = {0, 2};
        this.LJII = iArr;
        this.LJIILL = LiveTryModeCountDownThresholdSetting.DEFAULT;
        this.LJIIIZ = context;
        this.LJFF = iArr.length;
        int[] iArr2 = TTVideoEngine.LIZIZ;
        if (iArr2 != null && iArr2.length > 0) {
            for (int i = 0; i < iArr2.length; i++) {
                int i2 = iArr2[i];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                        }
                    } else {
                        this.LJII[i] = 2;
                    }
                }
                this.LJII[i] = i2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DNSType:");
        LIZ.append(Arrays.toString(this.LJII));
        C78253UnR.LJI("DNSParser", X1D.LIZIZ(LIZ));
        if (C47857IqL.LIZLLL == null) {
            synchronized (C47857IqL.class) {
                if (C47857IqL.LIZLLL == null) {
                    C47857IqL.LIZLLL = new C47857IqL();
                }
            }
        }
        this.LJIIJJI = C47857IqL.LIZLLL;
    }
}
