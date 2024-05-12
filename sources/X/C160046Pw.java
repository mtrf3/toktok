package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160046Pw extends C6P6 implements C6SE {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final List<C6QO> LIZJ;
    public C6QO LIZLLL;
    public C6QO LJ;

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

    public final void LJJIFFI() {
        C6QO c6qo;
        AICaptionTagStickerModel aICaptionTagStickerModel;
        C6QO c6qo2 = this.LJ;
        if (c6qo2 == null || (c6qo = this.LIZLLL) == null) {
            return;
        }
        StickerModel LIZ = c6qo.LIZ();
        if (!(LIZ instanceof AICaptionTagStickerModel) || (aICaptionTagStickerModel = (AICaptionTagStickerModel) LIZ) == null) {
            return;
        }
        BaseStickerModel LJIJJ = c6qo2.LJIJJ();
        float rotation = c6qo2.LJIJJ().getRotation();
        float height = ((aICaptionTagStickerModel.getBaseStickerModel().getHeight() / 2.0f) + (LJIJJ.getScale() * (LJIJJ.getHeight() / 2.0f))) - C173216qz.LIZJ(8.0d, this.LIZ);
        double d = rotation;
        c6qo.LJI(AICaptionTagStickerModel.copy$default(aICaptionTagStickerModel, BaseStickerModel.copy$default(aICaptionTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, LJIJJ.getTranslateX() + (((float) Math.sin(Math.toRadians(d))) * height), LJIJJ.getTranslateY() - (height * ((float) Math.cos(Math.toRadians(d)))), 0.0f, rotation, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -23068673, null), false, false, 6, null));
    }

    public final void LJJII(int i) {
        C6QO c6qo = this.LJ;
        if (c6qo != null && c6qo.LJJLIIIJLJLI() == i) {
            LJJIFFI();
        }
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        LJJII(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C160046Pw(Context context, FrameLayout stickerContainer, List<? extends C6QO> stickerList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerList, "stickerList");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerList;
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        LJJII(i);
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
        LJJII(i);
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
