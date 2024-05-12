package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.HydraHDRAPI;
import com.google.gson.g;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class HydraHDR implements HydraHDRAPI {
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public HydraHDR() {
        Logging.d("New HydraHDR");
    }

    public static HydraHDRAPI createHydraHDRAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(HydraHDRAPI.class, z);
        if (LIZ != null) {
            return (HydraHDRAPI) LIZ;
        }
        if (C58096Mr6.LJFF == null) {
            synchronized (HydraHDRAPI.class) {
                if (C58096Mr6.LJFF == null) {
                    C58096Mr6.LJFF = new HydraHDR();
                }
            }
        }
        return (HydraHDR) C58096Mr6.LJFF;
    }

    public boolean Init(boolean z, float f, boolean z2, int i) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        this.srOption.LJJIII(Boolean.valueOf(z), "enable_profile");
        this.srOption.LJJIIJ("blend_alpha", Float.valueOf(f));
        this.srOption.LJJIII(Boolean.valueOf(z2), "fast_mode");
        this.srOption.LJJIIJ("input_texture_type", Integer.valueOf(i));
        this.srModuleInfo = new ModuleInfo("HydraHDRModule", "c++", "libbmf_hydra.so", "");
        Class[] clsArr = {m.class};
        Class[] clsArr2 = {m.class};
        try {
            Logging.d("HydraHDR: load HDR Module");
            this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
            Logging.d("HydraHDR: load HDR Module success");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HydraHDR: load HDR Module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public int Process(int i, int i2, int i3, int i4) {
        return Process(i, i2, i3, i4, false);
    }

    public int Process(int i, int i2, int i3, int i4, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("input_texture", Integer.valueOf(i));
        mVar.LJJIIJ("output_texture", Integer.valueOf(i2));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        mVar.LJJIII(Boolean.valueOf(z), "first_frame");
        try {
            return i2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HydraHDR: call HDR module failed,");
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
            LIZ.append("HydraHDR: call HDR module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }
}
