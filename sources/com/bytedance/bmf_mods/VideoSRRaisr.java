package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import android.graphics.Bitmap;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.VideoSRRaisrAPI;
import com.bytedance.hmp.ChannelFormat;
import com.bytedance.hmp.Frame;
import com.bytedance.hmp.Image;
import com.bytedance.hmp.PixelFormat;
import com.google.gson.g;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class VideoSRRaisr implements VideoSRRaisrAPI {
    public int scale_type;
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;
    public int data_type = 0;
    public final int SR_R_TYPE = 0;
    public final int SR_R15_TYPE = 4;

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public VideoSRRaisr() {
        Logging.d("New VideoSRRaisr");
    }

    public static VideoSRRaisrAPI createVideoSRRaisrAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VideoSRRaisrAPI.class, z);
        if (LIZ != null) {
            return (VideoSRRaisrAPI) LIZ;
        }
        if (C58096Mr6.LJIIL == null) {
            synchronized (VideoSRRaisrAPI.class) {
                if (C58096Mr6.LJIIL == null) {
                    C58096Mr6.LJIIL = new VideoSRRaisr();
                }
            }
        }
        return (VideoSRRaisr) C58096Mr6.LJIIL;
    }

    public Bitmap Process(Bitmap bitmap, int i, int i2, boolean z) {
        Image image;
        int i3;
        int i4;
        Image image2;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return null;
        }
        if (this.data_type != 1) {
            Logging.d("SR_RAISR_Module: only receive bitmap");
            return null;
        }
        if (this.srFunc == null) {
            Logging.d("SR_RAISR_Module: ModuleFunctor is null");
            return null;
        }
        Frame frame = new Frame(bitmap);
        PixelFormat format = frame.format();
        PixelFormat pixelFormat = PixelFormat.PF_RGBA32;
        if (format == pixelFormat) {
            image = frame.toImage(ChannelFormat.kNHWC);
        } else {
            image = null;
        }
        if (image == null) {
            Logging.d("VideoSRRaisr: srcImage is null");
            return null;
        }
        int width = image.width();
        int height = image.height();
        long dataPtr = image.data().dataPtr();
        int i5 = this.scale_type;
        if (i5 == 0) {
            i3 = (width / 2) * 3;
            i4 = (height / 2) * 3;
        } else if (i5 == 1) {
            i3 = width * 2;
            i4 = height * 2;
        } else {
            Logging.d("VideoSRRaisr: scale_type is neither 0 nor 1");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Frame frame2 = new Frame(createBitmap);
        if (frame2.format() == pixelFormat) {
            image2 = frame2.toImage(ChannelFormat.kNHWC);
        } else {
            image2 = null;
        }
        if (image2 == null) {
            Logging.d("VideoSRRaisr: dstImage is null");
            return null;
        }
        long dataPtr2 = image2.data().dataPtr();
        m mVar = new m();
        mVar.LJJIIJ("input_width", Integer.valueOf(width));
        mVar.LJJIIJ("input_height", Integer.valueOf(height));
        mVar.LJJIIJ("input_dataPtr", Long.valueOf(dataPtr));
        mVar.LJJIIJ("output_dataPtr", Long.valueOf(dataPtr2));
        try {
            this.srFunc.call(mVar);
            return createBitmap;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSRRaisr: call raisr module failed,");
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
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        if (this.data_type != 0) {
            Logging.d("SR_RAISR_Module: Process function only receive texture2D");
            return -1;
        }
        if (this.srFunc == null) {
            Logging.d("SR_RAISR_Module: ModuleFunctor is null");
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
            LIZ.append("VideoSRRaisr: call raisr module failed,");
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
            if (i4 == 1) {
                Logging.d("SR_RAISR_Module: data type cannot transfer to OES texture");
                return false;
            }
            this.data_type = 2;
        } else if (i4 == 1) {
            this.data_type = 1;
        } else {
            this.data_type = 0;
        }
        if (i == 0) {
            this.scale_type = 1;
        } else if (i == 4) {
            this.scale_type = 0;
        } else {
            Logging.d("SR_RAISR_Module: algType param is neither 4 nor 0");
            return false;
        }
        this.srOption.LJJIIJ("scale_type", Integer.valueOf(this.scale_type));
        this.srOption.LJJIIJ("data_type", Integer.valueOf(this.data_type));
        this.srModuleInfo = new ModuleInfo("SR_RAISR_Module", "c++", "libbmf_hydra.so", "");
        Class[] clsArr = {m.class};
        Class[] clsArr2 = {m.class};
        try {
            Logging.d("SR_RAISR_Module: load raisr Module");
            this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
            Logging.d("SR_RAISR_Module: load raisr Module success");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SR_RAISR_Module: load raisr Module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public int OesProcess(int i, int i2, int i3, int i4, float[] fArr, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        if (this.data_type != 2) {
            Logging.d("SR_RAISR_Module: OesProcess function only receive oes texture");
            return -1;
        }
        if (this.srFunc == null) {
            Logging.d("SR_RAISR_Module: ModuleFunctor is null");
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
            LIZ.append("VideoSRRaisr: call raisr module failed,");
            LIZ.append(e.toString());
            Logging.d(X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }
}
