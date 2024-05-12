package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC030109x;
import X.AbstractC193947jK;
import X.AbstractC196927o8;
import X.ActivityC45651qj;
import X.C194237jn;
import X.C194437k7;
import X.C196367nE;
import X.C196887o4;
import X.C197117oR;
import X.C197127oS;
import X.C197137oT;
import X.C197147oU;
import X.C197187oY;
import X.C197197oZ;
import X.C197207oa;
import X.C197217ob;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C51029K0z;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78897Uxp;
import X.C7NN;
import X.C8XO;
import X.C8YN;
import X.C9BE;
import X.EnumC196967oC;
import X.InterfaceC029909v;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.LNH;
import X.SYL;
import X.TBT;
import X.Z89;
import Y.IDCListenerS243S0100000_3;
import Y.IDCListenerS253S0100000_3;
import Y.IDrS43S0100000_3;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.ability.NowListAbility;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPageViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowAreaMonitorAssem extends ReusedUIContentAssem<NowAreaMonitorAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final C5H3 LLD;
    public final InterfaceC115514g7 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final IDrS43S0100000_3 LLI;
    public final IDrS43S0100000_3 LLIFFJFJJ;
    public final IDCListenerS253S0100000_3 LLII;
    public final C62822Ol8 LLIIII;
    public boolean LLIIIILZ;

    static {
        TBT tbt = new TBT(NowAreaMonitorAssem.class, "cellVM", "getCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowAreaMonitorAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(NowAreaMonitorAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPageViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowAreaMonitorAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 583), null, C197187oY.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 584), null, C197197oZ.INSTANCE, null, null);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C197217ob.INSTANCE);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(NowPageViewModel.class);
        this.LLF = C214348b8.LIZ(this, LIZ3, c9be, new AqS153S0100000_3(LIZ3, 585), null, C197207oa.INSTANCE, null, null);
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 581));
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 579));
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 586));
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 580));
        this.LLI = new IDrS43S0100000_3(this, 3);
        this.LLIFFJFJJ = new IDrS43S0100000_3(this, 4);
        this.LLII = new IDCListenerS253S0100000_3(this, 4);
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 582));
    }

    public final NowAreaMonitorViewModel c4() {
        return (NowAreaMonitorViewModel) this.LL.LIZ(this, LLIIIJ[1]);
    }

    public final SYL e4() {
        return (SYL) this.LLFFF.getValue();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        SYL i8;
        SYL i82;
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LJZL.LIZ(this, LLIIIJ[0]));
        NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(this);
        if (LJJ != null && (i82 = LJJ.i8()) != null) {
            i82.LJJLL(this.LLIFFJFJJ);
        }
        NowOtherCollectionAbility LJJ2 = C78897Uxp.LJJ(this);
        if (LJJ2 != null && (i8 = LJJ2.i8()) != null) {
            i8.LJIIJJI(this.LLIFFJFJJ);
        }
    }

    public final AbstractC196927o8 Z3(final EnumC196967oC enumC196967oC) {
        boolean globalVisibleRect;
        Aweme aweme;
        boolean z;
        NowListAbility nowListAbility = (NowListAbility) this.LLFF.getValue();
        boolean z2 = true;
        boolean z3 = false;
        if (nowListAbility == null || !nowListAbility.pt0() || !isActive()) {
            return new AbstractC196927o8(enumC196967oC) { // from class: X.7o9
                public final EnumC196967oC LIZIZ;

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Invisible(reason=");
                    LIZ.append(this.LIZIZ);
                    LIZ.append(')');
                    return X1D.LIZIZ(LIZ);
                }

                @Override // X.AbstractC196927o8
                public final EnumC196967oC LIZ() {
                    return this.LIZIZ;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(enumC196967oC);
                    o.LJIIIZ(enumC196967oC, "reason");
                    this.LIZIZ = enumC196967oC;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C196937o9) && this.LIZIZ == ((C196937o9) obj).LIZIZ) {
                        return true;
                    }
                    return false;
                }
            };
        }
        AbstractC193947jK abstractC193947jK = ((C194437k7) ((AssemViewModel) this.LJZL.LIZ(this, LLIIIJ[0])).getState()).LJLIL;
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL()) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                aweme = LNH.LIZIZ(LIZ);
            } else {
                aweme = null;
            }
            if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL()) {
                if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLLIIIILLL()) {
                    NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(this);
                    if (LJJ != null) {
                        z = LJJ.Ck((InterfaceC194547kI) C51029K0z.LJIILLIIL(this));
                    }
                } else {
                    z = this.LLIIIILZ;
                }
                if (z && Z89.LIZIZ.LIZIZ(aweme)) {
                    return new AbstractC196927o8(enumC196967oC, abstractC193947jK) { // from class: X.7o4
                        public final EnumC196967oC LIZIZ;
                        public final AbstractC193947jK LIZJ;

                        public final int hashCode() {
                            return this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31);
                        }

                        public final String toString() {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Active(reason=");
                            LIZ2.append(this.LIZIZ);
                            LIZ2.append(", cellState=");
                            LIZ2.append(this.LIZJ);
                            LIZ2.append(')');
                            return X1D.LIZIZ(LIZ2);
                        }

                        @Override // X.AbstractC196927o8
                        public final EnumC196967oC LIZ() {
                            return this.LIZIZ;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C196887o4)) {
                                return false;
                            }
                            C196887o4 c196887o4 = (C196887o4) obj;
                            if (this.LIZIZ == c196887o4.LIZIZ && o.LJ(this.LIZJ, c196887o4.LIZJ)) {
                                return true;
                            }
                            return false;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(enumC196967oC);
                            o.LJIIIZ(enumC196967oC, "reason");
                            o.LJIIIZ(abstractC193947jK, "cellState");
                            this.LIZIZ = enumC196967oC;
                            this.LIZJ = abstractC193947jK;
                        }
                    };
                }
            }
            return new AbstractC196927o8(enumC196967oC) { // from class: X.7o9
                public final EnumC196967oC LIZIZ;

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Invisible(reason=");
                    LIZ2.append(this.LIZIZ);
                    LIZ2.append(')');
                    return X1D.LIZIZ(LIZ2);
                }

                @Override // X.AbstractC196927o8
                public final EnumC196967oC LIZ() {
                    return this.LIZIZ;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(enumC196967oC);
                    o.LJIIIZ(enumC196967oC, "reason");
                    this.LIZIZ = enumC196967oC;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C196937o9) && this.LIZIZ == ((C196937o9) obj).LIZIZ) {
                        return true;
                    }
                    return false;
                }
            };
        }
        Rect rect = new Rect();
        C196367nE c196367nE = C196367nE.LIZ;
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-postArea>(...)");
        View view = (View) value;
        c196367nE.getClass();
        if (!view.isAttachedToWindow() || !view.isShown()) {
            globalVisibleRect = false;
        } else {
            globalVisibleRect = view.getGlobalVisibleRect(rect);
        }
        float floatValue = ((Number) this.LLFII.getValue()).floatValue();
        if (rect.top <= floatValue && rect.bottom >= floatValue) {
            if (!((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLLIIIILLL()) {
                return new AbstractC196927o8(enumC196967oC, abstractC193947jK) { // from class: X.7o4
                    public final EnumC196967oC LIZIZ;
                    public final AbstractC193947jK LIZJ;

                    public final int hashCode() {
                        return this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Active(reason=");
                        LIZ2.append(this.LIZIZ);
                        LIZ2.append(", cellState=");
                        LIZ2.append(this.LIZJ);
                        LIZ2.append(')');
                        return X1D.LIZIZ(LIZ2);
                    }

                    @Override // X.AbstractC196927o8
                    public final EnumC196967oC LIZ() {
                        return this.LIZIZ;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C196887o4)) {
                            return false;
                        }
                        C196887o4 c196887o4 = (C196887o4) obj;
                        if (this.LIZIZ == c196887o4.LIZIZ && o.LJ(this.LIZJ, c196887o4.LIZJ)) {
                            return true;
                        }
                        return false;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(enumC196967oC);
                        o.LJIIIZ(enumC196967oC, "reason");
                        o.LJIIIZ(abstractC193947jK, "cellState");
                        this.LIZIZ = enumC196967oC;
                        this.LIZJ = abstractC193947jK;
                    }
                };
            }
            float floatValue2 = ((Number) this.LLFZ.getValue()).floatValue();
            if (rect.left > floatValue2 || rect.right < floatValue2) {
                z2 = false;
            }
            NowOtherCollectionAbility LJJ2 = C78897Uxp.LJJ(this);
            if (LJJ2 != null) {
                z3 = LJJ2.Ck((InterfaceC194547kI) C51029K0z.LJIILLIIL(this));
            }
            if (z2 || z3) {
                return new AbstractC196927o8(enumC196967oC, abstractC193947jK) { // from class: X.7o4
                    public final EnumC196967oC LIZIZ;
                    public final AbstractC193947jK LIZJ;

                    public final int hashCode() {
                        return this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Active(reason=");
                        LIZ2.append(this.LIZIZ);
                        LIZ2.append(", cellState=");
                        LIZ2.append(this.LIZJ);
                        LIZ2.append(')');
                        return X1D.LIZIZ(LIZ2);
                    }

                    @Override // X.AbstractC196927o8
                    public final EnumC196967oC LIZ() {
                        return this.LIZIZ;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C196887o4)) {
                            return false;
                        }
                        C196887o4 c196887o4 = (C196887o4) obj;
                        if (this.LIZIZ == c196887o4.LIZIZ && o.LJ(this.LIZJ, c196887o4.LIZJ)) {
                            return true;
                        }
                        return false;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(enumC196967oC);
                        o.LJIIIZ(enumC196967oC, "reason");
                        o.LJIIIZ(abstractC193947jK, "cellState");
                        this.LIZIZ = enumC196967oC;
                        this.LIZJ = abstractC193947jK;
                    }
                };
            }
        }
        if (globalVisibleRect) {
            return new AbstractC196927o8(enumC196967oC) { // from class: X.7o5
                public final EnumC196967oC LIZIZ;

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Inactive(reason=");
                    LIZ2.append(this.LIZIZ);
                    LIZ2.append(')');
                    return X1D.LIZIZ(LIZ2);
                }

                @Override // X.AbstractC196927o8
                public final EnumC196967oC LIZ() {
                    return this.LIZIZ;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(enumC196967oC);
                    o.LJIIIZ(enumC196967oC, "reason");
                    this.LIZIZ = enumC196967oC;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C196897o5) && this.LIZIZ == ((C196897o5) obj).LIZIZ) {
                        return true;
                    }
                    return false;
                }
            };
        }
        return new AbstractC196927o8(enumC196967oC) { // from class: X.7o9
            public final EnumC196967oC LIZIZ;

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Invisible(reason=");
                LIZ2.append(this.LIZIZ);
                LIZ2.append(')');
                return X1D.LIZIZ(LIZ2);
            }

            @Override // X.AbstractC196927o8
            public final EnumC196967oC LIZ() {
                return this.LIZIZ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(enumC196967oC);
                o.LJIIIZ(enumC196967oC, "reason");
                this.LIZIZ = enumC196967oC;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C196937o9) && this.LIZIZ == ((C196937o9) obj).LIZIZ) {
                    return true;
                }
                return false;
            }
        };
    }

    public final void b4(EnumC196967oC enumC196967oC) {
        C7NN scrollState;
        if (Z3(enumC196967oC) instanceof C196887o4) {
            scrollState = C7NN.VISIBLE_ENOUGH;
        } else {
            scrollState = C7NN.NOT_VISIBLE_ENOUGH;
        }
        NowAreaMonitorViewModel c4 = c4();
        c4.getClass();
        o.LJIIIZ(scrollState, "scrollState");
        c4.setState(new AqS169S0100000_3(scrollState, 32));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    public final void g4(EnumC196967oC reason) {
        NowAreaMonitorViewModel c4 = c4();
        c4.getClass();
        o.LJIIIZ(reason, "reason");
        c4.setState(new AqS169S0100000_3(reason, 30));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        o.LJIIIZ(view, "view");
        view.addOnAttachStateChangeListener(new IDCListenerS243S0100000_3(this, 1));
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (lifecycle = LIZLLL.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem$onViewCreated$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        onResume();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    NowAreaMonitorAssem nowAreaMonitorAssem = NowAreaMonitorAssem.this;
                    EnumC196967oC enumC196967oC = EnumC196967oC.LIFECYCLE_CHANGE;
                    nowAreaMonitorAssem.a4(enumC196967oC, false);
                    NowAreaMonitorAssem.this.g4(enumC196967oC);
                }
            });
        }
        InterfaceC115514g7 interfaceC115514g7 = this.LJZL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIIJ;
        ((NowPostCellViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[0])).hv0(this, C213688a4.LIZLLL());
        C8YN.LJII(this, c4(), new TBT() { // from class: X.7od
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C196287n6) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C197117oR.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLF.LIZ(this, interfaceC74236TBoArr[2]), new TBT() { // from class: X.7oe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C195897mT) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C197127oS.LJLIL, 4);
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL()) {
            C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.7oW
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C197147oU.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.7oX
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C197137oT.LJLIL, 6);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        EnumC196967oC enumC196967oC = EnumC196967oC.CELL_STATE_CHANGE;
        a4(enumC196967oC, false);
        b4(enumC196967oC);
        g4(enumC196967oC);
    }

    public final void a4(EnumC196967oC enumC196967oC, boolean z) {
        AbstractC030109x itemAnimator;
        AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(this, enumC196967oC, 39);
        if (z) {
            aqS150S0200000_3.invoke();
            return;
        }
        final AqS150S0200000_3 aqS150S0200000_32 = new AqS150S0200000_3(this, aqS150S0200000_3, 40);
        SYL e4 = e4();
        if (e4 != null && (itemAnimator = e4.getItemAnimator()) != null) {
            itemAnimator.LJIILL(new InterfaceC029909v() { // from class: X.7oc
                @Override // X.InterfaceC029909v
                public final void LIZ() {
                    aqS150S0200000_32.invoke();
                }
            });
        } else {
            ((Boolean) aqS150S0200000_32.invoke()).booleanValue();
        }
    }
}
