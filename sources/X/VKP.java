package X;

import com.ss.android.vesdk.runtime.VEPublishSettingManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class VKP {
    public static final VKP LJLILLLLZI;
    public static final /* synthetic */ VKP[] LJLJI;
    public final VEPublishSettingManager LJLIL = new VEPublishSettingManager();

    static {
        VKP vkp = new VKP();
        LJLILLLLZI = vkp;
        LJLJI = new VKP[]{vkp};
    }

    public static VKP[] values() {
        return (VKP[]) LJLJI.clone();
    }

    public static VKP valueOf(String str) {
        return (VKP) V0N.LJJJ(VKP.class, str);
    }
}
