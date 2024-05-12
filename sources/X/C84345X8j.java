package X;

import java.util.concurrent.Future;

/* renamed from: X.X8j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84345X8j implements X8R<Future<?>> {
    @Override // X.X8R
    public final void LIZ(Future<?> future, X8Q x8q) {
        Object obj = future.get();
        if (x8q != null) {
            x8q.onSuccess(obj);
        }
    }
}
