package com.lynx.canvas;

import X.C58556MyW;
import X.C58557MyX;
import X.O5Y;
import X.X1D;
import android.content.res.AssetManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class CanvasFontRegistry {
    public static volatile CanvasFontRegistry LIZJ;
    public final ArrayList<C58557MyX> LIZ = new ArrayList<>();
    public boolean LIZIZ = false;

    private native boolean nativeRegisterFont(String str, String str2, int i, int i2);

    public final void LIZ() {
        synchronized (this) {
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            Iterator<C58557MyX> it = this.LIZ.iterator();
            while (it.hasNext()) {
                it.next().getClass();
                nativeRegisterFont(null, null, 0, 0);
            }
            this.LIZ.clear();
        }
    }

    public static void onNativeReady() {
        if (LIZJ == null) {
            synchronized (CanvasFontRegistry.class) {
                if (LIZJ == null) {
                    LIZJ = new CanvasFontRegistry();
                }
            }
        }
        LIZJ.LIZ();
    }

    public static AssetManager getAssetManager() {
        C58556MyW LIZ = C58556MyW.LIZ();
        try {
            if (LIZ.LIZ) {
                return LIZ.LIZJ.getAssets();
            }
            return null;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getAssetManager error ");
            LIZ2.append(th.toString());
            O5Y.LJJJ("CanvasFontRegistry", X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public static void onNativeFirstUseComplexLayout() {
        C58556MyW.LIZ().LIZIZ("kryptoni18n", true);
    }
}
