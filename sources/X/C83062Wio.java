package X;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wio, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83062Wio implements InterfaceC83061Win, InterfaceC83060Wim {
    public static final C163086ae LJIILJJIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIILL;
    public int LIZ;
    public VESize LIZIZ;
    public AnonymousClass671 LIZJ;
    public RectF LJII;
    public final HashMap<String, C35746E1e> LIZLLL = new HashMap<>();
    public String LJ = "unset";
    public float LJFF = 0.15f;
    public float LJI = 20.0f;
    public CanvasGestureConfig LJIIIIZZ = new CanvasGestureConfig(false, false, false, false, 0, false, 63, null);
    public final C83064Wiq LJIIIZ = new C83064Wiq();
    public final C83063Wip LJIIJ = new C83063Wip(this);
    public final MutableLiveData<Float> LJIIJJI = new MutableLiveData<>();
    public final MutableLiveData<OSZ<Float, Float>> LJIIL = new MutableLiveData<>();
    public final MutableLiveData<OSZ<OSZ<Float, Float>, OSZ<Float, Float>>> LJIILIIL = new MutableLiveData<>();

    static {
        TBV tbv = new TBV(C83062Wio.class, "canvasVideoData", "getCanvasVideoData()Lcom/ss/android/ugc/aweme/canvas/CanvasVideoData;", 0);
        C65352Pkq.LIZ.getClass();
        LJIILL = new InterfaceC74236TBo[]{tbv};
        LJIILJJIL = new C163086ae();
    }

    public final PointF[] LJIIJ() {
        PointF[] pointFArr = new PointF[4];
        int i = 0;
        int i2 = 0;
        do {
            pointFArr[i2] = new PointF();
            i2++;
        } while (i2 < 4);
        RectF rectF = LJIILIIL().LIZIZ;
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
        do {
            C77119UOl.LJJIII(pointFArr[i], rectF.centerX(), rectF.centerY(), (float) Math.toRadians(LJIILJJIL().degree));
            i++;
        } while (i < 4);
        return pointFArr;
    }

    @Override // X.InterfaceC83061Win
    public final void LIZJ() {
        AnonymousClass671 anonymousClass671 = this.LIZJ;
        if (anonymousClass671 != null) {
            anonymousClass671.LJIIJJI();
        }
    }

    public final OSZ<Float, Float> LJIIIZ() {
        int i;
        int i2;
        VESize vESize = this.LIZIZ;
        CanvasVideoData LJIIL = LJIIL();
        if (vESize == null || LJIIL == null) {
            return null;
        }
        CanvasExtra extra = LJIIL.getExtra();
        if (extra != null) {
            i = extra.getWidth();
        } else {
            i = vESize.width;
        }
        float f = i;
        CanvasExtra extra2 = LJIIL.getExtra();
        if (extra2 != null) {
            i2 = extra2.getHeight();
        } else {
            i2 = vESize.height;
        }
        return new OSZ<>(Float.valueOf(f), Float.valueOf(i2));
    }

    public final OSZ<OSZ<Float, Float>, OSZ<Float, Float>> LJIIJJI() {
        C163086ae c163086ae = LJIILJJIL;
        VESize vESize = this.LIZIZ;
        OSZ<Float, Float> osz = LJIILIIL().LIZ;
        OSZ osz2 = new OSZ(Float.valueOf(LJIILJJIL().transX), Float.valueOf(LJIILJJIL().transY));
        float f = LJIILJJIL().scaleFactor;
        c163086ae.getClass();
        return C163086ae.LIZJ(vESize, osz, osz2, f);
    }

    public final CanvasVideoData LJIIL() {
        return this.LJIIJ.LIZ(this, LJIILL[0]);
    }

    public final C35746E1e LJIILIIL() {
        HashMap<String, C35746E1e> hashMap = this.LIZLLL;
        String str = this.LJ;
        C35746E1e c35746E1e = hashMap.get(str);
        if (c35746E1e == null) {
            c35746E1e = new C35746E1e();
            RectF rectF = this.LJII;
            if (rectF != null) {
                c35746E1e.LIZIZ.set(rectF);
                VEVideoTransformFilterParam LIZ = this.LJIIIZ.LIZ();
                c35746E1e.LIZIZ.offset(LIZ.transX, LIZ.transY);
            }
            hashMap.put(str, c35746E1e);
        }
        return c35746E1e;
    }

    public final VEVideoTransformFilterParam LJIILJJIL() {
        return this.LJIIIZ.LIZ();
    }

    @Override // X.InterfaceC83061Win
    public final boolean LIZLLL() {
        CanvasExtra canvasExtra;
        CanvasVideoData LJIIL = LJIIL();
        CanvasExtra canvasExtra2 = null;
        if (LJIIL != null && LJIIL.getExtra() != null) {
            CanvasVideoData LJIIL2 = LJIIL();
            if (LJIIL2 != null) {
                canvasExtra = LJIIL2.getExtra();
            } else {
                canvasExtra = null;
            }
            o.LJI(canvasExtra);
            if (canvasExtra.getHeight() != 0) {
                CanvasVideoData LJIIL3 = LJIIL();
                if (LJIIL3 != null) {
                    canvasExtra2 = LJIIL3.getExtra();
                }
                o.LJI(canvasExtra2);
                if (canvasExtra2.getWidth() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC83060Wim
    public final MutableLiveData<OSZ<OSZ<Float, Float>, OSZ<Float, Float>>> LJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC83061Win
    public final CanvasGestureConfig LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC83060Wim
    public final MutableLiveData<Float> LJII() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC83060Wim
    public final MutableLiveData<OSZ<Float, Float>> LJIIIIZZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC83061Win
    public final void LIZIZ(float f) {
        AnonymousClass671 anonymousClass671 = this.LIZJ;
        if (anonymousClass671 != null) {
            if (4 == anonymousClass671.LJI(LJIIJ(), true)) {
                f = anonymousClass671.LJIIJ(f);
            }
            C83064Wiq c83064Wiq = this.LJIIIZ;
            float f2 = LJIILJJIL().degree + f;
            if (c83064Wiq.LIZJ != null) {
                VEVideoTransformFilterParam LIZ = c83064Wiq.LIZ();
                float f3 = f2 % 360.0f;
                if (f3 < 0.0f) {
                    f3 += 360;
                }
                LIZ.degree = f3;
                c83064Wiq.LJ.setValue(LIZ);
            }
            this.LJIILIIL.setValue(LJIIJJI());
        }
    }

    public final void LJIILL(CanvasVideoData canvasVideoData) {
        Object obj;
        List<CanvasFilterParam> transformList;
        this.LJ = "default";
        this.LJIIJ.LIZIZ(LJIILL[0], this, canvasVideoData);
        this.LJIIJJI.setValue(Float.valueOf(LJIILJJIL().scaleFactor));
        this.LJIILIIL.setValue(LJIIJJI());
        StringBuilder LIZIZ = C25620zW.LIZIZ("updateObserver,id:", "default", ",currentFilter:");
        if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
            obj = ORZ.LJLLLL(transformList);
        } else {
            obj = null;
        }
        LIZIZ.append(obj);
        LIZIZ.append(",currentState:");
        LIZIZ.append(LJIILIIL());
        C165556ed.LIZ(X1D.LIZIZ(LIZIZ));
    }

    @Override // X.InterfaceC83061Win
    public final void onScale(float f) {
        if (this.LIZJ != null) {
            float min = Math.min(Math.max(LJIILJJIL().scaleFactor * f, this.LJFF), this.LJI);
            C83064Wiq c83064Wiq = this.LJIIIZ;
            if (c83064Wiq.LIZJ != null) {
                VEVideoTransformFilterParam LIZ = c83064Wiq.LIZ();
                LIZ.scaleFactor = min;
                c83064Wiq.LJ.setValue(LIZ);
            }
            this.LJIIJJI.setValue(Float.valueOf(min));
            this.LJIILIIL.setValue(LJIIJJI());
        }
    }

    @Override // X.InterfaceC83061Win
    public final void LIZ(float f, float f2) {
        PointF pointF;
        AnonymousClass671 anonymousClass671 = this.LIZJ;
        if (anonymousClass671 != null) {
            if (3 == anonymousClass671.LJI(LJIIJ(), false)) {
                PointF[] LJIIJ = LJIIJ();
                int i = 0;
                do {
                    PointF pointF2 = LJIIJ[i];
                    pointF2.x += f;
                    pointF2.y += f2;
                    i++;
                } while (i < 4);
                pointF = anonymousClass671.LIZLLL(LJIIJ, f, f2);
            } else {
                pointF = new PointF(f, f2);
            }
            LJIILIIL().LIZIZ.offset(pointF.x, pointF.y);
            C83064Wiq c83064Wiq = this.LJIIIZ;
            float f3 = pointF.x;
            float f4 = pointF.y;
            if (c83064Wiq.LIZJ != null) {
                VEVideoTransformFilterParam LIZ = c83064Wiq.LIZ();
                float f5 = LIZ.transX;
                if (c83064Wiq.LIZJ != null) {
                    LIZ.transX = (f3 / r2.width) + f5;
                    LIZ.transY = (f4 / r2.height) + LIZ.transY;
                    c83064Wiq.LJ.setValue(LIZ);
                } else {
                    o.LJIJI("veSize");
                    throw null;
                }
            }
            this.LJIIL.setValue(new OSZ<>(Float.valueOf(pointF.x), Float.valueOf(pointF.y)));
        }
    }

    @Override // X.InterfaceC83061Win
    public final boolean LJFF(float f, float f2) {
        OSZ<OSZ<Float, Float>, OSZ<Float, Float>> LJIIJJI = LJIIJJI();
        OSZ<Float, Float> first = LJIIJJI.getFirst();
        OSZ<Float, Float> second = LJIIJJI.getSecond();
        float floatValue = first.getFirst().floatValue();
        if (f > second.getFirst().floatValue() || floatValue > f) {
            return false;
        }
        float floatValue2 = first.getSecond().floatValue();
        float floatValue3 = second.getSecond().floatValue();
        float f3 = f2 - this.LIZ;
        if (floatValue2 > f3 || f3 > floatValue3) {
            return false;
        }
        return true;
    }
}
