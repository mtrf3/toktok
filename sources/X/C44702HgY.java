package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HgY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44702HgY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (C43863HJj.LIZ() == 4 && C45087Hml.LJ(model.isShoutout(), CommerceMediaServiceImpl.LIZJ().LIZ()) && !model.mIsFromDraft) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(List selectMediaList, VideoPublishEditModel model, C82622Wbi c82622Wbi, Activity currentActivity) {
        AutoCutThemeData autoCutThemeData;
        InterfaceC44718Hgo interfaceC44718Hgo;
        String str;
        InterfaceC143655kP interfaceC143655kP;
        MutableLiveData<C5MM> DM;
        o.LJIIIZ(selectMediaList, "selectMediaList");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(currentActivity, "currentActivity");
        if (C45087Hml.LJJII()) {
            C24540xm.LIZ(R.string.dtf, currentActivity, 6001);
            return;
        }
        if (selectMediaList.isEmpty() || model.creativeInfo == null) {
            return;
        }
        AutoCutModel autoCutModel = model.creativeModel.autoCutModel;
        if (c82622Wbi != null && (interfaceC143655kP = (InterfaceC143655kP) c82622Wbi.LJIIIIZZ(null, InterfaceC143655kP.class)) != null && (DM = interfaceC143655kP.DM()) != null) {
            DM.setValue(C5MM.LIZJ());
        }
        C45161Hnx.LIZIZ(new C45051HmB(model.mShootWay, model.getCreationId()));
        ArrayList arrayList = new ArrayList(C32I.LJJL(selectMediaList, 10));
        Iterator it = selectMediaList.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            C63B c63b = AutoCutMediaModel.Companion;
            Context LIZ2 = C5L7.LIZ();
            c63b.getClass();
            AutoCutMediaModel LIZ3 = C63B.LIZ(LIZ2, mediaModel);
            C45087Hml.LJJIZ(LIZ3);
            arrayList.add(LIZ3);
        }
        model.creativeModel.autoCutModel.curMediaList = AnonymousClass636.LJ(arrayList);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel);
        boolean LJFF = C45087Hml.LJFF(extractAVMusic, false);
        if (LJFF && extractAVMusic != null) {
            C44727Hgx c44727Hgx = AutoCutThemeData.Companion;
            MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
            C63A c63a = C63A.AUTO_CUT;
            int value = EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue();
            C42647GoV LJIILL = C45087Hml.LJIILL(true);
            c44727Hgx.getClass();
            autoCutThemeData = C44727Hgx.LIZ(LJJIJIL, c63a, value, "", LJIILL, true);
        } else {
            autoCutThemeData = null;
        }
        String str2 = autoCutModel.clickFrom;
        if (str2 == null || str2.length() == 0) {
            autoCutModel.clickFrom = "edit_page";
        }
        if (c82622Wbi == null || (interfaceC44718Hgo = (InterfaceC44718Hgo) c82622Wbi.LJIIIIZZ(null, InterfaceC44718Hgo.class)) == null) {
            return;
        }
        boolean LIZ4 = CommerceMediaServiceImpl.LIZJ().LIZ();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        C45203Hod c45203Hod = new C45203Hod(true, true, !LJFF, LIZ4, 0, null, arrayList, autoCutThemeData, null, null, false, creativeInfo, C44706Hgc.LIZ(), 20072);
        C45256HpU c45256HpU = new C45256HpU(R.attr.cb, R.attr.dj, R.attr.dl, R.attr.dj, R.attr.dj, R.attr.d2);
        MediaModel mediaModel2 = (MediaModel) ORZ.LJLLLL(selectMediaList);
        if (mediaModel2 != null) {
            str = mediaModel2.fileLocalUriPath;
        } else {
            str = null;
        }
        interfaceC44718Hgo.pH(new C45205Hof(c45203Hod, c45256HpU, LJFF, str, new C44710Hgg(arrayList, autoCutModel, LJFF, extractAVMusic, model, interfaceC44718Hgo, c82622Wbi, model.mShootWay, model.getCreationId(), C45087Hml.LJJ(extractAVMusic, model.isFromAutoCutAnchor(), autoCutModel))));
    }
}
