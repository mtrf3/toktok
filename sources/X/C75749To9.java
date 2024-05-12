package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.To9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75749To9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC75614Tly LJ;
    public final List<String> LJFF;
    public final Object LJI;
    public final java.util.Map<String, String> LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;

    public C75749To9() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75749To9)) {
            return false;
        }
        C75749To9 c75749To9 = (C75749To9) obj;
        return o.LJ(this.LIZ, c75749To9.LIZ) && o.LJ(this.LIZIZ, c75749To9.LIZIZ) && o.LJ(this.LIZJ, c75749To9.LIZJ) && o.LJ(this.LIZLLL, c75749To9.LIZLLL) && this.LJ == c75749To9.LJ && o.LJ(this.LJFF, c75749To9.LJFF) && o.LJ(this.LJI, c75749To9.LJI) && o.LJ(this.LJII, c75749To9.LJII) && o.LJ(this.LJIIIIZZ, c75749To9.LJIIIIZZ) && this.LJIIIZ == c75749To9.LJIIIZ && this.LJIIJ == c75749To9.LJIIJ && o.LJ(this.LJIIJJI, c75749To9.LJIIJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJFF, (this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31)) * 31, 31);
        Object obj = this.LJI;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        java.util.Map<String, String> map = this.LJII;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJIIIIZZ, (i2 + hashCode2) * 31, 31);
        boolean z = this.LJIIIZ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (LJ + i4) * 31;
        if (!this.LJIIJ) {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str = this.LJIIJJI;
        if (str != null) {
            i = str.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteAnchorInfo(receiveUid=");
        sb.append(this.LIZ);
        sb.append(", receiveSecUid=");
        sb.append(this.LIZIZ);
        sb.append(", invitedRoomID=");
        sb.append(this.LIZJ);
        sb.append(", inviteeName=");
        sb.append(this.LIZLLL);
        sb.append(", inviteType=");
        sb.append(this.LJ);
        sb.append(", avatarUrlList=");
        sb.append(this.LJFF);
        sb.append(", extra=");
        sb.append(this.LJI);
        sb.append(", trackInfo=");
        sb.append(this.LJII);
        sb.append(", requestPage=");
        sb.append(this.LJIIIIZZ);
        sb.append(", checkPerceptionCenter=");
        sb.append(this.LJIIIZ);
        sb.append(", isFromViolationDialog=");
        sb.append(this.LJIIJ);
        sb.append(", requestFrom=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    public C75749To9(String receiveUid, String str, String invitedRoomID, String str2, EnumC75614Tly inviteType, List avatarUrlList, java.util.Map map, String requestPage, boolean z, int i) {
        boolean z2;
        map = (i & 128) != 0 ? null : map;
        requestPage = (i & 256) != 0 ? "" : requestPage;
        if ((i & 512) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 1024) != 0 ? false : z;
        o.LJIIIZ(receiveUid, "receiveUid");
        o.LJIIIZ(invitedRoomID, "invitedRoomID");
        o.LJIIIZ(inviteType, "inviteType");
        o.LJIIIZ(avatarUrlList, "avatarUrlList");
        o.LJIIIZ(requestPage, "requestPage");
        this.LIZ = receiveUid;
        this.LIZIZ = str;
        this.LIZJ = invitedRoomID;
        this.LIZLLL = str2;
        this.LJ = inviteType;
        this.LJFF = avatarUrlList;
        this.LJI = null;
        this.LJII = map;
        this.LJIIIIZZ = requestPage;
        this.LJIIIZ = z2;
        this.LJIIJ = z;
        this.LJIIJJI = null;
    }
}
