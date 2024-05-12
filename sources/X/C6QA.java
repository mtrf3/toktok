package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6QA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QA implements C6SE {
    public final Context LIZ;
    public C159816Oz LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public C159946Pm LJFF;
    public final C62822Ol8 LJI;
    public int LJII;
    public final List<InterfaceC156876Dr> LJIIIIZZ;

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
    }

    @Override // X.C6SE
    public final void LIZIZ(int i) {
    }

    @Override // X.C6SE
    public final void LIZLLL() {
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
    }

    @Override // X.C6SE
    public final void LJIIJJI(int i) {
    }

    @Override // X.C6SE
    public final void LJIIL() {
    }

    @Override // X.C6SE
    public final void LJJI(int i) {
    }

    public final C1NS<C6QB> LJI() {
        return (C1NS) this.LJ.getValue();
    }

    public final C6NN LJIIIIZZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String string = this.LIZ.getString(R.string.bxf);
                    o.LJIIIIZZ(string, "context.getString(R.stri…ns_delete_caption_option)");
                    return new C6NN(1, R.drawable.ay0, string, 8);
                }
                String string2 = this.LIZ.getString(R.string.e3g);
                o.LJIIIIZZ(string2, "context.getString(R.stri…on_edit_sticker_duration)");
                return new C6NN(3, R.drawable.tb, string2, 8);
            }
            String string3 = this.LIZ.getString(R.string.e43);
            o.LJIIIIZZ(string3, "context.getString(R.stri….creation_edit_text_edit)");
            return new C6NN(2, R.drawable.t9, string3, 8);
        }
        String string4 = this.LIZ.getString(R.string.bxf);
        o.LJIIIIZZ(string4, "context.getString(R.stri…ns_delete_caption_option)");
        return new C6NN(1, R.drawable.ay0, string4, 8);
    }

    public final boolean LJII(PointF pointF, boolean z) {
        float LIZIZ = C74275TDb.LIZIZ(this.LIZ, 41.0f);
        float size = (LIZIZ * LJI().LJ.LJLIL.size()) + C74275TDb.LIZIZ(this.LIZ, 12.0f) + C74275TDb.LIZIZ(this.LIZ, 60.0f);
        Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(this.LIZ), "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (z) {
            float f = pointF.x;
            if (f >= 0.0f && pointF.y >= size && f <= width) {
                return false;
            }
            return true;
        }
        float f2 = pointF.x;
        if (f2 >= 0.0f && f2 <= width && pointF.y <= height - size) {
            return false;
        }
        return true;
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public static PointF LIZJ(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
        Matrix matrix = new Matrix();
        float f6 = fArr[2];
        float f7 = fArr[0];
        float LIZ = C1I0.LIZ(f6, f7, 2.0f, f7);
        float f8 = fArr[5];
        float f9 = fArr[3];
        matrix.postRotate(f, LIZ, ((f8 - f9) / 2.0f) + f9);
        matrix.mapPoints(fArr);
        float f10 = fArr[1] + fArr[3];
        float f11 = fArr[5] + fArr[7];
        if (f10 < f11 && !z) {
            pointF.set((fArr[0] + fArr[2]) / 2.0f, f10 / 2.0f);
        } else {
            pointF.set((fArr[4] + fArr[6]) / 2.0f, f11 / 2.0f);
        }
        return pointF;
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public C6QA(Context context, C159816Oz stickerConfig, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = context;
        this.LIZIZ = stickerConfig;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(stickerObjectContainer, 908));
        this.LJ = C221108m2.LIZIZ(C6QC.LJLIL);
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 907));
        this.LJIIIIZZ = new ArrayList();
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.graphics.PointF, T] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.graphics.PointF, T] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.WHL] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, X.WHL] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.OQg] */
    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
        Object obj;
        C159636Oh c159636Oh;
        T t;
        List<Integer> list;
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(visibleRect, "visibleRect");
        C6QO LJJJ = C30581Hy.LJJJ(i, (List) this.LIZLLL.getValue());
        if (LJJJ != null && LJJJ.LJFF()) {
            this.LJI.getValue();
            this.LJII = i;
            C68322mC c68322mC = new C68322mC();
            Iterator<C159636Oh> it = this.LIZIZ.LJLJJL.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    c159636Oh = it.next();
                    if (c159636Oh.LJLIL == stickerType) {
                        break;
                    }
                } else {
                    c159636Oh = null;
                    break;
                }
            }
            C159636Oh c159636Oh2 = c159636Oh;
            if (c159636Oh2 != null && (list = c159636Oh2.LJLJLJ) != null) {
                t = new ArrayList(C32I.LJJL(list, 10));
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    t.add(LJIIIIZZ(it2.next().intValue()));
                }
            } else {
                t = C61878OQg.INSTANCE;
            }
            c68322mC.element = t;
            Iterator it3 = ((ArrayList) this.LJIIIIZZ).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((InterfaceC156876Dr) next).getStickerType() == stickerType) {
                    obj = next;
                    break;
                }
            }
            InterfaceC156876Dr interfaceC156876Dr = (InterfaceC156876Dr) obj;
            if (interfaceC156876Dr != null) {
                c68322mC.element = interfaceC156876Dr.LIZ(i);
            }
            LJI().LJ(new AqS168S0100000_2(c68322mC, (C68322mC<C6EX>) 547));
            visibleRect.left -= C74275TDb.LIZ(10.0f);
            visibleRect.right = C74275TDb.LIZ(10.0f) + visibleRect.right;
            visibleRect.top -= C74275TDb.LIZ(10.0f);
            visibleRect.bottom = C74275TDb.LIZ(10.0f) + visibleRect.bottom;
            int i2 = (int) f;
            int i3 = (int) f2;
            C68322mC c68322mC2 = new C68322mC();
            c68322mC2.element = LIZJ(visibleRect, f3, false);
            C68322mC c68322mC3 = new C68322mC();
            ?? r2 = WHL.TOP;
            c68322mC3.element = r2;
            if (LJII((PointF) c68322mC2.element, true)) {
                c68322mC2.element = LIZJ(visibleRect, f3, true);
                c68322mC3.element = WHL.BOTTOM;
                if (LJII((PointF) c68322mC2.element, false)) {
                    PointF pointF = (PointF) c68322mC2.element;
                    pointF.x = i2;
                    pointF.y = i3;
                    c68322mC3.element = r2;
                }
            }
            LJI().LJ(new AqS133S0200000_2(c68322mC2, (C68322mC<String>) c68322mC3, (C68322mC<String>) 124));
            LJI().LJ(C6QD.LJLIL);
        }
    }

    @Override // X.C6SE
    public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZLLL(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJJ(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }

    @Override // X.C6SE
    public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }
}
