package kotlin.jvm.internal;

import X.AbstractC57896Mns;
import X.AbstractC65781Prl;
import X.C242699fl;
import X.C242719fn;
import X.C43I;
import X.C52454KiI;
import X.C57816Mma;
import X.C57826Mmk;
import X.C57830Mmo;
import X.C57831Mmp;
import X.C57846Mn4;
import X.C57851Mn9;
import X.C76800UCe;
import X.C7EI;
import X.EnumC53719L6l;
import X.EnumC57435MgR;
import X.InterfaceC57910Mo6;
import X.InterfaceC88472Yns;
import X.MSJ;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.InboxHorizontalListState;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class AqS58S0201000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        int i;
        C242719fn setState = (C242719fn) obj;
        o.LJIIIZ(setState, "$this$setState");
        Aweme aweme = (Aweme) aqS58S0201000_9.l0;
        if (aweme != null) {
            try {
                i = ((FeedSkylightListViewModel) aqS58S0201000_9.l1).gv0(aqS58S0201000_9.i2, aweme);
            } catch (Exception unused) {
                i = -1;
            }
        } else {
            i = aqS58S0201000_9.i2;
        }
        return C242719fn.LIZ(setState, null, new C43I(Integer.valueOf(i)), null, 5);
    }

    public static final Object invoke$1(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        int i;
        C242699fl setState = (C242699fl) obj;
        o.LJIIIZ(setState, "$this$setState");
        Aweme aweme = (Aweme) aqS58S0201000_9.l0;
        if (aweme != null) {
            try {
                i = ((FollowStorySkylightVM) aqS58S0201000_9.l1).gv0(aqS58S0201000_9.i2, aweme);
            } catch (Exception unused) {
                i = -1;
            }
        } else {
            i = aqS58S0201000_9.i2;
        }
        return C242699fl.LIZ(setState, null, new C43I(Integer.valueOf(i)), 1);
    }

    public static final Object invoke$2(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        int i;
        InboxSkylightListState setState = (InboxSkylightListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        Aweme aweme = (Aweme) aqS58S0201000_9.l0;
        if (aweme != null) {
            try {
                i = ((SkylightListViewModel) aqS58S0201000_9.l1).iv0(aqS58S0201000_9.i2, aweme);
            } catch (Exception unused) {
                i = -1;
            }
        } else {
            i = aqS58S0201000_9.i2;
        }
        return InboxSkylightListState.copy$default(setState, null, new C43I(Integer.valueOf(i)), null, null, null, 29, null);
    }

    public static final Object invoke$3(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        int i;
        InboxSkylightListState setState = (InboxSkylightListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        Aweme aweme = (Aweme) aqS58S0201000_9.l0;
        if (aweme != null) {
            try {
                i = ((SkylightMediaListViewModel) aqS58S0201000_9.l1).iv0(aweme);
            } catch (Exception unused) {
                i = -1;
            }
        } else {
            i = aqS58S0201000_9.i2;
        }
        return InboxSkylightListState.copy$default(setState, null, new C43I(Integer.valueOf(i)), null, null, null, 29, null);
    }

    public static final Object invoke$4(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        int i;
        InboxHorizontalListState setState = (InboxHorizontalListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        Aweme aweme = (Aweme) aqS58S0201000_9.l0;
        if (aweme != null) {
            try {
                i = ((InboxTopHorizontalListVM) aqS58S0201000_9.l1).jv0(aqS58S0201000_9.i2, aweme);
            } catch (Exception unused) {
                i = -1;
            }
        } else {
            i = aqS58S0201000_9.i2;
        }
        return InboxHorizontalListState.copy$default(setState, null, new C43I(Integer.valueOf(i)), null, null, null, 29, null);
    }

    public static final Object invoke$5(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        C57851Mn9 c57851Mn9;
        C57846Mn4 configUI = (C57846Mn4) obj;
        o.LJIIIZ(configUI, "$this$configUI");
        configUI.LIZ = aqS58S0201000_9.i2;
        if (!(((AbstractC57896Mns) aqS58S0201000_9.l0) instanceof MSJ)) {
            configUI.LJIJJLI = 202;
        }
        boolean z = false;
        if (C52454KiI.LIZ()) {
            c57851Mn9 = new C57851Mn9(R.string.hc_, R.attr.go, 42, 8);
        } else {
            c57851Mn9 = new C57851Mn9(0, 0, 0, 15);
        }
        configUI.LJIIIIZZ = c57851Mn9;
        configUI.LJI = new C57816Mma((UserCardAdapterWidget) aqS58S0201000_9.l1);
        configUI.LJIL = C7EI.LIZ(EnumC53719L6l.INBOX_SUGGESTED_ACCOUNT);
        if (((UserCardAdapterWidget) aqS58S0201000_9.l1).LJLJL != 2) {
            z = true;
        }
        configUI.LJJII = z;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS58S0201000_9 aqS58S0201000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        if (((EnumC57435MgR) aqS58S0201000_9.l0) == EnumC57435MgR.UNFOLLOW) {
            it.kR(new C57831Mmp(aqS58S0201000_9.i2, ((C57826Mmk) aqS58S0201000_9.l1).LJLJI));
        } else {
            it.kR(new C57830Mmo(aqS58S0201000_9.i2, ((C57826Mmk) aqS58S0201000_9.l1).LJLJI));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(int i, EnumC57435MgR enumC57435MgR, C57826Mmk c57826Mmk, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC57435MgR;
        this.l1 = c57826Mmk;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(int i, AbstractC57896Mns abstractC57896Mns, UserCardAdapterWidget userCardAdapterWidget, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = abstractC57896Mns;
        this.l1 = userCardAdapterWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(int i, Aweme aweme, SkylightMediaListViewModel skylightMediaListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = aweme;
        this.l1 = skylightMediaListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(Aweme aweme, int i, FeedSkylightListViewModel feedSkylightListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i2 = i;
        this.l1 = feedSkylightListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(Aweme aweme, int i, FollowStorySkylightVM followStorySkylightVM, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i2 = i;
        this.l1 = followStorySkylightVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(Aweme aweme, int i, SkylightListViewModel skylightListViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i2 = i;
        this.l1 = skylightListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S0201000_9(Aweme aweme, int i, InboxTopHorizontalListVM inboxTopHorizontalListVM, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.i2 = i;
        this.l1 = inboxTopHorizontalListVM;
    }
}
