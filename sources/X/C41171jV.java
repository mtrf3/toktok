package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableUseEffectCheckCacheSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1jV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41171jV extends C1HB {
    public final List<InterfaceC08120To> LIZLLL = new ArrayList();
    public final java.util.Map<String, EffectChannelResponse> LJ = new HashMap();
    public final java.util.Map<String, LiveEffect> LJFF = new HashMap();

    @Override // X.InterfaceC08130Tp
    public final void onDestroy() {
        ((ArrayList) this.LIZIZ).clear();
        this.LIZ.removeListener();
        ((ArrayList) this.LIZLLL).clear();
        ((HashMap) this.LJ).clear();
        ((HashMap) this.LJFF).clear();
    }

    public C41171jV() {
        new HashMap();
        new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener, X.1jU] */
    @Override // X.InterfaceC08130Tp
    public final void LIZJ(final String str, final InterfaceC08120To interfaceC08120To) {
        final C1HH c1hh;
        if (((HashMap) this.LJ).containsKey(str)) {
            Iterator it = ((ArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                InterfaceC08120To interfaceC08120To2 = (InterfaceC08120To) it.next();
                if (interfaceC08120To2 != null) {
                    interfaceC08120To2.L0((EffectChannelResponse) ((HashMap) this.LJ).get(str));
                }
            }
            if (interfaceC08120To != null) {
                interfaceC08120To.L0((EffectChannelResponse) ((HashMap) this.LJ).get(str));
                return;
            }
            return;
        }
        if (this.LIZ == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (C0TY.LIZ.equals(str)) {
            c1hh = new C41141jS();
        } else if (C0TY.LIZIZ.equals(str)) {
            c1hh = new C41151jT();
        } else {
            c1hh = new C1HH();
        }
        final ?? r2 = new IFetchEffectChannelListener() { // from class: X.1jU
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                if (atomicBoolean.get()) {
                    c1hh.LJIIL(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                }
                Iterator it2 = ((ArrayList) C41171jV.this.LIZLLL).iterator();
                while (it2.hasNext()) {
                    InterfaceC08120To interfaceC08120To3 = (InterfaceC08120To) it2.next();
                    if (interfaceC08120To3 != null) {
                        interfaceC08120To3.Wj();
                    }
                }
                InterfaceC08120To interfaceC08120To4 = interfaceC08120To;
                if (interfaceC08120To4 != null) {
                    interfaceC08120To4.Wj();
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null) {
                    if (C32151Nz.LJJIIJZLJL(effectChannelResponse2.getCategoryResponseList()) && C32151Nz.LJJIIJZLJL(effectChannelResponse2.getAllCategoryEffects())) {
                        return;
                    }
                    ((HashMap) C41171jV.this.LJ).put(str, effectChannelResponse2);
                    if (atomicBoolean.get()) {
                        c1hh.LJIILIIL();
                    }
                    Iterator it2 = ((ArrayList) C41171jV.this.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        InterfaceC08120To interfaceC08120To3 = (InterfaceC08120To) it2.next();
                        if (interfaceC08120To3 != null) {
                            interfaceC08120To3.L0((EffectChannelResponse) ((HashMap) C41171jV.this.LJ).get(str));
                        }
                    }
                    InterfaceC08120To interfaceC08120To4 = interfaceC08120To;
                    if (interfaceC08120To4 == null) {
                        return;
                    }
                    interfaceC08120To4.L0((EffectChannelResponse) ((HashMap) C41171jV.this.LJ).get(str));
                }
            }
        };
        c1hh.LIZ = SystemClock.uptimeMillis();
        C15380j0.LIZLLL();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                if (LiveEnableUseEffectCheckCacheSetting.INSTANCE.enable()) {
                    this.LIZ.checkedEffectListUpdate(str, new ICheckChannelListener() { // from class: X.1HE
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                        public final void checkChannelFailed(ExceptionResult exceptionResult) {
                            C41171jV.this.LIZLLL(atomicBoolean, str, r2, true);
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                        public final void checkChannelSuccess(boolean z) {
                            C41171jV.this.LIZLLL(atomicBoolean, str, r2, z);
                        }
                    });
                    return;
                } else {
                    LIZLLL(atomicBoolean, str, r2, true);
                    return;
                }
            }
        } catch (Exception unused) {
        }
        LIZLLL(atomicBoolean, str, r2, false);
    }

    public final void LIZLLL(AtomicBoolean atomicBoolean, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
        atomicBoolean.set(z);
        if (z) {
            this.LIZ.fetchEffectList(str, false, iFetchEffectChannelListener);
        } else {
            atomicBoolean.set(false);
            this.LIZ.fetchEffectListFromCache(str, iFetchEffectChannelListener);
        }
    }
}
