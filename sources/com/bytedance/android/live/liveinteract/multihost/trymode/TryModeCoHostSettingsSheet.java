package com.bytedance.android.live.liveinteract.multihost.trymode;

import X.C011602u;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C30161Gi;
import X.C75642TmQ;
import X.C78496UrM;
import Y.ACListenerS33S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TryModeCoHostSettingsSheet extends LiveSheetFragment {
    public C011602u LLD;
    public C011602u LLF;
    public C011602u LLFF;
    public C011602u LLFFF;
    public C011602u LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.o1w));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d4x, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C29306Beo.LJJJJLI(C15380j0.LIZ(541.0f), view.findViewById(R.id.bg3));
        View findViewById = view.findViewById(R.id.kwz);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.s…allow_apply_from_friends)");
        this.LLD = (C011602u) findViewById;
        View findViewById2 = view.findViewById(R.id.kx1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.s…low_apply_from_suggested)");
        this.LLFF = (C011602u) findViewById2;
        View findViewById3 = view.findViewById(R.id.kx3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.s…_be_invited_from_friends)");
        this.LLF = (C011602u) findViewById3;
        View findViewById4 = view.findViewById(R.id.kx5);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.s…e_invited_from_suggested)");
        this.LLFFF = (C011602u) findViewById4;
        View findViewById5 = view.findViewById(R.id.kx7);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.s…allow_live_notifications)");
        this.LLFII = (C011602u) findViewById5;
        C011602u c011602u = this.LLD;
        if (c011602u != null) {
            c011602u.setChecked(true);
            C011602u c011602u2 = this.LLFF;
            if (c011602u2 != null) {
                c011602u2.setChecked(true);
                C011602u c011602u3 = this.LLF;
                if (c011602u3 != null) {
                    c011602u3.setChecked(true);
                    C011602u c011602u4 = this.LLFFF;
                    if (c011602u4 != null) {
                        c011602u4.setChecked(true);
                        C011602u c011602u5 = this.LLFII;
                        if (c011602u5 != null) {
                            c011602u5.setChecked(true);
                            C75642TmQ.LJJJ(true, true, true, true);
                            View findViewById6 = view.findViewById(R.id.kx0);
                            if (findViewById6 != null) {
                                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 45), findViewById6);
                            }
                            View findViewById7 = view.findViewById(R.id.kx2);
                            if (findViewById7 != null) {
                                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 46), findViewById7);
                            }
                            View findViewById8 = view.findViewById(R.id.kx4);
                            if (findViewById8 != null) {
                                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 47), findViewById8);
                            }
                            View findViewById9 = view.findViewById(R.id.kx6);
                            if (findViewById9 != null) {
                                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 48), findViewById9);
                            }
                            View findViewById10 = view.findViewById(R.id.kx8);
                            if (findViewById10 != null) {
                                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 49), findViewById10);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("mSwitchAllowLiveMultiHostNotifications");
                        throw null;
                    }
                    o.LJIJI("mSwitchReceiveNotFriendMultiHostInvites");
                    throw null;
                }
                o.LJIJI("mSwitchReceiveFriendMultiHostInvite");
                throw null;
            }
            o.LJIJI("mSwitchReceiveNotFriendMultiHostApplication");
            throw null;
        }
        o.LJIJI("mSwitchReceiveFriendMultiHostApplication");
        throw null;
    }
}
