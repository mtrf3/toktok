package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.FxD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ServiceConnectionC40639FxD implements ServiceConnection {
    public final MutableLiveData<InterfaceC40638FxC> LJLIL;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    public ServiceConnectionC40639FxD(MutableLiveData<InterfaceC40638FxC> mutableLiveData) {
        this.LJLIL = mutableLiveData;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.setValue(null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        LiveData liveData = this.LJLIL;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC40638FxC)) {
            queryLocalInterface = new C40635Fx9(iBinder);
        }
        liveData.setValue(queryLocalInterface);
        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: X.FxE
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                ServiceConnectionC40639FxD this$0 = ServiceConnectionC40639FxD.this;
                o.LJIIIZ(this$0, "this$0");
                this$0.LJLIL.setValue(null);
            }
        }, 0);
    }
}
