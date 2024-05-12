package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import android.graphics.Bitmap;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf.VideoFrame;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.VideoOCLSRAPI;
import com.bytedance.hmp.Frame;
import com.google.gson.g;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class VideoOCLSR implements VideoOCLSRAPI {
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;
    public int oes_flag = 0;

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public VideoOCLSR() {
        Logging.d("New VideoOCLSR");
    }

    public static VideoOCLSRAPI createVideoOCLSRAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VideoOCLSRAPI.class, z);
        if (LIZ != null) {
            return (VideoOCLSRAPI) LIZ;
        }
        if (C58096Mr6.LJIIIZ == null) {
            synchronized (VideoOCLSRAPI.class) {
                if (C58096Mr6.LJIIIZ == null) {
                    C58096Mr6.LJIIIZ = new VideoOCLSR();
                }
            }
        }
        return (VideoOCLSR) C58096Mr6.LJIIIZ;
    }

    public Bitmap Process(Bitmap bitmap, int i, int i2, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return null;
        }
        VideoFrame videoFrame = new VideoFrame(new Frame(bitmap));
        try {
            VideoFrame videoFrame2 = (VideoFrame) this.srFunc.call(videoFrame)[0];
            Bitmap createBitmap = Bitmap.createBitmap(videoFrame2.width(), videoFrame2.height(), Bitmap.Config.ARGB_8888);
            VideoFrame videoFrame3 = new VideoFrame(new Frame(createBitmap));
            videoFrame3.copyFrom(videoFrame2);
            videoFrame.free();
            videoFrame2.free();
            videoFrame3.free();
            return createBitmap;
        } catch (Exception e) {
            videoFrame.free();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoOCLSR: call VRSR module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public boolean Init(String str, int i, boolean z, int i2, int i3) {
        return Init(str, i, z, i2, i3, 0);
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
            LIZ.append("VideoOCLSR: call VRSR module failed, %s");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public boolean Init(String str, int i, boolean z, int i2, int i3, int i4) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return false;
        }
        if (z) {
            this.oes_flag = 1;
        }
        this.srOption.LJJIIZ("config_path", str);
        if (i == 0) {
            this.srOption.LJJIIJ("scale", Double.valueOf(2.0d));
        } else if (i == 4) {
            this.srOption.LJJIIJ("scale", Double.valueOf(1.5d));
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoOCLSR: unsupported algoType=%d");
            LIZ.append(i);
            Logging.d(X1D.LIZIZ(LIZ));
            return false;
        }
        this.srOption.LJJIIJ("max_input_width", Integer.valueOf(i2));
        this.srOption.LJJIIJ("max_input_height", Integer.valueOf(i3));
        this.srOption.LJJIIZ("filter_path", "");
        this.srOption.LJJIIJ("format", Integer.valueOf(i4));
        this.srOption.LJJIIJ("color", 1);
        this.srOption.LJJIIJ("power", 4);
        this.srOption.LJJIIJ("backend", 2);
        this.srOption.LJJIIJ("pipeline", 1);
        this.srOption.LJJIIJ("oes_flag", Integer.valueOf(this.oes_flag));
        this.srModuleInfo = new ModuleInfo("VRSR_Module", "c++", "libvrsr.so", "");
        Class[] clsArr = {m.class};
        Class[] clsArr2 = {m.class};
        if (i4 == 1) {
            clsArr[0] = VideoFrame.class;
            clsArr2[0] = VideoFrame.class;
        }
        try {
            Logging.d("VideoOCLSR: load VRSR Module");
            this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
            Logging.d("VideoOCLSR: load VRSR Module success");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VideoOCLSR: load VRSR Module failed,");
            LIZ2.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ2));
            return false;
        }
    }

    public int OesProcess(int i, int i2, int i3, int i4, float[] fArr, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized() || this.srFunc == null) {
            return -1;
        }
        m mVar = new m();
        mVar.LJJIIJ("input_texture", Integer.valueOf(i));
        mVar.LJJIIJ("output_texture", Integer.valueOf(i2));
        mVar.LJJIIJ("width", Integer.valueOf(i3));
        mVar.LJJIIJ("height", Integer.valueOf(i4));
        if (this.oes_flag == 1) {
            g gVar = new g();
            for (float f : fArr) {
                gVar.LJJIII(Float.valueOf(f));
            }
            mVar.LJJII("matrix", gVar);
        }
        try {
            return i2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoOCLSR: call VRSR module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }
}
