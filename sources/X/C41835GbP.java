package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GbP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41835GbP extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final String LJLL;
    public final String LJLLI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), this.LJLL, this.LJLLI};
    }

    public static C41835GbP L(C41835GbP c41835GbP, String str, String str2, int i, String str3, String str4, int i2) {
        String isFirst;
        String groupId;
        int i3;
        int i4;
        int i5;
        String icon = str4;
        String position = str3;
        int i6 = i;
        String enterFrom = str;
        String enterMethod = str2;
        String authorId = null;
        if ((i2 & 1) != 0) {
            isFirst = c41835GbP.LJLIL;
        } else {
            isFirst = null;
        }
        if ((i2 & 2) != 0) {
            enterFrom = c41835GbP.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            groupId = c41835GbP.LJLJI;
        } else {
            groupId = null;
        }
        if ((i2 & 8) != 0) {
            authorId = c41835GbP.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            enterMethod = c41835GbP.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            i3 = c41835GbP.LJLJJLL;
        } else {
            i3 = 0;
        }
        if ((i2 & 64) != 0) {
            i4 = c41835GbP.LJLJL;
        } else {
            i4 = 0;
        }
        if ((i2 & 128) != 0) {
            i6 = c41835GbP.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            i5 = c41835GbP.LJLJLLL;
        } else {
            i5 = 0;
        }
        if ((i2 & 512) != 0) {
            position = c41835GbP.LJLL;
        }
        if ((i2 & 1024) != 0) {
            icon = c41835GbP.LJLLI;
        }
        c41835GbP.getClass();
        o.LJIIIZ(isFirst, "isFirst");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(icon, "icon");
        return new C41835GbP(isFirst, enterFrom, groupId, authorId, enterMethod, i3, position, i4, i6, icon, i5);
    }

    public C41835GbP(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, String str7, int i4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLJLJ = i3;
        this.LJLJLLL = i4;
        this.LJLL = str6;
        this.LJLLI = str7;
    }
}
