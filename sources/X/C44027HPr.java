package X;

import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.LinkedHashMap;

/* renamed from: X.HPr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44027HPr {
    public static final java.util.Map<String, EffectListResponse> LIZ = new LinkedHashMap();

    public static EffectListResponse LIZ(String str) {
        if (str != null) {
            return (EffectListResponse) ((LinkedHashMap) LIZ).get(str);
        }
        return null;
    }
}
