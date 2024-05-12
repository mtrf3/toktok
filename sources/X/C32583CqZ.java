package X;

import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.CqZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32583CqZ implements InterfaceC74834TYo {
    public final Queue<Integer> LJLIL = new LinkedList();
    public final C278417k<Integer, Observer<Integer>> LJLILLLLZI = new C278417k<>(10);

    @Override // X.InterfaceC74834TYo
    public final void addDialogToManager(Dialog dialog) {
    }

    @Override // X.InterfaceC74834TYo
    public final boolean CC() {
        if (this.LJLILLLLZI.get(7) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC74834TYo
    public final void Vi0(boolean z) {
        Object poll = ((LinkedList) this.LJLIL).poll();
        Observer observer = (Observer) this.LJLILLLLZI.get(poll);
        if (observer != null) {
            observer.onChanged(poll);
        }
    }

    @Override // X.InterfaceC74834TYo
    public final void ee0(int i) {
        ((LinkedList) this.LJLIL).remove(Integer.valueOf(i));
        this.LJLILLLLZI.LIZ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC74834TYo
    public final void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        boolean z;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (((LinkedList) this.LJLIL).size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLILLLLZI.get(Integer.valueOf(i)) == null) {
            this.LJLILLLLZI.put(Integer.valueOf(i), observer);
        }
        if (!z) {
            Vi0(true);
        }
    }
}
