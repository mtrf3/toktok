package com.ss.android.ugc.aweme.upvote.detail.repostlist;

import X.AbstractC029409q;
import X.AbstractC029609s;
import X.ActivityC45651qj;
import X.AnonymousClass780;
import X.AnonymousClass787;
import X.AnonymousClass788;
import X.C0A2;
import X.C184077Kh;
import X.C212428Vi;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C2K0;
import X.C47704Ins;
import X.C4LD;
import X.C50420Jqa;
import X.C53765L8f;
import X.C55096Ljo;
import X.C55749LuL;
import X.C57092Lx;
import X.C57939MoZ;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C78F;
import X.C78H;
import X.C78I;
import X.C78K;
import X.C8W0;
import X.C8YN;
import X.C9XU;
import X.G27;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.LFH;
import X.SYL;
import X.TBT;
import X.X1D;
import Y.IDcS7S0200000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.upvote.IRepostListAbility;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS122S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RepostListAssem extends UIListContentAssem implements G27, IRepostListAbility, InterfaceC72642tA, InterfaceC55102Lju {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C214378bB LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 506101717) {
            return null;
        }
        return this;
    }

    public RepostListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C78F.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1171));
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1175);
        C65776Prg LIZ = C65352Pkq.LIZ(RepostListViewModel.class);
        C78I c78i = C78I.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1172);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJI = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c78i, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1174));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1173));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1170));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1169));
    }

    public final C78F C3() {
        return (C78F) this.LJLIL.getValue();
    }

    public final C73305Spp F3() {
        return (C73305Spp) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public final RepostListViewModel A3() {
        return (RepostListViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 3;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        c57939MoZ.LJI = "repost_tab";
        return c57939MoZ;
    }

    public final String E3() {
        AnonymousClass787 anonymousClass787;
        C78F C3 = C3();
        if (C3 != null && (anonymousClass787 = C3.LJLJI) != null) {
            int i = AnonymousClass788.LIZ[anonymousClass787.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "personal_reposted_tab";
                }
            } else {
                return "reposted_detail_list";
            }
        }
        return "";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str;
        super.onCreate();
        C78F C3 = C3();
        String str2 = null;
        if (C3 != null) {
            str = C3.LJLIL;
        } else {
            str = null;
        }
        AnonymousClass780.LIZ(str);
        GScope gScope = GScope.LJLIL;
        C78F C32 = C3();
        if (C32 != null) {
            str2 = C32.LJLIL;
        }
        C55096Ljo.LJIIJJI(gScope, this, IRepostListAbility.class, AnonymousClass780.LIZ(str2));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        String str;
        super.onDestroy();
        GScope gScope = GScope.LJLIL;
        C78F C3 = C3();
        if (C3 != null) {
            str = C3.LJLIL;
        } else {
            str = null;
        }
        C55096Ljo.LJIILL(gScope, IRepostListAbility.class, AnonymousClass780.LIZ(str));
    }

    public final void I3(boolean z) {
        if (z || v3().getState().LJIIIIZZ() == 0) {
            v3().setVisibility(8);
            F3().setVisibility(0);
            F3().LJFF();
        } else {
            v3().setVisibility(0);
            F3().setVisibility(8);
        }
        A3().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.upvote.IRepostListAbility
    public final void Jf0(String str) {
        Aweme i6 = AwemeService.LIZ().i6(str);
        o.LJI(i6);
        A3().listAddItemAt(0, new C78K(i6));
    }

    public final void K3(boolean z) {
        String str;
        if (z) {
            C73306Spq c73306Spq = (C73306Spq) this.LJLJJLL.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("show status: ");
            if (o.LJ(c73306Spq, this.LJLJJL.getValue())) {
                str = "error";
            } else {
                str = "empty";
            }
            LIZ.append(str);
            C78H.LIZ(X1D.LIZIZ(LIZ));
            v3().setVisibility(8);
            F3().setVisibility(0);
            F3().setStatus(c73306Spq);
            return;
        }
        F3().setVisibility(8);
        v3().setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.upvote.IRepostListAbility
    public final void Oa0(String str) {
        if (str == null) {
            return;
        }
        A3().deleteItemByAid(str);
    }

    @Override // X.InterfaceC72642tA
    public final void onInternalEvent(Object obj) {
        C50420Jqa c50420Jqa = (C50420Jqa) obj;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && c50420Jqa != null) {
            C4LD.LIZIZ.LJJII(LIZLLL, c50420Jqa);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AnonymousClass787 anonymousClass787;
        o.LJIIIZ(view, "view");
        F3().LJFF();
        v3().LLLF.LJZL(RepostListCell.class);
        String str = null;
        v3().setItemAnimator(null);
        AbstractC029409q adapter = v3().getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC029609s() { // from class: X.78J
                @Override // X.AbstractC029609s
                public final void LJFF(int i, int i2) {
                    if (i == 0 && i2 == 1) {
                        RepostListAssem.this.v3().LJLI(0);
                    }
                }
            });
        }
        SYL v3 = v3();
        v3().getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
        gridLayoutManager.LLIILII = new IDcS7S0200000_3(this, gridLayoutManager, 8);
        v3.setLayoutManager(gridLayoutManager);
        C78F C3 = C3();
        if (C3 != null) {
            anonymousClass787 = C3.LJLJI;
        } else {
            anonymousClass787 = null;
        }
        if (anonymousClass787 == AnonymousClass787.PROFILE_TAB_REPOSTED_LIST && !C53765L8f.LJIIJJI()) {
            SYL v32 = v3();
            C57092Lx.LIZ.getClass();
            v32.setPadding(0, 0, 0, C61447O9r.LIZ());
        }
        super.onViewCreated(view);
        RepostListViewModel A3 = A3();
        C78F C32 = C3();
        if (C32 != null) {
            str = C32.LJLIL;
        }
        A3.LJLJJI = str;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZ(LIZ.hashCode(), this);
        }
        C8YN.LJII(this, A3(), new TBT() { // from class: X.78C
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass783) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 108), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.78E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                AnonymousClass783 anonymousClass783 = (AnonymousClass783) obj;
                anonymousClass783.getClass();
                return C208708Ha.LIZ(anonymousClass783);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 109), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.789
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass783) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 110), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.78B
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass783) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 111), 4);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.78D
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                AnonymousClass783 anonymousClass783 = (AnonymousClass783) obj;
                anonymousClass783.getClass();
                return C208708Ha.LIZLLL(anonymousClass783);
            }
        }, null, new AqS169S0100000_3(this, 523), null, new AqS169S0100000_3(this, 524), 10, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.78G
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                AnonymousClass783 anonymousClass783 = (AnonymousClass783) obj;
                anonymousClass783.getClass();
                return C208708Ha.LIZJ(anonymousClass783);
            }
        }, null, new AqS169S0100000_3(this, 525), null, null, 26, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.78A
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass783) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS122S0300000_3(C212428Vi.LIZLLL(this), this, this, 3), 4);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        C0A2 layoutManager = v3().getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
            return;
        }
        gridLayoutManager.LLJLIL(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
    }
}
