package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.EeR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36927EeR implements C16V {
    public final Context LIZ;

    public C36927EeR(Context context) {
        this.LIZ = context;
    }

    @Override // X.C16V
    public final C16U LIZ(C263211o c263211o) {
        Object obj;
        String str;
        Context context = this.LIZ;
        synchronized (C36926EeQ.class) {
            if (!C36926EeQ.LJIILJJIL) {
                if (C36926EeQ.LJIIJ == 0) {
                    C36507EUl<Integer> c36507EUl = C36926EeQ.LJIILL;
                    Object[] objArr = new Object[0];
                    c36507EUl.getClass();
                    try {
                        obj = C36507EUl.LIZ(c36507EUl.LIZ, objArr);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    Integer num = (Integer) obj;
                    if (num != null) {
                        C36926EeQ.LJIIJ = num.intValue();
                    }
                }
                try {
                    C16880lQ.LLIIIZ(context);
                } catch (Exception unused2) {
                }
                C36926EeQ.LIZ(context);
                C36926EeQ.LIZJ(context);
                C36926EeQ.LIZIZ(context);
                C36926EeQ.LJI(context);
                C36926EeQ.LJIIIZ = context.getPackageName();
                C36926EeQ.LJIILJJIL = true;
            }
        }
        C16U c16u = c263211o.LIZJ;
        String str2 = c16u.LIZIZ;
        if (!TextUtils.isEmpty(str2)) {
            str = (String) new C0F3(str2, c16u.LIZJ).LIZ;
        } else {
            str = (String) new C0F3(c16u.LIZ).LIZ;
        }
        c16u.LIZ = str;
        return c263211o.LIZ(c16u);
    }
}
