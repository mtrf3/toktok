package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HgZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44703HgZ {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(int i, boolean z) {
        if (!C45087Hml.LJ(z, CommerceMediaServiceImpl.LIZJ().LIZ()) || !C44084HRw.LIZ() || !HRX.LJ() || i != 0) {
            return false;
        }
        return true;
    }

    public static final InterfaceC82683Wch LIZJ(Context context, C45765Hxh anchor, String str, ShortVideoContext shortVideoContext) {
        String str2;
        o.LJIIIZ(anchor, "anchor");
        C139825eE c139825eE = new C139825eE(context);
        c139825eE.LIZ.LIZIZ = anchor;
        c139825eE.LJI(WHL.TOP);
        c139825eE.LJIIJJI(R.string.e22);
        c139825eE.LIZ.LJII = 5000L;
        InterfaceC82683Wch LIZJ = c139825eE.LIZJ();
        LIZJ.show();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str);
        String str3 = null;
        if (shortVideoContext != null) {
            str2 = shortVideoContext.shootWay;
        } else {
            str2 = null;
        }
        c145995oB.LJI("shoot_way", str2);
        if (shortVideoContext != null) {
            str3 = shortVideoContext.LJI();
        }
        c145995oB.LJI("creation_id", str3);
        FMX.LJIIL("show_autocut_tips", c145995oB.LIZ);
        return LIZJ;
    }

    public static final void LIZ(ShortVideoContext shortVideoContext, AVMusic aVMusic, String str, int i, Integer num) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (C5WB.LIZ()) {
            return;
        }
        if (shortVideoContext.cameraComponentModel.mWorkspace == null) {
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(creativeInfo);
        }
        Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
        if (workspace != null) {
            workspace.LLILLL(str);
        }
        shortVideoContext.cameraComponentModel.mMusicPath = str;
        if (num != null && num.intValue() > 0) {
            shortVideoContext.LJJIJLIJ(num.intValue());
        }
        shortVideoContext.cameraComponentModel.mMusicStart = i;
        I9T.LJI(aVMusic, false, shortVideoContext.creativeModel.musicBuzModel);
    }

    public static void LIZLLL(List list, ShortVideoContext shortVideoContext, String str, C82622Wbi c82622Wbi, ActivityC45651qj activityC45651qj, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i) {
        CreativeInfo creativeInfo;
        AutoCutThemeData autoCutThemeData;
        InterfaceC44718Hgo interfaceC44718Hgo;
        C45256HpU c45256HpU;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        if ((i & 32) != 0) {
            z = false;
        }
        String str2 = null;
        if ((i & 64) != 0) {
            interfaceC65784Pro2 = null;
        }
        if (C45087Hml.LJJII()) {
            C78920UyC.LIZLLL(R.string.dtf, activityC45651qj, 6001);
            return;
        }
        if (shortVideoContext != null) {
            creativeInfo = shortVideoContext.creativeInfo;
        } else {
            creativeInfo = null;
        }
        if (list == null || creativeInfo == null) {
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "MvChoosePhoto startAutoCut: selectMediaList is null or creativeInfo is null");
            return;
        }
        AutoCutModel autoCutModel = shortVideoContext.creativeModel.autoCutModel;
        C45161Hnx.LIZIZ(new C45051HmB(shortVideoContext.shootWay, shortVideoContext.LJI()));
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyMediaModel myMediaModel = (MyMediaModel) it.next();
            C63B c63b = AutoCutMediaModel.Companion;
            MyMediaModel.Companion.getClass();
            MediaModel LIZ2 = C43966HNi.LIZ(myMediaModel);
            c63b.getClass();
            AutoCutMediaModel LIZ3 = C63B.LIZ(activityC45651qj, LIZ2);
            C45087Hml.LJJIZ(LIZ3);
            arrayList.add(LIZ3);
        }
        shortVideoContext.creativeModel.autoCutModel.curMediaList = AnonymousClass636.LJ(arrayList);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
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
        if (c82622Wbi != null) {
            interfaceC44718Hgo = (InterfaceC44718Hgo) c82622Wbi.LJIIIIZZ(null, InterfaceC44718Hgo.class);
        } else {
            interfaceC44718Hgo = null;
        }
        autoCutModel.clickFrom = str;
        if (interfaceC44718Hgo == null) {
            return;
        }
        C45203Hod c45203Hod = new C45203Hod(true, true, !LJFF, CommerceMediaServiceImpl.LIZJ().LIZ(), 0, null, arrayList, autoCutThemeData, null, null, false, creativeInfo, false, 28264);
        if (z) {
            c45256HpU = new C45256HpU(R.attr.cb, R.attr.dj, R.attr.dl, R.attr.dj, R.attr.dj, R.attr.d2);
        } else {
            c45256HpU = new C45256HpU(R.attr.cl, R.attr.go, R.attr.gu, R.attr.go, R.attr.go, R.attr.cf);
        }
        MediaModel mediaModel = (MediaModel) ORZ.LJLLLL(list);
        if (mediaModel != null) {
            str2 = mediaModel.fileLocalUriPath;
        }
        interfaceC44718Hgo.pH(new C45205Hof(c45203Hod, c45256HpU, LJFF, str2, new C44711Hgh(str, arrayList, autoCutModel, LJFF, shortVideoContext, extractAVMusic, interfaceC44718Hgo, c82622Wbi, list, activityC45651qj, interfaceC65784Pro2, shortVideoContext.shootWay, shortVideoContext.LJI(), C45087Hml.LJJ(extractAVMusic, false, autoCutModel))));
    }
}
