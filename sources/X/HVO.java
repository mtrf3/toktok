package X;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HVO {
    public static final java.util.Map<String, String> LIZ = C113554cx.LJJL(new OSZ("android.permission.RECORD_AUDIO", "microphone"), new OSZ("android.permission.CAMERA", "camera"), new OSZ("android.permission.WRITE_EXTERNAL_STORAGE", "photo"));

    public static final java.util.Map<String, String> LIZ(String[] strArr, ActivityC45651qj activityC45651qj, Boolean bool) {
        String str;
        Bundle LIZLLL = C60903NvH.LJIIJJI().LJIL().LIZLLL(activityC45651qj);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        String str2 = null;
        if (LIZLLL != null) {
            str = LIZLLL.getString("shoot_way");
        } else {
            str = null;
        }
        c145995oB.LJI("shoot_way", str);
        if (LIZLLL != null) {
            str2 = LIZLLL.getString("creation_id");
        }
        c145995oB.LJI("creation_id", str2);
        C78880UxY.LJIJ(c145995oB);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str3 : strArr) {
            arrayList.add(LIZ.get(str3));
        }
        c145995oB.LJI("type", ORZ.LLD(arrayList, ",", null, null, null, 62));
        if (bool != null) {
            bool.booleanValue();
            c145995oB.LIZ(bool.booleanValue() ? 1 : 0, "status");
        }
        java.util.Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "builder.builder()");
        return map;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final void LIZJ(String[] strArr, ActivityC45651qj activity, String fromPage) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fromPage, "fromPage");
        for (String str : strArr) {
            FMX.LJIIL("asking_permission_show", C113554cx.LJJLIIIJJI(LIZ(new String[]{str}, activity, null), new OSZ("from_page", fromPage)));
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final void LIZLLL(String[] strArr, ActivityC45651qj activity, String fromPage) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fromPage, "fromPage");
        FMX.LJIIL("go_to_settings_show", C113554cx.LJJLIIIJJI(LIZ(strArr, activity, null), new OSZ("from_page", fromPage)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(String[] strArr, int[] iArr, ActivityC45651qj activity, String fromPage) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fromPage, "fromPage");
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            if (i2 <= iArr.length) {
                if (iArr[i2] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new OSZ(str, Boolean.valueOf(z)));
            }
            i++;
            i2 = i3;
        }
        Object[] array = arrayList.toArray(new OSZ[0]);
        if (array == null) {
            return;
        }
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(array);
        while (LJJIIJZLJL.hasNext()) {
            OSZ osz = (OSZ) LJJIIJZLJL.next();
            FMX.LJIIL("asking_permission_action", C113554cx.LJJLIIIJJI(LIZ(new String[]{osz.getFirst()}, activity, (Boolean) osz.getSecond()), new OSZ("from_page", fromPage)));
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final void LJ(String[] strArr, ActivityC45651qj activity, boolean z, String fromPage) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fromPage, "fromPage");
        FMX.LJIIL("go_to_settings_action", C113554cx.LJJLIIIJJI(LIZ(strArr, activity, Boolean.valueOf(z)), new OSZ("from_page", fromPage)));
    }
}
