package com.ss.android.ugc.aweme.shortcut;

import X.AbstractC37594EpC;
import X.C10K;
import X.C141335gf;
import X.C221108m2;
import X.C32I;
import X.C3C5;
import X.C47261Igj;
import X.C55382LoQ;
import X.C58096Mr6;
import X.C58339Mv1;
import X.C58341Mv3;
import X.C58610MzO;
import X.C58612MzQ;
import X.C61878OQg;
import X.C62822Ol8;
import X.C76800UCe;
import X.C86393XvR;
import X.EF7;
import X.InterfaceC58338Mv0;
import X.N29;
import X.N2A;
import X.N2D;
import X.N7K;
import X.N7P;
import X.ORZ;
import X.X1D;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TiktokShortcutManager implements IShortcutService, InterfaceC58338Mv0 {
    public static final /* synthetic */ int LJ = 0;
    public Class<?> LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public volatile boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> LIZJ() {
        return C47261Igj.LJJIJIIJI(N7P.class, N7K.class);
    }

    public static IShortcutService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IShortcutService.class, false);
        if (LIZ != null) {
            return (IShortcutService) LIZ;
        }
        if (C58096Mr6.R6 == null) {
            synchronized (IShortcutService.class) {
                if (C58096Mr6.R6 == null) {
                    C58096Mr6.R6 = new TiktokShortcutManager();
                }
            }
        }
        return C58096Mr6.R6;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final boolean LJII() {
        Object LIZ;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Build.VERSION ：");
            LIZ2.append(i);
            LIZ2.append(", shortcut only support Android 8.0 +");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
            return false;
        }
        try {
            LIZ = Boolean.valueOf(((ShortcutManager) EF7.LIZIZ().getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = Boolean.FALSE;
        }
        return ((Boolean) LIZ).booleanValue();
    }

    public TiktokShortcutManager() {
        Object LIZ;
        C55382LoQ LJJIZ;
        C86393XvR LJJIJIL;
        try {
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIZ = LJJJLL.LJJIZ()) != null && (LJJIJIL = LJJIZ.LJJIJIL()) != null) {
                LJJIJIL.LJJJLZIJ(new C58610MzO(this));
                LIZ = C76800UCe.LIZ;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        this.LIZIZ = C221108m2.LIZIZ(C58341Mv3.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 363));
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refreshIfNotWhenColdBoot, ");
        LIZ.append(this.LIZLLL);
        C58612MzQ.LIZ(X1D.LIZIZ(LIZ));
        if (!this.LIZLLL) {
            LJIIIIZZ("Init", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final Class<?> LIZLLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final boolean LIZIZ(String shortcutId) {
        Object LIZ;
        o.LJIIIZ(shortcutId, "shortcutId");
        boolean z = false;
        if (!LJII()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Build.VERSION ：");
            LIZ2.append(Build.VERSION.SDK_INT);
            LIZ2.append(", launcher shortcut is not supported");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
            return false;
        }
        try {
            Iterator<ShortcutInfo> it = ((ShortcutManager) EF7.LIZIZ().getSystemService(ShortcutManager.class)).getPinnedShortcuts().iterator();
            while (it.hasNext()) {
                if (o.LJ(shortcutId, it.next().getId())) {
                    z = true;
                }
            }
            LIZ = Boolean.valueOf(z);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = Boolean.FALSE;
        }
        return ((Boolean) LIZ).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJI(N2A n2a) {
        Object LIZ;
        boolean requestPinShortcut;
        if (!LJII()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Build.VERSION ：");
            LIZ2.append(Build.VERSION.SDK_INT);
            LIZ2.append(", launcher shortcut is not supported");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
            return;
        }
        try {
            Context LIZIZ = EF7.LIZIZ();
            ShortcutManager shortcutManager = (ShortcutManager) LIZIZ.getSystemService(ShortcutManager.class);
            ShortcutInfo LIZ3 = new N29(n2a).LIZ(LIZIZ, null);
            if (LIZIZ(n2a.LIZIZ)) {
                requestPinShortcut = shortcutManager.updateShortcuts(C47261Igj.LJII(LIZ3));
            } else {
                requestPinShortcut = shortcutManager.requestPinShortcut(LIZ3, null);
            }
            LIZ = Boolean.valueOf(requestPinShortcut);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJIIIZ(List<N2A> shortcuts) {
        o.LJIIIZ(shortcuts, "shortcuts");
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Build.VERSION ：");
            LIZ.append(i);
            LIZ.append(", shortcut only support Android 7.1.1 +");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        C58339Mv1 c58339Mv1 = (C58339Mv1) this.LIZIZ.getValue();
        c58339Mv1.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DynamicShortcutDataSource-> removeShortcuts: ");
        LIZ2.append(shortcuts);
        C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
        ((Set) c58339Mv1.LIZ.getValue()).removeAll(ORZ.LLJJ(shortcuts));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("removeShortcuts: ");
        LIZ3.append(shortcuts);
        String LIZIZ = X1D.LIZIZ(LIZ3);
        ArrayList arrayList = new ArrayList(C32I.LJJL(shortcuts, 10));
        Iterator<N2A> it = shortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZIZ);
        }
        LJIIJJI(LIZIZ, arrayList, false);
    }

    @Override // X.InterfaceC58338Mv0
    public final Set<N2A> LIZ(Context context, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.LIZJ.getValue()).iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((InterfaceC58338Mv0) it.next()).LIZ(context, z));
        }
        return linkedHashSet;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final List<N2A> LJ(Context context, List<N2A> list) {
        o.LJIIIZ(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Build.VERSION ：");
            LIZ.append(i);
            LIZ.append(", shortcut only support Android 7.1.1 +");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ));
            return C61878OQg.INSTANCE;
        }
        C58339Mv1 c58339Mv1 = (C58339Mv1) this.LIZIZ.getValue();
        c58339Mv1.getClass();
        ((Set) c58339Mv1.LIZ.getValue()).addAll(list);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DynamicShortcutDataSource-> addShortcuts: ");
        LIZ2.append(list);
        C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("addShortcuts :  ");
        LIZ3.append(list);
        LJIIIIZZ(X1D.LIZIZ(LIZ3), false);
        return list;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJIIIIZZ(String scene, boolean z) {
        o.LJIIIZ(scene, "scene");
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Build.VERSION ：");
            LIZ.append(i);
            LIZ.append(", shortcut only support Android 7.1.1 +");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        LJIIJJI(scene, C61878OQg.INSTANCE, z);
    }

    public final void LJIIJJI(String str, List list, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Build.VERSION ：");
            LIZ.append(i);
            LIZ.append(", shortcut only support Android 7.1.1 +");
            C58612MzQ.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        this.LIZLLL = true;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("refreshShortcuts, needRefresh: ");
        LIZ2.append(z);
        LIZ2.append(", scene : ");
        LIZ2.append(str);
        LIZ2.append(", forceRemoveShortcuts: ");
        LIZ2.append(list);
        C58612MzQ.LIZ(X1D.LIZIZ(LIZ2));
        C10K.LIZJ(new N2D(this, z, list));
    }
}
