package com.bytedance.android.livesdk.moderator;

import X.B83;
import X.BBP;
import X.BF5;
import X.BFC;
import X.BFE;
import X.BZI;
import X.C025908h;
import X.C03880Dg;
import X.C06490Nh;
import X.C0KB;
import X.C0KL;
import X.C15380j0;
import X.C17230lz;
import X.C17240m0;
import X.C1A;
import X.C1EW;
import X.C28451BEp;
import X.C28452BEq;
import X.C28787BRn;
import X.C29306Beo;
import X.C30161Gi;
import X.C32044Chs;
import X.C41071jL;
import X.C51029K0z;
import X.C5H3;
import X.C65300Pk0;
import X.C78496UrM;
import X.C78996UzQ;
import X.ORZ;
import X.OSJ;
import Y.ACListenerS25S0100000_5;
import Y.AfS17S0210000_5;
import Y.AfS4S0111000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ModeratorPermissionEditFragmentSheet extends LiveSheetFragment {
    public static final /* synthetic */ int LLIIIJ = 0;
    public BFC LLD;
    public BBP LLF;
    public boolean LLFZ;
    public boolean LLI;
    public Map<C41071jL, Integer> LLIFFJFJJ;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final long LLFF = C025908h.LIZ();
    public final String LLFFF = B83.LIZ().LIZIZ().getCurrentUser().getSecUid();
    public final C5H3 LLFII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 254));
    public final Map<C41071jL, Integer> LLII = new HashMap();
    public final C5H3 LLIIII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 253));

    public static void Ol(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-3540412808482014386")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIILZ;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C17230lz Il() {
        if (this.LLFZ) {
            return null;
        }
        C17230lz c17230lz = new C17230lz();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17240m0(C15380j0.LJIILJJIL(R.string.nop), R.style.a2z, new BF5(this)));
        c17230lz.LIZ(arrayList);
        return c17230lz;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.n3q));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        if (this.LLFZ) {
            C0KL c0kl = new C0KL();
            c0kl.LIZIZ = C15380j0.LJIILJJIL(R.string.n44);
            c0kl.LIZLLL = new ACListenerS25S0100000_5(this, 217);
            c0kb.LIZLLL = c0kl;
        }
        return c0kb;
    }

    public final void Ql() {
        if (this.LLI) {
            this.LJLZ.LJIIJ();
        } else {
            C32044Chs.LJFF(this.LJLZ.LJIIIIZZ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    public final boolean Nl(Checkable checkable) {
        boolean z;
        Map<C41071jL, Integer> map = this.LLIFFJFJJ;
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
            return C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(z), new AqS155S0100000_5(checkable, 252));
        }
        o.LJIJI("switchPermissionMap");
        throw null;
    }

    public final void Pl(BZI bzi) {
        String str;
        bzi.LJIILLIIL(C51029K0z.LJIILIIL(this));
        BFC bfc = this.LLD;
        if (bfc != null) {
            bzi.LJIJJ(String.valueOf(bfc.LIZ), "to_user_id");
            boolean z = this.LLFZ;
            if (this.LLI) {
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

    public final void Sl(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_remove_moderator_popup");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        Pl(LIZ);
        LIZ.LIZJ(str);
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OSJ osj;
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (osj = (OSJ) LJIILIIL.kv0(C28451BEp.class)) == null) {
            return;
        }
        this.LLD = (BFC) osj.getSecond();
        BBP bbp = (BBP) osj.getFirst();
        bbp.pre();
        this.LLF = bbp;
        this.LLI = ((C28452BEq) osj.getThird()).LJLIL;
        BFC bfc = this.LLD;
        if (bfc != null) {
            this.LLFZ = bfc.LJI;
        } else {
            o.LJIJI("targetUser");
            throw null;
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cwk, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    public final void Ml(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (ORZ.LJLJJI(compoundButton, ((HashMap) this.LLII).keySet())) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                C29306Beo.LJJIIJZLJL(viewLifecycleOwner, null, new BFE(this, compoundButton, null), 3);
                return;
            }
            return;
        }
        Nl(compoundButton);
    }

    public final void Tl(CompoundButton compoundButton, boolean z) {
        if (Nl(compoundButton)) {
            return;
        }
        Map<C41071jL, Integer> map = this.LLIFFJFJJ;
        if (map != null) {
            Integer num = (Integer) ((LinkedHashMap) map).get(compoundButton);
            if (num != null) {
                int intValue = num.intValue();
                AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
                boolean LJJIFFI = C29306Beo.LJJIFFI(Boolean.valueOf(z));
                BFC bfc = this.LLD;
                if (bfc != null) {
                    long j = bfc.LIZ;
                    long j2 = this.LLFF;
                    long longValue = ((Number) this.LLFII.getValue()).longValue();
                    String str = this.LLFFF;
                    BFC bfc2 = this.LLD;
                    if (bfc2 != null) {
                        C1EW.LIZ(adminApi.updateAdminPermission(intValue, LJJIFFI ? 1 : 0, j, j2, longValue, str, bfc2.LIZIZ)).LJJJLIIL(new AfS4S0111000_5(this, intValue, z, 1), new AfS17S0210000_5(compoundButton, this, z, 1));
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

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0464, code lost:
    
        if (r0.intValue() != 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0466, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x045d, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r10)) == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020f  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.LinkedHashMap, java.util.HashMap] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void Rl(int i, String str, boolean z) {
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
}
