package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class CommentImageModel extends UrlModel {
    public static final Companion Companion = new Companion();
    public transient String compressedFilePath;
    public transient int compressedStatus;

    @InterfaceC65349Pkn("format")
    public String format = "";
    public transient boolean isCompressed;

    /* loaded from: classes16.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getCompressedFilePath() {
        return this.compressedFilePath;
    }

    public final int getCompressedStatus() {
        return this.compressedStatus;
    }

    public final String getFormat() {
        return this.format;
    }

    public final boolean isCompressed() {
        return this.isCompressed;
    }

    public final void setCompressed(boolean z) {
        this.isCompressed = z;
    }

    public final void setCompressedFilePath(String str) {
        this.compressedFilePath = str;
    }

    public final void setCompressedStatus(int i) {
        this.compressedStatus = i;
    }

    public final void setFormat(String str) {
        this.format = str;
    }
}
