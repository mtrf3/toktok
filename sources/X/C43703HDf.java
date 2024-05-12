package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS13S0500000_7;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.HDf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43703HDf {
    public static final /* synthetic */ int LIZIZ = 0;
    public DialogC25756A8y LIZ;

    public final void LIZIZ() {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C72622t8(this, null), 3);
    }

    public static void LIZJ(boolean z, ShareKitPanel shareKitPanel) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "trim_page");
        c188727au.LJIIIZ("channel", shareKitPanel.getClientKey());
        c188727au.LIZLLL(z ? 1 : 0, "is_continue");
        c188727au.LJIIIZ("effect_resource_id", shareKitPanel.getEffectResourceId());
        c188727au.LJIIIZ("share_panel_option", shareKitPanel.getSharePanelOption());
        c188727au.LJFF(shareKitPanel.getShareMediaType(), "share_media_type");
        FMX.LJIIL("share_effect_error_action", c188727au.LIZ);
    }

    public static void LIZLLL(final Activity activity, C43722HDy c43722HDy, C45838Hys c45838Hys, String str, final InterfaceC67352kd interfaceC67352kd) {
        c43722HDy.mTargetSceneType = 1;
        Bundle shareRequestBundle = c43722HDy.getShareRequestBundle();
        shareRequestBundle.putString("creation_id", str);
        shareRequestBundle.putString("shoot_way", C43706HDi.LIZJ(c43722HDy));
        shareRequestBundle.putString("enter_from", "open_platform_share");
        shareRequestBundle.putSerializable("open_platform_share_context", c43722HDy);
        IOpenPhotoNextService openGotoNextService = AVExternalServiceImpl.LIZ().openGotoNextService();
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        openGotoNextService.gotoNextPage((ActivityC45651qj) activity, false, shareRequestBundle, c45838Hys.LIZIZ, new IPageToFinish() { // from class: X.2nd
            @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
            public final void onFinish(boolean z) {
                if (!z) {
                    C5S1 c5s1 = new C5S1(activity);
                    c5s1.LIZJ(R.string.rju);
                    c5s1.LJ();
                }
                if (C79146V4k.LJJJ(interfaceC67352kd.getContext())) {
                    InterfaceC67352kd<Boolean> interfaceC67352kd2 = interfaceC67352kd;
                    Boolean bool = Boolean.TRUE;
                    C3C5.m7constructorimpl(bool);
                    interfaceC67352kd2.resumeWith(bool);
                }
            }
        });
    }

    public static void LJ(Activity activity, AsyncAVService asyncAVService, C43722HDy c43722HDy, C45838Hys c45838Hys, String str, InterfaceC67352kd interfaceC67352kd) {
        String str2;
        String str3;
        int i;
        boolean z = true;
        if (c45838Hys.LIZIZ.size() <= 1) {
            z = false;
        }
        EditConfig.Builder builder = new EditConfig.Builder();
        builder.shootWay(C43706HDi.LIZJ(c43722HDy));
        builder.musicOrigin(C43706HDi.LIZIZ(c43722HDy.mClientKey));
        builder.creationId(str);
        builder.publishSetting(c43722HDy.mPublishSettings);
        MusicContent musicContent = c43722HDy.mMusicContent;
        Integer num = null;
        if (musicContent != null) {
            str2 = musicContent.getMusicId();
        } else {
            str2 = null;
        }
        builder.musicIdExtra(str2);
        MusicContent musicContent2 = c43722HDy.mMusicContent;
        if (musicContent2 != null) {
            num = Integer.valueOf(musicContent2.getMusicStartTime());
        }
        builder.musicStartTimeExtra(num);
        builder.onEnterEdit(new AqS151S0100000_1(interfaceC67352kd, (InterfaceC67352kd<? super Boolean>) 718));
        if (z) {
            str3 = C43706HDi.LIZJ(c43722HDy);
        } else {
            str3 = "system_share";
        }
        AnchorListServiceImpl.LIZLLL().LIZIZ(str3, str);
        if (z) {
            i = 4;
        } else {
            i = 2;
        }
        ShareConfig shareConfig = new ShareConfig(c43722HDy, i);
        if (z) {
            shareConfig.setVideoList(c45838Hys.LIZIZ);
        } else {
            shareConfig.setFile((String) ListProtector.get(c45838Hys.LIZIZ, 0));
        }
        shareConfig.setAppName(c43722HDy.mAppName);
        asyncAVService.uiService().editService().startEdit(activity, builder.build(), shareConfig);
    }

    public final void LIZ(Activity activity, AsyncAVService asyncAVService, C43722HDy c43722HDy, C45838Hys c45838Hys, String str, String str2, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        int i = 1;
        if (c45838Hys.LIZ != 1) {
            i = 2;
        }
        ShareKitPanel shareKitPanel = new ShareKitPanel(null, "green_screen", str, Integer.valueOf(i), c43722HDy.mClientKey, 1, null);
        C43707HDj c43707HDj = new C43707HDj(c43722HDy, c45838Hys, this, activity, str2, interfaceC67352kd, asyncAVService);
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(activity.getString(R.string.gtj));
        c26227ARb.LIZIZ(activity.getString(R.string.gtg));
        c26227ARb.LJII = false;
        UC0.LIZJ(c26227ARb, new AqS13S0500000_7(activity, this, shareKitPanel, c43707HDj, c43722HDy, 0));
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C62852dN(c26227ARb, null), 3);
    }
}
