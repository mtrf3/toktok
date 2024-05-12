package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.aSj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93553aSj {
    public final Activity LIZ;
    public boolean LIZIZ;
    public InterfaceC93555aSl LIZJ;
    public final List<InterfaceC93555aSl> LIZLLL;
    public LoginActivity LJ;

    public C93553aSj(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        this.LIZ = activity;
        arrayList.add(new C94377ag1());
        arrayList.add(new C94391agF());
    }

    public final void LIZ(InterfaceC93555aSl interfaceC93555aSl, AuthorizationResponse authorizationResponse) {
        this.LIZIZ = false;
        if (interfaceC93555aSl != null) {
            interfaceC93555aSl.LIZ(null);
            interfaceC93555aSl.stop();
        }
        LoginActivity loginActivity = this.LJ;
        if (loginActivity != null) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putParcelable("response", authorizationResponse);
            intent.putExtra("EXTRA_AUTH_RESPONSE", bundle);
            loginActivity.setResult(-1, intent);
            loginActivity.finish();
            this.LJ = null;
        }
    }
}
