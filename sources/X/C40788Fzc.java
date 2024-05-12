package X;

import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fzc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40788Fzc extends C35656Dz2 {
    public static final /* synthetic */ int LJFF = 0;
    public final boolean LIZIZ;
    public final C40865G2b LIZJ;
    public final List<NewUserInterestStruct> LIZLLL;
    public final List<TopicInterestCategoryStruct> LJ;

    public C40788Fzc() {
        this(null, null, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C40788Fzc(X.C40865G2b r7, java.util.List r8, int r9) {
        /*
            r6 = this;
            r2 = r7
            r3 = r8
            r0 = r9 & 1
            if (r0 == 0) goto L1f
            r1 = 1
        L7:
            r0 = r9 & 2
            r4 = 0
            if (r0 == 0) goto Ld
            r2 = r4
        Ld:
            r0 = r9 & 4
            if (r0 == 0) goto L13
            X.OQg r3 = X.C61878OQg.INSTANCE
        L13:
            r0 = r9 & 8
            if (r0 == 0) goto L19
            X.OQg r4 = X.C61878OQg.INSTANCE
        L19:
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            r1 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40788Fzc.<init>(X.G2b, java.util.List, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40788Fzc(boolean z, C40865G2b c40865G2b, List<NewUserInterestStruct> interestsList, List<TopicInterestCategoryStruct> topicInterestList, String str) {
        super(str);
        o.LJIIIZ(interestsList, "interestsList");
        o.LJIIIZ(topicInterestList, "topicInterestList");
        this.LIZIZ = z;
        this.LIZJ = c40865G2b;
        this.LIZLLL = interestsList;
        this.LJ = topicInterestList;
    }
}
