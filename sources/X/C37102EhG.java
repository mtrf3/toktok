package X;

import Y.ACallableS109S0100000_6;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.EhG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37102EhG implements InterfaceC37103EhH {
    public static final C37102EhG LIZ = new C37102EhG();

    public static void LIZIZ(AbstractC40550Fvm splitInstallSessionState) {
        int i;
        o.LJIIIZ(splitInstallSessionState, "splitInstallSessionState");
        if (splitInstallSessionState.LJIIJJI() == 5 && (i = Build.VERSION.SDK_INT) >= 26) {
            Context LIZIZ = EF7.LIZIZ();
            if (!((Boolean) C37105EhJ.LIZIZ.getValue()).booleanValue() && i < 28) {
                C13T c13t = C37112EhQ.LIZ;
                c13t.LIZJ("Calling dispatchPackageBroadcast", 4, new Object[0]);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Method method = cls.getMethod("currentActivityThread", new Class[0]);
                    method.setAccessible(true);
                    Object invoke = method.invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mAppThread");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(invoke);
                    obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{LIZIZ.getPackageName()});
                    c13t.LIZJ("Called dispatchPackageBroadcast", 4, new Object[0]);
                } catch (Exception unused) {
                    C37112EhQ.LIZ.getClass();
                }
            }
        }
        C10K.LIZIZ(new ACallableS109S0100000_6(splitInstallSessionState, 15), C10K.LJIIIIZZ, null);
        Iterator it = ((CopyOnWriteArrayList) F5W.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC40559Fvv) it.next()).LIZ(splitInstallSessionState);
        }
    }

    @Override // X.InterfaceC40559Fvv
    public final /* bridge */ /* synthetic */ void LIZ(AbstractC40550Fvm abstractC40550Fvm) {
        int i;
        AbstractC40550Fvm splitInstallSessionState = abstractC40550Fvm;
        o.LJIIIZ(splitInstallSessionState, "splitInstallSessionState");
        if (splitInstallSessionState.LJIIJJI() == 5 && (i = Build.VERSION.SDK_INT) >= 26) {
            Context LIZIZ = EF7.LIZIZ();
            if (!((Boolean) C37105EhJ.LIZIZ.getValue()).booleanValue() && i < 28) {
                C13T c13t = C37112EhQ.LIZ;
                c13t.LIZJ("Calling dispatchPackageBroadcast", 4, new Object[0]);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Method method = cls.getMethod("currentActivityThread", new Class[0]);
                    method.setAccessible(true);
                    Object invoke = method.invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mAppThread");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(invoke);
                    obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{LIZIZ.getPackageName()});
                    c13t.LIZJ("Called dispatchPackageBroadcast", 4, new Object[0]);
                } catch (Exception unused) {
                    C37112EhQ.LIZ.getClass();
                }
            }
        }
        C10K.LIZIZ(new ACallableS109S0100000_6(splitInstallSessionState, 15), C10K.LJIIIIZZ, null);
        Iterator it = ((CopyOnWriteArrayList) F5W.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC40559Fvv) it.next()).LIZ(splitInstallSessionState);
        }
    }
}
