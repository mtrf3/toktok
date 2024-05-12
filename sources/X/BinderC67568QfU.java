package X;

import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.QfU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class BinderC67568QfU extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC67568QfU() {
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC67569QfV abstractBinderC67569QfV = (AbstractBinderC67569QfV) this;
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() == 0) {
                obj = null;
            } else {
                obj = (Parcelable) creator.createFromParcel(parcel);
            }
            BaseBundle baseBundle = (BaseBundle) obj;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                BinderC67567QfT binderC67567QfT = (BinderC67567QfT) abstractBinderC67569QfV;
                C67574Qfa c67574Qfa = binderC67567QfT.LJLJI.LIZJ;
                C67649Qgn c67649Qgn = binderC67567QfT.LJLILLLLZI;
                synchronized (c67574Qfa.LJFF) {
                    ((HashSet) c67574Qfa.LJ).remove(c67649Qgn);
                }
                synchronized (c67574Qfa.LJFF) {
                    if (c67574Qfa.LJIIJ.get() > 0 && c67574Qfa.LJIIJ.decrementAndGet() > 0) {
                        c67574Qfa.LIZIZ.LIZ("Leaving the connection open for other ongoing calls.", new Object[0]);
                    } else {
                        c67574Qfa.LIZ().post(new C67576Qfc(c67574Qfa));
                    }
                }
                binderC67567QfT.LJLIL.LIZ("onRequestIntegrityToken", new Object[0]);
                int i3 = baseBundle.getInt("error");
                if (i3 != 0) {
                    binderC67567QfT.LJLILLLLZI.LIZJ(new ETJ(i3, null));
                    return true;
                }
                String string = baseBundle.getString("token");
                if (string == null) {
                    binderC67567QfT.LJLILLLLZI.LIZJ(new ETJ(-100, null));
                    return true;
                }
                binderC67567QfT.LJLILLLLZI.LIZLLL(new C39722FiQ(string));
                return true;
            }
            throw new BadParcelableException(KMP.LJ("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
