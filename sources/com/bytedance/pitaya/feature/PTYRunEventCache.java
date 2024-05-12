package com.bytedance.pitaya.feature;

import com.bytedance.pitaya.api.feature.IPTYRunEventCache;
import com.bytedance.pitaya.log.PitayaLogger;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class PTYRunEventCache implements IPTYRunEventCache {
    public static final PTYRunEventCache INSTANCE = new PTYRunEventCache();

    public static final native void nativeReset(String str, String str2);

    @Override // com.bytedance.pitaya.api.feature.IPTYRunEventCache
    public void reset(String aid, String business) {
        o.LJIIJ(aid, "aid");
        o.LJIIJ(business, "business");
        try {
            nativeReset(aid, business);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }
}
