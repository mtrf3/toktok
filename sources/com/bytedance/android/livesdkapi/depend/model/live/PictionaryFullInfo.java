package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PictionaryFullInfo {

    @InterfaceC65349Pkn("guess_correct")
    public boolean guessCorrect;

    @InterfaceC65349Pkn("pictionary_info")
    public PictionaryInfo pictionaryInfo;

    @InterfaceC65349Pkn("pictionary_statistics")
    public PictionaryStatistics pictionaryStatistics;

    /* JADX WARN: Multi-variable type inference failed */
    public PictionaryFullInfo() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public PictionaryFullInfo(PictionaryInfo pictionaryInfo, PictionaryStatistics pictionaryStatistics, boolean z) {
        o.LJIIIZ(pictionaryInfo, "pictionaryInfo");
        o.LJIIIZ(pictionaryStatistics, "pictionaryStatistics");
        this.pictionaryInfo = pictionaryInfo;
        this.pictionaryStatistics = pictionaryStatistics;
        this.guessCorrect = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PictionaryFullInfo(com.bytedance.android.livesdk.model.message.PictionaryInfo r10, com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r9 = this;
            r1 = r11
            r0 = r13 & 1
            if (r0 == 0) goto La
            com.bytedance.android.livesdk.model.message.PictionaryInfo r10 = new com.bytedance.android.livesdk.model.message.PictionaryInfo
            r10.<init>()
        La:
            r0 = r13 & 2
            if (r0 == 0) goto L19
            com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics r1 = new com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics
            r2 = 0
            r6 = 0
            r7 = 7
            r4 = r2
            r8 = r6
            r1.<init>(r2, r4, r6, r7, r8)
        L19:
            r0 = r13 & 4
            if (r0 == 0) goto L1e
            r12 = 0
        L1e:
            r9.<init>(r10, r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo.<init>(com.bytedance.android.livesdk.model.message.PictionaryInfo, com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
