package com.bytedance.vcloud.strategy;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class StrategyCenter {
    public static final int ALGO_CONFIG_STRING_SMART_RANGE_REQUEST = 31009;
    public static final int SMART_RANGE_REQUEST_LABEL = 31204;
    public boolean mDidStart;
    public long mHandle;
    public IStrategyEventListener mListener;
    public int mLogLevel = 3;
    public SmartServiceWrapper mSmartServiceWrapper = new SmartServiceWrapper();
    public ISmartServiceSupplier mSmartServiceSupplier = new ISmartServiceSupplier() { // from class: com.bytedance.vcloud.strategy.StrategyCenter.1
        @Override // com.bytedance.vcloud.strategy.ISmartServiceSupplier
        public String getLastResult(String str) {
            return String.valueOf(StrategyCenter.this.mSmartServiceWrapper.getLastResult());
        }

        @Override // com.bytedance.vcloud.strategy.ISmartServiceSupplier
        public String executeSmartService(String str, String str2) {
            try {
                return String.valueOf(StrategyCenter.this.mSmartServiceWrapper.predictSmartSlice(new JSONObject(str2)));
            } catch (JSONException unused) {
                return "";
            }
        }
    };

    private native void _addInterimMedia(long j, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z, boolean z2);

    private native void _addMedia(long j, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z);

    private native void _addMediaWithCallback(long j, String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, String str2, boolean z, boolean z2);

    private native void _addPriorityTask(long j, String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener);

    private native void _businessEvent(long j, int i, int i2);

    private native void _businessEvent(long j, int i, int i2, int i3);

    private native void _businessEvent(long j, int i, int i2, String str);

    private native void _businessEvent(long j, int i, String str);

    private native long _create(IStrategyEventListener iStrategyEventListener);

    private native void _createPlayer(long j, long j2, String str, String str2);

    private native void _createPlayerWithTag(long j, long j2, String str, String str2, String str3);

    private native void _createScene(long j, String str);

    private native void _destroyScene(long j, String str);

    private native void _focusMedia(long j, String str, int i);

    private native float _getFloatValue(long j, int i, float f);

    private native int _getIntValue(long j, int i, int i2);

    private native String _getLoadMoreResult(long j, String str);

    private native long _getLongValue(long j, int i, long j2);

    private native long _getLongValue(long j, int i, String str, long j2);

    private native String _getStrValue(long j, int i, String str);

    private native int _iPlayerVersion(long j);

    private native boolean _isIOManagerVersionMatch(long j);

    private native void _makeCurrentPlayer(long j, String str);

    private native void _moveToScene(long j, String str);

    private native void _playSelection(long j, String str, int i, int i2);

    private native String _popLogData(long j, int i, String str);

    private native void _release(long j);

    private native void _releasePlayer(long j, String str, String str2);

    private native void _removeAllMedia(long j, String str, int i);

    private native void _removeMedia(long j, String str, String str2);

    private native void _removePriorityTask(long j, String str);

    private native String _selectBitrate(long j, String str, int i, String str2, Object obj);

    private native String _selectBitrateStringMap(long j, String str, int i, String str2, Object obj, int i2);

    private native String _selectBitrateStringMapWithObject(long j, Object obj, int i, String str, Object obj2, int i2);

    private native void _setAlgorithmJson(long j, int i, String str);

    private native void _setAppInfo(long j, String str);

    private native void _setAppServer(long j, IAppService iAppService);

    private native void _setEventListener(long j, IStrategyEventListener iStrategyEventListener);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setIOManager(long j, long j2, long j3);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setIntervalMS(long j, int i);

    private native void _setLogCallback(long j, ILogCallback iLogCallback);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setPlayDoubleConfig(long j, String str, int i, double d);

    private native void _setPlayIntConfig(long j, String str, int i, int i2);

    private native void _setPlayLongConfig(long j, String str, int i, long j2);

    private native void _setPlayStringConfig(long j, String str, int i, String str2);

    private native void _setPlayTaskProgress(long j, float f);

    private native void _setProbeType(long j, int i);

    private native void _setSettingsInfo(long j, String str, String str2);

    private native void _setSmartServiceSupplier(long j, ISmartServiceSupplier iSmartServiceSupplier);

    private native void _setStateSupplier(long j, IStrategyStateSupplier iStrategyStateSupplier);

    private native void _setStrValue(long j, int i, String str);

    private native void _start(long j);

    private native void _stop(long j);

    private native void _updateMedia(long j, String str, String str2, String str3);

    public int iPlayerVersion() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return _iPlayerVersion(j);
    }

    public boolean isIOManagerVersionMatch() {
        long j = this.mHandle;
        if (j == 0) {
            return false;
        }
        return _isIOManagerVersionMatch(j);
    }

    public boolean isLoadLibrarySucceed() {
        if (this.mHandle != 0) {
            return true;
        }
        return false;
    }

    public void stop() {
        if (!this.mDidStart) {
            return;
        }
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _stop(j);
        this.mDidStart = false;
    }

    public boolean isRunning() {
        return this.mDidStart;
    }

    public StrategyCenter(IStrategyEventListener iStrategyEventListener) {
        this.mListener = iStrategyEventListener;
    }

    public void createScene(String str) {
        long j = this.mHandle;
        if (j == 0 || str == null) {
            return;
        }
        _createScene(j, str);
    }

    public void destroyScene(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _destroyScene(j, str);
    }

    public String getLoadMoreResult(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        try {
            return _getLoadMoreResult(j, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void makeCurrentPlayer(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _makeCurrentPlayer(j, str);
    }

    public void removePriorityTask(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _removePriorityTask(j, str);
        } catch (Throwable unused) {
        }
    }

    public void setAppInfo(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setAppInfo(j, str);
    }

    public void setAppServer(IAppService iAppService) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setAppServer(j, iAppService);
        } catch (Throwable unused) {
        }
    }

    public void setEventListener(IStrategyEventListener iStrategyEventListener) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setEventListener(j, iStrategyEventListener);
    }

    public void setLogCallback(ILogCallback iLogCallback) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setLogCallback(j, iLogCallback);
    }

    public void setSmartServiceSupplier(ISmartServiceSupplier iSmartServiceSupplier) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setSmartServiceSupplier(j, iSmartServiceSupplier);
        } catch (Throwable unused) {
        }
    }

    public void setStateSupplier(IStrategyStateSupplier iStrategyStateSupplier) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setStateSupplier(j, iStrategyStateSupplier);
    }

    public void switchToScene(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _moveToScene(j, str);
    }

    public void businessEvent(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2);
        } catch (Throwable unused) {
        }
    }

    public void create(Context context, boolean z) {
        if (!isLoadLibrarySucceed()) {
            if (z) {
                StrategyCenterJniLoader.loadLibrary(context);
                if (!StrategyCenterJniLoader.isLibraryLoaded) {
                    return;
                }
            }
            this.mHandle = _create(this.mListener);
        }
    }

    public void focusMedia(String str, int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _focusMedia(j, str, i);
    }

    public float getFloatValue(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return f;
        }
        try {
            return _getFloatValue(j, i, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    public int getIntValue(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return i2;
        }
        try {
            return _getIntValue(j, i, i2);
        } catch (Throwable unused) {
            return i2;
        }
    }

    public long getLongValue(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return j;
        }
        try {
            return _getLongValue(j2, i, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    public String getStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return str;
        }
        try {
            return _getStrValue(j, i, str);
        } catch (Throwable unused) {
            return str;
        }
    }

    public String popLogData(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return "";
        }
        return _popLogData(j, i, str);
    }

    public void releasePlayer(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _releasePlayer(j, str, str2);
    }

    public void removeAllMedia(String str, int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeAllMedia(j, str, i);
    }

    public void removeMedia(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeMedia(j, str, str2);
    }

    public void setAlgorithmJson(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setAlgorithmJson(j, i, str);
    }

    public void setFloatValue(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setFloatValue(j, i, f);
    }

    public void setIOManager(long j, long j2) {
        long j3 = this.mHandle;
        if (j3 == 0) {
            return;
        }
        _setIOManager(j3, j, j2);
    }

    public void setIntValue(int i, int i2) {
        if (i == 10000) {
            this.mLogLevel = i2;
        }
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void setLongValue(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _setLongValue(j2, i, j);
        } catch (Throwable unused) {
        }
    }

    public void setSettingsInfo(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setSettingsInfo(j, str, str2);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setStrValue(j, i, str);
        } catch (Throwable unused) {
        }
    }

    public void start(Context context, boolean z) {
        String stringValue;
        if (this.mDidStart) {
            return;
        }
        create(context, z);
        if (this.mHandle == 0) {
            return;
        }
        setIntValue(10000, this.mLogLevel);
        _start(this.mHandle);
        if (getIntValue(808, 0) != 0 && (stringValue = getStringValue(31021, "")) != null && !stringValue.isEmpty()) {
            this.mSmartServiceWrapper.configServer(stringValue);
            setSmartServiceSupplier(this.mSmartServiceSupplier);
        }
        this.mDidStart = true;
    }

    public void businessEvent(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, str);
        } catch (Throwable unused) {
        }
    }

    public void addPriorityTask(String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _addPriorityTask(j, str, iSelectBitrateListener, iPreloadTaskCallbackListener);
        } catch (Throwable unused) {
        }
    }

    public void businessEvent(int i, int i2, int i3) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2, i3);
        } catch (Throwable unused) {
        }
    }

    public void createPlayer(long j, String str, String str2) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        _createPlayer(j2, j, str, str2);
    }

    public long getLongValue(int i, String str, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return j;
        }
        try {
            return _getLongValue(j2, i, str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    public void playSelection(String str, int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _playSelection(j, str, i, i2);
    }

    public void setPlayDoubleConfig(String str, int i, double d) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPlayDoubleConfig(j, str, i, d);
        } catch (Throwable unused) {
        }
    }

    public void setPlayIntConfig(String str, int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPlayIntConfig(j, str, i, i2);
        } catch (Throwable unused) {
        }
    }

    public void setPlayLongConfig(String str, int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _setPlayLongConfig(j2, str, i, j);
        } catch (Throwable unused) {
        }
    }

    public void setPlayStringConfig(String str, int i, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPlayStringConfig(j, str, i, str2);
        } catch (Throwable unused) {
        }
    }

    public void updateMedia(String str, String str2, String str3) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _updateMedia(j, str, str2, str3);
        } catch (Throwable unused) {
        }
    }

    public void businessEvent(int i, int i2, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2, str);
        } catch (Throwable unused) {
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _addMedia(j, str, iSelectBitrateListener, str2, z);
    }

    public void createPlayer(long j, String str, String str2, String str3) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _createPlayerWithTag(j2, j, str, str2, str3);
        } catch (Throwable unused) {
            _createPlayer(this.mHandle, j, str, str2);
        }
    }

    public String selectBitrate(String str, int i, String str2, Object obj) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        try {
            return _selectBitrate(j, str, i, str2, obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z, boolean z2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _addInterimMedia(j, str, iSelectBitrateListener, str2, z, z2);
        } catch (Throwable unused) {
        }
    }

    public String selectBitrateStringMap(String str, int i, String str2, Object obj, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        try {
            return _selectBitrateStringMap(j, str, i, str2, obj, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String selectBitrateStringMapWithObject(JSONObject jSONObject, int i, String str, Object obj, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        try {
            return _selectBitrateStringMapWithObject(j, jSONObject, i, str, obj, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, String str2, boolean z, boolean z2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            try {
                _addMediaWithCallback(j, str, iSelectBitrateListener, iPreloadTaskCallbackListener, str2, z, z2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            _addInterimMedia(this.mHandle, str, iSelectBitrateListener, str2, z, z2);
        }
    }
}
