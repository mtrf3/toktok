package X;

import X.AbstractC008601q;
import X.C008401o;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.01q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC008601q {
    public Random LIZ = new Random();
    public final java.util.Map<Integer, String> LIZIZ = new HashMap();
    public final java.util.Map<String, Integer> LIZJ = new HashMap();
    public final java.util.Map<String, C008501p> LIZLLL = new HashMap();
    public ArrayList<String> LJ = new ArrayList<>();
    public final transient java.util.Map<String, C008401o<?>> LJFF = new HashMap();
    public final java.util.Map<String, Object> LJI = new HashMap();
    public final Bundle LJII = new Bundle();

    public abstract void LIZIZ(int i, AbstractC18470nz abstractC18470nz, Object obj);

    public final void LIZLLL(String str) {
        if (((HashMap) this.LIZJ).get(str) != null) {
            return;
        }
        int nextInt = this.LIZ.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (((HashMap) this.LIZIZ).containsKey(Integer.valueOf(i))) {
                nextInt = this.LIZ.nextInt(2147418112);
            } else {
                ((HashMap) this.LIZIZ).put(Integer.valueOf(i), str);
                ((HashMap) this.LIZJ).put(str, Integer.valueOf(i));
                return;
            }
        }
    }

    public final void LJ(String str) {
        Object remove;
        if (!this.LJ.contains(str) && (remove = ((HashMap) this.LIZJ).remove(str)) != null) {
            ((HashMap) this.LIZIZ).remove(remove);
        }
        ((HashMap) this.LJFF).remove(str);
        if (((HashMap) this.LJI).containsKey(str)) {
            ((HashMap) this.LJI).remove(str);
        }
        if (this.LJII.containsKey(str)) {
            this.LJII.remove(str);
        }
        C008501p c008501p = (C008501p) ((HashMap) this.LIZLLL).get(str);
        if (c008501p != null) {
            Iterator<LifecycleEventObserver> it = c008501p.LIZIZ.iterator();
            while (it.hasNext()) {
                c008501p.LIZ.removeObserver(it.next());
            }
            c008501p.LIZIZ.clear();
            ((HashMap) this.LIZLLL).remove(str);
        }
    }

    public final boolean LIZ(int i, int i2, Intent intent) {
        String str = (String) ((HashMap) this.LIZIZ).get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C008401o c008401o = (C008401o) ((HashMap) this.LJFF).get(str);
        if (c008401o != null && c008401o.LIZ != null && this.LJ.contains(str)) {
            c008401o.LIZ.LIZ(c008401o.LIZIZ.LIZIZ(i2, intent));
            this.LJ.remove(str);
            return true;
        }
        ((HashMap) this.LJI).remove(str);
        this.LJII.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.18J] */
    public final C18J LIZJ(final String str, LifecycleOwner lifecycleOwner, final AbstractC18470nz abstractC18470nz, final InterfaceC008201m interfaceC008201m) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            LIZLLL(str);
            C008501p c008501p = (C008501p) ((HashMap) this.LIZLLL).get(str);
            if (c008501p == null) {
                c008501p = new C008501p(lifecycle);
            }
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        Map<String, C008401o<?>> map = AbstractC008601q.this.LJFF;
                        HashMap hashMap = (HashMap) map;
                        hashMap.put(str, new C008401o(abstractC18470nz, interfaceC008201m));
                        if (((HashMap) AbstractC008601q.this.LJI).containsKey(str)) {
                            Object obj = ((HashMap) AbstractC008601q.this.LJI).get(str);
                            ((HashMap) AbstractC008601q.this.LJI).remove(str);
                            interfaceC008201m.LIZ(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) AbstractC008601q.this.LJII.getParcelable(str);
                        if (activityResult != null) {
                            AbstractC008601q.this.LJII.remove(str);
                            interfaceC008201m.LIZ(abstractC18470nz.LIZIZ(activityResult.mResultCode, activityResult.mData));
                            return;
                        }
                        return;
                    }
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ((HashMap) AbstractC008601q.this.LJFF).remove(str);
                    } else {
                        if (!Lifecycle.Event.ON_DESTROY.equals(event)) {
                            return;
                        }
                        AbstractC008601q.this.LJ(str);
                    }
                }
            };
            c008501p.LIZ.addObserver(lifecycleEventObserver);
            c008501p.LIZIZ.add(lifecycleEventObserver);
            ((HashMap) this.LIZLLL).put(str, c008501p);
            return new AbstractC008301n<Object>(this, str, abstractC18470nz) { // from class: X.18J
            };
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifecycleOwner ");
        LIZ.append(lifecycleOwner);
        LIZ.append(" is attempting to register while current state is ");
        LIZ.append(lifecycle.getCurrentState());
        LIZ.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}
