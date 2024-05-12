package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import kotlin.jvm.internal.o;

/* renamed from: X.KTg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51764KTg {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final InnerPushConfig LJ;
    public final InnerPushUITemplate LJFF;
    public final java.util.Map<String, String> LJI;
    public final java.util.Map<String, Object> LJII;

    public C51764KTg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51764KTg)) {
            return false;
        }
        C51764KTg c51764KTg = (C51764KTg) obj;
        return this.LIZ == c51764KTg.LIZ && o.LJ(this.LIZIZ, c51764KTg.LIZIZ) && this.LIZJ == c51764KTg.LIZJ && this.LIZLLL == c51764KTg.LIZLLL && o.LJ(this.LJ, c51764KTg.LJ) && o.LJ(this.LJFF, c51764KTg.LJFF) && o.LJ(this.LJI, c51764KTg.LJI) && o.LJ(this.LJII, c51764KTg.LJII);
    }

    public final void LIZ() {
        C86550Xxy.LIZIZ.LIZJ(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJFF.hashCode() + ((this.LJ.hashCode() + JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31), 31), 31)) * 31)) * 31;
        java.util.Map<String, String> map = this.LJI;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        java.util.Map<String, Object> map2 = this.LJII;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalPush(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", label=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", id=");
        LIZ.append(this.LIZJ);
        LIZ.append(", createTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", config=");
        LIZ.append(this.LJ);
        LIZ.append(", uiTemplate=");
        LIZ.append(this.LJFF);
        LIZ.append(", mobEventMap=");
        LIZ.append(this.LJI);
        LIZ.append(", extrasMap=");
        return C15890jp.LIZ(LIZ, this.LJII, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C51764KTg(int i, String label, InnerPushConfig innerPushConfig, InnerPushUITemplate innerPushUITemplate, java.util.Map map, java.util.Map map2, int i2) {
        long j;
        java.util.Map map3 = map;
        InnerPushConfig config = innerPushConfig;
        if ((i2 & 4) != 0) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        long currentTimeMillis = (i2 & 8) != 0 ? System.currentTimeMillis() : 0L;
        if ((i2 & 16) != 0) {
            int i3 = 0;
            config = new InnerPushConfig(0L, null, i3, C47261Igj.LJJIJIIJI(1, 2, 3, 4, 5, 6), i3, 23, null == true ? 1 : 0);
        }
        map3 = (i2 & 64) != 0 ? null : map3;
        java.util.Map map4 = (i2 & 128) == 0 ? map2 : null;
        o.LJIIIZ(label, "label");
        o.LJIIIZ(config, "config");
        this.LIZ = i;
        this.LIZIZ = label;
        this.LIZJ = j;
        this.LIZLLL = currentTimeMillis;
        this.LJ = config;
        this.LJFF = innerPushUITemplate;
        this.LJI = map3;
        this.LJII = map4;
    }
}
