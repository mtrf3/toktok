package com.ss.android.ugc.aweme.setting.performance;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ToolsNetworkRequest extends F9E {

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("path")
    public final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolsNetworkRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ToolsNetworkRequest copy$default(ToolsNetworkRequest toolsNetworkRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolsNetworkRequest.path;
        }
        if ((i & 2) != 0) {
            str2 = toolsNetworkRequest.extra;
        }
        return toolsNetworkRequest.copy(str, str2);
    }

    public final ToolsNetworkRequest copy(String path, String extra) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(extra, "extra");
        return new ToolsNetworkRequest(path, extra);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.path, this.extra};
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getPath() {
        return this.path;
    }

    public ToolsNetworkRequest(String path, String extra) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(extra, "extra");
        this.path = path;
        this.extra = extra;
    }

    public /* synthetic */ ToolsNetworkRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
