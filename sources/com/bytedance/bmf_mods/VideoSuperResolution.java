package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import X.X1D;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.bytedance.bmf.JsonParam;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.BmfUtils;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.VideoSuperResolutionAPI;
import com.bytedance.hmp.ChannelFormat;
import com.bytedance.hmp.Frame;
import com.bytedance.hmp.Image;
import com.bytedance.hmp.PixelFormat;
import com.google.gson.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes34.dex */
public class VideoSuperResolution implements VideoSuperResolutionAPI {
    public m srOption = new m();
    public ModuleInfo srModuleInfo = null;
    public ModuleFunctor srFunc = null;
    public int scaleType = 0;
    public int algType_ = -1;
    public int mBackend = 0;
    public long mNativePtr = 0;

    private native long nativeCreateSuperResolution();

    private native int nativeInitSuperResolution(long j, int i, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3);

    private native void nativeReleaseSuperResolution(long j);

    private native int nativeSuperResolutionGetResultTexture(long j);

    private native int nativeSuperResolutionOesProcess(long j, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2);

    private native int nativeSuperResolutionOesProcessMultiScale(long j, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, int i10);

    private native int nativeSuperResolutionProcess(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2);

    private native int nativeSuperResolutionProcessBitmap(long j, Bitmap bitmap, Bitmap bitmap2);

    private native int nativeSuperResolutionProcessBitmapMultiScale(long j, Bitmap bitmap, Bitmap bitmap2, int i, int i2);

    private native int nativeSuperResolutionProcessMultiScale(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, int i10);

    private native int nativeSuperResolutionProcessYuv(long j, long j2, long j3, long j4, int i, int i2, int i3, int i4);

    public void Free() {
        ModuleFunctor moduleFunctor = this.srFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
        long j = this.mNativePtr;
        if (j != 0) {
            nativeReleaseSuperResolution(j);
        }
    }

    public VideoSuperResolution() {
        Logging.d("New VideoSuperResolution");
    }

    public VideoSuperResolution(Context context) {
        Logging.d("New VideoSuperResolution with context");
        SoLoader.getInstance().setContext(context);
    }

