package X;

import android.app.Activity;
import android.graphics.Point;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137415aL {
    public final Activity LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;

    public C137415aL(ActivityC45651qj activity, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String LIZIZ;
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = videoPublishEditModel;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null) {
            str = currentUser.getNickname();
        } else {
            str = null;
        }
        LIZ.append(str);
        this.LIZJ = X1D.LIZIZ(LIZ);
        this.LIZLLL = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(Calendar.getInstance().getTime());
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
        if (creativeModel.changeAvatarModel.isFromAiVatar) {
            LIZIZ = C86V.LJFF(R.string.ds);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((char) 10024);
            LIZ2.append(C86V.LJFF(R.string.p7u));
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        this.LJ = LIZIZ;
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 863));
        this.LJI = C221108m2.LIZIZ(C37159EiB.LJLIL);
    }

    public final TextStickerData LIZ(String str, float f, float f2, float f3, Integer num) {
        float LIZIZ;
        TextStickerData textStickerData = new TextStickerData(str, 1, -1, 2, "Proxima-Nova-Semibold.otf", null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
        textStickerData.setScale(f3);
        textStickerData.setX(f);
        textStickerData.setY(f2);
        textStickerData.setVideoWidth(C170576mj.LIZJ(this.LIZ));
        textStickerData.setVideoHeight(C170576mj.LIZIZ(this.LIZ));
        textStickerData.setLayoutWidth(C170576mj.LIZJ(this.LIZ));
        C157226Fa c157226Fa = C157226Fa.LIZ;
        int LJFF = c157226Fa.LJFF();
        if (LJFF == c157226Fa.LJIIIZ()) {
            LJFF = ((Number) C161986Xi.LIZ(this.LIZ).getSecond()).intValue();
        }
        CreativeModel creativeModel = this.LIZIZ.creativeModel;
        o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
        if (creativeModel.changeAvatarModel.isFromAiVatar) {
            LIZIZ = LJFF;
        } else {
            LIZIZ = C170576mj.LIZIZ(this.LIZ);
        }
        textStickerData.setLayoutHeight(LIZIZ);
        textStickerData.setEditCenterPoint(new Point(C170576mj.LIZJ(this.LIZ) / 2, C170576mj.LIZIZ(this.LIZ) / 2));
        textStickerData.setTextWrapList(C47261Igj.LJJIJ(C68W.LIZIZ(str, false)));
        textStickerData.setTextWrapList(C47261Igj.LJJIJ(C68W.LIZJ(C68W.LJIILJJIL(textStickerData, this.LIZ))));
        if (num != null) {
            textStickerData.setFontSize(num.intValue());
        }
        return textStickerData;
    }
}
