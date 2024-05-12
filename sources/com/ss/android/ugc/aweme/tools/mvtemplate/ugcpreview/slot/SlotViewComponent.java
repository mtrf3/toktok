package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.slot;

import X.ActivityC86117Xqz;
import X.C1JI;
import X.C41877Gc5;
import X.C44051HQp;
import X.C44053HQr;
import X.C44055HQt;
import X.C44060HQy;
import X.C74275TDb;
import X.HQU;
import X.InterfaceC42472Glg;
import X.InterfaceC44054HQs;
import X.InterfaceC44061HQz;
import X.O6R;
import X.OSZ;
import Y.AObserverS75S0100000_7;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SlotViewComponent implements GenericLifecycleObserver, InterfaceC44061HQz, InterfaceC42472Glg {
    public final ViewGroup LJLIL;
    public final HQU LJLILLLLZI;
    public ActivityC86117Xqz LJLJI;
    public C44051HQp LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;

    @Override // X.InterfaceC42472Glg
    public final void LIZ() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLJLLL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LJLJLLL = true;
        this.LJLL = System.currentTimeMillis();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC42472Glg
    public final void onAppBackground() {
        MutableLiveData<Integer> mutableLiveData = this.LJLILLLLZI.LJIIIIZZ;
        mutableLiveData.setValue(mutableLiveData.getValue());
    }

    @Override // X.InterfaceC42472Glg
    public final void onAppForeground() {
        C44051HQp c44051HQp = this.LJLJJI;
        if (c44051HQp != null) {
            c44051HQp.notifyDataSetChanged();
        } else {
            o.LJIJI("templateAdapter");
            throw null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        InterfaceC44054HQs c44055HQt;
        if (this.LJLJI != null) {
            int max = Math.max(O6R.LJJIIZ(C74275TDb.LIZLLL(r0) * 0.175f), this.LJLIL.findViewById(R.id.k4z).getLayoutParams().height);
            this.LJLJJL = max;
            int paddingBottom = (max - this.LJLIL.findViewById(R.id.k4z).getPaddingBottom()) - this.LJLIL.findViewById(R.id.k4z).getPaddingTop();
            this.LJLJJLL = paddingBottom;
            this.LJLJL = (int) (paddingBottom * 0.64f);
            ViewGroup.LayoutParams layoutParams = this.LJLIL.findViewById(R.id.k4z).getLayoutParams();
            layoutParams.height = this.LJLJJL;
            this.LJLIL.findViewById(R.id.k4z).setLayoutParams(layoutParams);
            if (C1JI.LJJI()) {
                c44055HQt = new C44060HQy(this.LJLIL, this.LJLILLLLZI, new OSZ(Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJJLL)), new AqS173S0100000_7(this, 181));
            } else {
                c44055HQt = new C44055HQt(this.LJLIL);
            }
            c44055HQt.LIZ();
            C44051HQp c44051HQp = new C44051HQp(this.LJLILLLLZI, this.LJLJL + C44053HQr.LIZ, this.LJLJJLL);
            c44051HQp.LJLJJI = new AqS189S0100000_7(this, 38);
            ((RecyclerView) this.LJLIL.findViewById(R.id.k4z)).setAdapter(c44051HQp);
            c44051HQp.notifyDataSetChanged();
            this.LJLJJI = c44051HQp;
            MutableLiveData<Integer> mutableLiveData = this.LJLILLLLZI.LJIIIIZZ;
            ActivityC86117Xqz activityC86117Xqz = this.LJLJI;
            if (activityC86117Xqz != null) {
                mutableLiveData.observe(activityC86117Xqz, new AObserverS75S0100000_7(this, 64));
                C41877Gc5.LIZ.LIZLLL(this);
                return;
            } else {
                o.LJIJI("activity");
                throw null;
            }
        }
        o.LJIJI("activity");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C41877Gc5.LIZ.LJ(this);
        ActivityC86117Xqz activityC86117Xqz = this.LJLJI;
        if (activityC86117Xqz != null) {
            activityC86117Xqz.getLifecycle().removeObserver(this);
        } else {
            o.LJIJI("activity");
            throw null;
        }
    }

    @Override // X.InterfaceC44061HQz
    public final boolean LLLLJI() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC44061HQz
    public final boolean OK() {
        return this.LJLJLJ;
    }

    public SlotViewComponent(ViewGroup viewGroup, HQU hqu) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = hqu;
    }
}
