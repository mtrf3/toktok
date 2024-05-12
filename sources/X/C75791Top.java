package X;

import Y.ARunnableS4S1400000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Top, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75791Top implements InterfaceC76125TuD {
    public long LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public View LJLJL;
    public C75794Tos LJLLJ;
    public InterfaceC75579TlP LJLLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C75802Tp0.LJLIL);
    public final java.util.Map<String, LinkPlayerInfo> LJLJJL = new LinkedHashMap();
    public final java.util.Map<String, Integer> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C75801Toz.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C75798Tow.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C75800Toy.LJLIL);
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C75799Tox.LJLIL);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C75797Tov.LJLIL);

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76125TuD
    public final void LJJJJZ(SeiAppData data) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    public final CopyOnWriteArrayList<AbstractC75784Toi> LIZ() {
        return (CopyOnWriteArrayList) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC76125TuD
    public final void release() {
        InterfaceC75579TlP interfaceC75579TlP = this.LJLLL;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.A9(true);
        }
        this.LJLLL = null;
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 56));
    }

    public final void LIZJ(InterfaceC75179Tex interfaceC75179Tex) {
        AbstractC75784Toi abstractC75784Toi;
        Object obj;
        int i = C75730Tnq.LIZ[interfaceC75179Tex.LJJIL().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4 && i != 5) {
                return;
            }
            CopyOnWriteArrayList<AbstractC75784Toi> LIZ = LIZ();
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC75784Toi> it = LIZ.iterator();
            while (it.hasNext()) {
                AbstractC75784Toi next = it.next();
                if (next instanceof C75792Toq) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                abstractC75784Toi = null;
                if (it2.hasNext()) {
                    obj = it2.next();
                    C75792Toq c75792Toq = (C75792Toq) obj;
                    if (o.LJ(c75792Toq.LIZLLL, interfaceC75179Tex.LJJ()) && c75792Toq.LIZJ && o.LJ(c75792Toq.LIZIZ, interfaceC75179Tex.LJJIJIL())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C75792Toq c75792Toq2 = (C75792Toq) obj;
            if (c75792Toq2 != null) {
                LIZLLL(c75792Toq2);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            String LJJ = interfaceC75179Tex.LJJ();
            if (LJJ == null) {
                return;
            }
            C75792Toq c75792Toq3 = new C75792Toq(LJJ);
            interfaceC75179Tex.LJJIJIL().removeAllViews();
            c75792Toq3.LJ(interfaceC75179Tex.LJJIJIL());
            Iterator<AbstractC75784Toi> it3 = LIZ().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC75784Toi next2 = it3.next();
                if (o.LJ(next2.LIZ(), LJJ)) {
                    abstractC75784Toi = next2;
                    break;
                }
            }
            AbstractC75784Toi abstractC75784Toi2 = abstractC75784Toi;
            if (abstractC75784Toi2 != null) {
                LIZ().remove(abstractC75784Toi2);
                ((ConcurrentHashMap) this.LJLJLLL.getValue()).remove(abstractC75784Toi2.LIZ());
            }
            LIZ().add(c75792Toq3);
            ((ConcurrentHashMap) this.LJLJLLL.getValue()).put(LJJ, c75792Toq3);
            LIZLLL(c75792Toq3);
            return;
        }
        String str = this.LJLJJI;
        if (str == null) {
            return;
        }
        C75795Tot c75795Tot = new C75795Tot(str);
        interfaceC75179Tex.LJJIJIL().removeAllViews();
        c75795Tot.LJ(interfaceC75179Tex.LJJIJIL());
        LIZ().add(c75795Tot);
    }

    public final void LIZLLL(C75792Toq c75792Toq) {
        User user;
        EnumC32197CkL enumC32197CkL;
        User user2;
        String str;
        C75794Tos c75794Tos;
        EnumC32197CkL enumC32197CkL2;
        View findViewById;
        TextView textView;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        View findViewById9;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChatFeedHandler#updateExistMask#");
        LIZ.append(c75792Toq.LIZLLL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((LinkedHashMap) this.LJLJJL).get(c75792Toq.LIZLLL));
        LIZ2.append(' ');
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) ((LinkedHashMap) this.LJLJJL).get(c75792Toq.LIZLLL);
        C75330ThO c75330ThO = null;
        if (linkPlayerInfo != null) {
            user = linkPlayerInfo.mUser;
        } else {
            user = null;
        }
        LIZ2.append(user);
        LIZ2.append(' ');
        LIZ2.append(this.LJLJJI);
        LIZ2.append(' ');
        C75794Tos c75794Tos2 = this.LJLLJ;
        if (c75794Tos2 != null) {
            enumC32197CkL = c75794Tos2.LJI;
        } else {
            enumC32197CkL = null;
        }
        LIZ2.append(enumC32197CkL);
        C0NB.LIZIZ(LIZIZ, X1D.LIZIZ(LIZ2));
        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) ((LinkedHashMap) this.LJLJJL).get(c75792Toq.LIZLLL);
        if (linkPlayerInfo2 == null || (user2 = linkPlayerInfo2.mUser) == null || (str = this.LJLJJI) == null || (c75794Tos = this.LJLLJ) == null || (enumC32197CkL2 = c75794Tos.LJI) == null) {
            return;
        }
        boolean LJ = o.LJ(c75792Toq.LIZLLL, this.LJLJI);
        long id = user2.getId();
        String str2 = c75792Toq.LIZLLL;
        String LIZ3 = C05170If.LIZ(user2);
        o.LJIIIIZZ(LIZ3, "getDisplayName(userInfo)");
        C75793Tor c75793Tor = new C75793Tor(enumC32197CkL2, LJ, str, user2.getAvatarThumb(), new C75330ThO(id, str2, LIZ3));
        if (c75793Tor.LIZIZ) {
            ViewGroup viewGroup = c75792Toq.LIZ;
            if (viewGroup != null && (findViewById9 = viewGroup.findViewById(R.id.hay)) != null) {
                C87277YNd.LJJIJ(findViewById9);
            }
        } else {
            ViewGroup viewGroup2 = c75792Toq.LIZ;
            if (viewGroup2 != null && (findViewById = viewGroup2.findViewById(R.id.hay)) != null) {
                C87277YNd.LJJIIZ(findViewById);
            }
        }
        if (c75793Tor.LIZ == EnumC32197CkL.SEARCH) {
            ViewGroup viewGroup3 = c75792Toq.LIZ;
            if (viewGroup3 != null && (findViewById8 = viewGroup3.findViewById(R.id.hay)) != null) {
                C87277YNd.LJJIIZ(findViewById8);
            }
            ViewGroup viewGroup4 = c75792Toq.LIZ;
            if (viewGroup4 != null && (findViewById7 = viewGroup4.findViewById(R.id.hb3)) != null) {
                C87277YNd.LJJIIZ(findViewById7);
            }
            ViewGroup viewGroup5 = c75792Toq.LIZ;
            if (viewGroup5 != null && (findViewById6 = viewGroup5.findViewById(R.id.hiv)) != null) {
                C87277YNd.LJJIIZ(findViewById6);
            }
            ViewGroup viewGroup6 = c75792Toq.LIZ;
            if (viewGroup6 != null && (findViewById5 = viewGroup6.findViewById(R.id.hba)) != null) {
                C87277YNd.LJJIIZ(findViewById5);
            }
            ViewGroup viewGroup7 = c75792Toq.LIZ;
            if (viewGroup7 != null && (findViewById4 = viewGroup7.findViewById(R.id.ajj)) != null) {
                C87277YNd.LJJIIZ(findViewById4);
            }
            ViewGroup viewGroup8 = c75792Toq.LIZ;
            if (viewGroup8 != null && (findViewById3 = viewGroup8.findViewById(R.id.crm)) != null) {
                C87277YNd.LJJIIZ(findViewById3);
            }
            ViewGroup viewGroup9 = c75792Toq.LIZ;
            if (viewGroup9 != null && (findViewById2 = viewGroup9.findViewById(R.id.h1a)) != null) {
                C87277YNd.LJJIIZ(findViewById2);
            }
        }
        String str3 = c75793Tor.LIZJ;
        C75330ThO c75330ThO2 = c75793Tor.LJ;
        ImageModel imageModel = c75793Tor.LIZLLL;
        C75793Tor c75793Tor2 = c75792Toq.LJ;
        if (c75793Tor2 != null) {
            c75330ThO = c75793Tor2.LJ;
        }
        if ((!o.LJ(c75330ThO2, c75330ThO)) && c75330ThO2 != null) {
            ViewGroup viewGroup10 = c75792Toq.LIZ;
            if (viewGroup10 != null && (textView = (TextView) viewGroup10.findViewById(R.id.h1d)) != null) {
                textView.setText(c75330ThO2.LJLJI);
            }
            ViewGroup viewGroup11 = c75792Toq.LIZIZ;
            if (viewGroup11 != null) {
                TV3.LJIILL(viewGroup11, new ARunnableS4S1400000_13(viewGroup11, str3, c75792Toq, imageModel, c75793Tor, 0));
            }
        }
        c75792Toq.LJ = c75793Tor;
        Integer num = (Integer) ((LinkedHashMap) this.LJLJJLL).get(c75792Toq.LIZLLL);
        if (num == null) {
            return;
        }
        c75792Toq.LJI(num.intValue());
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d0, code lost:
    
        if (r9 != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0192  */
    @Override // X.InterfaceC76125TuD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJI(X.InterfaceC75804Tp2 r24) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75791Top.LJJLIIIJJI(X.Tp2):void");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
        Iterator it = windows.iterator();
        while (it.hasNext()) {
            LIZJ((InterfaceC75179Tex) it.next());
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76125TuD
    public final void LLILLL(FrameLayout frameLayout, OSZ<Integer, Integer> osz) {
        if (this.LJLJL == null) {
            View view = new View(frameLayout.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            view.setBackgroundColor(ColorProtector.parseColor("#151723"));
            this.LJLJL = view;
            InterfaceC75579TlP interfaceC75579TlP = this.LJLLL;
            if (interfaceC75579TlP != null) {
                interfaceC75579TlP.n1(frameLayout, null, osz);
            }
        }
        frameLayout.setClipChildren(false);
        View view2 = this.LJLJL;
        if (view2 != null) {
            TV3.LJIILIIL(1, view2, frameLayout);
        }
    }

    public final void LIZIZ(C75794Tos c75794Tos, InterfaceC75579TlP interfaceC75579TlP, C74994Tby audienceModel, InterfaceC32199CkN interfaceC32199CkN) {
        o.LJIIIZ(audienceModel, "audienceModel");
        this.LJLLJ = c75794Tos;
        CopyOnWriteArrayList<AbstractC75784Toi> LIZ = LIZ();
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC75784Toi> it = LIZ.iterator();
        while (it.hasNext()) {
            AbstractC75784Toi next = it.next();
            if (next instanceof C75792Toq) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZLLL((C75792Toq) it2.next());
        }
        this.LJLLL = interfaceC75579TlP;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.LIZIZ();
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        C75240Tfw.LIZ(window, oldState, newState, actionType);
        LIZJ(window);
    }
}
