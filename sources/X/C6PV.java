package X;

import Y.ACListenerS22S0100000_2;
import Y.ACallableS80S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6PV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PV implements C6H7 {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final C159816Oz LIZLLL;
    public final InterfaceC159886Pg LJ;
    public final LifecycleOwner LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final List<C6QO> LJIIJJI;
    public final List<InterfaceC160026Pu> LJIIL;
    public final List<C6PN<?>> LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    @Override // X.C6H7
    public final List<StickerModel> LIZJ() {
        List<C6QO> list = this.LJIIJJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C6QO> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ());
        }
        return arrayList;
    }

    @Override // X.C6H7
    public final C159836Pb LJ() {
        return new C159836Pb(this);
    }

    public final C160446Rk LJIIJJI() {
        return (C160446Rk) this.LJII.getValue();
    }

    public final C6QI LJIIL() {
        return (C6QI) this.LJIIIZ.getValue();
    }

    public final C159866Pe LJIILJJIL() {
        return (C159866Pe) this.LJIILJJIL.getValue();
    }

    public final C160056Px LJIILL() {
        return (C160056Px) this.LJI.getValue();
    }

    @Override // X.C6H7
    public final C160446Rk LJI() {
        return LJIIJJI();
    }

    @Override // X.C6H7
    public final void M9() {
        for (EnumC157656Gr type : EnumC157656Gr.values()) {
            o.LJIIIZ(type, "type");
            Iterator it = ((ArrayList) LLIIJLIL(type)).iterator();
            while (it.hasNext()) {
                C6QO c6qo = (C6QO) it.next();
                c6qo.LJI(c6qo.LIZ());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.6PX] */
    @Override // X.C6H7
    public final void initService() {
        C160056Px LJIILL = LJIILL();
        List<C6QO> component = this.LJIIJJI;
        LJIILL.getClass();
        o.LJIIIZ(component, "component");
        LJIILL.LIZ.put("StickerList", component);
        C160056Px LJIILL2 = LJIILL();
        List<InterfaceC160026Pu> component2 = this.LJIIL;
        LJIILL2.getClass();
        o.LJIIIZ(component2, "component");
        LJIILL2.LIZ.put("StickerEventList", component2);
        C160056Px LJIILL3 = LJIILL();
        String LIZLLL = C65352Pkq.LIZ(InterfaceC159886Pg.class).LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        InterfaceC159886Pg component3 = this.LJ;
        LJIILL3.getClass();
        o.LJIIIZ(component3, "component");
        LJIILL3.LIZ.put(LIZLLL, component3);
        LJIILL().LIZLLL(this.LJIILLIIL.getValue());
        LJIILL().LIZLLL(this.LIZLLL);
        LJIILL().LIZLLL(new C6PU(this.LJFF, LJIILL()));
        LJIILL().LIZLLL(LJIIL());
        Iterator<C159636Oh> it = this.LIZLLL.LJLJJL.iterator();
        while (it.hasNext()) {
            switch (C157686Gu.LIZ[it.next().LJLIL.ordinal()]) {
                case 1:
                    List<C6PN<?>> list = this.LJIILIIL;
                    final Context context = this.LIZ;
                    final FrameLayout frameLayout = this.LIZIZ;
                    final FrameLayout frameLayout2 = this.LIZJ;
                    final LifecycleOwner lifecycleOwner = this.LJFF;
                    final C159816Oz c159816Oz = this.LIZLLL;
                    final C160056Px LJIILL4 = LJIILL();
                    ((ArrayList) list).add(new C6PN<GlobalHashTagStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c159816Oz, LJIILL4) { // from class: X.6T0
                        public C6T1 LJII;
                        public final InterfaceC159886Pg LJIIIIZZ;

                        @Override // X.C6PN
                        public final EnumC157656Gr LIZLLL() {
                            return EnumC157656Gr.PICTURE_HASHTAG_GLOBAL;
                        }

                        @Override // X.C6PN
                        public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                            o.LJIIIZ(stickerModel, "stickerModel");
                            GlobalHashTagStickerModel globalHashTagStickerModel = (GlobalHashTagStickerModel) stickerModel;
                            if (!C78880UxY.LJJLIIIIJ(globalHashTagStickerModel.getBaseStickerModel())) {
                                C78880UxY.LJL(globalHashTagStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LIZLLL());
                            }
                            return GlobalHashTagStickerModel.copy$default(globalHashTagStickerModel, BaseStickerModel.copy$default(globalHashTagStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -2, null), 0L, null, false, false, false, 30, null);
                        }

                        @Override // X.C6PN
                        public final C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner2) {
                            return new C161046Ts(this.LIZ, GlobalHashTagStickerModel.copy$default((GlobalHashTagStickerModel) stickerModel, null, 0L, null, false, false, true, 31, null), this.LIZIZ, C159636Oh.L(c159636Oh, false, false, false, false, true, null, false, 131007), lifecycleOwner2, this.LJFF);
                        }

                        @Override // X.C6PN
                        public final void LJ(final C6QO c6qo, final C6PX c6px, String createEditEnterMethod, final InterfaceC88472Yns editDone) {
                            StickerModel globalHashTagStickerModel;
                            int i;
                            Throwable th;
                            o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
                            o.LJIIIZ(editDone, "editDone");
                            if (c6qo == null || (globalHashTagStickerModel = c6qo.LIZ()) == null) {
                                globalHashTagStickerModel = new GlobalHashTagStickerModel(null, 0L, null, false, false, false, 63, null);
                            }
                            GlobalHashTagStickerModel globalHashTagStickerModel2 = (GlobalHashTagStickerModel) globalHashTagStickerModel;
                            C6T1 c6t1 = this.LJII;
                            if (c6t1 == null) {
                                this.LJII = new C6T1(this.LIZ);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                FrameLayout frameLayout3 = this.LIZJ;
                                C6T1 c6t12 = this.LJII;
                                if (c6t12 != null) {
                                    frameLayout3.addView(c6t12, layoutParams);
                                    new Point((this.LIZIZ.getRight() + this.LIZIZ.getLeft()) / 2, (this.LIZIZ.getBottom() + this.LIZIZ.getTop()) / 2);
                                    C6T1 c6t13 = this.LJII;
                                    if (c6t13 != null) {
                                        LifecycleOwner owner = this.LIZLLL;
                                        o.LJIIIZ(owner, "owner");
                                        i = 0;
                                        th = null;
                                        c6t13.LJLJJI = GlobalHashTagStickerModel.copy$default(globalHashTagStickerModel2, BaseStickerModel.copy$default(globalHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, null, false, false, false, 62, null);
                                        c6t13.LJLJJL = new C1NS<>(GlobalHashTagStickerModel.copy$default(globalHashTagStickerModel2, null, 0L, null, true, true, true, 7, null));
                                        c6t13.LJLJJLL = new C1NS<>(GlobalHashTagStickerModel.copy$default(globalHashTagStickerModel2, null, 0L, null, false, false, false, 7, null));
                                        c6t13.LJLJLLL = owner;
                                        o.LJII(C16880lQ.LLLZIIL(R.layout.azg, C16880lQ.LLZIL(c6t13.getContext()), c6t13), "null cannot be cast to non-null type android.view.ViewGroup");
                                        View findViewById = c6t13.findViewById(R.id.e2x);
                                        o.LJIIIIZZ(findViewById, "findViewById(R.id.hashtag_sticker_edit_root)");
                                        c6t13.LJLL = (ViewGroup) findViewById;
                                        View findViewById2 = c6t13.findViewById(R.id.la4);
                                        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title_layout)");
                                        c6t13.LJLLILLLL = findViewById2;
                                        View findViewById3 = c6t13.findViewById(R.id.kgr);
                                        o.LJIIIIZZ(findViewById3, "findViewById(R.id.sticker_container_layout)");
                                        c6t13.LJLLI = (FrameLayout) findViewById3;
                                        Context context2 = c6t13.getContext();
                                        o.LJIIIIZZ(context2, "context");
                                        C161006To c161006To = new C161006To(context2, null, 14);
                                        C1NS<GlobalHashTagStickerModel> c1ns = c6t13.LJLJJL;
                                        if (c1ns != null) {
                                            LifecycleOwner lifecycleOwner2 = c6t13.LJLJLLL;
                                            if (lifecycleOwner2 != null) {
                                                c161006To.LIZ(c1ns, lifecycleOwner2);
                                                c6t13.LJLJL = c161006To;
                                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                                layoutParams2.gravity = 17;
                                                FrameLayout frameLayout4 = c6t13.LJLLI;
                                                if (frameLayout4 != null) {
                                                    C161006To c161006To2 = c6t13.LJLJL;
                                                    if (c161006To2 != null) {
                                                        frameLayout4.addView(c161006To2, layoutParams2);
                                                        Context context3 = c6t13.getContext();
                                                        o.LJIIIIZZ(context3, "context");
                                                        C161006To c161006To3 = new C161006To(context3, null, 14);
                                                        C1NS<GlobalHashTagStickerModel> c1ns2 = c6t13.LJLJJLL;
                                                        if (c1ns2 != null) {
                                                            LifecycleOwner lifecycleOwner3 = c6t13.LJLJLLL;
                                                            if (lifecycleOwner3 != null) {
                                                                c161006To3.LIZ(c1ns2, lifecycleOwner3);
                                                                c6t13.LJLJLJ = c161006To3;
                                                                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                                                                layoutParams3.gravity = 17;
                                                                C161006To c161006To4 = c6t13.LJLJLJ;
                                                                if (c161006To4 != null) {
                                                                    c6t13.addView(c161006To4, layoutParams3);
                                                                    ViewGroup viewGroup = c6t13.LJLL;
                                                                    if (viewGroup != null) {
                                                                        C16880lQ.LJIIL(viewGroup, new ACListenerS22S0100000_2(c6t13, 17));
                                                                    } else {
                                                                        o.LJIJI("editRootLayout");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("animStickerView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("lifecycleOwner");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("animStateContainer");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("hashtagStickerView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("hashTagStickerContainer");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("lifecycleOwner");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("stateContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("hashTagStickerEditView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("hashTagStickerEditView");
                                    throw null;
                                }
                            } else {
                                i = 0;
                                th = null;
                                c6t1.LJLJJI = GlobalHashTagStickerModel.copy$default(globalHashTagStickerModel2, BaseStickerModel.copy$default(globalHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, null, false, false, false, 62, null);
                                C1NS<GlobalHashTagStickerModel> c1ns3 = c6t1.LJLJJL;
                                if (c1ns3 != null) {
                                    c1ns3.LJ(new AqS168S0100000_2(globalHashTagStickerModel2, 21));
                                    C1NS<GlobalHashTagStickerModel> c1ns4 = c6t1.LJLJJLL;
                                    if (c1ns4 != null) {
                                        c1ns4.LJ(new AqS168S0100000_2(globalHashTagStickerModel2, 22));
                                    } else {
                                        o.LJIJI("animStateContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("stateContainer");
                                    throw null;
                                }
                            }
                            C6T1 c6t14 = this.LJII;
                            if (c6t14 != null) {
                                c6t14.setStickerEditListener(new C6Q4() { // from class: X.6RW
                                    @Override // X.C6Q4
                                    public final void LJ() {
                                    }

                                    @Override // X.C6Q4
                                    public final void LJFF() {
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZLLL() {
                                        C6QO c6qo2 = c6qo;
                                        if (c6qo2 != null) {
                                            c6qo2.setVisible(false);
                                        }
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZIZ(StickerModel stickerModel) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZJ(StickerModel stickerModel) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZ(StickerModel stickerModel, boolean z) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                        C6Q4 c6q4 = c6px;
                                        if (c6q4 != null) {
                                            c6q4.LIZ(stickerModel, false);
                                        }
                                        if ((stickerModel instanceof GlobalHashTagStickerModel) && stickerModel != null) {
                                            editDone.invoke(stickerModel);
                                        }
                                    }
                                });
                                C6T1 c6t15 = this.LJII;
                                if (c6t15 != null) {
                                    c6t15.setVisibility(i);
                                    GlobalHashTagStickerModel globalHashTagStickerModel3 = c6t15.LJLJJI;
                                    if (globalHashTagStickerModel3 != null) {
                                        if (globalHashTagStickerModel3.getContentText().length() == 0) {
                                            C1NS<GlobalHashTagStickerModel> c1ns5 = c6t15.LJLJJL;
                                            if (c1ns5 != null) {
                                                c1ns5.LJ(C6TH.LJLIL);
                                                C1NS<GlobalHashTagStickerModel> c1ns6 = c6t15.LJLJJLL;
                                                if (c1ns6 != null) {
                                                    c1ns6.LJ(C6TI.LJLIL);
                                                } else {
                                                    o.LJIJI("animStateContainer");
                                                    throw th;
                                                }
                                            } else {
                                                o.LJIJI("stateContainer");
                                                throw th;
                                            }
                                        }
                                        c6t15.postDelayed(new ARunnableS38S0100000_2(c6t15, 17), 300L);
                                        return;
                                    }
                                    o.LJIJI("savedHashTagStickerModel");
                                    throw th;
                                }
                                o.LJIJI("hashTagStickerEditView");
                                throw th;
                            }
                            o.LJIJI("hashTagStickerEditView");
                            throw th;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context, frameLayout, frameLayout2, lifecycleOwner, c159816Oz, LJIILL4);
                            o.LJIIIZ(context, "context");
                            o.LJIIIZ(frameLayout, "stickerContainer");
                            o.LJIIIZ(frameLayout2, "stickerHigherContainer");
                            o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                            o.LJIIIZ(c159816Oz, "stickerConfig");
                            o.LJIIIZ(LJIILL4, "stickerObjectContainer");
                            this.LJIIIIZZ = (InterfaceC159886Pg) LJIILL4.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class));
                        }
                    });
                    break;
                case 2:
                    List<C6PN<?>> list2 = this.LJIILIIL;
                    final Context context2 = this.LIZ;
                    final FrameLayout frameLayout3 = this.LIZIZ;
                    final FrameLayout frameLayout4 = this.LIZJ;
                    final LifecycleOwner lifecycleOwner2 = this.LJFF;
                    final C159816Oz c159816Oz2 = this.LIZLLL;
                    final C160056Px LJIILL5 = LJIILL();
                    ((ArrayList) list2).add(new C6PN<SingleHashTagStickerModel>(context2, frameLayout3, frameLayout4, lifecycleOwner2, c159816Oz2, LJIILL5) { // from class: X.6Sz
                        public C6T2 LJII;
                        public final InterfaceC159886Pg LJIIIIZZ;

                        @Override // X.C6PN
                        public final EnumC157656Gr LIZLLL() {
                            return EnumC157656Gr.PICTURE_HASHTAG_SINGLE;
                        }

                        @Override // X.C6PN
                        public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                            o.LJIIIZ(stickerModel, "stickerModel");
                            SingleHashTagStickerModel singleHashTagStickerModel = (SingleHashTagStickerModel) stickerModel;
                            if (!C78880UxY.LJJLIIIIJ(singleHashTagStickerModel.getBaseStickerModel())) {
                                C78880UxY.LJL(singleHashTagStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LIZLLL());
                            }
                            return SingleHashTagStickerModel.copy$default(singleHashTagStickerModel, BaseStickerModel.copy$default(singleHashTagStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -2, null), 0L, null, false, false, false, 30, null);
                        }

                        @Override // X.C6PN
                        public final C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner3) {
                            return new C161056Tt(this.LIZ, SingleHashTagStickerModel.copy$default((SingleHashTagStickerModel) stickerModel, null, 0L, null, false, false, true, 31, null), this.LIZIZ, C159636Oh.L(c159636Oh, false, false, false, false, true, null, false, 131007), lifecycleOwner3, this.LJFF);
                        }

                        @Override // X.C6PN
                        public final void LJ(final C6QO c6qo, final C6PX c6px, String createEditEnterMethod, final InterfaceC88472Yns editDone) {
                            StickerModel singleHashTagStickerModel;
                            int i;
                            Throwable th;
                            o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
                            o.LJIIIZ(editDone, "editDone");
                            if (c6qo == null || (singleHashTagStickerModel = c6qo.LIZ()) == null) {
                                singleHashTagStickerModel = new SingleHashTagStickerModel(null, 0L, null, false, false, false, 63, null);
                            }
                            SingleHashTagStickerModel singleHashTagStickerModel2 = (SingleHashTagStickerModel) singleHashTagStickerModel;
                            C6T2 c6t2 = this.LJII;
                            if (c6t2 == null) {
                                this.LJII = new C6T2(this.LIZ);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                FrameLayout frameLayout5 = this.LIZJ;
                                C6T2 c6t22 = this.LJII;
                                if (c6t22 != null) {
                                    frameLayout5.addView(c6t22, layoutParams);
                                    new Point((this.LIZIZ.getRight() + this.LIZIZ.getLeft()) / 2, (this.LIZIZ.getBottom() + this.LIZIZ.getTop()) / 2);
                                    C6T2 c6t23 = this.LJII;
                                    if (c6t23 != null) {
                                        LifecycleOwner owner = this.LIZLLL;
                                        o.LJIIIZ(owner, "owner");
                                        i = 0;
                                        th = null;
                                        c6t23.LJLJJI = SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, BaseStickerModel.copy$default(singleHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, null, false, false, false, 62, null);
                                        c6t23.LJLJJL = new C1NS<>(SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, null, 0L, null, true, true, true, 7, null));
                                        c6t23.LJLJJLL = new C1NS<>(SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, null, 0L, null, false, false, false, 7, null));
                                        c6t23.LJLJLLL = owner;
                                        o.LJII(C16880lQ.LLLZIIL(R.layout.azg, C16880lQ.LLZIL(c6t23.getContext()), c6t23), "null cannot be cast to non-null type android.view.ViewGroup");
                                        View findViewById = c6t23.findViewById(R.id.e2x);
                                        o.LJIIIIZZ(findViewById, "findViewById(R.id.hashtag_sticker_edit_root)");
                                        c6t23.LJLL = (ViewGroup) findViewById;
                                        View findViewById2 = c6t23.findViewById(R.id.la4);
                                        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title_layout)");
                                        c6t23.LJLLILLLL = findViewById2;
                                        View findViewById3 = c6t23.findViewById(R.id.kgr);
                                        o.LJIIIIZZ(findViewById3, "findViewById(R.id.sticker_container_layout)");
                                        c6t23.LJLLI = (FrameLayout) findViewById3;
                                        Context context3 = c6t23.getContext();
                                        o.LJIIIIZZ(context3, "context");
                                        C161016Tp c161016Tp = new C161016Tp(context3, null, 14);
                                        C1NS<SingleHashTagStickerModel> c1ns = c6t23.LJLJJL;
                                        if (c1ns != null) {
                                            LifecycleOwner lifecycleOwner3 = c6t23.LJLJLLL;
                                            if (lifecycleOwner3 != null) {
                                                c161016Tp.LIZ(c1ns, lifecycleOwner3);
                                                c6t23.LJLJL = c161016Tp;
                                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                                layoutParams2.gravity = 17;
                                                FrameLayout frameLayout6 = c6t23.LJLLI;
                                                if (frameLayout6 != null) {
                                                    C161016Tp c161016Tp2 = c6t23.LJLJL;
                                                    if (c161016Tp2 != null) {
                                                        frameLayout6.addView(c161016Tp2, layoutParams2);
                                                        Context context4 = c6t23.getContext();
                                                        o.LJIIIIZZ(context4, "context");
                                                        C161016Tp c161016Tp3 = new C161016Tp(context4, null, 14);
                                                        C1NS<SingleHashTagStickerModel> c1ns2 = c6t23.LJLJJLL;
                                                        if (c1ns2 != null) {
                                                            LifecycleOwner lifecycleOwner4 = c6t23.LJLJLLL;
                                                            if (lifecycleOwner4 != null) {
                                                                c161016Tp3.LIZ(c1ns2, lifecycleOwner4);
                                                                c6t23.LJLJLJ = c161016Tp3;
                                                                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                                                                layoutParams3.gravity = 17;
                                                                C161016Tp c161016Tp4 = c6t23.LJLJLJ;
                                                                if (c161016Tp4 != null) {
                                                                    c6t23.addView(c161016Tp4, layoutParams3);
                                                                    ViewGroup viewGroup = c6t23.LJLL;
                                                                    if (viewGroup != null) {
                                                                        C16880lQ.LJIIL(viewGroup, new ACListenerS22S0100000_2(c6t23, 86));
                                                                    } else {
                                                                        o.LJIJI("editRootLayout");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("animStickerView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("lifecycleOwner");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("animStateContainer");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("hashtagStickerView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("hashTagStickerContainer");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("lifecycleOwner");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("stateContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("hashTagStickerEditView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("hashTagStickerEditView");
                                    throw null;
                                }
                            } else {
                                i = 0;
                                th = null;
                                c6t2.LJLJJI = SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, BaseStickerModel.copy$default(singleHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, null, false, false, false, 62, null);
                                C1NS<SingleHashTagStickerModel> c1ns3 = c6t2.LJLJJL;
                                if (c1ns3 != null) {
                                    c1ns3.LJ(new AqS168S0100000_2(singleHashTagStickerModel2, 366));
                                    C1NS<SingleHashTagStickerModel> c1ns4 = c6t2.LJLJJLL;
                                    if (c1ns4 != null) {
                                        c1ns4.LJ(new AqS168S0100000_2(singleHashTagStickerModel2, 367));
                                    } else {
                                        o.LJIJI("animStateContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("stateContainer");
                                    throw null;
                                }
                            }
                            C6T2 c6t24 = this.LJII;
                            if (c6t24 != null) {
                                c6t24.setStickerEditListener(new C6Q4() { // from class: X.6RX
                                    @Override // X.C6Q4
                                    public final void LJ() {
                                    }

                                    @Override // X.C6Q4
                                    public final void LJFF() {
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZLLL() {
                                        C6QO c6qo2 = c6qo;
                                        if (c6qo2 != null) {
                                            c6qo2.setVisible(false);
                                        }
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZIZ(StickerModel stickerModel) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZJ(StickerModel stickerModel) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZ(StickerModel stickerModel, boolean z) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                        C6Q4 c6q4 = c6px;
                                        if (c6q4 != null) {
                                            c6q4.LIZ(stickerModel, false);
                                        }
                                        if ((stickerModel instanceof SingleHashTagStickerModel) && stickerModel != null) {
                                            editDone.invoke(stickerModel);
                                        }
                                    }
                                });
                                C6T2 c6t25 = this.LJII;
                                if (c6t25 != null) {
                                    c6t25.setVisibility(i);
                                    SingleHashTagStickerModel singleHashTagStickerModel3 = c6t25.LJLJJI;
                                    if (singleHashTagStickerModel3 != null) {
                                        if (singleHashTagStickerModel3.getContentText().length() == 0) {
                                            C1NS<SingleHashTagStickerModel> c1ns5 = c6t25.LJLJJL;
                                            if (c1ns5 != null) {
                                                c1ns5.LJ(C6TM.LJLIL);
                                                C1NS<SingleHashTagStickerModel> c1ns6 = c6t25.LJLJJLL;
                                                if (c1ns6 != null) {
                                                    c1ns6.LJ(C6TN.LJLIL);
                                                } else {
                                                    o.LJIJI("animStateContainer");
                                                    throw th;
                                                }
                                            } else {
                                                o.LJIJI("stateContainer");
                                                throw th;
                                            }
                                        }
                                        c6t25.postDelayed(new ARunnableS38S0100000_2(c6t25, 123), 300L);
                                        return;
                                    }
                                    o.LJIJI("savedHashTagStickerModel");
                                    throw th;
                                }
                                o.LJIJI("hashTagStickerEditView");
                                throw th;
                            }
                            o.LJIJI("hashTagStickerEditView");
                            throw th;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context2, frameLayout3, frameLayout4, lifecycleOwner2, c159816Oz2, LJIILL5);
                            o.LJIIIZ(context2, "context");
                            o.LJIIIZ(frameLayout3, "stickerContainer");
                            o.LJIIIZ(frameLayout4, "stickerHigherContainer");
                            o.LJIIIZ(lifecycleOwner2, "lifecycleOwner");
                            o.LJIIIZ(c159816Oz2, "stickerConfig");
                            o.LJIIIZ(LJIILL5, "stickerObjectContainer");
                            this.LJIIIIZZ = (InterfaceC159886Pg) LJIILL5.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class));
                        }
                    });
                    break;
                case 3:
                    List<C6PN<?>> list3 = this.LJIILIIL;
                    final Context context3 = this.LIZ;
                    final FrameLayout frameLayout5 = this.LIZIZ;
                    final FrameLayout frameLayout6 = this.LIZJ;
                    final LifecycleOwner lifecycleOwner3 = this.LJFF;
                    final C159816Oz c159816Oz3 = this.LIZLLL;
                    final C160056Px LJIILL6 = LJIILL();
                    ((ArrayList) list3).add(new C6PN<EmbedHashTagStickerModel>(context3, frameLayout5, frameLayout6, lifecycleOwner3, c159816Oz3, LJIILL6) { // from class: X.6Sn
                        public C160746So LJII;
                        public final InterfaceC159886Pg LJIIIIZZ;

                        @Override // X.C6PN
                        public final EnumC157656Gr LIZLLL() {
                            return EnumC157656Gr.PICTURE_HASHTAG_EMBED;
                        }

                        @Override // X.C6PN
                        public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                            String LJFF;
                            o.LJIIIZ(stickerModel, "stickerModel");
                            EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) stickerModel;
                            if (!C78880UxY.LJJLIIIIJ(embedHashTagStickerModel.getBaseStickerModel())) {
                                C78880UxY.LJL(embedHashTagStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LIZLLL());
                            }
                            BaseStickerModel baseStickerModel = embedHashTagStickerModel.getBaseStickerModel();
                            String str = this.LJ.LJLJI;
                            String separator = File.separator;
                            o.LJIIIIZZ(separator, "separator");
                            if (ujb.o.LJJJJ(str, separator, false)) {
                                LJFF = this.LJ.LJLJI;
                            } else {
                                StringBuilder LIZ = X1D.LIZ();
                                LJFF = JBR.LJFF(LIZ, this.LJ.LJLJI, separator, LIZ);
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(LJFF);
                            LIZ2.append(System.currentTimeMillis());
                            LIZ2.append(".png");
                            return EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel, BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, true, X1D.LIZIZ(LIZ2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -98306, null), 0L, null, false, false, false, 30, null);
                        }

                        @Override // X.C6PN
                        public final C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner4) {
                            return new C160966Tk(this.LIZ, EmbedHashTagStickerModel.copy$default((EmbedHashTagStickerModel) stickerModel, null, 0L, null, false, false, true, 31, null), this.LIZIZ, C159636Oh.L(c159636Oh, false, false, false, false, true, null, false, 131007), lifecycleOwner4, this.LJFF);
                        }

                        @Override // X.C6PN
                        public final void LJ(final C6QO c6qo, final C6PX c6px, String createEditEnterMethod, final InterfaceC88472Yns editDone) {
                            StickerModel embedHashTagStickerModel;
                            int i;
                            Throwable th;
                            o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
                            o.LJIIIZ(editDone, "editDone");
                            if (c6qo == null || (embedHashTagStickerModel = c6qo.LIZ()) == null) {
                                embedHashTagStickerModel = new EmbedHashTagStickerModel(null, 0L, null, false, false, false, 63, null);
                            }
                            EmbedHashTagStickerModel embedHashTagStickerModel2 = (EmbedHashTagStickerModel) embedHashTagStickerModel;
                            C160746So c160746So = this.LJII;
                            if (c160746So == null) {
                                this.LJII = new C160746So(this.LIZ);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                FrameLayout frameLayout7 = this.LIZJ;
                                C160746So c160746So2 = this.LJII;
                                if (c160746So2 != null) {
                                    frameLayout7.addView(c160746So2, layoutParams);
                                    new Point((this.LIZIZ.getRight() + this.LIZIZ.getLeft()) / 2, (this.LIZIZ.getBottom() + this.LIZIZ.getTop()) / 2);
                                    C160746So c160746So3 = this.LJII;
                                    if (c160746So3 != null) {
                                        LifecycleOwner owner = this.LIZLLL;
                                        o.LJIIIZ(owner, "owner");
                                        i = 0;
                                        th = null;
                                        c160746So3.LJLJJI = EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel2, BaseStickerModel.copy$default(embedHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, null, false, false, false, 62, null);
                                        c160746So3.LJLJJL = new C1NS<>(EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel2, null, 0L, null, true, true, true, 7, null));
                                        c160746So3.LJLJJLL = new C1NS<>(EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel2, null, 0L, null, false, false, false, 7, null));
                                        c160746So3.LJLJLLL = owner;
                                        o.LJII(C16880lQ.LLLZIIL(R.layout.azg, C16880lQ.LLZIL(c160746So3.getContext()), c160746So3), "null cannot be cast to non-null type android.view.ViewGroup");
                                        View findViewById = c160746So3.findViewById(R.id.e2x);
                                        o.LJIIIIZZ(findViewById, "findViewById(R.id.hashtag_sticker_edit_root)");
                                        c160746So3.LJLL = (ViewGroup) findViewById;
                                        View findViewById2 = c160746So3.findViewById(R.id.la4);
                                        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title_layout)");
                                        c160746So3.LJLLILLLL = findViewById2;
                                        View findViewById3 = c160746So3.findViewById(R.id.kgr);
                                        o.LJIIIIZZ(findViewById3, "findViewById(R.id.sticker_container_layout)");
                                        c160746So3.LJLLI = (FrameLayout) findViewById3;
                                        Context context4 = c160746So3.getContext();
                                        o.LJIIIIZZ(context4, "context");
                                        C160946Ti c160946Ti = new C160946Ti(context4, null, 14);
                                        C1NS<EmbedHashTagStickerModel> c1ns = c160746So3.LJLJJL;
                                        if (c1ns != null) {
                                            LifecycleOwner lifecycleOwner4 = c160746So3.LJLJLLL;
                                            if (lifecycleOwner4 != null) {
                                                c160946Ti.LIZ(c1ns, lifecycleOwner4);
                                                c160746So3.LJLJL = c160946Ti;
                                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                                layoutParams2.gravity = 17;
                                                FrameLayout frameLayout8 = c160746So3.LJLLI;
                                                if (frameLayout8 != null) {
                                                    C160946Ti c160946Ti2 = c160746So3.LJLJL;
                                                    if (c160946Ti2 != null) {
                                                        frameLayout8.addView(c160946Ti2, layoutParams2);
                                                        Context context5 = c160746So3.getContext();
                                                        o.LJIIIIZZ(context5, "context");
                                                        C160946Ti c160946Ti3 = new C160946Ti(context5, null, 14);
                                                        C1NS<EmbedHashTagStickerModel> c1ns2 = c160746So3.LJLJJLL;
                                                        if (c1ns2 != null) {
                                                            LifecycleOwner lifecycleOwner5 = c160746So3.LJLJLLL;
                                                            if (lifecycleOwner5 != null) {
                                                                c160946Ti3.LIZ(c1ns2, lifecycleOwner5);
                                                                c160746So3.LJLJLJ = c160946Ti3;
                                                                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                                                                layoutParams3.gravity = 17;
                                                                C160946Ti c160946Ti4 = c160746So3.LJLJLJ;
                                                                if (c160946Ti4 != null) {
                                                                    c160746So3.addView(c160946Ti4, layoutParams3);
                                                                    ViewGroup viewGroup = c160746So3.LJLL;
                                                                    if (viewGroup != null) {
                                                                        C16880lQ.LJIIL(viewGroup, new ACListenerS22S0100000_2(c160746So3, 12));
                                                                    } else {
                                                                        o.LJIJI("editRootLayout");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("animStickerView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("lifecycleOwner");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("animStateContainer");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("hashtagStickerView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("hashTagStickerContainer");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("lifecycleOwner");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("stateContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("hashTagStickerEditView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("hashTagStickerEditView");
                                    throw null;
                                }
                            } else {
                                i = 0;
                                th = null;
                                c160746So.LJLJJI = EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel2, BaseStickerModel.copy$default(embedHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, null, false, false, false, 62, null);
                                C1NS<EmbedHashTagStickerModel> c1ns3 = c160746So.LJLJJL;
                                if (c1ns3 != null) {
                                    c1ns3.LJ(new AqS168S0100000_2(embedHashTagStickerModel2, 8));
                                    C1NS<EmbedHashTagStickerModel> c1ns4 = c160746So.LJLJJLL;
                                    if (c1ns4 != null) {
                                        c1ns4.LJ(new AqS168S0100000_2(embedHashTagStickerModel2, 9));
                                    } else {
                                        o.LJIJI("animStateContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("stateContainer");
                                    throw null;
                                }
                            }
                            C160746So c160746So4 = this.LJII;
                            if (c160746So4 != null) {
                                c160746So4.setStickerEditListener(new C6Q4() { // from class: X.6RV
                                    @Override // X.C6Q4
                                    public final void LJ() {
                                    }

                                    @Override // X.C6Q4
                                    public final void LJFF() {
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZLLL() {
                                        C6QO c6qo2 = c6qo;
                                        if (c6qo2 != null) {
                                            c6qo2.setVisible(false);
                                        }
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZIZ(StickerModel stickerModel) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZJ(StickerModel stickerModel) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                    }

                                    @Override // X.C6Q4
                                    public final void LIZ(StickerModel stickerModel, boolean z) {
                                        o.LJIIIZ(stickerModel, "stickerModel");
                                        C6Q4 c6q4 = c6px;
                                        if (c6q4 != null) {
                                            c6q4.LIZ(stickerModel, false);
                                        }
                                        if ((stickerModel instanceof EmbedHashTagStickerModel) && stickerModel != null) {
                                            editDone.invoke(stickerModel);
                                        }
                                    }
                                });
                                C160746So c160746So5 = this.LJII;
                                if (c160746So5 != null) {
                                    c160746So5.setVisibility(i);
                                    EmbedHashTagStickerModel embedHashTagStickerModel3 = c160746So5.LJLJJI;
                                    if (embedHashTagStickerModel3 != null) {
                                        if (embedHashTagStickerModel3.getContentText().length() == 0) {
                                            C1NS<EmbedHashTagStickerModel> c1ns5 = c160746So5.LJLJJL;
                                            if (c1ns5 != null) {
                                                c1ns5.LJ(C160806Su.LJLIL);
                                                C1NS<EmbedHashTagStickerModel> c1ns6 = c160746So5.LJLJJLL;
                                                if (c1ns6 != null) {
                                                    c1ns6.LJ(C160816Sv.LJLIL);
                                                } else {
                                                    o.LJIJI("animStateContainer");
                                                    throw th;
                                                }
                                            } else {
                                                o.LJIJI("stateContainer");
                                                throw th;
                                            }
                                        }
                                        c160746So5.postDelayed(new ARunnableS38S0100000_2(c160746So5, 7), 300L);
                                        return;
                                    }
                                    o.LJIJI("savedHashTagStickerModel");
                                    throw th;
                                }
                                o.LJIJI("hashTagStickerEditView");
                                throw th;
                            }
                            o.LJIJI("hashTagStickerEditView");
                            throw th;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context3, frameLayout5, frameLayout6, lifecycleOwner3, c159816Oz3, LJIILL6);
                            o.LJIIIZ(context3, "context");
                            o.LJIIIZ(frameLayout5, "stickerContainer");
                            o.LJIIIZ(frameLayout6, "stickerHigherContainer");
                            o.LJIIIZ(lifecycleOwner3, "lifecycleOwner");
                            o.LJIIIZ(c159816Oz3, "stickerConfig");
                            o.LJIIIZ(LJIILL6, "stickerObjectContainer");
                            this.LJIIIIZZ = (InterfaceC159886Pg) LJIILL6.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class));
                        }
                    });
                    break;
                case 4:
                    ((ArrayList) this.LJIILIIL).add(new C6SM(this.LIZ, this.LIZIZ, this.LIZJ, this.LJFF, this.LIZLLL, this.LJ, LJIIL(), LJIILL()));
                    break;
                case 5:
                    ((ArrayList) this.LJIILIIL).add(new C6OG(this.LIZ, this.LIZIZ, this.LIZJ, this.LJFF, this.LIZLLL, LJIILL()));
                    break;
                case 6:
                    List<C6PN<?>> list4 = this.LJIILIIL;
                    final Context context4 = this.LIZ;
                    final FrameLayout frameLayout7 = this.LIZIZ;
                    final FrameLayout frameLayout8 = this.LIZJ;
                    final LifecycleOwner lifecycleOwner4 = this.LJFF;
                    final C159816Oz c159816Oz4 = this.LIZLLL;
                    final InterfaceC159886Pg interfaceC159886Pg = this.LJ;
                    final C6QI LJIIL = LJIIL();
                    final C160056Px LJIILL7 = LJIILL();
                    ((ArrayList) list4).add(new C6PN<AICaptionTagStickerModel>(context4, frameLayout7, frameLayout8, lifecycleOwner4, c159816Oz4, interfaceC159886Pg, LJIIL, LJIILL7) { // from class: X.6Oj
                        public final InterfaceC159886Pg LJII;

                        @Override // X.C6PN
                        public final void LJ(C6QO c6qo, C6PX c6px, String createEditEnterMethod, InterfaceC88472Yns editDone) {
                            o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
                            o.LJIIIZ(editDone, "editDone");
                        }

                        @Override // X.C6PN
                        public final EnumC157656Gr LIZLLL() {
                            return EnumC157656Gr.AI_CAPTION_TAG;
                        }

                        @Override // X.C6PN
                        public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                            o.LJIIIZ(stickerModel, "stickerModel");
                            AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModel;
                            return AICaptionTagStickerModel.copy$default(aICaptionTagStickerModel, BaseStickerModel.copy$default(aICaptionTagStickerModel.getBaseStickerModel(), i + 1, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -2, null), false, false, 6, null);
                        }

                        @Override // X.C6PN
                        public final C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner5) {
                            return new C159646Oi(this.LIZ, AICaptionTagStickerModel.copy$default((AICaptionTagStickerModel) stickerModel, null, false, false, 7, null), this.LIZIZ, this.LJII, c159636Oh, lifecycleOwner5, this.LJFF);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(context4, frameLayout7, frameLayout8, lifecycleOwner4, c159816Oz4, LJIILL7);
                            o.LJIIIZ(context4, "context");
                            o.LJIIIZ(frameLayout7, "stickerContainer");
                            o.LJIIIZ(frameLayout8, "stickerHigherContainer");
                            o.LJIIIZ(lifecycleOwner4, "lifecycleOwner");
                            o.LJIIIZ(c159816Oz4, "stickerConfig");
                            o.LJIIIZ(interfaceC159886Pg, "editProvideStickerService");
                            o.LJIIIZ(LJIIL, "stickerAssistManager");
                            o.LJIIIZ(LJIILL7, "stickerObjectContainer");
                            this.LJII = interfaceC159886Pg;
                        }
                    });
                    break;
            }
        }
        ((C159876Pf) this.LJIIIIZZ.getValue()).LJI = new C6Q4() { // from class: X.6PX
            @Override // X.C6Q4
            public final void LIZLLL() {
            }

            @Override // X.C6Q4
            public final void LJ() {
            }

            @Override // X.C6Q4
            public final void LJFF() {
            }

            @Override // X.C6Q4
            public final void LIZIZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                Iterator<InterfaceC160026Pu> it2 = C6PV.this.LJIIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(stickerModel);
                }
            }

            @Override // X.C6Q4
            public final void LIZJ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel] */
            @Override // X.C6Q4
            public final void LIZ(StickerModel stickerModel, boolean z) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6PV.this.LJ.LJIILJJIL(2);
                if (!(stickerModel instanceof QAStickerModel)) {
                    C6QO LJJJ = C30581Hy.LJJJ(stickerModel.getId(), C6PV.this.LJIIJJI);
                    C68322mC c68322mC = new C68322mC();
                    c68322mC.element = stickerModel;
                    if (LJJJ != null) {
                        if (stickerModel.isNotEmptyModel()) {
                            LJJJ.LJI((StickerModel) c68322mC.element);
                        } else {
                            C6PV.this.LIZ(((StickerModel) c68322mC.element).getId(), "DONE_WITH_TEXT_NULL");
                        }
                        Iterator it2 = ((ArrayList) C6PV.this.LJIIL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC160026Pu) it2.next()).LIZ((StickerModel) c68322mC.element, z);
                        }
                        return;
                    }
                    if (stickerModel.isNotEmptyModel()) {
                        C6PV c6pv = C6PV.this;
                        StickerModel stickerModel2 = (StickerModel) c68322mC.element;
                        c68322mC.element = c6pv.Q7(stickerModel2, stickerModel2.getStickerType(), false);
                        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C6PY(C6PV.this, c68322mC, z, null), 3);
                    }
                }
            }
        };
        LJIIL().LJIIIIZZ = new C159846Pc(this);
        LJIIL().LJIIIZ = new C6Q2(this);
        C6QI LJIIL2 = LJIIL();
        AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 542);
        LJIIL2.getClass();
        LJIIL2.LJIIJ = aqS168S0100000_2;
        LJIIL().LJIIJJI = new AqS152S0100000_2(this, 901);
        LJIIJ(true);
    }

    public static void LJIILLIIL(String str) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("action", str);
        FMX.LJIIL("click_sticker_bubble", c145995oB.LIZ);
    }

    @Override // X.C6H7
    public final void B4(boolean z) {
        Iterator<C6QO> it = this.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().setVisible(z);
        }
    }

    @Override // X.C6H7
    public final void LIZIZ(AqS168S0100000_2 aqS168S0100000_2) {
        C10K.LIZJ(new ACallableS80S0200000_2(this, aqS168S0100000_2, 12));
    }

    @Override // X.C6H7
    public final List<StickerModel> LIZLLL(EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        List<C6QO> list = this.LJIIJJI;
        ArrayList arrayList = new ArrayList();
        for (C6QO c6qo : list) {
            if (c6qo.getStickerType() == stickerType) {
                arrayList.add(c6qo);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6QO) it.next()).LIZ());
        }
        return arrayList2;
    }

    @Override // X.C6H7
    public final void LJFF(int i) {
        LJIIL().LJIIJ.invoke(Integer.valueOf(i));
    }

    @Override // X.C6H7
    public final void LJII(int i) {
        Object obj;
        Iterator it = ((ArrayList) this.LJIIJJI).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C6QO) obj).LJJLIIIJLJLI() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6QO c6qo = (C6QO) obj;
        if (c6qo == null) {
            return;
        }
        StickerModel LIZ = c6qo.LIZ();
        if (LIZ instanceof QAStickerModel) {
            c6qo.setVisible(false);
            LJIIZILJ((QAStickerModel) LIZ, C6Q7.LJLIL);
        } else {
            c6qo.setVisible(true);
            C157706Gw.LIZIZ(this, LIZ.getStickerType(), c6qo, null, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(final C6OX c6ox) {
        c6ox.LJIL(new C6SE() { // from class: X.6Pv
            @Override // X.C6SE
            public final void LIZ(int i, boolean z) {
            }

            @Override // X.C6SE
            public final void LIZLLL() {
            }

            @Override // X.C6SE
            public final void LJIIL() {
            }

            @Override // X.C6SE
            public final void LIZIZ(int i) {
                C1NS<C6R1> LJIJ;
                C6R1 c6r1;
                List<InterfaceC160026Pu> list = this.LJIIL;
                C6OX c6ox2 = c6ox;
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC160026Pu) it.next()).LIZJ(c6ox2.LIZ());
                }
                C160316Qx c160316Qx = (C160316Qx) this.LJIILL().LIZJ(C65352Pkq.LIZ(C160316Qx.class));
                if (c160316Qx != null && (LJIJ = c160316Qx.LJIJ()) != null && (c6r1 = LJIJ.LJ) != null && c6r1.LIZIZ) {
                    return;
                }
                this.LJ.LJIILIIL(1);
            }

            @Override // X.C6SE
            public final void LJIIJ(int i) {
                C1NS<C6R1> LJIJ;
                C6R1 c6r1;
                C6QO LJIILIIL = this.LJIILIIL(i);
                if (LJIILIIL != null) {
                    LJIILIIL.LJI(LJIILIIL.LIZ());
                }
                List<InterfaceC160026Pu> list = this.LJIIL;
                C6OX c6ox2 = c6ox;
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC160026Pu) it.next()).LIZLLL(c6ox2.LIZ());
                }
                C160316Qx c160316Qx = (C160316Qx) this.LJIILL().LIZJ(C65352Pkq.LIZ(C160316Qx.class));
                if (c160316Qx != null && (LJIJ = c160316Qx.LJIJ()) != null && (c6r1 = LJIJ.LJ) != null && c6r1.LIZIZ) {
                    return;
                }
                this.LJ.LJIILJJIL(1);
            }

            @Override // X.C6SE
            public final void LJIIJJI(int i) {
                C6QO LJIILIIL = this.LJIILIIL(i);
                if (LJIILIIL != null) {
                    LJIILIIL.LJI(LJIILIIL.LIZ());
                }
                List<InterfaceC160026Pu> list = this.LJIIL;
                C6OX c6ox2 = c6ox;
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC160026Pu) it.next()).LJII(c6ox2.LIZ());
                }
            }

            @Override // X.C6SE
            public final void LJJI(int i) {
                C6QO LJIILIIL = this.LJIILIIL(i);
                if (LJIILIIL != null) {
                    LJIILIIL.LJI(LJIILIIL.LIZ());
                }
                List<InterfaceC160026Pu> list = this.LJIIL;
                C6OX c6ox2 = c6ox;
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC160026Pu) it.next()).LJFF(c6ox2.LIZ());
                }
            }

            @Override // X.C6SE
            public final void LJIILIIL(int i, RectF visibleRect) {
                o.LJIIIZ(visibleRect, "visibleRect");
            }

            @Override // X.C6SE
            public final void LJIILL(float f, int i, RectF visibleRect) {
                o.LJIIIZ(visibleRect, "visibleRect");
            }

            @Override // X.C6SE
            public final void LJ(int i, float f, float f2, RectF visibleRect) {
                o.LJIIIZ(visibleRect, "visibleRect");
            }

            @Override // X.C6SE
            public final void LJFF(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
                o.LJIIIZ(stickerType, "stickerType");
                o.LJIIIZ(visibleRect, "visibleRect");
                List<InterfaceC160026Pu> list = this.LJIIL;
                C6OX c6ox2 = c6ox;
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC160026Pu) it.next()).LJIIJJI(c6ox2.LIZ());
                }
            }

            @Override // X.C6SE
            public final void LJIILLIIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZJ(enumC157656Gr, rectF);
            }

            @Override // X.C6SE
            public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZLLL(enumC157656Gr, rectF);
            }

            @Override // X.C6SE
            public final void LJJ(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LJ(enumC157656Gr, rectF);
            }

            @Override // X.C6SE
            public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
            }

            @Override // X.C6SE
            public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
            }
        });
        if (c6ox.LJJIII().LJ.LJLLI.getFirst().floatValue() != -1.0f || c6ox.LJJIII().LJ.LJLLI.getSecond().floatValue() != -1.0f) {
            Object interceptor = LJIIL().LJIJ.getValue();
            o.LJIIIZ(interceptor, "interceptor");
            c6ox.LJJIFFI().LIZJ.add(interceptor);
        }
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6PQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLJJL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 131));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6PR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLJI);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 132));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6PS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLJJI);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 133));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6PT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLLL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 134));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6P3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLJJLL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 125));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6PO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLLILLLL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 126));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6PP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLJL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 127));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6P0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLJLLL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 128));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6P1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLLLLLL);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 129));
        c6ox.LJJIII().LIZ(new TBT() { // from class: X.6P2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C159636Oh) obj).LJLZ);
            }
        }).LJIIIIZZ(this.LJFF, Lifecycle.State.STARTED, new AqS133S0200000_2(c6ox, this, 130));
    }

    public final void LJIIJ(boolean z) {
        if (z) {
            C160446Rk LJIIJJI = LJIIJJI();
            C160456Rl listener = LJIIL().LIZLLL();
            LJIIJJI.getClass();
            o.LJIIIZ(listener, "listener");
            LJIIJJI.LJ.add(listener);
            C160446Rk LJIIJJI2 = LJIIJJI();
            C6QK listener2 = LJIIL().LIZJ();
            LJIIJJI2.getClass();
            o.LJIIIZ(listener2, "listener");
            LJIIJJI2.LJ.add(listener2);
            return;
        }
        C160446Rk LJIIJJI3 = LJIIJJI();
        C160456Rl listener3 = LJIIL().LIZLLL();
        LJIIJJI3.getClass();
        o.LJIIIZ(listener3, "listener");
        if (LJIIJJI3.LJ.contains(listener3)) {
            LJIIJJI3.LJ.remove(listener3);
        }
        C160446Rk LJIIJJI4 = LJIIJJI();
        C6QK listener4 = LJIIL().LIZJ();
        LJIIJJI4.getClass();
        o.LJIIIZ(listener4, "listener");
        if (!LJIIJJI4.LJ.contains(listener4)) {
            return;
        }
        LJIIJJI4.LJ.remove(listener4);
    }

    public final C6QO LJIILIIL(int i) {
        C6QO c6qo;
        Iterator<C6QO> it = this.LJIIJJI.iterator();
        while (true) {
            if (it.hasNext()) {
                c6qo = it.next();
                if (c6qo.LJJLIIIJLJLI() == i) {
                    break;
                }
            } else {
                c6qo = null;
                break;
            }
        }
        return c6qo;
    }

    @Override // X.C6H7
    public final List<C6QO> LLIIJLIL(EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        List<C6QO> list = this.LJIIJJI;
        ArrayList arrayList = new ArrayList();
        for (C6QO c6qo : list) {
            if (c6qo.getStickerType() == stickerType) {
                arrayList.add(c6qo);
            }
        }
        return arrayList;
    }

    @Override // X.C6H7
    public final void LLLILZJ(InterfaceC160026Pu listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJIIL).add(listener);
    }

    @Override // X.C6H7
    public final void N8(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        C6QO LJIILIIL = LJIILIIL(stickerModel.getId());
        if (LJIILIIL != null) {
            LJIILIIL.LJI(stickerModel);
        }
    }

    @Override // X.C6H7
    public final StickerModel P4(int i) {
        C6QO c6qo;
        Iterator<C6QO> it = this.LJIIJJI.iterator();
        while (true) {
            if (it.hasNext()) {
                c6qo = it.next();
                if (c6qo.LJJLIIIJLJLI() == i) {
                    break;
                }
            } else {
                c6qo = null;
                break;
            }
        }
        C6QO c6qo2 = c6qo;
        if (c6qo2 == null) {
            return null;
        }
        return c6qo2.LIZ();
    }

    @Override // X.C6H7
    public final <T> T T9(EnumC157656Gr type) {
        o.LJIIIZ(type, "type");
        T t = (T) LJIILJJIL().LIZ(type).LIZIZ();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // X.C6H7
    public final void g0(int i) {
        for (C6QO c6qo : this.LJIIJJI) {
            BaseStickerModel baseSticker = c6qo.LIZ().getBaseSticker();
            float f = i;
            if (baseSticker.getStartTime() >= f) {
                LIZ(baseSticker.getId(), "EXCEED_VIDEO_LENGTH");
            } else if (baseSticker.getEndTime() > f) {
                c6qo.LJIIZILJ(baseSticker.getStartTime(), f);
                Iterator<InterfaceC160026Pu> it = this.LJIIL.iterator();
                while (it.hasNext()) {
                    it.next().LJIILJJIL(baseSticker.getId());
                }
            }
        }
    }

    @Override // X.C6H7
    public final StickerModel LIZ(int i, String str) {
        Object obj;
        String str2;
        Iterator it = ((ArrayList) this.LJIIJJI).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C6QO) obj).LJJLIIIJLJLI() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6QO c6qo = (C6QO) obj;
        if (c6qo == null) {
            return null;
        }
        C160446Rk LJIIJJI = LJIIJJI();
        C6OX c6ox = (C6OX) c6qo;
        C6SD listener = c6ox.LJJIFFI();
        LJIIJJI.getClass();
        o.LJIIIZ(listener, "listener");
        if (LJIIJJI.LIZ.contains(listener)) {
            LJIIJJI.LIZ.remove(listener);
        }
        StickerDurationAutoRefresh LJJI = c6ox.LJJI();
        if (LJJI != null) {
            C48841JEv.LIZLLL(LJJI.LIZLLL, "");
        }
        InterfaceC159596Od interfaceC159596Od = c6ox.LJIIIIZZ;
        if (interfaceC159596Od != null) {
            interfaceC159596Od.destroy();
            ((ArrayList) this.LJIIJJI).remove(c6qo);
            Iterator it2 = ((ArrayList) this.LJIIL).iterator();
            while (it2.hasNext()) {
                InterfaceC160026Pu interfaceC160026Pu = (InterfaceC160026Pu) it2.next();
                StickerModel LIZ = c6ox.LIZ();
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                interfaceC160026Pu.LJIILLIIL(LIZ, str2);
            }
            return c6ox.LIZ();
        }
        o.LJIJI("stickerRender");
        throw null;
    }

    public final void LJIIZILJ(QAStickerModel stickerModel, final InterfaceC88472Yns<? super QAStickerModel, C76800UCe> editDone) {
        int i;
        boolean z;
        int i2;
        o.LJIIIZ(stickerModel, "stickerModel");
        o.LJIIIZ(editDone, "editDone");
        this.LJ.LJIILIIL(2);
        final C159876Pf c159876Pf = (C159876Pf) this.LJIIIIZZ.getValue();
        c159876Pf.getClass();
        if (stickerModel.getQuestionId() != 0) {
            return;
        }
        C6PW c6pw = c159876Pf.LJII;
        if (c6pw == null) {
            C6PW c6pw2 = new C6PW(c159876Pf.LIZ);
            ViewGroup.LayoutParams layoutParams = c159876Pf.LIZIZ.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.topMargin;
            } else {
                i2 = 0;
            }
            c6pw2.setQaStickerContainerTopMargin(i2);
            c159876Pf.LJII = c6pw2;
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = c159876Pf.LIZJ;
            C6PW c6pw3 = c159876Pf.LJII;
            if (c6pw3 != null) {
                frameLayout.addView(c6pw3, layoutParams2);
                Point point = new Point((c159876Pf.LIZIZ.getRight() + c159876Pf.LIZIZ.getLeft()) / 2, (c159876Pf.LIZIZ.getBottom() + c159876Pf.LIZIZ.getTop()) / 2);
                C6PW c6pw4 = c159876Pf.LJII;
                if (c6pw4 != null) {
                    LifecycleOwner owner = c159876Pf.LJFF;
                    o.LJIIIZ(owner, "owner");
                    i = 0;
                    c6pw4.LJLJJI = QAStickerModel.copy$default(stickerModel, BaseStickerModel.copy$default(stickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0.0f, 0L, null, null, 4194302, null);
                    c6pw4.LJLJJL = new C1NS<>(QAStickerModel.copy$default(stickerModel, null, 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, true, true, false, 0.0f, 0L, null, null, 3964927, null));
                    c6pw4.LJLJJLL = new C1NS<>(QAStickerModel.copy$default(stickerModel, null, 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0.0f, 0L, null, null, 3964927, null));
                    c6pw4.LJLLL = point;
                    c6pw4.LJLJLLL = owner;
                    o.LJII(C16880lQ.LLLZIIL(R.layout.c9h, C16880lQ.LLZIL(c6pw4.getContext()), c6pw4), "null cannot be cast to non-null type android.view.ViewGroup");
                    View findViewById = c6pw4.findViewById(R.id.ih_);
                    o.LJIIIIZZ(findViewById, "findViewById(R.id.qa_sticker_edit_root)");
                    c6pw4.LJLL = (ViewGroup) findViewById;
                    View findViewById2 = c6pw4.findViewById(R.id.la4);
                    o.LJIIIIZZ(findViewById2, "findViewById(R.id.title_layout)");
                    c6pw4.LJLLILLLL = findViewById2;
                    ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                    o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = c6pw4.LJLLLLLL;
                    View findViewById3 = c6pw4.findViewById(R.id.kgr);
                    o.LJIIIIZZ(findViewById3, "findViewById(R.id.sticker_container_layout)");
                    c6pw4.LJLLI = (FrameLayout) findViewById3;
                    Context context = c6pw4.getContext();
                    o.LJIIIIZZ(context, "context");
                    C6S4 c6s4 = new C6S4(context);
                    C1NS<QAStickerModel> c1ns = c6pw4.LJLJJL;
                    if (c1ns != null) {
                        LifecycleOwner lifecycleOwner = c6pw4.LJLJLLL;
                        if (lifecycleOwner != null) {
                            c6s4.LIZ(c1ns, lifecycleOwner);
                            c6pw4.LJLJL = c6s4;
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams4.gravity = 17;
                            FrameLayout frameLayout2 = c6pw4.LJLLI;
                            if (frameLayout2 != null) {
                                C6S4 c6s42 = c6pw4.LJLJL;
                                if (c6s42 != null) {
                                    frameLayout2.addView(c6s42, layoutParams4);
                                    Context context2 = c6pw4.getContext();
                                    o.LJIIIIZZ(context2, "context");
                                    C6S4 c6s43 = new C6S4(context2);
                                    C1NS<QAStickerModel> c1ns2 = c6pw4.LJLJJLL;
                                    if (c1ns2 != null) {
                                        LifecycleOwner lifecycleOwner2 = c6pw4.LJLJLLL;
                                        if (lifecycleOwner2 != null) {
                                            c6s43.LIZ(c1ns2, lifecycleOwner2);
                                            c6pw4.LJLJLJ = c6s43;
                                            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                                            layoutParams5.gravity = 17;
                                            C6S4 c6s44 = c6pw4.LJLJLJ;
                                            if (c6s44 != null) {
                                                c6pw4.addView(c6s44, layoutParams5);
                                                View findViewById4 = c6pw4.findViewById(R.id.mm5);
                                                ViewGroup.LayoutParams layoutParams6 = c6pw4.getLayoutParams();
                                                o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = C278817o.LIZ(13.0f);
                                                o.LJIIIIZZ(findViewById4, "findViewById<TuxTextView…T_DONE_BUTTON_MARGIN.dp }");
                                                c6pw4.LJLLJ = (TuxTextView) findViewById4;
                                                ViewGroup viewGroup = c6pw4.LJLL;
                                                if (viewGroup != null) {
                                                    C16880lQ.LJIIL(viewGroup, new ACListenerS22S0100000_2(c6pw4, 139));
                                                    TuxTextView tuxTextView = c6pw4.LJLLJ;
                                                    if (tuxTextView != null) {
                                                        C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(c6pw4, UserLevelGeckoUpdateSetting.DEFAULT));
                                                    } else {
                                                        o.LJIJI("sureView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("editRootLayout");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("animStickerView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("lifecycleOwner");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("animStateContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("qaStickerView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("qaStickerContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                    } else {
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("qaStickerEditView");
                    throw null;
                }
            } else {
                o.LJIJI("qaStickerEditView");
                throw null;
            }
        } else {
            i = 0;
            c6pw.LJLJJI = QAStickerModel.copy$default(stickerModel, BaseStickerModel.copy$default(stickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0.0f, 0L, null, null, 4194302, null);
            C1NS<QAStickerModel> c1ns3 = c6pw.LJLJJL;
            if (c1ns3 != null) {
                c1ns3.LJ(new AqS168S0100000_2(stickerModel, 580));
                C1NS<QAStickerModel> c1ns4 = c6pw.LJLJJLL;
                if (c1ns4 != null) {
                    c1ns4.LJ(new AqS168S0100000_2(stickerModel, 539));
                } else {
                    o.LJIJI("animStateContainer");
                    throw null;
                }
            } else {
                o.LJIJI("stateContainer");
                throw null;
            }
        }
        C6PW c6pw5 = c159876Pf.LJII;
        if (c6pw5 != null) {
            c6pw5.setStickerEditListener(new C6Q4() { // from class: X.6Po
                @Override // X.C6Q4
                public final void LIZLLL() {
                }

                @Override // X.C6Q4
                public final void LJ() {
                }

                @Override // X.C6Q4
                public final void LJFF() {
                }

                @Override // X.C6Q4
                public final void LIZIZ(StickerModel stickerModel2) {
                    o.LJIIIZ(stickerModel2, "stickerModel");
                }

                @Override // X.C6Q4
                public final void LIZJ(StickerModel stickerModel2) {
                    o.LJIIIZ(stickerModel2, "stickerModel");
                }

                @Override // X.C6Q4
                public final void LIZ(StickerModel stickerModel2, boolean z2) {
                    o.LJIIIZ(stickerModel2, "stickerModel");
                    C6PX c6px = C159876Pf.this.LJI;
                    if (c6px != null) {
                        c6px.LIZ(stickerModel2, false);
                    }
                    if ((stickerModel2 instanceof QAStickerModel) && stickerModel2 != null) {
                        editDone.invoke(stickerModel2);
                    }
                }
            });
            C6PW c6pw6 = c159876Pf.LJII;
            if (c6pw6 != null) {
                c6pw6.setVisibility(i);
                if (c6pw6.LJIIIZ()) {
                    C1NS<QAStickerModel> c1ns5 = c6pw6.LJLJJL;
                    if (c1ns5 != null) {
                        c1ns5.LJ(C159976Pp.LJLIL);
                        C1NS<QAStickerModel> c1ns6 = c6pw6.LJLJJLL;
                        if (c1ns6 != null) {
                            c1ns6.LJ(C159986Pq.LJLIL);
                        } else {
                            o.LJIJI("animStateContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("qastickerview visible ");
                C6S4 c6s45 = c6pw6.LJLJL;
                if (c6s45 != null) {
                    if (c6s45.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ.append(z);
                    X1D.LIZIZ(LIZ);
                    c6pw6.postDelayed(new ARunnableS38S0100000_2(c6pw6, 173), 300L);
                    return;
                }
                o.LJIJI("qaStickerView");
                throw null;
            }
            o.LJIJI("qaStickerEditView");
            throw null;
        }
        o.LJIJI("qaStickerEditView");
        throw null;
    }

    @Override // X.C6H7
    public final void P7(EnumC157656Gr stickerType, C6SE listener) {
        C6OX c6ox;
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(listener, "listener");
        for (C6QO c6qo : this.LJIIJJI) {
            EnumC157656Gr enumC157656Gr = null;
            if ((c6qo instanceof C6OX) && (c6ox = (C6OX) c6qo) != null) {
                enumC157656Gr = c6ox.getStickerType();
            }
            if (enumC157656Gr == stickerType) {
                ((C6OX) c6qo).LJIL(listener);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[SYNTHETIC] */
    @Override // X.C6H7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.tools.sticker.core.StickerModel Q7(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r27, X.EnumC157656Gr r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6PV.Q7(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel, X.6Gr, boolean):com.ss.android.ugc.aweme.tools.sticker.core.StickerModel");
    }

    @Override // X.C6H7
    public final void LJIIIIZZ(EnumC157656Gr type, C6QO c6qo, String createEditEnterMethod, InterfaceC88472Yns<? super StickerModel, C76800UCe> editDone) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
        o.LJIIIZ(editDone, "editDone");
        this.LJ.LJIIJJI();
        this.LJ.LJIILIIL(2);
        new C159836Pb(this).LJ();
        C159876Pf c159876Pf = (C159876Pf) this.LJIIIIZZ.getValue();
        c159876Pf.getClass();
        C159866Pe c159866Pe = c159876Pf.LJ;
        C6PX c6px = c159876Pf.LJI;
        c159866Pe.getClass();
        c159866Pe.LIZ(type).LJ(c6qo, c6px, createEditEnterMethod, editDone);
    }

    public C6PV(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, InterfaceC159886Pg editProvideStickerService, C159816Oz c159816Oz) {
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(editProvideStickerService, "editProvideStickerService");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = stickerHigherContainer;
        this.LIZLLL = c159816Oz;
        this.LJ = editProvideStickerService;
        this.LJFF = lifecycleOwner;
        this.LJI = C221108m2.LIZIZ(C6Q8.LJLIL);
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 935));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 910));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 904));
        this.LJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 906));
        this.LJIIJJI = new ArrayList();
        this.LJIIL = new ArrayList();
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 909));
        this.LJIILL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 902));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 911));
    }
}
