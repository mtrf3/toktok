package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.CMq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31208CMq {
    public volatile int mStatus;

    public static Object com_bytedance_android_livesdk_launch_AbsTask_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7793548278464050610"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public abstract String getTaskName();

    public synchronized boolean isFinished() {
        boolean z;
        if (this.mStatus != 2) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public synchronized boolean isIDLE() {
        boolean z;
        if (this.mStatus != 0) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public synchronized boolean isRunning() {
        boolean z;
        z = true;
        if (this.mStatus != 1) {
            z = false;
        }
        return z;
    }

    public abstract void run();

    public void start() {
        if (this.mStatus == 2 || this.mStatus == 1) {
            return;
        }
        this.mStatus = 1;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init_live_launch_task_");
            LIZ.append(getTaskName());
            C62044OWq.LIZIZ(X1D.LIZIZ(LIZ));
            run();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init_live_launch_task_");
            LIZ2.append(getTaskName());
            C62044OWq.LIZ(X1D.LIZIZ(LIZ2));
            this.mStatus = 2;
        } catch (Exception e) {
            this.mStatus = 3;
            throw e;
        }
    }

    public void start(int i) {
        if (this.mStatus == 2 || this.mStatus == 1) {
            return;
        }
        this.mStatus = 1;
        if (i != 2) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("init_live_launch_task_");
                LIZ.append(getTaskName());
                C62044OWq.LIZIZ(X1D.LIZIZ(LIZ));
            } catch (Exception e) {
                this.mStatus = 3;
                throw e;
            }
        }
        run();
        if (i != 2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init_live_launch_task_");
            LIZ2.append(getTaskName());
            C62044OWq.LIZ(X1D.LIZIZ(LIZ2));
        }
        this.mStatus = 2;
    }

    public static void invokeMethod(String str, String str2) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            com_bytedance_android_livesdk_launch_AbsTask_java_lang_reflect_Method_invoke(declaredMethod, null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | Exception unused) {
        }
    }
}
