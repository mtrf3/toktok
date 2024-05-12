package com.google.android.play.core.assetpacks;

import X.AbstractC40557Fvt;
import X.C13T;
import X.C16880lQ;
import X.InterfaceC38408F5o;
import X.RunnableC40649FxN;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class t extends AbstractC40557Fvt<AssetPackState> {
    public final c1 LJI;
    public final n0 LJII;
    public final InterfaceC38408F5o<s2> LJIIIIZZ;
    public final h0 LJIIIZ;
    public final q0 LJIIJ;
    public final InterfaceC38408F5o<Executor> LJIIJJI;
    public final InterfaceC38408F5o<Executor> LJIIL;
    public final Handler LJIILIIL;

    public t(Context context, c1 c1Var, n0 n0Var, InterfaceC38408F5o<s2> interfaceC38408F5o, q0 q0Var, h0 h0Var, InterfaceC38408F5o<Executor> interfaceC38408F5o2, InterfaceC38408F5o<Executor> interfaceC38408F5o3) {
        super(new C13T("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.LJIILIIL = new Handler(C16880lQ.LLJJJJ());
        this.LJI = c1Var;
        this.LJII = n0Var;
        this.LJIIIIZZ = interfaceC38408F5o;
        this.LJIIJ = q0Var;
        this.LJIIIZ = h0Var;
        this.LJIIJJI = interfaceC38408F5o2;
        this.LJIIL = interfaceC38408F5o3;
    }

    @Override // X.AbstractC40557Fvt
    public final void LIZ(Context context, Intent intent) {
        final Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (LJJLIIIIJ != null) {
            ArrayList<String> stringArrayList = LJJLIIIIJ.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.LIZ.LIZJ("Corrupt bundle received from broadcast.", 6, new Object[0]);
                return;
            }
            d0 LIZLLL = AssetPackState.LIZLLL(LJJLIIIIJ, (String) ListProtector.get(stringArrayList, 0), this.LJIIJ, new v() { // from class: com.google.android.play.core.assetpacks.u
                @Override // com.google.android.play.core.assetpacks.v
                public final int a(int i) {
                    return i;
                }
            });
            this.LIZ.LIZJ("ListenerRegistryBroadcastReceiver.onReceive: %s", 3, new Object[]{LIZLLL});
            if (LJJLIIIIJ.getParcelable("confirmation_intent") != null) {
                this.LJIIIZ.getClass();
            }
            this.LJIIL.a().execute(new RunnableC40649FxN(this, LJJLIIIIJ, LIZLLL));
            this.LJIIJJI.a().execute(new Runnable(this, LJJLIIIIJ) { // from class: com.google.android.play.core.assetpacks.s
                public final t LJLIL;
                public final Bundle LJLILLLLZI;

                {
                    this.LJLIL = this;
                    this.LJLILLLLZI = LJJLIIIIJ;
                }

                public final void LIZ() {
                    t tVar = this.LJLIL;
                    Bundle bundle = this.LJLILLLLZI;
                    c1 c1Var = tVar.LJI;
                    c1Var.getClass();
                    if (((Boolean) c1Var.LIZIZ(new s0(c1Var, bundle))).booleanValue()) {
                        n0 n0Var = tVar.LJII;
                        n0Var.getClass();
                        C13T c13t = n0.LJIIIZ;
                        c13t.LIZJ("Run extractor loop", 3, new Object[0]);
                        if (!n0Var.LJIIIIZZ.compareAndSet(false, true)) {
                            c13t.LIZJ("runLoop already looping; return", 5, new Object[0]);
                            return;
                        }
                        while (true) {
                            try {
                                d1 LIZ = n0Var.LJII.LIZ();
                                if (LIZ == null) {
                                    break;
                                }
                                try {
                                    if (LIZ instanceof k0) {
                                        n0Var.LIZIZ.LIZ((k0) LIZ);
                                    } else if (LIZ instanceof c2) {
                                        n0Var.LIZJ.LIZ((c2) LIZ);
                                    } else if (LIZ instanceof o1) {
                                        n0Var.LIZLLL.LIZ((o1) LIZ);
                                    } else if (LIZ instanceof q1) {
                                        n0Var.LJ.LIZ((q1) LIZ);
                                    } else if (LIZ instanceof w1) {
                                        n0Var.LJFF.LIZ((w1) LIZ);
                                    } else {
                                        n0.LJIIIZ.LIZJ("Unknown task type: %s", 6, new Object[]{LIZ.getClass().getName()});
                                    }
                                } catch (Exception e) {
                                    n0.LJIIIZ.LIZJ("Error during extraction task: %s", 6, new Object[]{e.getMessage()});
                                    n0Var.LJI.a().LIZIZ(LIZ.LIZ);
                                    n0Var.LIZ(LIZ.LIZ, e);
                                }
                            } catch (m0 e2) {
                                n0.LJIIIZ.LIZJ("Error while getting next extraction task: %s", 6, new Object[]{e2.getMessage()});
                                if (e2.LJLIL >= 0) {
                                    n0Var.LJI.a().LIZIZ(e2.LJLIL);
                                    n0Var.LIZ(e2.LJLIL, e2);
                                }
                            }
                        }
                        n0Var.LJIIIIZZ.set(false);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        this.LIZ.LIZJ("Empty bundle received from broadcast.", 6, new Object[0]);
    }
}
