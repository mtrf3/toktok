package X;

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0ND, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0ND implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                C0NE c0ne = (C0NE) this.LJLILLLLZI;
                String str = (String) this.LJLJI;
                C0NB.LIZIZ(str, c0ne.LJFF(str, (JSONObject) this.LJLJJI));
                return;
            default:
                NativeAppLoginMethodHandler this$0 = (NativeAppLoginMethodHandler) this.LJLILLLLZI;
                LoginClient.Request request = (LoginClient.Request) this.LJLJI;
                Bundle extras = (Bundle) this.LJLJJI;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(request, "$request");
                o.LJIIIZ(extras, "$extras");
                try {
                    this$0.LJIIJ(extras, request);
                    this$0.LJIILLIIL(extras, request);
                    return;
                } catch (C65834Psc e) {
                    FacebookRequestError requestError = e.getRequestError();
                    this$0.LJIILL(request, requestError.errorType, requestError.LIZ(), String.valueOf(requestError.errorCode));
                    return;
                } catch (Q4W e2) {
                    this$0.LJIILL(request, null, e2.getMessage(), null);
                    return;
                }
        }
    }

    public /* synthetic */ C0ND(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
