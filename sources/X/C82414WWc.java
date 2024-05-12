package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WWc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82414WWc {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC88472Yns<View, C76800UCe> LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;
    public final InterfaceC65784Pro<C76800UCe> LJII;
    public final InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public final InterfaceC65784Pro<C76800UCe> LJIIIZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIIJ;
    public final InterfaceC88472Yns<View, C76800UCe> LJIIJJI;
    public final InterfaceC65784Pro<C76800UCe> LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82414WWc)) {
            return false;
        }
        C82414WWc c82414WWc = (C82414WWc) obj;
        return o.LJ(this.LIZ, c82414WWc.LIZ) && o.LJ(this.LIZIZ, c82414WWc.LIZIZ) && o.LJ(this.LIZJ, c82414WWc.LIZJ) && o.LJ(this.LIZLLL, c82414WWc.LIZLLL) && o.LJ(this.LJ, c82414WWc.LJ) && o.LJ(this.LJFF, c82414WWc.LJFF) && o.LJ(this.LJI, c82414WWc.LJI) && o.LJ(this.LJII, c82414WWc.LJII) && o.LJ(this.LJIIIIZZ, c82414WWc.LJIIIIZZ) && o.LJ(this.LJIIIZ, c82414WWc.LJIIIZ) && o.LJ(this.LJIIJ, c82414WWc.LJIIJ) && o.LJ(this.LJIIJJI, c82414WWc.LJIIJJI) && o.LJ(this.LJIIL, c82414WWc.LJIIL);
    }

    public final String toString() {
        return "NowsBarSceneActions(onPublishClick=" + this.LIZ + ", onStoryPublishClick=" + this.LIZIZ + ", onLeftButtonClick=" + this.LIZJ + ", onSwitchButtonClick=" + this.LIZLLL + ", onBackClick=" + this.LJ + ", onRetakeClick=" + this.LJFF + ", onCountDownFinish=" + this.LJI + ", onSave2Local=" + this.LJII + ", onNextStep=" + this.LJIIIIZZ + ", onUploadClick=" + this.LJIIIZ + ", onDualCameraChange=" + this.LJIIJ + ", registerBackView=" + this.LJIIJJI + ", onEditUiReady=" + this.LJIIL + ')';
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = QZY.LIZIZ(this.LJIIJJI, QZY.LIZIZ(this.LJIIJ, C1JX.LIZLLL(this.LJIIIZ, C1JX.LIZLLL(this.LJIIIIZZ, C1JX.LIZLLL(this.LJII, C1JX.LIZLLL(this.LJI, C1JX.LIZLLL(this.LJFF, QZY.LIZIZ(this.LJ, C1JX.LIZLLL(this.LIZLLL, C1JX.LIZLLL(this.LIZJ, C1JX.LIZLLL(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJIIL;
        if (interfaceC65784Pro == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC65784Pro.hashCode();
        }
        return LIZIZ + hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82414WWc(InterfaceC65784Pro<C76800UCe> onPublishClick, InterfaceC65784Pro<C76800UCe> onStoryPublishClick, InterfaceC65784Pro<C76800UCe> onLeftButtonClick, InterfaceC65784Pro<C76800UCe> onSwitchButtonClick, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> onCountDownFinish, InterfaceC65784Pro<C76800UCe> onSave2Local, InterfaceC65784Pro<C76800UCe> onNextStep, InterfaceC65784Pro<C76800UCe> onUploadClick, InterfaceC88472Yns<? super Boolean, C76800UCe> onDualCameraChange, InterfaceC88472Yns<? super View, C76800UCe> registerBackView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(onPublishClick, "onPublishClick");
        o.LJIIIZ(onStoryPublishClick, "onStoryPublishClick");
        o.LJIIIZ(onLeftButtonClick, "onLeftButtonClick");
        o.LJIIIZ(onSwitchButtonClick, "onSwitchButtonClick");
        o.LJIIIZ(onCountDownFinish, "onCountDownFinish");
        o.LJIIIZ(onSave2Local, "onSave2Local");
        o.LJIIIZ(onNextStep, "onNextStep");
        o.LJIIIZ(onUploadClick, "onUploadClick");
        o.LJIIIZ(onDualCameraChange, "onDualCameraChange");
        o.LJIIIZ(registerBackView, "registerBackView");
        this.LIZ = onPublishClick;
        this.LIZIZ = onStoryPublishClick;
        this.LIZJ = onLeftButtonClick;
        this.LIZLLL = onSwitchButtonClick;
        this.LJ = interfaceC88472Yns;
        this.LJFF = interfaceC65784Pro;
        this.LJI = onCountDownFinish;
        this.LJII = onSave2Local;
        this.LJIIIIZZ = onNextStep;
        this.LJIIIZ = onUploadClick;
        this.LJIIJ = onDualCameraChange;
        this.LJIIJJI = registerBackView;
        this.LJIIL = interfaceC65784Pro2;
    }
}
