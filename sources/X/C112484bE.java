package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112484bE {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112484bE)) {
            return false;
        }
        C112484bE c112484bE = (C112484bE) obj;
        return o.LJ(this.LIZ, c112484bE.LIZ) && o.LJ(this.LIZIZ, c112484bE.LIZIZ) && o.LJ(this.LIZJ, c112484bE.LIZJ) && o.LJ(this.LIZLLL, c112484bE.LIZLLL) && o.LJ(this.LJ, c112484bE.LJ) && o.LJ(this.LJFF, c112484bE.LJFF) && o.LJ(this.LJI, c112484bE.LJI) && o.LJ(this.LJII, c112484bE.LJII) && this.LJIIIIZZ == c112484bE.LJIIIIZZ && o.LJ(this.LJIIIZ, c112484bE.LJIIIZ) && o.LJ(this.LJIIJ, c112484bE.LJIIJ) && o.LJ(this.LJIIJJI, c112484bE.LJIIJJI) && o.LJ(this.LJIIL, c112484bE.LJIIL) && o.LJ(this.LJIILIIL, c112484bE.LJIILIIL) && o.LJ(this.LJIILJJIL, c112484bE.LJIILJJIL);
    }

    public final int hashCode() {
        return this.LJIILJJIL.hashCode() + C79062V1e.LJ(this.LJIILIIL, C79062V1e.LJ(this.LJIIL, C79062V1e.LJ(this.LJIIJJI, C79062V1e.LJ(this.LJIIJ, C79062V1e.LJ(this.LJIIIZ, (C79062V1e.LJ(this.LJII, C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31) + this.LJIIIIZZ) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppPushEventParams(enterFrom=");
        sb.append(this.LIZ);
        sb.append(", authorId=");
        sb.append(this.LIZIZ);
        sb.append(", groupId=");
        sb.append(this.LIZJ);
        sb.append(", pushChannel=");
        sb.append(this.LIZLLL);
        sb.append(", ruleId=");
        sb.append(this.LJ);
        sb.append(", pushLabel=");
        sb.append(this.LJFF);
        sb.append(", fromUserId=");
        sb.append(this.LJI);
        sb.append(", chatType=");
        sb.append(this.LJII);
        sb.append(", chatCount=");
        sb.append(this.LJIIIIZZ);
        sb.append(", resourceType=");
        sb.append(this.LJIIIZ);
        sb.append(", messageNotificationType=");
        sb.append(this.LJIIJ);
        sb.append(", messageType=");
        sb.append(this.LJIIJJI);
        sb.append(", realMessageType=");
        sb.append(this.LJIIL);
        sb.append(", businessTag=");
        sb.append(this.LJIILIIL);
        sb.append(", itemType=");
        return C07670Rv.LIZIZ(sb, this.LJIILJJIL, ')');
    }

    public C112484bE(String enterFrom, String str, String str2, String itemType, String fromUserId, String str3, int i, String str4, String messageNotificationType, String messageType, String realMessageType) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(itemType, "pushLabel");
        o.LJIIIZ(fromUserId, "fromUserId");
        o.LJIIIZ(messageNotificationType, "messageNotificationType");
        o.LJIIIZ(messageType, "messageType");
        o.LJIIIZ(realMessageType, "realMessageType");
        o.LJIIIZ(itemType, "itemType");
        this.LIZ = enterFrom;
        this.LIZIZ = str;
        this.LIZJ = "";
        this.LIZLLL = "Android";
        this.LJ = str2;
        this.LJFF = itemType;
        this.LJI = fromUserId;
        this.LJII = str3;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str4;
        this.LJIIJ = messageNotificationType;
        this.LJIIJJI = messageType;
        this.LJIIL = realMessageType;
        this.LJIILIIL = "DM";
        this.LJIILJJIL = itemType;
    }
}
