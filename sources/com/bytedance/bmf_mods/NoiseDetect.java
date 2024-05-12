package com.bytedance.bmf_mods;

import X.C58096Mr6;
import android.content.Context;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods.downloader.BmfDownloader;
import com.bytedance.bmf_mods_api.NoiseDetectAPI;
import com.bytedance.bmf_mods_api.b;
import java.io.File;
import java.util.Map;

/* loaded from: classes34.dex */
public class NoiseDetect implements NoiseDetectAPI {
    public BmfDownloader bmfDownloader;
    public long mNativePtr;
    public final StringBuilder modelPathBuilder = new StringBuilder();
    public b noiseDetectCallback;

    private native long nativeCreateNoiseDetect();

    private native int nativeInitNoiseDetect(long j, int i, int i2, String str, boolean z, String str2);

    private native float nativeNoiseDetectProcess(long j, int i, int i2, int i3);

    private native void nativeReleaseNoiseDetect(long j);

    @Override // com.bytedance.bmf_mods_api.NoiseDetectAPI
    public void Free() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseNoiseDetect(j);
    }

    public NoiseDetect() {
        Logging.d("New  NoiseDetect");
    }

    public static NoiseDetectAPI createNoiseDetectAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(NoiseDetectAPI.class, z);
        if (LIZ != null) {
            return (NoiseDetectAPI) LIZ;
        }
        if (C58096Mr6.LJI == null) {
            synchronized (NoiseDetectAPI.class) {
                if (C58096Mr6.LJI == null) {
                    C58096Mr6.LJI = new NoiseDetect();
                }
            }
        }
        return (NoiseDetect) C58096Mr6.LJI;
    }

    @Override // com.bytedance.bmf_mods_api.NoiseDetectAPI
    public void SetCallback(b bVar) {
        this.noiseDetectCallback = bVar;
    }

    @Override // com.bytedance.bmf_mods_api.NoiseDetectAPI
    public void DownloadModel(Context context, Map<String, String> map) {
        if (this.bmfDownloader == null) {
            this.bmfDownloader = new BmfDownloader(context);
        }
        if (!map.containsKey("accessKey") || !map.containsKey("appID") || !map.containsKey("appVersion") || !map.containsKey("platformSdkVersion") || !map.containsKey("deviceId") || !map.containsKey("host")) {
            return;
        }
        this.bmfDownloader.download("noiselive", "NoiseModelDir", "NoiseLive", "10.6.0", this.modelPathBuilder, map, this.noiseDetectCallback);
    }

    @Override // com.bytedance.bmf_mods_api.NoiseDetectAPI
    public float Process(int i, int i2, int i3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1.0f;
        }
        long j = this.mNativePtr;
        if (j == 0 || i2 <= 0 || i3 <= 0) {
            return -1.0f;
        }
        return nativeNoiseDetectProcess(j, i, i2, i3);
    }

    @Override // com.bytedance.bmf_mods_api.NoiseDetectAPI
    public int Init(int i, int i2, boolean z, String str) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            Logging.d("NoiseDetect: so has not been initialized");
            return -1;
        }
        if (i2 != 0 && i2 != 1) {
            Logging.d("NoiseDetect: byteNNForwardType is not 0 or 1");
            return -1;
        }
        long nativeCreateNoiseDetect = nativeCreateNoiseDetect();
        this.mNativePtr = nativeCreateNoiseDetect;
        if (nativeCreateNoiseDetect == 0) {
            return -1;
        }
        if (this.modelPathBuilder.length() == 0 || !new File(this.modelPathBuilder.toString()).exists()) {
            Logging.d("modelPath is empty or file not exist");
            return -1;
        }
        return nativeInitNoiseDetect(this.mNativePtr, i, i2, this.modelPathBuilder.toString(), z, str);
    }
}
