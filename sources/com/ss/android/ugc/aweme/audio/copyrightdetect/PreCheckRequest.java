package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreCheckRequest extends F9E {

    @InterfaceC65349Pkn("creation_id")
    public final String creation_id;

    @InterfaceC65349Pkn("feature")
    public final String feature;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    public static /* synthetic */ PreCheckRequest copy$default(PreCheckRequest preCheckRequest, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = preCheckRequest.creation_id;
        }
        if ((i2 & 2) != 0) {
            i = preCheckRequest.scene;
        }
        if ((i2 & 4) != 0) {
            str2 = preCheckRequest.feature;
        }
        return preCheckRequest.copy(str, i, str2);
    }

    public final PreCheckRequest copy(String creation_id, int i, String feature) {
        o.LJIIIZ(creation_id, "creation_id");
        o.LJIIIZ(feature, "feature");
        return new PreCheckRequest(creation_id, i, feature);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.creation_id, Integer.valueOf(this.scene), this.feature};
    }

    public final String getCreation_id() {
        return this.creation_id;
    }

    public final String getFeature() {
        return this.feature;
    }

    public final int getScene() {
        return this.scene;
    }

    public PreCheckRequest(String creation_id, int i, String feature) {
        o.LJIIIZ(creation_id, "creation_id");
        o.LJIIIZ(feature, "feature");
        this.creation_id = creation_id;
        this.scene = i;
        this.feature = feature;
    }
}
