package X;

import com.bytedance.keva.Keva;

/* renamed from: X.2R8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2R8 {
    public static boolean LIZ() {
        if (!((Boolean) C2R7.LIZ.getValue()).booleanValue() || !((Boolean) C58202Qe.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!C54947LhP.LJLJLJ) {
            C54947LhP.LJLJLJ = Keva.getRepo("tt_story_viewer_list_popup").getBoolean("key_has_show_viewer_list_popup", false);
        }
        return !C54947LhP.LJLJLJ;
    }
}
