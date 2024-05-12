package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.633, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass633 {
    public static final int[] LIZ = {12, 64};

    public static final OSZ<Integer, Integer> LIZ() {
        int[] iArr = LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            int[] iArr2 = (int[]) SettingsManager.LJII("text_sticker_font_size_slider_value_range", int[].class);
            if (iArr2 != null) {
                iArr = iArr2;
            }
        } catch (Throwable unused) {
        }
        return new OSZ<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }
}
