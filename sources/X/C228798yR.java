package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228798yR implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final List<Aweme> LJLJI;
    public final ArrayList<String> LJLJJI;
    public final String LJLJJL;
    public final C43I<EnumC228948yg> LJLJJLL;
    public final AbstractC72932td<ManageResponse> LJLJL;
    public final AbstractC72932td<ManageResponse> LJLJLJ;
    public final String LJLJLLL;
    public final C43I<Object> LJLL;
    public final boolean LJLLI;

    public C228798yR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C228798yR)) {
            return false;
        }
        C228798yR c228798yR = (C228798yR) obj;
        return o.LJ(this.LJLIL, c228798yR.LJLIL) && o.LJ(this.LJLILLLLZI, c228798yR.LJLILLLLZI) && o.LJ(this.LJLJI, c228798yR.LJLJI) && o.LJ(this.LJLJJI, c228798yR.LJLJJI) && o.LJ(this.LJLJJL, c228798yR.LJLJJL) && o.LJ(this.LJLJJLL, c228798yR.LJLJJLL) && o.LJ(this.LJLJL, c228798yR.LJLJL) && o.LJ(this.LJLJLJ, c228798yR.LJLJLJ) && o.LJ(this.LJLJLLL, c228798yR.LJLJLLL) && o.LJ(this.LJLL, c228798yR.LJLL) && this.LJLLI == c228798yR.LJLLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        List<Aweme> list = this.LJLJI;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        ArrayList<String> arrayList = this.LJLJJI;
        if (arrayList == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arrayList.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.LJLJJL;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C43I<EnumC228948yg> c43i = this.LJLJJLL;
        if (c43i == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJLJLLL, C03090Af.LIZ(this.LJLJLJ, C03090Af.LIZ(this.LJLJL, (i4 + hashCode4) * 31, 31), 31), 31);
        C43I<Object> c43i2 = this.LJLL;
        if (c43i2 != null) {
            i = c43i2.hashCode();
        }
        int i5 = (LJ2 + i) * 31;
        boolean z = this.LJLLI;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        return i5 + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixCreateState(enterFrom=");
        sb.append(this.LJLIL);
        sb.append(", enterMethod=");
        sb.append(this.LJLILLLLZI);
        sb.append(", mixVideos=");
        sb.append(this.LJLJI);
        sb.append(", addedFeedsID=");
        sb.append(this.LJLJJI);
        sb.append(", mixName=");
        sb.append(this.LJLJJL);
        sb.append(", nextFragment=");
        sb.append(this.LJLJJLL);
        sb.append(", createRequest=");
        sb.append(this.LJLJL);
        sb.append(", addVideoRequest=");
        sb.append(this.LJLJLJ);
        sb.append(", mixId=");
        sb.append(this.LJLJLLL);
        sb.append(", positionChange=");
        sb.append(this.LJLL);
        sb.append(", isCreateFlag=");
        return C08880Wm.LIZJ(sb, this.LJLLI, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C228798yR(int r13) {
        /*
            r12 = this;
            java.lang.String r1 = ""
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            X.33X r7 = X.C33X.LIZ
            r11 = 1
            r0 = r12
            r2 = r1
            r6 = r5
            r8 = r7
            r9 = r1
            r10 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228798yR.<init>(int):void");
    }

    public static C228798yR LIZ(C228798yR c228798yR, List list, String str, C43I c43i, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, String str2, boolean z, int i) {
        String enterFrom;
        String enterMethod;
        ArrayList<String> arrayList;
        boolean z2 = z;
        String str3 = str;
        List list2 = list;
        C43I c43i2 = c43i;
        AbstractC72932td createRequest = abstractC72932td;
        AbstractC72932td addVideoRequest = abstractC72932td2;
        String mixId = str2;
        C43I<Object> c43i3 = null;
        if ((i & 1) != 0) {
            enterFrom = c228798yR.LJLIL;
        } else {
            enterFrom = null;
        }
        if ((i & 2) != 0) {
            enterMethod = c228798yR.LJLILLLLZI;
        } else {
            enterMethod = null;
        }
        if ((i & 4) != 0) {
            list2 = c228798yR.LJLJI;
        }
        if ((i & 8) != 0) {
            arrayList = c228798yR.LJLJJI;
        } else {
            arrayList = null;
        }
        if ((i & 16) != 0) {
            str3 = c228798yR.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i2 = c228798yR.LJLJJLL;
        }
        if ((i & 64) != 0) {
            createRequest = c228798yR.LJLJL;
        }
        if ((i & 128) != 0) {
            addVideoRequest = c228798yR.LJLJLJ;
        }
        if ((i & 256) != 0) {
            mixId = c228798yR.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c43i3 = c228798yR.LJLL;
        }
        if ((i & 1024) != 0) {
            z2 = c228798yR.LJLLI;
        }
        c228798yR.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(createRequest, "createRequest");
        o.LJIIIZ(addVideoRequest, "addVideoRequest");
        o.LJIIIZ(mixId, "mixId");
        return new C228798yR(enterFrom, enterMethod, list2, arrayList, str3, c43i2, createRequest, addVideoRequest, mixId, c43i3, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C228798yR(String enterFrom, String enterMethod, List<? extends Aweme> list, ArrayList<String> arrayList, String str, C43I<? extends EnumC228948yg> c43i, AbstractC72932td<ManageResponse> createRequest, AbstractC72932td<ManageResponse> addVideoRequest, String mixId, C43I<Object> c43i2, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(createRequest, "createRequest");
        o.LJIIIZ(addVideoRequest, "addVideoRequest");
        o.LJIIIZ(mixId, "mixId");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = enterMethod;
        this.LJLJI = list;
        this.LJLJJI = arrayList;
        this.LJLJJL = str;
        this.LJLJJLL = c43i;
        this.LJLJL = createRequest;
        this.LJLJLJ = addVideoRequest;
        this.LJLJLLL = mixId;
        this.LJLL = c43i2;
        this.LJLLI = z;
    }
}
