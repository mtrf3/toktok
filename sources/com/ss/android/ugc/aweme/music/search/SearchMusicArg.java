package com.ss.android.ugc.aweme.music.search;

import X.InterfaceC87283bg;
import X.X1D;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicArg implements InterfaceC87283bg {
    public final boolean isMe;
    public final PinnedMusicList pinnedMusicList;
    public final String previousPage;
    public final String secUserID;
    public final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMusicArg() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMusicArg(boolean z) {
        this(z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMusicArg(boolean z, String str) {
        this(z, str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMusicArg(boolean z, String str, String str2) {
        this(z, str, str2, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMusicArg(boolean z, String str, String str2, String str3) {
        this(z, str, str2, str3, null, 16, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchMusicArg copy$default(SearchMusicArg searchMusicArg, boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchMusicArg.isMe;
        }
        if ((i & 2) != 0) {
            str = searchMusicArg.userId;
        }
        if ((i & 4) != 0) {
            str2 = searchMusicArg.secUserID;
        }
        if ((i & 8) != 0) {
            str3 = searchMusicArg.previousPage;
        }
        if ((i & 16) != 0) {
            pinnedMusicList = searchMusicArg.pinnedMusicList;
        }
        return searchMusicArg.copy(z, str, str2, str3, pinnedMusicList);
    }

    public final SearchMusicArg copy(boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList) {
        return new SearchMusicArg(z, str, str2, str3, pinnedMusicList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMusicArg)) {
            return false;
        }
        SearchMusicArg searchMusicArg = (SearchMusicArg) obj;
        return this.isMe == searchMusicArg.isMe && o.LJ(this.userId, searchMusicArg.userId) && o.LJ(this.secUserID, searchMusicArg.secUserID) && o.LJ(this.previousPage, searchMusicArg.previousPage) && o.LJ(this.pinnedMusicList, searchMusicArg.pinnedMusicList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public int hashCode() {
        boolean z = this.isMe;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.userId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUserID;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previousPage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PinnedMusicList pinnedMusicList = this.pinnedMusicList;
        return hashCode3 + (pinnedMusicList != null ? pinnedMusicList.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchMusicArg(isMe=");
        LIZ.append(this.isMe);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", secUserID=");
        LIZ.append(this.secUserID);
        LIZ.append(", previousPage=");
        LIZ.append(this.previousPage);
        LIZ.append(", pinnedMusicList=");
        LIZ.append(this.pinnedMusicList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final PinnedMusicList getPinnedMusicList() {
        return this.pinnedMusicList;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSecUserID() {
        return this.secUserID;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public SearchMusicArg(boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList) {
        this.isMe = z;
        this.userId = str;
        this.secUserID = str2;
        this.previousPage = str3;
        this.pinnedMusicList = pinnedMusicList;
    }

    public /* synthetic */ SearchMusicArg(boolean z, String str, String str2, String str3, PinnedMusicList pinnedMusicList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? pinnedMusicList : null);
    }
}
