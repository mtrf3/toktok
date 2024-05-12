package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EdE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36852EdE implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public final void LIZ() {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_type", this.LJLIL);
            try {
                str = EF7.LIZIZ().getResources().getResourceEntryName(this.LJLILLLLZI);
            } catch (Throwable unused) {
                str = null;
            }
            jSONObject.put("layout_name", str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("0x");
            LIZ.append(Integer.toHexString(this.LJLILLLLZI));
            jSONObject.put("layout_id", X1D.LIZIZ(LIZ));
            jSONObject.put("thread_name", this.LJLJI);
            Context context = this.LJLJJI;
            if (context != null) {
                jSONObject.put("ctx_name", C16880lQ.LJLLJ(context.getClass()));
            }
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                str2 = topActivity.getLocalClassName().split("\\.")[r1.length - 1];
                jSONObject.put("activity_name", str2);
            } else {
                str2 = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", this.LJLJJL);
            jSONObject2.put("app_time", this.LJLJJLL);
            if (str2 != null) {
                if ((str2.equals("VideoRecordNewActivity") || str2.equals("SAAActivity")) && str != null && str.startsWith("ttlive")) {
                    LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
                    if (C62046OWs.LJ("broadcast_side_view_inflate", 0.2d)) {
                        C09900aA.LJI("broadcast_side_view_inflate", jSONObject, jSONObject2, null);
                        return;
                    }
                    return;
                }
                Iterator<String> it = C35825E4f.LIZ.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str2)) {
                        LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
                        if (C62046OWs.LJ("broadcast_side_view_inflate", 0.2d)) {
                            C09900aA.LJI("broadcast_side_view_inflate", jSONObject, jSONObject2, null);
                            return;
                        }
                        return;
                    }
                }
            }
            C09900aA.LJI("view_inflate", jSONObject, jSONObject2, null);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC36852EdE(String str, int i, String str2, Context context, long j, long j2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = context;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
    }
}
