package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.WM7;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkCommonBean {

    @InterfaceC65349Pkn("app_id")
    public long appId;

    @InterfaceC65349Pkn("extra")
    public Map<String, String> extraMap;

    @InterfaceC65349Pkn("live_id")
    public long live_id;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkCommonBean() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 15
            r0 = r9
            r4 = r2
            r8 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkCommonBean.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkCommonBean)) {
            return false;
        }
        LinkCommonBean linkCommonBean = (LinkCommonBean) obj;
        return this.scene == linkCommonBean.scene && this.appId == linkCommonBean.appId && this.live_id == linkCommonBean.live_id && o.LJ(this.extraMap, linkCommonBean.extraMap);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.live_id, JBR.LIZJ(this.appId, this.scene * 31, 31), 31);
        Map<String, String> map = this.extraMap;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkCommonBean(scene=");
        LIZ.append(this.scene);
        LIZ.append(", appId=");
        LIZ.append(this.appId);
        LIZ.append(", live_id=");
        LIZ.append(this.live_id);
        LIZ.append(", extraMap=");
        return C15890jp.LIZ(LIZ, this.extraMap, ')', LIZ);
    }

    public LinkCommonBean(int i, long j, long j2, Map<String, String> map) {
        this.scene = i;
        this.appId = j;
        this.live_id = j2;
        this.extraMap = map;
    }

    public /* synthetic */ LinkCommonBean(int i, long j, long j2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? null : map);
    }
}
