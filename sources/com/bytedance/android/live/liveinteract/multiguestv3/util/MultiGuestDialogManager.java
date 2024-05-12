package com.bytedance.android.live.liveinteract.multiguestv3.util;

import X.C78866UxK;
import X.InterfaceC75560Tl6;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.TS5;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "MULTI_GUEST_DIALOG_MANAGER")
/* loaded from: classes14.dex */
public final class MultiGuestDialogManager extends PriorityTaskDispatcher implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final LifecycleOwner LJLJJLL;
    public final List<OSZ<WeakReference<Object>, TS5>> LJLJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLinkControlWidgetDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onLinkControlWidgetDestroy() {
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            C78866UxK.LJJII((WeakReference) ((OSZ) it.next()).getFirst());
        }
        ((ArrayList) this.LJLJL).clear();
        this.LJLJJLL.getLifecycle().removeObserver(this);
    }

    public final void hv0() {
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            if (!((TS5) osz.getSecond()).LJII) {
                C78866UxK.LJJII((WeakReference) osz.getFirst());
                it.remove();
            }
        }
    }

    public MultiGuestDialogManager(LifecycleOwner lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJLJJLL = lifecycle;
        this.LJLJL = new ArrayList();
        lifecycle.getLifecycle().addObserver(this);
    }

    public final void iv0(InterfaceC88472Yns<? super TS5, Boolean> interfaceC88472Yns) {
        List<OSZ<WeakReference<Object>, TS5>> list = this.LJLJL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC88472Yns.invoke(((OSZ) next).getSecond()).booleanValue()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            C78866UxK.LJJII((WeakReference) osz.getFirst());
            ((TS5) osz.getSecond()).LJII = false;
        }
        hv0();
    }

    public final OSZ<WeakReference<Object>, TS5> jv0(Object obj) {
        Object obj2;
        Iterator<OSZ<WeakReference<Object>, TS5>> it = this.LJLJL.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            OSZ<WeakReference<Object>, TS5> next = it.next();
            WeakReference<Object> first = next.getFirst();
            if (first != null) {
                obj2 = first.get();
            }
            if (o.LJ(obj2, obj)) {
                obj2 = next;
                break;
            }
        }
        return (OSZ) obj2;
    }

    public final void kv0(Object dialog) {
        OSZ<WeakReference<Object>, TS5> osz;
        WeakReference<Object> first;
        Object obj;
        o.LJIIIZ(dialog, "dialog");
        OSZ<WeakReference<Object>, TS5> jv0 = jv0(dialog);
        if (jv0 != null && jv0.getSecond().LJIIIIZZ != 0) {
            Iterator<OSZ<WeakReference<Object>, TS5>> it = this.LJLJL.iterator();
            do {
                osz = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    osz = it.next();
                }
            } while (osz.getSecond().LIZ != jv0.getSecond().LJIIIIZZ);
            OSZ<WeakReference<Object>, TS5> osz2 = osz;
            if (osz2 != null && (first = osz2.getFirst()) != null && (obj = first.get()) != null) {
                kv0(obj);
            }
        }
    }
}
