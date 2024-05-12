package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.C2068389v;
import X.C25848ACm;
import X.C25849ACn;
import X.C32151Nz;
import X.C44384HbQ;
import X.FMX;
import X.O6R;
import X.OSZ;
import Y.ACListenerS28S0100000_8;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PipSettingUnit extends C25849ACn {
    public final Fragment LJLJJL;
    public final IPipFeedService LJLJJLL;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        String string = this.LJLJJL.getString(R.string.jmj);
        o.LJIIIIZZ(string, "fragment.getString(R.string.pip_off_btn)");
        String string2 = this.LJLJJL.getString(R.string.jmm);
        o.LJIIIIZZ(string2, "fragment.getString(R.str…_settings_piptoggle_desc)");
        IPipFeedService LJJII = PipServiceImpl.LJJII();
        IPipFeedService LJJII2 = PipServiceImpl.LJJII();
        Context context = this.LJLJJL.getContext();
        if (context == null || !this.LJLJJLL.LJIL(context)) {
            LJJII2.LJIILL(false);
        }
        boolean LJIIZILJ = LJJII.LJIIZILJ();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c2068389v.LIZ = R.raw.icon_rectangle_rectangle_fill_1_ltr;
        return new C25848ACm(LJIIZILJ, string, new ACListenerS28S0100000_8(this, 37), false, null, null, c2068389v, string2, false, false, false, null, 64248);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    public final void LJIILIIL() {
        String str;
        LJIIL();
        this.LJLJJLL.LJIILL(LJFF().LJZI);
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("settings_page", "enter_from");
        if (LJFF().LJZI) {
            str = "on";
        } else {
            str = "off";
        }
        oszArr[1] = new OSZ(str, "to_status");
        FMX.LJIILL("change_floating_window_status", oszArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipSettingUnit(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = fragment;
        this.LJLJJLL = PipServiceImpl.LJJII();
        fragment.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.setting.page.accessibility.PipSettingUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                PipSettingUnit pipSettingUnit = PipSettingUnit.this;
                pipSettingUnit.getClass();
                IPipFeedService LJJII = PipServiceImpl.LJJII();
                Context context = pipSettingUnit.LJLJJL.getContext();
                if (context == null || !pipSettingUnit.LJLJJLL.LJIL(context)) {
                    LJJII.LJIILL(false);
                }
                if (!PipServiceImpl.LJJII().LJIIZILJ()) {
                    C44384HbQ.LLIIZ(PipSettingUnit.this.LJFF(), false);
                }
            }
        });
    }
}
