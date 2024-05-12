package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IKZ implements InterfaceC79472VGy {
    public static final IAwemeService LIZ = AwemeService.LIZ();

    @Override // X.InterfaceC79472VGy
    public final String key() {
        return "qprf";
    }

    @Override // X.InterfaceC79472VGy
    public final String LIZ(String str) {
        Video video;
        IAwemeService iAwemeService = LIZ;
        if (iAwemeService == null) {
            return "-1";
        }
        Aweme i6 = iAwemeService.i6(str);
        StringBuilder LIZ2 = X1D.LIZ();
        float f = 1.0f;
        if (i6 != null && (video = i6.getVideo()) != null) {
            String meta = video.getMeta();
            if (!TextUtils.isEmpty(meta)) {
                try {
                    JSONObject jSONObject = new JSONObject(meta);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("");
                    LIZ3.append(1.0f);
                    String optString = jSONObject.optString("qprf", X1D.LIZIZ(LIZ3));
                    if (!TextUtils.isEmpty(optString)) {
                        f = CastFloatProtector.parseFloat(optString);
                    }
                } catch (Exception unused) {
                }
            }
        }
        LIZ2.append(f);
        LIZ2.append("");
        return X1D.LIZIZ(LIZ2);
    }
}
