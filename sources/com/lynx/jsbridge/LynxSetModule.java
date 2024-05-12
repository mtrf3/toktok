package com.lynx.jsbridge;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.InterfaceC37728ErM;
import X.VNU;
import X.X1D;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class LynxSetModule extends LynxContextModule {
    public static final String NAME = "LynxSetModule";

    @InterfaceC37728ErM
    public boolean getEnableLayoutOnly() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Z", "7780889101514238756");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableLayoutOnly", this, objArr, "boolean", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableLayoutOnly", null, objArr, this, c65300Pk0, false);
            return ((Boolean) LIZJ.LIZIZ).booleanValue();
        }
        boolean z = LynxEnv.LJIIIZ().LJIIIZ;
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableLayoutOnly", Boolean.valueOf(z), objArr, this, c65300Pk0, true);
        return z;
    }

    @InterfaceC37728ErM
    public boolean getEnableVsyncAlignedFlush() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Z", "7780889101514238756");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableVsyncAlignedFlush", this, objArr, "boolean", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableVsyncAlignedFlush", null, objArr, this, c65300Pk0, false);
            return ((Boolean) LIZJ.LIZIZ).booleanValue();
        }
        boolean z = LynxEnv.LJIIIZ().LJIIJJI;
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getEnableVsyncAlignedFlush", Boolean.valueOf(z), objArr, this, c65300Pk0, true);
        return z;
    }

    @InterfaceC37728ErM
    public boolean getIsCreateViewAsync() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Z", "7780889101514238756");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "getIsCreateViewAsync", this, objArr, "boolean", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getIsCreateViewAsync", null, objArr, this, c65300Pk0, false);
            return ((Boolean) LIZJ.LIZIZ).booleanValue();
        }
        boolean z = LynxEnv.LJIIIZ().LJIIJ;
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getIsCreateViewAsync", Boolean.valueOf(z), objArr, this, c65300Pk0, true);
        return z;
    }

    @InterfaceC37728ErM
    public boolean getLogToSystemStatus() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Z", "7780889101514238756");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", this, objArr, "boolean", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", null, objArr, this, c65300Pk0, false);
            return ((Boolean) LIZJ.LIZIZ).booleanValue();
        }
        try {
            Class<?> cls = Class.forName("com.ss.android.agilelogger.ALog");
            Field declaredField = cls.getDeclaredField("sDebug");
            declaredField.setAccessible(true);
            boolean z = declaredField.getBoolean(cls);
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", Boolean.valueOf(z), objArr, this, c65300Pk0, true);
            return z;
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", Boolean.FALSE, objArr, this, c65300Pk0, true);
            return false;
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", Boolean.FALSE, objArr, this, c65300Pk0, true);
            return false;
        } catch (NoSuchFieldException e3) {
            C16880lQ.LLLLIIL(e3);
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "getLogToSystemStatus", Boolean.FALSE, objArr, this, c65300Pk0, true);
            return false;
        }
    }

    public LynxSetModule(VNU vnu) {
        super(vnu);
    }

    @InterfaceC37728ErM
    public void switchEnableLayoutOnly(Boolean bool) {
        String str;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {bool};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/Boolean;)V", "7780889101514238756");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableLayoutOnly", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableLayoutOnly", null, objArr, this, c65300Pk0, false);
            return;
        }
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        boolean booleanValue = bool.booleanValue();
        LJIIIZ.getClass();
        if (booleanValue) {
            str = "Turn on LayoutOnly";
        } else {
            str = "Turn off LayoutOnly";
        }
        LLog.LIZLLL(2, "LynxEnv", str);
        LJIIIZ.LJIIIZ = booleanValue;
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableLayoutOnly", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public void switchEnableVsyncAlignedFlush(Boolean bool) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {bool};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/Boolean;)V", "7780889101514238756");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableVsyncAlignedFlush", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableVsyncAlignedFlush", null, objArr, this, c65300Pk0, false);
            return;
        }
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        boolean booleanValue = bool.booleanValue();
        LJIIIZ.LJIIJJI = booleanValue;
        LJIIIZ.nativeSetEnv("enable_vsync_aligned_flush", booleanValue);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mVsyncAlignedFlushGlobalSwitch: ");
        LIZ.append(LJIIIZ.LJIIJJI);
        LLog.LIZLLL(2, "LynxEnv", X1D.LIZIZ(LIZ));
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchEnableVsyncAlignedFlush", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public void switchIsCreateViewAsync(Boolean bool) {
        String str;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {bool};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/Boolean;)V", "7780889101514238756");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "switchIsCreateViewAsync", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchIsCreateViewAsync", null, objArr, this, c65300Pk0, false);
            return;
        }
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        boolean booleanValue = bool.booleanValue();
        LJIIIZ.LJIIJ = booleanValue;
        if (booleanValue) {
            str = "true";
        } else {
            str = "false";
        }
        LLog.LIZLLL(2, "LynxEnv_mCreateViewAsync:", str);
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchIsCreateViewAsync", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public void switchKeyBoardDetect(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7780889101514238756");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "switchKeyBoardDetect", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchKeyBoardDetect", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (z) {
            this.mLynxContext.LJI().getKeyboardEvent().LIZ();
        } else {
            this.mLynxContext.LJI().getKeyboardEvent().LIZJ();
        }
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchKeyBoardDetect", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public void switchLogToSystem(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7780889101514238756");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxSetModule", "switchLogToSystem", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchLogToSystem", null, objArr, this, c65300Pk0, false);
            return;
        }
        try {
            Class.forName("com.ss.android.agilelogger.ALog").getMethod("setDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z));
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
        } catch (NoSuchMethodException e3) {
            C16880lQ.LLLLIIL(e3);
        } catch (InvocationTargetException e4) {
            C16880lQ.LLLLIIL(e4);
        }
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxSetModule", "switchLogToSystem", null, objArr, this, c65300Pk0, true);
    }
}
