package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6S5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S5 extends C6OX {
    public final Context LJIIJ;
    public final QAStickerModel LJIIJJI;
    public final FrameLayout LJIIL;
    public final C159636Oh LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    @Override // X.C6OX
    public final View LJJIJIL() {
        return (View) this.LJIILLIIL.getValue();
    }

    public final C1NS<QAStickerModel> LJJIZ() {
        return (C1NS) this.LJIILL.getValue();
    }

    @Override // X.C6QO
    public final StickerModel LIZ() {
        return LJJIZ().LJ;
    }

    @Override // X.C6OX
    public final LifecycleOwner LJJII() {
        return this.LJIILJJIL;
    }

    @Override // X.C6OX
    public final C159636Oh LJJIIJ() {
        return this.LJIILIIL;
    }

    @Override // X.C6OX, X.C6QO
    public final void LJI(StickerModel stickerModel) {
        QAStickerModel qAStickerModel;
        o.LJIIIZ(stickerModel, "stickerModel");
        super.LJI(stickerModel);
        if ((stickerModel instanceof QAStickerModel) && (qAStickerModel = (QAStickerModel) stickerModel) != null) {
            LJJIZ().LJ(new AqS168S0100000_2(qAStickerModel, 564));
            LJJIL(((QAStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C6OX
    public final void LJJIJIIJIL(BaseStickerModel baseState) {
        o.LJIIIZ(baseState, "baseState");
        LJJIZ().LJ(new AqS168S0100000_2(baseState, 563));
    }

    @Override // X.C6QO
    public final void setAlpha(float f) {
        LJJIZ().LJ(new AqS0S0000001_2(f, 10));
    }

    @Override // X.C6OX, X.C6QO
    public final void setVisible(boolean z) {
        LJJIZ().LJ(new AqS7S0010000_2(z, 53));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6S5(Context context, QAStickerModel qaStickerModel, FrameLayout stickerContainer, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        super(context, qaStickerModel.getBaseStickerModel(), c159636Oh, lifecycleOwner, stickerObjectContainer);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(qaStickerModel, "qaStickerModel");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJIIJ = context;
        this.LJIIJJI = qaStickerModel;
        this.LJIIL = stickerContainer;
        this.LJIILIIL = c159636Oh;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 914));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 915));
        LJJIJIIJI(stickerContainer);
    }
}
