package X;

import android.util.Base64OutputStream;
import com.ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QYr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class CallableC67193QYr implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        int i = 0;
        switch (this.LJLIL) {
            case 0:
                C67183QYh c67183QYh = (C67183QYh) this.LJLILLLLZI;
                synchronized (c67183QYh) {
                    C38324F2i c38324F2i = c67183QYh.LIZ.get();
                    List<AbstractC38326F2k> LIZJ = c38324F2i.LIZJ();
                    c38324F2i.LIZIZ();
                    JSONArray jSONArray = new JSONArray();
                    while (true) {
                        ArrayList arrayList = (ArrayList) LIZJ;
                        if (i < arrayList.size()) {
                            AbstractC38326F2k abstractC38326F2k = (AbstractC38326F2k) arrayList.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", abstractC38326F2k.LIZIZ());
                            jSONObject.put("dates", new JSONArray((Collection) abstractC38326F2k.LIZ()));
                            jSONArray.put(jSONObject);
                            i++;
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("heartbeats", jSONArray);
                            jSONObject2.put("version", "2");
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                                try {
                                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                    gZIPOutputStream.close();
                                    base64OutputStream.close();
                                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                }
                return byteArrayOutputStream;
            case 1:
                Object[] objArr = (Object[]) this.LJLILLLLZI;
                if (AF9.LJLIL == null) {
                    AF9.LJLIL = (FeedStatsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(FeedStatsApi.class);
                }
                return AF9.LJLIL.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
            case 2:
                return C251809uS.LIZIZ(null, (String) this.LJLILLLLZI, null, true);
            default:
                ((C138635cJ) this.LJLILLLLZI).LJIIIZ.destroy();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ CallableC67193QYr(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
