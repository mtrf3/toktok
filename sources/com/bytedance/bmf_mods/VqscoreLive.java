package com.bytedance.bmf_mods;

import X.C58096Mr6;
import android.content.Context;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods.downloader.BmfDownloader;
import com.bytedance.bmf_mods_api.VqscoreLiveAPI;
import com.bytedance.bmf_mods_api.e;
import com.bytedance.bmf_mods_api.f;
import java.io.File;
import java.util.Map;

/* loaded from: classes34.dex */
public class VqscoreLive implements VqscoreLiveAPI {
    public BmfDownloader bmfDownloader;
    public long mNativePtr;
    public f mVqscoreProcessCallback;
    public final StringBuilder modelPathBuilder = new StringBuilder();
    public e vqscoreLiveCallback;

    private native long nativeCreateVqscoreLive();

    private native int nativeInitVqscoreLive(long j, int i, int i2, String str, boolean z, String str2, int i3);

    private native void nativeReleaseVqscoreLive(long j);

    private native float nativeVqscoreLiveProcess(long j, int i, int i2, int i3);

    private native int nativeVqscoreProcessAsync(long j, int i, int i2, int i3, long j2);

    private native int nativeVqscoreProcessOesAsync(long j, int i, int i2, int i3, float[] fArr, long j2);

    @Override // com.bytedance.bmf_mods_api.VqscoreLiveAPI
    public void Free() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseVqscoreLive(j);
    }

    public VqscoreLive() {
        Logging.d("New VqscoreLive");
    }

    public static VqscoreLiveAPI createVqscoreLiveAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(VqscoreLiveAPI.class, z);
        if (LIZ != null) {
            return (VqscoreLiveAPI) LIZ;
        }
        if (C58096Mr6.LJIILJJIL == null) {
            synchronized (VqscoreLiveAPI.class) {
                if (C58096Mr6.LJIILJJIL == null) {
                    C58096Mr6.LJIILJJIL = new VqscoreLive();
                }
            }
        }
        return (VqscoreLive) C58096Mr6.LJIILJJIL;
    }

    @Override // com.bytedance.bmf_mods_api.VqscoreLiveAPI
    public void SetCallback(e eVar) {
        this.vqscoreLiveCallback = eVar;
    }

    public void SetDownloadCallback(e eVar) {
        this.vqscoreLiveCallback = eVar;
    }

    public void SetProcessCallback(f fVar) {
        this.mVqscoreProcessCallback = fVar;
    }

    @Override // com.bytedance.bmf_mods_api.VqscoreLiveAPI
    public void DownloadModel(Context context, Map<String, String> map) {
        if (this.bmfDownloader == null) {
            this.bmfDownloader = new BmfDownloader(context);
        }
        if (!map.containsKey("accessKey") || !map.containsKey("host")) {
            return;
        }
        this.bmfDownloader.download("vqscore", "VqscoreModelDir", "VqscoreLive", "11.0.0", this.modelPathBuilder, map, this.vqscoreLiveCallback);
    }

    public int Init(int i, boolean z) {
        return Init(i, 0, z, "");
    }

    private void onNativeProcessCallback(long j, int i, float f) {
        f fVar = this.mVqscoreProcessCallback;
        if (fVar != null) {
            fVar.getClass();
        }
    }

    @Override // com.bytedance.bmf_mods_api.VqscoreLiveAPI
    public float Process(int i, int i2, int i3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1.0f;
        }
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1.0f;
        }
        return nativeVqscoreLiveProcess(j, i, i2, i3);
    }

    @Override // com.bytedance.bmf_mods_api.VqscoreLiveAPI
    public int Init(int i, int i2, boolean z, String str) {
        return Init(i, i2, z, str, -1);
    }

    public int ProcessAsync(int i, int i2, int i3, long j) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeVqscoreProcessAsync(j2, i, i2, i3, j);
    }

    public int Init(int i, int i2, boolean z, String str, int i3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            Logging.d("VqscoreLive: so has not been initialized");
            return -1;
        }
        if (i2 != 0 && i2 != 1) {
            Logging.d("VqscoreLive: byteNNForwardType is not 0 or 1");
            return -1;
        }
        long nativeCreateVqscoreLive = nativeCreateVqscoreLive();
        this.mNativePtr = nativeCreateVqscoreLive;
        if (nativeCreateVqscoreLive == 0) {
            return -1;
        }
        if (this.modelPathBuilder.length() == 0 || !new File(this.modelPathBuilder.toString()).exists()) {
            Logging.d("modelPath is empty or file not exist");
            return -1;
        }
        return nativeInitVqscoreLive(this.mNativePtr, i, i2, this.modelPathBuilder.toString(), z, str, i3);
    }

    public int ProcessOesAsync(int i, int i2, int i3, float[] fArr, long j) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0 || i2 <= 0 || i3 <= 0) {
            return -1;
        }
        return nativeVqscoreProcessOesAsync(j2, i, i2, i3, fArr, j);
    }
}
