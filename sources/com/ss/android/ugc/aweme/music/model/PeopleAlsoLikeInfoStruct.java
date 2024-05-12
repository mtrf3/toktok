package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class PeopleAlsoLikeInfoStruct implements Serializable {

    @InterfaceC65349Pkn("covers")
    public final List<UrlModel> covers;

    public final boolean isValid() {
        List<UrlModel> list = this.covers;
        if (list != null && list.size() >= 3) {
            return true;
        }
        return false;
    }

    public final List<UrlModel> getCovers() {
        return this.covers;
    }
}
