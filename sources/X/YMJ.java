package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YMJ {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C64972Pei LIZLLL;
    public final YMF LJ;
    public final YMJ LJFF;
    public XM9<YME, ? extends Exception> LJI;
    public XM9<YME, ? extends Exception> LJII;
    public SdkUplinkPacket LJIIIIZZ;
    public YME LJIIIZ;
    public Exception LJIIJ;
    public boolean LJIIJJI;
    public final YMP LJIIL;
    public YMK LJIILIIL;
    public boolean LJIILJJIL;

    public final XM9<YME, Exception> LIZ() {
        InterfaceC65228Piq interfaceC65228Piq;
        byte[] bArr;
        int i;
        InterfaceC65228Piq interfaceC65228Piq2;
        SdkUplinkPacket sdkUplinkPacket = this.LJIIIIZZ;
        YME yme = this.LJIIIZ;
        Exception exc = this.LJIIJ;
        if (sdkUplinkPacket != null) {
            C64537PUn c64537PUn = sdkUplinkPacket.payload;
            if (c64537PUn == null || (bArr = c64537PUn.toByteArray()) == null) {
                bArr = new byte[0];
            }
            ArrayList arrayList = new ArrayList();
            java.util.Map<String, String> map = sdkUplinkPacket.headers;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new C87247YLz(entry.getKey(), entry.getValue()));
                }
            }
            YMH ymh = new YMH();
            Integer num = sdkUplinkPacket.statusCode;
            o.LJIIIIZZ(num, "packet.statusCode");
            int intValue = num.intValue();
            YME yme2 = ymh.LIZ;
            yme2.LIZ = intValue;
            yme2.LIZIZ = sdkUplinkPacket.statusMessage;
            yme2.LIZLLL = bArr;
            yme2.LIZJ = arrayList;
            if (this.LJIIJJI) {
                i = 1;
            } else {
                i = 2;
            }
            yme2.LJFF = i;
            if (bArr.length != 0 && (interfaceC65228Piq2 = this.LIZLLL.LJIIIIZZ) != null) {
                ymh.LIZ.LJ = interfaceC65228Piq2.LIZ(bArr);
            }
            return new XMB(ymh.LIZ);
        }
        if (yme != null) {
            byte[] bArr2 = yme.LIZLLL;
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            YMH ymh2 = new YMH();
            int i2 = yme.LIZ;
            YME yme3 = ymh2.LIZ;
            yme3.LIZ = i2;
            yme3.LIZIZ = yme.LIZIZ;
            yme3.LIZLLL = bArr2;
            yme3.LIZJ = yme.LIZJ;
            yme3.LJFF = 0;
            if (bArr2.length != 0 && (interfaceC65228Piq = this.LIZLLL.LJIIIIZZ) != null) {
                ymh2.LIZ.LJ = interfaceC65228Piq.LIZ(bArr2);
            }
            return new XMB(ymh2.LIZ);
        }
        if (exc != null) {
            return new XM8(exc);
        }
        return new XM8(new C79533VJh(-3, "request not finish", null, 4, null));
    }

    public final SdkUplinkPacket LIZIZ() {
        String str;
        java.util.Map<String, String> map = this.LIZLLL.LIZJ;
        if (map == null) {
            map = new HashMap<>();
        }
        java.util.Map<String, String> map2 = this.LIZLLL.LIZLLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        byte[] LIZ = this.LIZLLL.LIZ();
        try {
            str = UriProtector.parse(this.LIZLLL.LIZIZ).getPath();
            if (str == null) {
                str = this.LIZLLL.LIZIZ;
            }
        } catch (Exception unused) {
            str = this.LIZLLL.LIZIZ;
        }
        YNX ynx = new YNX();
        ynx.LIZLLL = Long.valueOf(this.LIZ);
        ynx.LJ = Long.valueOf(this.LIZIZ);
        ynx.LJII = str;
        C63685Oz3.LIZIZ(map2);
        ynx.LJFF = map2;
        C63685Oz3.LIZIZ(map);
        ynx.LJI = map;
        C64528PUe c64528PUe = C64537PUn.Companion;
        byte[] copyOf = Arrays.copyOf(LIZ, LIZ.length);
        c64528PUe.getClass();
        ynx.LJIIIIZZ = C64528PUe.LIZIZ(copyOf);
        return ynx.build();
    }

    public final void LIZJ(Exception exception, boolean z) {
        int i;
        o.LJIIIZ(exception, "exception");
        this.LJIIJ = exception;
        YMP ymp = this.LJIIL;
        ymp.getClass();
        ymp.LJII = System.currentTimeMillis();
        ymp.LJFF = z;
        ymp.LJIIIIZZ = false;
        if (exception instanceof C79533VJh) {
            i = ((C79533VJh) exception).getStatusCode();
        } else {
            i = -1;
        }
        ymp.LJIIIZ = i;
        String message = exception.getMessage();
        if (message == null) {
            message = "Unknown Exception";
        }
        ymp.LJIIJ = message;
    }

    public final void LIZLLL(YME httpResponse, boolean z) {
        o.LJIIIZ(httpResponse, "httpResponse");
        this.LJIIIZ = httpResponse;
        YMP ymp = this.LJIIL;
        ymp.getClass();
        ymp.LJII = System.currentTimeMillis();
        ymp.LJFF = z;
        ymp.LJIIIIZZ = true;
        ymp.LJIIIZ = httpResponse.LIZ;
        String str = httpResponse.LIZIZ;
        o.LJIIIIZZ(str, "httpResponse.msg");
        ymp.LJIIJ = str;
    }

    public final void LJ(SdkUplinkPacket sdkUplinkPacket, boolean z, boolean z2) {
        this.LJIIJJI = z2;
        this.LJIIIIZZ = sdkUplinkPacket;
        YMP ymp = this.LJIIL;
        ymp.getClass();
        ymp.LJII = System.currentTimeMillis();
        ymp.LJFF = z;
        ymp.LJIIIIZZ = true;
        Integer num = sdkUplinkPacket.statusCode;
        o.LJIIIIZZ(num, "uplinkPacket.statusCode");
        ymp.LJIIIZ = num.intValue();
        String str = sdkUplinkPacket.statusMessage;
        o.LJIIIIZZ(str, "uplinkPacket.statusMessage");
        ymp.LJIIJ = str;
    }

    public YMJ(long j, long j2, long j3, C64972Pei originHttpRequest, YMF httpCallback, YMJ ymj) {
        o.LJIIIZ(originHttpRequest, "originHttpRequest");
        o.LJIIIZ(httpCallback, "httpCallback");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = originHttpRequest;
        this.LJ = httpCallback;
        this.LJFF = ymj;
        this.LJIIL = new YMP(j, j2);
    }
}
