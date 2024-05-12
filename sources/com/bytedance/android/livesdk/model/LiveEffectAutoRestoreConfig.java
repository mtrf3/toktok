package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveEffectAutoRestoreConfig extends F9E {

    @InterfaceC65349Pkn("category_key")
    public final String categoryKey;

    @InterfaceC65349Pkn("click_uri")
    public final String clickUri;

    @InterfaceC65349Pkn("content_uri")
    public final String contentUri;

    @InterfaceC65349Pkn("effect_panel")
    public final String effectPanel;

    @InterfaceC65349Pkn("image_path")
    public final String imagePath;

    @InterfaceC65349Pkn("resource_id")
    public final String resourceId;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveEffectAutoRestoreConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.resourceId, this.categoryKey, this.imagePath, this.effectPanel, this.contentUri, this.clickUri};
    }

    public LiveEffectAutoRestoreConfig(String resourceId, String categoryKey, String imagePath, String effectPanel, String contentUri, String clickUri) {
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(categoryKey, "categoryKey");
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(effectPanel, "effectPanel");
        o.LJIIIZ(contentUri, "contentUri");
        o.LJIIIZ(clickUri, "clickUri");
        this.resourceId = resourceId;
        this.categoryKey = categoryKey;
        this.imagePath = imagePath;
        this.effectPanel = effectPanel;
        this.contentUri = contentUri;
        this.clickUri = clickUri;
    }

    public /* synthetic */ LiveEffectAutoRestoreConfig(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "");
    }
}
