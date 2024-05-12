package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.VideoBrightAPI;
import com.bytedance.bmf_mods_api.d;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class VideoBright implements VideoBrightAPI {
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;
    public int oes_flag = 0;
    public int bright_status = 0;
    public int status_change = 0;
    public d sCallback = null;

    public int GetStatus() {
        return -1;
    }

    @Override // com.bytedance.bmf_mods_api.VideoBrightAPI
    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public VideoBright() {
        Logging.d("New VideoBright");
    }

    public static VideoBrightAPI createVideoBrightAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VideoBrightAPI.class, z);
        if (LIZ != null) {
            return (VideoBrightAPI) LIZ;
        }
        if (C58096Mr6.LJIIIIZZ == null) {
            synchronized (VideoBrightAPI.class) {
                if (C58096Mr6.LJIIIIZZ == null) {
                    C58096Mr6.LJIIIIZZ = new VideoBright();
                }
            }
        }
        return (VideoBright) C58096Mr6.LJIIIIZZ;
    }

    @Override // com.bytedance.bmf_mods_api.VideoBrightAPI
    public void SetCallback(d dVar) {
        this.sCallback = dVar;
    }

    @Override // com.bytedance.bmf_mods_api.VideoBrightAPI
    public boolean Init(int i, int i2, int i3, int i4) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        this.srOption.LJJIIJ("init_fps", Integer.valueOf(i));
        this.srOption.LJJIIJ("normal_fps", Integer.valueOf(i2));
        this.srOption.LJJIIJ("long_sw", Integer.valueOf(i3));
        this.srOption.LJJIIJ("lum_thre", Integer.valueOf(i4));
        this.srModuleInfo = new ModuleInfo("Brighten_Module", "c++", "libbmf_hydra.so", "");
        Class[] clsArr = {m.class};
        Class[] clsArr2 = {m.class};
        try {
            Logging.d("Brighten_Module: load bright Module");
            this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
            Logging.d("Brighten_Module: load bright Module success");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Brighten_Module: load bright Module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // com.bytedance.bmf_mods_api.VideoBrightAPI
    public int Process(int i, int i2, int i3, int i4, long j) {
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("input_texture", Integer.valueOf(i));
        mVar.LJJIIJ("output_texture", Integer.valueOf(i2));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        mVar.LJJIIJ("timestamp", Long.valueOf(j));
        try {
            m mVar2 = (m) this.srFunc.call(mVar)[0];
            int LJIILJJIL = mVar2.LJJIJ("output_texture").LJIILJJIL();
            int LJIILJJIL2 = mVar2.LJJIJ("status").LJIILJJIL();
            if (LJIILJJIL2 == 2) {
                float LJIIJ = mVar2.LJJIJ("process_time").LJIIJ();
                float LJIIJ2 = mVar2.LJJIJ("input_texture_brightness").LJIIJ();
                float LJIIJ3 = mVar2.LJJIJ("output_texture_brightness").LJIIJ();
                d dVar = this.sCallback;
                if (dVar != null) {
                    dVar.callback(LJIILJJIL2, LJIIJ, LJIIJ2, LJIIJ3);
                }
            }
            return LJIILJJIL;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Brighten_Module: call bright module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }
}
