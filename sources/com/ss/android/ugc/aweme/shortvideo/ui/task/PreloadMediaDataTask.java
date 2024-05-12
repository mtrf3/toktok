package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C165706es;
import X.C16880lQ;
import X.C45685HwP;
import X.C45688HwS;
import X.C45693HwX;
import X.C45724Hx2;
import X.C45725Hx3;
import X.C45726Hx4;
import X.C45727Hx5;
import X.C45743HxL;
import X.C45744HxM;
import X.C47261Igj;
import X.C48331Ixz;
import X.C73325Sq9;
import X.C73411SrX;
import X.C78605Ut7;
import X.EnumC45752HxU;
import X.G8G;
import X.I0Q;
import X.InterfaceC45863HzH;
import X.WM7;
import Y.AfS59S0100000_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreloadMediaDataTask implements GenericLifecycleObserver, InterfaceC45863HzH {
    public final ActivityC45651qj LJLIL;
    public final WM7 LJLILLLLZI;
    public C73411SrX LJLJI;
    public C73411SrX LJLJJI;
    public C73411SrX LJLJJL;

    @Override // X.InterfaceC45863HzH
    public final boolean LIZ() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJJI;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        C73411SrX c73411SrX3 = this.LJLJJL;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
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
        if (e1.LIZ(31744, "creative_tools_upload_icon_cover_support_video", true, false)) {
            C45744HxM c45744HxM = new C45744HxM(3, 30, 0);
            C45693HwX c45693HwX = C45693HwX.LIZ;
            this.LJLJJL = (C73411SrX) AbstractC73672Svk.LJJLL(LIZ.LLLLZ(c45744HxM, c45693HwX), LIZ.LLLLZ(new C45744HxM(4, 30, 0), c45693HwX), I0Q.LJLIL).LJJJLIIL(new AfS59S0100000_7(this, 16), C45724Hx2.LJLIL);
        } else {
            C45744HxM c45744HxM2 = new C45744HxM(3, 30, 0);
            C45693HwX c45693HwX2 = C45693HwX.LIZ;
            this.LJLJI = (C73411SrX) LIZ.LLLLZ(c45744HxM2, c45693HwX2).LJJJLIIL(new AfS59S0100000_7(this, 17), C45725Hx3.LJLIL);
            this.LJLJJI = (C73411SrX) LIZ.LLLLZ(new C45744HxM(4, 30, 0), c45693HwX2).LJJJLIIL(C45726Hx4.LJLIL, C45727Hx5.LJLIL);
        }
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(C45743HxL c45743HxL) {
        ViewModelProvider of;
        List LJJIJIL;
        if (!c45743HxL.LJLILLLLZI.isEmpty()) {
            WM7 wm7 = this.LJLILLLLZI;
            if (wm7 != null) {
                of = C165706es.LJIIIIZZ(wm7, null, null, 6);
            } else {
                of = ViewModelProviders.of(this.LJLIL);
                o.LJIIIIZZ(of, "{\n                ViewMo…f(activity)\n            }");
            }
            FirstPhotoViewModel firstPhotoViewModel = (FirstPhotoViewModel) of.get(FirstPhotoViewModel.class);
            if (!e1.LIZ(31744, "creative_tools_upload_icon_cover_support_video", true, false)) {
                List<MediaModel> list = c45743HxL.LJLILLLLZI;
                if (list.size() < 2) {
                    LJJIJIL = C47261Igj.LJJIJIL(ListProtector.get(list, 0));
                } else {
                    LJJIJIL = C47261Igj.LJJIJIL(ListProtector.get(list, 0), ListProtector.get(list, 1));
                }
                c45743HxL = C45743HxL.L(c45743HxL, LJJIJIL);
            }
            firstPhotoViewModel.getClass();
            firstPhotoViewModel.LJLIL.setValue(c45743HxL);
        }
        if (C48331Ixz.LJ() || C48331Ixz.LIZIZ()) {
            G8G.LIZ.step("tool_performance_show_album_icon", "setFirstPhoto");
        }
    }

    public PreloadMediaDataTask(Lifecycle lifecycle, ActivityC45651qj activity, WM7 wm7) {
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = wm7;
        lifecycle.addObserver(this);
    }
}
