package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.e;
import com.google.android.play.core.appupdate.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.1fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38491fB implements InterfaceC268913t, InterfaceC153055zZ {
    public final Object LJLIL;

    @Override // X.InterfaceC268913t
    public final AbstractC22650uj LIZ() {
        if (((C06780Ok) ListProtector.get((List) this.LJLIL, 0)).LIZLLL == null) {
            return new C43791nj((List) this.LJLIL);
        }
        final List list = (List) this.LJLIL;
        return new AbstractC35131Zl<PointF>(list) { // from class: X.1ni
            public final PointF LJIIJ = new PointF();
            public final float[] LJIIJJI = new float[2];
            public C35141Zm LJIIL;
            public PathMeasure LJIILIIL;

            {
                if (C03970Dp.LIZ) {
                    this.LJIILIIL = new PathMeasure();
                }
            }

            @Override // X.AbstractC22650uj
            public final Object LJII(C06780Ok c06780Ok, float f) {
                PathMeasure pathMeasure;
                C35141Zm c35141Zm = (C35141Zm) c06780Ok;
                Path path = c35141Zm.LJIILJJIL;
                if (path == null) {
                    return c06780Ok.LIZIZ;
                }
                C06800Om<A> c06800Om = this.LJFF;
                if (c06800Om != 0) {
                    c35141Zm.LJFF.floatValue();
                    T t = c35141Zm.LIZIZ;
                    T t2 = c35141Zm.LIZJ;
                    LJ();
                    return c06800Om.LIZIZ(t, t2, f);
                }
                if (this.LJIIL != c35141Zm) {
                    if (C03970Dp.LIZ && (pathMeasure = this.LJIILIIL) != null) {
                        pathMeasure.setPath(path, false);
                    } else {
                        this.LJIILIIL = new PathMeasure(path, false);
                    }
                    this.LJIIL = c35141Zm;
                }
                PathMeasure pathMeasure2 = this.LJIILIIL;
                pathMeasure2.getPosTan(pathMeasure2.getLength() * f, this.LJIIJJI, null);
                PointF pointF = this.LJIIJ;
                float[] fArr = this.LJIIJJI;
                pointF.set(fArr[0], fArr[1]);
                return this.LJIIJ;
            }
        };
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Context context = (Context) ((i) ((InterfaceC153055zZ) this.LJLIL)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new e(context);
    }

    public C38491fB(int i) {
        if (i != 1) {
            if (i != 3) {
                this.LJLIL = Collections.singletonList(new C06780Ok(new PointF(0.0f, 0.0f)));
                return;
            } else {
                this.LJLIL = new HashSet();
                return;
            }
        }
        this.LJLIL = new WeakHashMap();
    }

    public final void LIZIZ(C74141T7x c74141T7x, MIL mil) {
        String str;
        String str2;
        String str3;
        if (c74141T7x != null && (str = c74141T7x.LIZIZ) != null) {
            int i = 0;
            if (c74141T7x.LIZ == 2 && !c74141T7x.LJIIL && ((java.util.Set) this.LJLIL).add(str)) {
                C71830SHa c71830SHa = c74141T7x.LIZLLL;
                if (c71830SHa != null) {
                    i = 1;
                }
                T7F t7f = InterfaceC72761Sh3.LIZ;
                if (c71830SHa != null) {
                    str2 = c71830SHa.LIZLLL;
                } else {
                    str2 = null;
                }
                t7f.getClass();
                if (mil == MIL.FYP_BANNER) {
                    str3 = "qa_trending_page";
                } else {
                    str3 = "qa_personal_profile";
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJIIIZ("question_id", str);
                c188727au.LIZLLL(i, "is_thumbnail_show");
                c188727au.LJIIIZ("thumbnail_item_id", str2);
                FMX.LJIIL("qa_recommendation_show", c188727au.LIZ);
            }
        }
    }
}
