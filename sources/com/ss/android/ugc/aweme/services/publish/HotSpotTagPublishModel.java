package com.ss.android.ugc.aweme.services.publish;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HotSpotTagPublishModel extends F9E {
    public final String id;
    public final String tag;

    public static /* synthetic */ HotSpotTagPublishModel copy$default(HotSpotTagPublishModel hotSpotTagPublishModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotSpotTagPublishModel.tag;
        }
        if ((i & 2) != 0) {
            str2 = hotSpotTagPublishModel.id;
        }
        return hotSpotTagPublishModel.copy(str, str2);
    }

    public final HotSpotTagPublishModel copy(String tag, String id) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(id, "id");
        return new HotSpotTagPublishModel(tag, id);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tag, this.id};
    }

    public final String getId() {
        return this.id;
    }

    public final String getTag() {
        return this.tag;
    }

    public HotSpotTagPublishModel(String tag, String id) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(id, "id");
        this.tag = tag;
        this.id = id;
    }
}
