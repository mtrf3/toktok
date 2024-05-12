package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ServiceConnectionC82880Wfs<INTERFACE> implements ServiceConnection {
    public final MutableLiveData<INTERFACE> LJLIL;
    public final InterfaceC82882Wfu<INTERFACE> LJLILLLLZI;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.setValue(null);
    }

    public ServiceConnectionC82880Wfs(MutableLiveData<INTERFACE> mutableLiveData, InterfaceC82882Wfu<INTERFACE> creator) {
        o.LJIIIZ(creator, "creator");
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = creator;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        this.LJLIL.setValue(this.LJLILLLLZI.LIZ(iBinder));
    }
}
