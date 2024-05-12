package com.ss.android.ugc.aweme.im.sdk.privacy.ui.fragment;

import X.ASQ;
import X.AbstractC92543kA;
import X.ActivityC45651qj;
import X.C04270Et;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1HQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C4DK;
import X.C61878OQg;
import X.C62822Ol8;
import X.C76800UCe;
import X.C772831o;
import X.C85323Wm;
import X.C90903hW;
import X.C92523k8;
import X.C92613kH;
import X.C92643kK;
import X.HXX;
import X.InterfaceC73459SsJ;
import X.SY4;
import X.X1D;
import Y.AObserverS69S0100000_1;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessagingPrivacyFragment extends Fragment implements View.OnClickListener {
    public C92523k8 LJLIL;
    public RecyclerView LJLILLLLZI;
    public SY4 LJLJI;
    public SY4 LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 656));

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SY4 sy4 = this.LJLJI;
        if (sy4 != null) {
            if (o.LJ(view, sy4)) {
                final MessagingPrivacyViewModel messagingPrivacyViewModel = (MessagingPrivacyViewModel) this.LJLJL.getValue();
                final PrivacySettingsRestrictionOption value = messagingPrivacyViewModel.LJLL.getValue();
                if (value != null) {
                    messagingPrivacyViewModel.LJLLJ.LIZ(messagingPrivacyViewModel.LJLIL.setChatAuthority(value.getValue()).LJJIIJ(messagingPrivacyViewModel.LJLJJI).LJIJJ(messagingPrivacyViewModel.LJLJI).LJJ(new InterfaceC73459SsJ() { // from class: X.3kC
                        @Override // X.InterfaceC73459SsJ
                        public final void accept(Object obj, Object obj2) {
                            if (obj != null) {
                                MessagingPrivacyViewModel messagingPrivacyViewModel2 = MessagingPrivacyViewModel.this;
                                PrivacySettingsRestrictionOption privacySettingsRestrictionOption = value;
                                messagingPrivacyViewModel2.LJLLI.setValue(privacySettingsRestrictionOption);
                                messagingPrivacyViewModel2.gv0(true);
                                messagingPrivacyViewModel2.LJLILLLLZI.getImChatSettingsService().LJ(privacySettingsRestrictionOption.getValue());
                            }
                        }
                    }));
                    return;
                }
                return;
            }
            SY4 sy42 = this.LJLJJI;
            if (sy42 != null) {
                if (!o.LJ(view, sy42)) {
                    return;
                }
                ((MessagingPrivacyViewModel) this.LJLJL.getValue()).gv0(false);
                C92523k8 c92523k8 = this.LJLIL;
                if (c92523k8 == null) {
                    return;
                }
                ASQ.LJ(c92523k8.LIZ, new AbstractC92543kA() { // from class: X.3kB
                });
                TuxSheet tuxSheet = c92523k8.LIZIZ.element;
                if (tuxSheet == null) {
                    return;
                }
                tuxSheet.dismissAllowingStateLoss();
                return;
            }
            o.LJIJI("cancelButton");
            throw null;
        }
        o.LJIJI("okButton");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? r4;
        String str;
        int i;
        int i2;
        String str2;
        List<PrivacySettingsRestrictionOption> values;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("chat_set_extra");
        }
        IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
        o.LJIIIIZZ(LJIIIIZZ, "get()\n            .getSe…ivacyService::class.java)");
        boolean z = false;
        PrivacySettingsRestrictionItem LIZJ = LJIIIIZZ.LIZJ(0, "chatsets");
        View findViewById = view.findViewById(R.id.dmn);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.f…ent_privacy_header_title)");
        this.LJLJJL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dml);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.f…ment_privacy_header_desc)");
        this.LJLJJLL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.axo);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.btn_ok)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = view.findViewById(R.id.axl);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.btn_not_now)");
        this.LJLJJI = (SY4) findViewById4;
        View findViewById5 = view.findViewById(R.id.hce);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.options_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.LJLILLLLZI = recyclerView;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        if (LIZJ != null && (values = LIZJ.getValues()) != null) {
            r4 = new ArrayList();
            for (PrivacySettingsRestrictionOption privacySettingsRestrictionOption : values) {
                if (privacySettingsRestrictionOption.getShowType() != 2) {
                    r4.add(privacySettingsRestrictionOption);
                }
            }
        } else {
            r4 = C61878OQg.INSTANCE;
        }
        MessagingPrivacyViewModel messagingPrivacyViewModel = (MessagingPrivacyViewModel) this.LJLJL.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = r4.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((PrivacySettingsRestrictionOption) next).getValue() == 1) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it2 = r4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((PrivacySettingsRestrictionOption) next2).getValue() == 4) {
                if (next2 != null) {
                    arrayList.add(next2);
                }
            }
        }
        Iterator it3 = r4.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((PrivacySettingsRestrictionOption) next3).getValue() == 2) {
                if (next3 != null) {
                    arrayList.add(next3);
                }
            }
        }
        Iterator it4 = r4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next4 = it4.next();
            if (((PrivacySettingsRestrictionOption) next4).getValue() == 3) {
                if (next4 != null) {
                    arrayList.add(next4);
                }
            }
        }
        recyclerView.setAdapter(new C92643kK(messagingPrivacyViewModel, arrayList));
        Drawable LIZIZ = C04270Et.LIZIZ(recyclerView.getContext(), R.drawable.bi9);
        if (LIZIZ == null) {
            LIZIZ = new ColorDrawable();
        }
        C4DK c4dk = new C4DK(LIZIZ);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.tb);
        c4dk.LJLJJI = dimensionPixelSize;
        c4dk.LJLJJL = dimensionPixelSize;
        recyclerView.LJII(c4dk, -1);
        MessagingPrivacyViewModel messagingPrivacyViewModel2 = (MessagingPrivacyViewModel) this.LJLJL.getValue();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("enter_from_extra")) == null) {
            str = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("user_type_extra");
        } else {
            i = 0;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i2 = arguments4.getInt("open_count_extra");
        } else {
            i2 = 0;
        }
        messagingPrivacyViewModel2.getClass();
        messagingPrivacyViewModel2.LJLJLLL = str;
        messagingPrivacyViewModel2.LJLJJL.getClass();
        if (i != 1) {
            if (i != 2) {
                str2 = "non_teenager";
            } else {
                str2 = "new";
            }
        } else {
            str2 = "existing";
        }
        messagingPrivacyViewModel2.LJLJLJ = str2;
        messagingPrivacyViewModel2.LJLJL = i2;
        MutableLiveData<Boolean> mutableLiveData = messagingPrivacyViewModel2.LJLLILLLL;
        if (i == 1) {
            z = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
        messagingPrivacyViewModel2.LJLL.observe(this, new AObserverS69S0100000_1(this, 52));
        messagingPrivacyViewModel2.LJLLI.observe(this, new AObserverS69S0100000_1(this, 53));
        messagingPrivacyViewModel2.LJLLILLLL.observe(this, new AObserverS69S0100000_1(this, 54));
        C92613kH c92613kH = messagingPrivacyViewModel2.LJLJJLL;
        String str3 = messagingPrivacyViewModel2.LJLJLLL;
        String str4 = messagingPrivacyViewModel2.LJLJLJ;
        int i3 = messagingPrivacyViewModel2.LJLJL;
        C85323Wm onEventV3 = C772831o.LIZ();
        c92613kH.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ2 = HXX.LIZJ("enter_from", str3, "user_type", str4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(i3);
        LIZJ2.put("times", X1D.LIZIZ(LIZ));
        onEventV3.LIZIZ("show_dm_permission_pop_up", LIZJ2);
        SY4 sy4 = this.LJLJI;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, this);
            SY4 sy42 = this.LJLJJI;
            if (sy42 != null) {
                C16880lQ.LJJIZ(sy42, this);
                return;
            } else {
                o.LJIJI("cancelButton");
                throw null;
            }
        }
        o.LJIJI("okButton");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1z, viewGroup, false);
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
