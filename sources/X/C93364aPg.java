package X;

import X.InterfaceC191727fk;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.aPg, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93364aPg<T extends InterfaceC191727fk> implements R0O, R0G, R0E, R0R {
    public final C93390aQ6 LIZ;
    public final C93389aQ5 LIZIZ;
    public final C93389aQ5 LIZJ;
    public final List<R0A> LIZLLL;
    public InterfaceC93367aPj<T> LJ;
    public InterfaceC93351aPT<T> LJFF;
    public final C68824Qzk LJI;
    public CameraPosition LJII;
    public C93364aPg<T>.a LJIIIIZZ;
    public final java.util.Set<InterfaceC199697sb<T>> LJIIIZ;
    public final ReadWriteLock LJIIJ;
    public InterfaceC93347aPP<T> LJIIJJI;
    public InterfaceC93346aPO<T> LJIIL;

    @Override // X.R0O
    public final void LIZJ() {
        InterfaceC93351aPT<T> interfaceC93351aPT = this.LJFF;
        if (interfaceC93351aPT instanceof R0O) {
            ((R0O) interfaceC93351aPT).LIZJ();
        }
        InterfaceC93367aPj<T> interfaceC93367aPj = this.LJ;
        this.LJI.LIZJ();
        interfaceC93367aPj.LIZ();
        this.LJ.LJ();
        CameraPosition cameraPosition = this.LJII;
        if (cameraPosition == null || cameraPosition.zoom != this.LJI.LIZJ().zoom) {
            this.LJII = this.LJI.LIZJ();
            LJ();
        }
    }

    public final void LJ() {
        ((ReentrantReadWriteLock) this.LJIIJ).writeLock().lock();
        try {
            this.LJIIIIZZ.cancel(true);
            C93364aPg<T>.a aVar = new a();
            this.LJIIIIZZ = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.LJI.LIZJ().zoom));
        } finally {
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().unlock();
        }
    }

    @Override // X.R0R
    public final void LIZ() {
        LIZJ();
    }

    /* renamed from: X.aPg$a */
    /* loaded from: classes32.dex */
    public class a extends PthreadAsyncTask<Float, Void, java.util.Set<? extends InterfaceC199697sb<T>>> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Object doInBackground(Object[] objArr) {
            Float[] fArr = (Float[]) objArr;
            InterfaceC93367aPj<T> interfaceC93367aPj = C93364aPg.this.LJ;
            interfaceC93367aPj.lock();
            try {
                return interfaceC93367aPj.LJFF(fArr[0].floatValue());
            } finally {
                interfaceC93367aPj.unlock();
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) {
            C93364aPg.this.LJFF.LIZJ((java.util.Set) obj);
        }
    }

    @Override // X.R0G
    public final boolean LIZIZ(R0A r0a) {
        return this.LIZ.LIZIZ(r0a);
    }

    @Override // X.R0E
    public final void LIZLLL(R0A r0a) {
        this.LIZ.LIZLLL(r0a);
    }

    public C93364aPg(Context context, C68824Qzk c68824Qzk) {
        C93390aQ6 c93390aQ6 = new C93390aQ6(c68824Qzk);
        this.LIZLLL = new ArrayList();
        this.LJIIIZ = new HashSet();
        this.LJIIJ = new ReentrantReadWriteLock();
        this.LJI = c68824Qzk;
        this.LIZ = c93390aQ6;
        this.LIZJ = new C93389aQ5(c93390aQ6);
        this.LIZIZ = new C93389aQ5(c93390aQ6);
        this.LJFF = new C93378aPu(context, c68824Qzk, this);
        this.LJ = new C93397aQD(new C93396aQC(new C93395aQB()));
        this.LJIIIIZZ = new a();
        this.LJFF.LIZ();
    }
}
