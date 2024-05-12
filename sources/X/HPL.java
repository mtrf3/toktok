package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPL implements IFetchEffectListener {
    public final /* synthetic */ StickerDownloadConfig LIZ;
    public final /* synthetic */ HPQ LIZIZ;
    public final /* synthetic */ RecordConfig LIZJ;
    public final /* synthetic */ Context LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        HPQ hpq = this.LIZIZ;
        RecordConfig recordConfig = this.LIZJ;
        hpq.getClass();
        Intent LIZ = HPU.LIZ(recordConfig);
        if (effect2 != null) {
            LIZ.putExtra("reuse_mvtheme_enter", true);
            LIZ.putExtra("extra_bind_mv_id", effect2.getEffectId());
            LIZ.putExtra("extra_mv_effect", (Parcelable) effect2);
        }
        InterfaceC65784Pro<C76800UCe> onSuccess = this.LIZ.getOnSuccess();
        if (onSuccess != null) {
            onSuccess.invoke();
        }
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getShieldTemplateExp()) {
            Activity LJIJJ = C45804HyK.LJIJJ(this.LIZLLL);
            if (LJIJJ != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.ijy);
                creativeToastBuilder.iconColor(R.attr.eb);
                creativeToastBuilder.duration(3000L);
                C78915Uy7.LJJIIZI(LJIJJ, 3053, creativeToastBuilder);
                return;
            }
            return;
        }
        I9T.LJFF(null);
        this.LIZIZ.LIZ.LJFF();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.LIZLLL, LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC88472Yns<Integer, C76800UCe> onFail = this.LIZ.getOnFail();
        if (onFail != null) {
            onFail.invoke(Integer.valueOf(e.getErrorCode()));
        }
    }

    public HPL(Context context, HPQ hpq, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig) {
        this.LIZ = stickerDownloadConfig;
        this.LIZIZ = hpq;
        this.LIZJ = recordConfig;
        this.LIZLLL = context;
    }
}
