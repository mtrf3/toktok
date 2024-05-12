package com.ss.android.ugc.aweme.wavepublish.monitor.callback;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishNodeTimeout extends F9E {

    @InterfaceC65349Pkn("node_name")
    public final String nodeName;

    @InterfaceC65349Pkn("timeout_setting")
    public final int timeoutSetting;

    public static /* synthetic */ PublishNodeTimeout copy$default(PublishNodeTimeout publishNodeTimeout, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publishNodeTimeout.nodeName;
        }
        if ((i2 & 2) != 0) {
            i = publishNodeTimeout.timeoutSetting;
        }
        return publishNodeTimeout.copy(str, i);
    }

    public final PublishNodeTimeout copy(String nodeName, int i) {
        o.LJIIIZ(nodeName, "nodeName");
        return new PublishNodeTimeout(nodeName, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.nodeName, Integer.valueOf(this.timeoutSetting)};
    }

    public final String getNodeName() {
        return this.nodeName;
    }

    public final int getTimeoutSetting() {
        return this.timeoutSetting;
    }

    public PublishNodeTimeout(String nodeName, int i) {
        o.LJIIIZ(nodeName, "nodeName");
        this.nodeName = nodeName;
        this.timeoutSetting = i;
    }
}
