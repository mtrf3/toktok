package com.ss.android.ugc.aweme.search.pages.result.common.searchrelation.core.ui;

import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C17N;
import X.C25770A9m;
import X.C45804HyK;
import X.C49331JXr;
import X.C49587Jd9;
import X.C50094JlK;
import X.C50095JlL;
import X.C50322Jp0;
import X.C55096Ljo;
import X.C55953Lxd;
import X.C57857MnF;
import X.C76800UCe;
import X.C7MY;
import X.C8XO;
import X.C98J;
import X.C98M;
import X.InterfaceC65784Pro;
import Y.ACListenerS28S0100000_8;
import Y.AUListenerS93S0100000_4;
import Y.IDAListenerS73S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchRelationUserAssem extends ReusedUISlotAssem<SearchRelationUserAssem> implements C8XO<C49331JXr> {
    public C25770A9m LLFF;
    public C49331JXr LLFFF;
    public String LLFII;
    public boolean LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ch5;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchRelationUserAssem() {
        new LinkedHashMap();
        this.LLFII = "";
        this.LLFZ = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C25770A9m c25770A9m = this.LLFF;
        if (c25770A9m != null) {
            c25770A9m.destroy();
        } else {
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
    }

    public final String getEnterFrom() {
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ;
        String str;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchContextAbility.class, null);
        if (iSearchContextAbility == null || (ut0 = iSearchContextAbility.ut0()) == null || (LIZJ = ut0.LIZJ()) == null || (str = LIZJ.LJLJI) == null) {
            return "";
        }
        return str;
    }

    public final String n4() {
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        String str;
        ISearchContextAbility LJJJJJ = C17N.LJJJJJ(getContainerView());
        if (LJJJJJ == null || (If = LJJJJJ.If()) == null || (LIZJ = If.LIZJ()) == null || (str = LIZJ.LJLJI) == null) {
            return "";
        }
        return str;
    }

    public final String p4() {
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        String str;
        ISearchContextAbility LJJJJJ = C17N.LJJJJJ(getContainerView());
        if (LJJJJJ == null || (If = LJJJJJ.If()) == null || (LIZJ = If.LIZJ()) == null || (str = LIZJ.LJLJJI) == null) {
            return "";
        }
        return str;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C49331JXr c49331JXr) {
        String str;
        User user;
        C49331JXr item = c49331JXr;
        o.LJIIIZ(item, "item");
        if (!this.LLFZ) {
            return;
        }
        this.LLFZ = false;
        this.LLFFF = item;
        this.LLFII = String.valueOf(System.currentTimeMillis());
        C25770A9m c25770A9m = this.LLFF;
        if (c25770A9m != null) {
            ViewGroup.LayoutParams layoutParams = c25770A9m.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
                c25770A9m.setLayoutParams(layoutParams);
                C25770A9m c25770A9m2 = this.LLFF;
                if (c25770A9m2 != null) {
                    c25770A9m2.reset();
                    q4(true);
                    C25770A9m c25770A9m3 = this.LLFF;
                    if (c25770A9m3 != null) {
                        SearchUser searchUser = item.LJLILLLLZI;
                        if (searchUser != null && (user = searchUser.user) != null) {
                            str = user.getSecUid();
                        } else {
                            str = null;
                        }
                        C98M.LIZ(c25770A9m3, null, str, null, 5);
                        C25770A9m c25770A9m4 = this.LLFF;
                        if (c25770A9m4 != null) {
                            c25770A9m4.LJLIL.LJJLIIIJJIZ(new AqS139S0200000_8(item, this, 34));
                            C25770A9m c25770A9m5 = this.LLFF;
                            if (c25770A9m5 != null) {
                                c25770A9m5.LJLJLJ(false);
                                return;
                            } else {
                                o.LJIJI("horizontalUserCardLayout");
                                throw null;
                            }
                        }
                        o.LJIJI("horizontalUserCardLayout");
                        throw null;
                    }
                    o.LJIJI("horizontalUserCardLayout");
                    throw null;
                }
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C49331JXr c49331JXr) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ActivityC45651qj activityC45651qj;
        C25770A9m c25770A9m = (C25770A9m) C7MY.LIZLLL(view, "view", R.id.mym, "view.findViewById(R.id.user_card_layout)");
        this.LLFF = c25770A9m;
        Context context = getContext();
        if (context != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        C98J.LIZ(c25770A9m, activityC45651qj, null, C57857MnF.LJLIL, 2);
        C25770A9m c25770A9m2 = this.LLFF;
        if (c25770A9m2 != null) {
            c25770A9m2.W7(new C50094JlK(this));
            C25770A9m c25770A9m3 = this.LLFF;
            if (c25770A9m3 != null) {
                c25770A9m3.LJLIL.LJJLIL(new C50095JlL(this));
                C25770A9m c25770A9m4 = this.LLFF;
                if (c25770A9m4 != null) {
                    c25770A9m4.LIZ(R.string.dfz, new ACListenerS28S0100000_8(this, 34));
                    return;
                } else {
                    o.LJIJI("horizontalUserCardLayout");
                    throw null;
                }
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    public final void q4(boolean z) {
        ActivityC45651qj LJJIFFI;
        Context context = getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            ((SearchStateViewModel) ViewModelProviders.of(LJJIFFI).get(SearchStateViewModel.class)).isShowSearchRelationCard = z;
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C49331JXr c49331JXr) {
    }

    public final ValueAnimator m4(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        C25770A9m c25770A9m = this.LLFF;
        if (c25770A9m != null) {
            c25770A9m.clearAnimation();
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 16));
            ofFloat.addListener(new IDAListenerS73S0100000_4(interfaceC65784Pro, 7));
            ofFloat.addListener(new IDAListenerS73S0100000_4(interfaceC65784Pro2, 6));
            if (z) {
                ofFloat.start();
            } else {
                ofFloat.reverse();
            }
            return ofFloat;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }
}
