package com.ss.android.ugc.aweme.sticker.image;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ResourceInfo extends F9E implements Serializable {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    @InterfaceC65349Pkn("resource_map")
    public Map<String, String> resouceMap;

    @InterfaceC65349Pkn("resource_path")
    public String resourcePath;

    @InterfaceC65349Pkn("template_model_str")
    public String templateModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ResourceInfo() {
        /*
            r8 = this;
            r1 = 0
            r4 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r3 = r1
            r5 = r4
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.image.ResourceInfo.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceInfo copy$default(ResourceInfo resourceInfo, String str, String str2, Map map, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourceInfo.templateModel;
        }
        if ((i & 2) != 0) {
            str2 = resourceInfo.resourcePath;
        }
        if ((i & 4) != 0) {
            map = resourceInfo.resouceMap;
        }
        if ((i & 8) != 0) {
            z = resourceInfo.LJLIL;
        }
        if ((i & 16) != 0) {
            z2 = resourceInfo.LJLILLLLZI;
        }
        return resourceInfo.copy(str, str2, map, z, z2);
    }

    public final ResourceInfo copy(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        return new ResourceInfo(str, str2, map, z, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.templateModel, this.resourcePath, this.resouceMap, Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
    }

    public final boolean getResCache() {
        return this.LJLILLLLZI;
    }

    public final Map<String, String> getResouceMap() {
        return this.resouceMap;
    }

    public final String getResourcePath() {
        return this.resourcePath;
    }

    public final String getTemplateModel() {
        return this.templateModel;
    }

    public final boolean getZipCache() {
        return this.LJLIL;
    }

    public final void setResCache(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setResouceMap(Map<String, String> map) {
        this.resouceMap = map;
    }

    public final void setResourcePath(String str) {
        this.resourcePath = str;
    }

    public final void setTemplateModel(String str) {
        this.templateModel = str;
    }

    public final void setZipCache(boolean z) {
        this.LJLIL = z;
    }

    public ResourceInfo(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        this.templateModel = str;
        this.resourcePath = str2;
        this.resouceMap = map;
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }

    public /* synthetic */ ResourceInfo(String str, String str2, Map map, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? map : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
