package X;

import X.InterfaceC31336CRo;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.CXt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31497CXt<T extends InterfaceC31336CRo> extends BY9<T> {
    public DataChannel dataChannel;
    public IMessageManager mMessageManager;
    public C62705OjF transformer;

    public <D> InterfaceC73684Svw<D> activityAutoDispose() {
        return C73933Szx.LJ((LifecycleOwner) ((InterfaceC31336CRo) this.mView).getContext());
    }

    public <D> InterfaceC73684Svw<D> activityAutoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C62705OjF();
        }
        LifecycleOwner lifeLifecycleOwner = getLifeLifecycleOwner();
        if (lifeLifecycleOwner == null) {
            return null;
        }
        return C73933Szx.LIZ(C73931Szv.LIZIZ(lifeLifecycleOwner, Lifecycle.Event.ON_DESTROY), this.transformer);
    }

    public <D> InterfaceC73684Svw<D> autoDispose() {
        return C73933Szx.LJ((LifecycleOwner) this.mView);
    }

    public <D> InterfaceC73684Svw<D> autoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C62705OjF();
        }
        return C73933Szx.LIZ(C73931Szv.LIZIZ((LifecycleOwner) this.mView, Lifecycle.Event.ON_DESTROY), this.transformer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BY9
    public void detachView() {
        IMessageManager iMessageManager;
        if ((this instanceof OnMessageListener) && (iMessageManager = this.mMessageManager) != null) {
            iMessageManager.removeMessageListener((OnMessageListener) this);
        }
        this.dataChannel = null;
        super.detachView();
    }

    public LifecycleOwner getLifeLifecycleOwner() {
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
        if (interfaceC31336CRo == null) {
            return null;
        }
        Object context = interfaceC31336CRo.getContext();
        if (context instanceof LifecycleOwner) {
            return (LifecycleOwner) context;
        }
        if (context instanceof ContextWrapper) {
            Object baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof LifecycleOwner) {
                return (LifecycleOwner) baseContext;
            }
        }
        return null;
    }

    public String getLogTag() {
        return getClass().getName();
    }

    @Override // X.BY9
    public void attachView(T t) {
        super.attachView((AbstractC31497CXt<T>) t);
        if (t != null) {
            DataChannel provideDataChannel = t.provideDataChannel();
            this.dataChannel = provideDataChannel;
            if (provideDataChannel != null) {
                this.mMessageManager = (IMessageManager) provideDataChannel.kv0(C29927Bop.class);
            }
        }
    }

    public final void logThrowable(Throwable th) {
        C0NB.LJIIJ(6, getLogTag(), th.getStackTrace());
    }
}
