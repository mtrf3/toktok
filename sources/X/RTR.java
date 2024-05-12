package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import java.util.List;

/* loaded from: classes13.dex */
public final class RTR {
    public final String LIZ;
    public final String LIZIZ;
    public final List<ProfileNaviFeatureDataModel> LIZJ;

    public final int LIZ() {
        try {
            return CastIntegerProtector.parseInt(this.LIZ);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public RTR(String str, String str2, List<ProfileNaviFeatureDataModel> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
