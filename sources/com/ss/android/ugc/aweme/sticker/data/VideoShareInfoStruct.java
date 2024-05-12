package com.ss.android.ugc.aweme.sticker.data;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoShareInfoStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("original_author_id")
    public String authorId;

    @InterfaceC65349Pkn("original_author_name")
    public String authorName;

    @InterfaceC65349Pkn("original_item_id")
    public String awemeId;

    @InterfaceC65349Pkn("original_sec_author_id")
    public String secAuthorId;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoShareInfoStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoShareInfoStruct copy$default(VideoShareInfoStruct videoShareInfoStruct, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoShareInfoStruct.awemeId;
        }
        if ((i & 2) != 0) {
            str2 = videoShareInfoStruct.authorId;
        }
        if ((i & 4) != 0) {
            str3 = videoShareInfoStruct.secAuthorId;
        }
        if ((i & 8) != 0) {
            str4 = videoShareInfoStruct.authorName;
        }
        return videoShareInfoStruct.copy(str, str2, str3, str4);
    }

    public final VideoShareInfoStruct copy(String awemeId, String authorId, String secAuthorId, String authorName) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(secAuthorId, "secAuthorId");
        o.LJIIIZ(authorName, "authorName");
        return new VideoShareInfoStruct(awemeId, authorId, secAuthorId, authorName);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.awemeId, this.authorId, this.secAuthorId, this.authorName};
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getSecAuthorId() {
        return this.secAuthorId;
    }

    public VideoShareInfoStruct(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "awemeId", str2, "authorId", str3, "secAuthorId", str4, "authorName");
        this.awemeId = str;
        this.authorId = str2;
        this.secAuthorId = str3;
        this.authorName = str4;
    }

    public /* synthetic */ VideoShareInfoStruct(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
