package com.bytedance.vcloud.abrmodule;

import android.text.TextUtils;
import com.ss.ttm.player.ABRStrategy;
import com.ss.ttm.player.NativeABRStrategy;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class DefaultABRModule implements IABRModule {
    public int mAlgoType = -1;
    public long mHandle;

    public DefaultABRModule() {
        ABRJniLoader.loadLibrary();
        if (!ABRJniLoader.isLibraryLoaded) {
            return;
        }
        long _create = _create();
        this.mHandle = _create;
        _setIntValue(_create, 0, ABRConfig.getLogLevel());
        _setIntValue(this.mHandle, 1, ABRConfig.getSwitchSensitivity());
        _setIntValue(this.mHandle, 3, ABRConfig.getSwitchModel());
        _setIntValue(this.mHandle, 4, ABRConfig.getFixedLevel());
        _setIntValue(this.mHandle, 5, ABRConfig.getStartupModel());
        _setIntValue(this.mHandle, 37, ABRConfig.getStartupUseCache());
        _setIntValue(this.mHandle, 45, ABRConfig.getNarrowScreenUseWidth());
        _setFloatValue(this.mHandle, 8, ABRConfig.getStartupBandwidthParameter());
        _setFloatValue(this.mHandle, 9, ABRConfig.getStallPenaltyParameter());
        _setFloatValue(this.mHandle, 10, ABRConfig.getSwitchPenaltyParameter());
        _setFloatValue(this.mHandle, 11, ABRConfig.getBandwidthParameter());
        _setDoubleValue(this.mHandle, 29, ABRConfig.getStartupModelFirstParam());
        _setDoubleValue(this.mHandle, 30, ABRConfig.getStartupModelSecondParam());
        _setDoubleValue(this.mHandle, 31, ABRConfig.getStartupModelThirdParam());
        _setDoubleValue(this.mHandle, 32, ABRConfig.getStartupModelFourthParam());
        String abrStartupJson = ABRConfig.getAbrStartupJson();
        if (!TextUtils.isEmpty(abrStartupJson)) {
            _setStringValue(this.mHandle, 51, abrStartupJson);
        }
        String abrFlowJson = ABRConfig.getAbrFlowJson();
        if (!TextUtils.isEmpty(abrFlowJson)) {
            _setStringValue(this.mHandle, 52, abrFlowJson);
        }
        String abrPreloadJson = ABRConfig.getAbrPreloadJson();
        if (!TextUtils.isEmpty(abrPreloadJson)) {
            _setStringValue(this.mHandle, 50, abrPreloadJson);
        }
    }

    private native void _addBufferInfo(long j, int i, String str, long j2, long j3, long j4);

    private native long _create();

    private native double _getDoubleValue(long j, int i, double d);

    private native float _getFloatValue(long j, int i, float f);

    private native long _getLongValue(long j, int i, long j2);

    private native ABRResult _getPredict(long j);

    private native String _getPredictByJsonParams(long j, String str);

    private native String _getStringValue(long j, int i, String str);

    private native String _getVersion();

    private native void _release(long j);

    private native ABRResult _select(long j, int i, int i2);

    private native void _setDataSource(long j, IPlayStateSupplier iPlayStateSupplier);

    private native void _setDeviceInfo(long j, IDeviceInfo iDeviceInfo);

    private native void _setDoubleValue(long j, int i, double d);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setInfoListener(long j, IABRInfoListener iABRInfoListener);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setMediaInfo(long j, List<IVideoStream> list, List<IAudioStream> list2);

    private native void _setSRBenchmark(long j, Map<Integer, Integer> map);

    private native void _setSRBenchmarkMap(long j, Map<Integer, List<Integer>> map);

    private native void _setStringValue(long j, int i, String str);

    private native void _start(long j, int i, int i2);

    private native void _stop(long j);

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRResult getPredict() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return _getPredict(j);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public String getVersion() {
        if (this.mHandle == 0) {
            return "j_2.148.1";
        }
        return _getVersion();
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void release() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _release(j);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void stop() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _stop(j);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRStrategy toStratrgy() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return new NativeABRStrategy(j);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public String getPredictByJsonParams(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return _getPredictByJsonParams(j, str);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void init(IPlayStateSupplier iPlayStateSupplier) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setDataSource(j, iPlayStateSupplier);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setDeviceInfo(IDeviceInfo iDeviceInfo) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setDeviceInfo(j, iDeviceInfo);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setInfoListener(IABRInfoListener iABRInfoListener) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setInfoListener(j, iABRInfoListener);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setSRBenchmark(Map<Integer, Integer> map) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setSRBenchmark(j, map);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setSRBenchmarkMap(Map<Integer, List<Integer>> map) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setSRBenchmarkMap(j, map);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public float getFloatOption(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return f;
        }
        return _getFloatValue(j, i, f);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public long getLongOption(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return j;
        }
        if (i == 19) {
            return this.mAlgoType;
        }
        return _getLongValue(j2, i, j);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public String getStringOption(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return str;
        }
        try {
            return _getStringValue(j, i, str);
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRResult onceSelect(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return _select(j, i, i2);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setDoubleOptionForKey(int i, double d) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setDoubleValue(j, i, d);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setFloatOptionForKey(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setFloatValue(j, i, f);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setIntOptionForKey(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setLongOptionForKey(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        _setLongValue(j2, i, j);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setMediaInfo(List<IVideoStream> list, List<IAudioStream> list2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setMediaInfo(j, list, list2);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setStringOptionForKey(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setStringValue(j, i, str);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void start(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        this.mAlgoType = i;
        _start(j, i, i2);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void addBufferInfo(int i, String str, long j, long j2, long j3) {
        long j4 = this.mHandle;
        if (j4 == 0) {
            return;
        }
        _addBufferInfo(j4, i, str, j, j2, j3);
    }
}
