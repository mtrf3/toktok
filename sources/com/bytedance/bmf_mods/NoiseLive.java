package com.bytedance.bmf_mods;

import X.C16880lQ;
import X.C58096Mr6;
import android.content.Context;
import com.bytedance.bmf.JsonParam;
import com.bytedance.bmf.ModuleFunctor;
import com.bytedance.bmf.ModuleInfo;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods.downloader.BmfDownloader;
import com.bytedance.bmf_mods_api.NoiseLiveAPI;
import com.bytedance.bmf_mods_api.c;
import com.google.gson.m;
import java.util.Map;

/* loaded from: classes34.dex */
public class NoiseLive implements NoiseLiveAPI {
    public BmfDownloader bmfDownloader;
    public c noiseLiveCallback;
    public m noiseOption = new m();
    public ModuleInfo noiseModuleInfo = null;
    public ModuleFunctor noiseFunc = null;
    public final StringBuilder modelPathBuilder = new StringBuilder();

    public void Free() {
        ModuleFunctor moduleFunctor = this.noiseFunc;
        if (moduleFunctor != null) {
            moduleFunctor.free();
        }
    }

    public NoiseLive() {
        Logging.d("New NoiseLive");
    }

    public static NoiseLiveAPI createNoiseLiveAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(NoiseLiveAPI.class, z);
        if (LIZ != null) {
            return (NoiseLiveAPI) LIZ;
        }
        if (C58096Mr6.LJII == null) {
            synchronized (NoiseLiveAPI.class) {
                if (C58096Mr6.LJII == null) {
                    C58096Mr6.LJII = new NoiseLive();
                }
            }
        }
        return (NoiseLive) C58096Mr6.LJII;
    }

    public boolean Init(int i) {
        return Init(i, 0);
    }

    public void SetCallback(c cVar) {
        this.noiseLiveCallback = cVar;
    }

    public void DownloadModel(Context context, Map<String, String> map) {
        if (this.bmfDownloader == null) {
            this.bmfDownloader = new BmfDownloader(context);
        }
        if (!map.containsKey("accessKey") || !map.containsKey("appID") || !map.containsKey("appVersion") || !map.containsKey("platformSdkVersion") || !map.containsKey("deviceId") || !map.containsKey("host")) {
            return;
        }
        this.bmfDownloader.download("noiselive", "NoiseModelDir", "NoiseLive", "10.6.0", this.modelPathBuilder, map, this.noiseLiveCallback);
    }

    public boolean Init(int i, int i2) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            Logging.d("NoiseLive: so has not been initialized");
            return false;
        }
        if (i2 != 0 && i2 != 1) {
            Logging.d("NoiseLive: byteNNForwardType is not 0 or 1");
            return false;
        }
        this.noiseOption.LJJIIJ("numThread", Integer.valueOf(i));
        this.noiseOption.LJJIIJ("byteNNForwardType", Integer.valueOf(i2));
        if (this.modelPathBuilder.length() > 0) {
            this.noiseOption.LJJIIZ("model_path", this.modelPathBuilder.toString());
        }
        this.noiseModuleInfo = new ModuleInfo("NOISE_LIVE_Module", "c++", "libbmf_hydra.so", "");
        Class[] clsArr = {JsonParam.class};
        Class[] clsArr2 = {JsonParam.class};
        try {
            Logging.d("NoiseLive: load NoiseLive Module");
            this.noiseFunc = new ModuleFunctor(this.noiseModuleInfo, this.noiseOption, clsArr, clsArr2);
            Logging.d("NoiseLive: load NoiseLive Module success");
            return true;
        } catch (Exception e) {
            Logging.d(C16880lQ.LLLZ("NoiseLive: load Noise Live Module failed, %s", new Object[]{e.toString()}));
            return false;
        }
    }

    public float Process(int i, int i2, int i3) {
        JsonParam jsonParam;
        if (!SoLoader.getInstance().isSoInitialized() || this.noiseFunc == null) {
            return -1.0f;
        }
        JsonParam jsonParam2 = new JsonParam();
        JsonParam jsonParam3 = null;
        try {
            try {
                jsonParam2.set("input_texture", Integer.valueOf(i));
                jsonParam2.set("width", Integer.valueOf(i2));
                jsonParam2.set("height", Integer.valueOf(i3));
                jsonParam = (JsonParam) this.noiseFunc.call(jsonParam2)[0];
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            float f = jsonParam.getFloat("noiselive_res");
            jsonParam2.free();
            jsonParam.free();
            return f;
        } catch (Exception e2) {
            e = e2;
            jsonParam3 = jsonParam;
            Logging.d(C16880lQ.LLLZ("NoiseLive: call NoiseLive module failed, %s", new Object[]{e.toString()}));
            C16880lQ.LLLLIIL(e);
            jsonParam2.free();
            if (jsonParam3 != null) {
                jsonParam3.free();
            }
            return -1.0f;
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
}
