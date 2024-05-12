package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* renamed from: X.E5i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C35854E5i {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IPluginService.ReinstallCheck.values().length];
        try {
            iArr[IPluginService.ReinstallCheck.REINSTALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IPluginService.ReinstallCheck.NON_REINSTALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
