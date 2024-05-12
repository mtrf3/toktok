package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C113554cx;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C35936E8m;
import X.C62562cu;
import X.C62822Ol8;
import X.C71799SFv;
import X.C85715XkV;
import X.C85720Xka;
import X.C85728Xki;
import X.C85733Xkn;
import X.C85736Xkq;
import X.FMX;
import X.HG3;
import X.InterfaceC248539pB;
import X.OSZ;
import X.RBX;
import X.SY4;
import Y.ACListenerS35S0100000_15;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class CommonSetAvatarFragment extends BaseI18nLoginFragment {
    public FrameLayout LJZL;
    public C71799SFv LL;
    public LinearLayout LLD;
    public TuxIconView LLF;
    public SY4 LLFF;
    public boolean LLIFFJFJJ;
    public long LLII;
    public final Map<Integer, View> LLIIIL = new LinkedHashMap();
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(C85733Xkn.LJLIL);
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(C85720Xka.LJLIL);
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new C85728Xki(this));
    public final C62822Ol8 LLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 180));
    public final C62822Ol8 LLIIII = C221108m2.LIZIZ(C85736Xkq.LJLIL);
    public final C62822Ol8 LLIIIILZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 178));
    public final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 179));

    public final HashMap<String, String> Ql() {
        return C113554cx.LJJJLZIJ(new OSZ("login_panel_type", "signup"), new OSZ("platform", this.LLI.getValue()), new OSZ("enter_from", getEnterFrom()), new OSZ("enter_method", getEnterMethod()));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final C35936E8m Rl() {
        C35936E8m c35936E8m = new C35936E8m();
        for (Map.Entry<String, String> entry : Ql().entrySet()) {
            c35936E8m.LIZJ(entry.getKey(), entry.getValue());
        }
        return c35936E8m;
    }

    public final SY4 Sl() {
        SY4 sy4 = this.LLFF;
        if (sy4 != null) {
            return sy4;
        }
        o.LJIJI("confirmBtn");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public void Nl() {
        FMX.LJIIL("set_avatar_skip", Rl().LIZ);
    }

    public final void Vl(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.LLD;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                TuxIconView tuxIconView = this.LLF;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                    TuxIconView tuxIconView2 = this.LLF;
                    if (tuxIconView2 != null) {
                        Ol(new ACListenerS35S0100000_15(this, 60), tuxIconView2);
                        LinearLayout linearLayout2 = this.LLD;
                        if (linearLayout2 != null) {
                            C16880lQ.LJIIZILJ(linearLayout2, null);
                            return;
                        } else {
                            o.LJIJI("avatarLayer");
                            throw null;
                        }
                    }
                    o.LJIJI("editIcon");
                    throw null;
                }
                o.LJIJI("editIcon");
                throw null;
            }
            o.LJIJI("avatarLayer");
            throw null;
        }
        LinearLayout linearLayout3 = this.LLD;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
            TuxIconView tuxIconView3 = this.LLF;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
                LinearLayout linearLayout4 = this.LLD;
                if (linearLayout4 != null) {
                    Ol(new ACListenerS35S0100000_15(this, 61), linearLayout4);
                    TuxIconView tuxIconView4 = this.LLF;
                    if (tuxIconView4 != null) {
                        C16880lQ.LJJJ(tuxIconView4, null);
                        return;
                    } else {
                        o.LJIJI("editIcon");
                        throw null;
                    }
                }
                o.LJIJI("avatarLayer");
                throw null;
            }
            o.LJIJI("editIcon");
            throw null;
        }
        o.LJIJI("avatarLayer");
        throw null;
    }

    public static void Tl(Long l, String str) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("action_type", str);
        if (l != null) {
            c35936E8m.LIZIZ(l.longValue(), "prefill_duration");
        }
        FMX.LJIIL("set_avatar_prefill", c35936E8m.LIZ);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(message);
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.acg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.avatar_layout)");
        this.LJZL = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.avatar)");
        this.LL = (C71799SFv) findViewById2;
        View findViewById3 = view.findViewById(R.id.abr);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.avatar_camera_layer)");
        this.LLD = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.ac3);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.avatar_edit_icon)");
        this.LLF = (TuxIconView) findViewById4;
        View findViewById5 = view.findViewById(R.id.jqj);
        SY4 sy4 = (SY4) findViewById5;
        sy4.getClass();
        sy4.setEnabled(false);
        o.LJIIIIZZ(findViewById5, "view.findViewById<TuxBut…Enabled = false\n        }");
        this.LLFF = (SY4) findViewById5;
        if (((String) this.LLFII.getValue()).length() > 0) {
            this.LLIFFJFJJ = true;
            Sl().setEnabled(true);
            C71799SFv c71799SFv = this.LL;
            if (c71799SFv != null) {
                C71799SFv.LJIIJ(c71799SFv, this.LLFII.getValue(), null, false, new C85715XkV(this), 62);
            } else {
                o.LJIJI("avatarImageView");
                throw null;
            }
        }
        if (((String) this.LLFII.getValue()).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Vl(z);
        C35936E8m Rl = Rl();
        if (((Boolean) this.LLFZ.getValue()).booleanValue()) {
            if (((String) this.LLFII.getValue()).length() > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            Rl.LIZJ("is_prefilled", str);
        }
        FMX.LJIIL("set_avatar_show", Rl.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializable;
        UrlModel urlModel;
        super.onActivityResult(i, i2, intent);
        if (i == 10002) {
            if (intent != null) {
                serializable = intent.getSerializableExtra("path");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof UrlModel) || (urlModel = (UrlModel) serializable) == null) {
                return;
            }
            this.LLIFFJFJJ = true;
            Sl().setEnabled(true);
            ((RBX) HG3.LJIILL()).updateCurAvatar(urlModel, urlModel, urlModel);
            C71799SFv c71799SFv = this.LL;
            if (c71799SFv != null) {
                C71799SFv.LJIIJ(c71799SFv, new C62562cu(urlModel.getUrlList()), null, false, null, 110);
                Vl(true);
                return;
            } else {
                o.LJIJI("avatarImageView");
                throw null;
            }
        }
        InterfaceC248539pB interfaceC248539pB = (InterfaceC248539pB) this.LLIIIILZ.getValue();
        if (intent == null) {
            intent = (Intent) this.LLIIII.getValue();
        }
        interfaceC248539pB.onActivityResult(i, i2, intent);
    }
}
