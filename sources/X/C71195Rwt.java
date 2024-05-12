package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rwt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71195Rwt {
    public static long LJIIIZ;
    public static final /* synthetic */ int LJIIJ = 0;
    public WeakReference<AbstractC71187Rwl> LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LIZLLL = true;
    public String LJIIIIZZ = "other";

    public final void LIZ() {
        AbstractC71187Rwl abstractC71187Rwl;
        WeakReference<AbstractC71187Rwl> weakReference = this.LIZ;
        if (weakReference != null && (abstractC71187Rwl = weakReference.get()) != null && this.LIZIZ != 0) {
            abstractC71187Rwl.LJLL.LJII("quit_type", this.LJIIIIZZ, false);
            abstractC71187Rwl.LJLL.LJI(System.currentTimeMillis() - this.LIZIZ, "stay_time");
            abstractC71187Rwl.LJIJI().LJI();
        }
        this.LIZIZ = 0L;
    }

    public final void LIZIZ() {
        AbstractC71187Rwl abstractC71187Rwl;
        this.LIZIZ = System.currentTimeMillis();
        WeakReference<AbstractC71187Rwl> weakReference = this.LIZ;
        if (weakReference != null && (abstractC71187Rwl = weakReference.get()) != null && !this.LJFF) {
            abstractC71187Rwl.LJIJI().LJ();
        }
        this.LJFF = true;
    }

    public final void LIZJ(String productId, String str, String imageUrl, String str2, String str3, long j, String str4, String str5, String str6, long j2, boolean z, boolean z2, String str7) {
        long currentTimeMillis;
        long j3;
        String str8;
        int i;
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(imageUrl, "imageUrl");
        if (this.LJI) {
            currentTimeMillis = System.currentTimeMillis();
            j3 = this.LJII;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j3 = LJIIIZ;
        }
        long j4 = currentTimeMillis - j3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", productId);
            jSONObject.put("room_id", str);
            jSONObject.put("image_url", imageUrl);
            jSONObject.put("message_id", str2);
            if (this.LJI) {
                str3 = "prefetch";
            }
            jSONObject.put("from", str3);
            jSONObject.put("show_cost", j);
            jSONObject.put("page_name", str4);
            jSONObject.put("duration", j2);
            jSONObject.put("author_id", str5);
            jSONObject.put("load_duration", j);
            if (z2) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str8 = "1";
            }
            jSONObject.put("is_from_created", str8);
            jSONObject.put("is_success", str6);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("cache_hit", i);
            jSONObject.put("img_opt_model", 1);
            jSONObject.put("total_cost", j4);
            jSONObject.put("is_repin", this.LJI ? 1 : 0);
            jSONObject.put("live_role", str7);
            C48658J7u.LIZIZ("rd_tiktokec_pin_image_show", jSONObject);
        } catch (Exception unused) {
        }
    }
}
