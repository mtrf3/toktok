package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: X.XVs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84952XVs<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LJLJJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJL;

    public C84952XVs(Context context, Effect effect, C73893SzJ c73893SzJ, String str, java.util.Map map) {
        this.LJLIL = str;
        this.LJLILLLLZI = effect;
        this.LJLJI = context;
        this.LJLJJI = c73893SzJ;
        this.LJLJJL = map;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C84767XOp> interfaceC73573Su9) {
        if (TextUtils.isEmpty(this.LJLIL)) {
            LIZ(this.LJLJJI, interfaceC73573Su9, this.LJLILLLLZI, null, 8);
            return;
        }
        IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
        Effect effect = this.LJLILLLLZI;
        if (effect == null) {
            EffectListResponse LIZ = C44027HPr.LIZ(this.LJLIL);
            if (LIZ != null) {
                LIZJ(this.LJLJJI, effectService, this.LJLJI, this.LJLIL, this.LJLJJL, interfaceC73573Su9, (Effect) ORZ.LJLLLL(LIZ.getData()));
                return;
            }
            Context context = this.LJLJI;
            C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
            effectService.buildEffectPlatform(context, new C84956XVw(context, effectService, c73433Srt, this.LJLJJI, this.LJLIL, this.LJLJJL), null);
            return;
        }
        LIZJ(this.LJLJJI, effectService, this.LJLJI, this.LJLIL, this.LJLJJL, interfaceC73573Su9, effect);
    }

    public static final void LIZIZ(AbstractC73851Syd<C84768XOq> abstractC73851Syd, InterfaceC73573Su9<C84767XOp> interfaceC73573Su9, Effect effect, boolean z) {
        if (!z) {
            abstractC73851Syd.onNext(new C84768XOq(-106, 100, effect, 0L, null, 24));
        }
        interfaceC73573Su9.onNext(new C84767XOp(null, null, null, null, effect, 100, null, 79));
        interfaceC73573Su9.onComplete();
    }

    public static void LIZ(AbstractC73851Syd abstractC73851Syd, InterfaceC73573Su9 interfaceC73573Su9, Effect effect, ExceptionResult exceptionResult, int i) {
        ExceptionResult exceptionResult2 = exceptionResult;
        if ((i & 8) != 0) {
            exceptionResult2 = new ExceptionResult(-1);
        }
        if ((i & 16) != 0) {
            abstractC73851Syd.onNext(new C84768XOq(-106, -103, effect, 0L, exceptionResult2, 8));
        }
        interfaceC73573Su9.onNext(new C84767XOp(null, null, null, null, effect, -103, exceptionResult2, 15));
        interfaceC73573Su9.onComplete();
    }

    public static final void LIZJ(AbstractC73851Syd<C84768XOq> abstractC73851Syd, IAVEffectService iAVEffectService, Context context, String str, java.util.Map<String, String> map, InterfaceC73573Su9<C84767XOp> interfaceC73573Su9, Effect effect) {
        abstractC73851Syd.onNext(new C84768XOq(-101, -104, effect, 0L, null, 24));
        iAVEffectService.buildEffectPlatform(context, new C84951XVr(effect, iAVEffectService, str, map, abstractC73851Syd, interfaceC73573Su9), null);
    }
}
