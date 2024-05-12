package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.ArrayList;
import java.util.List;
import v5.n;

/* loaded from: classes8.dex */
public final class HQD implements XE9 {
    public final /* synthetic */ ProgressDialogC173686rk LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ n LIZJ;
    public final /* synthetic */ ArrayList LIZLLL;

    @Override // X.XE9
    public final void LIZ(List<? extends ProviderEffect> list) {
        this.LIZ.dismiss();
        C44018HPi.LJII(1501, false);
        Bundle bundle = new Bundle();
        for (ProviderEffect providerEffect : list) {
            this.LIZLLL.add(new GreenScreenMaterial(0, 0L, 0L, providerEffect.getId(), providerEffect.getUser_name(), "", providerEffect.getPath(), "prop_reuse"));
        }
        bundle.putParcelableArrayList("green_screen_material_list", this.LIZLLL);
        this.LIZJ.LJ(bundle);
    }

    @Override // X.XE9
    public final void LIZIZ(C84418XBe c84418XBe) {
        this.LIZ.dismiss();
        C44018HPi.LJII(1501, false);
        if (this.LIZIZ) {
            this.LIZJ.LIZLLL(c84418XBe.LIZJ);
        } else {
            this.LIZJ.LJ(new Bundle());
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void onSuccess(GifProviderEffectListResponse gifProviderEffectListResponse) {
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(GifProviderEffectListResponse gifProviderEffectListResponse) {
    }

    @Override // X.XDR
    public final void onFail(GifProviderEffectListResponse gifProviderEffectListResponse, C84418XBe c84418XBe) {
        this.LIZ.dismiss();
        C44018HPi.LJII(1501, false);
        if (this.LIZIZ) {
            this.LIZJ.LIZLLL(c84418XBe.LIZJ);
        } else {
            this.LIZJ.LJ(new Bundle());
        }
    }

    public HQD(ProgressDialogC173686rk progressDialogC173686rk, boolean z, n nVar, ArrayList arrayList) {
        this.LIZ = progressDialogC173686rk;
        this.LIZIZ = z;
        this.LIZJ = nVar;
        this.LIZLLL = arrayList;
    }
}
