package com.ss.android.ugc.aweme.base.assem;

import X.AbstractC030109x;
import X.C0A2;
import X.C141335gf;
import X.C184077Kh;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C32151Nz;
import X.C3C5;
import X.C3F2;
import X.C47704Ins;
import X.C47959Irz;
import X.C53729L6v;
import X.C54602Lbq;
import X.C54624LcC;
import X.C54625LcD;
import X.C54627LcF;
import X.C54632LcK;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55749LuL;
import X.C55953Lxd;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C8W0;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.L7K;
import X.LYJ;
import X.O6R;
import X.SYL;
import X.TBT;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.business.story.cell.StorySkylightCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS0S2013000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSkylightListAssem extends UIListContentAssem<FeedSkylightListViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214378bB LJLILLLLZI;
    public final C214378bB LJLJI;
    public final C55749LuL LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;

    public FeedSkylightListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        InterfaceC65784Pro LJIILJJIL2;
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 67));
        C54627LcF c54627LcF = C54627LcF.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSkylightListViewModel.class);
        C54624LcC c54624LcC = C54624LcC.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS159S0100000_9((C8W0) this, 68);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        AqS60S0110000_3 LJIIZILJ = C78926UyI.LJIIZILJ(this, true);
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLILLLLZI = new C214378bB(LIZ, c54627LcF, c214528bQ, LJJII, c184077Kh, c54624LcC, LJIILJJIL, LJIIZILJ);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedSkylightContainerViewModel.class);
        C54625LcD c54625LcD = C54625LcD.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL2 = new AqS159S0100000_9((C8W0) this, 69);
        } else {
            LJIILJJIL2 = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJI = new C214378bB(LIZ2, null, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c54625LcD, LJIILJJIL2, C78926UyI.LJIIZILJ(this, true));
        this.LJLJJI = new C55749LuL(C47704Ins.LJ(this, C54602Lbq.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLJJLL = true;
    }

    public final C54602Lbq C3() {
        return (C54602Lbq) this.LJLJJI.getValue();
    }

    public final FeedSkylightContainerViewModel E3() {
        return (FeedSkylightContainerViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final FeedSkylightListViewModel A3() {
        return (FeedSkylightListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        return c57939MoZ;
    }

    public final void I3(int i) {
        if (i >= 0 && i < v3().getState().LJIIIIZZ()) {
            C0A2 layoutManager = v3().getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).LJFF(i, 0);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object LIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        v3.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        v3.setLayoutManager(linearLayoutManager);
        AbstractC030109x itemAnimator = v3.getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        itemAnimator.LJFF = 350L;
        try {
            Field declaredField = itemAnimator.getClass().getDeclaredField("sDefaultInterpolator");
            declaredField.setAccessible(true);
            declaredField.set(null, C55953Lxd.LIZLLL());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        v3().LLLF.LJZL(StorySkylightCell.class);
        v3.requestDisallowInterceptTouchEvent(true);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.9fp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C242719fn c242719fn = (C242719fn) obj;
                c242719fn.getClass();
                return C208708Ha.LIZLLL(c242719fn);
            }
        }, null, new AqS175S0100000_9(this, 584), C54632LcK.LJLIL, new AqS175S0100000_9(this, 586), 2, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9fq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242719fn) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 215), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9fo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242719fn) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 103), 4);
        C8YN.LJII(this, E3(), new TBT() { // from class: X.LcE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54617Lc5) obj).LJLIL;
            }
        }, null, new AqS191S0100000_9(this, 101), 6);
        C8YN.LJII(this, E3(), new TBT() { // from class: X.LcB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54617Lc5) obj).LJLJI;
            }
        }, null, new AqS191S0100000_9(this, 102), 6);
    }

    public final void H3(String enterMethod, boolean z) {
        String str;
        int LIZJ;
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        String str6;
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        int LJJJJLI = C63081OpJ.LJJJJLI(context);
        String str7 = "";
        if (z) {
            this.LJLJJL = System.currentTimeMillis();
            boolean z2 = L7K.LJFF;
            Iterator it = ((ArrayList) LYJ.LIZ).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Aweme aweme = (Aweme) obj;
                    if (C54838Lfe.LJIIJJI(aweme.getAuthorUid()) && C54838Lfe.LJIJI(aweme)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (z2 && obj != null) {
                C54602Lbq C3 = C3();
                if (C3 == null || (str6 = C3.LJLIL) == null) {
                    str6 = "";
                }
                C53729L6v.LIZIZ("story_creation_cell_show", new AqS32S1000000_9(str6, 1));
            }
            if (this.LJLJJLL) {
                C54602Lbq C32 = C3();
                if (C32 != null && (str5 = C32.LJLIL) != null) {
                    str7 = str5;
                }
                int LIZ = LYJ.LIZ();
                int i = LYJ.LIZLLL;
                boolean LIZJ2 = LYJ.LIZJ();
                o.LJIIIZ(enterMethod, "enterMethod");
                C53729L6v.LIZIZ("enter_topwindow", new AqS0S2013000_9(str7, 0, LIZJ2, LIZ, i, enterMethod, 0));
            }
            C54602Lbq C33 = C3();
            if (C33 != null) {
                str4 = C33.LJLIL;
            } else {
                str4 = null;
            }
            if (o.LJ(str4, "homepage_friends") && this.LJLJJLL) {
                IFriendsSkylightAbility iFriendsSkylightAbility = (IFriendsSkylightAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IFriendsSkylightAbility.class, null);
                if (iFriendsSkylightAbility != null) {
                    iFriendsSkylightAbility.Yf0();
                }
                this.LJLJJLL = false;
            }
            LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) + C7MY.LIZIZ(173) + LJJJJLI;
        } else {
            if (this.LJLJJL != 0) {
                C54602Lbq C34 = C3();
                if (C34 != null && (str3 = C34.LJLIL) != null) {
                    str7 = str3;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL;
                C54602Lbq C35 = C3();
                if (C35 != null) {
                    str2 = C35.LJLIL;
                } else {
                    str2 = null;
                }
                C53729L6v.LIZIZ("skylight_show_duration", new C3F2(C53729L6v.LIZ(str2), str7, currentTimeMillis));
            }
            C54602Lbq C36 = C3();
            if (C36 != null) {
                str = C36.LJLIL;
            } else {
                str = null;
            }
            if (o.LJ(str, "homepage_friends")) {
                IFriendsSkylightAbility iFriendsSkylightAbility2 = (IFriendsSkylightAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IFriendsSkylightAbility.class, null);
                if (iFriendsSkylightAbility2 != null) {
                    iFriendsSkylightAbility2.D00();
                }
                this.LJLJJLL = true;
            }
            LIZJ = C47959Irz.LIZJ(58, LJJJJLI);
        }
        publishService.moveProgress(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), LIZJ);
    }
}
