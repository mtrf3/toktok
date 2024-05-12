package Y;

import X.C221018lt;
import X.FUA;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ACallableS4S0211000_3 implements Callable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS4S0211000_3 aCallableS4S0211000_3) {
        if (!aCallableS4S0211000_3.z2 || aCallableS4S0211000_3.i3 < 6 || ((ImageUrlModel) aCallableS4S0211000_3.l0).LIZ() || ((Video) aCallableS4S0211000_3.l1).getPlayAddr() == null || TextUtils.isEmpty(((Video) aCallableS4S0211000_3.l1).getPlayAddr().getUri())) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("frames", aCallableS4S0211000_3.i3);
            jSONObject.put("vid", ((Video) aCallableS4S0211000_3.l1).getPlayAddr().getUri());
            jSONObject.put("url", ListProtector.get(((ImageUrlModel) aCallableS4S0211000_3.l0).mUrls, 0));
            FUA.LIZJ("aweme_animated_image_frames_error", jSONObject);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Object call$1(ACallableS4S0211000_3 aCallableS4S0211000_3) {
        if (!aCallableS4S0211000_3.z2 || aCallableS4S0211000_3.i3 < 6 || ((ImageUrlModel) aCallableS4S0211000_3.l0).LIZ() || ((Video) aCallableS4S0211000_3.l1).getPlayAddr() == null || TextUtils.isEmpty(((Video) aCallableS4S0211000_3.l1).getPlayAddr().getUri())) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("frames", aCallableS4S0211000_3.i3);
            jSONObject.put("vid", ((Video) aCallableS4S0211000_3.l1).getPlayAddr().getUri());
            jSONObject.put("url", ListProtector.get(((ImageUrlModel) aCallableS4S0211000_3.l0).mUrls, 0));
            FUA.LIZJ("aweme_animated_image_frames_error", jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("animated frame error: ");
            LIZ.append(jSONObject);
            C221018lt.LJFF("DynamicCoverHelper", X1D.LIZIZ(LIZ));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public ACallableS4S0211000_3(boolean z, int i, ImageUrlModel imageUrlModel, Video video, int i2) {
        this.$t = i2;
        this.z2 = z;
        this.i3 = i;
        this.l0 = imageUrlModel;
        this.l1 = video;
    }
}
