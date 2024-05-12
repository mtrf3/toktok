package Y;

import X.C15070iV;
import X.C164826dS;
import X.C42000Ge4;
import X.C44172HVg;
import X.C60903NvH;
import X.C76800UCe;
import X.C78605Ut7;
import X.EnumC164816dR;
import X.FMX;
import X.G7P;
import X.H7R;
import X.HR5;
import X.HVO;
import X.InterfaceC65784Pro;
import X.OHQ;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS44S0400000_7 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final Object invoke$0(AObjectS44S0400000_7 aObjectS44S0400000_7) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS44S0400000_7.l0;
        String[] strArr = (String[]) aObjectS44S0400000_7.l1;
        HR5 hr5 = (HR5) aObjectS44S0400000_7.l2;
        TokenCert tokenCert = (TokenCert) aObjectS44S0400000_7.l3;
        videoRecordPermissionActivity.getClass();
        if (C78605Ut7.LJIL(videoRecordPermissionActivity, strArr)) {
            videoRecordPermissionActivity.LLIIIJ(strArr, hr5, tokenCert);
        } else {
            String[] LJIILL = C78605Ut7.LJIILL(strArr);
            o.LJIIIZ(LJIILL, OHQ.LIZIZ);
            FMX.LJIIL("permission_rationale_page_action_setting", HVO.LIZ(LJIILL, videoRecordPermissionActivity, null));
            C44172HVg.LJJI.LJ().LJ(videoRecordPermissionActivity);
            videoRecordPermissionActivity.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS44S0400000_7 aObjectS44S0400000_7) {
        List<CreateAnchorInfo> anchors;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS44S0400000_7.l0;
        View view = (View) aObjectS44S0400000_7.l1;
        Bundle bundle = (Bundle) aObjectS44S0400000_7.l2;
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) aObjectS44S0400000_7.l3;
        List<C15070iV<Class<?>, IAVPublishExtension<?>>> list = videoPublishContainerScene.LLJILJILJ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) ((C15070iV) it.next()).LIZIZ;
                TikTokPublishGroupSceneFragment LLLFF = videoPublishContainerScene.LLLFF();
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.d2d);
                AVPublishContentType aVPublishContentType = AVPublishContentType.Video;
                PublishOutput LJIILJJIL = C42000Ge4.LJIILJJIL(videoPublishContainerScene.LLILZLL);
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                MicroAppModel microAppModel = videoPublishEditModel.microAppModel;
                MobParam mobParam = new MobParam("video_post_page", videoPublishEditModel.mShootWay, videoPublishEditModel.getCreationId());
                VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
                o.LJIIIZ(videoPublishEditModel2, "<this>");
                boolean z = true;
                List<InteractStickerStruct> LIZLLL = C164826dS.LIZLLL(videoPublishEditModel2.getMainBusinessContext(), EnumC164816dR.TRACK_PAGE_EDIT);
                if (LIZLLL == null) {
                    z = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (InteractStickerStruct interactStickerStruct : LIZLLL) {
                        if (interactStickerStruct.getType() == 5) {
                            arrayList.add(interactStickerStruct);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        try {
                            TextStruct textStruct = (TextStruct) C60903NvH.LJIIJJI().LIZ().LJI(((InteractStickerStruct) next).getTextStruct(), TextStruct.class);
                            if (textStruct != null && (anchors = textStruct.getAnchors()) != null && (!anchors.isEmpty())) {
                                if (next != null) {
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    z = false;
                }
                iAVPublishExtension.onCreate(LLLFF, view, videoPublishContainerScene, linearLayout, bundle, aVPublishContentType, LJIILJJIL, new ExtensionMisc(null, null, microAppModel, videoPublishContainerScene, extensionDataRepo, mobParam, z, H7R.LJJJJL(videoPublishContainerScene.LLILZLL), MusicBeanUtilKt.extractAVMusic(videoPublishContainerScene.LLILZLL.creativeModel.musicBuzModel)), new G7P(videoPublishContainerScene));
            }
        }
        return C76800UCe.LIZ;
    }

    public AObjectS44S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
