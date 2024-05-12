package X;

import android.view.View;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83487Wpf implements InterfaceC83481WpZ {
    public final /* synthetic */ UploadPicStickerARPresenter LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC83481WpZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZJ() {
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZIZ() {
        this.LIZ.getClass();
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
        EnumC83497Wpp enumC83497Wpp = EnumC83497Wpp.GIPHY;
        uploadPicStickerARPresenter.LLF = enumC83497Wpp;
        uploadPicStickerARPresenter.LJJIFFI(10004);
        this.LIZ.LJJIIJ(true);
        this.LIZ.LLF = enumC83497Wpp;
    }

    @Override // X.InterfaceC83481WpZ
    public final void LJI() {
        this.LIZ.getClass();
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
        EnumC83497Wpp enumC83497Wpp = EnumC83497Wpp.ALBUM;
        uploadPicStickerARPresenter.LLF = enumC83497Wpp;
        uploadPicStickerARPresenter.LJJIFFI(10001);
        InterfaceC83485Wpd interfaceC83485Wpd = this.LIZ.LLILLL;
        if (interfaceC83485Wpd != null) {
            interfaceC83485Wpd.LJIJJ();
        }
        this.LIZ.LJJIIJ(true);
        this.LIZ.LLF = enumC83497Wpp;
    }

    @Override // X.InterfaceC83481WpZ
    public final void LLLIIIIL() {
        this.LIZ.LJIJI();
    }

    @Override // X.InterfaceC83481WpZ
    public final void LJFF(List<IB3> list) {
        this.LIZ.getClass();
        this.LIZ.LJIILLIIL(list);
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
        uploadPicStickerARPresenter.LLF = EnumC83497Wpp.PHOTO;
        uploadPicStickerARPresenter.LLFF = ((ArrayList) list).size();
        UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
        uploadPicStickerARPresenter2.LLFFF = 0;
        uploadPicStickerARPresenter2.LJJIIJ(false);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LLJJIJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C83487Wpf(UploadPicStickerARPresenter uploadPicStickerARPresenter, View view) {
        this.LIZ = uploadPicStickerARPresenter;
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC83481WpZ
    public final void LIZLLL(C83489Wph c83489Wph, C83479WpX c83479WpX) {
        boolean z;
        c83479WpX.onSuccess();
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
        C83489Wph c83489Wph2 = null;
        if (c83489Wph != null) {
            c83489Wph.LJIIIIZZ = "media_tray";
            Effect effect = uploadPicStickerARPresenter.LJLJL;
            if (effect != null) {
                uploadPicStickerARPresenter.LJIJJ(effect, c83489Wph, null);
            }
            c83489Wph2 = c83489Wph;
        }
        uploadPicStickerARPresenter.LJLJLJ = c83489Wph2;
        this.LIZ.getClass();
        IB3 LJIL = UploadPicStickerARPresenter.LJIL(c83489Wph);
        if (c83489Wph != null && c83489Wph.LJI == 3) {
            this.LIZ.LJIILJJIL(LJIL);
            InterfaceC83485Wpd interfaceC83485Wpd = this.LIZ.LLILLL;
            if (interfaceC83485Wpd != null) {
                String str = c83489Wph.LIZ;
                String str2 = c83489Wph.LIZLLL;
                if (c83489Wph.LJI == 1) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC83485Wpd.LJJIIZI(new C74578TOs(str, str2, z));
            }
            UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
            uploadPicStickerARPresenter2.LLF = EnumC83497Wpp.GIPHY_REUSE;
            uploadPicStickerARPresenter2.LLFF = 0;
            uploadPicStickerARPresenter2.LLFFF = 1;
        } else {
            this.LIZ.LJIILL(LJIL);
            UploadPicStickerARPresenter uploadPicStickerARPresenter3 = this.LIZ;
            uploadPicStickerARPresenter3.LLF = EnumC83497Wpp.PHOTO;
            uploadPicStickerARPresenter3.LLFF = 1;
            uploadPicStickerARPresenter3.LLFFF = 0;
        }
        this.LIZ.getClass();
        this.LIZ.LJJIIJ(true);
        this.LIZ.LJJIIJ(false);
    }

    @Override // X.InterfaceC83481WpZ
    public final void LJ(List<IB3> mediaList, java.util.Map<C83489Wph, Integer> uploadPicDataList) {
        o.LJIIIZ(mediaList, "mediaList");
        o.LJIIIZ(uploadPicDataList, "uploadPicDataList");
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LIZ;
        if (uploadPicStickerARPresenter.LLIIJI.LIZ(uploadPicStickerARPresenter.LJLJL)) {
            if (!mediaList.isEmpty()) {
                C83489Wph c83489Wph = this.LIZ.LJLJLJ;
                if (c83489Wph != null) {
                    int i = 0;
                    for (IB3 ib3 : mediaList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            IB3 ib32 = ib3;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(c83489Wph.LIZ());
                            LIZ.append(i2);
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            ib32.getClass();
                            o.LJIIIZ(LIZIZ, "<set-?>");
                            ib32.LJLIL = LIZIZ;
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.LIZ;
                    InterfaceC88474Ynu<Effect, String, String, Boolean, C76800UCe> interfaceC88474Ynu = uploadPicStickerARPresenter2.LLILLIZIL;
                    if (interfaceC88474Ynu != null) {
                        interfaceC88474Ynu.invoke(uploadPicStickerARPresenter2.LJLJL, ((IB3) C64504PTg.LIZIZ(mediaList, -1, mediaList)).LJLIL, ((IB3) C64504PTg.LIZIZ(mediaList, -1, mediaList)).LJLILLLLZI, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
            this.LIZ.LJIJI();
        }
    }
}
