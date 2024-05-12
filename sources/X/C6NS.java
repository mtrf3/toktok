package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6NS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NS extends C6NX<TextStickerModel> {
    public final Activity LIZJ;
    public final String LIZLLL;
    public final C6O5 LJ;

    @Override // X.C6NX
    public final EnumC157656Gr LIZLLL() {
        return EnumC157656Gr.TEXT;
    }

    @Override // X.C6NX
    public final String LIZ(TextStickerModel textStickerModel) {
        String draftDir = this.LIZLLL;
        int LJJIIJ = C32151Nz.LJJIIJ(textStickerModel);
        o.LJIIIZ(draftDir, "draftDir");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(draftDir, separator, false)) {
            draftDir = i0.LJFF(draftDir, separator);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(draftDir);
        LIZ.append("text_sticker_");
        LIZ.append(LJJIIJ);
        LIZ.append(".png");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C6NX
    public final View LIZIZ(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModel2 = textStickerModel;
        C159366Ng c159366Ng = new C159366Ng(this.LIZJ);
        c159366Ng.setUseAutoTextSize(false);
        c159366Ng.setFontService(new AqS168S0100000_2(this, 434));
        c159366Ng.LIZIZ(textStickerModel2.getInteractStickerStruct(), textStickerModel2);
        if (this.LIZIZ.LIZLLL == 0) {
            c159366Ng.setScaleX(textStickerModel2.getBaseStickerModel().getScale());
            c159366Ng.setScaleY(c159366Ng.getScaleX());
            c159366Ng.setRotation(textStickerModel2.getBaseStickerModel().getRotation());
            c159366Ng.setTranslationX(textStickerModel2.getBaseStickerModel().getTranslateX());
            c159366Ng.setTranslationY(textStickerModel2.getBaseStickerModel().getTranslateY());
        }
        return c159366Ng;
    }

    @Override // X.C6NX
    public final TextStickerModel LJ(TextStickerModel textStickerModel, int i, int i2) {
        TextStickerModel textStickerModel2 = textStickerModel;
        return TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -385, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6NS(Activity activity, String textCompileDir, C152885zI c152885zI, C6NZ stickerCompileParams) {
        super(activity, stickerCompileParams);
        o.LJIIIZ(textCompileDir, "textCompileDir");
        o.LJIIIZ(stickerCompileParams, "stickerCompileParams");
        this.LIZJ = activity;
        this.LIZLLL = textCompileDir;
        this.LJ = c152885zI;
    }
}
