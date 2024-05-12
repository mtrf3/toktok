package X;

import android.view.View;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83495Wpn implements InterfaceC83481WpZ {
    public final /* synthetic */ BackgroundVideoStickerPresenter LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC83481WpZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZJ() {
    }

    @Override // X.InterfaceC83481WpZ
    public final void LJ(List<IB3> mediaList, java.util.Map<C83489Wph, Integer> uploadPicDataList) {
        o.LJIIIZ(mediaList, "mediaList");
        o.LJIIIZ(uploadPicDataList, "uploadPicDataList");
    }

    @Override // X.InterfaceC83481WpZ
    public final void LJFF(List<IB3> list) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r1 != null) goto L4;
     */
    @Override // X.InterfaceC83481WpZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r4 = r6.LIZ
            X.Wpy r0 = r4.LJZL
            r5 = 0
            android.os.Bundle r2 = r0.LIZIZ(r5)
            X.Uwt r1 = X.IDM.LIZ()
            X.1qj r0 = r4.LJLLJ
            r3 = 10002(0x2712, float:1.4016E-41)
            android.content.Intent r2 = r1.LIZJ(r0, r2, r3)
            X.Hu4 r1 = r4.LJLLLL
            if (r1 == 0) goto L5d
        L19:
            X.Ol8 r0 = r4.LJLL
            java.lang.Object r0 = r0.getValue()
            X.5lG r0 = (X.InterfaceC144185lG) r0
            r1.unRegisterActivityResultListener(r0)
            X.Ol8 r0 = r4.LJLL
            java.lang.Object r0 = r0.getValue()
            X.5lG r0 = (X.InterfaceC144185lG) r0
            r1.registerActivityResultListener(r0)
        L2f:
            X.1qj r0 = r4.LJLLJ
            X.C16880lQ.LJI(r0, r2, r3)
            X.WqG r0 = r4.LLD
            if (r0 == 0) goto L3b
            r0.LIZIZ()
        L3b:
            X.Pro<java.lang.Boolean> r0 = r4.LLIIII
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L54
            X.5e6<X.ICq> r0 = r4.LJLLLLLL
            java.lang.Object r0 = r0.get()
            X.ICq r0 = (X.InterfaceC46236ICq) r0
            r0.LJI()
        L54:
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r1 = r6.LIZ
            r0 = 1
            r1.LJLJLLL = r0
            r1.LJIILJJIL(r0)
            return
        L5d:
            X.1qj r1 = r4.LJLLJ
            boolean r0 = r1 instanceof X.InterfaceC45540Hu4
            if (r0 != 0) goto L69
        L63:
            r1 = r5
            X.Hu4 r1 = (X.InterfaceC45540Hu4) r1
            if (r1 == 0) goto L2f
            goto L19
        L69:
            r5 = r1
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83495Wpn.LJI():void");
    }

    @Override // X.InterfaceC83481WpZ
    public final void LLLIIIIL() {
        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.LIZ;
        backgroundVideoStickerPresenter.LJLILLLLZI = "";
        Effect effect = backgroundVideoStickerPresenter.LJLJJL;
        if (effect != null) {
            backgroundVideoStickerPresenter.LJLLLLLL.get().LJFF(effect);
        }
    }

    public C83495Wpn(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, View view) {
        this.LIZ = backgroundVideoStickerPresenter;
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZLLL(C83489Wph c83489Wph, C83479WpX c83479WpX) {
        if (c83489Wph != null) {
            this.LIZ.LLF.LIZ(c83489Wph.LIZJ(), 1000L, new AqS118S0300000_14(c83489Wph, this, c83479WpX, 6), new AqS145S0200000_14(this, c83479WpX, 44));
        }
    }
}
