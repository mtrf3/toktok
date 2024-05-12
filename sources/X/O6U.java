package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.ss.android.ugc.aweme.live.Live;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class O6U extends ActivityC86117Xqz {
    public int LLFII() {
        return -1;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        ArrayList arrayList = new ArrayList();
        JSONObject LIZ = AnonymousClass097.LIZ(arrayList, this);
        try {
            super.onResume();
            IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
            if (iHostAction != null) {
                iHostAction.setCurrentPage(LLFII());
            }
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    String LJLLILLLL = C16880lQ.LJLLILLLL(fragment.getClass());
                    if (LJLLILLLL == null) {
                        LJLLILLLL = "";
                    }
                    jSONObject.put(LJLLILLLL, C48697J9h.LIZIZ(fragment.getView()));
                }
            } catch (Exception e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get fragment null view has exception, e:");
                LIZ2.append(e2);
                C0NB.LJ("ttlive_exception", X1D.LIZIZ(LIZ2));
                LIZ.put("exception", e2.getMessage());
            }
            LIZ.put("fragments", jSONObject);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("fragments extra info: ");
            LIZ3.append(LIZ);
            e.addSuppressed(new Exception(X1D.LIZIZ(LIZ3)));
            throw e;
        }
    }

    public final void LLFZ() {
        List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
        if (!LJJJJLI.isEmpty()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            Iterator<Fragment> it = LJJJJLI.iterator();
            while (it.hasNext()) {
                LIZ.LJJI(it.next());
            }
            LIZ.LJII();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        super.onPause();
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(-1);
        }
    }

    static {
        Live.getService();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C20990s3.LIZJ().feedMotionEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(C259710f.LIZ.LJFF(this), false);
        C85999Xp5.LJFF(EF7.LIZIZ());
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(256);
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        window.setNavigationBarColor(-16777216);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
