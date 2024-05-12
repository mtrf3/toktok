package com.lynx.jsbridge;

import X.C03880Dg;
import X.C65300Pk0;
import X.C79411VEp;
import X.InterfaceC37728ErM;
import X.VNU;
import X.VO2;
import X.VO5;
import X.VO6;
import X.VO7;
import X.VO8;
import X.VO9;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class LynxIntersectionObserverModule extends LynxContextModule {
    public static final String NAME = "IntersectionObserverModule";

    public LynxIntersectionObserverModule(VNU vnu) {
        super(vnu);
    }

    @InterfaceC37728ErM
    public void disconnect(int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)V", "5246991744634369237");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "disconnect", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "disconnect", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO2(this, this.mLynxContext, i));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "disconnect", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void relativeToScreen(int i, ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i), readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(ILcom/lynx/react/bridge/ReadableMap;)V", "5246991744634369237");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToScreen", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToScreen", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO9(this, this.mLynxContext, i, readableMap));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToScreen", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void relativeToViewport(int i, ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i), readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(ILcom/lynx/react/bridge/ReadableMap;)V", "5246991744634369237");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToViewport", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToViewport", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO8(this, this.mLynxContext, i, readableMap));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeToViewport", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void createIntersectionObserver(int i, String str, ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i), str, readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(ILjava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", "5246991744634369237");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "createIntersectionObserver", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "createIntersectionObserver", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO5(this, this.mLynxContext, i, str, readableMap));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "createIntersectionObserver", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void observe(int i, String str, int i2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(ILjava/lang/String;I)V", "5246991744634369237");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "observe", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "observe", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO6(this, this.mLynxContext, i, str, i2));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "observe", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void relativeTo(int i, String str, ReadableMap readableMap) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i), str, readableMap};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(ILjava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", "5246991744634369237");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeTo", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeTo", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO7(this, this.mLynxContext, i, str, readableMap));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxIntersectionObserverModule", "relativeTo", null, objArr, this, c65300Pk0, true);
        }
    }
}
