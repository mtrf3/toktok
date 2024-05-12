package X;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: X.aSO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93532aSO {
    public static PendingIntent LIZ(Context context) {
        try {
            Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                return pendingIntent;
            }
            String string = call.getString("exceptionType", "");
            if (string.isEmpty()) {
                return null;
            }
            if (!string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                    Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                    String string2 = call.getString("exceptionText", null);
                    if (string2 != null) {
                        throw ((RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2));
                    }
                    throw ((RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]));
                }
                throw new UnavailableUserDeclinedInstallationException();
            }
            throw new UnavailableDeviceNotCompatibleException();
        } catch (ReflectiveOperationException | RuntimeException unused) {
            return null;
        }
    }
}
