package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.aaC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94016aaC {
    public Context LIZ;
    public ILoadedInstanceCreator LIZIZ;
    public final C94017aaD LIZJ;

    public C94016aaC(C94017aaD c94017aaD) {
        this.LIZJ = c94017aaD;
    }

    public static IBinder LIZJ(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
        }
    }

    public final synchronized ILoadedInstanceCreator LIZ(Context context) {
        ILoadedInstanceCreator c94402agQ;
        if (this.LIZIZ == null) {
            IBinder LIZJ = LIZJ(LIZIZ(context).getClassLoader());
            if (LIZJ == null) {
                c94402agQ = null;
            } else {
                IInterface queryLocalInterface = LIZJ.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                    c94402agQ = (ILoadedInstanceCreator) queryLocalInterface;
                } else {
                    c94402agQ = new C94402agQ(LIZJ);
                }
            }
            this.LIZIZ = c94402agQ;
        }
        return this.LIZIZ;
    }

    public final synchronized Context LIZIZ(Context context) {
        if (this.LIZ == null) {
            try {
                this.LIZ = context.createPackageContext(this.LIZJ.LIZ, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C94015aaB();
            }
        }
        return this.LIZ;
    }
}
