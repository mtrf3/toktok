package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6QL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QL extends C6P6 implements InterfaceC152865zG, C6SE {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final List<C6QO> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final C61996OUu LJ;
    public final C62822Ol8 LJFF;

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

    @Override // X.InterfaceC152865zG
    public final void LJIJJ() {
        C16880lQ.LJLLLL(LJJIIJ(), this.LIZIZ);
    }

    public final C6QO LJJII() {
        C6QO c6qo;
        TextStickerModel textStickerModel;
        Iterator<C6QO> it = this.LIZJ.iterator();
        while (true) {
            c6qo = null;
            if (!it.hasNext()) {
                break;
            }
            c6qo = it.next();
            StickerModel LIZ = c6qo.LIZ();
            if ((LIZ instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) LIZ) != null && u.LJIILLIIL(textStickerModel)) {
                break;
            }
        }
        return c6qo;
    }

    public final C6QO LJJIII() {
        C6QO c6qo;
        Iterator<C6QO> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                c6qo = it.next();
                if (c6qo.getStickerType() == EnumC157656Gr.AI_CAPTION_TAG) {
                    break;
                }
            } else {
                c6qo = null;
                break;
            }
        }
        return c6qo;
    }

    public final View LJJIIJ() {
        Object value = this.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-shuffleLayout>(...)");
        return (View) value;
    }

    @Override // X.InterfaceC152865zG
    public final void LJIIZILJ() {
        C6QO LJJIII;
        C6QO LJJII = LJJII();
        if (LJJII == null || (LJJIII = LJJIII()) == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C6QM(LJJII, LJJIII, this, null), 3);
    }

    public final void LJJIFFI() {
        BaseStickerModel LJIJJ;
        RectF stickerBoundingRect;
        C6QO LJJIII;
        BaseStickerModel LJIJJ2;
        RectF stickerBoundingRect2;
        int measuredWidth;
        C6QO LJJII = LJJII();
        if (LJJII == null || (LJIJJ = LJJII.LJIJJ()) == null || (stickerBoundingRect = LJIJJ.getStickerBoundingRect()) == null || (LJJIII = LJJIII()) == null || (LJIJJ2 = LJJIII.LJIJJ()) == null || (stickerBoundingRect2 = LJIJJ2.getStickerBoundingRect()) == null) {
            return;
        }
        float f = stickerBoundingRect.bottom;
        float f2 = stickerBoundingRect2.bottom;
        if (f < f2) {
            f = f2;
        }
        View LJJIIJ = LJJIIJ();
        float centerX = stickerBoundingRect.centerX();
        View LJJIIJ2 = LJJIIJ();
        if (LJJIIJ2.getWidth() > 0) {
            measuredWidth = LJJIIJ2.getWidth();
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            LJJIIJ2.measure(makeMeasureSpec, makeMeasureSpec);
            measuredWidth = LJJIIJ2.getMeasuredWidth();
        }
        LJJIIJ.setX(centerX - (measuredWidth / 2.0f));
        LJJIIJ().setY(f);
    }

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
        if (LJJIIJ().getParent() == null) {
            return;
        }
        C6QO LJJII = LJJII();
        int i2 = 0;
        if (LJJII != null && LJJII.LJJLIIIJLJLI() == i) {
            View LJJIIJ = LJJIIJ();
            if (!z) {
                i2 = 8;
            }
            LJJIIJ.setVisibility(i2);
        }
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        C6QO LJJII = LJJII();
        if (LJJII != null && LJJII.LJJLIIIJLJLI() == i) {
            LJJIFFI();
        }
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        C6QO LJJII = LJJII();
        if (LJJII != null && LJJII.LJJLIIIJLJLI() == i) {
            LJJIFFI();
        }
    }

    public C6QL(Context context, FrameLayout stickerContainer, List stickerList, AqS152S0100000_2 aqS152S0100000_2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerList, "stickerList");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerList;
        this.LIZLLL = aqS152S0100000_2;
        this.LJ = new C61996OUu(context);
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 932));
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        C6QO LJJII = LJJII();
        if (LJJII != null && LJJII.LJJLIIIJLJLI() == i) {
            LJJIFFI();
        }
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZJ(enumC157656Gr, rectF);
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
