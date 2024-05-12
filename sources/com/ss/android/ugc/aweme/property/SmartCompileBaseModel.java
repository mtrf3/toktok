package com.ss.android.ugc.aweme.property;

import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class SmartCompileBaseModel {

    @InterfaceC65349Pkn("package_url")
    public final String packageUrl;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("type")
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public SmartCompileBaseModel() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public SmartCompileBaseModel(String scene, int i, String packageUrl) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(packageUrl, "packageUrl");
        this.scene = scene;
        this.type = i;
        this.packageUrl = packageUrl;
    }

    public /* synthetic */ SmartCompileBaseModel(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
