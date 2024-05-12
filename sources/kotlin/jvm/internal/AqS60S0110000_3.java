package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C213438Zf;
import X.C213898aP;
import X.C55096Ljo;
import X.C76800UCe;
import X.C76E;
import X.C7EG;
import X.C8W0;
import X.InterfaceC65784Pro;
import X.KR8;
import X.KU4;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AqS60S0110000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$0();
            case 3:
                return invoke$1();
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility, X.2K0] */
    public final IFeedPanelPlatformAbility invoke$0() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedPanelPlatformAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility, X.2K0] */
    public final IFeedPanelPlatformAbility invoke$1() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static final Object invoke$0(AqS60S0110000_3 aqS60S0110000_3) {
        if (aqS60S0110000_3.z1) {
            C213898aP c213898aP = (C213898aP) aqS60S0110000_3.l0;
            c213898aP.LJFF(c213898aP.LJLIL);
            ((C213898aP) aqS60S0110000_3.l0).LJLJJI = true;
        } else {
            C213898aP c213898aP2 = (C213898aP) aqS60S0110000_3.l0;
            c213898aP2.LIZIZ(c213898aP2.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS60S0110000_3 aqS60S0110000_3) {
        if (aqS60S0110000_3.z1) {
            C213438Zf c213438Zf = (C213438Zf) aqS60S0110000_3.l0;
            c213438Zf.LIZLLL(c213438Zf.LJLIL);
        } else {
            C213438Zf c213438Zf2 = (C213438Zf) aqS60S0110000_3.l0;
            c213438Zf2.LIZIZ(c213438Zf2.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS60S0110000_3 aqS60S0110000_3) {
        int i;
        View view = ((C76E) aqS60S0110000_3.l0).LIZ;
        if (aqS60S0110000_3.z1) {
            i = R.id.iw3;
        } else {
            i = R.id.blr;
        }
        return view.findViewById(i);
    }

    public static final Object invoke$11(AqS60S0110000_3 aqS60S0110000_3) {
        int i;
        View view = ((C76E) aqS60S0110000_3.l0).LIZ;
        if (aqS60S0110000_3.z1) {
            i = R.id.iw4;
        } else {
            i = R.id.bm6;
        }
        return view.findViewById(i);
    }

    public static final Object invoke$12(AqS60S0110000_3 aqS60S0110000_3) {
        int i;
        View view = ((C76E) aqS60S0110000_3.l0).LIZ;
        if (aqS60S0110000_3.z1) {
            i = R.id.ivz;
        } else {
            i = R.id.bjm;
        }
        return view.findViewById(i);
    }

    public static final Object invoke$13(AqS60S0110000_3 aqS60S0110000_3) {
        if (aqS60S0110000_3.z1) {
            return ((C76E) aqS60S0110000_3.l0).LIZ.findViewById(R.id.iwf);
        }
        return ((C76E) aqS60S0110000_3.l0).LIZ.findViewById(R.id.iuj);
    }

    public static final Object invoke$4(AqS60S0110000_3 aqS60S0110000_3) {
        if (aqS60S0110000_3.z1) {
            ActivityC45651qj LIZ = C212428Vi.LIZ((C8W0) aqS60S0110000_3.l0);
            if (LIZ != null) {
                return C7EG.LIZ(LIZ).jv0(LIZ);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment LIZLLL = C212428Vi.LIZLLL((C8W0) aqS60S0110000_3.l0);
        if (LIZLLL != null) {
            ActivityC45651qj requireActivity = LIZLLL.requireActivity();
            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
            return C7EG.LIZ(requireActivity).jv0(LIZLLL);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$5(AqS60S0110000_3 aqS60S0110000_3) {
        LifecycleOwner lifecycleOwner;
        ActivityC45651qj requireActivity = ((Fragment) aqS60S0110000_3.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Assembler LIZ = C7EG.LIZ(requireActivity);
        if (aqS60S0110000_3.z1) {
            lifecycleOwner = ((Fragment) aqS60S0110000_3.l0).mo49getActivity();
        } else {
            lifecycleOwner = (Fragment) aqS60S0110000_3.l0;
        }
        return LIZ.kv0(lifecycleOwner);
    }

    public static final Object invoke$6(AqS60S0110000_3 aqS60S0110000_3) {
        if (aqS60S0110000_3.z1) {
            ActivityC45651qj LIZ = C212428Vi.LIZ((C8W0) aqS60S0110000_3.l0);
            if (LIZ != null) {
                return C7EG.LIZ(LIZ).kv0(LIZ);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment LIZLLL = C212428Vi.LIZLLL((C8W0) aqS60S0110000_3.l0);
        if (LIZLLL != null) {
            ActivityC45651qj requireActivity = LIZLLL.requireActivity();
            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
            return C7EG.LIZ(requireActivity).kv0(LIZLLL);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$7(AqS60S0110000_3 aqS60S0110000_3) {
        ViewModelStore viewModelStore;
        String str;
        if (aqS60S0110000_3.z1) {
            ActivityC45651qj LIZ = C212428Vi.LIZ((C8W0) aqS60S0110000_3.l0);
            if (LIZ != null) {
                viewModelStore = LIZ.getViewModelStore();
                str = "requireNotNull(activityF…der(this)).viewModelStore";
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            Fragment LIZLLL = C212428Vi.LIZLLL((C8W0) aqS60S0110000_3.l0);
            if (LIZLLL != null) {
                viewModelStore = LIZLLL.getViewModelStore();
                str = "requireNotNull(fragmentF…der(this)).viewModelStore";
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        o.LJIIIIZZ(viewModelStore, str);
        return viewModelStore;
    }

    public static final Object invoke$8(AqS60S0110000_3 aqS60S0110000_3) {
        LifecycleOwner lifecycleOwner;
        ActivityC45651qj requireActivity = ((Fragment) aqS60S0110000_3.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "this.requireActivity()");
        Assembler LIZ = C7EG.LIZ(requireActivity);
        if (aqS60S0110000_3.z1) {
            lifecycleOwner = ((Fragment) aqS60S0110000_3.l0).mo49getActivity();
        } else {
            lifecycleOwner = (Fragment) aqS60S0110000_3.l0;
        }
        return LIZ.jv0(lifecycleOwner);
    }

    public static final Object invoke$9(AqS60S0110000_3 aqS60S0110000_3) {
        ViewModelStore viewModelStore;
        String str;
        if (aqS60S0110000_3.z1) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) aqS60S0110000_3.l0;
            o.LJII(viewModelStoreOwner, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            viewModelStore = ((Fragment) viewModelStoreOwner).requireActivity().getViewModelStore();
            str = "this as Fragment).requireActivity().viewModelStore";
        } else {
            viewModelStore = ((ViewModelStoreOwner) aqS60S0110000_3.l0).getViewModelStore();
            str = "viewModelStore";
        }
        o.LJIIIIZZ(viewModelStore, str);
        return viewModelStore;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS60S0110000_3(X.C76E r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 10: goto Lf;
                case 11: goto Lf;
                case 12: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS60S0110000_3.<init>(X.76E, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0110000_3(C8W0 c8w0, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c8w0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0110000_3(Fragment fragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0110000_3(ViewModelStoreOwner viewModelStoreOwner, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = viewModelStoreOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0110000_3(boolean z, C213438Zf c213438Zf, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c213438Zf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0110000_3(boolean z, C213898aP c213898aP, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c213898aP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0110000_3(boolean z, KU4 ku4, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = ku4;
    }
}
