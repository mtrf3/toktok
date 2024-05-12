package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RepostTab implements Serializable {

    @InterfaceC65349Pkn("repost_tab_all_visible")
    public boolean repostShowForPublic;

    @InterfaceC65349Pkn("show_repost_tab_other")
    public int showRepostOther;

    @InterfaceC65349Pkn("show_repost_tab_self")
    public int showRepostSelf;

    /* JADX WARN: Multi-variable type inference failed */
    public RepostTab() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public final boolean getRepostShowForPublic() {
        return this.repostShowForPublic;
    }

    public final int getShowRepostOther() {
        return this.showRepostOther;
    }

    public final int getShowRepostSelf() {
        return this.showRepostSelf;
    }

    public final void setRepostShowForPublic(boolean z) {
        this.repostShowForPublic = z;
    }

    public final void setShowRepostOther(int i) {
        this.showRepostOther = i;
    }

    public final void setShowRepostSelf(int i) {
        this.showRepostSelf = i;
    }

    public RepostTab(int i, int i2, boolean z) {
        this.showRepostSelf = i;
        this.showRepostOther = i2;
        this.repostShowForPublic = z;
    }

    public /* synthetic */ RepostTab(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z);
    }
}
