package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.fragment;

import X.AbstractC82553Lv;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C162476Zf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C91363iG;
import X.C91373iH;
import X.C91633ih;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC219588ja;
import X.InterfaceC65350Pko;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupMemberSelectFragment extends AmeBaseFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C214298b3 LJLIL;
    public C91633ih LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public GroupMemberSelectFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 642);
        C91373iH c91373iH = C91373iH.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c91373iH, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c91373iH, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C9KF c9kf;
        C91633ih c91633ih = this.LJLILLLLZI;
        if (c91633ih != null) {
            int i = C91363iG.LIZ[c91633ih.getEntry().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c9kf = new C9KF();
                    String string = getString(R.string.guy);
                    o.LJIIIIZZ(string, "getString(R.string.group_chat_16_add_member)");
                    c9kf.LIZJ = string;
                } else {
                    throw new C162476Zf();
                }
            } else {
                c9kf = new C9KF();
                String string2 = getString(R.string.dym);
                o.LJIIIIZZ(string2, "getString(R.string.create_chat_header)");
                c9kf.LIZJ = string2;
            }
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS151S0100000_1(this, 641));
            c235119Kp.LIZIZ(LIZJ);
            return c235119Kp;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("init_config");
        } else {
            serializable = null;
        }
        C91633ih c91633ih = (C91633ih) serializable;
        if (c91633ih == null) {
            c91633ih = new C91633ih(null, null, null, null, null, false, 63, null);
        }
        this.LJLILLLLZI = c91633ih;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((AbstractC82553Lv) ((ContactListViewModel) this.LJLIL.getValue()).LJLJJLL.getValue()).LIZLLL();
        C8VV.LIZ(this, false, new AqS167S0100000_1(this, 173));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1v, viewGroup, false);
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
