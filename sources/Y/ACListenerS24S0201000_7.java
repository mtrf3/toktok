package Y;

import X.C00S;
import X.C141365gi;
import X.C145995oB;
import X.C28314B9i;
import X.C31061Ju;
import X.C40963G5v;
import X.C42241Ghx;
import X.C42242Ghy;
import X.C42663Gol;
import X.C42802Gr0;
import X.C42809Gr7;
import X.C42830GrS;
import X.C43272Gya;
import X.C44694HgQ;
import X.C45657Hvx;
import X.C45658Hvy;
import X.C78923UyF;
import X.C80674VlO;
import X.C87240YLs;
import X.FMX;
import X.H7R;
import X.InterfaceC28316B9k;
import X.QBF;
import X.VWH;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.commercialize.model.OrientationInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcTemplateEditPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.TemplateCategoryInformation;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACListenerS24S0201000_7 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        List<Integer> list = ((C45658Hvy) aCListenerS24S0201000_7.l1).LJLJJI;
        if (list == null || aCListenerS24S0201000_7.i2 >= ((ArrayList) list).size()) {
            return;
        }
        if (((Integer) ListProtector.get(((C45658Hvy) aCListenerS24S0201000_7.l1).LJLJJI, aCListenerS24S0201000_7.i2)).intValue() < 0 && ((ArrayList) ((C45658Hvy) aCListenerS24S0201000_7.l1).LJLJJL).size() >= 12) {
            return;
        }
        QBF qbf = ((C45658Hvy) aCListenerS24S0201000_7.l1).LJLJLJ;
        MediaModel mediaModel = (MediaModel) aCListenerS24S0201000_7.l0;
        C45657Hvx c45657Hvx = (C45657Hvx) qbf.LJLIL;
        if (c45657Hvx.LJZ == null) {
            return;
        }
        if (C44694HgQ.LJJ() && C44694HgQ.LJIL(mediaModel.fileLocalUriPath)) {
            c45657Hvx.LJZ.onData(C00S.LIZIZ(c45657Hvx.mActivity, C44694HgQ.LJIIIIZZ(mediaModel.fileLocalUriPath)));
        } else {
            c45657Hvx.LJZ.onData(mediaModel.fileLocalUriPath);
        }
    }

    public static final void onClick$1(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        VWH vwh = ((MentionVideoActivity) aCListenerS24S0201000_7.l0).LJLJJI;
        if (vwh != null) {
            vwh.setCurrentItem(aCListenerS24S0201000_7.i2);
            ((C80674VlO) aCListenerS24S0201000_7.l1).LIZ();
        } else {
            o.LJIJI("viewPager");
            throw null;
        }
    }

    public static final void onClick$2(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        ((C43272Gya) aCListenerS24S0201000_7.l0).LJLJJI.J9(aCListenerS24S0201000_7.i2, (OrientationInfo) aCListenerS24S0201000_7.l1);
    }

    public static final void onClick$3(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        ((C43272Gya) aCListenerS24S0201000_7.l0).LJLJJI.J9(aCListenerS24S0201000_7.i2, (OrientationInfo) aCListenerS24S0201000_7.l1);
    }

    public static final void onClick$4(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        ((C43272Gya) aCListenerS24S0201000_7.l0).LJLJJI.J9(aCListenerS24S0201000_7.i2, (OrientationInfo) aCListenerS24S0201000_7.l1);
    }

    public static final void onClick$5(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        ((C42241Ghx) aCListenerS24S0201000_7.l0).LJLILLLLZI.iv0(aCListenerS24S0201000_7.i2);
        ((C42242Ghy) aCListenerS24S0201000_7.l1).LJLILLLLZI.setChecked(!r1.isChecked());
    }

    public static final void onClick$6(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        ((C42809Gr7) aCListenerS24S0201000_7.l1).LJLLLLLL((C42802Gr0) aCListenerS24S0201000_7.l0, aCListenerS24S0201000_7.i2, false, "");
    }

    public static final void onClick$7(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        if (((C42830GrS) aCListenerS24S0201000_7.l0).getAdapterPosition() != -1) {
            C42830GrS c42830GrS = (C42830GrS) aCListenerS24S0201000_7.l0;
            c42830GrS.LJLIL.invoke(Integer.valueOf(c42830GrS.getAdapterPosition()), Integer.valueOf(aCListenerS24S0201000_7.i2), (RecommendHashtag) aCListenerS24S0201000_7.l1);
        }
    }

    public static final void onClick$8(ACListenerS24S0201000_7 aCListenerS24S0201000_7, View view) {
        boolean z;
        switch (aCListenerS24S0201000_7.i2) {
            case 0:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS24S0201000_7.l0;
                NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) aCListenerS24S0201000_7.l1;
                stickerPropDetailFragment.getClass();
                List<TemplateCategoryInformation> templateCategories = newFaceStickerBean.mobileEffectTemplate.getTemplateCategories();
                String str = "";
                if (templateCategories == null) {
                    stickerPropDetailFragment.Il(newFaceStickerBean.mobileEffectTemplate.getTemplateId(), "");
                    return;
                }
                Iterator<TemplateCategoryInformation> it = templateCategories.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String key = it.next().getKey();
                        if (key != null && key.equals("create")) {
                            str = "create";
                        }
                    }
                }
                stickerPropDetailFragment.Il(newFaceStickerBean.mobileEffectTemplate.getTemplateId(), str);
                return;
            case 1:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCListenerS24S0201000_7.l0;
                List<PUgcSlotData> slotList = (List) aCListenerS24S0201000_7.l1;
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel != null) {
                    if (videoPublishEditModel.isPrivate == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C141365gi.LIZIZ(videoPublishEditModel) && z) {
                        PUgcTemplateEditPreviewScene pUgcTemplateEditPreviewScene = new PUgcTemplateEditPreviewScene();
                        VideoPublishEditModel mModel = videoPublishContainerScene.LLILZLL;
                        o.LJIIIZ(mModel, "mModel");
                        o.LJIIIZ(slotList, "slotList");
                        pUgcTemplateEditPreviewScene.LJLLILLLL = mModel;
                        pUgcTemplateEditPreviewScene.LJLLJ = true;
                        pUgcTemplateEditPreviewScene.LJLLL = true;
                        pUgcTemplateEditPreviewScene.LJLLLLLL = slotList;
                        pUgcTemplateEditPreviewScene.LJLZ = new C40963G5v(videoPublishContainerScene);
                        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(videoPublishContainerScene);
                        if (LJIIJJI != null) {
                            C42663Gol c42663Gol = new C42663Gol();
                            c42663Gol.LIZJ = new C87240YLs();
                            LJIIJJI.LLJJJJ(pUgcTemplateEditPreviewScene, c42663Gol.LIZ());
                        }
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LJI("creation_id", videoPublishContainerScene.LLILZLL.getCreationId());
                        c145995oB.LJI("enter_from", "video_post_page");
                        c145995oB.LJI("shoot_way", videoPublishContainerScene.LLILZLL.mShootWay);
                        c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishContainerScene.LLILZLL));
                        FMX.LJIIL("click_post_template_entrance", c145995oB.LIZ);
                        return;
                    }
                    videoPublishContainerScene.C();
                    return;
                }
                return;
            default:
                C28314B9i c28314B9i = (C28314B9i) aCListenerS24S0201000_7.l0;
                C31061Ju c31061Ju = (C31061Ju) aCListenerS24S0201000_7.l1;
                InterfaceC28316B9k interfaceC28316B9k = c28314B9i.LJLILLLLZI;
                if (interfaceC28316B9k != null) {
                    interfaceC28316B9k.LJIIJJI(c31061Ju);
                    return;
                }
                return;
        }
    }

    public ACListenerS24S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
