package com.bytedance.ies.im.core.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RichTextInfo {

    @InterfaceC65349Pkn("length")
    public final int length;

    @InterfaceC65349Pkn("mentioned_uid")
    public final String mentionedUid;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("rich_text_type")
    public final int type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextInfo)) {
            return false;
        }
        RichTextInfo richTextInfo = (RichTextInfo) obj;
        return this.position == richTextInfo.position && this.length == richTextInfo.length && this.type == richTextInfo.type && o.LJ(this.mentionedUid, richTextInfo.mentionedUid);
    }

    public final int hashCode() {
        int i = ((((this.position * 31) + this.length) * 31) + this.type) * 31;
        String str = this.mentionedUid;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RichTextInfo(position=");
        LIZ.append(this.position);
        LIZ.append(", length=");
        LIZ.append(this.length);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", mentionedUid=");
        return q.LIZIZ(LIZ, this.mentionedUid, ')', LIZ);
    }

    public RichTextInfo(int i, int i2, int i3, String str) {
        this.position = i;
        this.length = i2;
        this.type = i3;
        this.mentionedUid = str;
    }
}
