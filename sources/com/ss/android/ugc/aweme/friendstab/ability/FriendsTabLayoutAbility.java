package com.ss.android.ugc.aweme.friendstab.ability;

import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.C32151Nz;
import X.C45804HyK;
import X.C47959Irz;
import X.C53976LGi;
import X.C54029LIj;
import X.C54137LMn;
import X.C57396Mfo;
import X.C78856UxA;
import X.C7MY;
import X.C80261Vej;
import X.C84193Sd;
import X.EnumC53981LGn;
import X.InterfaceC36571c5;
import X.InterfaceC53896LDg;
import X.InterfaceC54013LHt;
import X.InterfaceC54357LUz;
import X.InterfaceC55058LjC;
import X.LGH;
import X.LGQ;
import X.LHJ;
import X.LHM;
import X.LHX;
import X.LHY;
import X.O6R;
import X.ORZ;
import X.VW3;
import X.X1D;
import X.Z89;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsTabLayoutAbility implements IFriendsTabLayoutAbility, InterfaceC54357LUz<C78856UxA> {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final List<LGH> LJLIL;
    public final List<LGH> LJLILLLLZI;
    public final C80261Vej LJLJI;
    public final ViewPager LJLJJI;
    public final ViewGroup LJLJJL;
    public final Context LJLJJLL;
    public boolean LJLL;
    public final Set<LHX> LJLJL = new LinkedHashSet();
    public final Set<LHY> LJLJLJ = new LinkedHashSet();
    public String LJLJLLL = "";
    public String LJLLI = "";

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final Rect E40() {
        Rect rect = new Rect();
        this.LJLJI.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final int IS() {
        int tabCount = this.LJLJI.getTabCount();
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C78856UxA tabAt = this.LJLJI.getTabAt(i);
                if (tabAt != null && tabAt.LIZ()) {
                    return i;
                }
                if (i == tabCount) {
                    break;
                }
                i++;
            }
        }
        return 0;
    }

    public final List<ISocialTabProtocol> LIZLLL() {
        Context context = this.LJLJJLL;
        o.LJIIIIZZ(context, "context");
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(context);
        if (LIZLLL != null) {
            return LIZLLL.L2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final String TO() {
        List<SocialTopTabNode> p5;
        AbstractC53895LDf abstractC53895LDf;
        int tabCount = this.LJLJI.getTabCount();
        int i = -1;
        if (tabCount >= 0) {
            int i2 = 0;
            while (true) {
                C78856UxA tabAt = this.LJLJI.getTabAt(i2);
                if (tabAt != null && tabAt.LIZ()) {
                    i = i2;
                }
                if (i2 == tabCount) {
                    break;
                }
                i2++;
            }
        }
        Context context = this.LJLJJLL;
        o.LJIIIIZZ(context, "context");
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(context);
        if (LIZLLL == null || (p5 = LIZLLL.p5()) == null || (abstractC53895LDf = (AbstractC53895LDf) ORZ.LJLLLLLL(i, p5)) == null) {
            return null;
        }
        return abstractC53895LDf.tag();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final String LJJLIIIJJI() {
        if (o.LJ(TO(), "FRIENDS_FEED")) {
            return "homepage_friends";
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void Mg() {
        int i;
        List<ISocialTabProtocol> LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            Iterator<ISocialTabProtocol> it = LIZLLL.iterator();
            i = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().getTag(), "FRIENDS_FEED")) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        C78856UxA tabAt = this.LJLJI.getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final InterfaceC53896LDg js0() {
        String TO = TO();
        if (TO == null) {
            return null;
        }
        InterfaceC36571c5 pe = pe(TO);
        if (!(pe instanceof InterfaceC53896LDg)) {
            return null;
        }
        return (InterfaceC53896LDg) pe;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void Iq(String str) {
        if (o.LJ(TO(), str)) {
            ((LGH) ListProtector.get(this.LJLIL, 0)).LLLIILIL();
        }
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
        Object obj;
        InterfaceC54013LHt interfaceC54013LHt;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTabUnselected ");
        KeyEvent.Callback callback = null;
        if (c78856UxA != null) {
            obj = c78856UxA.LIZ;
        } else {
            obj = null;
        }
        LIZ.append(obj);
        X1D.LIZIZ(LIZ);
        if (c78856UxA != null) {
            callback = c78856UxA.LJFF;
        }
        if ((callback instanceof InterfaceC54013LHt) && (interfaceC54013LHt = (InterfaceC54013LHt) callback) != null) {
            interfaceC54013LHt.LLLIIIIL();
        }
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA tab) {
        String str;
        int LIZIZ;
        ActivityC45651qj LIZLLL;
        List<ISocialTabProtocol> LIZLLL2;
        ISocialTabProtocol iSocialTabProtocol;
        int i;
        int i2;
        InterfaceC54013LHt interfaceC54013LHt;
        o.LJIIIZ(tab, "tab");
        Object obj = tab.LIZ;
        ISocialTabProtocol iSocialTabProtocol2 = null;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return;
        }
        KeyEvent.Callback callback = tab.LJFF;
        if ((callback instanceof InterfaceC54013LHt) && (interfaceC54013LHt = (InterfaceC54013LHt) callback) != null) {
            interfaceC54013LHt.LLLILZ();
        }
        if (o.LJ(str, this.LJLLI)) {
            this.LJLLI = "";
        }
        if (!o.LJ(str, "FRIENDS_FEED")) {
            InterfaceC54013LHt gb = gb("FRIENDS_FEED");
            if (gb != null) {
                i2 = gb.getDotCount();
            } else {
                i2 = 0;
            }
            C54029LIj.LIZIZ.LJJIJ(i2);
        }
        if (!o.LJ(str, "SOCIAL_NOWS")) {
            InterfaceC54013LHt gb2 = gb("SOCIAL_NOWS");
            if (gb2 != null) {
                i = gb2.getDotCount();
            } else {
                i = 0;
            }
            Z89.LIZIZ.LJ(i);
            ((LGH) ListProtector.get(this.LJLILLLLZI, 1)).LJJLJ(false);
        }
        List<ISocialTabProtocol> LIZLLL3 = LIZLLL();
        if (LIZLLL3 != null) {
            Iterator<ISocialTabProtocol> it = LIZLLL3.iterator();
            while (true) {
                if (it.hasNext()) {
                    iSocialTabProtocol = it.next();
                    if (o.LJ(iSocialTabProtocol.getTag(), str)) {
                        break;
                    }
                } else {
                    iSocialTabProtocol = null;
                    break;
                }
            }
            ISocialTabProtocol iSocialTabProtocol3 = iSocialTabProtocol;
            if (iSocialTabProtocol3 != null) {
                iSocialTabProtocol3.f(this.LJLJLLL);
                LGQ LLILIL = iSocialTabProtocol3.LLILIL();
                if (LLILIL != null) {
                    LLILIL.LIZIZ(this.LJLIL);
                }
                LGQ LLILIL2 = iSocialTabProtocol3.LLILIL();
                if (LLILIL2 != null) {
                    LLILIL2.LIZ(this.LJLILLLLZI);
                }
            }
        }
        InterfaceC54013LHt gb3 = gb(str);
        if (gb3 != null && gb3.getDotCount() > 0 && (LIZLLL2 = LIZLLL()) != null) {
            Iterator<ISocialTabProtocol> it2 = LIZLLL2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ISocialTabProtocol next = it2.next();
                if (o.LJ(next.getTag(), str)) {
                    iSocialTabProtocol2 = next;
                    break;
                }
            }
            ISocialTabProtocol iSocialTabProtocol4 = iSocialTabProtocol2;
            if (iSocialTabProtocol4 != null) {
                iSocialTabProtocol4.K(EnumC53981LGn.NUMBER_DOT);
            }
        }
        if (o.LJ(str, "SOCIAL_EXPLORE")) {
            Context context = this.LJLJJLL;
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                C84193Sd.LIZ(LJJIFFI).tv0(false);
            }
        }
        if (o.LJ(str, "FRIENDS_FEED")) {
            if (C54029LIj.LIZIZ.LIZ() && (LIZLLL = StateOwner.LJLIL.LIZLLL()) != null) {
                MainPageFragmentImpl.LJI().LIZJ(LIZLLL);
            }
            if (StateOwner.LJLIL.LIZLLL() != null && LHJ.LIZ.getBoolean("has_shown_permission_dialog", false)) {
                C54137LMn.LJII();
            }
            LHM.LIZIZ.LIZ().tryToShowForcePermissionDialog();
        } else {
            ActivityC45651qj LIZLLL4 = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL4 != null) {
                MainPageFragmentImpl.LJI().LJFF(LIZLLL4);
            }
        }
        Iterator<LHX> it3 = this.LJLJL.iterator();
        while (it3.hasNext()) {
            it3.next().ag(this.LJLJLLL, str);
        }
        this.LJLJLLL = str;
        int LIZIZ2 = C7MY.LIZIZ(36);
        if (o.LJ(this.LJLJLLL, "SOCIAL_NOWS")) {
            LIZIZ = C47959Irz.LIZJ(8, O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)) * 2);
        } else {
            LIZIZ = C7MY.LIZIZ(36);
        }
        int max = Math.max(LIZIZ2, LIZIZ);
        ViewParent parent = this.LJLJI.getParent();
        o.LJII(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
        LIZ.LJIIIZ(this.LJLJI.getId(), 6, constraintLayout.getId(), 6, max);
        LIZ.LJIIIZ(this.LJLJI.getId(), 7, constraintLayout.getId(), 7, max);
        LIZ.LIZIZ(constraintLayout);
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
        Object obj;
        List<ISocialTabProtocol> LIZLLL;
        ISocialTabProtocol iSocialTabProtocol = null;
        if (c78856UxA != null) {
            obj = c78856UxA.LIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof String) && obj != null && (LIZLLL = LIZLLL()) != null) {
            Iterator<ISocialTabProtocol> it = LIZLLL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ISocialTabProtocol next = it.next();
                if (o.LJ(next.getTag(), obj)) {
                    iSocialTabProtocol = next;
                    break;
                }
            }
            ISocialTabProtocol iSocialTabProtocol2 = iSocialTabProtocol;
            if (iSocialTabProtocol2 != null) {
                if (this.LJLL) {
                    this.LJLL = false;
                    iSocialTabProtocol2.Y();
                } else {
                    iSocialTabProtocol2.K(EnumC53981LGn.CLICK_TOP);
                    Iterator<LHY> it2 = this.LJLJLJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJ();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final boolean On(String str) {
        boolean z;
        boolean z2 = ActivityStack.getTopActivity() instanceof InterfaceC55058LjC;
        Context context = this.LJLJJLL;
        o.LJIIIIZZ(context, "context");
        IBottomTabLayoutAbility LJI = C53976LGi.LJI(context);
        if (LJI != null) {
            z = LJI.wY();
        } else {
            z = false;
        }
        if (!o.LJ(TO(), str) || !z || !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void g70(float f) {
        this.LJLJJL.setAlpha(f);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final InterfaceC54013LHt gb(String tag) {
        Object obj;
        KeyEvent.Callback callback;
        o.LJIIIZ(tag, "tag");
        int tabCount = this.LJLJI.getTabCount();
        if (tabCount < 0) {
            return null;
        }
        int i = 0;
        InterfaceC54013LHt interfaceC54013LHt = null;
        while (true) {
            C78856UxA tabAt = this.LJLJI.getTabAt(i);
            if (tabAt != null) {
                obj = tabAt.LIZ;
            } else {
                obj = null;
            }
            if (o.LJ(obj, tag)) {
                C78856UxA tabAt2 = this.LJLJI.getTabAt(i);
                if (tabAt2 != null) {
                    callback = tabAt2.LJFF;
                } else {
                    callback = null;
                }
                if (callback instanceof InterfaceC54013LHt) {
                    interfaceC54013LHt = (InterfaceC54013LHt) callback;
                } else {
                    interfaceC54013LHt = null;
                }
            }
            if (i != tabCount) {
                i++;
            } else {
                return interfaceC54013LHt;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void hp0(String str) {
        Object obj;
        InterfaceC54013LHt interfaceC54013LHt;
        int tabCount = this.LJLJI.getTabCount();
        KeyEvent.Callback callback = null;
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C78856UxA tabAt = this.LJLJI.getTabAt(i);
                if (tabAt != null) {
                    obj = tabAt.LIZ;
                } else {
                    obj = null;
                }
                if (o.LJ(obj, str)) {
                    C78856UxA tabAt2 = this.LJLJI.getTabAt(i);
                    if (tabAt2 != null) {
                        callback = tabAt2.LJFF;
                    }
                    if ((callback instanceof InterfaceC54013LHt) && (interfaceC54013LHt = (InterfaceC54013LHt) callback) != null) {
                        interfaceC54013LHt.LLLILZJ();
                        return;
                    }
                    return;
                }
                if (i == tabCount) {
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final boolean ma(String str) {
        return o.LJ(TO(), str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final Fragment pe(String str) {
        Context context = this.LJLJJLL;
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            return Hox.LJLLI.LIZ(LJJIFFI).Ja(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final C78856UxA ys(int i) {
        return this.LJLJI.getTabAt(i);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void i10(int i, boolean z) {
        this.LJLJJI.setCurrentItem(i, z);
    }

    public FriendsTabLayoutAbility(List list, List list2, C80261Vej c80261Vej, VW3 vw3, ConstraintLayout constraintLayout) {
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = c80261Vej;
        this.LJLJJI = vw3;
        this.LJLJJL = constraintLayout;
        this.LJLJJLL = c80261Vej.getContext();
    }
}
