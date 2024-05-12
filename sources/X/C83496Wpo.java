package X;

import android.view.View;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83496Wpo implements InterfaceC83481WpZ {
    public final /* synthetic */ DiyPropVideoStickerHandler LIZ;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r1 != null) goto L4;
     */
    @Override // X.InterfaceC83481WpZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r5.LIZ
            X.Wpy r2 = r0.LJZL
            X.Yns<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure> r1 = r0.LLF
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LJLJL
            java.lang.Object r0 = r1.invoke(r0)
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure r0 = (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure) r0
            android.os.Bundle r2 = r2.LIZIZ(r0)
            X.Uwt r1 = X.IDM.LIZ()
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r5.LIZ
            X.1qj r0 = r0.LJLL
            r4 = 10002(0x2712, float:1.4016E-41)
            android.content.Intent r3 = r1.LIZJ(r0, r2, r4)
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r2 = r5.LIZ
            X.Hu4 r1 = r2.LJLLILLLL
            if (r1 == 0) goto L46
        L26:
            X.Ol8 r0 = r2.LJLJLLL
            java.lang.Object r0 = r0.getValue()
            X.5lG r0 = (X.InterfaceC144185lG) r0
            r1.unRegisterActivityResultListener(r0)
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r5.LIZ
            X.Ol8 r0 = r0.LJLJLLL
            java.lang.Object r0 = r0.getValue()
            X.5lG r0 = (X.InterfaceC144185lG) r0
            r1.registerActivityResultListener(r0)
        L3e:
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler r0 = r5.LIZ
            X.1qj r0 = r0.LJLL
            X.C16880lQ.LJI(r0, r3, r4)
            return
        L46:
            X.1qj r1 = r2.LJLL
            boolean r0 = r1 instanceof X.InterfaceC45540Hu4
            if (r0 != 0) goto L4d
            r1 = 0
        L4d:
            X.Hu4 r1 = (X.InterfaceC45540Hu4) r1
            if (r1 == 0) goto L3e
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83496Wpo.LJI():void");
    }

    @Override // X.InterfaceC83481WpZ
    public final void LLLIIIIL() {
        DiyPropVideoStickerHandler diyPropVideoStickerHandler = this.LIZ;
        diyPropVideoStickerHandler.LJLJJI = "";
        Effect effect = diyPropVideoStickerHandler.LJLJL;
        if (effect != null) {
            diyPropVideoStickerHandler.LJLZ.LIZIZ(effect);
        }
    }

    public C83496Wpo(DiyPropVideoStickerHandler diyPropVideoStickerHandler, View view) {
        this.LIZ = diyPropVideoStickerHandler;
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZLLL(C83489Wph c83489Wph, C83479WpX c83479WpX) {
        if (c83489Wph != null) {
            this.LIZ.LJLLLLLL.LIZ(c83489Wph.LIZJ(), this.LIZ.LJLJI, new AqS118S0300000_14(c83489Wph, this, c83479WpX, 7), new AqS145S0200000_14(this, c83479WpX, 45));
        }
    }
}
