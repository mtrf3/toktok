package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.NNc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59248NNc {
    public final InterfaceC59247NNb LIZ;
    public final Context LIZIZ;

    public void LIZ(boolean z) {
    }

    public abstract boolean LIZIZ();

    public AbstractC59248NNc(InterfaceC59247NNb taskContext) {
        o.LJIIIZ(taskContext, "taskContext");
        this.LIZ = taskContext;
        this.LIZIZ = taskContext.getContext();
    }
}
