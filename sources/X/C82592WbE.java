package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.WbE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82592WbE implements InterfaceC82603WbP {
    public final /* synthetic */ Effect LIZ;
    public final /* synthetic */ C82585Wb7 LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.InterfaceC82603WbP
    public final void onSuccess(Effect effect) {
        String str;
        String LJIJJLI;
        String str2 = null;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.LIZ.getEffectId())) {
            C10K.LIZIZ(new CallableC82591WbD(effect, this.LIZIZ, this.LIZJ, this.LIZ), C10K.LJIIIIZZ, null);
            C82585Wb7 c82585Wb7 = this.LIZIZ;
            c82585Wb7.getClass();
            String str3 = "";
            if (effect == null) {
                LJIJJLI = null;
            } else {
                String effectId = effect.getEffectId();
                if (effectId != null) {
                    str3 = effectId;
                }
                LJIJJLI = g0.LJIJJLI(effect);
                str2 = effect.getUnzipPath();
            }
            c82585Wb7.LJLLLLLL(str3, LJIJJLI, str2);
        }
    }

    @Override // X.InterfaceC82603WbP
    public final void onFail(Effect effect, ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.LIZ.getEffectId())) {
            C10K.LIZIZ(new CallableC82595WbH(this.LIZIZ, this.LIZJ), C10K.LJIIIIZZ, null);
        }
    }

    public C82592WbE(Effect effect, C82585Wb7 c82585Wb7, int i) {
        this.LIZ = effect;
        this.LIZIZ = c82585Wb7;
        this.LIZJ = i;
    }
}
