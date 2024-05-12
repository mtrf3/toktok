package com.ss.android.ugc.feed.platform.panel.nonperson;

import X.AbstractC48820JEa;
import X.AbstractC55082Lja;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C35971E9v;
import X.C51031K1b;
import X.C51781KTx;
import X.C54980Lhw;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C90383gg;
import X.C9BD;
import X.EnumC221088m0;
import X.InterfaceC55102Lju;
import X.JAK;
import X.KU4;
import X.LZ3;
import X.LZ4;
import X.OSZ;
import X.X1D;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedNonPersonalizedComponent extends BasePanelComponent implements IFeedNonPersonalizedAbility, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLJL = 0;
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public OSZ<String, Integer> LJLJJL;
    public final C5H3 LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedNonPersonalizedComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        C62822Ol8 c62822Ol83;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NonPersonalizedVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 739), LZ4.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(LZ3.LJLIL);
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 738));
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 740), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 1));
        }
        this.LJLJI = c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 741), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 2));
        }
        this.LJLJJI = c62822Ol82;
        if (JAK.LIZ()) {
            C221138m5 c221138m53 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 742), null);
            C51781KTx.LIZJ(this, c221138m53);
            c62822Ol83 = c221138m53;
        } else {
            c62822Ol83 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 3));
        }
        this.LJLJJLL = c62822Ol83;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final boolean el0() {
        if (!v3(2)) {
            return false;
        }
        IPageStateAbility iPageStateAbility = (IPageStateAbility) this.LJLJJI.getValue();
        if (iPageStateAbility != null) {
            iPageStateAbility.A90(true);
        }
        x3().LJIIIIZZ("interceptShowLoading...");
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1236297514) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final void yR() {
        if (!v3(4)) {
            return;
        }
        this.LJLJJL = null;
        ((NonPersonalizedVM) this.LJLIL.getValue()).gv0();
        x3().LJIIIIZZ("notifyOnRefreshResult>>> showToast");
    }

    public final AbstractC48820JEa x3() {
        return (AbstractC48820JEa) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final boolean eW() {
        C51031K1b<?> c51031K1b;
        T t;
        boolean z;
        boolean z2 = false;
        if (!C35971E9v.LIZ()) {
            return false;
        }
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LJLJI.getValue();
        if (iFeedFetchDataAbility != null) {
            c51031K1b = iFeedFetchDataAbility.Qv();
        } else {
            c51031K1b = null;
        }
        if (c51031K1b instanceof C54980Lhw) {
            if (c51031K1b != null && (t = c51031K1b.LJLIL) != 0) {
                T t2 = t.mData;
                if (t2 == 0) {
                    z = false;
                } else {
                    z = ((FeedItemList) t2).isNonPersonalized;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (valueOf != null && !(((Boolean) new AqS159S0100000_9(valueOf, 737).invoke()).booleanValue() ^ C90383gg.LIZ())) {
                    AbstractC48820JEa x3 = x3();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("changeNonPersonalized>>> error. dataState:");
                    LIZ.append(valueOf);
                    x3.LJIIL(X1D.LIZIZ(LIZ));
                }
            }
        } else {
            c51031K1b = null;
        }
        this.LJLJJL = new OSZ<>(getPanelContext().LIZ, 6);
        if (c51031K1b == null) {
            x3().LJIIL("changeNonPersonalized>>> feedFetchPresenter=null");
        }
        if (c51031K1b != null) {
            z2 = c51031K1b.LJIILL(1, 0, 1, Boolean.FALSE);
        }
        x3().LJIIIIZZ("changeNonPersonalized>>> sendRequest:" + z2);
        return true;
    }

    public final boolean v3(int i) {
        OSZ<String, Integer> osz = this.LJLJJL;
        if (osz != null && o.LJ(osz.getFirst(), getPanelContext().LIZ) && (osz.getSecond().intValue() & i) != 0) {
            this.LJLJJL = osz.copy(osz.getFirst(), Integer.valueOf((~i) | osz.getSecond().intValue()));
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility
    public final void yP(Exception exc) {
        IPlayerComponentAbility playerComponentAbility;
        AbstractC55082Lja abstractFeedAdapter;
        if (!v3(4)) {
            return;
        }
        this.LJLJJL = null;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJLL.getValue();
        if (iFeedPanelPlatformAbility != null && (abstractFeedAdapter = iFeedPanelPlatformAbility.getAbstractFeedAdapter()) != null) {
            abstractFeedAdapter.setData(new ArrayList());
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LJLJJLL.getValue();
        if (iFeedPanelPlatformAbility2 != null && (playerComponentAbility = iFeedPanelPlatformAbility2.getPlayerComponentAbility()) != null) {
            playerComponentAbility.stopPlayer();
        }
        IPageStateAbility iPageStateAbility = (IPageStateAbility) this.LJLJJI.getValue();
        if (iPageStateAbility != null) {
            iPageStateAbility.Nk0(false);
        }
        IPageStateAbility iPageStateAbility2 = (IPageStateAbility) this.LJLJJI.getValue();
        if (iPageStateAbility2 != null) {
            iPageStateAbility2.Ic0(exc);
        }
        x3().LJIIIIZZ("notifyShowLoadError...");
    }
}
