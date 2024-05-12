package X;

import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.N3g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC58732N3g<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AwemePlayFunModel LJLILLLLZI;
    public final /* synthetic */ AwemeRawAd LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public CallableC58732N3g(boolean z, AwemePlayFunModel awemePlayFunModel, AwemeRawAd awemeRawAd, Aweme aweme, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = awemePlayFunModel;
        this.LJLJI = awemeRawAd;
        this.LJLJJI = aweme;
        this.LJLJJL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        List<String> urlList;
        try {
            if (this.LJLIL) {
                i = 0;
            } else {
                i = 1;
            }
            JSONObject jSONObject = new JSONObject();
            UrlModel imageInfo = this.LJLILLLLZI.getImageInfo();
            if (imageInfo != null && (urlList = imageInfo.getUrlList()) != null && !urlList.isEmpty()) {
                jSONObject.put("material_url", ListProtector.get(urlList, 0));
            }
            Long creativeId = this.LJLJI.getCreativeId();
            o.LJIIIIZZ(creativeId, "rawAd.creativeId");
            jSONObject.put("creative_id", creativeId.longValue());
            jSONObject.put("log_extra", this.LJLJI.getLogExtra());
            jSONObject.put("aweme_id", this.LJLJJI.getAid());
            IMonitorDepend LIZJ = C59835Ne3.LIZJ();
            if (LIZJ == null) {
                return null;
            }
            LIZJ.monitorStatusRate(this.LJLJJL, i, jSONObject);
            return C76800UCe.LIZ;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return C76800UCe.LIZ;
        }
    }
}
