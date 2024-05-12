package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161046Ts extends C6OX {
    public final Context LJIIJ;
    public final GlobalHashTagStickerModel LJIIJJI;
    public final FrameLayout LJIIL;
    public final C159636Oh LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    @Override // X.C6QO
    public final void setAlpha(float f) {
    }

    @Override // X.C6OX
    public final View LJJIJIL() {
        return (View) this.LJIILLIIL.getValue();
    }

    public final C1NS<GlobalHashTagStickerModel> LJJIZ() {
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
        GlobalHashTagStickerModel globalHashTagStickerModel;
        o.LJIIIZ(stickerModel, "stickerModel");
        super.LJI(stickerModel);
        if ((stickerModel instanceof GlobalHashTagStickerModel) && (globalHashTagStickerModel = (GlobalHashTagStickerModel) stickerModel) != null) {
            LJJIZ().LJ(new AqS168S0100000_2(globalHashTagStickerModel, 17));
            LJJIL(((GlobalHashTagStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C6OX
    public final void LJJIJIIJIL(BaseStickerModel baseState) {
        o.LJIIIZ(baseState, "baseState");
        LJJIZ().LJ(new AqS168S0100000_2(baseState, 16));
    }

    @Override // X.C6OX, X.C6QO
    public final void setVisible(boolean z) {
        LJJIZ().LJ(new AqS7S0010000_2(z, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161046Ts(Context context, GlobalHashTagStickerModel hashTagStickerModel, FrameLayout stickerContainer, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        super(context, hashTagStickerModel.getBaseStickerModel(), c159636Oh, lifecycleOwner, stickerObjectContainer);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(hashTagStickerModel, "hashTagStickerModel");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJIIJ = context;
        this.LJIIJJI = hashTagStickerModel;
        this.LJIIL = stickerContainer;
        this.LJIILIIL = c159636Oh;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 40));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 41));
        LJJIJIIJI(stickerContainer);
    }
}
