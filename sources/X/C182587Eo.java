package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* renamed from: X.7Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182587Eo<TTaskResult> implements C10I<TTaskResult, Object> {
    public final Handler LIZ;

    public C182587Eo(WeakHandler weakHandler) {
        this.LIZ = weakHandler;
    }

    @Override // X.C10I
    public final Object then(C10K<TTaskResult> c10k) {
        Handler handler = this.LIZ;
        if (handler == null) {
            return null;
        }
        Message obtainMessage = handler.obtainMessage(0);
        if (c10k.LJIIL()) {
            obtainMessage.obj = null;
        } else if (c10k.LJIILJJIL()) {
            obtainMessage.obj = c10k.LJIIJ();
        } else {
            obtainMessage.obj = c10k.LJIIJJI();
        }
        this.LIZ.sendMessage(obtainMessage);
        return null;
    }
}
