package X;

import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.Pjn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65287Pjn extends AbstractC65259PjL<PVM> {
    public final /* synthetic */ AbstractC65259PjL LIZ;

    public C65287Pjn(AbstractC65259PjL abstractC65259PjL) {
        this.LIZ = abstractC65259PjL;
    }

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        this.LIZ.LIZ(c65053Pg1);
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((PVM) h4f.LIZ).byteStream()));
            while (true) {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } catch (IOException e) {
                    this.LIZ.LIZ(new C65288Pjo(e.getMessage(), e));
                    return;
                }
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            OAuthResponse LIZIZ = OAuth1aService.LIZIZ(sb2);
            if (LIZIZ == null) {
                AbstractC65259PjL abstractC65259PjL = this.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to parse auth response: ");
                LIZ.append(sb2);
                abstractC65259PjL.LIZ(new C65288Pjo(X1D.LIZIZ(LIZ)));
                return;
            }
            this.LIZ.LIZIZ(new H4F(LIZIZ, null));
        } catch (Throwable th2) {
        }
    }
}
