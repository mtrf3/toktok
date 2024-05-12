package X;

import Y.IDRunnableS86S0100000_24;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZhF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class ServiceConnectionC90609ZhF extends AbstractC90097ZXp implements ServiceConnection {
    public final ComponentName LJLJLLL;
    public final ZY9 LJLL;
    public final ArrayList<ZY8> LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public ZY7 LJLLL;
    public boolean LJLLLL;
    public C90513Zfh LJLLLLLL;

    public final void LJIIZILJ() {
        int i;
        if (!this.LJLLJ) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.LJLJLLL);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 4097;
                } else {
                    i = 1;
                }
                this.LJLLJ = C16880lQ.LLLJL(this.LJLIL, intent, this, i);
            } catch (SecurityException unused) {
            }
        }
    }

    public final void LJIJI() {
        if (this.LJLLL != null) {
            LJIILL(null);
            this.LJLLLL = false;
            int size = this.LJLLI.size();
            for (int i = 0; i < size; i++) {
                ((ZY8) ListProtector.get(this.LJLLI, i)).LIZ();
            }
            ZY7 zy7 = this.LJLLL;
            zy7.LIZJ(2, 0, 0, null, null);
            zy7.LJLILLLLZI.LIZ.clear();
            zy7.LJLIL.getBinder().unlinkToDeath(zy7, 0);
            zy7.LJLJLLL.LJLL.post(new IDRunnableS86S0100000_24(zy7, 3));
            this.LJLLL = null;
        }
    }

    public final void LJIJJ() {
        if (this.LJLLILLLL && (this.LJLJJL != null || !this.LJLLI.isEmpty())) {
            LJIIZILJ();
        } else {
            if (!this.LJLLJ) {
                return;
            }
            this.LJLLJ = false;
            LJIJI();
            try {
                this.LJLIL.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Service connection ");
        LIZ.append(this.LJLJLLL.flattenToShortString());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90599Zh5 LJIIJJI(String str) {
        if (str != null) {
            C90099ZXr c90099ZXr = this.LJLJL;
            if (c90099ZXr != null) {
                List<C90089ZXh> list = c90099ZXr.LIZIZ;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((C90089ZXh) ListProtector.get(list, i)).LIZLLL().equals(str)) {
                        C90867ZlP c90867ZlP = new C90867ZlP(this, str);
                        this.LJLLI.add(c90867ZlP);
                        if (this.LJLLLL) {
                            c90867ZlP.LIZJ(this.LJLLL);
                        }
                        LJIJJ();
                        return c90867ZlP;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90096ZXo LJIIL(String str) {
        if (str != null) {
            return LJIJ(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // X.AbstractC90097ZXp
    public final void LJIILJJIL(C90524Zfs c90524Zfs) {
        Bundle bundle;
        if (this.LJLLLL) {
            ZY7 zy7 = this.LJLLL;
            int i = zy7.LJLJJI;
            zy7.LJLJJI = i + 1;
            if (c90524Zfs != null) {
                bundle = c90524Zfs.LIZ;
            } else {
                bundle = null;
            }
            zy7.LIZJ(10, i, 0, bundle, null);
        }
        LJIJJ();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        LJIJI();
    }

    public ServiceConnectionC90609ZhF(Context context, ComponentName componentName) {
        super(context, new C90095ZXn(componentName));
        this.LJLLI = new ArrayList<>();
        this.LJLJLLL = componentName;
        this.LJLL = new ZY9();
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90096ZXo LJIILIIL(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return LJIJ(str, str2);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final C90608ZhE LJIJ(String str, String str2) {
        C90099ZXr c90099ZXr = this.LJLJL;
        if (c90099ZXr != null) {
            List<C90089ZXh> list = c90099ZXr.LIZIZ;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C90089ZXh) ListProtector.get(list, i)).LIZLLL().equals(str)) {
                    C90608ZhE c90608ZhE = new C90608ZhE(this, str, str2);
                    this.LJLLI.add(c90608ZhE);
                    if (this.LJLLLL) {
                        c90608ZhE.LIZJ(this.LJLLL);
                    }
                    LJIJJ();
                    return c90608ZhE;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.LJLLJ) {
            LJIJI();
            if (iBinder != null && (messenger = new Messenger(iBinder)) != null) {
                try {
                    if (messenger.getBinder() != null) {
                        ZY7 zy7 = new ZY7(this, messenger);
                        int i = zy7.LJLJJI;
                        zy7.LJLJJI = i + 1;
                        zy7.LJLJL = i;
                        if (!zy7.LIZJ(1, i, 4, null, null)) {
                            return;
                        }
                        try {
                            zy7.LJLIL.getBinder().linkToDeath(zy7, 0);
                            this.LJLLL = zy7;
                        } catch (RemoteException unused) {
                            zy7.binderDied();
                        }
                    }
                } catch (NullPointerException unused2) {
                }
            }
        }
    }
}
