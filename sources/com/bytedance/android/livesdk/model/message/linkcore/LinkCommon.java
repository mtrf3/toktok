package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkCommon extends F9E {

    @InterfaceC65349Pkn("app_id")
    public long appId;

    @InterfaceC65349Pkn("extra")
    public Map<String, String> extraMap;

    @InterfaceC65349Pkn("live_id")
    public long live_id;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("source")
    public String source;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkCommon() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 31
            r0 = r10
            r4 = r2
            r7 = r6
            r9 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.message.linkcore.LinkCommon.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.scene), Long.valueOf(this.appId), Long.valueOf(this.live_id), this.extraMap, this.source};
    }

    public LinkCommon(int i, long j, long j2, Map<String, String> map, String source) {
        o.LJIIIZ(source, "source");
        this.scene = i;
        this.appId = j;
        this.live_id = j2;
        this.extraMap = map;
        this.source = source;
    }

    public /* synthetic */ LinkCommon(int i, long j, long j2, Map map, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? "" : str);
    }
}
