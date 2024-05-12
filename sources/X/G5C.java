package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.common.publish.CommerceToolsPublishService;
import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import com.ss.android.ugc.aweme.shortvideo.audio.copyright.AudioCopyrightProcessObserver;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G5C {
    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> list = PublishExtensionModel.fromContext(videoPublishEditModel).createAnchorInfos;
        if (list == null) {
            return false;
        }
        for (CreateAnchorInfo createAnchorInfo : list) {
            CreateAnchorInfo createAnchorInfo2 = createAnchorInfo;
            if (createAnchorInfo2.getType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || createAnchorInfo2.getType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) {
                if (createAnchorInfo == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static VideoPublishViewModel LIZJ(AbstractC42651GoZ abstractC42651GoZ) {
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(abstractC42651GoZ), abstractC42651GoZ).LIZ(VideoPublishViewModel.class);
        o.LJIIIIZZ(LIZ, "of(rootScene).get<VideoP…ishViewModel::class.java)");
        return (VideoPublishViewModel) LIZ;
    }

    public final void LIZ(G65 g65) {
        AbstractC156986Ec c157036Eh;
        if (g65.LIZLLL.isFinishing()) {
            return;
        }
        Fragment fragment = new Fragment();
        FragmentManager supportFragmentManager = g65.LIZLLL.getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        LIZ.LJIIIIZZ(0, 1, fragment, "CommerceCheckFragment");
        LIZ.LJIILJJIL();
        C42149GgT LIZ2 = CheckManager.LIZ.LIZ(g65.LIZIZ, "quick post on edit page checker", ((Number) CheckManager.LIZJ.getValue()).intValue());
        LIZ2.LIZ(new G64(g65.LIZ));
        VideoPublishEditModel videoPublishEditModel = g65.LIZJ;
        AbstractC42651GoZ abstractC42651GoZ = g65.LIZ;
        ArrayList arrayList = new ArrayList();
        if (C6EZ.LIZIZ(videoPublishEditModel) && C78983UzD.LJJJIL(videoPublishEditModel)) {
            arrayList.add(new C157056Ej(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ)));
            arrayList.add(new G8J(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ), new AqS154S0200000_7(this, videoPublishEditModel, 1)));
            c157036Eh = new C157006Ee(videoPublishEditModel, arrayList);
        } else if (C6EZ.LIZ()) {
            arrayList.add(new G8J(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ), new AqS154S0200000_7(this, videoPublishEditModel, 0)));
            c157036Eh = new C157046Ei(videoPublishEditModel, arrayList);
        } else if (AnchorListServiceImpl.LIZLLL().LIZJ(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE())) {
            arrayList.add(new G8J(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ), new AqS154S0200000_7(this, videoPublishEditModel, 2)));
            c157036Eh = new C156996Ed(videoPublishEditModel, arrayList);
        } else if (C5HR.LIZ()) {
            arrayList.add(new C157066Ek(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ)));
            arrayList.add(new C157056Ej(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ)));
            c157036Eh = new C157026Eg(videoPublishEditModel, arrayList);
        } else {
            arrayList.add(new C157056Ej(videoPublishEditModel, abstractC42651GoZ, LIZJ(abstractC42651GoZ)));
            c157036Eh = new C157036Eh(videoPublishEditModel, arrayList);
        }
        LIZ2.LIZ(new AudioCopyrightProcessObserver(videoPublishEditModel, abstractC42651GoZ, c157036Eh));
        C40999G7f LIZ3 = CommerceToolsPublishService.LIZJ().LIZ(new C40965G5x(g65, fragment));
        LIZ3.initialize();
        LIZ2.LIZ(new C40995G7b(LIZ3));
        LIZ2.LIZ(g65.LJ);
        LIZ2.LIZ(new G7I(g65.LIZLLL, "video_edit_page", Integer.valueOf(C42000Ge4.LJI(g65.LIZJ))));
        LIZ2.LIZJ(new AqS154S0200000_7(g65, fragment, 3));
        LIZ2.LJI();
    }
}
