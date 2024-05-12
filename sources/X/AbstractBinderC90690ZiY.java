package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.ZiY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90690ZiY extends BinderC90358ZdC implements InterfaceC90412Ze4 {
    public AbstractBinderC90690ZiY() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC90240ZbI interfaceC90240ZbI = null;
        Bundle bundle = null;
        int i2 = 0;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof InterfaceC90240ZbI) {
                        interfaceC90240ZbI = (InterfaceC90240ZbI) queryLocalInterface;
                    } else {
                        interfaceC90240ZbI = new C90659Zi3(readStrongBinder);
                    }
                }
                BinderC90889Zll binderC90889Zll = (BinderC90889Zll) this;
                C90101ZXt LIZIZ = C90101ZXt.LIZIZ(bundle2);
                if (!((HashMap) binderC90889Zll.LJLILLLLZI).containsKey(LIZIZ)) {
                    ((HashMap) binderC90889Zll.LJLILLLLZI).put(LIZIZ, new HashSet());
                }
                ((java.util.Set) ((HashMap) binderC90889Zll.LJLILLLLZI).get(LIZIZ)).add(new C90665Zi9(interfaceC90240ZbI));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR);
                final int readInt = parcel.readInt();
                final BinderC90889Zll binderC90889Zll2 = (BinderC90889Zll) this;
                final C90101ZXt LIZIZ2 = C90101ZXt.LIZIZ(bundle3);
                if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                    binderC90889Zll2.LLJJIII(LIZIZ2, readInt);
                } else {
                    new HandlerC90301ZcH(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: X.Zbp
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                BinderC90889Zll binderC90889Zll3 = BinderC90889Zll.this;
                                C90101ZXt c90101ZXt = LIZIZ2;
                                int i3 = readInt;
                                synchronized (binderC90889Zll3.LJLILLLLZI) {
                                    binderC90889Zll3.LLJJIII(c90101ZXt, i3);
                                }
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                }
                parcel2.writeNoException();
                return true;
            case 3:
                final BinderC90889Zll binderC90889Zll3 = (BinderC90889Zll) this;
                final C90101ZXt LIZIZ3 = C90101ZXt.LIZIZ((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                    binderC90889Zll3.LLZZJLIL(LIZIZ3);
                } else {
                    new HandlerC90301ZcH(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: X.Zbe
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                BinderC90889Zll.this.LLZZJLIL(LIZIZ3);
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle4 = (Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                ZY5 zy5 = ((BinderC90889Zll) this).LJLIL;
                C90101ZXt LIZIZ4 = C90101ZXt.LIZIZ(bundle4);
                zy5.getClass();
                boolean LJFF = ZY5.LJFF(LIZIZ4, readInt2);
                parcel2.writeNoException();
                parcel2.writeInt(LJFF ? 1 : 0);
                return true;
            case 5:
                String readString = parcel.readString();
                BinderC90889Zll binderC90889Zll4 = (BinderC90889Zll) this;
                binderC90889Zll4.LJLIL.getClass();
                ZY5.LIZIZ();
                Iterator<ZY4> it = ZY5.LIZJ.LJ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ZY4 next = it.next();
                        if (next.LIZJ.equals(readString)) {
                            binderC90889Zll4.LJLIL.getClass();
                            ZY5.LIZIZ();
                            ZY5.LIZJ.LJIIIIZZ(next, 3);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                ((BinderC90889Zll) this).LJLIL.getClass();
                ZY5.LIZIZ();
                ZY4 zy4 = ZY5.LIZJ.LJIILJJIL;
                if (zy4 != null) {
                    ZY5.LIZIZ();
                    ZY5.LIZJ.LJIIIIZZ(zy4, 3);
                    parcel2.writeNoException();
                    return true;
                }
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            case 7:
                BinderC90889Zll binderC90889Zll5 = (BinderC90889Zll) this;
                binderC90889Zll5.LJLIL.getClass();
                ZY5.LIZIZ();
                ZY4 zy42 = ZY5.LIZJ.LJIILJJIL;
                if (zy42 != null) {
                    binderC90889Zll5.LJLIL.getClass();
                    if (ZY5.LJ().LIZJ.equals(zy42.LIZJ)) {
                        i2 = 1;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i2);
                    return true;
                }
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            case 8:
                String readString2 = parcel.readString();
                ((BinderC90889Zll) this).LJLIL.getClass();
                ZY5.LIZIZ();
                Iterator<ZY4> it2 = ZY5.LIZJ.LJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ZY4 next2 = it2.next();
                        if (next2.LIZJ.equals(readString2)) {
                            bundle = next2.LJIIZILJ;
                        }
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                }
                return true;
            case 9:
                ((BinderC90889Zll) this).LJLIL.getClass();
                String str = ZY5.LJ().LIZJ;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                BinderC90889Zll binderC90889Zll6 = (BinderC90889Zll) this;
                Iterator it3 = ((HashMap) binderC90889Zll6.LJLILLLLZI).values().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((java.util.Set) it3.next()).iterator();
                    while (it4.hasNext()) {
                        binderC90889Zll6.LJLIL.LJI((AbstractC90102ZXu) it4.next());
                    }
                }
                ((HashMap) binderC90889Zll6.LJLILLLLZI).clear();
                parcel2.writeNoException();
                return true;
            case 12:
                BinderC90889Zll binderC90889Zll7 = (BinderC90889Zll) this;
                binderC90889Zll7.LJLIL.getClass();
                ZY5.LIZIZ();
                ZY4 zy43 = ZY5.LIZJ.LJIILL;
                if (zy43 != null) {
                    binderC90889Zll7.LJLIL.getClass();
                    if (ZY5.LJ().LIZJ.equals(zy43.LIZJ)) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                int readInt3 = parcel.readInt();
                ((BinderC90889Zll) this).LJLIL.getClass();
                ZY5.LJII(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
