package com.ss.android.ugc.aweme.recommend;

import X.AA1;
import X.AA2;
import X.ActivityC45651qj;
import X.C1E4;
import X.C221108m2;
import X.C25778A9u;
import X.C57778Mly;
import X.C62822Ol8;
import X.C77241UTd;
import X.C77242UTe;
import X.C78627UtT;
import X.C78628UtU;
import X.C78631UtX;
import X.C78634Uta;
import X.C78636Utc;
import X.EnumC25783A9z;
import X.EnumC57876MnY;
import X.IWF;
import X.InterfaceC25781A9x;
import X.InterfaceC55055Lj9;
import X.InterfaceC78626UtS;
import X.M43;
import X.M44;
import Y.AObserverS81S0100000_13;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS16S1400000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RecUserPopupInMainActivityController implements InterfaceC55055Lj9, LifecycleEventObserver {
    public static final Map<M43, RecUserPopupInMainActivityController> LJLJJL = new LinkedHashMap();
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C77241UTd.LJLIL);
    public static final C62822Ol8 LJLJL = C221108m2.LIZIZ(C77242UTe.LJLIL);
    public static final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C78628UtU.LJLIL);
    public static final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C78627UtT.LJLIL);
    public static boolean LJLL;
    public final ActivityC45651qj LJLIL;
    public final M43 LJLILLLLZI;
    public final Aweme LJLJI;
    public final RecUserInMainActivityViewModel LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:52:0x0126 A[ADDED_TO_REGION] */
    @Override // X.InterfaceC55055Lj9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController.LIZ():boolean");
    }

    @Override // X.InterfaceC55055Lj9
    public final boolean LIZIZ() {
        return this.LJLJJI.LJLIL;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            ((LinkedHashMap) LJLJJL).clear();
            source.getLifecycle().removeObserver(this);
        }
    }

    public RecUserPopupInMainActivityController(ActivityC45651qj fragmentActivity, M43 sceneType, Aweme aweme, RecUserInMainActivityViewModel viewModel) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(sceneType, "sceneType");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = fragmentActivity;
        this.LJLILLLLZI = sceneType;
        this.LJLJI = aweme;
        this.LJLJJI = viewModel;
        fragmentActivity.getLifecycle().addObserver(this);
        int i = M44.LIZ[sceneType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            viewModel.LJLJL.observe(fragmentActivity, new AObserverS81S0100000_13(this, 69));
        } else {
            viewModel.LJLJJI.observe(fragmentActivity, new AObserverS81S0100000_13(this, 66));
            viewModel.LJLJJLL.observe(fragmentActivity, new AObserverS81S0100000_13(this, 67));
            viewModel.LJLJJL.observe(fragmentActivity, new AObserverS81S0100000_13(this, 68));
        }
    }

    public final void LIZJ(InterfaceC25781A9x interfaceC25781A9x, InterfaceC78626UtS interfaceC78626UtS, ActivityC45651qj activityC45651qj, EnumC57876MnY scene, String str) {
        this.LJLJJI.getClass();
        o.LJIIIZ(scene, "scene");
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", "auto_pop_up");
        bundle.putSerializable("maf_scene_key", scene);
        interfaceC25781A9x.LJIILL(bundle, activityC45651qj);
        if (interfaceC78626UtS != null) {
            interfaceC25781A9x.LJIILJJIL(interfaceC78626UtS);
        }
        interfaceC25781A9x.LJIILLIIL();
        interfaceC25781A9x.LJIILIIL(new AqS117S0300000_13(this, scene, interfaceC78626UtS, 2));
        interfaceC25781A9x.LJIJ(new AqS163S0100000_13(this, 249));
    }

    public final void LIZLLL(InterfaceC25781A9x interfaceC25781A9x, InterfaceC78626UtS interfaceC78626UtS, ActivityC45651qj activityC45651qj, EnumC57876MnY scene, String enterFrom) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        int i;
        EnumC57876MnY enumC57876MnY = EnumC57876MnY.FYP_POPUP;
        if (scene == enumC57876MnY && !Hox.LJLLI.LIZ(activityC45651qj).wv0("For You")) {
            if (interfaceC78626UtS != null) {
                interfaceC78626UtS.Hs0(new C78631UtX(1));
            }
            M43 m432 = this.LJLILLLLZI;
            interfaceC25781A9x.destroy();
            LJLJJL.remove(m432);
            return;
        }
        if (this.LJLJJI.LJLJLLL || C1E4.LJIJJLI()) {
            if (interfaceC78626UtS != null) {
                interfaceC78626UtS.cancel();
            }
            M43 m433 = this.LJLILLLLZI;
            interfaceC25781A9x.destroy();
            LJLJJL.remove(m433);
            return;
        }
        RecUserInMainActivityViewModel recUserInMainActivityViewModel = this.LJLJJI;
        recUserInMainActivityViewModel.getClass();
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(enterFrom, "enterFrom");
        C78636Utc gv0 = recUserInMainActivityViewModel.gv0();
        if (!gv0.LIZJ) {
            gv0.LIZJ = true;
            gv0.LIZ = 0L;
            gv0.LIZLLL = System.currentTimeMillis();
        }
        AA1.LIZ().LIZ.erase("show_rec_user_pop_up_in_fyp");
        if (scene == enumC57876MnY) {
            IWF.LJJLIIIIJ().LJIILJJIL();
            recUserInMainActivityViewModel.LJLIL = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        EnumC25783A9z enumC25783A9z = EnumC25783A9z.AUTO;
        long j = AA1.LIZ().LIZ.getLong("dialog_last_shown_timestamp", 0L);
        if (j == 0 || (valueOf = Long.valueOf(j)) == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(currentTimeMillis - valueOf.longValue());
        }
        long j2 = AA1.LIZ().LIZ.getLong("dialog_last_negative_feedback_timestamp", 0L);
        if (j2 == 0 || (valueOf3 = Long.valueOf(j2)) == null) {
            valueOf4 = null;
        } else {
            valueOf4 = Long.valueOf(currentTimeMillis - valueOf3.longValue());
        }
        new AA2(enterFrom, enumC25783A9z, valueOf2, valueOf4).LIZLLL(null);
        AA1.LIZ().LIZ.storeLong("dialog_last_shown_timestamp", System.currentTimeMillis());
        this.LJLJJI.LJLJLLL = true;
        C57778Mly LIZ = interfaceC25781A9x.LIZ();
        if (LIZ != null) {
            i = LIZ.LIZ();
        } else {
            i = 0;
        }
        if (interfaceC78626UtS != null) {
            interfaceC78626UtS.Hs0(new C78634Uta(i));
        }
        PopupManager.LJIIL(new C25778A9u(activityC45651qj, interfaceC25781A9x, enterFrom, this.LJLJI, new AqS163S0100000_13(interfaceC78626UtS, LiveCoverMinSizeSetting.DEFAULT), new AqS16S1400000_13(interfaceC78626UtS, this, scene, enterFrom, interfaceC25781A9x, 1)));
    }
}
