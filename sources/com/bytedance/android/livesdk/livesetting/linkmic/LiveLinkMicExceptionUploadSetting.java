package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58431MwV;
import X.C58459Mwx;
import X.C5H3;
import X.V2Q;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@SettingsKey("live_linkmic_exception_upload_android")
/* loaded from: classes11.dex */
public final class LiveLinkMicExceptionUploadSetting {
    public static final LiveLinkMicExceptionUploadSetting INSTANCE = new LiveLinkMicExceptionUploadSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicUploadConfig DEFAULT = new LinkMicUploadConfig(null, null, null, null, null, 0, 0, 127, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58459Mwx.LJLIL);
    public static final C5H3 exceptionTypeHitSampleCacheMap$delegate = C221108m2.LIZIZ(C58431MwV.LJLIL);

    private final ConcurrentHashMap<Integer, Boolean> getExceptionTypeHitSampleCacheMap() {
        return (ConcurrentHashMap) exceptionTypeHitSampleCacheMap$delegate.getValue();
    }

    public final LinkMicUploadConfig getSettingValue() {
        return (LinkMicUploadConfig) settingValue$delegate.getValue();
    }

    public final boolean canUpload(int i) {
        Boolean putIfAbsent;
        ConcurrentHashMap<Integer, Boolean> exceptionTypeHitSampleCacheMap = getExceptionTypeHitSampleCacheMap();
        Integer valueOf = Integer.valueOf(i);
        Boolean bool = exceptionTypeHitSampleCacheMap.get(valueOf);
        if (bool == null && (putIfAbsent = exceptionTypeHitSampleCacheMap.putIfAbsent(valueOf, (bool = Boolean.valueOf(V2Q.LIZLLL(V2Q.LJFF(INSTANCE.getSettingValue(), i)))))) != null) {
            bool = putIfAbsent;
        }
        Boolean result = bool;
        o.LJIIIIZZ(result, "result");
        return result.booleanValue();
    }
}
