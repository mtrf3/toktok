package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.C00F;
import X.C06530Nl;
import X.C10K;
import X.C124454uX;
import X.C141305gc;
import X.C142405iO;
import X.C1548966b;
import X.C162236Yh;
import X.C163186ao;
import X.C245319jz;
import X.C252669vq;
import X.C5HB;
import X.C60903NvH;
import X.C6VO;
import X.C6XZ;
import X.C76800UCe;
import X.C77412UZs;
import X.C78886Uxe;
import X.C79057V0z;
import X.C7MY;
import X.FFL;
import X.G8G;
import X.GSU;
import X.GUT;
import X.H7R;
import X.InterfaceC88472Yns;
import X.TAT;
import X.V16;
import X.WHL;
import Y.ACListenerS21S0100000_1;
import Y.ACallableS80S0200000_2;
import Y.AgS120S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverFragment;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity;
import com.ss.android.ugc.aweme.shoutouts.network.CheckWalletApi;
import com.ss.android.ugc.aweme.shoutouts.network.CheckWalletResponse;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Au2S13S0100000_2 extends TAT {
    public final int $t;
    public Object l0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S13S0100000_2(EditorProScene editorProScene, int i) {
        super(500L);
        this.$t = i;
        this.l0 = editorProScene;
    }

    public static final void LIZ$0(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        boolean z;
        ImageChooseCoverFragment imageChooseCoverFragment = (ImageChooseCoverFragment) au2S13S0100000_2.l0;
        imageChooseCoverFragment.getClass();
        C6VO LJFF = C60903NvH.LJIIJJI().LJFF();
        VideoPublishEditModel videoPublishEditModel = imageChooseCoverFragment.LLFII;
        if (videoPublishEditModel != null) {
            int i = (int) imageChooseCoverFragment.LJLLLLLL;
            int i2 = (int) imageChooseCoverFragment.LJLZ;
            if (videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex() != imageChooseCoverFragment.LLD) {
                z = true;
            } else {
                z = false;
            }
            LJFF.LIZIZ(videoPublishEditModel, i, i2, z, new AqS152S0100000_2(imageChooseCoverFragment, 35));
            return;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final void LIZ$1(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        boolean z;
        ImageChooseCoverFragment imageChooseCoverFragment = (ImageChooseCoverFragment) au2S13S0100000_2.l0;
        imageChooseCoverFragment.getClass();
        C6VO LJFF = C60903NvH.LJIIJJI().LJFF();
        VideoPublishEditModel videoPublishEditModel = imageChooseCoverFragment.LLFII;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex() != imageChooseCoverFragment.LLD) {
                z = true;
            } else {
                z = false;
            }
            LJFF.LJFF(new AqS168S0100000_2(imageChooseCoverFragment, 14), z);
            return;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final void LIZ$10(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        C163186ao c163186ao = (C163186ao) au2S13S0100000_2.l0;
        if (c163186ao.LJLLILLLL != null) {
            ShoutOutsData LLJJ = c163186ao.LLJJ();
            GSU gsu = c163186ao.LJLLILLLL;
            o.LJI(gsu);
            LLJJ.setDesc(String.valueOf(gsu.getText()));
        }
        Intent intent = new Intent();
        intent.putExtra("shoot_way", ShoutOutsData.shootWay);
        intent.putExtra("enter_from", "shoutouts_detail_page");
        C77412UZs.LJJIJIL(intent, new CreativeInfo(null, 0, null, 7, null));
        intent.putExtra("shoutouts_mode", "3");
        intent.putExtra("translation_type", 3);
        intent.putExtra("shout_out_data", ((C163186ao) au2S13S0100000_2.l0).LLJJ());
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(((C163186ao) au2S13S0100000_2.l0).requireActivity(), intent);
        Activity requireActivity = ((C163186ao) au2S13S0100000_2.l0).requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity");
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ.LJI(requireActivity)) {
            LIZJ.LJIJ(requireActivity);
        }
    }

    public static final void LIZ$11(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        C163186ao c163186ao = (C163186ao) au2S13S0100000_2.l0;
        c163186ao.LLJJIJIIJIL();
        C10K.LIZJ(new Callable() { // from class: X.6ap
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CheckWalletResponse checkWalletResponse = ((CheckWalletApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, CheckWalletApi.Api.class)).get().execute().LIZIZ;
                o.LJIIIIZZ(checkWalletResponse, "api.get().execute().body()");
                return checkWalletResponse;
            }
        }).LJ(new AgS120S0100000_2(c163186ao, 29), C10K.LJIIIIZZ, null);
    }

    public static final void LIZ$12(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        Activity requireActivity = ((C163186ao) au2S13S0100000_2.l0).requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity");
        ShoutOutsPublishActivity shoutOutsPublishActivity = (ShoutOutsPublishActivity) requireActivity;
        shoutOutsPublishActivity.LLIIIJ();
        shoutOutsPublishActivity.finish();
    }

    public static final void LIZ$2(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        ((C1548966b) au2S13S0100000_2.l0).LJ.LJIIJ(false, null, false);
    }

    public static final void LIZ$3(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        VideoPublishEditModel videoPublishEditModel = ((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL;
        if (videoPublishEditModel != null && C78886Uxe.LJII(videoPublishEditModel)) {
            C124454uX.LJI.getClass();
            C124454uX.LIZLLL();
        }
        C162236Yh.LIZIZ(((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL, "video_post_page");
        CreativeModel creativeModel = ((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL.creativeModel;
        creativeModel.transientPostPageModel.LJJIJLIJ = true;
        creativeModel.postPageModel.clickCover = System.currentTimeMillis();
        PostPageModel postPageModel = ((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL.creativeModel.postPageModel;
        postPageModel.getClass();
        postPageModel.coverEnterFrom = "video_post_page";
        if (((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL.creativeModel.transientPostPageModel.LJIIJJI) {
            C60903NvH.LJIIJJI().getPublishService().LJI();
            GUT.LIZ(((VideoPublishContainerScene) au2S13S0100000_2.l0).LLJLILLLLZIIL(), "enter_choose_cover_page");
        }
        if (H7R.LJJJJL(((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL) && !H7R.LJJIJLIJ(((VideoPublishContainerScene) au2S13S0100000_2.l0).LLILZLL)) {
            G8G.LIZ.start("av_image_choose_cover", "click cover");
            VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) au2S13S0100000_2.l0;
            C6XZ.LIZ(videoPublishContainerScene.mActivity, videoPublishContainerScene.LLILZLL);
        } else {
            G8G.LIZ.start("av_video_choose_cover", "click cover");
            VideoPublishContainerScene videoPublishContainerScene2 = (VideoPublishContainerScene) au2S13S0100000_2.l0;
            ChooseCoverActivity.LLILIL(videoPublishContainerScene2.mActivity, videoPublishContainerScene2.LLILZLL);
        }
    }

    public static final void LIZ$4(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        if (((EditorProScene) au2S13S0100000_2.l0).getUiStates().LJ.LIZJ) {
            return;
        }
        EditorProScene editorProScene = (EditorProScene) au2S13S0100000_2.l0;
        editorProScene.clickSave(editorProScene.enableDirectToPublish);
    }

    public static final void LIZ$5(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        if (((EditorProScene) au2S13S0100000_2.l0).getUiStates().LJ.LIZJ) {
            return;
        }
        EditorProScene editorProScene = (EditorProScene) au2S13S0100000_2.l0;
        if (editorProScene.effectMode) {
            editorProScene.clickCancel();
            return;
        }
        C5HB.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "studio_editor_pro_back_button_type", true) == 2 && ((EditorProScene) au2S13S0100000_2.l0).allowChangeInEp2Publish() && (C79057V0z.LJIIJ(((EditorProScene) au2S13S0100000_2.l0).getEditorContext()) || ((EditorProScene) au2S13S0100000_2.l0).getUpdateFromOuter())) {
            View view2 = ((EditorProScene) au2S13S0100000_2.l0).advancedEditorCancel;
            if (view2 != null) {
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "advancedEditorCancel.context");
                C142405iO c142405iO = new C142405iO(context, ((EditorProScene) au2S13S0100000_2.l0).getExitDialogItem(), new V16(), WHL.BOTTOM, C7MY.LIZIZ(5), C7MY.LIZIZ(48));
                View view3 = ((EditorProScene) au2S13S0100000_2.l0).advancedEditorCancel;
                if (view3 != null) {
                    c142405iO.LJ(view3);
                    return;
                } else {
                    o.LJIJI("advancedEditorCancel");
                    throw null;
                }
            }
            o.LJIJI("advancedEditorCancel");
            throw null;
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_back_button_type", true) > 0 && ((EditorProScene) au2S13S0100000_2.l0).allowChangeInEp2Publish() && (C79057V0z.LJIIJ(((EditorProScene) au2S13S0100000_2.l0).getEditorContext()) || ((EditorProScene) au2S13S0100000_2.l0).getUpdateFromOuter())) {
            ((EditorProScene) au2S13S0100000_2.l0).clickSave(false);
        } else {
            ((EditorProScene) au2S13S0100000_2.l0).clickCancel();
        }
    }

    public static final void LIZ$6(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        ((C141305gc) au2S13S0100000_2.l0).LJLIL.LJLZ(view);
    }

    public static final void LIZ$7(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.jcf);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS168S0100000_2((C163186ao) au2S13S0100000_2.l0, 527), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZIZ(LIZIZ);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        Activity requireActivity = ((C163186ao) au2S13S0100000_2.l0).requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentManager supportFragmentManager = ((ActivityC45651qj) requireActivity).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "requireActivity() as Fra…y).supportFragmentManager");
        LIZJ.show(supportFragmentManager, "shoutout");
    }

    public static final void LIZ$8(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        C163186ao c163186ao = (C163186ao) au2S13S0100000_2.l0;
        c163186ao.LLJJIJIIJIL();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("price", new JSONObject(GsonProtectorUtils.toJson(new Gson(), c163186ao.LLJJ().getPrice())));
        GSU gsu = c163186ao.LJLLILLLL;
        o.LJI(gsu);
        jSONObject.put("desc", String.valueOf(gsu.getText()));
        C10K.LIZJ(new ACallableS80S0200000_2(c163186ao, jSONObject, 10)).LJ(new AgS120S0100000_2(c163186ao, 30), C10K.LJIIIIZZ, null);
    }

    public static final void LIZ$9(Au2S13S0100000_2 au2S13S0100000_2, View view) {
        Activity activity = ((C163186ao) au2S13S0100000_2.l0).mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    public Au2S13S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S13S0100000_2(Object obj, int i, int i2) {
        super(600L);
        this.$t = i;
        this.l0 = obj;
    }
}
