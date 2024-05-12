package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4ID, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ID {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4ID)) {
            return false;
        }
        C4ID c4id = (C4ID) obj;
        return o.LJ(this.LIZ, c4id.LIZ) && o.LJ(this.LIZIZ, c4id.LIZIZ) && o.LJ(this.LIZJ, c4id.LIZJ) && o.LJ(this.LIZLLL, c4id.LIZLLL) && o.LJ(this.LJ, c4id.LJ) && o.LJ(this.LJFF, c4id.LJFF) && this.LJI == c4id.LJI && this.LJII == c4id.LJII && o.LJ(this.LJIIIIZZ, c4id.LJIIIIZZ) && this.LJIIIZ == c4id.LJIIIZ && this.LJIIJ == c4id.LJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = (C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ2 = (C79062V1e.LJ(this.LJIIIIZZ, (LJ + i2) * 31, 31) + this.LJIIIZ) * 31;
        if (!this.LJIIJ) {
            i = 0;
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickChatEventParams(enterFrom=");
        sb.append(this.LIZ);
        sb.append(", enterMethod=");
        sb.append(this.LIZIZ);
        sb.append(", conversationId=");
        sb.append(this.LIZJ);
        sb.append(", authorId=");
        sb.append(this.LIZLLL);
        sb.append(", groupId=");
        sb.append(this.LJ);
        sb.append(", toUserId=");
        sb.append(this.LJFF);
        sb.append(", chatType=");
        sb.append(this.LJI);
        sb.append(", isFromTCM=");
        sb.append(this.LJII);
        sb.append(", panelSource=");
        sb.append(this.LJIIIIZZ);
        sb.append(", innerPushType=");
        sb.append(this.LJIIIZ);
        sb.append(", isRecommendedChat=");
        return C08880Wm.LIZJ(sb, this.LJIIJ, ')');
    }

    public C4ID(String enterFrom, String enterMethod, int i, String conversationId, String authorId, String groupId, String str, boolean z, boolean z2, String panelSource, int i2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(panelSource, "panelSource");
        this.LIZ = enterFrom;
        this.LIZIZ = enterMethod;
        this.LIZJ = conversationId;
        this.LIZLLL = authorId;
        this.LJ = groupId;
        this.LJFF = str;
        this.LJI = i;
        this.LJII = z;
        this.LJIIIIZZ = panelSource;
        this.LJIIIZ = i2;
        this.LJIIJ = z2;
    }
}
