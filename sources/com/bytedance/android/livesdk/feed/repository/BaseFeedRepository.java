package com.bytedance.android.livesdk.feed.repository;

import X.BJG;
import X.BMB;
import X.BMC;
import X.C1MU;
import X.C279317t;
import X.C28635BLr;
import X.C73318Sq2;
import X.C73893SzJ;
import X.EnumC28634BLq;
import X.InterfaceC006200s;
import X.InterfaceC28629BLl;
import X.InterfaceC28631BLn;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;

/* loaded from: classes6.dex */
public abstract class BaseFeedRepository implements GenericLifecycleObserver, InterfaceC28629BLl, InterfaceC28631BLn {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final C73893SzJ<BMB> LJLILLLLZI = new C73893SzJ<>();
    public final C73893SzJ<BMB> LJLJI = new C73893SzJ<>();
    public BJG LJLJJI;
    public final BMC LJLJJL;
    public C1MU LJLJJLL;
    public final InterfaceC006200s<FeedDataKey, FeedItem> LJLJL;

    public abstract FeedDataKey LIZJ();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            registerFeedRepository();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            unRegisterFeedRepository();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unRegisterFeedRepository() {
        if (this.LJLJJL.LJFF(LIZJ(), this)) {
            FeedRepository feedRepository = (FeedRepository) this;
            feedRepository.LJLJL.LIZJ(feedRepository.LIZJ());
            C28635BLr c28635BLr = feedRepository.LJLLI;
            if (c28635BLr != null) {
                c28635BLr.LJIIJ.LIZLLL();
            }
            this.LJLIL.LIZLLL();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void registerFeedRepository() {
        if (LIZJ() == null) {
            return;
        }
        this.LJLJJL.LJ(LIZJ(), this);
    }

    public final void Rr(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public BaseFeedRepository(BMC bmc, C279317t c279317t) {
        this.LJLJJL = bmc;
        this.LJLJL = c279317t;
    }

    @Override // X.InterfaceC28631BLn
    public void LIZIZ(EnumC28634BLq enumC28634BLq, String str) {
        BJG bjg = new BJG();
        this.LJLJJI = bjg;
        bjg.LIZ = SystemClock.uptimeMillis();
        if (enumC28634BLq == EnumC28634BLq.REFRESH) {
            this.LJLILLLLZI.onNext(BMB.START);
            return;
        }
        if (enumC28634BLq != EnumC28634BLq.LOAD_MORE) {
            return;
        }
        this.LJLJI.onNext(BMB.START);
        BJG bjg2 = this.LJLJJI;
        if (bjg2 == null) {
            return;
        }
        bjg2.LIZ = SystemClock.uptimeMillis();
    }

    @Override // X.InterfaceC28631BLn
    public void LIZ(EnumC28634BLq enumC28634BLq, String str, FeedExtra feedExtra) {
        if (enumC28634BLq == EnumC28634BLq.REFRESH) {
            this.LJLILLLLZI.onNext(BMB.SUCCESS);
            BJG bjg = this.LJLJJI;
            if (bjg != null) {
                bjg.LJIIIZ("refresh");
                return;
            }
            return;
        }
        if (enumC28634BLq != EnumC28634BLq.LOAD_MORE) {
            return;
        }
        this.LJLJI.onNext(BMB.SUCCESS);
        BJG bjg2 = this.LJLJJI;
        if (bjg2 == null) {
            return;
        }
        bjg2.LJIIIZ("load_more");
    }
}
