package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import android.opengl.GLES20;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.GLUtils;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.VideoSRLutAPI;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class VideoSRLut implements VideoSRLutAPI {
    public int algType;
    public int currHeight;
    public int currOutputTexture;
    public int currWidth;
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;
    public int oes_flag = 0;
    public int SR_R_TYPE = 0;
    public int SR_R15_TYPE = 4;

    public int AsyncWait() {
        if (this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("async_wait", 1);
        try {
            Logging.d("VideoSRLut: async process, wait.");
            Object[] call = this.srFunc.call(mVar);
            Logging.d("VideoSRLut: async wait finish.");
            return 0;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSRLut: call VRSR module failed, %s");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public int ClearClBuffer() {
        if (this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("clear_cl_buffer", 1);
        try {
            Logging.d("VideoSRLut: clear opencl buffer start.");
            Object[] call = this.srFunc.call(mVar);
            Logging.d("VideoSRLut: clear opencl buffer finish.");
            return 0;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSRLut: clear opencl buffer failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public VideoSRLut() {
        Logging.d("New VideoSRLut");
    }

    public static VideoSRLutAPI createVideoSRLutAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VideoSRLutAPI.class, z);
        if (LIZ != null) {
            return (VideoSRLutAPI) LIZ;
        }
        if (C58096Mr6.LJIIJ == null) {
            synchronized (VideoSRLutAPI.class) {
                if (C58096Mr6.LJIIJ == null) {
                    C58096Mr6.LJIIJ = new VideoSRLut();
                }
            }
        }
        return (VideoSRLut) C58096Mr6.LJIIJ;
    }

    public boolean Init(int i) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        if (i == this.SR_R_TYPE) {
            this.srOption.LJJIIJ("scale", Double.valueOf(2.0d));
            this.srOption.LJJIIJ("data_type", 1);
            this.srModuleInfo = new ModuleInfo("SR_LUT_Module", "c++", "libbmf_hydra.so", "");
            Class[] clsArr = {m.class};
            Class[] clsArr2 = {m.class};
            try {
                Logging.d("VideoSRLut: load SRLut Module");
                this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
                Logging.d("VideoSRLut: load SRLut Module success");
                return true;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoSRLut: load video sr lut Module failed,");
                LIZ.append(e.toString());
                Logging.d(X1D.LIZIZ(LIZ));
                return false;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VideoSRLut: unsupported algoType=");
        LIZ2.append(i);
        Logging.d(X1D.LIZIZ(LIZ2));
        return false;
    }

    public int AsyncProcess(int i, int i2, int i3, int i4, boolean z) {
        if (this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("input_texture", Integer.valueOf(i));
        mVar.LJJIIJ("output_texture", Integer.valueOf(i2));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        mVar.LJJIIJ("async", 1);
        try {
            Logging.d("VideoSRLut: async call");
            Object[] call = this.srFunc.call(mVar);
            Logging.d("VideoSRLut: async call end");
            return i2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSRLut: async call VRSR module failed, ");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public boolean GlSrInit(String str, int i, boolean z, int i2, int i3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        if (z) {
            this.oes_flag = 1;
        }
        if (i == 0) {
            this.srOption.LJJIIJ("scale", Double.valueOf(2.0d));
            this.srOption.LJJIIJ("gl_sr", 1);
            this.srModuleInfo = new ModuleInfo("SR_LUT_Module", "c++", "libbmf_hydra.so", "");
            Class[] clsArr = {m.class};
            Class[] clsArr2 = {m.class};
            try {
                Logging.d("VideoSRLut: load VRSR Module");
                this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
                Logging.d("VideoSRLut: load VRSR Module success");
                Logging.d(C16880lQ.LLLZ("BMF_gl_sr proces time:%d ms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
                return true;
            } catch (Exception e) {
                Logging.d(C16880lQ.LLLZ("VideoSRLut: load video sr lut Module failed, %s", new Object[]{e.toString()}));
                return false;
            }
        }
        Logging.d(C16880lQ.LLLZ("VideoSRLut: unsupported algoType=%d", new Object[]{Integer.valueOf(i)}));
        return false;
    }

    public boolean Init(String str, int i, boolean z, int i2, int i3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        if (z) {
            this.oes_flag = 1;
        }
        if (i == this.SR_R_TYPE) {
            this.srOption.LJJIIJ("scale", Double.valueOf(2.0d));
            this.srModuleInfo = new ModuleInfo("SR_LUT_Module", "c++", "libbmf_hydra.so", "");
            Class[] clsArr = {m.class};
            Class[] clsArr2 = {m.class};
            try {
                Logging.d("VideoSRLut: load SRLut Module");
                this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
                Logging.d("VideoSRLut: load SRLut Module success");
                return true;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoSRLut: load video sr lut Module failed,");
                LIZ.append(e.toString());
                Logging.d(X1D.LIZIZ(LIZ));
                return false;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VideoSRLut: unsupported algoType=");
        LIZ2.append(i);
        Logging.d(X1D.LIZIZ(LIZ2));
        return false;
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
        try {
            return i2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSRLut: call SRLut module failed, ");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public boolean Init(String str, int i, boolean z, int i2, int i3, String str2) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        if (z) {
            this.oes_flag = 1;
        }
        if (i == this.SR_R_TYPE) {
            this.srOption.LJJIIJ("scale", Double.valueOf(2.0d));
            this.srOption.LJJIIZ("license_module_name", str2);
            this.srModuleInfo = new ModuleInfo("SR_LUT_Module", "c++", "libbmf_hydra.so", "");
            Class[] clsArr = {m.class};
            Class[] clsArr2 = {m.class};
            try {
                Logging.d("VideoSRLut: load SRLut Module");
                this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
                Logging.d("VideoSRLut: load SRLut Module success");
                return true;
            } catch (Exception e) {
                Logging.d(C16880lQ.LLLZ("VideoSRLut: load video sr lut Module failed, %s", new Object[]{e.toString()}));
                return false;
            }
        }
        Logging.d(C16880lQ.LLLZ("VideoSRLut: unsupported algoType=%d", new Object[]{Integer.valueOf(i)}));
        return false;
    }

    public int Process(long j, long j2, long j3, int i, int i2, int i3, int i4) {
        double d;
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return -1;
        }
        if (i3 != this.currWidth || i4 != this.currHeight) {
            GLUtils.deleteTexture(this.currOutputTexture);
            this.currWidth = i3;
            this.currHeight = i4;
            if (this.algType == 0) {
                d = 2.0d;
            } else {
                d = 1.5d;
            }
            int genTexture = GLUtils.genTexture(3553);
            this.currOutputTexture = genTexture;
            GLES20.glBindTexture(3553, genTexture);
            GLES20.glTexImage2D(3553, 0, 6408, (int) (i3 * d), (int) (d * i4), 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
        m mVar = new m();
        mVar.LJJIIJ("y_ptr", Long.valueOf(j));
        mVar.LJJIIJ("u_ptr", Long.valueOf(j2));
        mVar.LJJIIJ("v_ptr", Long.valueOf(j3));
        mVar.LJJIIJ("color_space", Integer.valueOf(i));
        mVar.LJJIIJ("color_range", Integer.valueOf(i2));
        mVar.LJJIIJ("output_texture", Integer.valueOf(this.currOutputTexture));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        try {
            return this.currOutputTexture;
        } catch (Exception e) {
            Logging.d("VideoSRLut: call SRLut module failed, " + e.toString());
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }
}
