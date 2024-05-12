package Y;

import X.C38995FSd;
import X.C39608Fga;
import X.InterfaceC64592gB;
import X.Q8V;
import android.os.Build;
import com.ss.android.common.applog.AppLog;
import defpackage.e1;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public class AfS38S0000000_6 implements InterfaceC64592gB {
    public final int $t;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS38S0000000_6(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS38S0000000_6 afS38S0000000_6, Object obj) {
        Field field;
        if (!((Boolean) obj).booleanValue() || Build.VERSION.SDK_INT >= 23 || (field = C39608Fga.LIZ) == null) {
            return;
        }
        try {
            Object obj2 = field.get(null);
            if (obj2 == null) {
                return;
            }
            int length = Array.getLength(obj2);
            for (int i = 0; i < length; i++) {
                Array.set(obj2, i, null);
            }
        } catch (Exception unused) {
        }
    }

    public static final void accept$1(AfS38S0000000_6 afS38S0000000_6, Object obj) {
        C38995FSd.LIZJ().execute(new Q8V(5, obj));
    }

    public static final void accept$2(AfS38S0000000_6 afS38S0000000_6, Object obj) {
        if (((Boolean) obj).booleanValue() && e1.LIZ(31744, "applog_flush_onBackground_enable", true, false)) {
            AppLog.flush();
        }
    }
}
