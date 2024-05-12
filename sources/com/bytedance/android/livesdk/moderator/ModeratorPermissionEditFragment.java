package com.bytedance.android.livesdk.moderator;

import X.ActivityC45651qj;
import X.B83;
import X.BBP;
import X.BFC;
import X.BFF;
import X.BJ3;
import X.BZI;
import X.C03880Dg;
import X.C06490Nh;
import X.C10A;
import X.C113544cw;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1A;
import X.C1EW;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C3C5;
import X.C41071jL;
import X.C51029K0z;
import X.C5H3;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.ORZ;
import Y.AfS0S0211000_5;
import Y.AfS4S0111000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ModeratorPermissionEditFragment extends BaseFragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public BFC LJLIL;
    public BBP LJLILLLLZI;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public Map<C41071jL, Integer> LJLJLLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final long LJLJI = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
    public final String LJLJJI = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid();
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 251));
    public Map<Integer, C113544cw> LJLL = C113554cx.LJJJLIIL();
    public final C5H3 LJLLI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, LiveCoverMinSizeSetting.DEFAULT));

    public static void xl(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "3402005102159979665")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    public final void Dl() {
        BBP bbp;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            if (this.LJLJL) {
                bbp = this.LJLILLLLZI;
                if (bbp == null) {
                    o.LJIJI("lastPage");
                    throw null;
                }
            } else {
                bbp = BBP.DISMISS;
            }
            LJIILIIL.rv0(BroadcastDialogPageChannel.class, bbp);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    public final void Al(BZI bzi) {
        String str;
        bzi.LJIILLIIL(C51029K0z.LJIILIIL(this));
        BFC bfc = this.LJLIL;
        if (bfc != null) {
            bzi.LJIJJ(String.valueOf(bfc.LIZ), "to_user_id");
            boolean z = this.LJLJJLL;
            if (this.LJLJL) {
                if (z) {
                    str = "edit_button";
                } else {
                    str = "add_button";
                }
            } else if (z) {
                str = "profile_page_edit";
            } else {
                str = "profile_page_add";
            }
            bzi.LJIJJ(str, "click_position");
            return;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    public final void Il(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_remove_moderator_popup");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        Al(LIZ);
        LIZ.LIZJ(str);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final boolean wl(Checkable checkable) {
        boolean z;
        Map<C41071jL, Integer> map = this.LJLJLLL;
        if (map != null) {
            Set<C41071jL> keySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<C41071jL> it = keySet.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                C41071jL next = it.next();
                if (next.getVisibility() == 0) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Checkable) it2.next()).isChecked()) {
                        break;
                    }
                }
            }
            z = true;
            return C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(z), new AqS155S0100000_5(checkable, 249));
        }
        o.LJIJI("switchPermissionMap");
        throw null;
    }

    public final void Jl(CompoundButton compoundButton, boolean z) {
        if (wl(compoundButton)) {
            return;
        }
        Map<C41071jL, Integer> map = this.LJLJLLL;
        if (map != null) {
            Integer num = (Integer) ((LinkedHashMap) map).get(compoundButton);
            if (num != null) {
                int intValue = num.intValue();
                AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
                boolean LJJIFFI = C29306Beo.LJJIFFI(Boolean.valueOf(z));
                BFC bfc = this.LJLIL;
                if (bfc != null) {
                    long j = bfc.LIZ;
                    long j2 = this.LJLJI;
                    long longValue = ((Number) this.LJLJJL.getValue()).longValue();
                    String str = this.LJLJJI;
                    BFC bfc2 = this.LJLIL;
                    if (bfc2 != null) {
                        C1EW.LIZ(adminApi.updateAdminPermission(intValue, LJJIFFI ? 1 : 0, j, j2, longValue, str, bfc2.LIZIZ)).LJJJLIIL(new AfS4S0111000_5(this, intValue, z, 0), new AfS0S0211000_5(this, z, intValue, compoundButton, 0));
                        return;
                    } else {
                        o.LJIJI("targetUser");
                        throw null;
                    }
                }
                o.LJIJI("targetUser");
                throw null;
            }
            return;
        }
        o.LJIJI("switchPermissionMap");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0538, code lost:
    
        if (r0.intValue() != 1) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x053a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0531, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r7)) == false) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02df  */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.LinkedHashMap, java.util.HashMap] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void vl(CompoundButton compoundButton, boolean z) {
        if (z) {
            Map<C41071jL, Integer> map = this.LJLJLLL;
            if (map != null) {
                Integer num = (Integer) ((LinkedHashMap) map).get(compoundButton);
                if (ORZ.LJLJJI(num, this.LJLL.keySet())) {
                    LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                    o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                    C29306Beo.LJJIIJZLJL(viewLifecycleOwner, null, new BFF(this, num, compoundButton, null), 3);
                    return;
                }
                return;
            }
            o.LJIJI("switchPermissionMap");
            throw null;
        }
        wl(compoundButton);
    }

    public final void Gl(int i, String str, boolean z) {
        String str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_moderator_limit_popup");
        LIZ.LJIIZILJ();
        if (C29306Beo.LJJI()) {
            str2 = "live_take_page";
        } else {
            str2 = "live_take_detail";
        }
        LIZ.LJIJJ(str2, "event_page");
        LIZ.LJIJJ("profile_page_edit", "click_position");
        LIZ.LJIJJ(Integer.valueOf(i), "moderator_number");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_above_limit");
        C06490Nh.LIZLLL(LIZ, "first_profile_add_moderators", "toast_situation", str, "action_type");
    }

    public final void Hl(int i, boolean z, boolean z2) {
        String str;
        String str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_moderator_setting_click");
        Al(LIZ);
        LIZ.LJIJJ(BJ3.LIZ(i), "setting_name");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        LIZ.LJIJJ(str, "to_status");
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, "is_success");
        if (this.LJLJLJ) {
            LIZ.LJIJJ("multi_guest_panel", "event_page");
        }
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cwi, viewGroup, false);
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
