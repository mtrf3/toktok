package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MCf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56417MCf implements InterfaceC56825MRx {
    @Override // X.InterfaceC56825MRx
    public final void LIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final void LIZIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final boolean LIZJ(C56889MUj c56889MUj) {
        Integer num;
        boolean z;
        List<String> list;
        NewFaceStickerBean newFaceStickerBean;
        String str;
        ArrayList arrayList;
        NewFaceStickerBean newFaceStickerBean2;
        NewFaceStickerBean newFaceStickerBean3;
        View view = c56889MUj.LIZIZ;
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != R.id.h5p && num.intValue() != R.id.j2s && num.intValue() != R.id.j2t)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Context context = c56889MUj.LIZIZ.getContext();
            o.LJIIIIZZ(context, "data.view.context");
            GeneralTemplateNotice generalTemplateNotice = c56889MUj.LIZ;
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
            buildRoute.withParam("refer", "prop_page");
            buildRoute.withParam("video_from", "from_inbox_sticker");
            buildRoute.withParam("previous_page", "notification_page");
            buildRoute.withParam("video_type", 37);
            NoticeExtraData noticeExtraData = generalTemplateNotice.extraData;
            if (noticeExtraData != null && (newFaceStickerBean3 = noticeExtraData.sticker) != null) {
                arrayList = C47261Igj.LJII(newFaceStickerBean3);
            } else {
                arrayList = null;
            }
            buildRoute.withParam("feed_data_sticker_model", arrayList);
            NoticeExtraData noticeExtraData2 = generalTemplateNotice.extraData;
            if (noticeExtraData2 != null && (newFaceStickerBean2 = noticeExtraData2.sticker) != null) {
                str2 = newFaceStickerBean2.id;
            }
            buildRoute.withParam("sticker_id", str2);
            String str3 = generalTemplateNotice.messageExtra;
            if (str3 != null) {
                buildRoute.withParam("from_user_id", new JSONObject(str3).optString("from_user_id"));
            }
            buildRoute.open();
            return true;
        }
        if (num == null || (num.intValue() != R.id.h54 && num.intValue() != R.id.h4i)) {
            return false;
        }
        Context context2 = c56889MUj.LIZIZ.getContext();
        o.LJIIIIZZ(context2, "data.view.context");
        GeneralTemplateNotice generalTemplateNotice2 = c56889MUj.LIZ;
        MBR mbr = new MBR();
        mbr.LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        mbr.LIZIZ = "friends_effect";
        mbr.LJFF = "notification_page";
        mbr.LJII = "notification_button";
        String str4 = generalTemplateNotice2.messageExtra;
        if (str4 != null) {
            mbr.LJIILJJIL = new JSONObject(str4).optString("from_user_id");
        }
        mbr.LJIIL = new C56418MCg(generalTemplateNotice2);
        C74181T9l LIZ = mbr.LIZ();
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        IPropReuseService LJIIJ = PropReuseServiceImpl.LJIIJ();
        NoticeExtraData noticeExtraData3 = generalTemplateNotice2.extraData;
        if (noticeExtraData3 != null && (newFaceStickerBean = noticeExtraData3.sticker) != null && (str = newFaceStickerBean.id) != null) {
            list = C47261Igj.LJJIJ(str);
        } else {
            list = C61878OQg.INSTANCE;
        }
        LJIIJ.LJFF(context2, list, LIZ, downloadEffectOrMusicAfterEnterCamera);
        return true;
    }
}
