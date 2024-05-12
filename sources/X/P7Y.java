package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P7Y extends PthreadThread {
    public final /* synthetic */ java.util.Map LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7Y(java.util.Map map) {
        super("dentifier/zza");
        this.LJLIL = map;
    }

    public static URLConnection LJFF(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "2332469709117648676"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public final void LJ() {
        java.util.Map map = this.LJLIL;
        Uri.Builder buildUpon = UriProtector.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) LIZLLL(new java.net.URL(buildUpon.build().toString()));
            try {
                httpURLConnection.getResponseCode();
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException | IndexOutOfBoundsException | RuntimeException unused) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static URLConnection LIZLLL(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LJFF(url);
        }
        PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection LJFF2 = LJFF(url);
            if (LJFF2 instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LJFF2);
            } else {
                if (!(LJFF2 instanceof HttpURLConnection)) {
                    return LJFF2;
                }
                pyu = new PYU((HttpURLConnection) LJFF2);
            }
            return pyu;
        }
        throw runtimeException;
    }
}
