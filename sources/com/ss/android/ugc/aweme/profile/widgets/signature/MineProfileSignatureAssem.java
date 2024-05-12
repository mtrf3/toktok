package com.ss.android.ugc.aweme.profile.widgets.signature;

import X.AFB;
import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C110614Vt;
import X.C16880lQ;
import X.C17J;
import X.C212428Vi;
import X.C234999Kd;
import X.C235539Mf;
import X.C235599Ml;
import X.C235639Mp;
import X.C255199zv;
import X.C26335AVf;
import X.C44384HbQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C61328O5c;
import X.C65352Pkq;
import X.C66415Q4t;
import X.C6ZT;
import X.C8VC;
import X.C99W;
import X.C9AC;
import X.C9AE;
import X.C9ID;
import X.C9IL;
import X.C9KV;
import X.C9MX;
import X.C9NI;
import X.C9UJ;
import X.C9X4;
import X.InterfaceC235069Kk;
import X.InterfaceC235629Mo;
import X.InterfaceC82683Wch;
import X.TBT;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS297S0100000_4;
import Y.IDTListenerS114S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.header.IMineProfileEditAbility;
import com.ss.android.ugc.aweme.profile.widgets.signature.MineProfileSignatureAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.IDaS90S0000000_4;
import o3.h0;
import yq4.a;

