package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.GlF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42445GlF<V> implements Callable {
    public final /* synthetic */ IRecordService.UICallback LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ HPU LJLJI;
    public final /* synthetic */ RecordConfig LJLJJI;
    public final /* synthetic */ Intent LJLJJL;
    public final /* synthetic */ Effect LJLJJLL;
    public final /* synthetic */ DuetConfig LJLJL;
    public final /* synthetic */ Context LJLJLJ;

    public CallableC42445GlF(IRecordService.UICallback uICallback, String str, HPU hpu, RecordConfig recordConfig, Intent intent, Effect effect, DuetConfig duetConfig, Context context) {
        this.LJLIL = uICallback;
        this.LJLILLLLZI = str;
        this.LJLJI = hpu;
        this.LJLJJI = recordConfig;
        this.LJLJJL = intent;
        this.LJLJJLL = effect;
        this.LJLJL = duetConfig;
        this.LJLJLJ = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        IRecordService.UICallback uICallback = this.LJLIL;
        if (uICallback != null) {
            uICallback.preSuccess();
        }
        I9T.LJFF(null);
        if (!TextUtils.equals(this.LJLILLLLZI, "challenge")) {
            this.LJLJI.LIZ.LJFF();
        }
        MusicModel musicModel = this.LJLJJI.getMusicModel();
        if (musicModel != null) {
            Intent intent = this.LJLJJL;
            I9T.LJFF(C44172HVg.LJI.transformMusicModel(musicModel));
            intent.putExtra("extra_duet_music", musicModel);
        }
        Intent intent2 = this.LJLJJL;
        HPU hpu = this.LJLJI;
        Effect effect = this.LJLJJLL;
        Integer duetGameScore = this.LJLJL.getDuetGameScore();
        o.LJI(duetGameScore);
        int intValue = duetGameScore.intValue();
        hpu.getClass();
        Bundle bundle = new Bundle();
        GameDuetResource gameDuetResource = new GameDuetResource(intValue, effect);
        try {
            j = CastLongProtector.parseLong(effect.getEffectId());
        } catch (Exception unused) {
            j = 0;
        }
        bundle.putParcelable("duet_sticker_game", gameDuetResource);
        bundle.putLong("first_face_sticker", j);
        intent2.putExtras(bundle);
        IRecordService.UICallback uICallback2 = this.LJLIL;
        if (uICallback2 == null || !uICallback2.checkIsCanceled()) {
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.LJLJLJ, this.LJLJJL);
            IRecordService.UICallback uICallback3 = this.LJLIL;
            if (uICallback3 != null) {
                uICallback3.postSuccess();
            }
        }
        return C76800UCe.LIZ;
    }
}
