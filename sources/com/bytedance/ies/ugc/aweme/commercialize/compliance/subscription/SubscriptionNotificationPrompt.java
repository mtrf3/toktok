package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.GID;
import X.InterfaceC219588ja;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SubscriptionNotificationPrompt extends Fragment implements InterfaceC219588ja {
    public static TuxSheet LJLJI;
    public static SubscriptionVM LJLJJI;
    public Activity LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(GID.LJLIL);
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = false;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ae, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L17;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.onViewCreated(r7, r8)
            X.1Ss r1 = new X.1Ss
            r1.<init>()
            r0 = 2131233209(0x7f0809b9, float:1.808255E38)
            r1.LJLIL = r0
            android.app.Activity r0 = r6.LJLIL
            r5 = 0
            java.lang.String r3 = "activty"
            if (r0 == 0) goto Le5
            X.V8E r1 = r1.LIZ(r0)
            r0 = 2131376566(0x7f0a39b6, float:1.8373312E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r1)
            r0 = 2131376571(0x7f0a39bb, float:1.8373322E38)
            android.view.View r1 = r6._$_findCachedViewById(r0)
            android.app.Activity r0 = r6.LJLIL
            if (r0 == 0) goto Le1
            r2 = 2131232419(0x7f0806a3, float:1.8080947E38)
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r0, r2)
            r1.setBackground(r0)
            r0 = 2131376575(0x7f0a39bf, float:1.837333E38)
            android.view.View r1 = r6._$_findCachedViewById(r0)
            android.app.Activity r0 = r6.LJLIL
            if (r0 == 0) goto Ldd
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r0, r2)
            r1.setBackground(r0)
            r0 = 2131376579(0x7f0a39c3, float:1.8373338E38)
            android.view.View r1 = r6._$_findCachedViewById(r0)
            android.app.Activity r0 = r6.LJLIL
            if (r0 == 0) goto Ld9
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r0, r2)
            r1.setBackground(r0)
            com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription r0 = X.C41290GIk.LJ()
            if (r0 == 0) goto L6c
            java.lang.Integer r5 = r0.getStandardScheduledStartTime()
        L6c:
            r4 = 2131376572(0x7f0a39bc, float:1.8373324E38)
            if (r5 == 0) goto Lb0
            int r5 = r5.intValue()
            r0 = 2131376574(0x7f0a39be, float:1.8373328E38)
            android.view.View r2 = r6._$_findCachedViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131846187(0x7f11642b, float:1.9325816E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "getString(R.string.subsc…success_reminder_header2)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r3 = "{%s}"
            java.lang.CharSequence r0 = X.C41297GIr.LJ(r5, r1, r3)
            r2.setText(r0)
            android.view.View r2 = r6._$_findCachedViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131846190(0x7f11642e, float:1.9325822E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "getString(R.string.subsc…l_success_reminder_text2)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.CharSequence r0 = X.C41297GIr.LJ(r5, r1, r3)
            r2.setText(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lc3
        Lb0:
            r0 = 2131376573(0x7f0a39bd, float:1.8373326E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r6._$_findCachedViewById(r4)
            r0.setVisibility(r1)
        Lc3:
            r1 = 2131376565(0x7f0a39b5, float:1.837331E38)
            android.view.View r0 = r6._$_findCachedViewById(r1)
            r0.getClass()
            android.view.View r1 = r6._$_findCachedViewById(r1)
            X.SY4 r1 = (X.SY4) r1
            X.GIE r0 = X.GIE.LJLIL
            X.C16880lQ.LJJIZ(r1, r0)
            return
        Ld9:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r5
        Ldd:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r5
        Le1:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r5
        Le5:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahw, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
