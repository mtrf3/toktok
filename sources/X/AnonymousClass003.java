package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.003, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass003 {
    public final InterfaceC10090aT LIZ;
    public final ComponentName LIZIZ;

    public final AnonymousClass008 LIZIZ(C58675N1b c58675N1b) {
        BinderC39601gy binderC39601gy = new BinderC39601gy(c58675N1b);
        if (this.LIZ.LLLLLJLJLL(binderC39601gy)) {
            return new AnonymousClass008(this.LIZ, binderC39601gy, this.LIZIZ);
        }
        return null;
    }

    public AnonymousClass003(InterfaceC10090aT interfaceC10090aT, ComponentName componentName) {
        this.LIZ = interfaceC10090aT;
        this.LIZIZ = componentName;
    }

    public static boolean LIZ(Context context, String str, AnonymousClass007 anonymousClass007) {
        anonymousClass007.mApplicationContext = C16880lQ.LLLLL(context);
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return C16880lQ.LLLJL(context, intent, anonymousClass007, 33);
    }
}
