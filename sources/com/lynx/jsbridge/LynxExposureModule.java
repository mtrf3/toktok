package com.lynx.jsbridge;

import X.C03880Dg;
import X.C65300Pk0;
import X.C79411VEp;
import X.InterfaceC37728ErM;
import X.VNU;
import X.VO3;
import X.VO4;

/* loaded from: classes15.dex */
public class LynxExposureModule extends LynxContextModule {
    public static final String NAME = "LynxExposureModule";

    @InterfaceC37728ErM
    public void resumeExposure() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-7907260931562986915");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxExposureModule", "resumeExposure", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "resumeExposure", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO3(this, this.mLynxContext));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "resumeExposure", null, objArr, this, c65300Pk0, true);
        }
    }

    @InterfaceC37728ErM
    public void stopExposure() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-7907260931562986915");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxExposureModule", "stopExposure", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "stopExposure", null, objArr, this, c65300Pk0, false);
        } else {
            C79411VEp.LIZJ(new VO4(this, this.mLynxContext));
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxExposureModule", "stopExposure", null, objArr, this, c65300Pk0, true);
        }
    }

    public LynxExposureModule(VNU vnu) {
        super(vnu);
    }
}
