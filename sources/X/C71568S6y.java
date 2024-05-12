package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.S6y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71568S6y implements C0WN {
    public final /* synthetic */ RootData LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ LiveEffect LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJFF;

    @Override // X.C0WN
    public final void LJFF(int i, Effect effect) {
    }

    @Override // X.C0WN
    public final void onStart(Effect effect) {
    }

    @Override // X.C0WN
    public final void LJI(Effect effect) {
        S5G.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ.getResourceId(), this.LIZLLL, "download_effect_resource_fail", "download_effect_resource", false, null, null, 896);
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJFF;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    @Override // X.C0WN
    public final void onSuccess(Effect effect) {
        S5G.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ.getResourceId(), this.LIZLLL, "download_effect_resource_success", "download_effect_resource", true, Long.valueOf(System.currentTimeMillis() - this.LJ), null, 768);
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJFF;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    public C71568S6y(RootData rootData, String str, LiveEffect liveEffect, String str2, long j, C84654XKg c84654XKg) {
        this.LIZ = rootData;
        this.LIZIZ = str;
        this.LIZJ = liveEffect;
        this.LIZLLL = str2;
        this.LJ = j;
        this.LJFF = c84654XKg;
    }
}
