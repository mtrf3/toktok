package X;

import Y.AfS66S0100000_14;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Wem, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82812Wem implements TJJ {
    public final /* synthetic */ C82811Wel LIZ;

    public C82812Wem(C82811Wel c82811Wel) {
        this.LIZ = c82811Wel;
    }

    @Override // X.TJJ
    public final AbstractC73672Svk<CategoryEffectModel> LIZIZ(TJI request) {
        o.LJIIIZ(request, "request");
        C82811Wel c82811Wel = this.LIZ;
        return c82811Wel.LJ.LJIL(new AfS66S0100000_14(c82811Wel, 43));
    }
}
