package com.bytedance.android.livesdk.like;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class LikeIconResult {

    @InterfaceC65349Pkn("icons")
    public List<ImageModel> iconList;

    @InterfaceC65349Pkn("icons_self")
    public List<ImageModel> selfIconList;

    public final List<ImageModel> LIZ() {
        List<ImageModel> list = this.iconList;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public final List<ImageModel> LIZIZ() {
        List<ImageModel> list = this.selfIconList;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
