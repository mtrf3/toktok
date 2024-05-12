package com.ss.ttlivestreamer.livestreamv2.filter.bmf;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import com.google.gson.m;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public class BmfSdkWrapper {
    public static final String TAG = C16880lQ.LJLLJ(BmfSdkWrapper.class);
    public static Exception bmfInvalidException;
    public static Constructor<?> ctorModuleFunctor;
    public static Constructor<?> ctorModuleInfo;
    public static Method methodModuleFunctorCall;
    public static Method methodModuleFunctorFree;

    /* loaded from: classes12.dex */
    public static class ModuleFunctor {
        public final Object mModuleFunctor;

        public static Object com_ss_ttlivestreamer_livestreamv2_filter_bmf_BmfSdkWrapper$ModuleFunctor_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "540531240704325467"));
            return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
        }

        public void free() {
            Object obj;
            try {
                if (BmfSdkWrapper.bmfInvalidException == null && (obj = this.mModuleFunctor) != null) {
                    com_ss_ttlivestreamer_livestreamv2_filter_bmf_BmfSdkWrapper$ModuleFunctor_java_lang_reflect_Method_invoke(BmfSdkWrapper.methodModuleFunctorFree, obj, new Object[0]);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }

        public m call(m mVar) {
            Object obj;
            try {
                if (BmfSdkWrapper.bmfInvalidException == null && (obj = this.mModuleFunctor) != null) {
                    return (m) ((Object[]) com_ss_ttlivestreamer_livestreamv2_filter_bmf_BmfSdkWrapper$ModuleFunctor_java_lang_reflect_Method_invoke(BmfSdkWrapper.methodModuleFunctorCall, obj, new Object[]{new Object[]{mVar}}))[0];
                }
                return null;
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }

        public ModuleFunctor(ModuleInfo moduleInfo, m mVar) {
            this.mModuleFunctor = BmfSdkWrapper.ctorModuleFunctor.newInstance(moduleInfo.mModuleInfo, mVar, new Class[]{m.class}, new Class[]{m.class});
        }

        public static ModuleFunctor newInstance(ModuleInfo moduleInfo, m mVar) {
            Exception exc = BmfSdkWrapper.bmfInvalidException;
            if (exc == null) {
                if (moduleInfo != null && mVar != null) {
                    try {
                        return new ModuleFunctor(moduleInfo, mVar);
                    } catch (InvocationTargetException e) {
                        throw e.getTargetException();
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("moduleInfo: ");
                LIZ.append(moduleInfo);
                LIZ.append(", option: ");
                LIZ.append(mVar);
                throw new Exception(X1D.LIZIZ(LIZ));
            }
            throw exc;
        }
    }

    static {
        try {
            Class<?> cls = Class.forName("com.bytedance.bmf.ModuleInfo");
            ctorModuleInfo = cls.getConstructor(String.class, String.class, String.class, String.class);
            Class<?> cls2 = Class.forName("com.bytedance.bmf.ModuleFunctor");
            ctorModuleFunctor = cls2.getConstructor(cls, Object.class, Class[].class, Class[].class);
            methodModuleFunctorCall = cls2.getMethod("call", Object[].class);
            methodModuleFunctorFree = cls2.getMethod("free", new Class[0]);
        } catch (Exception e) {
            AVLog.ioe(TAG, "reflect error. ", e);
            bmfInvalidException = e;
        }
    }

    /* loaded from: classes12.dex */
    public static class ModuleInfo {
        public final Object mModuleInfo;

        public ModuleInfo(String str, String str2, String str3, String str4) {
            this.mModuleInfo = BmfSdkWrapper.ctorModuleInfo.newInstance(str, str2, str3, str4);
        }

        public static ModuleInfo newInstance(String str, String str2, String str3, String str4) {
            Exception exc = BmfSdkWrapper.bmfInvalidException;
            if (exc == null) {
                try {
                    return new ModuleInfo(str, str2, str3, str4);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                }
            }
            throw exc;
        }
    }
}
