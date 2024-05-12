package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Ke1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52189Ke1 {
    public static final String[] LIZ = new String[0];

    public static String[] LIZ() {
        String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("filter_keyword_blocked_words", String[].class, LIZ);
        if (strArr == null) {
            return new String[0];
        }
        return strArr;
    }
}
