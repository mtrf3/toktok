package com.lynx.devtoolwrapper;

import X.C03880Dg;
import X.C16880lQ;
import X.C39122FXa;
import X.C39519Ff9;
import X.C45243HpH;
import X.C65300Pk0;
import X.InterfaceC39124FXc;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.Toast;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class LynxDevtoolGlobalHelper {
    public Object bridge;
    public Map<String, String> mAppInfo;
    public Context mContext;
    public Method prepareRemoteDebug;
    public Method recordCommonResource;
    public Method recordDrawableResource;
    public Method recordImageResource;
    public Method registerCardListener;
    public boolean remoteDebugAvailable;
    public Method setAppInfo;
    public Method setContext;
    public Method shouldPrepareRemoteDebug;
    public Method showDebugView;

    public static Object com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8098804110165717608"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public LynxDevtoolGlobalHelper() {
        HashMap hashMap = new HashMap();
        this.mAppInfo = hashMap;
        LynxEnv.LJIIIZ().getClass();
        hashMap.put("sdkVersion", "2.10.16-rc.10");
        this.mAppInfo.put("vmsdkVersion", "2.3.12-tt");
    }

    private boolean initRemoteDebugIfNecessary() {
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        if (!LJIIIZ.LJIILIIL) {
            Context context = this.mContext;
            if (context != null) {
                C16880lQ.LLZILL(Toast.makeText(context, "Lynx initialization not finished!", 0));
            }
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", "liblynx.so not loaded!");
            return false;
        }
        if (this.remoteDebugAvailable) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("com.lynx.devtool.LynxGlobalDebugBridge");
            Method method = cls.getMethod("getInstance", new Class[0]);
            this.shouldPrepareRemoteDebug = cls.getMethod("shouldPrepareRemoteDebug", String.class);
            this.prepareRemoteDebug = cls.getMethod("prepareRemoteDebug", String.class);
            this.setContext = cls.getMethod("setContext", Context.class);
            this.showDebugView = cls.getDeclaredMethod("showDebugView", ViewGroup.class);
            this.registerCardListener = cls.getDeclaredMethod("registerCardListener", InterfaceC39124FXc.class);
            this.setAppInfo = cls.getDeclaredMethod("setAppInfo", Context.class, Map.class);
            this.recordCommonResource = cls.getDeclaredMethod("recordCommonResource", String.class, String.class);
            this.recordImageResource = cls.getDeclaredMethod("recordImageResource", String.class, Bitmap.class);
            this.recordDrawableResource = cls.getDeclaredMethod("recordDrawableResource", String.class, Drawable.class);
            this.bridge = method.invoke(null, new Object[0]);
            this.remoteDebugAvailable = true;
        } catch (ClassNotFoundException unused) {
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", "Could not find LynxGlobalDebugBridge. Shall ignore this exception if expected.");
        } catch (IllegalAccessException e) {
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", e.toString());
        } catch (NoSuchMethodException e2) {
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", e2.toString());
        } catch (InvocationTargetException e3) {
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", e3.toString());
        }
        return this.remoteDebugAvailable;
    }

    private boolean recordAvailable() {
        LynxEnv.LJIIIZ().getClass();
        return false;
    }

    public static LynxDevtoolGlobalHelper getInstance() {
        return C39122FXa.LIZ;
    }

    public boolean isRemoteDebugAvailable() {
        return this.remoteDebugAvailable;
    }

    public boolean prepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        if (!LynxEnv.LJIIIZ().LJIIJJI()) {
            Context context = this.mContext;
            if (context != null) {
                C16880lQ.LLZILL(Toast.makeText(context, "Debugging not supported in this package", 0));
            }
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", "Debugging not supported in this package");
            return false;
        }
        if (!LynxEnv.LJIIIZ().LJIIJ() && !LynxEnv.LJIIIZ().LJ("enable_devtool_for_debuggable_view", false)) {
            Context context2 = this.mContext;
            if (context2 != null) {
                C16880lQ.LLZILL(Toast.makeText(context2, "Devtool not enabled, turn on the switch!", 0));
            }
            LLog.LIZLLL(3, "LynxDevtoolGlobalHelper", "Devtool not enabled, turn on the switch!");
            return false;
        }
        setAppInfo(this.mContext, (Map<String, String>) null);
        try {
            return ((Boolean) com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.prepareRemoteDebug, this.bridge, new Object[]{str})).booleanValue();
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
            return false;
        }
    }

    public void registerCardListener(InterfaceC39124FXc interfaceC39124FXc) {
        if (!initRemoteDebugIfNecessary()) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.registerCardListener, this.bridge, new Object[]{interfaceC39124FXc});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
        if (!initRemoteDebugIfNecessary()) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.setContext, this.bridge, new Object[]{context});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public boolean shouldPrepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        try {
            return ((Boolean) com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.shouldPrepareRemoteDebug, this.bridge, new Object[]{str})).booleanValue();
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
            return false;
        }
    }

    public void showDebugView(ViewGroup viewGroup) {
        if (!initRemoteDebugIfNecessary()) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.showDebugView, this.bridge, new Object[]{viewGroup});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public void recordCommonResource(String str, String str2) {
        if (!recordAvailable() || str2 == null) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.recordCommonResource, this.bridge, new Object[]{str, str2});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public void recordResourceWithDrawable(String str, Drawable drawable) {
        if (!recordAvailable() || drawable == null) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.recordDrawableResource, this.bridge, new Object[]{str, drawable});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public void recordResourceWithImage(String str, Bitmap bitmap) {
        if (!recordAvailable() || bitmap == null) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.recordImageResource, this.bridge, new Object[]{str, bitmap});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public void setAppInfo(Context context, Map<String, String> map) {
        if (map != null) {
            this.mAppInfo.putAll(map);
        }
        if (!initRemoteDebugIfNecessary()) {
            return;
        }
        try {
            com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.setAppInfo, this.bridge, new Object[]{context, this.mAppInfo});
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public void setAppInfo(String str, String str2) {
        setAppInfo(null, str, str2);
    }

    public void setAppInfo(Context context, String str, String str2) {
        setAppInfo(context, C45243HpH.LIZ("App", str, "AppVersion", str2));
    }
}
