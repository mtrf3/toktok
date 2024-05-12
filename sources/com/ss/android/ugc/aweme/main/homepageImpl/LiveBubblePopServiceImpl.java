package com.ss.android.ugc.aweme.main.homepageImpl;

import X.ActivityC45651qj;
import X.C54270LRq;
import X.C55096Ljo;
import X.C55230Lly;
import X.C84763XOl;
import X.C86550Xxy;
import X.InterfaceC86533Xxh;
import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import com.ss.android.ugc.aweme.main.MainActivity;

/* loaded from: classes10.dex */
public final class LiveBubblePopServiceImpl implements ILiveBubblePopService {
    public static final int $stable = 8;
    public InterfaceC86533Xxh innerPushObserver;

    private final void getInnerPushObserver() {
        if (this.innerPushObserver == null) {
            this.innerPushObserver = new C54270LRq();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public boolean isShowingInnerPush() {
        return C86550Xxy.LIZIZ.LIZLLL(false);
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public void unregisterObserverInnerPush() {
        InterfaceC86533Xxh interfaceC86533Xxh = this.innerPushObserver;
        if (interfaceC86533Xxh != null) {
            C86550Xxy.LIZIZ.LJII(interfaceC86533Xxh);
            this.innerPushObserver = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public boolean isShowingAd() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof MainActivity) && ((MainActivity) LJIIIIZZ).isADShowing()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public boolean isShowingDialog() {
        return PopupManager.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public boolean isShowingVideoGuide() {
        try {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof MainActivity)) {
                return ((MainBusinessAbility) C55096Ljo.LIZIZ(C55230Lly.LIZLLL((ActivityC45651qj) LJIIIIZZ, null), MainBusinessAbility.class)).K0();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public void observerIsShowInnerPush() {
        getInnerPushObserver();
        InterfaceC86533Xxh interfaceC86533Xxh = this.innerPushObserver;
        if (interfaceC86533Xxh != null) {
            C86550Xxy.LIZIZ.LJIIIIZZ(interfaceC86533Xxh, null);
        }
    }

    /* renamed from: getInnerPushObserver, reason: collision with other method in class */
    public final InterfaceC86533Xxh m141getInnerPushObserver() {
        return this.innerPushObserver;
    }

    public final void setInnerPushObserver(InterfaceC86533Xxh interfaceC86533Xxh) {
        this.innerPushObserver = interfaceC86533Xxh;
    }
}
