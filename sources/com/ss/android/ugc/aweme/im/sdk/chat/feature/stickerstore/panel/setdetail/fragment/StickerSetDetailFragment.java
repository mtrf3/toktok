package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment;

import X.ASQ;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71572rR;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C87393br;
import X.C88123d2;
import X.C88133d3;
import X.C88143d4;
import X.C88963eO;
import X.C8VV;
import X.C90903hW;
import X.C91023hi;
import X.C9BD;
import X.C9BE;
import X.EnumC87003bE;
import X.InterfaceC25830ABu;
import X.InterfaceC65350Pko;
import X.InterfaceC71602rU;
import X.InterfaceC90983he;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS0S2101100_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetDetailFragment extends BaseFragment implements InterfaceC71602rU, InterfaceC25830ABu {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C214298b3 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final List<InterfaceC90983he> LJLIL = new ArrayList();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C88143d4.LJLIL);

    static {
        new C88123d2();
    }

    @Override // X.InterfaceC71602rU
    public final void Cs0(StickerSetInfo info) {
        o.LJIIIZ(info, "info");
    }

    @Override // X.InterfaceC71602rU
    public final void Ge() {
    }

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.InterfaceC71602rU
    public final void hi(List<StickerSetInfo> list) {
    }

    public StickerSetDetailFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 258);
        C88133d3 c88133d3 = C88133d3.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c88133d3, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c88133d3, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        this.LJLJL = -1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C71572rR.LJII.LJIJ(this);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLJJI) {
            this.LJLJJI = false;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                C87393br.LJI(String.valueOf(mo49getActivity.hashCode()));
                return;
            }
            return;
        }
        if (!this.LJLJJL) {
            return;
        }
        this.LJLJJL = false;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 == null) {
            return;
        }
        C87393br.LJI(String.valueOf(mo49getActivity2.hashCode()));
    }

    @Override // X.InterfaceC71602rU
    public final void kI(StickerSetInfo stickerSetInfo) {
        ASQ.LJ(this, C91023hi.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(new AqS173S0100000_7(this, 71));
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC90983he) it.next()).D2(f);
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC90983he) it.next()).LJJJLZIJ(i);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C71572rR.LJII.LIZ(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong("sticker_set_id");
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                int i = arguments2.getInt("content_type");
                this.LJLJL = i;
                Bundle arguments3 = getArguments();
                String str2 = null;
                if (arguments3 != null) {
                    str = arguments3.getString("uid");
                } else {
                    str = null;
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    str2 = arguments4.getString("conversation_id");
                }
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    z = arguments5.getBoolean("is_from_message");
                } else {
                    z = false;
                }
                this.LJLJJLL = z;
                C252709vu c252709vu = (C252709vu) view.findViewById(R.id.kji);
                c252709vu.findViewById(R.id.gwu).getLayoutParams().height = C7MY.LIZIZ(44);
                C235119Kp c235119Kp = new C235119Kp();
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_flag;
                LIZJ.LIZLLL = true;
                LIZJ.LIZIZ(new AqS151S0100000_1(this, 924));
                c235119Kp.LIZIZ(LIZJ);
                if (this.LJLJL == EnumC87003bE.STICKER_STORE.getType() && !this.LJLJJLL) {
                    C234529Ii LIZJ2 = s1.LIZJ();
                    LIZJ2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                    LIZJ2.LIZLLL = true;
                    LIZJ2.LIZIZ(new AqS151S0100000_1(this, 923));
                    c235119Kp.LIZLLL(LIZJ2);
                }
                c252709vu.setNavActions(c235119Kp);
                C8VV.LIZ(this, false, new AqS0S2101100_1(i, j, this, str, str2, 0));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        if (C88963eO.LJFF()) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2d, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2c, viewGroup, false);
        }
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
