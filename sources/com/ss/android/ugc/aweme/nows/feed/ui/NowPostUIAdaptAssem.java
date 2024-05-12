package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.AnonymousClass391;
import X.C193867jC;
import X.C194237jn;
import X.C194437k7;
import X.C194497kD;
import X.C194507kE;
import X.C194517kF;
import X.C195937mX;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C25620zW;
import X.C26338AVi;
import X.C51029K0z;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77275UUl;
import X.C78897Uxp;
import X.C7ML;
import X.C7MY;
import X.C7XD;
import X.C8XO;
import X.C8YN;
import X.C9XU;
import X.G27;
import X.InterfaceC115514g7;
import X.InterfaceC193877jD;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostUIAdaptAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostUIAdaptAssem extends ReusedUIContentAssem<NowPostUIAdaptAssem> implements C8XO<InterfaceC194547kI>, InterfaceC193877jD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LJZL;
    public ConstraintLayout LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public String LLFF;
    public final C194517kF LLFFF;

    static {
        TBT tbt = new TBT(NowPostUIAdaptAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public final void Z3() {
        Context context;
        float f;
        if (!C77275UUl.LJIIIIZZ(2, 5, 6, 3).contains(Integer.valueOf(((C7ML) C51029K0z.LJIILLIIL(this)).z())) || (context = getContext()) == null) {
            return;
        }
        int dimension = (int) context.getResources().getDimension(R.dimen.w4);
        int LIZIZ = C7MY.LIZIZ(56);
        if (C195937mX.LIZ((InterfaceC194547kI) C51029K0z.LJIILLIIL(this))) {
            f = context.getResources().getDimension(R.dimen.a5s) + context.getResources().getDimension(R.dimen.a5r);
        } else {
            f = 0.0f;
        }
        float LJJJJJL = ((((C63081OpJ.LJJJJJL(context) - dimension) - C63081OpJ.LJJJJLI(context)) - LIZIZ) - f) - C7MY.LIZIZ(55);
        int LJJJJL = C63081OpJ.LJJJJL(context);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.a5t);
        if (LJJJJL > dimension2) {
            LJJJJL = dimension2;
        }
        int i = (LJJJJL * 4) / 3;
        if (LJJJJJL >= i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("adaptedSmallScreen return, freeHeight = ");
            LIZ.append(LJJJJJL);
            LIZ.append(", expectHeight = ");
            LIZ.append(i);
            C7XD.LJ("NowPostUIAdaptAssem", X1D.LIZIZ(LIZ));
            return;
        }
        int LIZIZ2 = C7MY.LIZIZ(270);
        int i2 = (int) ((3 * LJJJJJL) / 4);
        if (i2 >= LIZIZ2) {
            LIZIZ2 = i2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("adaptedSmallScreen, freeHeight = ");
        LIZ2.append(LJJJJJL);
        LIZ2.append(", expectHeight = ");
        LIZ2.append(i);
        LIZ2.append(", adjustWidth = ");
        LIZ2.append(LIZIZ2);
        C7XD.LJ("NowPostUIAdaptAssem", X1D.LIZIZ(LIZ2));
        ConstraintLayout constraintLayout = this.LL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = LIZIZ2;
                constraintLayout.setLayoutParams(layoutParams);
                NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(this);
                if (LJJ != null) {
                    LJJ.Tz(Integer.valueOf(LIZIZ2));
                }
                NowPostCellViewModel a4 = a4();
                a4.getClass();
                a4.setState(new AqS28S0001000_3(LIZIZ2, 4));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        o.LJIJI("mainPostContainer");
        throw null;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.7kF] */
    public NowPostUIAdaptAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 626), null, C194507kE.INSTANCE, null, null);
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 624));
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 625));
        this.LLFF = "H,3:4";
        this.LLFFF = new G27() { // from class: X.7kF
            @Override // X.G27
            public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
                o.LJIIIZ(newConfig, "newConfig");
                NowPostUIAdaptAssem.this.Z3();
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C9XU.LIZLLL(this.LLFFF);
    }

    public final NowPostCellViewModel a4() {
        return (NowPostCellViewModel) this.LJZL.LIZ(this, LLFII[0]);
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, a4());
    }

    @Override // X.InterfaceC193877jD
    public final void LLLLLLLZIL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    @Override // X.InterfaceC193877jD
    public final void LLLZIL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        C8YN.LJIJI(a4(), new AqS169S0100000_3(this, 319));
    }

    @Override // X.InterfaceC193877jD
    public final void LLZL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    public final void b4(String str) {
        ConstraintLayout constraintLayout;
        View view;
        String str2;
        if (o.LJ(str, this.LLFF)) {
            return;
        }
        ConstraintLayout constraintLayout2 = this.LL;
        if (constraintLayout2 != null) {
            ViewParent parent = constraintLayout2.getParent();
            if (!(parent instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) parent) == null) {
                return;
            }
            ConstraintLayout constraintLayout3 = this.LL;
            if (constraintLayout3 != null) {
                Context context = constraintLayout3.getContext();
                if (context == null || (view = (View) this.LLF.getValue()) == null) {
                    return;
                }
                this.LLFF = str;
                int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
                if (o.LJ(str, "h_ratio_half")) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("H,");
                    LIZ.append(C63081OpJ.LJJJJL(context));
                    LIZ.append(':');
                    LIZ.append(height / 2);
                    str2 = X1D.LIZIZ(LIZ);
                } else if (o.LJ(str, "h_ratio_full")) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("H,");
                    LIZ2.append(C63081OpJ.LJJJJL(context));
                    LIZ2.append(':');
                    LIZ2.append(height);
                    str2 = X1D.LIZIZ(LIZ2);
                } else {
                    str2 = "H,3:4";
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("cell change height dimension to ", str2, ", cellState: ");
                LIZIZ.append(a4().getState().LJLIL);
                C7XD.LJ("NowPostUIAdaptAssem", X1D.LIZIZ(LIZIZ));
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                ConstraintLayout constraintLayout4 = this.LL;
                if (constraintLayout4 != null) {
                    anonymousClass064.LJIJI(constraintLayout4.getId(), str2);
                    anonymousClass064.LIZIZ(constraintLayout);
                    constraintLayout.invalidate();
                    return;
                }
                o.LJIJI("mainPostContainer");
                throw null;
            }
            o.LJIJI("mainPostContainer");
            throw null;
        }
        o.LJIJI("mainPostContainer");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LL = (ConstraintLayout) C7MY.LIZLLL(view, "view", R.id.gch, "view.findViewById(R.id.main_post)");
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL()) {
            C26338AVi.LJI(getContainerView(), null, AnonymousClass391.LIZJ(8), null, Integer.valueOf(C7MY.LIZIZ(8)), false, 21);
        }
        Z3();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this.LLFFF);
        }
        a4().hv0(this, C213688a4.LIZLLL());
        C8YN.LJII(this, a4(), new TBT() { // from class: X.7kG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194437k7) obj).LJLJJLL;
            }
        }, null, C194497kD.LJLIL, 6);
    }

    @Override // X.InterfaceC193877jD
    public final void t1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    @Override // X.InterfaceC193877jD
    public final void x1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    @Override // X.InterfaceC193877jD
    public final void y1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK abstractC193947jK, C194437k7 c194437k7) {
        C193867jC.LIZ(this, abstractC193947jK, c194437k7);
    }
}
