package X;

import android.content.Context;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TDk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74284TDk {
    public static final void LIZIZ(Context context, CKEDraftInfoWrapper draftInfo, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(draftInfo, "draftInfo");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        IEffectCreatorService LJIIJ = EffectCreatorServiceImpl.LJIIJ();
        String str = shortVideoContext.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = shortVideoContext.shootWay;
        if (str3 != null) {
            str2 = str3;
        }
        String LJI = shortVideoContext.LJI();
        o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
        LJIIJ.LJFF(context, draftInfo, str, str2, LJI);
    }

    public static final void LIZJ(Context context, Effect effect, ShortVideoContext shortVideoContext) {
        C78897Uxp.LJJJ("advanced_mobile_editor_open", C113554cx.LJJL(new OSZ("is_pro_template", "1"), new OSZ("is_h5_entry", CardStruct.IStatusCode.DEFAULT), new OSZ("enter_from", shortVideoContext.enterFrom)));
        IEffectCreatorService LJIIJ = EffectCreatorServiceImpl.LJIIJ();
        String str = shortVideoContext.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = shortVideoContext.shootWay;
        if (str3 != null) {
            str2 = str3;
        }
        String LJI = shortVideoContext.LJI();
        o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
        LJIIJ.LJI(context, effect, str, str2, LJI);
    }

    public static final void LIZ(Context context, TEZ stickerDataManager, Effect effect, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (C1FP.LJIILLIIL(stickerDataManager, effect)) {
            return;
        }
        if (stickerDataManager.LJJJJLL().LJIJJLI().LIZ(effect, false)) {
            LIZJ(context, effect, shortVideoContext);
        } else {
            stickerDataManager.LJJIIJ(new C74397THt(effect, false, null, 6), new C74285TDl(context, shortVideoContext));
        }
    }
}
