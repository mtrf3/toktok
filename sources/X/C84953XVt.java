package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: X.XVt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84953XVt<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LJLJJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJL;

    public C84953XVt(Context context, Effect effect, C73893SzJ c73893SzJ, String str, java.util.Map map) {
        this.LJLIL = str;
        this.LJLILLLLZI = effect;
        this.LJLJI = context;
        this.LJLJJI = c73893SzJ;
        this.LJLJJL = map;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C84767XOp> interfaceC73573Su9) {
        IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
        if (TextUtils.isEmpty(this.LJLIL)) {
            LIZ(this.LJLJJI, interfaceC73573Su9, null);
            return;
        }
        Effect effect = this.LJLILLLLZI;
        if (effect == null) {
            EffectListResponse LIZ = C44027HPr.LIZ(this.LJLIL);
            if (LIZ != null) {
                LIZ(this.LJLJJI, interfaceC73573Su9, (Effect) ORZ.LJLLLL(LIZ.getData()));
                return;
            } else {
                effectService.buildEffectPlatform(this.LJLJI, new C84958XVy(this.LJLIL, this.LJLJJL, this.LJLJJI, (C73433Srt) interfaceC73573Su9), null);
                return;
            }
        }
        LIZ(this.LJLJJI, interfaceC73573Su9, effect);
    }

    public static final void LIZ(AbstractC73851Syd<C84768XOq> abstractC73851Syd, InterfaceC73573Su9<C84767XOp> interfaceC73573Su9, Effect effect) {
        abstractC73851Syd.onNext(new C84768XOq(-101, -104, effect, 0L, null, 24));
        interfaceC73573Su9.onNext(new C84767XOp(null, null, null, null, effect, -105, null, 79));
        interfaceC73573Su9.onComplete();
    }
}
