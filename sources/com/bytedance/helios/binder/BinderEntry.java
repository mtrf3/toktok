package com.bytedance.helios.binder;

import X.C16880lQ;
import X.C65852Psu;
import X.C66059PwF;
import X.C66063PwJ;
import X.PQ4;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.helios.api.consumer.ApmEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class BinderEntry {
    public static final BinderEntry LIZIZ = new BinderEntry();
    public static final long LIZJ;
    public final List<PQ4> LIZ = new CopyOnWriteArrayList();

    public static native void nativeInit();

    public static native void reserved0();

    public static native void reserved1();

    static {
        int i;
        C16880lQ.LLJJJIL("helios_bm");
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken("com.bytedance.helios.binder");
                i = 0;
                obtain.setDataPosition(0);
                do {
                    if (obtain.readInt() == 27) {
                        obtain.setDataPosition(obtain.dataPosition() - 4);
                        if ("com.bytedance.helios.binder".equals(obtain.readString())) {
                            break;
                        }
                    }
                    i++;
                } while (i < 20);
            } finally {
                obtain.recycle();
            }
        } catch (Throwable unused) {
            C66063PwJ.LIZ("BinderEntry", "get offset exception", null);
        }
        obtain.recycle();
        i = -1;
        long j = i;
        LIZJ = j;
        ApmEvent apmEvent = new ApmEvent("helios_token_offset");
        apmEvent.LIZJ(Long.valueOf(j), "token_offset");
        C66059PwF.LIZIZ(apmEvent);
    }

    public final void LIZ(PQ4 pq4) {
        if (!((CopyOnWriteArrayList) this.LIZ).contains(pq4)) {
            ((CopyOnWriteArrayList) this.LIZ).add(pq4);
        }
        nativeInit();
    }

    public static boolean beforeTransact(Object obj, int i, Parcel parcel, Parcel parcel2) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        String interfaceDescriptor;
        try {
            copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ.LIZ;
        } catch (Throwable th) {
            C66059PwF.LIZIZ(new C65852Psu(C16880lQ.LLLLIIIILLL(), th, "BinderEntry", (Map<String, String>) null, false));
        }
        if (copyOnWriteArrayList.isEmpty() || !(obj instanceof IBinder)) {
            return false;
        }
        IBinder iBinder = (IBinder) obj;
        if (LIZJ >= 0) {
            parcel.setDataPosition(0);
            for (int i2 = 0; i2 < LIZJ; i2++) {
                parcel.readInt();
            }
            interfaceDescriptor = parcel.readString();
            parcel.setDataPosition(0);
        } else {
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        }
        if (TextUtils.isEmpty(interfaceDescriptor)) {
            return false;
        }
        System.currentTimeMillis();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((PQ4) it.next()).LIZ(interfaceDescriptor, i, parcel, parcel2)) {
                return true;
            }
        }
        return false;
    }
}
