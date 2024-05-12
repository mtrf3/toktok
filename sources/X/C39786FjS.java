package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.FjS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39786FjS implements InterfaceC39779FjL {
    public final java.util.Set<String> LIZ = C77275UUl.LJII("UserUpdate");

    @Override // X.InterfaceC39779FjL
    public final void LIZ() {
    }

    @Override // X.InterfaceC39779FjL
    public final String LIZJ() {
        return "AgeGateGatekeeperTask";
    }

    @Override // X.InterfaceC39779FjL
    public final java.util.Set<String> LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC39779FjL
    public final EnumC39780FjM category() {
        return EnumC39780FjM.BLOCKING;
    }

    @Override // X.InterfaceC39779FjL
    public final boolean LJ(Bundle bundle, String signal) {
        User user;
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("user");
        if (serializable instanceof User) {
            user = (User) serializable;
        } else {
            user = null;
        }
        if (user == null || user.getAgeGateAction() == EnumC62956OnI.PASS.getValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC39779FjL
    public final void LIZLLL(String signal, Bundle bundle, C39778FjK c39778FjK) {
        User user;
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("user");
        if (!(serializable instanceof User) || (user = (User) serializable) == null) {
            return;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        a.LIZIZ().LJIIIZ(LJIIIIZZ, new C40457FuH(c39778FjK, LJIIIIZZ));
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(user.getAgeGateAction(), "age_gate_action");
        FMX.LJIIL("age_gate_need_pop", c188727au.LIZ);
    }
}
