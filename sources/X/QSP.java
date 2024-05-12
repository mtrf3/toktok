package X;

import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QSP extends LifecycleCallbackAdapter {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;

    @Override // com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1791471i.LIZ.unregisterActivityLifecycleCallbacks(this);
        C38816FLg.LIZJ(new ARunnableS47S0100000_11(this, 58));
    }

    public QSP(long j, boolean z, String str, String str2, JSONObject jSONObject) {
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = jSONObject;
    }
}
