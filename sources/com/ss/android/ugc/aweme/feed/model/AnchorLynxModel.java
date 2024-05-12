package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnchorLynxModel extends F9E {
    public final Bundle bundle;
    public final String lynxSchema;

    public static /* synthetic */ AnchorLynxModel copy$default(AnchorLynxModel anchorLynxModel, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anchorLynxModel.lynxSchema;
        }
        if ((i & 2) != 0) {
            bundle = anchorLynxModel.bundle;
        }
        return anchorLynxModel.copy(str, bundle);
    }

    public final AnchorLynxModel copy(String lynxSchema, Bundle bundle) {
        o.LJIIIZ(lynxSchema, "lynxSchema");
        o.LJIIIZ(bundle, "bundle");
        return new AnchorLynxModel(lynxSchema, bundle);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.lynxSchema, this.bundle};
    }

    public AnchorLynxModel(String lynxSchema, Bundle bundle) {
        o.LJIIIZ(lynxSchema, "lynxSchema");
        o.LJIIIZ(bundle, "bundle");
        this.lynxSchema = lynxSchema;
        this.bundle = bundle;
    }
}
