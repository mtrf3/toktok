package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.play.core.assetpacks.d2;
import com.google.android.play.core.assetpacks.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30941Ji implements InterfaceC67935QlP, InterfaceC153055zZ {
    public Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new d2((y) ((InterfaceC153055zZ) this.LJLIL).a());
    }

    public final void LIZIZ() {
        ((ReentrantLock) this.LJLIL).lock();
    }

    public final void LIZLLL() {
        ((ReentrantLock) this.LJLIL).unlock();
    }

    public C30941Ji(int i) {
        if (i != 1) {
            if (i != 6) {
                this.LJLIL = new ReentrantLock();
            } else {
                this.LJLIL = new CopyOnWriteArrayList();
            }
        }
    }

    public final void LIZJ(InterfaceC88472Yns lambda) {
        o.LJIIIZ(lambda, "lambda");
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            lambda.invoke(it.next());
        }
    }

    public /* synthetic */ C30941Ji(Object obj) {
        this.LJLIL = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        AbstractSafeParcelable abstractSafeParcelable = (AbstractSafeParcelable) this.LJLIL;
        C67862QkE c67862QkE = (C67862QkE) interfaceC67836Qjo;
        c67862QkE.getClass();
        BinderC67944QlY binderC67944QlY = new BinderC67944QlY((C67649Qgn) obj);
        try {
            C67945QlZ c67945QlZ = (C67945QlZ) c67862QkE.LJJIIJ();
            Bundle LJJIL = c67862QkE.LJJIL();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c67945QlZ.LJLILLLLZI);
            C67943QlX.LIZIZ(obtain, abstractSafeParcelable);
            C67943QlX.LIZIZ(obtain, LJJIL);
            obtain.writeStrongBinder(binderC67944QlY);
            try {
                c67945QlZ.LJLIL.transact(14, obtain, null, 1);
                obtain.recycle();
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException unused) {
            binderC67944QlY.LLILL(Status.RESULT_INTERNAL_ERROR, false);
        }
    }
}
