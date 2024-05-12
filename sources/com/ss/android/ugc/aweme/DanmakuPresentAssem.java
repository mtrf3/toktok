package com.ss.android.ugc.aweme;

import X.C214348b8;
import X.C215508d0;
import X.C215788dS;
import X.C215928dg;
import X.C215948di;
import X.C215958dj;
import X.C215968dk;
import X.C215978dl;
import X.C215988dm;
import X.C215998dn;
import X.C216008do;
import X.C216068du;
import X.C216078dv;
import X.C216088dw;
import X.C216098dx;
import X.C216108dy;
import X.C216128e0;
import X.C216138e1;
import X.C216148e2;
import X.C216158e3;
import X.C216168e4;
import X.C216178e5;
import X.C216208e8;
import X.C216218e9;
import X.C216228eA;
import X.C216238eB;
import X.C216278eF;
import X.C216288eG;
import X.C216298eH;
import X.C216308eI;
import X.C216318eJ;
import X.C216338eL;
import X.C216358eN;
import X.C216368eO;
import X.C216388eQ;
import X.C216398eR;
import X.C216478eZ;
import X.C216568ei;
import X.C216638ep;
import X.C216678et;
import X.C216688eu;
import X.C221108m2;
import X.C2K0;
import X.C32151Nz;
import X.C42625Go9;
import X.C47261Igj;
import X.C55096Ljo;
import X.C57872Ox;
import X.C5H3;
import X.C61447O9r;
import X.C62623Ohv;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79045V0n;
import X.C8YN;
import X.C90193gN;
import X.InterfaceC115514g7;
import X.InterfaceC215558d5;
import X.InterfaceC215738dN;
import X.InterfaceC55102Lju;
import X.InterfaceC74236TBo;
import X.InterfaceC82683Wch;
import X.QD3;
import X.T5S;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS7S0101000_3;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.ab.DanmakuMoveDurationSetting;
import com.ss.android.ugc.aweme.abilities.IDanmakuLayoutAbility;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.service.DanmakuProtocol;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS1S0000001_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes4.dex */
public final class DanmakuPresentAssem extends BaseCellSlotComponent implements DanmakuProtocol, IDanmakuLayoutAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILL;
    public static final IFollowFeedService LLILLIZIL;
    public boolean LLFII;
    public boolean LLFZ;
    public C216688eu LLI;
    public View LLIFFJFJJ;
    public final C216168e4 LLII;
    public final C216288eG LLIIII;
    public C216678et LLIIIILZ;
    public int LLIIIJ;
    public InterfaceC82683Wch LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public final C5H3 LLIIJI;
    public final C5H3 LLIIJLIL;
    public View LLIIL;
    public ViewGroup LLIILII;
    public final SafeHandler LLIILZL;
    public final List<InterfaceC215558d5> LLIIZ;
    public final ARunnableS39S0100000_3 LLIL;
    public final C62822Ol8 LLILII;
    public final C215508d0 LLILIL;

    static {
        TBT tbt = new TBT(DanmakuPresentAssem.class, "danmakuVM", "getDanmakuVM()Lcom/ss/android/ugc/aweme/core/DanmakuViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLILL = new InterfaceC74236TBo[]{tbt};
        IFollowFeedService LJIILL = FollowFeedServiceImpl.LJIILL();
        o.LJIIIIZZ(LJIILL, "get().getService(IFollowFeedService::class.java)");
        LLILLIZIL = LJIILL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ajx;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1229862352) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.8d0] */
    public DanmakuPresentAssem() {
        C216168e4 c216168e4;
        new LinkedHashMap();
        this.LLFII = true;
        this.LLFZ = true;
        if (C61447O9r.LJIIIZ) {
            c216168e4 = C216228eA.LJIILJJIL;
        } else {
            c216168e4 = C216068du.LJIILJJIL;
        }
        this.LLII = c216168e4;
        this.LLIIII = new C216288eG();
        this.LLIIIJ = -1;
        C65776Prg LIZ = C65352Pkq.LIZ(DanmakuViewModel.class);
        this.LLIIIZ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 65), null, C216008do.INSTANCE, null, null);
        this.LLIIJI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C216388eQ.INSTANCE);
        this.LLIIJLIL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C216398eR.INSTANCE);
        this.LLIILZL = new SafeHandler(this);
        this.LLIIZ = new ArrayList();
        this.LLIL = new ARunnableS39S0100000_3(this, 22);
        this.LLILII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 66));
        this.LLILIL = new InterfaceC215738dN() { // from class: X.8d0
            @Override // X.InterfaceC215738dN
            public void onEvent(C216958fL event) {
                InterfaceC215558d5 interfaceC215558d5;
                String LIZJ;
                String str;
                o.LJIIIZ(event, "event");
                DanmakuPresentAssem danmakuPresentAssem = DanmakuPresentAssem.this;
                if (danmakuPresentAssem.LLFZ && danmakuPresentAssem.getAweme() != null && event.LIZ == 1000) {
                    Object obj = event.LIZIZ;
                    Aweme aweme = null;
                    if ((obj instanceof InterfaceC215558d5) && (interfaceC215558d5 = (InterfaceC215558d5) obj) != null) {
                        DanmakuPresentAssem danmakuPresentAssem2 = DanmakuPresentAssem.this;
                        int i = C215868da.LIZ[interfaceC215558d5.getType().ordinal()];
                        String str2 = "";
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            C215608dA.LIZIZ = true;
                            C215608dA.LIZ().storeBoolean("has_show_education_danmaku", true);
                            VideoItemParams gv0 = danmakuPresentAssem2.r4().gv0();
                            if (gv0 != null) {
                                aweme = gv0.getAweme();
                            }
                            VideoItemParams gv02 = danmakuPresentAssem2.r4().gv0();
                            if (gv02 != null && (str = gv02.mEventType) != null) {
                                str2 = str;
                            }
                            C214788bq.LIZIZ(aweme, str2, EnumC214808bs.ADD, EnumC214798br.IS_INTRO_SHOW);
                            return;
                        }
                        DanmakuViewModel r4 = danmakuPresentAssem2.r4();
                        r4.getClass();
                        if (!r4.LJLLLLLL) {
                            return;
                        }
                        if (r4.LJLL != null && (LIZJ = interfaceC215558d5.LIZJ()) != null && s.LJJJLZIJ(LIZJ, "fake_", false)) {
                            return;
                        }
                        C215488cy c215488cy = r4.LJLLL;
                        if (c215488cy != null) {
                            c215488cy.LJLILLLLZI++;
                            c215488cy.LJLJJI++;
                            java.util.Set<String> set = c215488cy.LJLJJLL;
                            String LIZJ2 = interfaceC215558d5.LIZJ();
                            if (LIZJ2 == null) {
                                LIZJ2 = "";
                            }
                            if (set.add(LIZJ2)) {
                                c215488cy.LJLJI++;
                                c215488cy.LJLJJL++;
                            }
                            List<String> list = c215488cy.LJLJL;
                            String LIZJ3 = interfaceC215558d5.LIZJ();
                            if (LIZJ3 != null) {
                                str2 = LIZJ3;
                            }
                            list.add(str2);
                        }
                        r4.lv0(false);
                    }
                }
            }
        };
    }

    public final void A4() {
        int top;
        View view;
        View view2 = this.LLIIL;
        if (view2 != null && (top = view2.getTop()) > 0 && (view = this.LLIIL) != null) {
            view.post(new ARunnableS7S0101000_3(top, this, 1));
        }
    }

    public final DanmakuViewModel r4() {
        return (DanmakuViewModel) this.LLIIIZ.LIZ(this, LLILL[0]);
    }

    public final C216688eu u4() {
        C216688eu c216688eu = this.LLI;
        if (c216688eu != null) {
            return c216688eu;
        }
        o.LJIJI("danmakuView");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        C216678et c216678et = this.LLIIIILZ;
        if (c216678et != null) {
            c216678et.LJIIIIZZ = false;
            C216298eH c216298eH = c216678et.LIZJ;
            c216298eH.LJ = false;
            c216298eH.LIZ.clear();
            c216298eH.LIZIZ.clear();
            c216298eH.LIZJ.clear();
            c216298eH.LJFF = 0;
            c216298eH.LJI = 0L;
            c216298eH.LJII = 0L;
            c216298eH.LJIIIIZZ = 0L;
            c216678et.LJIIIZ();
            C216678et.LIZJ(c216678et);
        }
        this.LLIILZL.removeCallbacks(this.LLIL);
        C42625Go9.LIZJ(this);
    }

    public final VideoPlayViewModel z4() {
        return (VideoPlayViewModel) this.LLIIJLIL.getValue();
    }

    public final Aweme getAweme() {
        VideoItemParams gv0 = r4().gv0();
        if (gv0 != null) {
            return gv0.getAweme();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DanmakuProtocol.class, C47261Igj.LJJIJIL(this));
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.abilities.IDanmakuLayoutAbility
    public final void Or() {
        A4();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        View findViewById = getContainerView().findViewById(R.id.c3d);
        o.LJIIIIZZ(findViewById, "containerView.findViewById(R.id.danmaku_view)");
        this.LLI = (C216688eu) findViewById;
        View view = this.LLIFFJFJJ;
        if (view != null) {
            this.LLIILII = (ViewGroup) view.findViewById(R.id.player_view);
            C216678et currentDanmakuController = u4().getCurrentDanmakuController();
            if (currentDanmakuController != null) {
                u4().LIZ(currentDanmakuController);
                this.LLIIIILZ = currentDanmakuController;
                this.LLIIII.LIZ(currentDanmakuController);
                C216338eL c216338eL = this.LLIIII.LIZJ;
                boolean LIZ = C90193gN.LIZ();
                if (c216338eL.LJ != LIZ) {
                    c216338eL.LJ = LIZ;
                    c216338eL.LJFF.LIZIZ(new AqS169S0100000_3(c216338eL, 954));
                }
            }
            C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
            this.LLFII = c62623Ohv.LJFF(item.getAweme());
            this.LLFZ = c62623Ohv.LJIIIZ(item.getAweme());
            C42625Go9.LIZIZ(this);
            return;
        }
        o.LJIJI("videoRootView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.service.DanmakuProtocol
    public final void LLIIJI(boolean z) {
        int i;
        this.LLFZ = z;
        C216688eu u4 = u4();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        u4.setVisibility(i);
        if (!z) {
            ((ArrayList) this.LLIIZ).clear();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLandscapeModeExit(C57872Ox event) {
        String str;
        C216678et c216678et;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        VideoItemParams gv0 = r4().gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str, event.LJLIL) && (c216678et = this.LLIIIILZ) != null) {
            C216678et.LIZJ(c216678et);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        int i2;
        Integer LJI;
        Integer LJI2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object parent = getContainerView().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        this.LLIFFJFJJ = (View) parent;
        View findViewById = view.findViewById(R.id.c3d);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.danmaku_view)");
        this.LLI = (C216688eu) findViewById;
        View view2 = this.LLIFFJFJJ;
        View view3 = null;
        if (view2 != null) {
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.player_view);
            this.LLIILII = viewGroup;
            if (viewGroup != null) {
                view3 = viewGroup.getChildAt(0);
            }
            this.LLIIL = view3;
            A4();
            C216688eu u4 = u4();
            C216678et c216678et = new C216678et();
            C216308eI c216308eI = c216678et.LIZ.LIZJ;
            c216308eI.LJII = ((Boolean) C216638ep.LIZ.getValue()).booleanValue();
            c216308eI.LIZ.LIZ(1106);
            c216678et.LJFF.LIZJ(C216568ei.LJIILLIIL);
            c216678et.LIZIZ = new C216478eZ(this);
            C215508d0 listener = this.LLILIL;
            o.LJIIIZ(listener, "listener");
            ((ArrayList) c216678et.LJ).add(listener);
            C216318eJ c216318eJ = c216678et.LIZ.LJ;
            c216318eJ.LJIIIZ = true;
            c216318eJ.LIZ.LIZ(1408);
            C216318eJ c216318eJ2 = c216678et.LIZ.LJ;
            C216368eO c216368eO = C216368eO.LJLIL;
            c216318eJ2.getClass();
            o.LJIIIZ(c216368eO, "<set-?>");
            c216318eJ2.LJIIJ = c216368eO;
            C216308eI c216308eI2 = c216678et.LIZ.LIZJ;
            c216308eI2.LJ = new AqS185S0100000_3(c216678et, 192);
            c216308eI2.LIZ.LIZ(1105);
            C216308eI c216308eI3 = c216678et.LIZ.LIZJ;
            C216238eB value = C216238eB.LJLIL;
            c216308eI3.getClass();
            o.LJIIIZ(value, "value");
            c216308eI3.LIZLLL = value;
            c216308eI3.LIZ.LIZ(1102);
            u4.LIZ(c216678et);
            this.LLIIII.LIZ(c216678et);
            C216358eN c216358eN = this.LLIIII.LIZLLL;
            float LJIIIIZZ = this.LLII.LJIIIIZZ();
            c216358eN.getClass();
            if (LJIIIIZZ != 0.0f) {
                c216358eN.LIZ = LJIIIIZZ;
                c216358eN.LIZLLL.LIZIZ(new AqS1S0000001_3(LJIIIIZZ, 8));
                c216358eN.LIZLLL.LIZJ();
            }
            Context context = getContext();
            if (context != null && (LJI2 = C79045V0n.LJI(this.LLII.LJII, context)) != null) {
                i = LJI2.intValue();
            } else {
                i = -1;
            }
            c216358eN.LIZIZ = i;
            c216358eN.LIZLLL.LIZIZ(new AqS28S0001000_3(i, 29));
            c216358eN.LIZLLL.LIZJ();
            T5S t5s = new T5S();
            t5s.LIZ(102);
            Typeface typeface = t5s.getTypeface();
            c216358eN.LIZJ = typeface;
            c216358eN.LIZLLL.LIZIZ(new AqS169S0100000_3(typeface, 955));
            c216358eN.LIZLLL.LIZJ();
            c216358eN.LIZLLL.LIZIZ(new AqS1S0000001_3(C32151Nz.LJIIZILJ(Double.valueOf(0.8d)), 9));
            c216358eN.LIZLLL.LIZJ();
            Context context2 = getContext();
            if (context2 != null && (LJI = C79045V0n.LJI(R.attr.d4, context2)) != null) {
                i2 = LJI.intValue();
            } else {
                i2 = -16777216;
            }
            c216358eN.LIZLLL.LIZIZ(new AqS28S0001000_3(i2, 30));
            c216358eN.LIZLLL.LIZJ();
            C216278eF c216278eF = this.LLIIII.LJ;
            int height = u4().getHeight();
            if (height != c216278eF.LIZ) {
                c216278eF.LIZ = height;
            }
            int width = u4().getWidth();
            if (width != c216278eF.LIZIZ) {
                c216278eF.LIZIZ = width;
                c216278eF.LIZLLL.LIZLLL();
            }
            c216278eF.LIZ(1.0f);
            C216338eL c216338eL = this.LLIIII.LIZJ;
            c216338eL.LIZ(3);
            float LJFF = this.LLII.LJFF();
            if (LJFF != 0.0f) {
                c216338eL.LIZLLL = LJFF;
                c216338eL.LJFF.LIZIZ(new AqS1S0000001_3(LJFF, 6));
            }
            float LJI3 = this.LLII.LJI();
            if (LJI3 >= 0.0f && LJI3 != c216338eL.LIZJ) {
                c216338eL.LIZJ = LJI3;
                c216338eL.LJFF.LIZIZ(new AqS1S0000001_3(LJI3, 7));
            }
            c216338eL.LIZIZ = DanmakuMoveDurationSetting.INSTANCE.getDuration();
            c216338eL.LJFF.LIZLLL();
            boolean LIZ = C90193gN.LIZ();
            if (c216338eL.LJ != LIZ) {
                c216338eL.LJ = LIZ;
                c216338eL.LJFF.LIZIZ(new AqS169S0100000_3(c216338eL, 954));
            }
            this.LLIIIILZ = c216678et;
            C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8eT
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LLD;
                }
            }, null, C216208e8.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8Jl
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LLF;
                }
            }, null, C216218e9.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8eC
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C216178e5.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.8eD
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C216078dv.LJLIL, 6);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.8dY
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C215798dT) obj).LJLIL;
                }
            }, null, C215788dS.LJLIL, 6);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.8dU
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C215798dT) obj).LJLJL;
                }
            }, null, C215968dk.LJLIL, 6);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.8dV
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C215798dT) obj).LJLJJI;
                }
            }, null, C215988dm.LJLIL, 6);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.8dW
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C215798dT) obj).LJLJJL;
                }
            }, null, C215998dn.LJLIL, 6);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.8dX
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C215798dT) obj).LJLJJLL;
                }
            }, null, C215978dl.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8eE
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLJLJ;
                }
            }, null, C215948di.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8Jm
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLLLL;
                }
            }, null, C216108dy.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8eU
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLLJ;
                }
            }, null, C216088dw.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8eV
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLLILLLL;
                }
            }, null, C216158e3.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8Us
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LLFF;
                }
            }, null, C216098dx.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8eW
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LLD;
                }
            }, null, C216138e1.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8Ur
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LLF;
                }
            }, null, C216128e0.LJLIL, 6);
            C8YN.LJII(this, z4(), new TBT() { // from class: X.8eS
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJZL;
                }
            }, null, C216148e2.LJLIL, 6);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.8dZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C215798dT) obj).LJLILLLLZI;
                }
            }, null, C215928dg.LJLIL, 6);
            return;
        }
        o.LJIJI("videoRootView");
        throw null;
    }

    public final void q4(C215958dj c215958dj) {
        c215958dj.LJIIJJI = true;
        C216678et c216678et = this.LLIIIILZ;
        if (c216678et != null) {
            if (!c216678et.LJIIIIZZ) {
                ((ArrayList) this.LLIIZ).add(c215958dj);
                return;
            }
            c216678et.LIZ(c215958dj);
        }
        C216678et c216678et2 = this.LLIIIILZ;
        if (c216678et2 == null) {
            return;
        }
        c216678et2.LJFF();
    }
}
