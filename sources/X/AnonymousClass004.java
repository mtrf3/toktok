package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: X.004, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass004 {
    public final Intent LIZ;
    public final AnonymousClass000 LIZIZ;
    public Bundle LIZJ;
    public final boolean LIZLLL;

    public final AnonymousClass005 LIZ() {
        if (!this.LIZ.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            C021406o.LIZIZ(bundle, "android.support.customtabs.extra.SESSION", null);
            this.LIZ.putExtras(bundle);
        }
        this.LIZ.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.LIZLLL);
        Intent intent = this.LIZ;
        AnonymousClass000 anonymousClass000 = this.LIZIZ;
        anonymousClass000.getClass();
        Integer num = anonymousClass000.LIZ;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        this.LIZ.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new AnonymousClass005(this.LIZ, this.LIZJ);
    }

    public AnonymousClass004() {
        this.LIZ = new Intent("android.intent.action.VIEW");
        this.LIZIZ = new AnonymousClass000();
        this.LIZLLL = true;
    }

    public AnonymousClass004(AnonymousClass008 anonymousClass008) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.LIZ = intent;
        this.LIZIZ = new AnonymousClass000();
        this.LIZLLL = true;
        if (anonymousClass008 != null) {
            intent.setPackage(anonymousClass008.LIZJ.getPackageName());
            IBinder asBinder = anonymousClass008.LIZIZ.asBinder();
            PendingIntent pendingIntent = anonymousClass008.LIZLLL;
            Bundle bundle = new Bundle();
            C021406o.LIZIZ(bundle, "android.support.customtabs.extra.SESSION", asBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
