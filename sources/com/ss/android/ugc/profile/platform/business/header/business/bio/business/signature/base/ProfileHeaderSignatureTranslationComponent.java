package com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base;

import X.AFB;
import X.C17J;
import X.C212428Vi;
import X.C221108m2;
import X.C255199zv;
import X.C2YV;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C66415Q4t;
import X.C6DJ;
import X.C73411SrX;
import X.C79045V0n;
import X.C8YN;
import X.C9IL;
import X.C9X4;
import X.C9X7;
import X.C9XG;
import X.HG3;
import X.InterfaceC82683Wch;
import X.RBX;
import X.TBV;
import X.WHL;
import X.Y01;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.newet.SeeOriginalShowInBioEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationShowInBioEvent;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS64S0201000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileHeaderSignatureTranslationComponent extends BioBaseUIComponent implements ISignatureAbility {
    public ProfileViewModel LJLJJL;
    public InterfaceC82683Wch LJLJJLL;
    public TuxTextView LJLJL;
    public FrameLayout LJLJLJ;
    public LinearLayout LJLJLLL;
    public ObjectAnimator LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 941));

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ISignatureAbility.class, null);
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            this.LJLJJL = AFB.LIZ(LIZLLL2);
        }
        BioTranslationViewModel A3 = A3();
        if (A3 != null) {
            C8YN.LJII(this, A3, new TBV() { // from class: X.9X6
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C9X7) obj).LJLJJI;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    C9X7 c9x7 = (C9X7) obj;
                    C9XG c9xg = (C9XG) obj2;
                    c9x7.getClass();
                    o.LJIIIZ(c9xg, "<set-?>");
                    c9x7.LJLJJI = c9xg;
                }
            }, null, new AqS186S0100000_4(this, 227), 6);
        }
    }

    public final BioTranslationViewModel A3() {
        return (BioTranslationViewModel) this.LJLJJI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        if (r11 != null) goto L71;
     */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View generateComponentView() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent.generateComponentView():android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        if (L7()) {
            HG3.LJIILL().getCurUser().setSignature(null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Describe describe;
        super.updateComponentUIAndData();
        BizBaseData bizBaseData = this.LJLIL;
        if (bizBaseData != null && (describe = bizBaseData.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        BioTranslationViewModel A3 = A3();
        if (A3 != null) {
            C73411SrX c73411SrX = A3.LJLIL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            A3.setState(new AqS29S1000000_4(str, 29));
        }
        W8(0, str);
    }

    public final void C3(C9X4 enterMethod) {
        int i;
        InterfaceC82683Wch interfaceC82683Wch;
        C9X7 state;
        int i2;
        Integer LJI;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (!this.LJLLILLLL) {
            this.LJLLILLLL = true;
            FrameLayout frameLayout = this.LJLJLJ;
            Context context = getContext();
            BioTranslationViewModel A3 = A3();
            if (A3 != null && A3.getState().LJLJJI == C9XG.ORIGINAL) {
                i = R.string.qfs;
            } else {
                i = R.string.qfr;
            }
            String str = null;
            if (frameLayout != null) {
                Context context2 = frameLayout.getContext();
                o.LJIIIIZZ(context2, "it.context");
                C6DJ c6dj = new C6DJ(context2);
                c6dj.LIZ.LIZIZ = frameLayout;
                if (context != null && (LJI = C79045V0n.LJI(R.attr.gy, context)) != null) {
                    i2 = LJI.intValue();
                } else {
                    i2 = -16777216;
                }
                c6dj.LJIIIIZZ(i2);
                c6dj.LIZ.LJII = -1001L;
                c6dj.LJIIJJI(new AqS64S0201000_15(i, this, frameLayout, 7));
                c6dj.LJFF();
                c6dj.LIZ.LJIJJLI = true;
                c6dj.LJI(WHL.BOTTOM);
                c6dj.LJII(new AqS154S0100000_4(this, 1131));
                c6dj.LJ(new AqS154S0100000_4(this, 1132));
                interfaceC82683Wch = c6dj.LIZJ();
            } else {
                interfaceC82683Wch = null;
            }
            this.LJLJJLL = interfaceC82683Wch;
            BioTranslationViewModel A32 = A3();
            if (A32 != null && A32.getState().LJLJJI == C9XG.ORIGINAL) {
                SeeTranslationShowInBioEvent seeTranslationShowInBioEvent = new SeeTranslationShowInBioEvent();
                seeTranslationShowInBioEvent.LIZ().add(new C2YV(enterMethod.getValue(), Y01.LIZIZ.LJJIIZI(), null));
                seeTranslationShowInBioEvent.LJFF();
            } else {
                SeeOriginalShowInBioEvent seeOriginalShowInBioEvent = new SeeOriginalShowInBioEvent();
                String value = enterMethod.getValue();
                String LJJIIZI = Y01.LIZIZ.LJJIIZI();
                BioTranslationViewModel A33 = A3();
                if (A33 != null && (state = A33.getState()) != null) {
                    str = state.LJLILLLLZI;
                }
                seeOriginalShowInBioEvent.LIZ().add(new C2YV(value, LJJIIZI, str));
                seeOriginalShowInBioEvent.LJFF();
            }
            InterfaceC82683Wch interfaceC82683Wch2 = this.LJLJJLL;
            this.LJLJJLL = interfaceC82683Wch2;
            if (interfaceC82683Wch2 != null) {
                interfaceC82683Wch2.show();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void v3(View view) {
        IHeaderBioAbility iHeaderBioAbility;
        if (view != null && (iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBioAbility.LJFF(this.index, view, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility
    public final void W8(int i, String str) {
        String str2;
        C9X7 state;
        ProfileViewModel profileViewModel = this.LJLJJL;
        if (profileViewModel != null) {
            profileViewModel.Hv0(C255199zv.LJIILL());
        }
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LJLJL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
        }
        ProfileViewModel profileViewModel2 = this.LJLJJL;
        if (profileViewModel2 != null) {
            profileViewModel2.Hv0(C255199zv.LJIILL());
        }
        BioTranslationViewModel A3 = A3();
        if (A3 != null && (state = A3.getState()) != null) {
            str2 = state.LJLIL;
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2) && L7()) {
            ((RBX) HG3.LJIILL()).getCurUser().setSignature(str);
        }
        C66415Q4t.LIZIZ(this.LJLJL, str);
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_BIO_SIGNATURE".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, C44384HbQ.LLFF(this.LJLJL));
    }
}
