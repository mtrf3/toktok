package com.ss.android.ugc.aweme.feed.assem.relationbtn;

import X.C025908h;
import X.C110614Vt;
import X.C16880lQ;
import X.C211468Rq;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C239319aJ;
import X.C240999d1;
import X.C241249dQ;
import X.C56602Ka;
import X.C59936Nfg;
import X.C59937Nfh;
import X.C5H3;
import X.C61328O5c;
import X.C61976OUa;
import X.C61977OUb;
import X.C61978OUc;
import X.C61979OUd;
import X.C61980OUe;
import X.C61981OUf;
import X.C61988OUm;
import X.C61989OUn;
import X.C61990OUo;
import X.C61991OUp;
import X.C61992OUq;
import X.C61993OUr;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8QI;
import X.C8YN;
import X.C99W;
import X.EnumC211478Rr;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.OUV;
import X.OUW;
import X.OUX;
import X.OUY;
import X.OUZ;
import X.SY4;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS38S0200000_3;
import Y.ACListenerS45S0200000_10;
import Y.ARunnableS46S0100000_10;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS15S0010000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS53S0110000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class VideoRelationBtnAssem extends BaseCellSlotComponent<VideoRelationBtnAssem> {
    public static final OUY LLIILZL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIZ;
    public static final C62822Ol8 LLIL;
    public static final C62822Ol8 LLILII;
    public View LLFII;
    public C239319aJ LLFZ;
    public SY4 LLI;
    public Aweme LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public final InterfaceC115514g7 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5H3 LLIIJI;
    public final InterfaceC115514g7 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public ARunnableS46S0100000_10 LLIILII;

    static {
        TBT tbt = new TBT(VideoRelationBtnAssem.class, "relationBtnVM", "getRelationBtnVM()Lcom/ss/android/ugc/aweme/feed/assem/relationbtn/VideoRelationBtnVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIZ = new InterfaceC74236TBo[]{tbt, new TBT(VideoRelationBtnAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0), new TBT(VideoRelationBtnAssem.class, "userCardVM", "getUserCardVM()Lcom/ss/android/ugc/aweme/feed/assem/usercard/VideoUserCardVM;", 0)};
        LLIILZL = new OUY();
        LLIL = C221108m2.LIZIZ(C59936Nfg.LJLIL);
        LLILII = C221108m2.LIZIZ(C59937Nfh.LJLIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ada;
    }

    public VideoRelationBtnAssem() {
        new LinkedHashMap();
        this.LLII = -1;
        this.LLIIII = -1;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoRelationBtnVM.class);
        this.LLIIIILZ = C214348b8.LIZ(this, LIZ, null, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 241), null, C61988OUm.INSTANCE, null, null);
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C61989OUn.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoDiggVM.class);
        this.LLIIIL = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 238), null, C61991OUp.INSTANCE, null, null);
        this.LLIIIZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C61993OUr.INSTANCE);
        this.LLIIJI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C61990OUo.INSTANCE);
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(VideoUserCardVM.class);
        this.LLIIJLIL = C214348b8.LIZ(this, LIZ3, c240999d1, new AqS160S0100000_10((InterfaceC65350Pko) LIZ3, 239), null, C61992OUq.INSTANCE, null, null);
        this.LLIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 240));
    }

    public final VideoRelationBtnVM u4() {
        return (VideoRelationBtnVM) this.LLIIIILZ.LIZ(this, LLIIZ[0]);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C239319aJ c239319aJ = this.LLFZ;
        if (c239319aJ != null) {
            c239319aJ.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS45S0200000_10(this, item, 0)));
        }
        SY4 sy4 = this.LLI;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS38S0200000_3(this, item, 15));
        }
        this.LLIFFJFJJ = item.getAweme();
        VideoRelationBtnVM u4 = u4();
        Aweme aweme = this.LLIFFJFJJ;
        u4.getClass();
        Integer LIZ = C211468Rq.LIZ(aweme);
        boolean kv0 = u4.kv0(LIZ);
        u4.LJLJLLL = LIZ;
        u4.setState(new AqS15S0010000_10(kv0, 1));
        C56602Ka.LIZJ(aweme, !kv0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = view.findViewById(R.id.j71);
        this.LLFZ = (C239319aJ) view.findViewById(R.id.aw_);
        SY4 sy4 = (SY4) view.findViewById(R.id.axk);
        this.LLI = sy4;
        if (C99W.LIZ && sy4 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
            c110614Vt.LIZJ = C61328O5c.LIZJ(6);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            sy4.setBackground(c110614Vt.LIZ(context));
        }
        SY4 sy42 = this.LLI;
        if (sy42 != null) {
            sy42.setTag(C8QI.LJI, "negative");
        }
        C8YN.LJII(this, u4(), new TBT() { // from class: X.OUj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C61984OUi) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), OUV.LJLIL, 4);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.OUk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C61984OUi) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), OUW.LJLIL, 4);
        C8YN.LJII(this, u4(), new TBT() { // from class: X.OUl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C61984OUi) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), OUX.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIZ.getValue(), new TBT() { // from class: X.8tq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLLILLLL;
            }
        }, null, C61978OUc.LJLIL, 6);
        C8YN.LJIIJJI(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.8tm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLLL;
            }
        }, new TBT() { // from class: X.8tl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLL;
            }
        }, new TBT() { // from class: X.8tn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLI;
            }
        }, C213688a4.LIZLLL(), C61981OUf.LJLIL, 16);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIL.LIZ(this, LLIIZ[1]), new TBT() { // from class: X.OUs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C200617u5) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), C61980OUe.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.NbL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, C61979OUd.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8tt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, null, OUZ.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.8tu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJJLL;
            }
        }, null, C61977OUb.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIJ.getValue(), new TBT() { // from class: X.8ts
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLJ;
            }
        }, null, C61976OUa.LJLIL, 6);
    }

    public final void z4(boolean z) {
        C8YN.LJIJI(u4(), new AqS53S0110000_10(this, z, 0));
    }

    public final void q4(String str, boolean z) {
        String str2;
        AwemeRawAd awemeRawAd;
        if (o.LJ(u4().LJLJLLL, EnumC211478Rr.AD.getValue())) {
            if (z) {
                str2 = "button";
            } else {
                str2 = "multi_button";
            }
            Aweme aweme = this.LLIFFJFJJ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C025908h.LIZLLL("draw_ad", str, awemeRawAd, str2, "refer");
        }
    }

    public final ValueAnimator r4(final int i, final View view, float f, float f2) {
        if (view == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5YU
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                o.LJIIIZ(animation, "animation");
                VideoRelationBtnAssem videoRelationBtnAssem = VideoRelationBtnAssem.this;
                Object animatedValue = animation.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                View view2 = view;
                int i2 = i;
                videoRelationBtnAssem.getClass();
                if (view2 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            view2.setAlpha(floatValue);
                        }
                    } else {
                        layoutParams.height = C278817o.LIZ(floatValue);
                    }
                } else {
                    layoutParams.width = (int) floatValue;
                }
                view2.setLayoutParams(layoutParams);
            }
        });
        return ofFloat;
    }
}
