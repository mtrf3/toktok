package com.ss.android.ugc.aweme.feed.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareWarnPopWindow implements Serializable {

    @InterfaceC65349Pkn("pop_accessory")
    public final ShareWarnPopAccessory accessory;

    @InterfaceC65349Pkn("pop_content")
    public final List<ShareWarnPopContent> content;

    @InterfaceC65349Pkn("pop_title")
    public final String title;

    public ShareWarnPopWindow() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareWarnPopWindow copy$default(ShareWarnPopWindow shareWarnPopWindow, String str, List list, ShareWarnPopAccessory shareWarnPopAccessory, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareWarnPopWindow.title;
        }
        if ((i & 2) != 0) {
            list = shareWarnPopWindow.content;
        }
        if ((i & 4) != 0) {
            shareWarnPopAccessory = shareWarnPopWindow.accessory;
        }
        return shareWarnPopWindow.copy(str, list, shareWarnPopAccessory);
    }

    public final ShareWarnPopWindow copy(String title, List<ShareWarnPopContent> content, ShareWarnPopAccessory shareWarnPopAccessory) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        return new ShareWarnPopWindow(title, content, shareWarnPopAccessory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareWarnPopWindow)) {
            return false;
        }
        ShareWarnPopWindow shareWarnPopWindow = (ShareWarnPopWindow) obj;
        return o.LJ(this.title, shareWarnPopWindow.title) && o.LJ(this.content, shareWarnPopWindow.content) && o.LJ(this.accessory, shareWarnPopWindow.accessory);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareWarnPopWindow(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", accessory=");
        LIZ.append(this.accessory);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.content, this.title.hashCode() * 31, 31);
        ShareWarnPopAccessory shareWarnPopAccessory = this.accessory;
        if (shareWarnPopAccessory == null) {
            hashCode = 0;
        } else {
            hashCode = shareWarnPopAccessory.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final ShareWarnPopAccessory getAccessory() {
        return this.accessory;
    }

    public final List<ShareWarnPopContent> getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public ShareWarnPopWindow(String title, List<ShareWarnPopContent> content, ShareWarnPopAccessory shareWarnPopAccessory) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        this.title = title;
        this.content = content;
        this.accessory = shareWarnPopAccessory;
    }

    public ShareWarnPopWindow(String str, List list, ShareWarnPopAccessory shareWarnPopAccessory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? null : shareWarnPopAccessory);
    }
}
