package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C29S;
import X.C45685HwP;
import X.C45688HwS;
import X.C45693HwX;
import X.C45722Hx0;
import X.C45723Hx1;
import X.C45743HxL;
import X.C45744HxM;
import X.C73325Sq9;
import X.C73411SrX;
import X.C78605Ut7;
import X.EnumC45752HxU;
import X.InterfaceC45863HzH;
import Y.ACallableS56S0300000_7;
import Y.AfS59S0100000_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreloadMediaBitmapTask implements GenericLifecycleObserver, InterfaceC45863HzH {
    public final ActivityC45651qj LJLIL;
    public C73411SrX LJLILLLLZI;
    public C73411SrX LJLJI;
    public ArrayList<MediaModel> LJLJJI;
    public ArrayList<MediaModel> LJLJJL;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJI;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        C45688HwS.LIZ().LJLJJL.LJIIIZ();
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        if (!C78605Ut7.LIZLLL()) {
            return;
        }
        C45685HwP.LIZIZ(C16880lQ.LLLLLILLIL(this.LJLIL));
        C73325Sq9 LIZ = C45688HwS.LIZ();
        C45744HxM c45744HxM = new C45744HxM(3, 30, 0);
        C45693HwX c45693HwX = C45693HwX.LIZ;
        this.LJLILLLLZI = (C73411SrX) LIZ.LLLLZ(c45744HxM, c45693HwX).LJJJLIIL(new AfS59S0100000_7(this, 14), C45722Hx0.LJLIL);
        this.LJLJI = (C73411SrX) LIZ.LLLLZ(new C45744HxM(4, 30, 0), c45693HwX).LJJJLIIL(new AfS59S0100000_7(this, 15), C45723Hx1.LJLIL);
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P1;
    }

    public PreloadMediaBitmapTask(C29S c29s, Lifecycle lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJLIL = c29s;
        lifecycle.addObserver(this);
    }

    public final void LIZJ(C45743HxL c45743HxL, int i) {
        ArrayList<MediaModel> arrayList;
        if (i == 3) {
            this.LJLJJI = new ArrayList<>(c45743HxL.LJLILLLLZI);
        } else if (i == 4) {
            this.LJLJJL = new ArrayList<>(c45743HxL.LJLILLLLZI);
        }
        ArrayList<MediaModel> arrayList2 = this.LJLJJI;
        if (arrayList2 == null || (arrayList = this.LJLJJL) == null) {
            return;
        }
        C10K.LIZJ(new ACallableS56S0300000_7(this, arrayList2, arrayList, 2));
    }
}
