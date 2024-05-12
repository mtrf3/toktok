package com.lynx.tasm.navigator;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C79411VEp;
import X.InterfaceC37728ErM;
import Y.ARunnableS11S1100000_10;
import Y.ARunnableS17S0000000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes11.dex */
public class NavigationModule extends LynxModule {
    public static String NAME = "NavigationModule";

    @InterfaceC37728ErM
    public String getString() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "-7741580947764560426");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300002, "com/lynx/tasm/navigator/NavigationModule", "getString", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "getString", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String str = NAME;
        c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "getString", str, objArr, this, c65300Pk0, true);
        return str;
    }

    @InterfaceC37728ErM
    public void goBack() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-7741580947764560426");
        if (c03880Dg.LIZJ(300002, "com/lynx/tasm/navigator/NavigationModule", "goBack", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "goBack", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new ARunnableS17S0000000_10(0));
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "goBack", null, objArr, this, c65300Pk0, true);
        }
    }

    public NavigationModule(Context context) {
        super(context);
    }

    @InterfaceC37728ErM
    public void registerRoute(ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;)V", "-7741580947764560426");
        if (c03880Dg.LIZJ(300002, "com/lynx/tasm/navigator/NavigationModule", "registerRoute", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "registerRoute", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new ARunnableS46S0100000_10(readableMap, 31));
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "registerRoute", null, objArr, this, c65300Pk0, true);
        }
    }

    public NavigationModule(Context context, Object obj) {
        super(context, obj);
    }

    @InterfaceC37728ErM
    public void navigateTo(String str, ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", "-7741580947764560426");
        if (c03880Dg.LIZJ(300002, "com/lynx/tasm/navigator/NavigationModule", "navigateTo", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "navigateTo", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new ARunnableS11S1100000_10(readableMap, str, 3));
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "navigateTo", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void replace(String str, ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", "-7741580947764560426");
        if (c03880Dg.LIZJ(300002, "com/lynx/tasm/navigator/NavigationModule", "replace", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "replace", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new ARunnableS11S1100000_10(readableMap, str, 4));
            c03880Dg.LIZIZ(300002, "com/lynx/tasm/navigator/NavigationModule", "replace", null, objArr, this, c65300Pk0, true);
        }
    }
}
