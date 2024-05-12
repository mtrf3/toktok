package X;

import android.content.Context;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.lancet.AppLogReaperServiceImpl;
import defpackage.g0;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1PH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PH implements C0Y3, InterfaceC1294656g, InterfaceC215758dP, F23 {
    public static String LJLIL;
    public static final byte[] LJLILLLLZI = {66, 68};
    public static Method LJLJI;

    public static Object LJIIJJI(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "4143248246851249479"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.F23
    public InterfaceC60819Ntv LIZIZ(AdSparkHybridContext adSparkHybridContext, Context context, String str, Bundle bundle) {
        return null;
    }

    @Override // X.C0Y3
    public List LIZJ() {
        return null;
    }

    @Override // X.F23
    public AbstractC60800Ntc LIZLLL() {
        return null;
    }

    @Override // X.F23
    public List LJ() {
        return null;
    }

    @Override // X.C0Y3
    public List LJFF() {
        return null;
    }

    @Override // X.C0Y3
    public boolean LJI(C38531fF c38531fF) {
        return false;
    }

    @Override // X.C0Y3
    public void LJII(C38531fF c38531fF) {
    }

    @Override // X.C0Y3
    public void LJIIIIZZ(C38531fF c38531fF) {
    }

    @Override // X.C0Y3
    public void LJIIIZ() {
    }

    @Override // X.C0Y3
    public List LJIIJ(List list) {
        return null;
    }

    @Override // X.InterfaceC215758dP
    public void onFail() {
    }

    @Override // X.InterfaceC215758dP
    public void onSuccess() {
    }

    @Override // X.C0Y3
    public void release() {
    }

    public static String LJIILIIL() {
        String str;
        String str2 = LJLIL;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        BufferedReader bufferedReader = null;
        String str3 = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(Process.myPid());
            LIZ.append("/cmdline");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ)), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder(32);
                while (true) {
                    int read = bufferedReader2.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                str3 = sb.toString();
            } catch (Throwable unused) {
            }
            str = str3;
            bufferedReader = bufferedReader2;
        } catch (Throwable unused2) {
            str = null;
        }
        g0.LJJIJL(bufferedReader);
        LJLIL = str;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0078, code lost:
    
        if (r6 != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIL(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PH.LJIIL(java.lang.String):java.lang.String");
    }

    public static final AbstractC11740d8 LJIILJJIL(C0OQ c0oq) {
        Shader shader = c0oq.LIZ;
        if (shader == null) {
            if (c0oq.LIZJ != 0) {
                if (shader == null) {
                    return new C32691Qb(C78897Uxp.LIZLLL(c0oq.LIZJ));
                }
            } else {
                return null;
            }
        }
        return new C42631lr(shader);
    }

    public static void LJIILL(JSONObject jSONObject) {
        IAppLogReaperService iAppLogReaperService;
        Object LIZ = C58096Mr6.LIZ(IAppLogReaperService.class, false);
        if (LIZ != null) {
            iAppLogReaperService = (IAppLogReaperService) LIZ;
        } else {
            if (C58096Mr6.S1 == null) {
                synchronized (IAppLogReaperService.class) {
                    if (C58096Mr6.S1 == null) {
                        C58096Mr6.S1 = new AppLogReaperServiceImpl();
                    }
                }
            }
            iAppLogReaperService = C58096Mr6.S1;
        }
        iAppLogReaperService.LIZ(jSONObject);
    }

    @Override // X.F23
    public List LIZ(F3T f3t) {
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        o.LJII(LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.IFeedAdDepend");
        ((NLW) LIZLLL).LJJIFFI().getClass();
        return new C40474FuY().createBridges(f3t);
    }
}
