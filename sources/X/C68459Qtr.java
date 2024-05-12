package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: X.Qtr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68459Qtr {
    public static Context LIZ;
    public static InterfaceC68816Qzc LIZIZ;

    static {
        C16880lQ.LJLLJ(C68459Qtr.class);
        LIZ = null;
    }

    public static InterfaceC68816Qzc LIZ(Context context) {
        InterfaceC68816Qzc c68807QzT;
        QH7.LJIIIIZZ(context);
        InterfaceC68816Qzc interfaceC68816Qzc = LIZIZ;
        if (interfaceC68816Qzc == null) {
            int LIZIZ2 = C67264Qaa.LIZIZ(context, 13400000);
            if (LIZIZ2 == 0) {
                ClassLoader classLoader = LIZIZ(context).getClassLoader();
                try {
                    QH7.LJIIIIZZ(classLoader);
                    Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
                    try {
                        IBinder iBinder = (IBinder) loadClass.newInstance();
                        if (iBinder == null) {
                            c68807QzT = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                            if (queryLocalInterface instanceof InterfaceC68816Qzc) {
                                c68807QzT = (InterfaceC68816Qzc) queryLocalInterface;
                            } else {
                                c68807QzT = new C68807QzT(iBinder);
                            }
                        }
                        LIZIZ = c68807QzT;
                        try {
                            Context LIZIZ3 = LIZIZ(context);
                            LIZIZ3.getClass();
                            c68807QzT.LLJJ(new BinderC68153Qov(LIZIZ3.getResources()));
                            return LIZIZ;
                        } catch (RemoteException e) {
                            throw new C68463Qtv(e);
                        }
                    } catch (IllegalAccessException unused) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
                    } catch (InstantiationException unused2) {
                        throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new PSW(LIZIZ2);
        }
        return interfaceC68816Qzc;
    }

    public static Context LIZIZ(Context context) {
        Context context2;
        Context context3 = LIZ;
        if (context3 == null) {
            C16880lQ.LLLLL(context);
            try {
                context2 = DynamiteModule.LIZLLL(context, DynamiteModule.LIZIZ, "com.google.android.gms.maps_dynamite").LIZ;
            } catch (Exception unused) {
                context2 = null;
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            context2 = DynamiteModule.LIZLLL(context, DynamiteModule.LIZIZ, "com.google.android.gms.maps_dynamite").LIZ;
                        } catch (Exception unused2) {
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                }
            }
            LIZ = context2;
            return context2;
        }
        return context3;
    }
}
