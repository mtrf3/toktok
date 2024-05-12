package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.util;

import X.C26059AKp;
import X.C70300RiS;
import X.InterfaceC60061Nhh;
import android.net.Uri;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ButtonActionHelper implements GenericLifecycleObserver, LifecycleObserver, InterfaceC60061Nhh {
    public final Lifecycle LJLIL;
    public C70300RiS LJLILLLLZI;
    public TuxSheet LJLJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        this.LJLILLLLZI = null;
        this.LJLIL.removeObserver(this);
        C26059AKp.LIZ().LIZIZ("ec_close_sheet", this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private final void onCreate() {
        C26059AKp.LIZ().LIZJ("ec_close_sheet", this);
    }

    public ButtonActionHelper(Lifecycle lifeCycle) {
        o.LJIIIZ(lifeCycle, "lifeCycle");
        this.LJLIL = lifeCycle;
        lifeCycle.addObserver(this);
    }

    public final String LIZ(String str) {
        if (str == null) {
            return null;
        }
        if (ujb.o.LJJJLIIL(str, "aweme", false)) {
            return str;
        }
        return new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", str).build().toString();
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        TuxSheet tuxSheet;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_close_sheet") && (tuxSheet = this.LJLJI) != null) {
            tuxSheet.dismiss();
        }
    }
}
