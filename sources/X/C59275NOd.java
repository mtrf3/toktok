package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.NOd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59275NOd {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String url) {
        o.LJIIIZ(url, "url");
        if (C38354F3m.LJ(url)) {
            return false;
        }
        String lowerCase = url.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        if (!ujb.o.LJJJLIIL(lowerCase, "http://", false)) {
            String lowerCase2 = url.toLowerCase();
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (!ujb.o.LJJJLIIL(lowerCase2, "https://", false)) {
                return false;
            }
        }
        return true;
    }

    public static C59289NOr LIZIZ(Context context, Intent intent) {
        if (context == null) {
            return new C59289NOr(false, "context is null");
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            C16880lQ.LIZJ(context, intent);
            return new C59289NOr(true);
        } catch (ActivityNotFoundException e) {
            C36922EeM.LJ("ad start activity failed");
            C36922EeM.LJFF(e);
            return new C59289NOr(false, "ad start activity failed");
        } catch (SecurityException e2) {
            C78983UzD.LJIIZILJ(e2);
            C36922EeM.LJ("ad start activity failed");
            C36922EeM.LJFF(e2);
            return new C59289NOr(false, "ad start activity failed");
        }
    }
}
