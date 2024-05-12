package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;

/* loaded from: classes16.dex */
public abstract class XEC implements ICheckChannelListener {
    public final ICheckChannelListener LIZ;

    public XEC(ICheckChannelListener iCheckChannelListener) {
        this.LIZ = iCheckChannelListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        this.LIZ.checkChannelFailed(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        this.LIZ.checkChannelSuccess(z);
    }
}
