package X;

import android.content.Context;

/* renamed from: X.NnZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60425NnZ extends C60623Nql {
    public final OM1 LJ(Context context) {
        return (OM1) LIZJ(context, null);
    }

    public final OM1 LJII(Context context) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "createContainer");
        if (LIZIZ instanceof AbstractC60426Nna) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            OM1 LIZ = ((AbstractC60426Nna) LIZIZ).LIZ(context);
            c60335Nm7.get().LIZ();
            return LIZ;
        }
        return (OM1) LIZJ(context, null);
    }

    @Override // X.C60623Nql
    public final OM1 LIZ(Context context, C60630Nqs c60630Nqs) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "createContainer");
        if (LIZIZ instanceof AbstractC60426Nna) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            OM1 LIZIZ2 = ((AbstractC60426Nna) LIZIZ).LIZIZ(context, c60630Nqs);
            c60335Nm7.get().LIZ();
            return LIZIZ2;
        }
        return super.LIZ(context, c60630Nqs);
    }

    @Override // X.C60623Nql
    public final <T extends InterfaceC60409NnJ> T LIZJ(Context context, Class<T> cls) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "newContainer");
        if (LIZIZ instanceof AbstractC60426Nna) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            T t = (T) ((AbstractC60426Nna) LIZIZ).LIZLLL(context, cls);
            c60335Nm7.get().LIZ();
            return t;
        }
        return (T) super.LIZJ(context, cls);
    }

    public final OM1 LJFF(Context context, C60630Nqs c60630Nqs) {
        return super.LIZ(context, c60630Nqs);
    }

    public final OM1 LJI(Context context, Class cls) {
        return (OM1) super.LIZJ(context, cls);
    }
}
