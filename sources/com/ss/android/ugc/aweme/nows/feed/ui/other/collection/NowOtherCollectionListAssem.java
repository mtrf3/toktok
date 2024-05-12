package com.ss.android.ugc.aweme.nows.feed.ui.other.collection;

import X.AbstractC28951Br;
import X.AbstractC72278SYg;
import X.AnonymousClass391;
import X.C0A6;
import X.C181847Bs;
import X.C185117Oh;
import X.C194567kK;
import X.C195177lJ;
import X.C195237lP;
import X.C195377ld;
import X.C195387le;
import X.C195397lf;
import X.C195407lg;
import X.C195417lh;
import X.C195427li;
import X.C195467lm;
import X.C195487lo;
import X.C195507lq;
import X.C195517lr;
import X.C195527ls;
import X.C195537lt;
import X.C195547lu;
import X.C195557lv;
import X.C195627m2;
import X.C195807mK;
import X.C19N;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C26338AVi;
import X.C30591Hz;
import X.C32I;
import X.C47704Ins;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55749LuL;
import X.C57939MoZ;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65314PkE;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C73849Syb;
import X.C7ML;
import X.C7MY;
import X.C82B;
import X.C8VR;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC195587ly;
import X.InterfaceC57784Mm4;
import X.InterfaceC74236TBo;
import X.ORZ;
import X.SYL;
import X.TBR;
import X.TBT;
import Y.ARunnableS7S0101000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.ability.NowListAbility;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostImagePowerCell;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostVideoPowerCell;
import com.ss.android.ugc.aweme.nows.feed.event.NowEventRegistry;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.AggregatedViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowOtherCollectionListAssem extends ReusedUIContentAssem<NowOtherCollectionListAssem> implements C8XO<C195627m2>, NowOtherCollectionAbility {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public SYL LJZL;
    public C195807mK LL;
    public Integer LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public ARunnableS7S0101000_3 LLFZ;
    public final C62822Ol8 LLI;
    public final C55749LuL LLIFFJFJJ;
    public final C5H3 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;

    static {
        TBT tbt = new TBT(NowOtherCollectionListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowOtherCollectionListViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowOtherCollectionListAssem.class, "aggregatedViewModel", "getAggregatedViewModel()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/AggregatedViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowOtherCollectionListAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowOtherCollectionListViewModel.class);
        this.LLF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 646), null, C195547lu.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(AggregatedViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 647), null, C195527ls.INSTANCE, null, null);
        this.LLFFF = C221108m2.LIZIZ(C195557lv.LJLIL);
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 645));
        this.LLI = C221108m2.LIZIZ(C195487lo.INSTANCE);
        this.LLIFFJFJJ = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C195537lt.INSTANCE);
        this.LLIIII = C221108m2.LIZIZ(C195517lr.LJLIL);
        this.LLIIIILZ = C221108m2.LIZIZ(C195507lq.LJLIL);
    }

    public final NowOtherCollectionListViewModel Z3() {
        return (NowOtherCollectionListViewModel) this.LLF.LIZ(this, LLIIIJ[0]);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final SYL i8() {
        SYL syl = this.LJZL;
        if (syl != null) {
            return syl;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final C73849Syb<Integer> nY() {
        Object value = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value, "<get-pageIndexSubject>(...)");
        return (C73849Syb) value;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final C73849Syb<C82B> oh0() {
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-holderSubject>(...)");
        return (C73849Syb) value;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C55096Ljo.LJIILL(C55096Ljo.LJIIZILJ(this), NowOtherCollectionAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final int getCurrentPosition() {
        return ((Number) C8YN.LJIJI(Z3(), C195467lm.LJLIL)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final void Ae0(User user) {
        C7ML c7ml;
        Aweme aweme;
        User author;
        String uid;
        NowOtherCollectionListViewModel Z3 = Z3();
        Z3.getClass();
        List<ITEM> listGetAll = Z3.listGetAll();
        if (listGetAll == 0 || (c7ml = (C7ML) ORZ.LJLLLL(listGetAll)) == null || (aweme = c7ml.getAweme()) == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null || uid.length() <= 0 || !o.LJ(uid, user.getUid())) {
            return;
        }
        Z3.LJLIL.LJLIL.setAuthor(user);
        Iterator<? extends InterfaceC194547kI> it = Z3.LJLIL.LJLJL.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().getAweme().setAuthor(user);
        }
        List<InterfaceC194547kI> list = ((C194567kK) Z3.getState()).LJLIL.LJLJJI;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC194547kI> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().getAweme().setAuthor(user);
        }
        NowEventRegistry<List<String>> nowEventRegistry = C185117Oh.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<InterfaceC194547kI> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().getAweme().getAid());
        }
        nowEventRegistry.LIZ(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final boolean Ck(InterfaceC194547kI item) {
        C7ML LIZ;
        o.LJIIIZ(item, "item");
        List<ITEM> listGetAll = Z3().listGetAll();
        if (listGetAll == 0 || (LIZ = (C7ML) ORZ.LJLLLLLL(getCurrentPosition(), listGetAll)) == null) {
            LIZ = Z3().LJLIL.LIZ();
        }
        return o.LJ(LIZ.getAweme().getAid(), item.getAweme().getAid());
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C195627m2 c195627m2) {
        C195627m2 item = c195627m2;
        o.LJIIIZ(item, "item");
        final NowOtherCollectionListViewModel Z3 = Z3();
        SYL syl = this.LJZL;
        if (syl != null) {
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            o.LJIIIIZZ(state, "list.state");
            Z3.setListState(state);
            SYL syl2 = this.LJZL;
            if (syl2 != null) {
                syl2.LJLJLLL((AbstractC72278SYg) new TBR(Z3) { // from class: X.7X0
                    @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
                    public final Object get() {
                        return ((AssemListViewModel) this.receiver).getConfig();
                    }
                }.get());
                Z3.LJLJI = item.LJLJLJ;
                NowOtherCollectionListViewModel Z32 = Z3();
                AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(this, 1001);
                Z32.getClass();
                Z32.LJLIL = item;
                if (Z32.LJLIL.LJLJL.LIZ()) {
                    Z32.setState(new AqS169S0100000_3(item, 29));
                    Iterator<? extends InterfaceC194547kI> it = Z32.LJLIL.LJLJL.LJIIIIZZ.iterator();
                    while (it.hasNext()) {
                        it.next().LLLLIILLL(Z32.LJLJJL);
                    }
                    Z32.listSetItems(Z32.LJLIL.LJLJL.LJIIIIZZ);
                    aqS169S0100000_3.invoke(Integer.valueOf(Z32.LJLIL.LJLJL.LJI));
                    return;
                }
                Z32.LJLIL.LJLJL.LIZ = false;
                Z32.manualListRefresh();
                Z32.LJLIL.LJLJL.LJI = 0;
                Z32.setStateImmediate(new AqS28S0001000_3(0, 3));
                return;
            }
            o.LJIJI("list");
            throw null;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    public final void Tz(Integer num) {
        a4(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    @Override // com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vs(X.AbstractC193947jK r6) {
        /*
            r5 = this;
            java.lang.String r0 = "cellState"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.4g7 r2 = r5.LLFF
            X.TBo<java.lang.Object>[] r1 = com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem.LLIIIJ
            r0 = 1
            r0 = r1[r0]
            java.lang.Object r2 = r2.LIZ(r5, r0)
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r2
            com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel r0 = r5.Z3()
            X.33Q r0 = r0.getState()
            X.7kK r0 = (X.C194567kK) r0
            X.8HZ<X.7kI> r0 = r0.LJLIL
            java.util.List<ITEM> r4 = r0.LJLJJI
            r2.getClass()
            boolean r0 = X.C193697iv.LJI()
            if (r0 == 0) goto L7a
            if (r4 == 0) goto L7a
            java.util.Iterator r3 = r4.iterator()
        L2f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r3.next()
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = X.C3AU.LIZIZ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2f
            X.33Q r0 = r2.getState()
            X.7k7 r0 = (X.C194437k7) r0
            X.7jK r0 = r0.LJLIL
            boolean r1 = r0 instanceof X.C193887jE
            X.33Q r0 = r2.getState()
            X.7k7 r0 = (X.C194437k7) r0
            X.7kR r0 = r0.LJLILLLLZI
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L6f
            if (r1 == 0) goto L6f
            X.33Q r0 = r2.getState()
            X.7k7 r0 = (X.C194437k7) r0
            X.7jK r6 = r0.LJLIL
        L6f:
            kotlin.jvm.internal.AqS169S0100000_3 r1 = new kotlin.jvm.internal.AqS169S0100000_3
            r0 = 26
            r1.<init>(r6, r0)
            r2.setStateImmediate(r1)
            return
        L7a:
            boolean r0 = X.C193697iv.LJFF()
            if (r0 == 0) goto L6f
            if (r4 == 0) goto L6f
            java.util.Iterator r1 = r4.iterator()
        L86:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r1.next()
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = r0.getAid()
            if (r0 == 0) goto L86
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem.Vs(X.7jK):void");
    }

    public final void a4(Integer num) {
        int min;
        int LIZIZ;
        Integer num2;
        if (num != null && (num2 = this.LLD) != null && o.LJ(num, num2)) {
            return;
        }
        if (num != null) {
            min = num.intValue();
        } else {
            Integer num3 = this.LLD;
            if (num3 != null) {
                min = num3.intValue();
            } else {
                int LIZIZ2 = C7MY.LIZIZ(485);
                SYL syl = this.LJZL;
                if (syl != null) {
                    Context context = syl.getContext();
                    o.LJIIIIZZ(context, "list.context");
                    min = Math.min(LIZIZ2, C63081OpJ.LJJJJL(context));
                } else {
                    o.LJIJI("list");
                    throw null;
                }
            }
        }
        this.LLD = num;
        if (((C195627m2) C51029K0z.LJIILLIIL(this)).LJLJLJ) {
            LIZIZ = C7MY.LIZIZ(32);
        } else {
            LIZIZ = C7MY.LIZIZ(44);
        }
        int i = ((min * 4) / 3) + LIZIZ;
        SYL syl2 = this.LJZL;
        if (syl2 != null) {
            ViewGroup.LayoutParams layoutParams = syl2.getLayoutParams();
            layoutParams.width = min;
            layoutParams.height = i;
            SYL syl3 = this.LJZL;
            if (syl3 != null) {
                syl3.setLayoutParams(layoutParams);
                if (!((C195627m2) C51029K0z.LJIILLIIL(this)).LJLJLJ) {
                    C195807mK c195807mK = this.LL;
                    if (c195807mK != null) {
                        C26338AVi.LJI(c195807mK, null, AnonymousClass391.LIZJ(-16), null, null, false, 29);
                        return;
                    } else {
                        o.LJIJI("dotIndicator");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("list");
            throw null;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C195627m2 c195627m2) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.7lj] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RecyclerView.RecycledViewPool recycledViewPool;
        this.LL = (C195807mK) C7MY.LIZLLL(view, "view", R.id.cf7, "view.findViewById(R.id.dot_indicator)");
        View findViewById = view.findViewById(R.id.he2);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.other_collection_list)");
        this.LJZL = (SYL) findViewById;
        if (C19N.LJ("now_optimize_scope", true)) {
            SYL syl = this.LJZL;
            if (syl != null) {
                C30591Hz.LJJIII(syl, C55096Ljo.LJIIZILJ(this));
            } else {
                o.LJIJI("list");
                throw null;
            }
        } else {
            Z3().LJLJJL = C55096Ljo.LJIIZILJ(this);
        }
        a4(null);
        AbstractC28951Br abstractC28951Br = (AbstractC28951Br) this.LLFFF.getValue();
        SYL syl2 = this.LJZL;
        if (syl2 != null) {
            abstractC28951Br.LIZIZ(syl2);
            NowListAbility nowListAbility = (NowListAbility) this.LLFII.getValue();
            if (nowListAbility != null) {
                SYL syl3 = this.LJZL;
                if (syl3 != null) {
                    RecyclerView.RecycledViewPool recycledViewPool2 = syl3.getRecycledViewPool();
                    o.LJIIIIZZ(recycledViewPool2, "list.recycledViewPool");
                    nowListAbility.yJ(recycledViewPool2);
                } else {
                    o.LJIJI("list");
                    throw null;
                }
            }
            SYL syl4 = this.LJZL;
            if (syl4 != null) {
                NowListAbility nowListAbility2 = (NowListAbility) this.LLFII.getValue();
                if (nowListAbility2 != null) {
                    recycledViewPool = nowListAbility2.WE();
                } else {
                    recycledViewPool = null;
                }
                syl4.setRecycledViewPool(recycledViewPool);
                SYL syl5 = this.LJZL;
                if (syl5 != null) {
                    final ?? r0 = new InterfaceC195587ly() { // from class: X.7lj
                        @Override // X.InterfaceC195587ly
                        public final void onPageSelected(int i) {
                            NowOtherCollectionListViewModel Z3 = NowOtherCollectionListAssem.this.Z3();
                            Z3.LJLIL.LJLJL.LJI = i;
                            Z3.setStateImmediate(new AqS28S0001000_3(i, 3));
                            NowOtherCollectionListAssem.this.Z3().iv0(i + 1);
                        }
                    };
                    syl5.LJIIJJI(new C0A6(r0) { // from class: X.7lk
                        public final InterfaceC195587ly LJLIL;
                        public int LJLILLLLZI = -1;
                        public AbstractC28951Br LJLJI;

                        {
                            this.LJLIL = r0;
                        }

                        @Override // X.C0A6
                        public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
                            C0A2 layoutManager;
                            View LJFF;
                            int LJJJLL;
                            o.LJIIIZ(recyclerView, "recyclerView");
                            if (this.LJLJI == null) {
                                C0A4 onFlingListener = recyclerView.getOnFlingListener();
                                if (onFlingListener instanceof AbstractC28951Br) {
                                    this.LJLJI = (AbstractC28951Br) onFlingListener;
                                }
                            }
                            AbstractC28951Br abstractC28951Br2 = this.LJLJI;
                            if (abstractC28951Br2 != null && (layoutManager = recyclerView.getLayoutManager()) != null && (LJFF = abstractC28951Br2.LJFF(layoutManager)) != null && (LJJJLL = C0A2.LJJJLL(LJFF)) != -1 && this.LJLILLLLZI != LJJJLL) {
                                this.LJLILLLLZI = LJJJLL;
                                this.LJLIL.onPageSelected(LJJJLL);
                            }
                        }
                    });
                    if (getContext() != null) {
                        SYL syl6 = this.LJZL;
                        if (syl6 != null) {
                            syl6.setLayoutManager(new LinearLayoutManager(0, true));
                        } else {
                            o.LJIJI("list");
                            throw null;
                        }
                    }
                    C8VR.LIZ(this, new AqS134S0200000_3(this, view, 111));
                    SYL syl7 = this.LJZL;
                    if (syl7 != null) {
                        syl7.LLLF.LJZL(NowPostImagePowerCell.class, NowPostVideoPowerCell.class);
                        SYL syl8 = this.LJZL;
                        if (syl8 != null) {
                            C57939MoZ c57939MoZ = new C57939MoZ();
                            c57939MoZ.LIZIZ = false;
                            c57939MoZ.LJII = false;
                            syl8.setListConfig(c57939MoZ);
                            NowOtherCollectionListViewModel Z3 = Z3();
                            String enterFrom = ((C181847Bs) this.LLIFFJFJJ.getValue()).LJLILLLLZI;
                            Z3.getClass();
                            o.LJIIIZ(enterFrom, "enterFrom");
                            Z3.LJLILLLLZI = enterFrom;
                            C8YN.LJIIJ(this, Z3(), new TBT() { // from class: X.7lp
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Integer.valueOf(((C194567kK) obj).LJLJI);
                                }
                            }, new TBT() { // from class: X.7lF
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Integer.valueOf(((C194567kK) obj).LJLJJI);
                                }
                            }, null, C195397lf.LJLIL, 12);
                            C8YN.LJII(this, Z3(), new TBT() { // from class: X.7ll
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    C194567kK c194567kK = (C194567kK) obj;
                                    c194567kK.getClass();
                                    return C208708Ha.LIZLLL(c194567kK);
                                }
                            }, null, C195407lg.LJLIL, 6);
                            C8YN.LJII(this, Z3(), new TBT() { // from class: X.7lG
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Integer.valueOf(((C194567kK) obj).LJLJJI);
                                }
                            }, C213688a4.LIZLLL(), C195387le.LJLIL, 4);
                            String str = null;
                            C8YN.LJII(this, Z3(), new TBT() { // from class: X.7lH
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Boolean.valueOf(((C194567kK) obj).LJLJJL);
                                }
                            }, null, C195377ld.LJLIL, 6);
                            C65314PkE.LJIIJJI(this, false, C195177lJ.LJLIL);
                            C195237lP.LIZ(this, C185117Oh.LIZIZ, new AqS169S0100000_3(this, 331));
                            if (((C195627m2) C51029K0z.LJIILLIIL(this)).LJLJLJ) {
                                C8YN.LJIILLIIL(this, (AssemViewModel) this.LLII.getValue(), null, C195417lh.LJLIL, 3);
                                str = null;
                                C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.7ln
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((C82B) obj).LJLJJI;
                                    }
                                }, null, C195427li.LJLIL, 6);
                            }
                            C55096Ljo.LJIIJJI(C55096Ljo.LJIIZILJ(this), this, NowOtherCollectionAbility.class, str);
                            return;
                        }
                        o.LJIJI("list");
                        throw null;
                    }
                    o.LJIJI("list");
                    throw null;
                }
                o.LJIJI("list");
                throw null;
            }
            o.LJIJI("list");
            throw null;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C195627m2 c195627m2) {
    }
}
