package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AYY;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C27484AqW;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57743MlP;
import X.C57819Mmd;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C65352Pkq;
import X.C78939UyV;
import X.C79234V7u;
import X.EnumC57383Mfb;
import X.EnumC62195Ob1;
import X.InterfaceC57744MlQ;
import X.InterfaceC57784Mm4;
import X.InterfaceC57932MoS;
import X.InterfaceC65784Pro;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.IDCListenerS111S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS71S0201000_9;
import kotlin.jvm.internal.o;
import q03.IDaS202S0200000_9;

/* loaded from: classes10.dex */
public abstract class AbsRecUserCell<ITEM extends C57826Mmk> extends BasePowerCell<ITEM> {
    public boolean LJLIL;

    public abstract int V();

    public abstract void g0(RecUser recUser, C57846Mn4 c57846Mn4);

    public abstract void h0(RecUser recUser, C57846Mn4 c57846Mn4);

    public abstract void l0(RecUser recUser, C57846Mn4 c57846Mn4);

    public abstract void n0(RecUser recUser, C57846Mn4 c57846Mn4);

    public abstract void o0(RecUser recUser, C57846Mn4 c57846Mn4);

    public abstract void p0(RecUser recUser, C57846Mn4 c57846Mn4);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return V();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    public final void T(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C57826Mmk item = (C57826Mmk) interfaceC57784Mm4;
        o.LJIIIZ(item, "item");
        super.T(item);
        item.LJLJJI = false;
        this.LJLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(ITEM t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        RecUser user = t.LJLJI;
        C57846Mn4 uiConfig = t.LJLILLLLZI;
        p0(user, uiConfig);
        g0(user, uiConfig);
        l0(user, uiConfig);
        h0(user, uiConfig);
        n0(user, uiConfig);
        o0(user, uiConfig);
        i0(uiConfig, t);
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        if (!uiConfig.LJJIII) {
            this.itemView.setOnLongClickListener(new IDCListenerS111S0200000_9(user, this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(X.EnumC57435MgR r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell.a0(X.MgR):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:1|(2:2|3)|(1:5)(2:134|(2:142|(2:147|(1:149)(36:150|(1:152)(1:156)|153|(1:155)|7|(4:9|(1:11)|12|(1:14))|15|(1:17)(1:133)|18|(1:20)(1:132)|21|22|23|(1:25)(2:96|(2:104|(2:109|(1:111)(25:112|(1:114)(1:127)|115|(5:117|118|119|121|122)|27|28|29|30|31|(1:33)(2:59|(2:67|(2:72|(1:74)(17:75|(1:77)(1:88)|78|(4:80|81|82|83)(1:87)|36|(1:38)|39|(1:41)|42|(1:44)|45|(1:58)|47|(1:49)(1:57)|(1:53)|54|55)))(1:89))|34|35|36|(0)|39|(0)|42|(0)|45|(0)|47|(0)(0)|(2:51|53)|54|55)))(1:128))|26|27|28|29|30|31|(0)(0)|34|35|36|(0)|39|(0)|42|(0)|45|(0)|47|(0)(0)|(0)|54|55)))(1:157))|6|7|(0)|15|(0)(0)|18|(0)(0)|21|22|23|(0)(0)|26|27|28|29|30|31|(0)(0)|34|35|36|(0)|39|(0)|42|(0)|45|(0)|47|(0)(0)|(0)|54|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0252, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x030d, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0310, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x030f, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0273 A[Catch: all -> 0x030d, TryCatch #4 {all -> 0x030d, blocks: (B:31:0x0265, B:59:0x0273, B:61:0x027b, B:63:0x0287, B:65:0x028d, B:67:0x029d, B:69:0x02a3, B:72:0x02aa, B:74:0x02b2, B:75:0x02bc, B:77:0x02c2, B:78:0x02c6, B:80:0x02d7, B:89:0x0293, B:90:0x027f), top: B:30:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8 A[Catch: all -> 0x0252, TryCatch #1 {all -> 0x0252, blocks: (B:23:0x01a5, B:96:0x01b8, B:98:0x01c0, B:100:0x01cc, B:102:0x01d2, B:104:0x01e2, B:106:0x01e8, B:109:0x01ef, B:111:0x01f7, B:112:0x0201, B:114:0x0207, B:115:0x020b, B:117:0x021c, B:128:0x01d8, B:129:0x01c4), top: B:22:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(ITEM r41) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell.c0(X.Mmk):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onResume(boolean z) {
        super.onResume(z);
        if (z) {
            this.LJLIL = false;
        }
    }

    public static void f0(SmartAvatarImageView smartAvatarImageView, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = smartAvatarImageView.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.width == i && (layoutParams = smartAvatarImageView.getLayoutParams()) != null && layoutParams.height == i) {
            return;
        }
        C27484AqW.LJI(smartAvatarImageView, Integer.valueOf(i), Integer.valueOf(i));
        S3I s3i = new S3I();
        s3i.LIZIZ = C32151Nz.LJIIZILJ(1);
        Context context = smartAvatarImageView.getContext();
        o.LJIIIIZZ(context, "context");
        s3i.LIZJ = AnonymousClass636.LJIIIIZZ(R.attr.cf, context);
        s3i.LIZLLL = i;
        smartAvatarImageView.setCircleOptions(new S3L(s3i));
    }

    public final void U(SmartAvatarImageView smartAvatarImageView, InterfaceC65784Pro<? extends UrlModel> interfaceC65784Pro) {
        String str;
        InterfaceC65784Pro<C57819Mmd> interfaceC65784Pro2;
        C57819Mmd invoke;
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str2;
        Object obj = null;
        try {
            if (!o.LJ(this.itemView.getTag(R.id.n1_), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (LJIIIZ = (Fragment) lifecycleOwner) != null) || (LJIIIZ = C79234V7u.LJIIIZ(this.itemView)) != null) && (LJIIIZ.isDetached() || !LJIIIZ.isAdded())) {
                    AYY.LIZ.getClass();
                    AYY.LIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            AYY.LIZ.getClass();
                            AYY.LIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC57932MoS L = L();
                            if (L != null) {
                                str2 = L.LJJIFFI();
                            } else {
                                str2 = null;
                            }
                            View itemView = this.itemView;
                            o.LJIIIIZZ(itemView, "itemView");
                            Object LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), RecUserCellTrackAbility.class, str2);
                            if (LIZ == null) {
                                AYY ayy = AYY.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(str2);
                                LIZ2.append("'s ");
                                LIZ2.append(C65352Pkq.LIZ(RecUserCellTrackAbility.class).LJFF());
                                LIZ2.append(" not found, parent: ");
                                LIZ2.append(this.itemView.getParent());
                                String LIZIZ = X1D.LIZIZ(LIZ2);
                                ayy.getClass();
                                AYY.LIZ("Ability", LIZIZ, null);
                            }
                            obj = LIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("Ability", "get ability error!", th);
        }
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) obj;
        if (recUserCellTrackAbility == null || (interfaceC65784Pro2 = recUserCellTrackAbility.LJLIL) == null || (invoke = interfaceC65784Pro2.invoke()) == null || (str = invoke.LIZ) == null) {
            str = "";
        }
        UrlModel invoke2 = interfaceC65784Pro.invoke();
        if (invoke2 == null) {
            smartAvatarImageView.setImageResource(R.drawable.alz);
            return;
        }
        C57743MlP c57743MlP = InterfaceC57744MlQ.LJJII;
        W5F LJII = W5U.LJII(C78939UyV.LJ(invoke2));
        LJII.LJJIIJ = smartAvatarImageView;
        LJII.LJIILL = R.drawable.alz;
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        EnumC57383Mfb enumC57383Mfb = EnumC57383Mfb.AVATAR;
        int M = M();
        c57743MlP.getClass();
        C57743MlP.LIZIZ(LJII, str, enumC57383Mfb, "rec_user", M);
    }

    public void i0(C57846Mn4 uiConfig, ITEM item) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(item, "item");
        if (!uiConfig.LJIJI) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C16880lQ.LJIIJ(new IDaS202S0200000_9(this, item, 0), itemView);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void P(int i, ITEM item, boolean z) {
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        Object obj = null;
        try {
            if (!o.LJ(this.itemView.getTag(R.id.n1_), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (LJIIIZ = (Fragment) lifecycleOwner) != null) || (LJIIIZ = C79234V7u.LJIIIZ(this.itemView)) != null) && (LJIIIZ.isDetached() || !LJIIIZ.isAdded())) {
                    AYY.LIZ.getClass();
                    AYY.LIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            AYY.LIZ.getClass();
                            AYY.LIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC57932MoS L = L();
                            if (L != null) {
                                str = L.LJJIFFI();
                            } else {
                                str = null;
                            }
                            View itemView = this.itemView;
                            o.LJIIIIZZ(itemView, "itemView");
                            Object LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), RecUserCellTrackAbility.class, str);
                            if (LIZ == null) {
                                AYY ayy = AYY.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(str);
                                LIZ2.append("'s ");
                                LIZ2.append(C65352Pkq.LIZ(RecUserCellTrackAbility.class).LJFF());
                                LIZ2.append(" not found, parent: ");
                                LIZ2.append(this.itemView.getParent());
                                String LIZIZ = X1D.LIZIZ(LIZ2);
                                ayy.getClass();
                                AYY.LIZ("Ability", LIZIZ, null);
                            }
                            obj = LIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("Ability", "get ability error!", th);
        }
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) obj;
        if (recUserCellTrackAbility != null) {
            boolean z2 = recUserCellTrackAbility.LJLIL.invoke().LJI;
            if (z) {
                if (z2) {
                    C27484AqW.LIZJ(new AqS71S0201000_9(recUserCellTrackAbility, item, i, 3));
                }
            } else {
                if (z2) {
                    return;
                }
                C27484AqW.LIZJ(new AqS71S0201000_9(recUserCellTrackAbility, item, i, 4));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(1:3)|4|5|6|(1:8)(2:55|(2:63|(2:68|(1:70)(13:71|(1:73)(1:77)|74|(1:76)|10|(1:54)(1:14)|15|16|(1:18)(2:25|(2:33|(2:38|(1:40)(5:41|(1:43)(1:48)|44|(1:46)|47)))(1:49))|19|(1:21)|22|23)))(1:78))|9|10|(1:12)|54|15|16|(0)(0)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01cd, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ce, code lost:
    
        X.AYY.LIZ.getClass();
        X.AYY.LIZ("Ability", "get ability error!", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0139 A[Catch: all -> 0x01cd, TryCatch #1 {all -> 0x01cd, blocks: (B:16:0x0126, B:25:0x0139, B:27:0x0141, B:29:0x014d, B:31:0x0153, B:33:0x0162, B:35:0x0168, B:38:0x016f, B:40:0x0177, B:41:0x0180, B:43:0x0186, B:44:0x018a, B:46:0x019b, B:49:0x0159, B:50:0x0145), top: B:15:0x0126 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r18, com.ss.android.ugc.aweme.relation.model.RecUser r19, X.C57846Mn4 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell.m0(com.ss.android.ugc.aweme.relation.follow.ui.RelationButton, com.ss.android.ugc.aweme.relation.model.RecUser, X.Mn4, boolean):void");
    }
}
