package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99003ua implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final List<String> LJLJJLL;
    public final java.util.Map<String, String> LJLJL;
    public final List<String> LJLJLJ;
    public final java.util.Map<String, String> LJLJLLL;
    public final java.util.Map<String, String> LJLL;
    public final int LJLLI;
    public String LJLLILLLL;
    public final String LJLLJ;
    public IMUser LJLLL;
    public final String LJLLLL;
    public final boolean LJLLLLLL;
    public final int LJLZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C99003ua() {
        /*
            r20 = this;
            r1 = 0
            r11 = 0
            r18 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r20
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r11
            r17 = r11
            r19 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99003ua.<init>():void");
    }

    public static /* synthetic */ C99003ua copy$default(C99003ua c99003ua, String str, String str2, String str3, String str4, String str5, List list, java.util.Map map, List list2, java.util.Map map2, java.util.Map map3, int i, String str6, String str7, IMUser iMUser, String str8, boolean z, int i2, int i3, Object obj) {
        String str9 = str;
        String str10 = str2;
        List list3 = list;
        String str11 = str5;
        String str12 = str3;
        String str13 = str4;
        java.util.Map map4 = map3;
        java.util.Map map5 = map2;
        java.util.Map map6 = map;
        List list4 = list2;
        String str14 = str7;
        int i4 = i;
        IMUser iMUser2 = iMUser;
        String str15 = str6;
        int i5 = i2;
        String str16 = str8;
        boolean z2 = z;
        if ((i3 & 1) != 0) {
            str9 = c99003ua.LJLIL;
        }
        if ((i3 & 2) != 0) {
            str10 = c99003ua.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            str12 = c99003ua.LJLJI;
        }
        if ((i3 & 8) != 0) {
            str13 = c99003ua.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            str11 = c99003ua.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            list3 = c99003ua.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            map6 = c99003ua.LJLJL;
        }
        if ((i3 & 128) != 0) {
            list4 = c99003ua.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            map5 = c99003ua.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            map4 = c99003ua.LJLL;
        }
        if ((i3 & 1024) != 0) {
            i4 = c99003ua.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            str15 = c99003ua.LJLLILLLL;
        }
        if ((i3 & 4096) != 0) {
            str14 = c99003ua.LJLLJ;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            iMUser2 = c99003ua.LJLLL;
        }
        if ((i3 & 16384) != 0) {
            str16 = c99003ua.LJLLLL;
        }
        if ((32768 & i3) != 0) {
            z2 = c99003ua.LJLLLLLL;
        }
        if ((i3 & 65536) != 0) {
            i5 = c99003ua.LJLZ;
        }
        String str17 = str11;
        return c99003ua.copy(str9, str10, str12, str13, str17, list3, map6, list4, map5, map4, i4, str15, str14, iMUser2, str16, z2, i5);
    }

    public final C99003ua copy(String enterFrom, String enterMethod, String takoId, String takoAvatarUrl, String searchId, List<String> list, java.util.Map<String, String> map, List<String> list2, java.util.Map<String, String> map2, java.util.Map<String, String> map3, int i, String sessionId, String uuid, IMUser iMUser, String str, boolean z, int i2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(takoId, "takoId");
        o.LJIIIZ(takoAvatarUrl, "takoAvatarUrl");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(uuid, "uuid");
        return new C99003ua(enterFrom, enterMethod, takoId, takoAvatarUrl, searchId, list, map, list2, map2, map3, i, sessionId, uuid, iMUser, str, z, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C99003ua)) {
            return false;
        }
        C99003ua c99003ua = (C99003ua) obj;
        return o.LJ(this.LJLIL, c99003ua.LJLIL) && o.LJ(this.LJLILLLLZI, c99003ua.LJLILLLLZI) && o.LJ(this.LJLJI, c99003ua.LJLJI) && o.LJ(this.LJLJJI, c99003ua.LJLJJI) && o.LJ(this.LJLJJL, c99003ua.LJLJJL) && o.LJ(this.LJLJJLL, c99003ua.LJLJJLL) && o.LJ(this.LJLJL, c99003ua.LJLJL) && o.LJ(this.LJLJLJ, c99003ua.LJLJLJ) && o.LJ(this.LJLJLLL, c99003ua.LJLJLLL) && o.LJ(this.LJLL, c99003ua.LJLL) && this.LJLLI == c99003ua.LJLLI && o.LJ(this.LJLLILLLL, c99003ua.LJLLILLLL) && o.LJ(this.LJLLJ, c99003ua.LJLLJ) && o.LJ(this.LJLLL, c99003ua.LJLLL) && o.LJ(this.LJLLLL, c99003ua.LJLLLL) && this.LJLLLLLL == c99003ua.LJLLLLLL && this.LJLZ == c99003ua.LJLZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int LJ = C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31);
        List<String> list = this.LJLJJLL;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        java.util.Map<String, String> map = this.LJLJL;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<String> list2 = this.LJLJLJ;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        java.util.Map<String, String> map2 = this.LJLJLLL;
        if (map2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        java.util.Map<String, String> map3 = this.LJLL;
        if (map3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map3.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJLLJ, C79062V1e.LJ(this.LJLLILLLL, (((i5 + hashCode5) * 31) + this.LJLLI) * 31, 31), 31);
        IMUser iMUser = this.LJLLL;
        if (iMUser == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = iMUser.hashCode();
        }
        int i6 = (LJ2 + hashCode6) * 31;
        String str = this.LJLLLL;
        if (str != null) {
            i = str.hashCode();
        }
        int i7 = (i6 + i) * 31;
        boolean z = this.LJLLLLLL;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        return ((i7 + i8) * 31) + this.LJLZ;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EnterTakoParams(enterFrom=");
        sb.append(this.LJLIL);
        sb.append(", enterMethod=");
        sb.append(this.LJLILLLLZI);
        sb.append(", takoId=");
        sb.append(this.LJLJI);
        sb.append(", takoAvatarUrl=");
        sb.append(this.LJLJJI);
        sb.append(", searchId=");
        sb.append(this.LJLJJL);
        sb.append(", autoSendMsgContent=");
        sb.append(this.LJLJJLL);
        sb.append(", autoSendMsgExtra=");
        sb.append(this.LJLJL);
        sb.append(", autoWelcomeMsgContent=");
        sb.append(this.LJLJLJ);
        sb.append(", takoQueryRequestExtra=");
        sb.append(this.LJLJLLL);
        sb.append(", sendParams=");
        sb.append(this.LJLL);
        sb.append(", chatType=");
        sb.append(this.LJLLI);
        sb.append(", sessionId=");
        sb.append(this.LJLLILLLL);
        sb.append(", uuid=");
        sb.append(this.LJLLJ);
        sb.append(", imUser=");
        sb.append(this.LJLLL);
        sb.append(", lastVideoPlayDuration=");
        sb.append(this.LJLLLL);
        sb.append(", disableLocateMsgWhenEnter=");
        sb.append(this.LJLLLLLL);
        sb.append(", unreadCount=");
        return UPJ.LIZLLL(sb, this.LJLZ, ')');
    }

    public final List<String> getAutoSendMsgContent() {
        return this.LJLJJLL;
    }

    public final java.util.Map<String, String> getAutoSendMsgExtra() {
        return this.LJLJL;
    }

    public final List<String> getAutoWelcomeMsgContent() {
        return this.LJLJLJ;
    }

    public final int getChatType() {
        return this.LJLLI;
    }

    public final boolean getDisableLocateMsgWhenEnter() {
        return this.LJLLLLLL;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final IMUser getImUser() {
        return this.LJLLL;
    }

    public final String getLastVideoPlayDuration() {
        return this.LJLLLL;
    }

    public final String getSearchId() {
        return this.LJLJJL;
    }

    public final java.util.Map<String, String> getSendParams() {
        return this.LJLL;
    }

    public final String getSessionId() {
        return this.LJLLILLLL;
    }

    public final String getTakoAvatarUrl() {
        return this.LJLJJI;
    }

    public final String getTakoId() {
        return this.LJLJI;
    }

    public final java.util.Map<String, String> getTakoQueryRequestExtra() {
        return this.LJLJLLL;
    }

    public final int getUnreadCount() {
        return this.LJLZ;
    }

    public final String getUuid() {
        return this.LJLLJ;
    }

    public final void setImUser(IMUser iMUser) {
        this.LJLLL = iMUser;
    }

    public final void setSessionId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLILLLL = str;
    }

    public C99003ua(String enterFrom, String enterMethod, String takoId, String takoAvatarUrl, String searchId, List<String> list, java.util.Map<String, String> map, List<String> list2, java.util.Map<String, String> map2, java.util.Map<String, String> map3, int i, String sessionId, String uuid, IMUser iMUser, String str, boolean z, int i2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(takoId, "takoId");
        o.LJIIIZ(takoAvatarUrl, "takoAvatarUrl");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(uuid, "uuid");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = enterMethod;
        this.LJLJI = takoId;
        this.LJLJJI = takoAvatarUrl;
        this.LJLJJL = searchId;
        this.LJLJJLL = list;
        this.LJLJL = map;
        this.LJLJLJ = list2;
        this.LJLJLLL = map2;
        this.LJLL = map3;
        this.LJLLI = i;
        this.LJLLILLLL = sessionId;
        this.LJLLJ = uuid;
        this.LJLLL = iMUser;
        this.LJLLLL = str;
        this.LJLLLLLL = z;
        this.LJLZ = i2;
    }

    public /* synthetic */ C99003ua(String str, String str2, String str3, String str4, String str5, List list, java.util.Map map, List list2, java.util.Map map2, java.util.Map map3, int i, String str6, String str7, IMUser iMUser, String str8, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : map, (i3 & 128) != 0 ? null : list2, (i3 & 256) != 0 ? null : map2, (i3 & 512) != 0 ? null : map3, (i3 & 1024) != 0 ? 5 : i, (i3 & 2048) == 0 ? str6 : "", (i3 & 4096) != 0 ? AnonymousClass629.LIZ("randomUUID().toString()") : str7, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : iMUser, (i3 & 16384) != 0 ? null : str8, (32768 & i3) != 0 ? false : z, (i3 & 65536) == 0 ? i2 : 0);
    }
}
