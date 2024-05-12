package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PictionaryStatistics {

    @InterfaceC65349Pkn("first_user")
    public User firstUser;

    @InterfaceC65349Pkn("guess_correct_uv")
    public long guessCorrectUv;

    @InterfaceC65349Pkn("guess_total_pv")
    public long guessTotalPv;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PictionaryStatistics() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 7
            r0 = r8
            r3 = r1
            r7 = r5
            r0.<init>(r1, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics.<init>():void");
    }

    public PictionaryStatistics(long j, long j2, User user) {
        this.guessCorrectUv = j;
        this.guessTotalPv = j2;
        this.firstUser = user;
    }

    public /* synthetic */ PictionaryStatistics(long j, long j2, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? null : user);
    }
}
