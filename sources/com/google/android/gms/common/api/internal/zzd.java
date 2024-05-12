package com.google.android.gms.common.api.internal;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1HQ;
import X.FP1;
import X.HandlerC67913Ql3;
import X.InterfaceC67296Qb6;
import X.R1C;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class zzd extends Fragment implements InterfaceC67296Qb6 {
    public static final WeakHashMap<ActivityC45651qj, WeakReference<zzd>> LJLJJI = new WeakHashMap<>();
    public final Map<String, LifecycleCallback> LJLIL = Collections.synchronizedMap(new C1HQ());
    public int LJLILLLLZI = 0;
    public Bundle LJLJI;

    @Override // X.InterfaceC67296Qb6
    public final /* synthetic */ Activity N2() {
        return mo49getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI = 5;
        Iterator<LifecycleCallback> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLILLLLZI = 3;
        Iterator<LifecycleCallback> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            it.next().LJFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLILLLLZI = 2;
        Iterator<LifecycleCallback> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            it.next().LJII();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LJLILLLLZI = 4;
        Iterator<LifecycleCallback> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.LJLILLLLZI = 1;
        this.LJLJI = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.LJLIL.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.LJ(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.LJLIL.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().LJI(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // X.InterfaceC67296Qb6
    public final LifecycleCallback U(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.LJLIL.get(str));
    }

    @Override // X.InterfaceC67296Qb6
    public final void lg(String str, LifecycleCallback lifecycleCallback) {
        if (!this.LJLIL.containsKey(str)) {
            this.LJLIL.put(str, lifecycleCallback);
            if (this.LJLILLLLZI > 0) {
                new HandlerC67913Ql3(C16880lQ.LLJJJJ()).post(new R1C(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(FP1.LIZLLL(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<LifecycleCallback> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            it.next().LIZ(str, fileDescriptor, printWriter, strArr);
        }
    }
}
