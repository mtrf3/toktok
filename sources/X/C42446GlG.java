package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GlG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42446GlG implements IFetchEffectListener {
    public final /* synthetic */ IRecordService.UICallback LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ HPU LIZJ;
    public final /* synthetic */ RecordConfig LIZLLL;
    public final /* synthetic */ Intent LJ;
    public final /* synthetic */ DuetConfig LJFF;
    public final /* synthetic */ Context LJI;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        C10K.LIZIZ(new CallableC42445GlF(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, effect2, this.LJFF, this.LJI), ExecutorC149205tM.LJLILLLLZI, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        IRecordService.UICallback uICallback = this.LIZ;
        if (uICallback != null) {
            uICallback.preFail(-2);
        }
        HRJ.LIZ(new ARunnableS40S0100000_4((InterfaceC65784Pro) new AqS157S0100000_7(this.LJI, 0), 129));
    }

    public C42446GlG(IRecordService.UICallback uICallback, String str, HPU hpu, RecordConfig recordConfig, Intent intent, DuetConfig duetConfig, Context context) {
        this.LIZ = uICallback;
        this.LIZIZ = str;
        this.LIZJ = hpu;
        this.LIZLLL = recordConfig;
        this.LJ = intent;
        this.LJFF = duetConfig;
        this.LJI = context;
    }
}
