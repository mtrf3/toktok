package com.ss.android.ugc.aweme.legoImp.inflate;

import X.C0RN;
import X.C16880lQ;
import X.C16950lX;
import X.C36093EEn;
import X.C40328FsC;
import X.C58096Mr6;
import X.C63144OqK;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EI0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FW4;
import X.InterfaceC36101EEv;
import Y.ARunnableS42S0100000_6;
import Y.AfS37S0101000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CActivityMain;
import com.ss.android.ugc.aweme.main.IMainPageService;
import com.ss.android.ugc.aweme.main.MainPageServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class X2CBaseInflate implements InterfaceC36101EEv {
    public boolean LJLJI;
    public int LJLIL = -1;
    public final List<SparseArray<View>> LJLILLLLZI = new ArrayList();
    public final X2CBaseInflate$inflateReleaseTask$1 LJLJJI = new EE1() { // from class: com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate$inflateReleaseTask$1
        @Override // X.EEY
        public final String key() {
            return "X2CBaseInflate$inflateReleaseTask$1";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            X2CBaseInflate x2CBaseInflate = X2CBaseInflate.this;
            x2CBaseInflate.LJLJI = true;
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(x2CBaseInflate, 157));
        }
    };

    @Override // X.InterfaceC36101EEv
    public final int LIZIZ() {
        return R.style.ul;
    }

    public abstract int[] LIZLLL();

    public boolean LJ() {
        return this instanceof X2CActivityMain;
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "inflate_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C63144OqK.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.InterfaceC36101EEv
    public final Class<? extends Activity> LIZ() {
        IMainPageService iMainPageService;
        Object LIZ = C58096Mr6.LIZ(IMainPageService.class, false);
        if (LIZ != null) {
            iMainPageService = (IMainPageService) LIZ;
        } else {
            if (C58096Mr6.D2 == null) {
                synchronized (IMainPageService.class) {
                    if (C58096Mr6.D2 == null) {
                        C58096Mr6.D2 = new MainPageServiceImpl();
                    }
                }
            }
            iMainPageService = C58096Mr6.D2;
        }
        Class<? extends Activity> mainActivityClass = iMainPageService.getMainActivityClass();
        o.LJIIIIZZ(mainActivityClass, "get().getService(IMainPa…s.java).mainActivityClass");
        return mainActivityClass;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        return EnumC36103EEx.INFLATE;
    }

    @Override // X.InterfaceC36101EEv
    public void LJFF(Activity activity, Context context) {
        if (activity != null) {
            if (this.LJLIL == -1) {
                this.LJLIL = FW4.LIZIZ;
            }
            if (this.LJLIL == 2) {
                SparseArray sparseArray = new SparseArray();
                synchronized (this.LJLILLLLZI) {
                    ((ArrayList) this.LJLILLLLZI).add(sparseArray);
                }
                Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
                while (it.hasNext()) {
                    SparseArray sparseArray2 = (SparseArray) it.next();
                    for (int i : LIZLLL()) {
                        sparseArray2.put(i, C16950lX.LIZ(activity, i, new FrameLayout(activity), false, -1));
                    }
                }
                if (LJ()) {
                    C84763XOl.LIZIZ().LJJJJZI(new AfS37S0101000_6(this, activity.hashCode(), 1));
                } else {
                    EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
                    LIZJ.LIZLLL(this.LJLJJI);
                    LIZJ.LIZJ();
                }
            }
        }
    }
}
