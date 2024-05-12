package com.lynx.fresco;

import X.C13870gZ;
import X.C67155QXf;
import X.C81392Vwy;
import X.X1D;
import a04.IDfS1S0100000_14;
import android.graphics.Bitmap;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public class FrescoImageConverter {
    public C67155QXf<Bitmap> convert(Object obj) {
        String name;
        if (!(obj instanceof C81392Vwy)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unknown class type:");
            if (obj == null) {
                name = "null";
            } else {
                name = obj.getClass().getName();
            }
            C13870gZ.LIZJ(LIZ, name, LIZ, 3, "Image");
            return null;
        }
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        Object LJI = c81392Vwy.LJI();
        if (LJI == null) {
            LLog.LIZLLL(3, "Image", "convert failed, bitmap null");
            return null;
        }
        return new C67155QXf<>(LJI, new IDfS1S0100000_14(c81392Vwy, 1));
    }
}
