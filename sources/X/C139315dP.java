package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5dP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139315dP {
    public final Activity LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC143655kP LIZLLL;
    public final InterfaceC139535dl LJ;
    public final InterfaceC139045cy LJFF;
    public boolean LJI;
    public boolean LJII;

    public final TextStickerModel LIZIZ() {
        TextStickerModel textStickerModel;
        Iterator<TextStickerModel> it = this.LJFF.RR().iterator();
        while (true) {
            if (it.hasNext()) {
                textStickerModel = it.next();
                if (u.LJIL(textStickerModel)) {
                    break;
                }
            } else {
                textStickerModel = null;
                break;
            }
        }
        return textStickerModel;
    }

    public final TextStickerModel LIZ(TextStickerModel textStickerModel) {
        String str;
        this.LJI = true;
        EnumC139385dW enumC139385dW = EnumC139385dW.NONE;
        if (u.LJIJJLI(textStickerModel)) {
            str = textStickerModel.getTextStr();
        } else {
            str = "";
        }
        return TextStickerModel.copy$default(textStickerModel, null, null, str, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, enumC139385dW, null, null, false, 245755, null);
    }

    public final void LIZJ(TextStickerModel stickerModel, String str) {
        TTSVoiceModel tTSVoiceModel;
        boolean z;
        o.LJIIIZ(stickerModel, "stickerModel");
        TextStickerModel LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            this.LJFF.PF(LIZIZ.getBaseStickerModel().getId());
        }
        TextStickerModel LIZ = LIZ(stickerModel);
        this.LJFF.fp(LIZ);
        this.LJFF.EW(LIZ.getId(), new AqS133S0200000_2(stickerModel, this, 47));
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        TTSModel ttsModel = stickerModel.getTtsModel();
        if (ttsModel != null) {
            tTSVoiceModel = ttsModel.ttsVoiceModel;
        } else {
            tTSVoiceModel = null;
        }
        if (tTSVoiceModel != null) {
            z = true;
        } else {
            z = false;
        }
        H8F.LJJIIZ(videoPublishEditModel, str, 0, null, Boolean.valueOf(z), Boolean.valueOf(this.LJI), Boolean.valueOf(this.LJII));
        this.LJII = false;
    }

    public C139315dP(Activity activity, C139305dO lifecycleOwner, VideoPublishEditModel editModel, InterfaceC143655kP editPreviewApi, InterfaceC139535dl interfaceC139535dl, InterfaceC139045cy textStickerNewApi) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(textStickerNewApi, "textStickerNewApi");
        this.LIZ = activity;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = editModel;
        this.LIZLLL = editPreviewApi;
        this.LJ = interfaceC139535dl;
        this.LJFF = textStickerNewApi;
        this.LJII = true;
    }
}
