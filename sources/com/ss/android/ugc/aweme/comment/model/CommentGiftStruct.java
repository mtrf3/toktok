package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class CommentGiftStruct implements Serializable {

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("image")
    public final UrlModel image;

    public final long getId() {
        return this.id;
    }

    public final UrlModel getImage() {
        return this.image;
    }
}
