package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98803uG implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Boolean LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;
    public final int LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final String LJLLILLLL;
    public final UrlModel LJLLJ;
    public final Integer LJLLL;
    public final Integer LJLLLL;
    public final Integer LJLLLLLL;
    public final String LJLZ;
    public final String LJZ;

    public static /* synthetic */ C98803uG copy$default(C98803uG c98803uG, String str, String str2, String str3, String str4, Boolean bool, String str5, int i, String str6, int i2, boolean z, boolean z2, String str7, UrlModel urlModel, Integer num, Integer num2, Integer num3, String str8, String str9, int i3, Object obj) {
        String str10 = str4;
        String str11 = str3;
        String str12 = str;
        String str13 = str2;
        int i4 = i2;
        String str14 = str6;
        int i5 = i;
        Boolean bool2 = bool;
        String str15 = str5;
        Integer num4 = num;
        UrlModel urlModel2 = urlModel;
        String str16 = str7;
        boolean z3 = z;
        boolean z4 = z2;
        String str17 = str9;
        String str18 = str8;
        Integer num5 = num2;
        Integer num6 = num3;
        if ((i3 & 1) != 0) {
            str12 = c98803uG.LJLIL;
        }
        if ((i3 & 2) != 0) {
            str13 = c98803uG.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            str11 = c98803uG.LJLJI;
        }
        if ((i3 & 8) != 0) {
            str10 = c98803uG.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            bool2 = c98803uG.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            str15 = c98803uG.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            i5 = c98803uG.LJLJL;
        }
        if ((i3 & 128) != 0) {
            str14 = c98803uG.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            i4 = c98803uG.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            z3 = c98803uG.LJLL;
        }
        if ((i3 & 1024) != 0) {
            z4 = c98803uG.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            str16 = c98803uG.LJLLILLLL;
        }
        if ((i3 & 4096) != 0) {
            urlModel2 = c98803uG.LJLLJ;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            num4 = c98803uG.LJLLL;
        }
        if ((i3 & 16384) != 0) {
            num5 = c98803uG.LJLLLL;
        }
        if ((32768 & i3) != 0) {
            num6 = c98803uG.LJLLLLLL;
        }
        if ((65536 & i3) != 0) {
            str18 = c98803uG.LJLZ;
        }
        if ((i3 & 131072) != 0) {
            str17 = c98803uG.LJZ;
        }
        String str19 = str15;
        int i6 = i5;
        String str20 = str14;
        return c98803uG.copy(str12, str13, str11, str10, bool2, str19, i6, str20, i4, z3, z4, str16, urlModel2, num4, num5, num6, str18, str17);
    }

    public final C98803uG copy(String objectId, String ownerId, String conversationId, String str, Boolean bool, String reportType, int i, String str2, int i2, boolean z, boolean z2, String str3, UrlModel urlModel, Integer num, Integer num2, Integer num3, String entrance, String str4) {
        o.LJIIIZ(objectId, "objectId");
        o.LJIIIZ(ownerId, "ownerId");
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(reportType, "reportType");
        o.LJIIIZ(entrance, "entrance");
        return new C98803uG(objectId, ownerId, conversationId, str, bool, reportType, i, str2, i2, z, z2, str3, urlModel, num, num2, num3, entrance, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98803uG)) {
            return false;
        }
        C98803uG c98803uG = (C98803uG) obj;
        return o.LJ(this.LJLIL, c98803uG.LJLIL) && o.LJ(this.LJLILLLLZI, c98803uG.LJLILLLLZI) && o.LJ(this.LJLJI, c98803uG.LJLJI) && o.LJ(this.LJLJJI, c98803uG.LJLJJI) && o.LJ(this.LJLJJL, c98803uG.LJLJJL) && o.LJ(this.LJLJJLL, c98803uG.LJLJJLL) && this.LJLJL == c98803uG.LJLJL && o.LJ(this.LJLJLJ, c98803uG.LJLJLJ) && this.LJLJLLL == c98803uG.LJLJLLL && this.LJLL == c98803uG.LJLL && this.LJLLI == c98803uG.LJLLI && o.LJ(this.LJLLILLLL, c98803uG.LJLLILLLL) && o.LJ(this.LJLLJ, c98803uG.LJLLJ) && o.LJ(this.LJLLL, c98803uG.LJLLL) && o.LJ(this.LJLLLL, c98803uG.LJLLLL) && o.LJ(this.LJLLLLLL, c98803uG.LJLLLLLL) && o.LJ(this.LJLZ, c98803uG.LJLZ) && o.LJ(this.LJZ, c98803uG.LJZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        String str = this.LJLJJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Boolean bool = this.LJLJJL;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int LJ2 = (C79062V1e.LJ(this.LJLJJLL, (i2 + hashCode2) * 31, 31) + this.LJLJL) * 31;
        String str2 = this.LJLJLJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (((LJ2 + hashCode3) * 31) + this.LJLJLLL) * 31;
        boolean z = this.LJLL;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        if (!this.LJLLI) {
            i4 = 0;
        }
        int i7 = (i6 + i4) * 31;
        String str3 = this.LJLLILLLL;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        UrlModel urlModel = this.LJLLJ;
        if (urlModel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = urlModel.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        Integer num = this.LJLLL;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        Integer num2 = this.LJLLLL;
        if (num2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num2.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        Integer num3 = this.LJLLLLLL;
        if (num3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num3.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.LJLZ, (i11 + hashCode8) * 31, 31);
        String str4 = this.LJZ;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return LJ3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportParams(objectId=");
        sb.append(this.LJLIL);
        sb.append(", ownerId=");
        sb.append(this.LJLILLLLZI);
        sb.append(", conversationId=");
        sb.append(this.LJLJI);
        sb.append(", uniqueId=");
        sb.append(this.LJLJJI);
        sb.append(", isBlocked=");
        sb.append(this.LJLJJL);
        sb.append(", reportType=");
        sb.append(this.LJLJJLL);
        sb.append(", chatType=");
        sb.append(this.LJLJL);
        sb.append(", conversationName=");
        sb.append(this.LJLJLJ);
        sb.append(", defaultMsgSelectedNumber=");
        sb.append(this.LJLJLLL);
        sb.append(", isHighRiskConversation=");
        sb.append(this.LJLL);
        sb.append(", isMediaMsgMasking=");
        sb.append(this.LJLLI);
        sb.append(", nickName=");
        sb.append(this.LJLLILLLL);
        sb.append(", displayAvatar=");
        sb.append(this.LJLLJ);
        sb.append(", followingCount=");
        sb.append(this.LJLLL);
        sb.append(", followerCount=");
        sb.append(this.LJLLLL);
        sb.append(", followStatus=");
        sb.append(this.LJLLLLLL);
        sb.append(", entrance=");
        sb.append(this.LJLZ);
        sb.append(", enterFrom=");
        return C07670Rv.LIZIZ(sb, this.LJZ, ')');
    }

    public final int getChatType() {
        return this.LJLJL;
    }

    public final String getConversationId() {
        return this.LJLJI;
    }

    public final String getConversationName() {
        return this.LJLJLJ;
    }

    public final int getDefaultMsgSelectedNumber() {
        return this.LJLJLLL;
    }

    public final UrlModel getDisplayAvatar() {
        return this.LJLLJ;
    }

    public final String getEnterFrom() {
        return this.LJZ;
    }

    public final String getEntrance() {
        return this.LJLZ;
    }

    public final Integer getFollowStatus() {
        return this.LJLLLLLL;
    }

    public final Integer getFollowerCount() {
        return this.LJLLLL;
    }

    public final Integer getFollowingCount() {
        return this.LJLLL;
    }

    public final String getNickName() {
        return this.LJLLILLLL;
    }

    public final String getObjectId() {
        return this.LJLIL;
    }

    public final String getOwnerId() {
        return this.LJLILLLLZI;
    }

    public final String getReportType() {
        return this.LJLJJLL;
    }

    public final String getUniqueId() {
        return this.LJLJJI;
    }

    public final Boolean isBlocked() {
        return this.LJLJJL;
    }

    public final boolean isHighRiskConversation() {
        return this.LJLL;
    }

    public final boolean isMediaMsgMasking() {
        return this.LJLLI;
    }

    public C98803uG(String objectId, String ownerId, String conversationId, String str, Boolean bool, String reportType, int i, String str2, int i2, boolean z, boolean z2, String str3, UrlModel urlModel, Integer num, Integer num2, Integer num3, String entrance, String str4) {
        o.LJIIIZ(objectId, "objectId");
        o.LJIIIZ(ownerId, "ownerId");
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(reportType, "reportType");
        o.LJIIIZ(entrance, "entrance");
        this.LJLIL = objectId;
        this.LJLILLLLZI = ownerId;
        this.LJLJI = conversationId;
        this.LJLJJI = str;
        this.LJLJJL = bool;
        this.LJLJJLL = reportType;
        this.LJLJL = i;
        this.LJLJLJ = str2;
        this.LJLJLLL = i2;
        this.LJLL = z;
        this.LJLLI = z2;
        this.LJLLILLLL = str3;
        this.LJLLJ = urlModel;
        this.LJLLL = num;
        this.LJLLLL = num2;
        this.LJLLLLLL = num3;
        this.LJLZ = entrance;
        this.LJZ = str4;
    }

    public /* synthetic */ C98803uG(String str, String str2, String str3, String str4, Boolean bool, String str5, int i, String str6, int i2, boolean z, boolean z2, String str7, UrlModel urlModel, Integer num, Integer num2, Integer num3, String str8, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : bool, str5, i, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? false : z, (i3 & 1024) != 0 ? false : z2, (i3 & 2048) != 0 ? null : str7, (i3 & 4096) != 0 ? null : urlModel, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : num, (i3 & 16384) != 0 ? null : num2, (32768 & i3) != 0 ? null : num3, (65536 & i3) != 0 ? "" : str8, (i3 & 131072) == 0 ? str9 : null);
    }
}
