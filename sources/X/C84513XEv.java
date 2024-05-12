package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XEv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84513XEv implements C57D {
    public final C170876nD LIZ;
    public final C170796n5 LIZIZ;
    public InterfaceC84517XEz<C1288653y> LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 838));

    @Override // X.C57D
    public final void LIZJ() {
    }

    @Override // X.C57D
    public final ArrayList LJII() {
        return new ArrayList();
    }

    @Override // X.C57D
    public final C170876nD getResourceConfig() {
        return this.LIZ;
    }

    public C84513XEv(C170876nD c170876nD) {
        this.LIZ = c170876nD;
        this.LIZIZ = new C170796n5(c170876nD);
    }

    @Override // X.C57D
    public final boolean LIZ(String str) {
        EffectManager effectManager;
        XCT effectPlatform;
        Effect LIZ = C84286X6c.LIZ(str);
        if (LIZ == null || (effectManager = (EffectManager) this.LIZIZ.LIZ.getValue()) == null || (effectPlatform = effectManager.getEffectPlatform()) == null || !effectPlatform.LJIIL(LIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.C57D
    public final ArrayList<ResourceItem> LJ(List<? extends QZV> list) {
        return AnonymousClass391.LJ(list, "canvasList");
    }

    @Override // X.C57D
    public final void LJFF(String panel) {
        o.LJIIIZ(panel, "panel");
        InterfaceC84517XEz<C1288653y> interfaceC84517XEz = this.LIZJ;
        if (interfaceC84517XEz != null) {
            interfaceC84517XEz.onStart();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C84286X6c.LIZIZ;
        if (concurrentHashMap.containsKey(panel) && concurrentHashMap.get(panel) != null) {
            List list = (List) concurrentHashMap.get(panel);
            InterfaceC84517XEz<C1288653y> interfaceC84517XEz2 = this.LIZJ;
            if (interfaceC84517XEz2 != null) {
                interfaceC84517XEz2.onSuccess(C1296657a.LIZ(list));
                return;
            }
            return;
        }
        C84499XEh.LJI((XDU) this.LIZLLL.getValue(), panel, false, "", 0, 0, 0, CardStruct.IStatusCode.DEFAULT, false, false, new C84515XEx(panel, this), false, false, 0);
    }

    @Override // X.C57D
    public final void LJIIIIZZ(C57E c57e) {
        this.LIZJ = c57e;
    }

    @Override // X.C57D
    public final void LIZLLL(XF0 xf0, String str) {
        XCT effectPlatform;
        Effect LIZ = C84286X6c.LIZ(str);
        if (LIZ == null) {
            xf0.LJI(str, new C57M(new IllegalStateException("AVEEffectPlatform#fetchEffect, effect is not exist effectListCache."), -1));
            return;
        }
        EffectManager effectManager = (EffectManager) this.LIZIZ.LIZ.getValue();
        if (effectManager == null || (effectPlatform = effectManager.getEffectPlatform()) == null) {
            return;
        }
        effectPlatform.LJIIJ().LIZLLL(LIZ, false, new C84516XEy(xf0, str));
    }

    @Override // X.C57D
    public final void LIZIZ(String panel, String category, AnonymousClass575 anonymousClass575) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(category, "category");
        anonymousClass575.onStart();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(panel);
        LIZ.append(category);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C84286X6c.LIZIZ(LIZIZ)) {
            anonymousClass575.onSuccess(C1296657a.LIZIZ((List) ((ConcurrentHashMap) C84286X6c.LIZ).get(LIZIZ)));
        } else {
            C84499XEh.LIZLLL(0, 0, 0, new C84512XEu(LIZIZ, anonymousClass575), (XDU) this.LIZLLL.getValue(), panel, category, CardStruct.IStatusCode.DEFAULT, null, false);
        }
    }

    @Override // X.C57D
    public final void LJI(String panel, boolean z, C57A c57a) {
        o.LJIIIZ(panel, "panel");
        c57a.onStart();
        if (C84286X6c.LIZIZ(panel)) {
            c57a.onSuccess(C1296657a.LIZIZ((List) ((ConcurrentHashMap) C84286X6c.LIZ).get(panel)));
        } else {
            ((XDU) this.LIZLLL.getValue()).LJI(panel, z, new C84514XEw(panel, c57a));
        }
    }
}
