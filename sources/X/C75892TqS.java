package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TqS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75892TqS extends OFU {
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final java.util.Map<String, Object> LJLJLJ;
    public final String LJLJLLL;
    public final MHJoinReplyBizContent LJLL;
    public final List<String> LJLLI;

    public C75892TqS() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LJLJJLL, JBR.LIZJ(this.LJLJJL, JBR.LIZJ(this.LJLJJI, JBR.LIZJ(this.LJLJI, this.LJLILLLLZI * 31, 31), 31), 31), 31) + this.LJLJL) * 31;
        java.util.Map<String, Object> map = this.LJLJLJ;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJLJLLL, (LJ + hashCode) * 31, 31);
        MHJoinReplyBizContent mHJoinReplyBizContent = this.LJLL;
        if (mHJoinReplyBizContent != null) {
            i = mHJoinReplyBizContent.hashCode();
        }
        return this.LJLLI.hashCode() + ((LJ2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHJoinReplyParam(joinType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", roomId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", userId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", channelId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", linkMicId=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", replyStatus=");
        LIZ.append(this.LJLJL);
        LIZ.append(", custom=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", source=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", bizContent=");
        LIZ.append(this.LJLL);
        LIZ.append(", sourceTrace=");
        return C1NE.LIZIZ(LIZ, this.LJLLI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75892TqS)) {
            return false;
        }
        C75892TqS c75892TqS = (C75892TqS) obj;
        if (this.LJLILLLLZI == c75892TqS.LJLILLLLZI && this.LJLJI == c75892TqS.LJLJI && this.LJLJJI == c75892TqS.LJLJJI && this.LJLJJL == c75892TqS.LJLJJL && o.LJ(this.LJLJJLL, c75892TqS.LJLJJLL) && this.LJLJL == c75892TqS.LJLJL && o.LJ(this.LJLJLJ, c75892TqS.LJLJLJ) && o.LJ(this.LJLJLLL, c75892TqS.LJLJLLL) && o.LJ(this.LJLL, c75892TqS.LJLL) && o.LJ(this.LJLLI, c75892TqS.LJLLI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C75892TqS(int r6, long r7, long r9, long r11, java.lang.String r13, int r14, java.util.Map r15, java.lang.String r16, com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent r17, java.util.List r18, int r19) {
        /*
            r5 = this;
            r4 = r19
            r3 = r18
            r0 = r4 & 1
            if (r0 == 0) goto L9
            r6 = 0
        L9:
            r0 = r4 & 16
            java.lang.String r2 = ""
            if (r0 == 0) goto L10
            r13 = r2
        L10:
            r0 = r4 & 64
            r1 = 0
            if (r0 == 0) goto L16
            r15 = r1
        L16:
            r0 = r4 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4e
        L1a:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4b
        L1e:
            r0 = r4 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L24
            X.OQg r3 = X.C61878OQg.INSTANCE
        L24:
            java.lang.String r0 = "linkMicId"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "sourceTrace"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r5.<init>(r3)
            r5.LJLILLLLZI = r6
            r5.LJLJI = r7
            r5.LJLJJI = r9
            r5.LJLJJL = r11
            r5.LJLJJLL = r13
            r5.LJLJL = r14
            r5.LJLJLJ = r15
            r5.LJLJLLL = r2
            r5.LJLL = r1
            r5.LJLLI = r3
            return
        L4b:
            r1 = r17
            goto L1e
        L4e:
            r2 = r16
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75892TqS.<init>(int, long, long, long, java.lang.String, int, java.util.Map, java.lang.String, com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent, java.util.List, int):void");
    }
}
