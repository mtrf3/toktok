package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* renamed from: X.DzK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C35674DzK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IPluginService.ShowType.ApplyAction.values().length];
        try {
            iArr[IPluginService.ShowType.ApplyAction.ENABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IPluginService.ShowType.ApplyAction.ENABLE_REALTIME_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
