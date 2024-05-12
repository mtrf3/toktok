package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.QiZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67759QiZ implements InterfaceC67771Qil, InterfaceC67706Qhi {
    public final Lock LJLIL;
    public final Condition LJLILLLLZI;
    public final Context LJLJI;
    public final C67258QaU LJLJJI;
    public final HandlerC67772Qim LJLJJL;
    public final java.util.Map<C67733Qi9<?>, InterfaceC67836Qjo> LJLJJLL;
    public final java.util.Map<C67733Qi9<?>, ConnectionResult> LJLJL = new HashMap();
    public final C67736QiC LJLJLJ;
    public final java.util.Map<C67718Qhu<?>, Boolean> LJLJLLL;
    public final AbstractC67715Qhr<? extends InterfaceC67779Qit, C67725Qi1> LJLL;
    public volatile InterfaceC67770Qik LJLLI;
    public int LJLLILLLL;
    public final C67756QiW LJLLJ;
    public final InterfaceC67781Qiv LJLLL;

    @Override // X.InterfaceC67771Qil
    public final void LIZJ() {
    }

    @Override // X.InterfaceC67771Qil
    public final boolean LJFF(InterfaceC67786Qj0 interfaceC67786Qj0) {
        return false;
    }

    @Override // X.InterfaceC67771Qil
    public final void LIZIZ() {
        this.LJLLI.LIZLLL();
    }

    @Override // X.InterfaceC67771Qil
    public final void LIZLLL() {
        if (this.LJLLI.LJFF()) {
            ((HashMap) this.LJLJL).clear();
        }
    }

    @Override // X.InterfaceC67771Qil
    public final boolean LJI() {
        return this.LJLLI instanceof C67758QiY;
    }

    public final void LJII() {
        this.LJLIL.lock();
        try {
            this.LJLLI = new C67760Qia(this);
            this.LJLLI.LIZJ();
            this.LJLILLLLZI.signalAll();
        } finally {
            this.LJLIL.unlock();
        }
    }

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
        this.LJLIL.lock();
        try {
            this.LJLLI.LIZ(bundle);
        } finally {
            this.LJLIL.unlock();
        }
    }

    @Override // X.InterfaceC67771Qil
    public final <A, T extends AbstractC67748QiO<? extends InterfaceC67754QiU, A>> T LIZ(T t) {
        t.LJIIJJI();
        return (T) this.LJLLI.LJI(t);
    }

    public final void LJIIIIZZ(AbstractC67782Qiw abstractC67782Qiw) {
        this.LJLJJL.sendMessage(this.LJLJJL.obtainMessage(1, abstractC67782Qiw));
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
        this.LJLIL.lock();
        try {
            this.LJLLI.LJ(i);
        } finally {
            this.LJLIL.unlock();
        }
    }

    @Override // X.InterfaceC67771Qil
    public final void LJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.LJLLI);
        for (C67718Qhu<?> c67718Qhu : this.LJLJLLL.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c67718Qhu.LIZJ).println(":");
            InterfaceC67836Qjo interfaceC67836Qjo = this.LJLJJLL.get(c67718Qhu.LIZIZ);
            QH7.LJIIIIZZ(interfaceC67836Qjo);
            interfaceC67836Qjo.LJIIZILJ(concat, printWriter);
        }
    }

    public C67759QiZ(Context context, C67756QiW c67756QiW, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, java.util.Map map, C67736QiC c67736QiC, java.util.Map map2, AbstractC67715Qhr abstractC67715Qhr, ArrayList arrayList, InterfaceC67781Qiv interfaceC67781Qiv) {
        this.LJLJI = context;
        this.LJLIL = lock;
        this.LJLJJI = googleApiAvailability;
        this.LJLJJLL = map;
        this.LJLJLJ = c67736QiC;
        this.LJLJLLL = map2;
        this.LJLL = abstractC67715Qhr;
        this.LJLLJ = c67756QiW;
        this.LJLLL = interfaceC67781Qiv;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C67766Qig) ListProtector.get(arrayList, i)).LJLJI = this;
        }
        this.LJLJJL = new HandlerC67772Qim(this, looper);
        this.LJLILLLLZI = lock.newCondition();
        this.LJLLI = new C67760Qia(this);
    }
}
