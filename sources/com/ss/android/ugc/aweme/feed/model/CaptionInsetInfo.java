package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class CaptionInsetInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("bottom")
    public int bottom;

    @InterfaceC65349Pkn("leading")
    public int leading;

    @InterfaceC65349Pkn("top")
    public int top;

    @InterfaceC65349Pkn("trailing")
    public int trailing;

    public CaptionInsetInfo() {
    }

    public static /* synthetic */ CaptionInsetInfo copy$default(CaptionInsetInfo captionInsetInfo, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = captionInsetInfo.top;
        }
        if ((i5 & 2) != 0) {
            i2 = captionInsetInfo.trailing;
        }
        if ((i5 & 4) != 0) {
            i3 = captionInsetInfo.bottom;
        }
        if ((i5 & 8) != 0) {
            i4 = captionInsetInfo.leading;
        }
        return captionInsetInfo.copy(i, i2, i3, i4);
    }

    public final CaptionInsetInfo copy(int i, int i2, int i3, int i4) {
        return new CaptionInsetInfo(i, i2, i3, i4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.top), Integer.valueOf(this.trailing), Integer.valueOf(this.bottom), Integer.valueOf(this.leading)};
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeading() {
        return this.leading;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getTrailing() {
        return this.trailing;
    }

    public CaptionInsetInfo(int i, int i2, int i3, int i4) {
        this.top = i;
        this.trailing = i2;
        this.bottom = i3;
        this.leading = i4;
    }
}
