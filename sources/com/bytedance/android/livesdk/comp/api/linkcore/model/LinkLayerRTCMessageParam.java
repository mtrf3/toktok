package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkLayerRTCMessageParam extends F9E {

    @InterfaceC65349Pkn("support_state_consistency")
    public final boolean is_state_supported;

    @InterfaceC65349Pkn("layout_id")
    public String layoutId;

    @InterfaceC65349Pkn("layout_scene")
    public int layoutScene;

    @InterfaceC65349Pkn("scene_version")
    public int sceneVersion;

    @InterfaceC65349Pkn("users")
    public final ArrayList<LinkLayerRTCMessageUser> users;

    @InterfaceC65349Pkn("zoomed_linkmic_id")
    public String zoomLinkMicId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkLayerRTCMessageParam() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r2
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkLayerRTCMessageParam copy$default(LinkLayerRTCMessageParam linkLayerRTCMessageParam, String str, int i, int i2, ArrayList arrayList, String str2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = linkLayerRTCMessageParam.layoutId;
        }
        if ((i3 & 2) != 0) {
            i = linkLayerRTCMessageParam.layoutScene;
        }
        if ((i3 & 4) != 0) {
            i2 = linkLayerRTCMessageParam.sceneVersion;
        }
        if ((i3 & 8) != 0) {
            arrayList = linkLayerRTCMessageParam.users;
        }
        if ((i3 & 16) != 0) {
            str2 = linkLayerRTCMessageParam.zoomLinkMicId;
        }
        if ((i3 & 32) != 0) {
            z = linkLayerRTCMessageParam.is_state_supported;
        }
        return linkLayerRTCMessageParam.copy(str, i, i2, arrayList, str2, z);
    }

    public final LinkLayerRTCMessageParam copy(String layoutId, int i, int i2, ArrayList<LinkLayerRTCMessageUser> users, String zoomLinkMicId, boolean z) {
        o.LJIIIZ(layoutId, "layoutId");
        o.LJIIIZ(users, "users");
        o.LJIIIZ(zoomLinkMicId, "zoomLinkMicId");
        return new LinkLayerRTCMessageParam(layoutId, i, i2, users, zoomLinkMicId, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.layoutId, Integer.valueOf(this.layoutScene), Integer.valueOf(this.sceneVersion), this.users, this.zoomLinkMicId, Boolean.valueOf(this.is_state_supported)};
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final int getLayoutScene() {
        return this.layoutScene;
    }

    public final int getSceneVersion() {
        return this.sceneVersion;
    }

    public final ArrayList<LinkLayerRTCMessageUser> getUsers() {
        return this.users;
    }

    public final String getZoomLinkMicId() {
        return this.zoomLinkMicId;
    }

    public final boolean is_state_supported() {
        return this.is_state_supported;
    }

    public final void setLayoutId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.layoutId = str;
    }

    public final void setLayoutScene(int i) {
        this.layoutScene = i;
    }

    public final void setSceneVersion(int i) {
        this.sceneVersion = i;
    }

    public final void setZoomLinkMicId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.zoomLinkMicId = str;
    }

    public LinkLayerRTCMessageParam(String layoutId, int i, int i2, ArrayList<LinkLayerRTCMessageUser> users, String zoomLinkMicId, boolean z) {
        o.LJIIIZ(layoutId, "layoutId");
        o.LJIIIZ(users, "users");
        o.LJIIIZ(zoomLinkMicId, "zoomLinkMicId");
        this.layoutId = layoutId;
        this.layoutScene = i;
        this.sceneVersion = i2;
        this.users = users;
        this.zoomLinkMicId = zoomLinkMicId;
        this.is_state_supported = z;
    }

    public /* synthetic */ LinkLayerRTCMessageParam(String str, int i, int i2, ArrayList arrayList, String str2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 4 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? new ArrayList() : arrayList, (i3 & 16) == 0 ? str2 : "", (i3 & 32) != 0 ? false : z);
    }
}
