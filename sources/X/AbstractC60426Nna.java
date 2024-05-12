package X;

import android.content.Context;

/* renamed from: X.Nna, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60426Nna extends AbstractC60536NpM<C60425NnZ> implements InterfaceC60410NnK {
    public final OM1 LIZ(Context context) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "createContainer");
        if (LIZ instanceof AbstractC60426Nna) {
            return ((AbstractC60426Nna) LIZ).LIZ(context);
        }
        return getExtendable().LJ(context);
    }

    public final OM1 LIZIZ(Context context, C60630Nqs c60630Nqs) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "createContainer");
        if (LIZ instanceof AbstractC60426Nna) {
            return ((AbstractC60426Nna) LIZ).LIZIZ(context, c60630Nqs);
        }
        return getExtendable().LJFF(context, c60630Nqs);
    }

    public final <T extends InterfaceC60409NnJ> T LIZJ(Context context, Class<T> cls) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "createContainer");
        if (LIZ instanceof AbstractC60426Nna) {
            return (T) ((AbstractC60426Nna) LIZ).LIZJ(context, cls);
        }
        return (T) getExtendable().LIZJ(context, cls);
    }

    public final <T extends InterfaceC60409NnJ> T LIZLLL(Context context, Class<T> cls) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "newContainer");
        if (LIZ instanceof AbstractC60426Nna) {
            return (T) ((AbstractC60426Nna) LIZ).LIZLLL(context, cls);
        }
        return getExtendable().LJI(context, cls);
    }
}