    public static VideoSuperResolutionAPI createVideoSuperResolutionAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VideoSuperResolutionAPI.class, z);
        if (LIZ != null) {
            return (VideoSuperResolutionAPI) LIZ;
        }
        if (C58096Mr6.LJIILIIL == null) {
            synchronized (VideoSuperResolutionAPI.class) {
                if (C58096Mr6.LJIILIIL == null) {
                    C58096Mr6.LJIILIIL = new VideoSuperResolution();
                }
            }
        }
        return (VideoSuperResolution) C58096Mr6.LJIILIIL;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public Bitmap ProcessBitmap(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        Image image;
        int i5;
        int i6;
        Image image2;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return null;
        }
        if (this.algType_ <= 2) {
            if (this.srFunc == null) {
                return null;
            }
            if (bitmap == null) {
                Logging.d("VideoSuperResolution: srcBmp is null");
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
                Logging.d("VideoSuperResolution: srcImage is null");
                return null;
            }
            int width = image.width();
            int height = image.height();
            long dataPtr = image.data().dataPtr();
            int i7 = this.scaleType;
            if (i7 == 0) {
                i5 = width * 2;
                i6 = height * 2;
            } else if (i7 == 1) {
                i5 = (width * 3) / 2;
                i6 = (height * 3) / 2;
            } else {
                Logging.d("VideoSuperResolution: scaleType is neither 0 nor 1");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            Frame frame2 = new Frame(createBitmap);
            if (frame2.format() == pixelFormat) {
                image2 = frame2.toImage(ChannelFormat.kNHWC);
            } else {
                image2 = null;
            }
            if (image2 == null) {
                Logging.d("VideoSuperResolution: dstImage is null");
                return null;
            }
            long dataPtr2 = image2.data().dataPtr();
            int rowBytes = bitmap.getRowBytes();
            int rowBytes2 = createBitmap.getRowBytes();
            if (rowBytes < width || rowBytes2 < i5) {
                Logging.d("VideoSuperResolution: bitmap stride is smaller than bitmap width");
                return null;
            }
            JsonParam jsonParam = new JsonParam();
            try {
                jsonParam.set("mode", 0);
                jsonParam.set("input_data_type", 4);
                jsonParam.set("width", Integer.valueOf(width));
                jsonParam.set("height", Integer.valueOf(height));
                jsonParam.set("input_stride", Integer.valueOf(rowBytes));
                jsonParam.set("output_stride", Integer.valueOf(rowBytes2));
                jsonParam.set("input_dataPtr", Long.valueOf(dataPtr));
                jsonParam.set("output_dataPtr", Long.valueOf(dataPtr2));
                Object[] call = this.srFunc.call(jsonParam);
                if (call == null || ((JsonParam) call[0]).getInt("output_texture") == -1) {
                    createBitmap.recycle();
                    createBitmap = null;
                }
                jsonParam.free();
                frame.free();
                frame.unlock(bitmap);
                image.free();
                frame2.free();
                frame2.unlock(createBitmap);
                image2.free();
                return createBitmap;
            } catch (Exception e) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("VideoSuperResolution: call VideoSuperResolution module failed, ");
                    LIZ.append(e.toString());
                    Logging.d(X1D.LIZIZ(LIZ));
                    C16880lQ.LLLLIIL(e);
                    jsonParam.free();
                    frame.free();
                    frame.unlock(bitmap);
                    image.free();
                    frame2.free();
                    frame2.unlock(createBitmap);
                    image2.free();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    jsonParam.free();
                    frame.free();
                    frame.unlock(bitmap);
                    image.free();
                    frame2.free();
                    frame2.unlock(createBitmap);
                    image2.free();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jsonParam.free();
                frame.free();
                frame.unlock(bitmap);
                image.free();
                frame2.free();
                frame2.unlock(createBitmap);
                image2.free();
                throw th;
            }
        }
        if (bitmap == null || this.mNativePtr == 0) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int i8 = this.scaleType;
        if (i8 == 0) {
            i3 = width2 * 2;
            i4 = height2 * 2;
        } else if (i8 == 1) {
            i3 = (width2 * 3) / 2;
            i4 = (height2 * 3) / 2;
        } else {
            Logging.d("VideoSuperResolution: scaleType is neither 0 nor 1");
            return null;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        if (nativeSuperResolutionProcessBitmap(this.mNativePtr, bitmap, createBitmap2) < 0) {
            createBitmap2.recycle();
            return null;
        }
        return createBitmap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap ProcessMultiScaleBitmap(android.graphics.Bitmap r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bmf_mods.VideoSuperResolution.ProcessMultiScaleBitmap(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    public int ProcessTexture(int i, int i2, int i3) {
        return ProcessTexture(i, i2, i3, 0, 0, 0, 0, 0, 0L);
    }

    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr) {
        return ProcessOesTexture(i, i2, i3, fArr, 0, 0, 0, 0, 0, 0L);
    }

    public int Init(int i, int i2, int i3, int i4, String str, String str2) {
        return Init(i, i2, i3, i4, str, str2, "");
    }

    public int Init(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        return Init(i, i2, i3, i4, str, str2, str3, 0, 0);
    }

    public int ProcessYuv420p(long j, long j2, long j3, int i, int i2, int i3, int i4) {
        JsonParam jsonParam;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        if (this.algType_ <= 2) {
            if (this.srFunc == null) {
                return -1;
            }
            JsonParam jsonParam2 = new JsonParam();
            JsonParam jsonParam3 = null;
            try {
                try {
                    jsonParam2.set("mode", 0);
                    jsonParam2.set("input_data_type", 3);
                    jsonParam2.set("y_ptr", Long.valueOf(j));
                    jsonParam2.set("u_ptr", Long.valueOf(j2));
                    jsonParam2.set("v_ptr", Long.valueOf(j3));
                    jsonParam2.set("color_space", Integer.valueOf(i));
                    jsonParam2.set("color_range", Integer.valueOf(i2));
                    jsonParam2.set("width", Integer.valueOf(i3));
                    jsonParam2.set("height", Integer.valueOf(i4));
                    jsonParam = (JsonParam) this.srFunc.call(jsonParam2)[0];
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                int i5 = jsonParam.getInt("output_texture");
                jsonParam2.free();
                jsonParam.free();
                return i5;
            } catch (Exception e2) {
                e = e2;
                jsonParam3 = jsonParam;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoSuperResolution: call VideoSuperResolution module failed, ");
                LIZ.append(e.toString());
                Logging.d(X1D.LIZIZ(LIZ));
                C16880lQ.LLLLIIL(e);
                jsonParam2.free();
                if (jsonParam3 != null) {
                    jsonParam3.free();
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                jsonParam3 = jsonParam;
                jsonParam2.free();
                if (jsonParam3 != null) {
                    jsonParam3.free();
                }
                throw th;
            }
        }
        long j4 = this.mNativePtr;
        if (j4 == 0 || nativeSuperResolutionProcessYuv(j4, j, j2, j3, i3, i4, i, i2) != 0) {
            return -1;
        }
        return nativeSuperResolutionGetResultTexture(this.mNativePtr);
    }

    public int Init(int i, int i2, int i3, int i4, String str, String str2, String str3, int i5, int i6) {
        String str4 = str;
        int i7 = i4;
        String str5 = str2;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        this.scaleType = i3;
        this.algType_ = i;
        this.mBackend = i2;
        if (i < 0 || i > 10 || i2 < 0 || i2 > 4) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSuperResolution: alg_type or backend is not support. check input param  alg_type:");
            LIZ.append(i);
            LIZ.append(" backend:");
            LIZ.append(i2);
            LIZ.append(" scale_type:");
            LIZ.append(i3);
            LIZ.append(" pool_size:");
            LIZ.append(i7);
            LIZ.append(" libpath:");
            LIZ.append(str4);
            LIZ.append(" licenseModuleName:");
            LIZ.append(str5);
            LIZ.append(" programCacheDir:");
            LIZ.append(str3);
            LIZ.append(" max_width:");
            LIZ.append(i5);
            LIZ.append(" max_height:");
            LIZ.append(i6);
            Logging.d(X1D.LIZIZ(LIZ));
            return -1;
        }
        String str6 = "";
        if (i <= 2) {
            if (i3 == 2) {
                this.scaleType = 0;
            }
            this.srOption.LJJIIJ("backend", Integer.valueOf(i2));
            this.srOption.LJJIIJ("alg_type", Integer.valueOf(i));
            this.srOption.LJJIIJ("scale_type", Integer.valueOf(this.scaleType));
            if (i7 <= 0) {
                Logging.d("VideoSuperResolution: pool size should be more than 0, change to 6 for default");
                i7 = 6;
            }
            this.srOption.LJJIIJ("pool_size", Integer.valueOf(i7));
            this.srOption.LJJIIZ("license_module_name", str5);
            this.srOption.LJJIIZ("program_cache_dir", str3);
            if (i5 > 0 && i6 > 0) {
                this.srOption.LJJIIJ("max_width", Integer.valueOf(i5));
                this.srOption.LJJIIJ("max_height", Integer.valueOf(i6));
            }
            this.srModuleInfo = new ModuleInfo("SuperResolutionModule", "c++", "libbmf_hydra.so", "");
            Class[] clsArr = {JsonParam.class};
            Class[] clsArr2 = {JsonParam.class};
            try {
                Logging.d("VideoSuperResolution: load VideoSuperResolution Module");
                this.srFunc = new ModuleFunctor(this.srModuleInfo, this.srOption, clsArr, clsArr2);
                Logging.d("VideoSuperResolution: load VideoSuperResolution Module success");
                return 0;
            } catch (Exception e) {
                Logging.d(C16880lQ.LLLZ("VideoSuperResolution: load VideoSuperResolution Module failed, %s", new Object[]{e.toString()}));
                return -1;
            }
        }
        if (i2 == 4) {
            File file = new File(str4, "libhexagonAlg_skel.so");
            if (!file.exists() || !file.isFile() || file.length() <= 0 || !BmfUtils.fileMd5(file).equalsIgnoreCase("")) {
                if (SoLoader.getInstance().getAppContext() == null) {
                    return -1;
                }
                AssetManager assets = SoLoader.getInstance().getAppContext().getAssets();
                File file2 = new File(str4);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                try {
                    InputStream open = assets.open("libhexagonAlg_skel.so");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = open.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            open.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("VideoSuperResolution: get dsp so failed, ");
                    LIZ2.append(e2.toString());
                    Logging.d(X1D.LIZIZ(LIZ2));
                    C16880lQ.LLLLIIL(e2);
                    return -1;
                }
            }
        }
        long nativeCreateSuperResolution = nativeCreateSuperResolution();
        this.mNativePtr = nativeCreateSuperResolution;
        if (nativeCreateSuperResolution == 0) {
            return -1;
        }
        int i8 = i - 3;
        if (i8 < 4 && this.scaleType == 2) {
            this.scaleType = 0;
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        if (str3 != null) {
            str6 = str3;
        }
        return nativeInitSuperResolution(nativeCreateSuperResolution, i8, i2, this.scaleType, i7, i5, i6, str4, str5, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int ProcessTexture(int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, long r32) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bmf_mods.VideoSuperResolution.ProcessTexture(int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int ProcessOesTexture(int r24, int r25, int r26, float[] r27, int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bmf_mods.VideoSuperResolution.ProcessOesTexture(int, int, int, float[], int, int, int, int, int, long):int");
    }

    public int ProcessMultiScaleTexture(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10) {
        JsonParam jsonParam;
        int i11 = i4;
        long j2 = j;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        int i15 = this.algType_;
        if (i15 <= 2) {
            if (i11 < 0 || i12 < 0 || i11 + i13 > i2 || i12 + i14 > i3 || ((i8 != 0 && i8 != 1) || j2 < 0 || (j2 >> 32) > 0)) {
                Logging.d("VideoSuperResolution: ROI param incorrect");
                return -1;
            }
            if (i8 == 0) {
                j2 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (((i15 != 0 && i15 != 2) || (i10 != 0 && i10 != 1 && i10 != 2)) && (i15 != 1 || (i10 != 0 && i10 != 2))) {
                return -1;
            }
            JsonParam jsonParam2 = new JsonParam();
            JsonParam jsonParam3 = null;
            try {
                try {
                    jsonParam2.set("mode", 0);
                    jsonParam2.set("input_data_type", 0);
                    jsonParam2.set("input_texture", Integer.valueOf(i));
                    jsonParam2.set("width", Integer.valueOf(i2));
                    jsonParam2.set("height", Integer.valueOf(i3));
                    jsonParam2.set("in_roi_w_start", Integer.valueOf(i11));
                    jsonParam2.set("in_roi_h_start", Integer.valueOf(i12));
                    jsonParam2.set("in_roi_w", Integer.valueOf(i13));
                    jsonParam2.set("in_roi_h", Integer.valueOf(i14));
                    jsonParam2.set("roi_mode", Integer.valueOf(i8));
                    jsonParam2.set("roiBackground", Long.valueOf(j2));
                    jsonParam = (JsonParam) this.srFunc.call(jsonParam2)[0];
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                int i16 = jsonParam.getInt("output_texture");
                jsonParam2.free();
                jsonParam.free();
                return i16;
            } catch (Exception e2) {
                e = e2;
                jsonParam3 = jsonParam;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoSuperResolution: call VideoSuperResolution module failed, ");
                LIZ.append(e.toString());
                Logging.d(X1D.LIZIZ(LIZ));
                C16880lQ.LLLLIIL(e);
                jsonParam2.free();
                if (jsonParam3 != null) {
                    jsonParam3.free();
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                jsonParam3 = jsonParam;
                jsonParam2.free();
                if (jsonParam3 != null) {
                    jsonParam3.free();
                }
                throw th;
            }
        }
        long j3 = this.mNativePtr;
        if (j3 == 0) {
            return -1;
        }
        if (i15 < 7) {
            int i17 = this.scaleType;
            if ((i17 == i10 || (i17 == 0 && i10 == 2)) && nativeSuperResolutionProcess(j3, i, i2, i3, i11, i12, i13, i14, i8, j2) == 0) {
                return nativeSuperResolutionGetResultTexture(this.mNativePtr);
            }
        } else if (nativeSuperResolutionProcessMultiScale(j3, i, i2, i3, i11, i12, i13, i14, i8, j2, i9, i10) == 0) {
            return nativeSuperResolutionGetResultTexture(this.mNativePtr);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int ProcessMultiScaleOesTexture(int r31, int r32, int r33, float[] r34, int r35, int r36, int r37, int r38, int r39, long r40, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bmf_mods.VideoSuperResolution.ProcessMultiScaleOesTexture(int, int, int, float[], int, int, int, int, int, long, int, int):int");
    }
}
