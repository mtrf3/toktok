package X;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Process;
import com.bytedance.retrofit2.client.Request;
import kotlin.jvm.internal.o;

/* renamed from: X.Ej5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37215Ej5 implements InterfaceC37216Ej6 {
    public final InterfaceC37216Ej6 LJLIL;

    public C37215Ej5(InterfaceC37216Ej6 firstInterceptor) {
        o.LJIIIZ(firstInterceptor, "firstInterceptor");
        this.LJLIL = firstInterceptor;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        String str;
        C64797Pbt response;
        ComponentName componentName;
        try {
            Request request = ((F7S) fbz).LIZJ;
            String url = request.getUrl();
            o.LJIIIIZZ(url, "request.url");
            C35568Dxc.LIZIZ(Process.myTid(), url);
            if (C37219Ej9.LIZ(request)) {
                response = this.LJLIL.intercept(fbz);
            } else {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null || (componentName = LJIIIIZZ.getComponentName()) == null || (str = componentName.getClassName()) == null) {
                    str = "unknown";
                }
                long currentTimeMillis = System.currentTimeMillis();
                response = this.LJLIL.intercept(fbz);
                o.LJIIIIZZ(response, "response");
                C37219Ej9.LIZJ(request, response, currentTimeMillis, str);
            }
            return response;
        } finally {
            C35568Dxc.LIZJ(Process.myTid());
        }
    }
}
