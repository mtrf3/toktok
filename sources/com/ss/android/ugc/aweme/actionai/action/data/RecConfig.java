package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecConfig extends F9E {
    public final List<ImageInfoList> image_info_list;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecConfig copy$default(RecConfig recConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recConfig.image_info_list;
        }
        return recConfig.copy(list);
    }

    public final RecConfig copy(List<ImageInfoList> image_info_list) {
        o.LJIIIZ(image_info_list, "image_info_list");
        return new RecConfig(image_info_list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.image_info_list};
    }

    public final List<ImageInfoList> getImage_info_list() {
        return this.image_info_list;
    }

    public RecConfig(List<ImageInfoList> image_info_list) {
        o.LJIIIZ(image_info_list, "image_info_list");
        this.image_info_list = image_info_list;
    }
}
