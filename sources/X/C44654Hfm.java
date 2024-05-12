package X;

import com.ss.android.ugc.aweme.property.VESettingConfigs;
import com.ss.android.ugc.aweme.property.VESynthesisSettingsCategoryItem;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44654Hfm {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        VESettingConfigs vESettingConfigs = (VESettingConfigs) i0.LJ(true, "tool_ve_setting_configs", 31744, VESettingConfigs.class, null);
        if (vESettingConfigs == null) {
            return C44753HhN.LIZ();
        }
        VESynthesisSettingsCategoryItem[] LIZ2 = C44598Hes.LIZ();
        int i = 0;
        if (LIZ2 != null && LIZ2.length != 0) {
            int length = LIZ2.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                VESynthesisSettingsCategoryItem vESynthesisSettingsCategoryItem = LIZ2[i];
                if (o.LJ(vESynthesisSettingsCategoryItem.key, vESettingConfigs.highQualityVeSynthesisSettingsKey)) {
                    String str = vESynthesisSettingsCategoryItem.value;
                    if (str != null) {
                        return str;
                    }
                } else {
                    i++;
                }
            }
        }
        return C44753HhN.LIZ();
    }

    public static String LIZIZ(boolean z) {
        if (C79234V7u.LJIIIIZZ(z)) {
            if (C79234V7u.LJIIIIZZ(true)) {
                return InterfaceC44798Hi6.LJFF.compileExternalSetting();
            }
            return C44754HhO.LIZ();
        }
        VESettingConfigs vESettingConfigs = (VESettingConfigs) i0.LJ(true, "tool_ve_setting_configs", 31744, VESettingConfigs.class, null);
        if (vESettingConfigs == null) {
            return C44754HhO.LIZ();
        }
        VESynthesisSettingsCategoryItem[] LIZ2 = C44598Hes.LIZ();
        int i = 0;
        if (LIZ2 != null && LIZ2.length != 0) {
            int length = LIZ2.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                VESynthesisSettingsCategoryItem vESynthesisSettingsCategoryItem = LIZ2[i];
                if (o.LJ(vESynthesisSettingsCategoryItem.key, vESettingConfigs.veSynthesisSettingsKey)) {
                    String str = vESynthesisSettingsCategoryItem.value;
                    if (str != null) {
                        return str;
                    }
                } else {
                    i++;
                }
            }
        }
        return C44754HhO.LIZ();
    }
}
