package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractionCheckInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164826dS {
    public static InteractionCheckInfo LIZ(PollStruct pollStruct) {
        if (pollStruct == null) {
            return null;
        }
        InteractionCheckInfo interactionCheckInfo = new InteractionCheckInfo();
        LinkedList linkedList = new LinkedList();
        if (pollStruct.getOptions().size() == 2) {
            linkedList.add(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption());
            linkedList.add(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption());
            interactionCheckInfo.setOptions(linkedList);
        }
        interactionCheckInfo.setQuestion(pollStruct.getQuestion());
        return interactionCheckInfo;
    }

    public static NormalTrackTimeStamp LIZIZ(InteractStickerStruct interactStickerStruct) {
        List list;
        try {
            list = (List) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJII(interactStickerStruct.getTrackList(), new TypeToken<List<NormalTrackTimeStamp>>() { // from class: X.6YS
            }.getType());
        } catch (Exception unused) {
            list = null;
        }
        if (C79004UzY.LJJIFFI(list)) {
            return null;
        }
        return (NormalTrackTimeStamp) ListProtector.get(list, 0);
    }

    public static C15070iV<String, String> LIZJ(C164846dU c164846dU) {
        String str;
        String str2;
        HashMap hashMap;
        List<InteractStickerStruct> LJI = LJI(c164846dU, 1, EnumC164816dR.TRACK_PAGE_EDIT);
        String str3 = "";
        if (LJI == null || LJI.isEmpty() || C38354F3m.LJ(((InteractStickerStruct) ListProtector.get(LJI, 0)).getAttr())) {
            return new C15070iV<>("", "");
        }
        try {
            hashMap = (HashMap) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJII(((InteractStickerStruct) ListProtector.get(LJI, 0)).getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.6dT
            }.getType());
        } catch (Exception e) {
            e = e;
            str = "";
        }
        if (hashMap == null) {
            str2 = "";
            return new C15070iV<>(str3, str2);
        }
        if (!hashMap.containsKey("poll_sticker_id")) {
            str = "";
        } else {
            str = (String) hashMap.get("poll_sticker_id");
        }
        try {
        } catch (Exception e2) {
            e = e2;
            C60903NvH.LJIIJJI().LJJIIZI().LIZ(e);
            str2 = "";
            str3 = str;
            return new C15070iV<>(str3, str2);
        }
        if (hashMap.containsKey("poll_sticker_tab_id")) {
            str2 = (String) hashMap.get("poll_sticker_tab_id");
            str3 = str;
            return new C15070iV<>(str3, str2);
        }
        str2 = "";
        str3 = str;
        return new C15070iV<>(str3, str2);
    }

    public static QaStruct LJ(C164846dU c164846dU) {
        InteractStickerTracksContext LJII;
        List<InteractStickerStruct> stickerStructsByPage;
        if (c164846dU != null && (LJII = LJII(c164846dU)) != null && (stickerStructsByPage = LJII.getStickerStructsByPage(EnumC164816dR.TRACK_PAGE_EDIT)) != null && !stickerStructsByPage.isEmpty()) {
            for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                if (interactStickerStruct.getType() == 17 && interactStickerStruct.getQaStruct() != null) {
                    return interactStickerStruct.getQaStruct();
                }
            }
        }
        return null;
    }

    public static InteractStickerTracksContext LJII(C164846dU c164846dU) {
        if (c164846dU != null) {
            return c164846dU.mInteractStickerContext;
        }
        return null;
    }

    public static InteractStickerTracksContext LJIIIIZZ(String str) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        try {
            return ((C164846dU) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJI(str, C164846dU.class)).mInteractStickerContext;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<InteractStickerStruct> LIZLLL(C164846dU c164846dU, EnumC164816dR... enumC164816dRArr) {
        InteractStickerTracksContext LJII = LJII(c164846dU);
        if (LJII == null || LJII.isEmpty(enumC164816dRArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = LJII.getStickerStructsByPage(enumC164816dRArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPollStruct() != null) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!C79004UzY.LJJIFFI(pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                    if (C38354F3m.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption())) {
                        ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).setPostOption(C60903NvH.LJ.getString(R.string.tt_));
                    }
                    if (C38354F3m.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption())) {
                        ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).setPostOption(C60903NvH.LJ.getString(R.string.tta));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    public static List<InteractStickerStruct> LJFF(BaseShortVideoContext baseShortVideoContext, int i, EnumC164816dR enumC164816dR) {
        InteractStickerTracksContext LJIIIIZZ;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            LJIIIIZZ = LJII(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            LJIIIIZZ = LJIIIIZZ(baseShortVideoContext.getMainBusinessData());
        }
        if (LJIIIIZZ == null) {
            return null;
        }
        return LJIIIIZZ.getStickerStructByPageAndType(Integer.valueOf(i), enumC164816dR);
    }

    public static List<InteractStickerStruct> LJI(C164846dU c164846dU, int i, EnumC164816dR enumC164816dR) {
        InteractStickerTracksContext LJII = LJII(c164846dU);
        if (LJII == null) {
            return null;
        }
        return LJII.getStickerStructByPageAndType(Integer.valueOf(i), enumC164816dR);
    }

    public static String LJIIIZ(C164846dU c164846dU, List<InteractStickerStruct> list, EnumC164816dR enumC164816dR) {
        if (c164846dU == null) {
            c164846dU = new C164846dU();
        }
        InteractStickerTracksContext interactStickerTracksContext = c164846dU.mInteractStickerContext;
        if (interactStickerTracksContext == null) {
            interactStickerTracksContext = new InteractStickerTracksContext();
        }
        interactStickerTracksContext.upDateStickerStructs(list, enumC164816dR);
        c164846dU.setInteractStickerContext(interactStickerTracksContext);
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), c164846dU);
    }
}
