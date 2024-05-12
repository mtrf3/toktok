package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Mya, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58560Mya implements InterfaceC58548MyO<OSI<Aweme, JSONObject, String, String>> {
    public final Handler LIZ;

    public C58560Mya(Handler handler) {
        this.LIZ = handler;
    }

    @Override // X.InterfaceC58548MyO
    public final void invoke(OSI<Aweme, JSONObject, String, String> osi) {
        int i;
        OSI<Aweme, JSONObject, String, String> osi2 = osi;
        JSONObject jSONObject = osi2.LIZIZ;
        String str = osi2.LIZJ;
        String str2 = osi2.LIZLLL;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("tag");
        if (o.LJ(optString, "draw_ad")) {
            if (o.LJ(str, "break") || o.LJ(str, "over")) {
                long optLong = jSONObject2.optLong("duration");
                long optLong2 = jSONObject2.optLong("video_length");
                String optString2 = jSONObject2.optString("ad_extra_data");
                String optString3 = jSONObject2.optString("log_extra");
                String optString4 = jSONObject2.optString("group_id");
                long optLong3 = jSONObject2.optLong("percent");
                if (o.LJ(str, "break")) {
                    i = 1;
                } else if (o.LJ(str, "over")) {
                    i = 2;
                } else {
                    i = 0;
                }
                Iterator<InterfaceC58572Mym> it = NQS.LIZ.iterator();
                while (it.hasNext()) {
                    this.LIZ.postAtFrontOfQueue(new RunnableC58571Myl(it.next(), optLong, optLong2, optString, str2, optString3, optString4, optString2, i, optLong3));
                }
            }
        }
    }
}