/* loaded from: classes5.dex */
public final class MineProfileSignatureAssem extends BaseProfileSignatureAssem implements C9MX {
    public boolean LJLL;
    public ProfileViewModel LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C55749LuL LJLLL = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem
    public void _$_clearFindViewByIdCache() {
        this.LJLLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C9MX, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final void P3() {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, null);
        }
        TuxTextView tuxTextView2 = this.LJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setOnTouchListener(null);
        }
        TuxTextView tuxTextView3 = this.LJLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setOnLongClickListener(null);
        }
    }

    private final C9ID Q3() {
        return (C9ID) this.LJLLL.getValue();
    }

    private final CharSequence R3() {
        C235639Mp c235639Mp;
        Resources resources;
        Resources resources2;
        String string;
        String str = null;
        if (!C235599Ml.LIZ()) {
            Context context = getContext();
            if (context == null || (resources2 = context.getResources()) == null || (string = resources2.getString(R.string.jgg)) == null) {
                return null;
            }
            return string.subSequence(0, string.length());
        }
        Context context2 = getContext();
        if (context2 != null) {
            c235639Mp = new C235639Mp(context2);
            ((TuxTag) c235639Mp.LJLIL).setTagSize(3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("+ ");
            LIZ.append(context2.getResources().getString(R.string.bft));
            c235639Mp.LIZ(X1D.LIZIZ(LIZ));
            ((TuxTag) c235639Mp.LJLIL).setTagTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context2));
            ((TuxTag) c235639Mp.LJLIL).setTagBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cg, context2));
        } else {
            c235639Mp = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context3 = getContext();
        if (context3 != null && (resources = context3.getResources()) != null) {
            str = resources.getString(R.string.bft);
        }
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(c235639Mp, 0, spannableStringBuilder.length(), 17);
        C9AE.LIZ(this.LJLIL, C9AC.LIGHT_MASK, 0.0f);
        return spannableStringBuilder;
    }

    public final void O3() {
        if (C9NI.LIZ()) {
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setOnTouchListener(new IDTListenerS114S0100000_4(this, 6));
            }
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setOnLongClickListener(new IDCListenerS297S0100000_4(this, 1));
            }
            TuxTextView tuxTextView3 = this.LJLIL;
            if (tuxTextView3 != null) {
                C16880lQ.LJJJJI(tuxTextView3, new ACListenerS24S0100000_4(this, 155));
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            this.LJLLI = AFB.LIZ(LIZLLL);
        }
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        if (this.LJLLILLLL && this.LJLL) {
            C26335AVf.LJJIJIIJI();
        }
    }

    private final void N3(View view) {
        Drawable drawable;
        if (C99W.LIZ) {
            Context context = getContext();
            if (context != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                drawable = c110614Vt.LIZ(context);
            } else {
                drawable = null;
            }
            view.setBackground(drawable);
        }
    }

    private final void U3(View view) {
        h0.LJIJI(view, new IDaS90S0000000_4(0));
    }

    private final void W3(View view) {
        if (C9NI.LIZ()) {
            this.LJLILLLLZI = (LinearLayout) view.findViewById(R.id.gjm);
            TuxIconView imageView = (TuxIconView) view.findViewById(R.id.gjn);
            o.LJIIIIZZ(imageView, "imageView");
            A3(imageView);
        }
    }

    public final void X3(String str) {
        if (C9NI.LIZ()) {
            x3().gv0(str);
            Ej();
            W8(-1, str);
        }
    }

    public final void Y3(View view) {
        User user;
        String str;
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        String str2 = null;
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
            if (user != null) {
                str2 = user.getSignature();
            }
        } else {
            user = null;
        }
        if (!TextUtils.isEmpty(str2) || C6ZT.LIZ(view)) {
            return;
        }
        Keva keva = C235539Mf.LIZ;
        if (keva != null) {
            keva.storeBoolean("profile_v2_show_bio_hint", false);
        }
        if (user == null || (str = user.getSignature()) == null) {
            str = "";
        }
        ProfileEditBioFragment LIZ = C9UJ.LIZ("bio", str, C255199zv.LJI(user, "click_card", "bio"));
        LIZ.setUserVisibleHint(true);
        LIZ.LJLZ = new InterfaceC235629Mo() { // from class: X.9Mg
            @Override // X.InterfaceC235629Mo
            public final void LIZ(String content) {
                o.LJIIIZ(content, "content");
                IMineProfileEditAbility iMineProfileEditAbility = (IMineProfileEditAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MineProfileSignatureAssem.this), IMineProfileEditAbility.class, null);
                if (iMineProfileEditAbility != null) {
                    iMineProfileEditAbility.Ad(content);
                }
                if (C9NI.LIZ()) {
                    MineProfileSignatureAssem.this.X3(content);
                }
            }
        };
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            FragmentManager supportFragmentManager = LIZ2.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            LIZ.show(supportFragmentManager, "EditNicknameDialog");
        }
    }

    public final void Z3(C9X4 c9x4) {
        if (!this.LJLJLJ) {
            this.LJLJJI = v3(this.LJLIL, getContext(), c9x4, new AqS170S0100000_4(this, 747));
            L3();
            InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.show();
            }
            this.LJLJLJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (TuxTextView) view.findViewById(R.id.gjk);
        if (C9NI.LIZ()) {
            W3(view);
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Mh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 744));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Mi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 745));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Mj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LJIIIIZZ;
            }
        }, new AqS170S0100000_4(this, 746));
        C9ID Q3 = Q3();
        if (Q3 == null || !o.LJ(Q3.LJLJJLL, Boolean.TRUE) || (tuxTextView = this.LJLIL) == null) {
            return;
        }
        tuxTextView.setText("");
    }

    @Override // X.C9MX
    public void W8(int i, String str) {
        ProfileViewModel profileViewModel = this.LJLLI;
        if (profileViewModel != null) {
            profileViewModel.Hv0(C255199zv.LJIILL());
        }
        TuxTextView tuxTextView = this.LJLIL;
        User user = null;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, null);
        }
        P3();
        View view = this.LJLIL;
        if (view != null) {
            U3(view);
        }
        if (!a.LJ().LJ(4) && !AV1.LJIIJJI() && TextUtils.isEmpty(str) && C235539Mf.LIZ()) {
            this.LJLL = true;
            C255199zv.LJII = true;
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                N3(tuxTextView2);
                tuxTextView2.setVisibility(0);
                tuxTextView2.setText(R3());
                C16880lQ.LJJJJI(tuxTextView2, new ACListenerS24S0100000_4(this, 156));
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView3 = this.LJLIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(8);
            }
        } else {
            C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
            if (c234999Kd != null) {
                user = c234999Kd.LIZ;
            }
            TuxTextView tuxTextView4 = this.LJLIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            if (AV1.LJIJ(user) && AV1.LJIIJJI()) {
                TuxTextView tuxTextView5 = this.LJLIL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(R.string.rd2);
                }
            } else {
                if (!this._isViewValid) {
                    return;
                }
                C66415Q4t.LIZIZ(this.LJLIL, str);
                if (C9NI.LIZ() && this.LJLLJ) {
                    O3();
                }
            }
        }
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_BIO_SIGNATURE".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, C44384HbQ.LLFF(this.LJLIL));
    }
}
