package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: X.Zby, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90282Zby {
    public static final C90469Zez LIZ = new C90469Zez("CastDynamiteModule");

    public static InterfaceC90294ZcA LIZ(Context context) {
        try {
            IBinder LIZJ = DynamiteModule.LIZLLL(context, DynamiteModule.LIZIZ, "com.google.android.gms.cast.framework.dynamite").LIZJ("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (LIZJ != null) {
                IInterface queryLocalInterface = LIZJ.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                if (queryLocalInterface instanceof InterfaceC90294ZcA) {
                    return (InterfaceC90294ZcA) queryLocalInterface;
                }
                return new C90707Zip(LIZJ);
            }
            return null;
        } catch (C68460Qts e) {
            throw new C90113ZYf(e);
        }
    }
}
