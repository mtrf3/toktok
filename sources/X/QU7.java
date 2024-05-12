package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sync.model.SubscribeResponse;
import com.bytedance.sync.model.Topic;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QU7 implements QVM {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJI;
    public final C62822Ol8 LJLIL;
    public final C67040QSu LJLILLLLZI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(QU7.class), "mGson", "getMGson()Lcom/google/gson/Gson;");
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    public final Gson LIZLLL() {
        return (Gson) this.LJLIL.getValue();
    }

    public final android.net.Uri LJJJLZIJ() {
        QPA LIZ = QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…:class.java\n            )");
        android.net.Uri build = UriProtector.parse(this.LJLILLLLZI.LJI).buildUpon().appendPath("v2/pipeline").appendQueryParameter("device_id", ((InterfaceC67059QTn) LIZ).LIZJ().LIZ).appendQueryParameter("aid", this.LJLILLLLZI.LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT).build();
        o.LJFF(build, "Uri.parse(mConfiguration…(\"platform\", \"0\").build()");
        return build;
    }

    public QU7(C67040QSu mConfiguration) {
        o.LJIIJ(mConfiguration, "mConfiguration");
        this.LJLILLLLZI = mConfiguration;
        this.LJLIL = C221108m2.LIZIZ(QUF.LJLIL);
    }

    @Override // X.QVM
    public final SubscribeResponse LJJIII(Topic topic) {
        o.LJIIJ(topic, "topic");
        QPA LIZ = QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…:class.java\n            )");
        android.net.Uri build = UriProtector.parse(this.LJLILLLLZI.LJI).buildUpon().appendPath("v2/subscribe").appendQueryParameter("device_id", ((InterfaceC67059QTn) LIZ).LIZJ().LIZ).appendQueryParameter("aid", this.LJLILLLLZI.LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT).build();
        o.LJFF(build, "Uri.parse(mConfiguration…(\"platform\", \"0\").build()");
        String json = GsonProtectorUtils.toJson(LIZLLL(), topic);
        String uri = build.toString();
        o.LJFF(json, "json");
        byte[] bytes = json.getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        return (SubscribeResponse) GsonProtectorUtils.fromJson(LIZLLL(), LJJLIIJ(uri, bytes, "application/json; charset=utf-8", true), SubscribeResponse.class);
    }

    @Override // X.QVM
    public final SubscribeResponse LJJJIL(Topic topic) {
        o.LJIIJ(topic, "topic");
        QPA LIZ = QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…:class.java\n            )");
        android.net.Uri build = UriProtector.parse(this.LJLILLLLZI.LJI).buildUpon().appendPath("v2/unsubscribe").appendQueryParameter("device_id", ((InterfaceC67059QTn) LIZ).LIZJ().LIZ).appendQueryParameter("aid", this.LJLILLLLZI.LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT).build();
        o.LJFF(build, "Uri.parse(mConfiguration…(\"platform\", \"0\").build()");
        String json = GsonProtectorUtils.toJson(LIZLLL(), topic);
        String uri = build.toString();
        o.LJFF(json, "json");
        byte[] bytes = json.getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        return (SubscribeResponse) GsonProtectorUtils.fromJson(LIZLLL(), LJJLIIJ(uri, bytes, "application/json; charset=utf-8", true), SubscribeResponse.class);
    }

    @Override // X.QVM
    public final C67101QVd LJJLIIIJL(C67101QVd msg) {
        o.LJIIJ(msg, "msg");
        try {
            QUG qug = (QUG) QPG.LIZ(QUG.class);
            byte[] LJJJI = qug.LJJJI(msg);
            if (LJJJI != null) {
                return qug.LJJIJLIJ(Base64.decode(LJJLIIJ(LJJJLZIJ().toString(), LJJJI, "application/octet-stream", false), 0));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String LJJLIIJ(String str, byte[] bArr, String str2, boolean z) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!C38354F3m.LJ(str2)) {
            linkedHashMap.put("Content-Type", str2);
        }
        QKY qky = new QKY();
        if (z) {
            str3 = "t=1";
        } else {
            str3 = "t=0";
        }
        try {
            linkedHashMap.put("x-tt-request-tag", str3);
        } catch (Throwable unused) {
        }
        return AbstractC66805QJt.LIZ.LJ(str, bArr, linkedHashMap, qky);
    }
}
