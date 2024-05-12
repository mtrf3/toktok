package com.bytedance.android.live.broadcast.interruption;

import X.ActivityC45651qj;
import X.AnonymousClass130;
import X.C15N;
import X.C1O1;
import X.C22940vC;
import X.C28998BZq;
import X.C29306Beo;
import X.C38951fv;
import X.C47071t1;
import X.C86881Y7x;
import X.CFX;
import X.EnumC266912z;
import X.InterfaceC30405BwX;
import X.InterfaceC30442Bx8;
import Y.IDCListenerS135S0100000;
import Y.IDcS169S0100000;
import android.content.DialogInterface;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.interruption.InterruptPreviewGuideDialog;
import com.bytedance.android.live.design.app.LiveDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class InterruptPreviewGuideDialog implements GenericLifecycleObserver, InterfaceC30405BwX {
    public LiveDialog LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public C22940vC LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        Boolean bool;
        LiveDialog liveDialog = this.LJLIL;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && C1O1.LJIIJ()) {
            C22940vC c22940vC = this.LJLJI;
            if (c22940vC != null) {
                c22940vC.LIZLLL(EnumC266912z.SETTING_POPUP, AnonymousClass130.BEFORE_LIVE);
            }
            dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r1.booleanValue() != false) goto L9;
     */
    @Override // X.InterfaceC30405BwX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIJ() {
        /*
            r4 = this;
            X.1qj r0 = r4.LJLILLLLZI
            r3 = 0
            if (r0 != 0) goto L6
            return r3
        L6:
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.U0
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "GAME_LIVE_LAST_INTERRUPTION_GUIDE_NO_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            r2 = 1
            if (r0 != 0) goto L2d
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.V0
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "GAME_LIVE_INTERRUPTION_GUIDE_NO_SHOW.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L3c
        L2d:
            com.bytedance.android.livesdk.livesetting.game.InterruptGuidelinesSettingV2 r0 = com.bytedance.android.livesdk.livesetting.game.InterruptGuidelinesSettingV2.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L3c
            boolean r0 = X.C1O1.LJIIIIZZ()
            if (r0 == 0) goto L3c
            return r2
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.interruption.InterruptPreviewGuideDialog.LJJLIIJ():boolean");
    }

    @Override // X.InterfaceC30405BwX
    public final void dismiss() {
        LiveDialog liveDialog = this.LJLIL;
        if (liveDialog != null) {
            liveDialog.dismiss();
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC30405BwX
    public final LiveDialog getDialog() {
        Boolean bool;
        int i;
        String str = null;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        LiveDialog liveDialog = this.LJLIL;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return this.LJLIL;
        }
        if (this.LJLJI == null) {
            this.LJLJI = new C22940vC();
        }
        Boolean LIZJ = InterfaceC30442Bx8.V0.LIZJ();
        o.LJIIIIZZ(LIZJ, "GAME_LIVE_INTERRUPTION_GUIDE_NO_SHOW.value");
        if (LIZJ.booleanValue()) {
            i = R.string.nzi;
        } else {
            i = R.string.nzm;
        }
        C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
        c47071t1.LIZLLL(new C28998BZq(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "game_live_interrupt_dialog_image.png"));
        c47071t1.LJIILLIIL(i);
        String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_samsung_LIVE_disconnected_last_time_text");
        if (LIZ == null) {
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            if (activityC45651qj != null) {
                str = activityC45651qj.getString(R.string.nzl);
            }
        } else {
            str = LIZ;
        }
        c47071t1.LJII(str);
        c47071t1.LJIIL(R.string.nzj, new IDcS169S0100000(this, 5));
        c47071t1.LJIIIZ(R.string.nzk, new IDcS169S0100000(this, 6));
        c47071t1.LJIILLIIL = new DialogInterface.OnShowListener() { // from class: X.0JK
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                InterruptPreviewGuideDialog.this.getClass();
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.U0;
                Boolean bool2 = Boolean.FALSE;
                c48459J0d.LIZ(bool2);
                InterfaceC30442Bx8.V0.LIZ(bool2);
                C22940vC c22940vC = InterruptPreviewGuideDialog.this.LJLJI;
                if (c22940vC != null) {
                    c22940vC.LJFF(EnumC266912z.SETTING_POPUP, null, AnonymousClass130.BEFORE_LIVE);
                }
            }
        };
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ2 = c47071t1.LIZ();
        this.LJLIL = LIZ2;
        C15N c15n = new C15N();
        c15n.LIZ(R.string.nzo, this.LJLILLLLZI);
        c15n.LIZIZ = new IDCListenerS135S0100000(this, 92);
        LIZ2.LJJ(new C38951fv(c15n));
        return this.LJLIL;
    }

    public InterruptPreviewGuideDialog(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLILLLLZI = fragment.mo49getActivity();
    }
}
