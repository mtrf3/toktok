package com.ss.android.ugc.aweme.services;

import X.C10K;
import X.C116694i1;
import X.C188727au;
import X.C227768wm;
import X.C3A5;
import X.C42398GkU;
import X.C45988I3c;
import X.C46117I8b;
import X.EnumC46139I8x;
import X.ExecutorC142245i8;
import X.FMX;
import X.HQM;
import X.HQS;
import X.HS8;
import X.HSE;
import X.InterfaceC44105HSr;
import X.InterfaceC88472Yns;
import Y.ACallableS84S0200000_7;
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.LongPressOpenAlbumParams;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAnchorConfig;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLCallbackS60S0100000_7 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 2:
                onFailed$0(this);
                return;
            case 3:
                onFailed$1(this);
                return;
            default:
                super.onFailed();
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                return;
            case 1:
                onLoad$1(this, asyncAVService, j);
                return;
            case 2:
                onLoad$2(this, asyncAVService, j);
                return;
            case 3:
                onLoad$3(this, asyncAVService, j);
                return;
            case 4:
                onLoad$4(this, asyncAVService, j);
                return;
            case 5:
                onLoad$5(this, asyncAVService, j);
                return;
            case 6:
                onLoad$6(this, asyncAVService, j);
                return;
            case 7:
                onLoad$7(this, asyncAVService, j);
                return;
            case 8:
                onLoad$8(this, asyncAVService, j);
                return;
            default:
                super.onLoad(asyncAVService, j);
                return;
        }
    }

    public static final void onFailed$0(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7) {
        ((ShortcutShootingActivity) iDLCallbackS60S0100000_7.l0).finish();
    }

    public static final void onFailed$1(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7) {
        ((VideoShare2GifEditActivity) iDLCallbackS60S0100000_7.l0).finish();
    }

    public IDLCallbackS60S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLoad$0(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService service, long j) {
        String str;
        Fragment mv0;
        MainFragment mainFragment;
        o.LJIIIZ(service, "service");
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        String LJJLIIIJJI = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        C46117I8b c46117I8b = (C46117I8b) iDLCallbackS60S0100000_7.l0;
        String creationId = creativeInfo.getCreationId();
        c46117I8b.getClass();
        TabChangeManager LIZ = C116694i1.LIZ(c46117I8b.LIZ);
        if (o.LJ("HOME", LIZ.nv0()) && (mv0 = LIZ.mv0()) != null) {
            FeedFragment feedFragment = null;
            if ((mv0 instanceof MainFragment) && (mainFragment = (MainFragment) mv0) != null) {
                feedFragment = mainFragment.w2();
            }
            if (feedFragment instanceof FeedRecommendFragment) {
                str = C3A5.LIZ.LIZIZ(C227768wm.LJIILLIIL(0, EnumC46139I8x.INSTANCE.getVideoId()));
                o.LJIIIIZZ(str, "getInstance().getAwemeLo…      )\n                )");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("creation_id", creationId);
                c188727au.LJIIIZ("shoot_way", "direct_shoot_long_press");
                c188727au.LJIIIZ("enter_from", LJJLIIIJJI);
                c188727au.LJIIIZ("enter_method", "long_press");
                C45988I3c.LIZ(c188727au, str, LJJLIIIJJI, "", false);
                AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_upload_entrance", c188727au.LIZ);
                service.uiService().recordService().openAlbum(((C46117I8b) iDLCallbackS60S0100000_7.l0).LIZ, new LongPressOpenAlbumParams(creativeInfo, LJJLIIIJJI, "direct_shoot_long_press", System.currentTimeMillis()));
            }
        }
        str = "";
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("creation_id", creationId);
        c188727au2.LJIIIZ("shoot_way", "direct_shoot_long_press");
        c188727au2.LJIIIZ("enter_from", LJJLIIIJJI);
        c188727au2.LJIIIZ("enter_method", "long_press");
        C45988I3c.LIZ(c188727au2, str, LJJLIIIJJI, "", false);
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_upload_entrance", c188727au2.LIZ);
        service.uiService().recordService().openAlbum(((C46117I8b) iDLCallbackS60S0100000_7.l0).LIZ, new LongPressOpenAlbumParams(creativeInfo, LJJLIIIJJI, "direct_shoot_long_press", System.currentTimeMillis()));
    }

    public static final void onLoad$1(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService asyncAVService, long j) {
        IRecordService recordService = asyncAVService.uiService().recordService();
        Activity activity = (Activity) iDLCallbackS60S0100000_7.l0;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.showStickerPanel(true);
        recordService.startRecord(activity, builder.build());
    }

    public static final void onLoad$2(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService asyncAVService, long j) {
        ((ShortcutShootingActivity) iDLCallbackS60S0100000_7.l0).finish();
        Intent intent = ((ShortcutShootingActivity) iDLCallbackS60S0100000_7.l0).getIntent();
        intent.putExtra("shoot_way", "short_cut");
        asyncAVService.uiService().recordService().startRecord((ShortcutShootingActivity) iDLCallbackS60S0100000_7.l0, intent);
    }

    public static final void onLoad$3(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService asyncAVService, long j) {
        C10K.LIZIZ(new ACallableS84S0200000_7(iDLCallbackS60S0100000_7, asyncAVService, 9), ExecutorC142245i8.LJLILLLLZI, null);
    }

    public static final void onLoad$4(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        UgcTemplateAnchorConfig ugcTemplateAnchorConfig = new UgcTemplateAnchorConfig();
        ugcTemplateAnchorConfig.setAweme(((HQS) iDLCallbackS60S0100000_7.l0).LJJII());
        ugcTemplateAnchorConfig.setFromPUgc(true);
        service.uiService().recordService().startUgcTemplatePreviewActivity(((HQS) iDLCallbackS60S0100000_7.l0).LJJI(), ugcTemplateAnchorConfig);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "pugc_template");
        c188727au.LJIIIZ("creation_id", ugcTemplateAnchorConfig.getCreativeInfo().getCreationId());
        c188727au.LJIIIZ("enter_from", ((HQS) iDLCallbackS60S0100000_7.l0).LJJIIZI());
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    public static final void onLoad$5(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startEditorProAnchorAlbum(((HS8) iDLCallbackS60S0100000_7.l0).LJJI(), ((HS8) iDLCallbackS60S0100000_7.l0).LJJJJJ());
    }

    public static final void onLoad$6(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        UgcTemplateAnchorConfig ugcTemplateAnchorConfig = new UgcTemplateAnchorConfig();
        ugcTemplateAnchorConfig.setAweme(((HQM) iDLCallbackS60S0100000_7.l0).LJJII());
        ugcTemplateAnchorConfig.setFromPUgc(false);
        service.uiService().recordService().startUgcTemplatePreviewActivity(((HQM) iDLCallbackS60S0100000_7.l0).LJJI(), ugcTemplateAnchorConfig);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "ugc_template");
        c188727au.LJIIIZ("creation_id", ugcTemplateAnchorConfig.getCreativeInfo().getCreationId());
        c188727au.LJIIIZ("enter_from", ((HQM) iDLCallbackS60S0100000_7.l0).LJJIIZI());
        c188727au.LJIIIZ("group_id", ((HQM) iDLCallbackS60S0100000_7.l0).LJJII().getAid());
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    public static final void onLoad$7(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ((InterfaceC88472Yns) iDLCallbackS60S0100000_7.l0).invoke(service);
    }

    public static final void onLoad$8(IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7, AsyncAVService service, long j) {
        Activity LIZ;
        o.LJIIIZ(service, "service");
        UgcTemplateAnchorConfig ugcTemplateAnchorConfig = new UgcTemplateAnchorConfig();
        Aweme aweme = ((HSE) iDLCallbackS60S0100000_7.l0).LJLJJL;
        String str = null;
        if (aweme != null) {
            ugcTemplateAnchorConfig.setAweme(aweme);
            ugcTemplateAnchorConfig.setFromPUgc(true);
            InterfaceC44105HSr interfaceC44105HSr = ((HSE) iDLCallbackS60S0100000_7.l0).LJLL;
            if (interfaceC44105HSr != null && (LIZ = interfaceC44105HSr.LIZ()) != null) {
                HSE hse = (HSE) iDLCallbackS60S0100000_7.l0;
                service.uiService().recordService().startUgcTemplatePreviewActivity(LIZ, ugcTemplateAnchorConfig);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("shoot_way", "pugc_template");
                c188727au.LJIIIZ("creation_id", ugcTemplateAnchorConfig.getCreativeInfo().getCreationId());
                InterfaceC44105HSr interfaceC44105HSr2 = hse.LJLL;
                if (interfaceC44105HSr2 != null) {
                    str = interfaceC44105HSr2.LJJLJLI();
                }
                c188727au.LJIIIZ("enter_from", str);
                FMX.LJIIL("shoot", c188727au.LIZ);
                return;
            }
            return;
        }
        o.LJIJI("aweme");
        throw null;
    }
}
