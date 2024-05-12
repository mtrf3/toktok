package X;

import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9Sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237159Sl extends C25828ABs {
    public final int LJLJJI;
    public final Activity LJLJJL;
    public final OfflineModeManagerVM LJLJJLL;

    @Override // X.AG6
    public final C25847ACl LJIIIIZZ() {
        String str;
        String string;
        C237149Sk c237149Sk = EnumC237169Sm.Companion;
        int i = this.LJLJJI;
        Activity activity = this.LJLJJL;
        c237149Sk.getClass();
        String LIZ = C237149Sk.LIZ(activity, i);
        int i2 = this.LJLJJI;
        Activity activity2 = this.LJLJJL;
        EnumC237169Sm[] values = EnumC237169Sm.values();
        int length = values.length;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            EnumC237169Sm enumC237169Sm = values[i3];
            if (enumC237169Sm.getCount() == i2) {
                if (activity2 != null && (string = activity2.getString(R.string.j9k)) != null) {
                    str = Q8U.LIZIZ(new Object[]{Integer.valueOf(enumC237169Sm.getMinutes()), Integer.valueOf(enumC237169Sm.getSize())}, 2, string, "format(this, *args)");
                }
            } else {
                i3++;
            }
        }
        str = "";
        if (this.LJLJJLL.getState().LJLJJL == this.LJLJJI) {
            z = true;
        }
        return new C25847ACl(z, LIZ, null, str, new ACListenerS24S0100000_4(this, 225), 7034);
    }

    public C237159Sl(int i, ActivityC45651qj activityC45651qj, OfflineModeManagerVM managerVM) {
        o.LJIIIZ(managerVM, "managerVM");
        this.LJLJJI = i;
        this.LJLJJL = activityC45651qj;
        this.LJLJJLL = managerVM;
    }
}
