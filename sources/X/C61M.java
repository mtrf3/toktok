package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.61M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61M implements InterfaceC150695vl {
    public final AbstractC42651GoZ LJLIL;
    public final InterfaceC65784Pro<C82622Wbi> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // X.InterfaceC150695vl
    public final void refresh() {
    }

    public final FTCEditToolbarViewModel LIZ() {
        return (FTCEditToolbarViewModel) this.LJLJJL.getValue();
    }

    public C61M(AbstractC42651GoZ rootScene, InterfaceC65784Pro<C82622Wbi> interfaceC65784Pro) {
        o.LJIIIZ(rootScene, "rootScene");
        this.LJLIL = rootScene;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 24));
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 25));
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 26));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 27));
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 28));
    }

    @Override // X.InterfaceC150695vl
    public final void U2(boolean z, boolean z2, boolean z3) {
        boolean z4;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLJL.getValue();
        if (!z2) {
            Boolean value = ((FTCEditStickerViewModel) this.LJLJJLL.getValue()).N4().getValue();
            if (value == null || !value.booleanValue()) {
                Boolean value2 = ((FTCEditStickerViewModel) this.LJLJJLL.getValue()).hP().getValue();
                if (value2 == null || !value2.booleanValue()) {
                    ((FTCEditStickerViewModel) this.LJLJI.getValue()).A10().setValue(Boolean.valueOf(z3));
                } else {
                    ((FTCEditStickerViewModel) this.LJLJI.getValue()).yf0().setValue(Boolean.valueOf(z3));
                }
            } else {
                ((FTCEditStickerViewModel) this.LJLJI.getValue()).sH().setValue(Boolean.valueOf(z3));
            }
        }
        if (!z) {
            ((FTCEditTextStickerViewModel) this.LJLJJI.getValue()).LIZLLL();
        }
        LIZ().Lv0().setValue(Boolean.valueOf(z));
        LIZ().r3();
        LIZ().yd(z);
        if (videoPublishEditModel.mIsFromDraft) {
            FTCEditToolbarViewModel LIZ = LIZ();
            if (z && !videoPublishEditModel.isUploadVideo()) {
                z4 = true;
            } else {
                z4 = false;
            }
            LIZ.V10(z4);
        }
        if (C1DG.LJIIIIZZ() || AVCommerceServiceImpl.LJIIJ().LIZ()) {
            if (!C78866UxK.LJJJZ(videoPublishEditModel)) {
                LIZ().Jf(8, C44384HbQ.LJIIL(videoPublishEditModel.getCurMusicServerLength(), videoPublishEditModel, videoPublishEditModel.getMMusicPath()));
                if (((BaseShortVideoContext) this.LJLJL.getValue()).getVideoLength() > videoPublishEditModel.getMCurMusicLength()) {
                    LIZ().fg0(8, false);
                }
            }
            LIZ().b2(8, z);
        }
        if (C44384HbQ.LJJII(videoPublishEditModel)) {
            LIZ().b2(6, z);
        }
        if (C44384HbQ.LJIILIIL(videoPublishEditModel)) {
            AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
            if (audioRecorderParam != null && audioRecorderParam.hasRecord()) {
                LIZ().fg0(6, true);
            } else {
                LIZ().fg0(6, false);
            }
        }
        LIZ().Jf(7, true);
        LIZ().b2(7, z);
        LIZ().b2(5, z);
        LIZ().du(z);
        LIZ().b2(1, z);
        LIZ().b2(2, z);
        if (!z) {
            LIZ().rO(2, false);
        }
        LIZ().b2(3, z);
    }
}
