package com.bytedance.assem.arch.reused;

import X.C16880lQ;
import X.C187187Wg;
import X.C221108m2;
import X.C3C8;
import X.C5H3;
import X.EnumC221088m0;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class ReusedUIContentAssem<RECEIVER extends C3C8> extends ReusedUIAssem<RECEIVER> {
    public int LJLZ;
    public int LJZ;
    public final C5H3 LJZI = C221108m2.LIZ(EnumC221088m0.NONE, C187187Wg.INSTANCE);

    public void W3() {
    }

    public void X3() {
    }

    public void Y3() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public void E3() {
        if (this.LJLLJ != null) {
            getContainerView().setVisibility(8);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onCreateView() {
        View view;
        if (this.LJLLJ != null) {
            M3(getContainerView());
            N3(getContainerView());
            return;
        }
        if (this.LJLZ != 0 && (view = getSupervisor().LJLLL) != null) {
            View findViewById = view.findViewById(this.LJLZ);
            if (findViewById != null) {
                if (findViewById instanceof ViewStub) {
                    int i = this.LJZ;
                    if (i != 0) {
                        ((ViewStub) findViewById).setLayoutResource(i);
                    }
                    View inflate = ((ViewStub) findViewById).inflate();
                    o.LJIIIIZZ(inflate, "contentView.inflate()");
                    setContainerView(inflate);
                    M3(getContainerView());
                    N3(getContainerView());
                    return;
                }
                setContainerView(findViewById);
                M3(findViewById);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("can not find view for ");
            LIZ.append(this);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalStateException(LIZIZ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onDestroy() {
        W3();
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            super.onDestroy();
        } else {
            ((Handler) this.LJZI.getValue()).post(new ARunnableS39S0100000_3(this, 14));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onPause() {
        X3();
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            super.onPause();
        } else {
            ((Handler) this.LJZI.getValue()).post(new ARunnableS39S0100000_3(this, 15));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onResume() {
        Y3();
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            super.onResume();
        } else {
            ((Handler) this.LJZI.getValue()).post(new ARunnableS39S0100000_3(this, 16));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onStart() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            super.onStart();
        } else {
            ((Handler) this.LJZI.getValue()).post(new ARunnableS39S0100000_3(this, 17));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onStop() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            super.onStop();
        } else {
            ((Handler) this.LJZI.getValue()).post(new ARunnableS39S0100000_3(this, 18));
        }
    }
}
