package com.bytedance.android.livesdk.dialog;

import X.C15610jN;
import X.C29306Beo;
import X.C78279Unr;
import X.InterfaceC74834TYo;
import Y.ARunnableS49S0100000_13;
import android.app.Dialog;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AqS111S0101000_13;
import kotlin.jvm.internal.AqS40S0301000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class PriorityTaskDispatcher extends ViewModel implements InterfaceC74834TYo {
    public int LJLIL = -1;
    public final PriorityQueue<Integer> LJLILLLLZI = new PriorityQueue<>();
    public final SparseArray<C78279Unr> LJLJI = new SparseArray<>();
    public C78279Unr LJLJJI;
    public boolean LJLJJL;

    public void addDialogToManager(Dialog dialog) {
    }

    @Override // X.InterfaceC74834TYo
    public final boolean CC() {
        return this.LJLILLLLZI.contains(7);
    }

    public final void gv0() {
        int i;
        Integer poll = this.LJLILLLLZI.poll();
        if (poll != null) {
            i = poll.intValue();
        } else {
            i = -1;
        }
        C78279Unr c78279Unr = this.LJLJJI;
        if (c78279Unr != null) {
            c78279Unr.LIZ.removeObserver(c78279Unr.LIZIZ);
        }
        if (i != -1) {
            C78279Unr c78279Unr2 = this.LJLJI.get(i);
            this.LJLJJI = c78279Unr2;
            if (c78279Unr2 == null) {
                this.LJLIL = -1;
                gv0();
                return;
            } else if (c78279Unr2.LIZ.hasObservers()) {
                this.LJLJI.remove(i);
                this.LJLIL = i;
                c78279Unr2.LIZ.setValue(Integer.valueOf(i));
                return;
            } else {
                this.LJLJI.remove(i);
                this.LJLIL = -1;
                gv0();
                return;
            }
        }
        this.LJLJJL = false;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.clear();
        this.LJLJI.clear();
        this.LJLJJL = false;
        this.LJLIL = -1;
    }

    @Override // X.InterfaceC74834TYo
    public final void Vi0(boolean z) {
        if (this.LJLIL != -1) {
            this.LJLIL = -1;
            if (z) {
                C15610jN.LIZ().postDelayed(new ARunnableS49S0100000_13(this, 68), 500L);
            } else {
                gv0();
            }
        }
    }

    @Override // X.InterfaceC74834TYo
    public final void ee0(int i) {
        if (i != -1) {
            C29306Beo.LJJJ(new AqS111S0101000_13(this, i, 0));
        }
    }

    @Override // X.InterfaceC74834TYo
    public final void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (i == -1 || this.LJLILLLLZI.contains(Integer.valueOf(i))) {
            return;
        }
        C29306Beo.LJJJ(new AqS40S0301000_13(lifecycleOwner, (LifecycleOwner) observer, (Observer<Integer>) this, (PriorityTaskDispatcher) i, 0));
    }
}
