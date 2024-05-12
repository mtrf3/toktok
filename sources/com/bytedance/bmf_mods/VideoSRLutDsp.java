package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.VideoSRLutDspAPI;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class VideoSRLutDsp implements VideoSRLutDspAPI {
    public int currHeight;
    public int currWidth;
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;
    public int currInputTexture = -1;
    public int currOutputTexture = -1;

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public int[] GetTextures() {
        m mVar = new m();
        mVar.LJJIIJ("get_textures", 1);
        int[] iArr = {-1, -1};
        if (this.srFunc == null) {
            return iArr;
        }
        try {
            Logging.d("VideoSRLutDsp: call GetTextures.");
            Object[] call = this.srFunc.call(mVar);
            Logging.d("VideoSRLutDsp: GetTextures end.");
            m mVar2 = (m) call[0];
            iArr[0] = mVar2.LJJIJ("input_texture").LJIILJJIL();
            int LJIILJJIL = mVar2.LJJIJ("output_texture").LJIILJJIL();
            iArr[1] = LJIILJJIL;
            this.currInputTexture = iArr[0];
            this.currOutputTexture = LJIILJJIL;
        } catch (Exception e) {
            Logging.d(C16880lQ.LLLZ("VideoSRLut: call VRSR module failed, %s", new Object[]{e.toString()}));
            C16880lQ.LLLLIIL(e);
        }
        return iArr;
    }

    public VideoSRLutDsp() {
        Logging.d("New VideoSRLutDsp.");
    }

    public int Process() {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        m mVar = new m();
        if (this.srFunc == null) {
            return -1;
        }
        try {
            Logging.d("VideoSRLutDsp: call dsp process");
            Object[] call = this.srFunc.call(mVar);
            Logging.d("VideoSRLutDsp: dsp process end");
            return 0;
        } catch (Exception e) {
            Logging.d(C16880lQ.LLLZ("VideoSRLutDsp: call VRSR module failed, %s", new Object[]{e.toString()}));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public static VideoSRLutDspAPI createVideoSRLutDspAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VideoSRLutDspAPI.class, z);
        if (LIZ != null) {
            return (VideoSRLutDspAPI) LIZ;
        }
        if (C58096Mr6.LJIIJJI == null) {
            synchronized (VideoSRLutDspAPI.class) {
                if (C58096Mr6.LJIIJJI == null) {
                    C58096Mr6.LJIIJJI = new VideoSRLutDsp();
                }
            }
        }
        return (VideoSRLutDsp) C58096Mr6.LJIIJJI;
    }

    public boolean Init(int i, int i2, String str) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        this.srModuleInfo = new ModuleInfo("SrLutDspModule", "c++", "libbmf_hydra.so", "");
        Class[] clsArr = {m.class};
        Class[] clsArr2 = {m.class};
        this.srOption.LJJIIJ("width", Integer.valueOf(i));
        this.srOption.LJJIIJ("height", Integer.valueOf(i2));
        this.currWidth = i;
        this.currHeight = i2;
        if (str != null && str != "") {
            this.srOption.LJJIIZ("dsp_so_path", str);
        }
        try {
            Logging.d("VideoSRLutDsp init: load VRSR Module");
            this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
            Logging.d("VideoSRLut initDsp: load VRSR Module success");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSRLutDsp init: load video sr lut Module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
