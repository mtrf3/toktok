package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import kotlin.jvm.internal.o;

/* renamed from: X.S2q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71456S2q extends S2R<ViewGroup, AtmosphereTag> {
    public final int LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public AtmosphereTag LJIIIIZZ;
    public float LJIIIZ;
    public S3R LJIIJ;

    public abstract int LJFF();

    public abstract void LJII();

    public abstract S31 LJIIIIZZ(boolean z);

    public final String LJ() {
        Object value = this.LJ.getValue();
        o.LJIIIIZZ(value, "<get-hotTitle>(...)");
        return (String) value;
    }

    public final View LJI(int i) {
        View viewStub = this.LIZ.findViewById(i);
        if (viewStub instanceof ViewStub) {
            View inflate = ((ViewStub) viewStub).inflate();
            o.LJIIIIZZ(inflate, "viewStub.inflate()");
            return inflate;
        }
        o.LJIIIIZZ(viewStub, "viewStub");
        return viewStub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC71456S2q(ViewGroup parentView, int i) {
        super(parentView);
        o.LJIIIZ(parentView, "parentView");
        this.LIZLLL = i;
        this.LJ = C221108m2.LIZIZ(C71458S2s.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C71457S2r.LJLIL);
        this.LJI = C221108m2.LIZIZ(C71459S2t.LJLIL);
        this.LJII = C221108m2.LIZIZ(C71460S2u.LJLIL);
        this.LJIIJ = new L3T();
    }

    public static boolean LIZLLL(AtmosphereTag atmosphereTag, AtmosphereTag atmosphereTag2) {
        Integer num;
        Integer num2;
        Long l;
        Long l2 = null;
        if (atmosphereTag != null) {
            num = Integer.valueOf(atmosphereTag.tagType);
        } else {
            num = null;
        }
        if (atmosphereTag2 != null) {
            num2 = Integer.valueOf(atmosphereTag2.tagType);
        } else {
            num2 = null;
        }
        if (o.LJ(num, num2)) {
            if (atmosphereTag != null) {
                l = Long.valueOf(atmosphereTag.count);
            } else {
                l = null;
            }
            if (atmosphereTag2 != null) {
                l2 = Long.valueOf(atmosphereTag2.count);
            }
            if (o.LJ(l, l2)) {
                return true;
            }
        }
        return false;
    }
}
