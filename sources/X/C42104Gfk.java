package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42104Gfk extends F9E implements InterfaceC42095Gfb {
    public final List<String> LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public C42104Gfk() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C42104Gfk(int i) {
        this(C61878OQg.INSTANCE, "", "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C42104Gfk(java.util.List<java.lang.String> r4, java.lang.String r5, com.ss.android.ugc.aweme.shortvideo.AVChallenge r6) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            if (r5 != 0) goto L5
            r5 = r2
        L5:
            java.util.List r0 = X.SFS.LIZJ(r4)
            java.util.List r1 = X.SFS.LJIIJ(r0)
            if (r6 == 0) goto L13
            java.lang.String r0 = r6.challengeName
            if (r0 != 0) goto L17
        L13:
            r3.<init>(r1, r2, r5)
            return
        L17:
            r2 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42104Gfk.<init>(java.util.List, java.lang.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge):void");
    }

    public C42104Gfk(List<String> effectIds, String challengeName, String missionId) {
        o.LJIIIZ(effectIds, "effectIds");
        o.LJIIIZ(challengeName, "challengeName");
        o.LJIIIZ(missionId, "missionId");
        this.LJLIL = effectIds;
        this.LJLILLLLZI = challengeName;
        this.LJLJI = missionId;
    }
}
