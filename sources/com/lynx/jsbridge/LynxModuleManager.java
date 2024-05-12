package com.lynx.jsbridge;

import X.C16880lQ;
import X.C39523FfD;
import X.C79411VEp;
import X.VNU;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class LynxModuleManager {
    public Map<String, LynxModuleWrapper> LIZIZ;
    public WeakReference<Context> LIZJ;
    public LynxViewClient LIZLLL;
    public final Map<String, C39523FfD> LIZ = new HashMap();
    public long LJ = 0;
    public boolean LJFF = false;
    public boolean LJI = false;

    private native boolean nativeRetainJniObject(long j);

    public final void LIZLLL() {
        if (!nativeRetainJniObject(this.LJ)) {
            LLog.LIZLLL(4, "LynxModuleManager", "LynxModuleManager try to retainJniObject failed");
            destroy();
        }
    }

    public void destroy() {
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        Map<String, LynxModuleWrapper> map = this.LIZIZ;
        if (map != null) {
            Iterator<LynxModuleWrapper> it = map.values().iterator();
            while (it.hasNext()) {
                LynxModule lynxModule = it.next().LIZ;
                if (lynxModule != null) {
                    lynxModule.destroy();
                }
            }
        }
        if (this.LJFF) {
            C79411VEp.LIZJ(new ARunnableS42S0100000_6(this, 22));
        }
        this.LJ = 0L;
        this.LIZIZ = null;
        ((HashMap) this.LIZ).clear();
    }

    public LynxModuleManager(Context context) {
        if (context instanceof VNU) {
            this.LIZLLL = ((VNU) context).LJLLL;
        }
        this.LIZJ = new WeakReference<>(context);
    }

    public static void LIZIZ(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get Module failed");
        LIZ.append(exc);
        LLog.LIZLLL(4, "LynxModuleManager", X1D.LIZIZ(LIZ));
    }

    private LynxModuleWrapper moduleWrapperForName(String str) {
        LynxModuleWrapper LIZ = LIZ(str);
        if (LIZ == null) {
            return LynxEnv.LJIIIZ().LJFF().LIZ(str);
        }
        return LIZ;
    }

    private void setNativePtr(long j) {
        this.LJ = j;
    }

    public final LynxModuleWrapper LIZ(String str) {
        boolean isAssignableFrom;
        Context context;
        LynxModule newInstance;
        if (str == null) {
            LLog.LIZLLL(4, "LynxModuleManager", "getModule failed, name is null");
            return null;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        if (((HashMap) this.LIZIZ).get(str) != null) {
            return (LynxModuleWrapper) ((HashMap) this.LIZIZ).get(str);
        }
        C39523FfD c39523FfD = (C39523FfD) ((HashMap) this.LIZ).get(str);
        if (c39523FfD == null) {
            return null;
        }
        Class<? extends LynxModule> cls = c39523FfD.LIZIZ;
        try {
            isAssignableFrom = LynxContextModule.class.isAssignableFrom(cls);
            context = this.LIZJ.get();
        } catch (IllegalAccessException e) {
            LIZIZ(e);
        } catch (InstantiationException e2) {
            LIZIZ(e2);
        } catch (NoSuchMethodException e3) {
            LIZIZ(e3);
        } catch (InvocationTargetException e4) {
            LIZIZ(e4);
        } catch (Exception e5) {
            LIZIZ(e5);
        }
        if (context == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLILLLL(cls));
            LIZ.append(" called with Null context");
            LLog.LIZLLL(4, "LynxModuleManager", X1D.LIZIZ(LIZ));
            return null;
        }
        if (isAssignableFrom) {
            if (context instanceof VNU) {
                if (c39523FfD.LIZJ == null) {
                    for (Constructor<?> constructor : cls.getConstructors()) {
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        if (parameterTypes.length == 1 && VNU.class.equals(parameterTypes[0])) {
                            newInstance = (LynxModule) constructor.newInstance((VNU) context);
                        } else if (parameterTypes.length == 2 && VNU.class.equals(parameterTypes[0]) && Object.class.equals(parameterTypes[1])) {
                            newInstance = (LynxModule) constructor.newInstance((VNU) context, null);
                        }
                    }
                    LLog.LIZLLL(0, "LynxModuleManager", "getModule" + str + "failed");
                    return null;
                }
                newInstance = cls.getConstructor(VNU.class, Object.class).newInstance((VNU) context, c39523FfD.LIZJ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C16880lQ.LJLLILLLL(cls));
                LIZ2.append(" must be created with LynxContext");
                throw new Exception(X1D.LIZIZ(LIZ2));
            }
        } else {
            if (c39523FfD.LIZJ == null) {
                for (Constructor<?> constructor2 : cls.getConstructors()) {
                    Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                    if (parameterTypes2.length == 1 && Context.class.equals(parameterTypes2[0])) {
                        newInstance = (LynxModule) constructor2.newInstance(context);
                    } else if (parameterTypes2.length == 2 && Context.class.equals(parameterTypes2[0]) && Object.class.equals(parameterTypes2[1])) {
                        newInstance = (LynxModule) constructor2.newInstance(context, null);
                    }
                }
                LLog.LIZLLL(0, "LynxModuleManager", "getModule" + str + "failed");
                return null;
            }
            newInstance = cls.getConstructor(Context.class, Object.class).newInstance(context, c39523FfD.LIZJ);
        }
        if (newInstance != null) {
            LynxModuleWrapper lynxModuleWrapper = new LynxModuleWrapper(str, newInstance);
            ((HashMap) this.LIZIZ).put(str, lynxModuleWrapper);
            return lynxModuleWrapper;
        }
        LLog.LIZLLL(0, "LynxModuleManager", "getModule" + str + "failed");
        return null;
    }

    public final void LIZJ(String str, Class<? extends LynxModule> cls, Object obj) {
        C39523FfD c39523FfD = new C39523FfD();
        c39523FfD.LIZ = str;
        c39523FfD.LIZIZ = cls;
        c39523FfD.LIZJ = obj;
        Object obj2 = ((HashMap) this.LIZ).get(str);
        if (obj2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Duplicated LynxModule For Name: ");
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(obj2);
            LIZ.append(" will be override");
            LLog.LIZLLL(4, "LynxModuleManager", X1D.LIZIZ(LIZ));
        }
        ((HashMap) this.LIZ).put(str, c39523FfD);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("registered module with name: ");
        LIZ2.append(str);
        LIZ2.append(" class");
        LIZ2.append(cls);
        LLog.LIZLLL(0, "LynxModuleManager", X1D.LIZIZ(LIZ2));
    }
}
