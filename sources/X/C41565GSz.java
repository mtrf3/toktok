package X;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GSz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41565GSz {
    public static ColorStateList LIZ(Context context) {
        int i;
        Integer LJI;
        Integer LJI2;
        int i2 = 0;
        int[][] iArr = {new int[]{R.attr.state_enabled}, new int[0]};
        int[] iArr2 = new int[2];
        if (context != null && (LJI2 = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.eb, context)) != null) {
            i = LJI2.intValue();
        } else {
            i = 0;
        }
        iArr2[0] = i;
        if (context != null && (LJI = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.gp, context)) != null) {
            i2 = LJI.intValue();
        }
        iArr2[1] = i2;
        return new ColorStateList(iArr, iArr2);
    }

    public static boolean LIZIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        int intExtra = intent.getIntExtra("progress", -1);
        if (intExtra >= 0 && intExtra < 100) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(ActivityC45651qj activityC45651qj) {
        int i = 0;
        if (activityC45651qj == null) {
            return false;
        }
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        int i2 = com.zhiliaoapp.musically.R.raw.icon_3pt_exclamation_mark_circle;
        Integer LJI = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.eb, activityC45651qj);
        if (LJI != null) {
            i = LJI.intValue();
        }
        c26227ARb.LJIIIZ = new C244659iv(activityC45651qj, i2, Integer.valueOf(i), 8, 0);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = com.zhiliaoapp.musically.R.raw.icon_3pt_exclamation_mark_circle;
        c2068389v.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.eb);
        C44729Hgz.LJJIJ(c26227ARb, c2068389v.LIZ(activityC45651qj));
        c26227ARb.LJFF(activityC45651qj.getString(com.zhiliaoapp.musically.R.string.t7b));
        c26227ARb.LIZIZ(activityC45651qj.getString(com.zhiliaoapp.musically.R.string.t7_));
        UC0.LIZJ(c26227ARb, new AqS173S0100000_7(activityC45651qj, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        c26227ARb.LJI().LIZLLL();
        return true;
    }
}
