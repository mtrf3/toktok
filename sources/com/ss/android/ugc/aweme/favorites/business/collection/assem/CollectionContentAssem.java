package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.AbstractC51777KTt;
import X.ActivityC45651qj;
import X.C192037gF;
import X.C192217gX;
import X.C192317gh;
import X.C192347gk;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.C9XU;
import X.G27;
import X.LFH;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.IDcS7S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionContentAssem extends UIContentAssem implements G27 {
    public final C55749LuL LJLIL;
    public final C55749LuL LJLILLLLZI;
    public boolean LJLJI;
    public GridLayoutManager LJLJJI;
    public final C214298b3 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public CollectionContentAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, CollectionDetail.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C192037gF.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 245);
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionContentViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 247), C192317gh.INSTANCE, aqS153S0100000_3);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 246));
    }

    public final CollectionDetail A3() {
        return (CollectionDetail) this.LJLIL.getValue();
    }

    public final C192037gF v3() {
        return (C192037gF) this.LJLILLLLZI.getValue();
    }

    public final VideoCollectionContentViewModel x3() {
        return (VideoCollectionContentViewModel) this.LJLJJL.getValue();
    }

    public final void C3(boolean z) {
        Integer valueOf;
        C192037gF v3 = v3();
        if (v3 == null || (valueOf = Integer.valueOf(v3.LJLIL)) == null) {
            return;
        }
        if (valueOf.intValue() == 1) {
            VideoCollectionContentViewModel x3 = x3();
            x3.getClass();
            x3.withState(new AqS46S0110000_3(x3, z, 20));
        } else if (valueOf.intValue() == 0) {
            x3().gv0(z);
        } else {
            if (valueOf.intValue() != 2) {
                return;
            }
            VideoCollectionContentViewModel x32 = x3();
            x32.getClass();
            x32.withState(new AqS46S0110000_3(x32, z, 18));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.7gk, java.lang.Object, X.MK7, X.09q] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        o.LJIIIZ(view, "view");
        RecyclerView recyclerView = (RecyclerView) view;
        final ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        C192037gF v3 = v3();
        if (v3 != null && v3.LJLIL == 0) {
            z = true;
        } else {
            z = false;
        }
        final boolean z2 = !z;
        ?? r2 = new AbstractC51777KTt<C192217gX>(LIZ, z2) { // from class: X.7gk
            public final ActivityC45651qj LJLJI;
            public final boolean LJLJJI;

            @Override // X.AbstractC51777KTt, X.C4II
            public final int getBasicItemViewType(int i) {
                if (this.LJLJJI || i != 0) {
                    return 1;
                }
                return 0;
            }

            @Override // X.MK7, X.AbstractC029409q
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
                o.LJIIIZ(holder, "holder");
                super.onViewAttachedToWindow(holder);
                if (holder instanceof C192407gq) {
                    ((AbstractC208618Gr) holder).LJJII(true);
                }
            }

            @Override // X.MK7, X.AbstractC029409q
            public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
                o.LJIIIZ(holder, "holder");
                super.onViewDetachedFromWindow(holder);
                if (holder instanceof C192407gq) {
                    AbstractC208618Gr abstractC208618Gr = (AbstractC208618Gr) holder;
                    abstractC208618Gr.LJJII(false);
                    abstractC208618Gr.d();
                }
            }

            @Override // X.AbstractC51777KTt, X.C4II
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                long j;
                int i2;
                boolean z3;
                final boolean z4;
                final boolean z5;
                int i3;
                boolean z6;
                int i4;
                Long l;
                Long l2;
                CollectionDetail.Status status;
                Integer num;
                List<C192217gX> data = getData();
                if (data == null || ORZ.LJLLLLLL(i, data) == null) {
                    return;
                }
                int i5 = 8;
                if (viewHolder instanceof C192357gl) {
                    C192357gl c192357gl = (C192357gl) viewHolder;
                    ActivityC45651qj activity = this.LJLJI;
                    if (data.size() == 1 || ((C192217gX) ListProtector.get(data, i)).LJLILLLLZI != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c192357gl.getClass();
                    o.LJIIIZ(activity, "activity");
                    C192037gF v32 = c192357gl.LJLJJL.v3();
                    if (v32 != null && v32.LJLJI) {
                        c192357gl.LJLJJI.setVisibility(8);
                        c192357gl.LJLJI.setVisibility(0);
                    } else {
                        c192357gl.LJLJJI.setVisibility(0);
                        c192357gl.LJLJI.setVisibility(8);
                        TuxTextView tuxTextView = c192357gl.LJLJJI;
                        tuxTextView.setText(tuxTextView.getContext().getString(R.string.r6q, c192357gl.LJLJJL.A3().creatorName));
                    }
                    c192357gl.LJLIL.setText(c192357gl.LJLJJL.A3().name);
                    if (C192307gg.LIZ() && (status = c192357gl.LJLJJL.A3().status) != null && (num = status.state) != null && 1 == num.intValue()) {
                        Context context = c192357gl.LJLJJL.getContext();
                        if (context != null) {
                            SY9 sy9 = new SY9(context, R.raw.icon_lock_small);
                            sy9.setBounds(0, 0, C17N.LJIILL(20.0d), C17N.LJIILL(20.0d));
                            C8FR c8fr = new C8FR(sy9, 2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" a");
                            spannableStringBuilder.setSpan(c8fr, 1, 2, 18);
                            c192357gl.LJLIL.append(spannableStringBuilder);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    if (C99W.LIZ) {
                        c192357gl.LJLJI.setButtonVariant(5);
                        c192357gl.LJLJI.getClass();
                    }
                    TextView textView = c192357gl.LJLILLLLZI;
                    Resources resources = c192357gl.itemView.getContext().getResources();
                    CollectionDetail.Statistic statistic = c192357gl.LJLJJL.A3().statistic;
                    if (statistic != null && (l2 = statistic.total) != null) {
                        i4 = (int) l2.longValue();
                    } else {
                        i4 = 0;
                    }
                    Object[] objArr = new Object[1];
                    CollectionDetail.Statistic statistic2 = c192357gl.LJLJJL.A3().statistic;
                    if (statistic2 != null) {
                        l = statistic2.total;
                    } else {
                        l = null;
                    }
                    objArr[0] = String.valueOf(l);
                    textView.setText(resources.getQuantityString(R.plurals.fj, i4, objArr));
                    if (z6) {
                        c192357gl.LJLJI.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus));
                        c192357gl.LJLJI.setText(R.string.gbm);
                        C16880lQ.LJJIZ(c192357gl.LJLJI, new ACListenerS38S0200000_3(activity, c192357gl.LJLJJL, 28));
                        return;
                    } else {
                        c192357gl.LJLJI.setButtonStartIcon(Integer.valueOf(R.raw.icon_gear));
                        c192357gl.LJLJI.setText(R.string.gbp);
                        C16880lQ.LJJIZ(c192357gl.LJLJI, new ACListenerS23S0100000_3(c192357gl.LJLJJL, 51));
                        return;
                    }
                }
                if (viewHolder instanceof C192407gq) {
                    final C192407gq c192407gq = (C192407gq) viewHolder;
                    final ActivityC45651qj activity2 = this.LJLJI;
                    Object obj = ListProtector.get(data, i);
                    o.LJIIIIZZ(obj, "notNullData[position]");
                    final C192217gX c192217gX = (C192217gX) obj;
                    c192407gq.getClass();
                    o.LJIIIZ(activity2, "activity");
                    c192407gq.LJLJJI = true;
                    TextView textView2 = c192407gq.LJLJLJ;
                    AwemeStatistics statistics = c192217gX.LJLIL.getStatistics();
                    if (statistics != null) {
                        j = statistics.getPlayCount();
                    } else {
                        j = 0;
                    }
                    textView2.setText(C77123UOp.LJJIIJ(j));
                    View view2 = c192407gq.LJLL;
                    if (c192217gX.LJLILLLLZI != 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view2.setVisibility(i2);
                    CheckBox checkBox = c192407gq.LJLJLLL;
                    if (c192217gX.LJLILLLLZI == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    checkBox.setChecked(z3);
                    if (c192217gX.LJLIL.isDelete() || !c192217gX.LJLIL.isCanPlay()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i6 = c192217gX.LJLILLLLZI;
                    if (i6 != 1) {
                        z5 = true;
                    } else {
                        z5 = c192407gq.LJLLLL.LJLJI;
                    }
                    View view3 = c192407gq.LJLLI;
                    if (!z5 || (i6 == 1 && z4)) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    view3.setVisibility(i3);
                    c192407gq.LJLLL.LIZIZ(c192217gX.LJLIL);
                    c192407gq.LJLJLLL.setEnabled(z5);
                    c192407gq.LJLL.setEnabled(z5);
                    View view4 = c192407gq.LJLL;
                    final CollectionContentAssem collectionContentAssem = c192407gq.LJLLLL;
                    final boolean z7 = z4;
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7gj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            M8L.LIZ("select video to manage");
                            if (z7) {
                                C26045AKb c26045AKb = new C26045AKb(activity2);
                                c26045AKb.LJIIIIZZ(R.string.gb2);
                                c26045AKb.LJIIJ();
                                c192407gq.LJLJLLL.setChecked(false);
                                return;
                            }
                            VideoCollectionContentViewModel x3 = collectionContentAssem.x3();
                            C192217gX c192217gX2 = c192217gX;
                            Aweme aweme = c192217gX2.LJLIL;
                            int i7 = c192217gX2.LJLILLLLZI;
                            int i8 = 2;
                            if (i7 == 2) {
                                i8 = 1;
                            }
                            C192217gX c192217gX3 = new C192217gX(i8, aweme);
                            x3.getClass();
                            x3.setState(new AqS169S0100000_3(c192217gX3, 789));
                        }
                    }, view4);
                    c192407gq.LJLJLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(c192407gq, 52)));
                    Aweme aweme = c192217gX.LJLIL;
                    if (aweme != null) {
                        c192407gq.bind(aweme, i);
                        c192407gq.LJLIL = aweme;
                        c192407gq.LLZLLLL();
                    }
                    View view5 = c192407gq.itemView;
                    final CollectionContentAssem collectionContentAssem2 = c192407gq.LJLLLL;
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7gi
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            C192037gF v33;
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", "collection_video");
                            c188727au.LJIIIZ("content", "video");
                            c188727au.LJIIIZ("video_id", C192217gX.this.LJLIL.getAid());
                            FMX.LJIIL("click_personal_collection", c188727au.LIZ);
                            if (!z5) {
                                C26045AKb c26045AKb = new C26045AKb(activity2);
                                c26045AKb.LJIIIIZZ(R.string.gbf);
                                c26045AKb.LJIIJ();
                            } else {
                                if (z4 && (v33 = collectionContentAssem2.v3()) != null && v33.LJLJI) {
                                    if (C192217gX.this.LJLILLLLZI != 0) {
                                        return;
                                    }
                                    ((InterfaceC192387go) collectionContentAssem2.LJLJJLL.getValue()).Hd(C192217gX.this.LJLIL);
                                    return;
                                }
                                String LLLZ = C16880lQ.LLLZ("click video, aid is %s", Arrays.copyOf(new Object[]{C192217gX.this.LJLIL.getAid()}, 1));
                                o.LJIIIIZZ(LLLZ, "format(this, *args)");
                                M8L.LIZ(LLLZ);
                                InterfaceC192387go interfaceC192387go = (InterfaceC192387go) collectionContentAssem2.LJLJJLL.getValue();
                                View itemView = c192407gq.itemView;
                                o.LJIIIIZZ(itemView, "itemView");
                                interfaceC192387go.qi(itemView, C192217gX.this.LJLIL);
                            }
                        }
                    }, view5);
                    View view6 = c192407gq.LJLLILLLL;
                    if (C220858ld.LJIIIIZZ(c192217gX.LJLIL)) {
                        i5 = 0;
                    }
                    view6.setVisibility(i5);
                    return;
                }
                throw new Exception("not match view type");
            }

            @Override // X.AbstractC51777KTt, X.C4II
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                if (i == 0) {
                    return new C192357gl(CollectionContentAssem.this, parent);
                }
                if (i == 1) {
                    return new C192407gq(CollectionContentAssem.this, parent);
                }
                throw new Exception("not match view type");
            }

            {
                this.LJLJI = LIZ;
                this.LJLJJI = z2;
            }
        };
        r2.setLoadMoreListener(new AqS150S0200000_3((C192347gk) r2, this, 28));
        r2.spanSizeLookup = new IDcS7S0200000_3(r2, this, 0);
        int LJJIZ = LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LJJIZ);
        this.LJLJJI = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(r2);
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.7gm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(recyclerView, 122), null, new AqS134S0200000_3(this, recyclerView, 66), 10, null);
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.7gn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLILLLLZI;
            }
        }, null, new AqS169S0100000_3(recyclerView, 123), new AqS150S0200000_3(recyclerView, (C192347gk) r2, 27), new AqS107S0300000_3(this, recyclerView, (C192347gk) r2, 7), 2, null);
        C3(true);
        C9XU.LIZ(LIZ.hashCode(), this);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        GridLayoutManager gridLayoutManager = this.LJLJJI;
        if (gridLayoutManager == null) {
            return;
        }
        gridLayoutManager.LLJLIL(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
    }
}
