package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57461Mgr extends AbstractC238349Xa {
    public final C57819Mmd LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final java.util.Map<String, String> LJIIIZ;

    public final Object[] LJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, Long.valueOf(this.LJ), Integer.valueOf(this.LJFF), Integer.valueOf(this.LJI), Integer.valueOf(this.LJII)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C57461Mgr) {
            return C78966Uyw.LJIIIZ(((C57461Mgr) obj).LJ(), LJ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LJ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RelatedRecMon:%s,%s,%s,%s,%s,%s,%s", LJ());
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIIIZ;
    }

    public C57461Mgr(C57819Mmd trackerConfig, String str, String str2, long j, int i, int i2, int i3) {
        o.LJIIIZ(trackerConfig, "trackerConfig");
        this.LIZIZ = trackerConfig;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = j;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = "related_recommend_monitor";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(trackerConfig.LIZLLL());
        c188727au.LJIIIZ("from_scene_type", str);
        c188727au.LJIIIZ("from_user_id", str2);
        c188727au.LJ(j, "load_time");
        c188727au.LIZLLL(i, "rec_count");
        c188727au.LIZLLL(i2, "show_count");
        c188727au.LIZLLL(i - i2, "filter_show_count");
        c188727au.LIZLLL(i3, "iterate_cnt");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…teCnt)\n        .builder()");
        this.LJIIIZ = map;
    }
}
