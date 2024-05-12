package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C121584pu;
import X.C122034qd;
import X.C133355Lf;
import X.C160496Rp;
import X.C171706oY;
import X.C56K;
import X.C5M1;
import X.C76800UCe;
import X.EnumC121554pr;
import X.InterfaceC171716oZ;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.filter.FilterBean;

/* loaded from: classes3.dex */
public class AqS3S0200001_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S0200001_2 aqS3S0200001_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, false, null, null, false, new OSZ(Integer.valueOf(((Rect) aqS3S0200001_2.l0).right), Integer.valueOf(((Rect) aqS3S0200001_2.l0).bottom)), false, new C133355Lf(true, aqS3S0200001_2.f2, false), 0, null, new C08630Vn((NLETrackSlot) aqS3S0200001_2.l1), null, null, null, null, null, null, null, null, false, null, 2095967);
    }

    public static final Object invoke$1(AqS3S0200001_2 aqS3S0200001_2, Object obj) {
        C122034qd editorPro = (C122034qd) obj;
        o.LJIIIZ(editorPro, "editorPro");
        C121584pu c121584pu = new C121584pu(EnumC121554pr.COLOR_NO_COMPOSER);
        c121584pu.LIZ = ((FilterBean) aqS3S0200001_2.l0).getFilterFolder();
        c121584pu.LIZLLL = ((FilterBean) aqS3S0200001_2.l1).getFilterFolder();
        c121584pu.LJFF = aqS3S0200001_2.f2;
        c121584pu.LJI = ((FilterBean) aqS3S0200001_2.l0).getResId();
        String str = c121584pu.LIZ;
        if (str != null) {
            c121584pu.LIZIZ = editorPro.LJ().LIZ().LL(str);
        }
        String str2 = c121584pu.LIZLLL;
        if (str2 != null) {
            c121584pu.LJ = editorPro.LJ().LIZ().LL(str2);
        }
        editorPro.LJI().LJJIJIL(c121584pu);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS3S0200001_2 aqS3S0200001_2, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        Rect marginRect = (Rect) aqS3S0200001_2.l0;
        RectF rect = (RectF) aqS3S0200001_2.l1;
        float f = aqS3S0200001_2.f2;
        o.LJIIIZ(marginRect, "marginRect");
        o.LJIIIZ(rect, "rect");
        return new C160496Rp(marginRect, rect, f, true);
    }

    public static final Object invoke$3(AqS3S0200001_2 aqS3S0200001_2, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        ((InterfaceC171716oZ) aqS3S0200001_2.l0).onProgress((int) ((floatValue * aqS3S0200001_2.f2) + ((C56K) aqS3S0200001_2.l1).element));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS3S0200001_2 aqS3S0200001_2, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        ((InterfaceC171716oZ) aqS3S0200001_2.l1).onProgress((int) ((floatValue * aqS3S0200001_2.f2) + ((C56K) aqS3S0200001_2.l0).element));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0200001_2(float f, C171706oY c171706oY, C56K c56k, int i) {
        super(1);
        this.$t = i;
        this.l0 = c56k;
        this.f2 = f;
        this.l1 = c171706oY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0200001_2(float f, InterfaceC171716oZ interfaceC171716oZ, C56K c56k, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC171716oZ;
        this.l1 = c56k;
        this.f2 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0200001_2(Rect rect, RectF rectF, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = rect;
        this.l1 = rectF;
        this.f2 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0200001_2(Rect rect, NLETrackSlot nLETrackSlot, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = rect;
        this.l1 = nLETrackSlot;
        this.f2 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0200001_2(FilterBean filterBean, FilterBean filterBean2, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = filterBean;
        this.l1 = filterBean2;
        this.f2 = f;
    }
}
