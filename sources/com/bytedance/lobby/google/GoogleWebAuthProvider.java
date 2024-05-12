package com.bytedance.lobby.google;

import X.C26048AKe;
import X.C58252Mtc;
import X.C66547Q9v;
import X.QAD;
import X.QCI;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class GoogleWebAuthProvider extends BaseProvider {
    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() {
        C66547Q9v c66547Q9v;
        Application application = LobbyCore.getApplication();
        C26048AKe c26048AKe = new C26048AKe(this.LJLJI.LIZJ);
        if (application == null) {
            c66547Q9v = null;
        } else if (!TextUtils.isEmpty((String) c26048AKe.LIZ) && !TextUtils.isEmpty("https://www.googleapis.com/oauth2/v4/token")) {
            c66547Q9v = new C66547Q9v((String) c26048AKe.LIZ, "https://www.googleapis.com/oauth2/v4/token", (String) c26048AKe.LIZLLL);
        } else {
            c66547Q9v = new C66547Q9v((String) c26048AKe.LIZJ, (String) c26048AKe.LIZLLL);
        }
        if (c66547Q9v != null) {
            ((ConcurrentHashMap) C58252Mtc.LIZ).put(QAD.class, c66547Q9v);
        }
    }

    public GoogleWebAuthProvider(Application application, QCI qci) {
        super(application, qci);
    }
}
