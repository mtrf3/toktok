package X;

import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;

/* renamed from: X.Glo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42480Glo {
    public static final /* synthetic */ int LIZ = 0;

    public static InteractiveBrandedEffectInfo LIZ(TimeSpeedModelExtension timeSpeedModelExtension) {
        try {
            return (InteractiveBrandedEffectInfo) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJII((String) timeSpeedModelExtension.getFromRecordExtras("extra_key_ibe_info"), new C42481Glp().getType());
        } catch (Exception unused) {
            return null;
        }
    }
}
