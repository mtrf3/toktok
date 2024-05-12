package com.ss.android.ugc.aweme.ecommerce.core.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomGeckoFrontUpdateModel extends F9E {

    @InterfaceC65349Pkn("delay")
    public final long delay;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("update")
    public final String update;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomGeckoFrontUpdateModel() {
        this(null, 0 == true ? 1 : 0, 0L, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcomGeckoFrontUpdateModel copy$default(EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecomGeckoFrontUpdateModel.scene;
        }
        if ((i & 2) != 0) {
            str2 = ecomGeckoFrontUpdateModel.update;
        }
        if ((i & 4) != 0) {
            j = ecomGeckoFrontUpdateModel.delay;
        }
        return ecomGeckoFrontUpdateModel.copy(str, str2, j);
    }

    public final EcomGeckoFrontUpdateModel copy(String scene, String update, long j) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(update, "update");
        return new EcomGeckoFrontUpdateModel(scene, update, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.scene, this.update, Long.valueOf(this.delay)};
    }

    public final long getDelay() {
        return this.delay;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getUpdate() {
        return this.update;
    }

    public EcomGeckoFrontUpdateModel(String scene, String update, long j) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(update, "update");
        this.scene = scene;
        this.update = update;
        this.delay = j;
    }

    public /* synthetic */ EcomGeckoFrontUpdateModel(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 3000L : j);
    }
}
