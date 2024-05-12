package com.ss.android.ugc.aweme.api;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoRelatedInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("author_id")
    public final long authorId;

    @InterfaceC65349Pkn("author_nickname")
    public final String authorNickName;

    @InterfaceC65349Pkn("sec_author_uid")
    public final String authorSecUid;

    @InterfaceC65349Pkn("video_id")
    public final long awemeId;

    @InterfaceC65349Pkn("is_author_private_account")
    public final int isPrivateAccount;

    @InterfaceC65349Pkn("author_unique_id")
    public final String uniqueId;

    @InterfaceC65349Pkn("video_status")
    public final int videoStatus;

    public static /* synthetic */ VideoRelatedInfo copy$default(VideoRelatedInfo videoRelatedInfo, long j, long j2, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = videoRelatedInfo.awemeId;
        }
        if ((i3 & 2) != 0) {
            j2 = videoRelatedInfo.authorId;
        }
        if ((i3 & 4) != 0) {
            str = videoRelatedInfo.authorNickName;
        }
        if ((i3 & 8) != 0) {
            str2 = videoRelatedInfo.authorSecUid;
        }
        if ((i3 & 16) != 0) {
            i = videoRelatedInfo.videoStatus;
        }
        if ((i3 & 32) != 0) {
            i2 = videoRelatedInfo.isPrivateAccount;
        }
        if ((i3 & 64) != 0) {
            str3 = videoRelatedInfo.uniqueId;
        }
        return videoRelatedInfo.copy(j, j2, str, str2, i, i2, str3);
    }

    public final VideoRelatedInfo copy(long j, long j2, String authorNickName, String authorSecUid, int i, int i2, String uniqueId) {
        o.LJIIIZ(authorNickName, "authorNickName");
        o.LJIIIZ(authorSecUid, "authorSecUid");
        o.LJIIIZ(uniqueId, "uniqueId");
        return new VideoRelatedInfo(j, j2, authorNickName, authorSecUid, i, i2, uniqueId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.awemeId), Long.valueOf(this.authorId), this.authorNickName, this.authorSecUid, Integer.valueOf(this.videoStatus), Integer.valueOf(this.isPrivateAccount), this.uniqueId};
    }

    public final long getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorNickName() {
        return this.authorNickName;
    }

    public final String getAuthorSecUid() {
        return this.authorSecUid;
    }

    public final long getAwemeId() {
        return this.awemeId;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final int getVideoStatus() {
        return this.videoStatus;
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public VideoRelatedInfo(long j, long j2, String str, String str2, int i, int i2, String str3) {
        HH1.LIZ(str, "authorNickName", str2, "authorSecUid", str3, "uniqueId");
        this.awemeId = j;
        this.authorId = j2;
        this.authorNickName = str;
        this.authorSecUid = str2;
        this.videoStatus = i;
        this.isPrivateAccount = i2;
        this.uniqueId = str3;
    }
}
