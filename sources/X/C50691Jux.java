package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jux, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C50691Jux extends TBS implements InterfaceC88471Ynr<C50701Jv7, C50318Jow, C50701Jv7> {
    public C50691Jux(C50693Juz c50693Juz) {
        super(2, c50693Juz, C50693Juz.class, "handlePlayFinishEventForRecoLogicUpdate", "handlePlayFinishEventForRecoLogicUpdate(Lcom/ss/android/ugc/aweme/search/source/flow/model/SearchClickSignalState;Lcom/ss/android/ugc/aweme/search/common/source/vm/SearchClickSignalOperator$SearchAutoPlayAction;)Lcom/ss/android/ugc/aweme/search/source/flow/model/SearchClickSignalState;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50701Jv7 invoke(C50701Jv7 c50701Jv7, C50318Jow c50318Jow) {
        boolean z;
        C50701Jv7 p0 = c50701Jv7;
        C50318Jow p1 = c50318Jow;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.receiver.getClass();
        if (o.LJ(p1.LIZIZ, "general_search") || o.LJ(p1.LIZIZ, "search_result")) {
            long j = p0.LJLJLJ;
            long j2 = p0.LJLJL;
            long j3 = p1.LIZ;
            long j4 = j + j3;
            if (j2 < j3) {
                String str = p1.LIZJ;
                if (p0.LJLJI || j4 > C50693Juz.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                return C50701Jv7.L(p0, 0L, z, str, null, null, j3, j4, null, 307);
            }
            return C50701Jv7.L(p0, 0L, false, null, null, null, 0L, j4, null, 383);
        }
        return C50701Jv7.L(p0, 0L, false, null, null, null, 0L, 0L, null, 511);
    }
}
