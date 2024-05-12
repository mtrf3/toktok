package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159646Oi extends C6OX {
    public final Context LJIIJ;
    public final AICaptionTagStickerModel LJIIJJI;
    public final FrameLayout LJIIL;
    public final InterfaceC159886Pg LJIILIIL;
    public final C159636Oh LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;

    @Override // X.C6QO
    public final void setAlpha(float f) {
    }

    @Override // X.C6OX
    public final View LJJIJIL() {
        return (View) this.LJIIZILJ.getValue();
    }

    public final C1NS<AICaptionTagStickerModel> LJJIZ() {
        return (C1NS) this.LJIILLIIL.getValue();
    }

    @Override // X.C6QO
    public final StickerModel LIZ() {
        return LJJIZ().LJ;
    }

    @Override // X.C6OX
    public final C6SD LJJIIZI() {
        final C1NS<BaseStickerModel> LJJ = LJJ();
        return new C6SD(LJJ) { // from class: X.6Ok
            @Override // X.C6SD
            public final boolean LJJIII() {
                return false;
            }
        };
    }

    @Override // X.C6OX
    public final LifecycleOwner LJJII() {
        return this.LJIILL;
    }

    @Override // X.C6OX
    public final C159636Oh LJJIIJ() {
        return this.LJIILJJIL;
    }

    @Override // X.C6OX, X.C6QO
    public final void LJI(StickerModel stickerModel) {
        AICaptionTagStickerModel aICaptionTagStickerModel;
        o.LJIIIZ(stickerModel, "stickerModel");
        super.LJI(stickerModel);
        if ((stickerModel instanceof AICaptionTagStickerModel) && (aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModel) != null) {
            AICaptionTagStickerModel aICaptionTagStickerModel2 = (AICaptionTagStickerModel) stickerModel;
            ((C159356Nf) this.LJIIZILJ.getValue()).LIZ(aICaptionTagStickerModel2.isEdited());
            LJJIZ().LJ(new AqS168S0100000_2(aICaptionTagStickerModel, 620));
            LJJIL(aICaptionTagStickerModel2.getBaseStickerModel());
        }
    }

    @Override // X.C6OX
    public final void LJJIJIIJIL(BaseStickerModel baseState) {
        o.LJIIIZ(baseState, "baseState");
        LJJIZ().LJ(new AqS168S0100000_2(baseState, 619));
    }

    @Override // X.C6OX, X.C6QO
    public final void setVisible(boolean z) {
        LJJ().LJ(new AqS7S0010000_2(z, 55));
        LJJIZ().LJ(new AqS7S0010000_2(z, 56));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159646Oi(Context context, AICaptionTagStickerModel stickerModel, FrameLayout stickerContainer, InterfaceC159886Pg editProvideStickerService, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        super(context, stickerModel.getBaseStickerModel(), c159636Oh, lifecycleOwner, stickerObjectContainer);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerModel, "stickerModel");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(editProvideStickerService, "editProvideStickerService");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJIIJ = context;
        this.LJIIJJI = stickerModel;
        this.LJIIL = stickerContainer;
        this.LJIILIIL = editProvideStickerService;
        this.LJIILJJIL = c159636Oh;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 980));
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 981));
        LJJIJIIJI(stickerContainer);
    }
}
