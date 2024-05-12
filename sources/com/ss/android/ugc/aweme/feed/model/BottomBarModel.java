package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BottomBarModel extends F9E implements Serializable {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomBarModel() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BottomBarModel copy$default(BottomBarModel bottomBarModel, String str, int i, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bottomBarModel.content;
        }
        if ((i2 & 2) != 0) {
            i = bottomBarModel.type;
        }
        if ((i2 & 4) != 0) {
            urlModel = bottomBarModel.icon;
        }
        return bottomBarModel.copy(str, i, urlModel);
    }

    public final BottomBarModel copy(String content, int i, UrlModel icon) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(icon, "icon");
        return new BottomBarModel(content, i, icon);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.content, Integer.valueOf(this.type), this.icon};
    }

    public final String getContent() {
        return this.content;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getType() {
        return this.type;
    }

    public BottomBarModel(String content, int i, UrlModel icon) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(icon, "icon");
        this.content = content;
        this.type = i;
        this.icon = icon;
    }

    public /* synthetic */ BottomBarModel(String str, int i, UrlModel urlModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new UrlModel() : urlModel);
    }
}
