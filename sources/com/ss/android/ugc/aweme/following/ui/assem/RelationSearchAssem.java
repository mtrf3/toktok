package com.ss.android.ugc.aweme.following.ui.assem;

import X.AYA;
import X.AbstractC72278SYg;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C109434Rf;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C3C1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72883Sj1;
import X.C72884Sj2;
import X.C72885Sj3;
import X.C72912tb;
import X.C72922tc;
import X.C73305Spp;
import X.C73306Spq;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78926UyI;
import X.C78999UzT;
import X.C9BE;
import X.EnumC51135K5b;
import X.K5T;
import X.MG7;
import X.SYL;
import X.T5T;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import Y.AfS64S0100000_12;
import Y.IDObjectS183S0100000_12;
import Y.IDTListenerS92S0200000_12;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.following.vm.RelationSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RelationSearchAssem extends UIContentAssem {
    public FrameLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public K5T LJLJI;
    public SYL LJLJJI;
    public C73305Spp LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public Boolean LJLJL;
    public boolean LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C73318Sq2 LJLL;
    public final C72883Sj1 LJLLI;

    public RelationSearchAssem() {
        new LinkedHashMap();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 357));
        this.LJLJLJ = true;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RelationSearchVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 358), C72885Sj3.INSTANCE, null);
        this.LJLL = new C73318Sq2();
        this.LJLLI = new C72883Sj1(this, o.LJ(this.LJLJL, Boolean.TRUE));
    }

    public final RelationSearchVM v3() {
        return (RelationSearchVM) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLL.dispose();
    }

    public final void A3(Boolean bool) {
        boolean z;
        int i;
        T5T t5t;
        T5T editTextView;
        this.LJLJL = bool;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            FrameLayout frameLayout = this.LJLILLLLZI;
            int i2 = 8;
            boolean z2 = true;
            if (frameLayout != null) {
                if (frameLayout.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != booleanValue) {
                    if (booleanValue) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    frameLayout.setVisibility(i);
                }
            }
            FrameLayout frameLayout2 = this.LJLIL;
            boolean z3 = !booleanValue;
            if (frameLayout2 != null) {
                if (frameLayout2.getVisibility() != 0) {
                    z2 = false;
                }
                if (z2 != z3) {
                    if (z3) {
                        i2 = 0;
                    }
                    frameLayout2.setVisibility(i2);
                }
            }
            if (!booleanValue) {
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                K5T k5t = this.LJLJI;
                if (k5t != null) {
                    t5t = k5t.getEditTextView();
                } else {
                    t5t = null;
                }
                AYA.LIZ(LIZ, t5t);
                K5T k5t2 = this.LJLJI;
                if (k5t2 != null && (editTextView = k5t2.getEditTextView()) != null) {
                    Editable text = editTextView.getText();
                    if (text != null) {
                        text.clear();
                    }
                    editTextView.setCursorVisible(false);
                }
                RelationSearchVM v3 = v3();
                v3.getClass();
                v3.LJLJJI = "";
            }
            this.LJLLI.LIZ = bool.booleanValue();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (FrameLayout) view.findViewById(R.id.dmd);
        this.LJLILLLLZI = (FrameLayout) view.findViewById(R.id.jh_);
        K5T k5t = (K5T) view.findViewById(R.id.je_);
        this.LJLJI = k5t;
        if (k5t != null) {
            k5t.setSearchBarHeight(EnumC51135K5b.HIGH);
            k5t.setShowSeparator(false);
            C78999UzT.LJFF(C109434Rf.LJII(k5t.getEditTextView()).LJIIJJI(500L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 93)), this.LJLL);
            k5t.getEditTextView().addTextChangedListener(new IDObjectS183S0100000_12(this, 5));
            k5t.getEditTextView().setOnTouchListener(new IDTListenerS92S0200000_12(this, k5t, 2));
            k5t.setOnClickClearListener(new ACListenerS32S0100000_12(this, 111));
        }
        SYL syl = (SYL) view.findViewById(R.id.jh1);
        this.LJLJJI = syl;
        if (syl != null) {
            if (o.LJ(v3().getEnterFrom(), MG7.FOLLOWING.getMobString())) {
                syl.LLLF.LJZL(SelfFollowRelationSearchCell.class);
            } else {
                syl.LLLF.LJZL(RelationSearchCell.class);
            }
            syl.LJLJLLL((AbstractC72278SYg) v3().LJLJJL.getValue());
            syl.LJLJLJ(new C72884Sj2(this));
        }
        this.LJLJJL = (C73305Spp) view.findViewById(R.id.jhl);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.Sj4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72887Sj5) obj).LJLIL;
            }
        }, null, new AqS178S0100000_12(this, 380), new AqS162S0100000_12(this, 1025), new AqS178S0100000_12(this, 381), 2, null);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (onBackPressedDispatcher = LIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(this, this.LJLLI);
        }
    }

    public final void x3(AbstractC72932td<Boolean> abstractC72932td) {
        if (abstractC72932td instanceof C72922tc) {
            C73305Spp c73305Spp = this.LJLJJL;
            if (c73305Spp != null) {
                c73305Spp.LJFF();
                c73305Spp.setVisibility(0);
            }
            SYL syl = this.LJLJJI;
            if (syl == null) {
                return;
            }
            syl.setVisibility(8);
            return;
        }
        if ((abstractC72932td instanceof C3C1) || o.LJ(abstractC72932td.LIZ(), Boolean.TRUE)) {
            C73305Spp c73305Spp2 = this.LJLJJL;
            if (c73305Spp2 != null) {
                c73305Spp2.setStatus((C73306Spq) this.LJLJJLL.getValue());
                c73305Spp2.setVisibility(0);
            }
            SYL syl2 = this.LJLJJI;
            if (syl2 == null) {
                return;
            }
            syl2.setVisibility(8);
            return;
        }
        if (!(abstractC72932td instanceof C72912tb)) {
            return;
        }
        SYL syl3 = this.LJLJJI;
        if (syl3 != null) {
            syl3.setVisibility(0);
        }
        C73305Spp c73305Spp3 = this.LJLJJL;
        if (c73305Spp3 == null) {
            return;
        }
        c73305Spp3.setVisibility(8);
    }
}
