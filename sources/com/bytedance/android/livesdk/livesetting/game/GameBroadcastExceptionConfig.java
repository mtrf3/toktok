package com.bytedance.android.livesdk.livesetting.game;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import X.OSZ;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GameBroadcastExceptionConfig implements Serializable {

    @InterfaceC65349Pkn("exception_info")
    public Map<Integer, ExceptionInfo> ExceptionInfo;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    public GameBroadcastExceptionConfig() {
        this(false, null, 3, null);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final Map<Integer, ExceptionInfo> getExceptionInfo() {
        return this.ExceptionInfo;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setExceptionInfo(Map<Integer, ExceptionInfo> map) {
        this.ExceptionInfo = map;
    }

    public GameBroadcastExceptionConfig(boolean z, Map<Integer, ExceptionInfo> map) {
        this.enable = z;
        this.ExceptionInfo = map;
    }

    public GameBroadcastExceptionConfig(boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C113554cx.LJJL(new OSZ(-201, new ExceptionInfo(false, 0L, 3, null)), new OSZ(-202, new ExceptionInfo(false, 0L, 3, null)), new OSZ(-203, new ExceptionInfo(false, 0L, 3, null))) : map);
    }
}
