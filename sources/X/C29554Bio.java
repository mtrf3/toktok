package X;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import java.util.LinkedHashMap;

/* renamed from: X.Bio, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29554Bio {
    public static /* synthetic */ AbstractC73672Svk LIZ(CoHostApi coHostApi, long j, int i, String str, int i2, long j2, boolean z, long j3, long j4, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        return coHostApi.rivalsListForMultiCoHost(1, j, i, str, i2, j2, z, j3, linkedHashMap, j4, str2);
    }
}
