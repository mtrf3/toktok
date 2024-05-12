package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.ColorShiftAPI;
import com.google.gson.g;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class ColorShift implements ColorShiftAPI {
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public ColorShift() {
        Logging.d("New ColorShift");
    }

    public static ColorShiftAPI createColorShiftAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ColorShiftAPI.class, z);
        if (LIZ != null) {
            return (ColorShiftAPI) LIZ;
        }
        if (C58096Mr6.LJ == null) {
            synchronized (ColorShiftAPI.class) {
                if (C58096Mr6.LJ == null) {
                    C58096Mr6.LJ = new ColorShift();
                }
            }
        }
        return (ColorShift) C58096Mr6.LJ;
    }

    public int Process(int i, int i2, int i3, int i4) {
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("input_texture", Integer.valueOf(i));
        mVar.LJJIIJ("output_texture", Integer.valueOf(i2));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        try {
            return i2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ColorShift: call ColorShift module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public int oesProcess(int i, int i2, int i3, int i4, float[] fArr) {
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("input_texture", Integer.valueOf(i));
        mVar.LJJIIJ("output_texture", Integer.valueOf(i2));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        g gVar = new g();
        for (float f : fArr) {
            gVar.LJJIII(Float.valueOf(f));
        }
        mVar.LJJII("matrix", gVar);
        try {
            return i2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ColorShift: call ColorShift module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public boolean Init(boolean z, float f, float f2, float[] fArr, float[] fArr2, int i) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        this.srOption.LJJIII(Boolean.valueOf(z), "enable_profile");
        this.srOption.LJJIIJ("bright", Float.valueOf(f));
        this.srOption.LJJIIJ("saturation", Float.valueOf(f2));
        this.srOption.LJJIIJ("input_texture_type", Integer.valueOf(i));
        g gVar = new g();
        for (float f3 : fArr) {
            gVar.LJJIII(Float.valueOf(f3));
        }
        this.srOption.LJJII("shift_positive", gVar);
        g gVar2 = new g();
        for (float f4 : fArr2) {
            gVar2.LJJIII(Float.valueOf(f4));
        }
        this.srOption.LJJII("shift_negative", gVar2);
        this.srModuleInfo = new ModuleInfo("ColorShiftModule", "c++", "libbmf_hydra.so", "");
        Class[] clsArr = {m.class};
        Class[] clsArr2 = {m.class};
        try {
            Logging.d("ColorShift: load ColorShift Module");
            this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
            Logging.d("ColorShift: load ColorShift Module success");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ColorShift: load ColorShift Module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
