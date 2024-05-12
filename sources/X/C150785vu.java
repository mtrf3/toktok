package X;

import Y.ACallableS105S0100000_2;
import Y.AgS107S0200000_2;
import android.app.Activity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150785vu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel editModel) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        C10K LJIIIZ;
        String LJJJJ;
        o.LJIIIZ(editModel, "editModel");
        if (C42000Ge4.LJIILIIL(editModel)) {
            if (!C6H4.LJI(editModel.creativeModel.stickerModel)) {
                return;
            }
            Activity topActivity = ActivityStack.getTopActivity();
            OSZ osz = new OSZ(Integer.valueOf(editModel.mVideoCanvasWidth), Integer.valueOf(editModel.mVideoCanvasHeight));
            int intValue = ((Number) C150805vw.LIZ.getValue()).intValue();
            int LIZ2 = C150965wC.LIZ();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            C6NZ c6nz = new C6NZ(topActivity, osz, C140605fU.LJLIL, intValue, LIZ2, new AqS168S0100000_2(editModel, 456));
            InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
            CreativeInfo creativeInfo = editModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
            LJJJJ = LIZIZ.LJJJJ(creativeInfo, "");
            Activity topActivity2 = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity2, "getTopActivity()");
            C6NU c6nu = new C6NU(LJJJJ, topActivity2, c6nz, new AqS149S0200000_2(editModel, c6nz, 74));
            if (C138845ce.LIZ() && H7R.LJJJJZ(editModel) && editModel.hasTextSticker()) {
                c6nu.LIZ(editModel.creativeModel.stickerModel.textStickerModels);
            }
            c6nu.LIZ(editModel.creativeModel.stickerModel.aiCaptionTagStickers);
            return;
        }
        if (!C138845ce.LIZ() || !H7R.LJJJJZ(editModel) || (infoStickerModel = editModel.infoStickerModel) == null || (list = infoStickerModel.stickers) == null || !(true ^ list.isEmpty())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerItemModel stickerItemModel : list) {
            if (stickerItemModel.isTextSticker()) {
                if (C78685UuP.LJJJZ(stickerItemModel.path)) {
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class);
                    if (textStickerData.getCanvasWidth() == 0 || textStickerData.getCanvasHeight() == 0 || textStickerData.getVideoWidth() == 0 || textStickerData.getVideoHeight() == 0) {
                        String str = stickerItemModel.path;
                        o.LJIIIIZZ(str, "sticker.path");
                        LJIIIZ = C10K.LJIIIZ(new C150795vv(str, false));
                        o.LJIIIIZZ(LJIIIZ, "forResult(StickerCompile…ult(sticker.path, false))");
                    } else {
                        LJIIIZ = C10K.LIZIZ(new ACallableS105S0100000_2(textStickerData, 30), C10K.LJIIIIZZ, null).LJIILLIIL(new AgS107S0200000_2(textStickerData, stickerItemModel, 9), C10K.LJI);
                        o.LJIIIIZZ(LJIIIZ, "sticker: StickerItemMode…ROUND_EXECUTOR,\n        )");
                    }
                    arrayList.add(LJIIIZ);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("StickerCompileManager sticker path is empty id: ");
                    LIZ3.append(stickerItemModel.stickerId);
                    LIZ3.append(", text: ");
                    LIZ3.append(stickerItemModel.getText());
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                }
            }
        }
        try {
            C10K.LJIJJ(arrayList).LJIJI();
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("compile sticker e: ");
            LIZ4.append(e.getMessage());
            H7B.LIZJ(X1D.LIZIZ(LIZ4));
        }
    }
}
