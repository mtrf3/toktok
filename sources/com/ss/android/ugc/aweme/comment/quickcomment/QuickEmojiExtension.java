package com.ss.android.ugc.aweme.comment.quickcomment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QuickEmojiExtension {

    @InterfaceC65349Pkn("android_version")
    public final int androidVersion;

    @InterfaceC65349Pkn("emoji")
    public final String emoji;

    /* JADX WARN: Multi-variable type inference failed */
    public QuickEmojiExtension() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickEmojiExtension)) {
            return false;
        }
        QuickEmojiExtension quickEmojiExtension = (QuickEmojiExtension) obj;
        return o.LJ(this.emoji, quickEmojiExtension.emoji) && this.androidVersion == quickEmojiExtension.androidVersion;
    }

    public final int hashCode() {
        String str = this.emoji;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.androidVersion;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuickEmojiExtension(emoji=");
        LIZ.append(this.emoji);
        LIZ.append(", androidVersion=");
        return b0.LIZJ(LIZ, this.androidVersion, ')', LIZ);
    }

    public QuickEmojiExtension(String str, int i) {
        this.emoji = str;
        this.androidVersion = i;
    }

    public /* synthetic */ QuickEmojiExtension(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? Integer.MAX_VALUE : i);
    }
}
