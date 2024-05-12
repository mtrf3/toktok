package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83259Wlz extends AbstractC83313Wmr<Effect, C76800UCe> {
    public C83259Wlz() {
        super(0);
    }

    @Override // X.AbstractC83313Wmr
    public final AbstractC83312Wmq<Effect, C76800UCe> LIZ(Effect effect, String taskID) {
        Effect param = effect;
        o.LJIIIZ(param, "param");
        o.LJIIIZ(taskID, "taskID");
        return new C83296Wma(param, taskID);
    }
}
