package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6SK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SK extends C6OX {
    public final Context LJIIJ;
    public final AddYoursStickerModel LJIIJJI;
    public final FrameLayout LJIIL;
    public final InterfaceC159886Pg LJIILIIL;
    public final C159636Oh LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final C160056Px LJIILLIIL;
    public final C6U1 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;

    @Override // X.C6OX, X.C6QO
    public final float LIZLLL() {
        if (((Boolean) this.LJIJI.getValue()).booleanValue()) {
            return 0.5f;
        }
        return 0.9f;
    }

    @Override // X.C6OX
    public final void LJJIIJZLJL() {
        int i;
        ((View) this.LJIJJ.getValue()).measure(View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(C32151Nz.LJIIZILJ(168)), 1073741824), -2);
        OSZ osz = new OSZ(Integer.valueOf(((View) this.LJIJJ.getValue()).getMeasuredWidth()), Integer.valueOf(((View) this.LJIJJ.getValue()).getMeasuredHeight()));
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        Point point = new Point((this.LJIIL.getRight() + this.LJIIL.getLeft()) / 2, (this.LJIIL.getBottom() + this.LJIIL.getTop()) / 2);
        int i2 = point.x;
        if (i2 <= 0) {
            i2 = this.LJIIJJI.getBaseStickerModel().getContainerLeft() + (this.LJIIJJI.getBaseStickerModel().getContainerWidth() / 2);
        }
        int i3 = point.y;
        if (i3 <= 0) {
            i3 = this.LJIIJJI.getBaseStickerModel().getContainerTop() + (this.LJIIJJI.getBaseStickerModel().getContainerHeight() / 2);
        }
        int LIZ = ((intValue / 2) + C278817o.LIZ(32.0f)) - i2;
        if (C26338AVi.LIZJ(this.LJIIJ)) {
            i = -1;
        } else {
            i = 1;
        }
        int i4 = LIZ * i;
        int LIZ2 = ((intValue2 / 2) + C278817o.LIZ(158.0f)) - i3;
        AddYoursStickerModel addYoursStickerModel = this.LJIIJJI;
        LJI(AddYoursStickerModel.copy$default(addYoursStickerModel, BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, i4, LIZ2, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null), null, null, null, null, null, true, false, false, null, null, null, 4030, null));
    }

    @Override // X.C6OX
    public final View LJJIJIL() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1NS<AddYoursStickerModel> LJJIZ() {
        return (C1NS) this.LJIJ.getValue();
    }

    @Override // X.C6QO
    public final StickerModel LIZ() {
        return LJJIZ().LJ;
    }

    @Override // X.C6OX
    public final C6SD LJJIIZI() {
        final C1NS<BaseStickerModel> LJJ = LJJ();
        C6SD c6sd = new C6SD(LJJ) { // from class: X.6R2
            @Override // X.C6SD
            public final boolean LJJIII() {
                boolean z = ((C6QI) this.LJIILLIIL.LIZIZ(C65352Pkq.LIZ(C6QI.class))).LIZIZ().LJIJ().LJ.LIZIZ;
                if (this.LIZ.LJ.getVisible() && !z) {
                    return true;
                }
                return false;
            }
        };
        c6sd.LJJIFFI();
        return c6sd;
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
        AddYoursStickerModel addYoursStickerModel;
        o.LJIIIZ(stickerModel, "stickerModel");
        super.LJI(stickerModel);
        if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel = (AddYoursStickerModel) stickerModel) != null) {
            LJJIZ().LJ(new AqS168S0100000_2(addYoursStickerModel, 598));
            LJJIL(((AddYoursStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C6OX
    public final void LJJIJIIJIL(BaseStickerModel baseState) {
        o.LJIIIZ(baseState, "baseState");
        LJJIZ().LJ(new AqS168S0100000_2(baseState, 597));
    }

    @Override // X.C6QO
    public final void setAlpha(float f) {
        if (!((Boolean) this.LJIJI.getValue()).booleanValue()) {
            LJI(AddYoursStickerModel.copy$default(LJJIZ().LJ, BaseStickerModel.copy$default(LJJ().LJ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, Integer.MAX_VALUE, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null));
        }
    }

    @Override // X.C6OX, X.C6QO
    public final void setVisible(boolean z) {
        LJJIZ().LJ(new AqS7S0010000_2(z, 54));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6SK(Context context, AddYoursStickerModel stickerModel, FrameLayout stickerContainer, InterfaceC159886Pg editProvideStickerService, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        super(context, stickerModel.getBaseStickerModel(), c159636Oh, lifecycleOwner, stickerObjectContainer);
        C6U1 LJFF;
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
        this.LJIILLIIL = stickerObjectContainer;
        C6SL LJIIJ = editProvideStickerService.LJIIJ();
        this.LJIIZILJ = (LJIIJ == null || (LJFF = LJIIJ.LJFF()) == null) ? C6U1.LARGER_WHITE : LJFF;
        this.LJIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 961));
        this.LJIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 960));
        this.LJIJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 962));
        LJJIJIIJI(stickerContainer);
    }
}
