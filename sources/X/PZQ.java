package X;

import android.os.Build;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.network.NetworkComponent;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS71S0400000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PZQ {
    public static Field LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public PZS LIZ;
    public boolean LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;
    public ByteArrayOutputStream LJ;
    public final HttpURLConnection LJFF;

    public final void LIZIZ() {
        Field LIZ;
        Object LIZ2;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        java.net.URL url = this.LJFF.getURL();
        o.LJIIIIZZ(url, "httpURLConnection.url");
        boolean equals = url.getProtocol().equals("https");
        Object obj = this.LJFF;
        if (equals) {
            Field LIZ3 = LIZ(obj.getClass(), LJI, "delegate");
            LJI = LIZ3;
            obj = LIZ3.get(this.LJFF);
            LIZ = LIZ(obj.getClass(), LJII, "requestHeaders");
            LJII = LIZ;
        } else {
            LIZ = LIZ(obj.getClass(), LJIIIIZZ, "requestHeaders");
            LJIIIIZZ = LIZ;
        }
        Object obj2 = LIZ.get(obj);
        if (obj2 != null) {
            PZS pzs = new PZS(obj2);
            if (PZS.LIZIZ == null) {
                try {
                    Class<?> cls = obj2.getClass();
                    PZS.LIZIZ = cls.getDeclaredMethod("get", String.class);
                    PZS.LIZJ = cls.getDeclaredMethod("add", String.class, String.class);
                    PZS.LIZLLL = cls.getDeclaredMethod("removeAll", String.class);
                    PZS.LJ = cls.getDeclaredMethod("set", String.class, String.class);
                    PZS.LJFF = cls.getDeclaredMethod("build", new Class[0]);
                    LIZ2 = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl != null) {
                    if (Build.VERSION.SDK_INT == 28) {
                        NetworkComponent.INSTANCE.setUrlConnectionService(null);
                    } else {
                        C65926Pu6.LIZ("Helios:Network-Service", C64654PZa.LJLIL, 6, m10exceptionOrNullimpl);
                    }
                }
            }
            this.LIZ = pzs;
        }
        this.LIZJ = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x013b: INVOKE (r1v1 ?? I:kotlin.jvm.internal.AqS161S0100000_11), (r6 I:X.PZQ), (r0 I:int) DIRECT call: kotlin.jvm.internal.AqS161S0100000_11.<init>(X.PZQ, int):void A[MD:(X.PZQ, int):void (m)] (LINE:315), block:B:64:0x0137 */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.PZQ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    public final String LIZJ() {
        ?? r6;
        ByteArrayOutputStream byteArrayOutputStream;
        Object obj;
        long j;
        T t;
        T t2;
        NetworkConfig networkConfig;
        int i = 6;
        try {
            LIZLLL();
            byteArrayOutputStream = this.LJ;
        } catch (NoSuchFieldException e) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 21 || i2 == 22 || i2 == 28) {
                i = 5;
            }
            C65926Pu6.LIZ("Helios:Network-Service", new AqS161S0100000_11((PZQ) r6, 95), i, e);
        }
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toString(C64656PZc.LIZIZ.name());
        }
        if (this.LIZLLL) {
            return null;
        }
        this.LIZLLL = true;
        Object obj2 = this.LIZJ;
        if (obj2 != null && (obj = LIZ(obj2.getClass(), null, "httpEngine").get(obj2)) != null) {
            Field LIZ = LIZ(obj.getClass(), null, "bufferedRequestBody");
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = 0;
            SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
            if (settings != null && (networkConfig = settings.networkConfig) != null) {
                j = networkConfig.bodyDelayInterval;
            } else {
                j = 500;
            }
            C68322mC c68322mC = new C68322mC();
            try {
                t = LIZ.get(obj);
            } catch (Throwable unused) {
                t = 0;
            }
            c68322mC.element = t;
            while (c68322mC.element == 0 && c76732zl.element < j) {
                Thread.sleep(10L);
                c76732zl.element += 10;
                try {
                    t2 = LIZ.get(obj);
                } catch (Throwable unused2) {
                    t2 = 0;
                }
                c68322mC.element = t2;
            }
            C65926Pu6.LIZIZ("Helios:Network-Cost", new PZT(c76732zl, j), 2, null, 8);
            T t3 = c68322mC.element;
            if (t3 != 0) {
                Field LIZ2 = LIZ(t3.getClass(), null, "sink");
                C68322mC c68322mC2 = new C68322mC();
                ?? r0 = LIZ2.get(c68322mC.element);
                if (r0 != 0) {
                    c68322mC2.element = r0;
                    if (o.LJ(r0.getClass().getName(), "com.android.okhttp.internal.http.Http1xStream$ChunkedSink")) {
                        ?? r02 = LIZ(c68322mC2.element.getClass(), null, "sink").get(c68322mC2.element);
                        if (r02 == 0) {
                            return null;
                        }
                        c68322mC2.element = r02;
                        C65926Pu6.LIZ("Helios:Network-Service", new AqS71S0400000_11(c68322mC, c68322mC2, this, obj2, 0), 6, new Throwable());
                    }
                    Object obj3 = LIZ(c68322mC2.element.getClass(), null, "content").get(c68322mC2.element);
                    if (obj3 != null) {
                        Method declaredMethod = obj3.getClass().getDeclaredMethod("copyTo", OutputStream.class);
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        declaredMethod.invoke(obj3, byteArrayOutputStream2);
                        this.LJ = byteArrayOutputStream2;
                        return byteArrayOutputStream2.toString(C64656PZc.LIZIZ.name());
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final void LIZLLL() {
        Object LIZ;
        try {
            LIZIZ();
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C65926Pu6.LIZ("Helios:Network-Service", PZW.LJLIL, 6, m10exceptionOrNullimpl);
        }
    }

    public PZQ(HttpURLConnection httpURLConnection) {
        this.LJFF = httpURLConnection;
    }

    public static Field LIZ(Class cls, Field field, String str) {
        if (field == null) {
            Field obj = cls.getDeclaredField(str);
            o.LJIIIIZZ(obj, "obj");
            obj.setAccessible(true);
            return obj;
        }
        return field;
    }
}
