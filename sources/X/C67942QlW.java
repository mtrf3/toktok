package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.QlW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67942QlW implements InterfaceC67935QlP {
    public Object LJLIL;

    public C67942QlW(int i) {
        if (i != 5) {
            return;
        }
        this.LJLIL = new CopyOnWriteArrayList();
    }

    public /* synthetic */ C67942QlW(InterfaceC68016Qmi interfaceC68016Qmi) {
        QH7.LJIIIZ(interfaceC68016Qmi, "delegate");
        this.LJLIL = interfaceC68016Qmi;
    }

    public /* synthetic */ C67942QlW(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        AbstractSafeParcelable abstractSafeParcelable = (AbstractSafeParcelable) this.LJLIL;
        C67862QkE c67862QkE = (C67862QkE) interfaceC67836Qjo;
        Bundle LJJIL = c67862QkE.LJJIL();
        LJJIL.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        BinderC67941QlV binderC67941QlV = new BinderC67941QlV((C67649Qgn) obj);
        try {
            C67945QlZ c67945QlZ = (C67945QlZ) c67862QkE.LJJIIJ();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c67945QlZ.LJLILLLLZI);
            C67943QlX.LIZIZ(obtain, abstractSafeParcelable);
            C67943QlX.LIZIZ(obtain, LJJIL);
            obtain.writeStrongBinder(binderC67941QlV);
            try {
                c67945QlZ.LJLIL.transact(19, obtain, null, 1);
                obtain.recycle();
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException unused) {
            binderC67941QlV.LLIILZL(Status.RESULT_INTERNAL_ERROR, null);
        }
    }

    public final void LIZIZ(InterfaceC47232IgG interfaceC47232IgG, IU3 iu3) {
        for (InterfaceC47232IgG interfaceC47232IgG2 : (List) this.LJLIL) {
            if (!interfaceC47232IgG2.equals(interfaceC47232IgG)) {
                interfaceC47232IgG2.LIZJ(iu3);
            }
        }
    }
}
