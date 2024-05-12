package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141355gh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String tabName, boolean z) {
        int i2;
        o.LJIIIZ(tabName, "tabName");
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i));
        c6bk.LIZ.put("tab_name", tabName);
        C43882HKc.LIZLLL(i2, "sound_effect_list", c6bk.LJ(), true);
    }

    public static void LIZJ(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i2));
        c6bk.LIZ.put("type", Integer.valueOf(i));
        C43882HKc.LIZLLL(i3, "sound_effect_tab", c6bk.LJ(), true);
    }

    public static void LIZ(String soundId, Integer num, boolean z, String str) {
        int i;
        o.LJIIIZ(soundId, "soundId");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C6BK c6bk = new C6BK();
        if (num != null) {
            i2 = num.intValue();
        }
        c6bk.LIZ.put("error_code", Integer.valueOf(i2));
        c6bk.LIZ.put("sid", soundId);
        if (str == null) {
            str = "";
        }
        c6bk.LIZ.put("error_msg", str);
        C43882HKc.LIZLLL(i, "sound_effect_download", c6bk.LJ(), true);
    }
}
