package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.MeC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57296MeC implements InterfaceC57356MfA<C57295MeB> {
    public final List<String> LJLIL;
    public final AtomicBoolean LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57296MeC)) {
            return false;
        }
        C57296MeC c57296MeC = (C57296MeC) obj;
        return o.LJ(this.LJLIL, c57296MeC.LJLIL) && o.LJ(this.LJLILLLLZI, c57296MeC.LJLILLLLZI);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserStoryQuery(uidList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", getUserStoriesFromRemoteCalled=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return C57330Mek.LIZ();
    }

    public C57296MeC(List<String> uidList, AtomicBoolean getUserStoriesFromRemoteCalled) {
        o.LJIIIZ(uidList, "uidList");
        o.LJIIIZ(getUserStoriesFromRemoteCalled, "getUserStoriesFromRemoteCalled");
        this.LJLIL = uidList;
        this.LJLILLLLZI = getUserStoriesFromRemoteCalled;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC84562XGs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.XH8 r8, X.InterfaceC67352kd<? super X.C57295MeB> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C57297MeD
            if (r0 == 0) goto L95
            r4 = r9
            X.MeD r4 = (X.C57297MeD) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r2 = r4.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L9c
            X.C141335gf.LIZJ(r2)
        L20:
            com.ss.android.ugc.aweme.story.model.UserStoriesResponse r2 = (com.ss.android.ugc.aweme.story.model.UserStoriesResponse) r2
            X.MeB r1 = new X.MeB
            java.lang.String r0 = "result"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1.<init>(r2)
            return r1
        L2d:
            X.C141335gf.LIZJ(r2)
            java.util.List<java.lang.String> r0 = r7.LJLIL
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "querying server for "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "UserStorySource"
            X.C189837ch.LJ(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.LJLILLLLZI
            boolean r0 = r0.get()
            if (r0 != 0) goto L89
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L89
            boolean r0 = X.C33808DOq.LIZ()
            if (r0 == 0) goto L89
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            X.Su1 r2 = X.AbstractC73672Svk.LJJIJIL(r0)
            Y.IDhS12S1100000_9 r1 = new Y.IDhS12S1100000_9
            r0 = 0
            r1.<init>(r7, r6, r0)
            r0 = 0
            X.Svk r1 = r2.LJJIII(r1, r0)
        L7b:
            java.lang.String r0 = "override suspend fun ope…oryData(result)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.LJLJI = r3
            java.lang.Object r2 = X.C77318UWc.LIZIZ(r1, r4)
            if (r2 != r5) goto L20
            return r5
        L89:
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ
            X.Svk r1 = r0.getUserStories(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.LJLILLLLZI
            r0.set(r3)
            goto L7b
        L95:
            X.MeD r4 = new X.MeD
            r4.<init>(r7, r9)
            goto L12
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57296MeC.LJJLIIIJILLIZJL(X.XH8, X.2kd):java.lang.Object");
    }
}
