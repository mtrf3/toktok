package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0Wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08810Wf {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final LiveEffect LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterLogBean(id=");
        sb.append(this.LIZ);
        sb.append(", resourceId=");
        sb.append(this.LIZIZ);
        sb.append(", value=");
        sb.append(this.LIZJ);
        sb.append(", uiValue=");
        sb.append(this.LIZLLL);
        sb.append(", defaultValue=");
        sb.append(this.LJ);
        sb.append(", position=");
        sb.append(this.LJFF);
        sb.append(", filterModel=");
        sb.append(this.LJI);
        sb.append(", startTime=");
        sb.append(this.LJII);
        sb.append(", isLiveTakeDefault=");
        sb.append(this.LJIIIIZZ);
        sb.append(", scene=");
        sb.append(this.LJIIIZ);
        sb.append(", actionType=");
        sb.append(this.LJIIJ);
        sb.append(", realId=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C08810Wf)) {
            return false;
        }
        C08810Wf c08810Wf = (C08810Wf) obj;
        if (!o.LJ(this.LIZ, c08810Wf.LIZ) || this.LIZJ != c08810Wf.LIZJ) {
            return false;
        }
        return true;
    }

    public C08810Wf(String id, String resourceId, float f, int i, int i2, int i3, LiveEffect filterModel, long j, boolean z, String scene, String actionType, String realId) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(filterModel, "filterModel");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(realId, "realId");
        this.LIZ = id;
        this.LIZIZ = resourceId;
        this.LIZJ = f;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = filterModel;
        this.LJII = j;
        this.LJIIIIZZ = z;
        this.LJIIIZ = scene;
        this.LJIIJ = actionType;
        this.LJIIJJI = realId;
    }
}
