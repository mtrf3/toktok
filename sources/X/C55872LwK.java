package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS61S0100000_9;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.ArrayList;

/* renamed from: X.LwK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55872LwK implements JJ4 {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Intent LIZJ;
    public final /* synthetic */ Intent LIZLLL;
    public final /* synthetic */ Intent LJ;
    public final /* synthetic */ ArrayList LJFF;
    public final /* synthetic */ RecordConfig LJI;
    public final /* synthetic */ PushLoginActivity LJII;

    @Override // X.JJ4
    public final void LIZ() {
        if (this.LIZ != null && !TextUtils.isEmpty(this.LIZIZ)) {
            if (TextUtils.equals(this.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
                this.LIZ.putBoolean("login_jump", true);
                this.LIZ.putParcelable("push_intent", this.LIZJ);
                LoginUtilsServiceImpl.LIZ().restartApp(this.LIZ);
            } else {
                PushLoginActivity pushLoginActivity = this.LJII;
                Intent intent = this.LIZLLL;
                C78598Ut0.LJIJJ(intent, pushLoginActivity);
                pushLoginActivity.startActivity(intent);
            }
            this.LJII.finish();
            return;
        }
        if (TextUtils.isEmpty(this.LIZIZ) || this.LIZIZ.equals(((RBX) HG3.LJIILL()).getCurUserId())) {
            Intent intent2 = this.LJ;
            if (intent2 != null) {
                PushLoginActivity pushLoginActivity2 = this.LJII;
                C78598Ut0.LJIJJ(intent2, pushLoginActivity2);
                pushLoginActivity2.startActivity(intent2);
            } else {
                ArrayList arrayList = this.LJFF;
                if (arrayList != null && arrayList.size() > 1) {
                    PushLoginActivity pushLoginActivity3 = this.LJII;
                    ArrayList arrayList2 = this.LJFF;
                    pushLoginActivity3.startActivities((Intent[]) arrayList2.toArray(new Intent[arrayList2.size()]));
                }
            }
        }
        if (this.LJI != null) {
            AVExternalServiceImpl.LIZ().asyncService("PushLogin", new IDLCallbackS61S0100000_9(this, 0));
        }
        this.LJII.finish();
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        this.LJII.finish();
    }

    public C55872LwK(PushLoginActivity pushLoginActivity, Bundle bundle, String str, Intent intent, Intent intent2, Intent intent3, ArrayList arrayList, RecordConfig recordConfig) {
        this.LJII = pushLoginActivity;
        this.LIZ = bundle;
        this.LIZIZ = str;
        this.LIZJ = intent;
        this.LIZLLL = intent2;
        this.LJ = intent3;
        this.LJFF = arrayList;
        this.LJI = recordConfig;
    }
}
