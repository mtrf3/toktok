package X;

import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.1hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC40191hv extends C1CJ {
    public final /* synthetic */ MultiInstanceInvalidationService LJLIL;

    public BinderC40191hv(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.LJLIL = multiInstanceInvalidationService;
    }

    public final void LJLJI(int i, String[] strArr) {
        synchronized (this.LJLIL.LJLJI) {
            String str = this.LJLIL.LJLILLLLZI.get(Integer.valueOf(i));
            if (str == null) {
                return;
            }
            int beginBroadcast = beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    int intValue = ((Integer) getBroadcastCookie(i2)).intValue();
                    String str2 = this.LJLIL.LJLILLLLZI.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            getBroadcastItem(i2).LLLI(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                } finally {
                    finishBroadcast();
                }
            }
        }
    }

    public final int LLJI(C0BK c0bk, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.LJLIL.LJLJI) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.LJLIL;
            int i = multiInstanceInvalidationService.LJLIL + 1;
            multiInstanceInvalidationService.LJLIL = i;
            if (multiInstanceInvalidationService.LJLJI.register(c0bk, Integer.valueOf(i))) {
                this.LJLIL.LJLILLLLZI.put(Integer.valueOf(i), str);
                return i;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.LJLIL;
            multiInstanceInvalidationService2.LJLIL--;
            return 0;
        }
    }

    @Override // X.C0BL
    public final void LLJLLIL(C0BK c0bk, int i) {
        synchronized (this.LJLIL.LJLJI) {
            unregister(c0bk);
            this.LJLIL.LJLILLLLZI.remove(Integer.valueOf(i));
        }
    }
}
