package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.HDg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43704HDg implements IFetchEffectListener {
    public final /* synthetic */ C43703HDf LIZ;
    public final /* synthetic */ C45838Hys LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C43722HDy LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ AsyncAVService LJFF;
    public final /* synthetic */ Activity LJI;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJII;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        this.LIZ.LIZIZ();
        if (effect2 != null) {
            OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = new OPSDK$GreenScreenKitConfig(false, null, null, null, null, 31, null);
            oPSDK$GreenScreenKitConfig.setShareFromGSK(true);
            oPSDK$GreenScreenKitConfig.setEffectId(effect2.getEffect_id());
            C45838Hys c45838Hys = this.LIZIZ;
            if (c45838Hys.LIZ == 1) {
                oPSDK$GreenScreenKitConfig.setImagePath((String) ListProtector.get(c45838Hys.LIZIZ, 0));
                RecordPresetResource recordPresetResource = new RecordPresetResource(effect2.getEffect_id(), effect2, null, null, 12, null);
                ShareKitPanel shareKitPanel = new ShareKitPanel(effect2, "green_screen", this.LIZJ, 1, this.LIZLLL.mClientKey);
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.shootWay("green_screen_kit");
                builder.setGreenScreenKitPresetResource(recordPresetResource);
                builder.shareKitPanel(shareKitPanel);
                builder.shareModel(this.LIZLLL);
                builder.showStickerPanel(false);
                builder.setGreenScreenKitConfig(oPSDK$GreenScreenKitConfig);
                builder.keepChallenge(true);
                builder.permissionActivityRequired(true);
                builder.creationId(this.LJ);
                builder.musicOrigin(C43706HDi.LIZIZ(this.LIZLLL.mClientKey));
                this.LJFF.uiService().recordService().startRecord(this.LJI, builder.build());
                InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJII;
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                interfaceC67352kd.resumeWith(bool);
                return;
            }
            oPSDK$GreenScreenKitConfig.setVideoPath((String) ListProtector.get(c45838Hys.LIZIZ, 0));
            this.LIZLLL.mShareKitPanel = new ShareKitPanel(effect2, "green_screen", this.LIZJ, 2, this.LIZLLL.mClientKey);
            EditConfig.Builder builder2 = new EditConfig.Builder();
            builder2.shootWay("green_screen_kit");
            builder2.shareModel(this.LIZLLL);
            builder2.musicOrigin(C43706HDi.LIZIZ(this.LIZLLL.mClientKey));
            builder2.creationId(this.LJ);
            builder2.onEnterEdit(new AqS151S0100000_1(this.LJII, (InterfaceC67352kd<? super Boolean>) 717));
            EditConfig build = builder2.build();
            C43722HDy c43722HDy = this.LIZLLL;
            c43722HDy.mApplyEffectResourceId = this.LIZJ;
            ShareConfig shareConfig = new ShareConfig(c43722HDy, 2);
            shareConfig.setFile((String) ListProtector.get(this.LIZIZ.LIZIZ, 0));
            shareConfig.setVideoList(this.LIZIZ.LIZIZ);
            shareConfig.setAppName(this.LIZLLL.mAppName);
            shareConfig.setPresetEffect(effect2);
            this.LJFF.uiService().editService().startEdit(this.LJI, build, shareConfig);
            return;
        }
        this.LIZ.LIZ(this.LJI, this.LJFF, this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJ, this.LJII);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LIZ(this.LJI, this.LJFF, this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJ, this.LJII);
        this.LIZ.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43704HDg(C43703HDf c43703HDf, C45838Hys c45838Hys, String str, C43722HDy c43722HDy, String str2, AsyncAVService asyncAVService, Activity activity, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        this.LIZ = c43703HDf;
        this.LIZIZ = c45838Hys;
        this.LIZJ = str;
        this.LIZLLL = c43722HDy;
        this.LJ = str2;
        this.LJFF = asyncAVService;
        this.LJI = activity;
        this.LJII = interfaceC67352kd;
    }
}
