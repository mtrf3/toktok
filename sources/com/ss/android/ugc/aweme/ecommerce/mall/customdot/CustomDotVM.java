package com.ss.android.ugc.aweme.ecommerce.mall.customdot;

import X.B6K;
import X.C00F;
import X.C03660Ck;
import X.C36262ELa;
import X.C36264ELc;
import X.C36268ELg;
import X.C55931LxH;
import X.C55940LxQ;
import X.C55945LxV;
import X.C55948LxY;
import X.C56092Lzs;
import X.C73340SqO;
import X.C76800UCe;
import X.C78565UsT;
import X.EC5;
import X.EC6;
import X.EC7;
import X.EnumC55811LvL;
import X.EnumC55932LxI;
import X.EnumC56108M0i;
import X.EnumC56125M0z;
import X.InterfaceC56129M1d;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.L86;
import X.M05;
import X.M06;
import X.M08;
import X.M0N;
import X.MBB;
import X.X1D;
import X.XJL;
import X.XKQ;
import X.XKS;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.BasicInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.IconCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.Notice;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CustomDotVM extends AssemViewModel<C55940LxQ> {
    public static final /* synthetic */ int LLI = 0;
    public Notice LJLIL;
    public DiversionTargetData LJLILLLLZI;
    public InterfaceC56129M1d LJLJI;
    public C55931LxH LJLJJI;
    public C36268ELg LJLJJL;
    public CustomDotResponse LJLJJLL;
    public DiversionData LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final String LJLL;
    public boolean LJLLI;
    public C55948LxY LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public XJL<? super C76800UCe> LJZI;
    public XJL<? super C76800UCe> LJZL;
    public XJL<? super C76800UCe> LL;
    public XJL<? super EnumC55811LvL> LLD;
    public XKS LLF;
    public final long LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C55940LxQ defaultState() {
        return new C55940LxQ(0);
    }

    public final boolean hv0() {
        if (this.LJLJLLL == L86.TOP_TAB.getValue()) {
            if (this.LJLJJL != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("canTooltipShowBottomTab isCurrBottomTabHome:");
                String selectedTab = this.LJLLL;
                o.LJIIIZ(selectedTab, "selectedTab");
                LIZ.append(o.LJ(selectedTab, "HOME"));
                LIZ.append(" !isFypProfileShowing:");
                LIZ.append(!this.LJLZ);
                LIZ.append(" !inboxPopupShowing:");
                LIZ.append(!this.LJLLJ);
                LIZ.append(" !isEcVideoGuideShowing:");
                LIZ.append(!this.LJZ);
                LIZ.append(" isMainActivityVis:");
                LIZ.append(this.LJLLLL);
                C36264ELc.LIZ(X1D.LIZIZ(LIZ));
            }
            String selectedTab2 = this.LJLLL;
            o.LJIIIZ(selectedTab2, "selectedTab");
            if (o.LJ(selectedTab2, "HOME") && !this.LJLZ && !this.LJLLJ && this.LJLLLL && !this.LJZ) {
                return true;
            }
        } else {
            if (this.LJLJJL != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("canTooltipShowBottomTab !isCommentDialogShowing:");
                LIZ2.append(!this.LJLLLLLL);
                LIZ2.append(" !isFypProfileShowing:");
                LIZ2.append(!this.LJLZ);
                LIZ2.append(" !inboxPopupShowing:");
                LIZ2.append(!this.LJLLJ);
                LIZ2.append(" !isEcVideoGuideShowing:");
                LIZ2.append(!this.LJZ);
                LIZ2.append(" isMainActivityVis:");
                LIZ2.append(this.LJLLLL);
                C36264ELc.LIZ(X1D.LIZIZ(LIZ2));
            }
            if (!this.LJLLLLLL && !this.LJLZ && !this.LJLLJ && this.LJLLLL && !this.LJZ) {
                return true;
            }
        }
        return false;
    }

    public final void tv0() {
        setState(C55945LxV.LJLIL);
    }

    public CustomDotVM() {
        new LinkedHashMap();
        this.LJLJLJ = true;
        this.LJLJLLL = -1;
        this.LJLL = B6K.MALL_VERSION_V3.getValue();
        this.LJLLL = "HOME";
        this.LJLLLL = true;
        this.LLFF = 3000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Dv0(X.M0K r7) {
        /*
            r6 = this;
            X.XKS r4 = new X.XKS
            X.2kd r1 = X.C78555UsJ.LJJII(r7)
            r0 = 1
            r4.<init>(r0, r1)
            r4.LJIIL()
            java.lang.String r0 = "=========wait tooltip task run"
            X.C36264ELc.LIZ(r0)
            r6.LLF = r4
            X.LxY r5 = r6.LJLLILLLL
            if (r5 == 0) goto L56
            java.lang.String r0 = "=========trigger show task"
            X.C36264ELc.LIZ(r0)
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem r0 = r5.LIZ
            X.1qj r3 = X.C55096Ljo.LJIIIIZZ(r0)
            if (r3 == 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem r2 = r5.LIZ
            X.M0Q r1 = new X.M0Q
            X.M10 r0 = new X.M10
            r0.<init>(r2)
            r1.<init>(r3, r0)
            com.bytedance.poplayer.core.PopupManager.LJIIL(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L52
        L38:
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem r0 = r5.LIZ
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM r1 = r0.v3()
            r1.getClass()
            java.lang.String r0 = "=========tooltip task run"
            X.C36264ELc.LIZ(r0)
            X.XKS r1 = r1.LLF
            if (r1 == 0) goto L52
            X.UCe r0 = X.C76800UCe.LIZ
            X.C3C5.m7constructorimpl(r0)
            r1.resumeWith(r0)
        L52:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L63
        L56:
            java.lang.String r0 = "=========not run tooltip task cause callback is null"
            X.C36264ELc.LIZ(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            X.C3C5.m7constructorimpl(r0)
            r4.resumeWith(r0)
        L63:
            java.lang.Object r1 = r4.LJIIJJI()
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto L6c
            return r1
        L6c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.Dv0(X.M0K):java.lang.Object");
    }

    public final List<BasicInfo> gv0(List<BasicInfo> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BasicInfo basicInfo = (BasicInfo) next;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(basicInfo.getGroup());
            LIZ.append('-');
            LIZ.append(basicInfo.getId());
            if (hashSet.add(X1D.LIZIZ(LIZ))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void rv0(boolean z) {
        IEcUgVSAService LJIIJJI = EcUgVSAService.LJIIJJI();
        if (LJIIJJI != null && LJIIJJI.LJFF()) {
            return;
        }
        vv0(z, false, false, new EC5(z, this, null));
    }

    public final void uv0(Integer num) {
        setState(new AqS175S0100000_9(num, 55));
    }

    public static boolean lv0(ReachCfg reachCfg, ReachCfg reachCfg2) {
        String str;
        String str2 = null;
        if (reachCfg != null) {
            str = reachCfg.getNoticeId();
        } else {
            str = null;
        }
        if (reachCfg2 != null) {
            str2 = reachCfg2.getNoticeId();
        }
        return !o.LJ(str, str2);
    }

    public static boolean ov0(CountCfg countCfg, CountCfg countCfg2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4 = null;
        if (countCfg != null) {
            num = countCfg.getShowType();
        } else {
            num = null;
        }
        if (countCfg2 != null) {
            num2 = countCfg2.getShowType();
        } else {
            num2 = null;
        }
        if (num == num2) {
            if (countCfg != null) {
                num3 = countCfg.getCount();
            } else {
                num3 = null;
            }
            if (countCfg2 != null) {
                num4 = countCfg2.getCount();
            }
            if (o.LJ(num3, num4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean pv0(IconCfg iconCfg, IconCfg iconCfg2) {
        String str;
        String str2;
        Long l;
        String iconUrl;
        String iconUrl2;
        Long l2 = null;
        if (iconCfg != null && (iconUrl2 = iconCfg.getIconUrl()) != null) {
            str = UriProtector.parse(iconUrl2).getPath();
        } else {
            str = null;
        }
        if (iconCfg2 != null && (iconUrl = iconCfg2.getIconUrl()) != null) {
            str2 = UriProtector.parse(iconUrl).getPath();
        } else {
            str2 = null;
        }
        if (ujb.o.LJJJJIZL(str, str2, false)) {
            if (iconCfg != null) {
                l = iconCfg.getDuration();
            } else {
                l = null;
            }
            if (iconCfg2 != null) {
                l2 = iconCfg2.getDuration();
            }
            if (o.LJ(l, l2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Av0(android.graphics.Bitmap r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.M0S
            if (r0 == 0) goto L50
            r5 = r8
            X.M0S r5 = (X.M0S) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L56
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            r0.LJZL = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 562(0x232, float:7.88E-43)
            r1.<init>(r7, r0)
            r6.setState(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 57
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r2
            X.2kY r2 = new X.2kY
            r2.<init>(r1, r3)
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L4e
            return r4
        L4e:
            r0 = r6
            goto L23
        L50:
            X.M0S r5 = new X.M0S
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.Av0(android.graphics.Bitmap, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Bv0(X.C36268ELg r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.M0T
            if (r0 == 0) goto L5a
            r5 = r8
            X.M0T r5 = (X.M0T) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L60
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            r0.LJZI = r3
            java.lang.String r0 = "=======inboxPopup dismissed==="
            X.C36264ELc.LIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2d:
            X.C141335gf.LIZJ(r1)
            boolean r0 = r6.LJLLJ
            if (r0 != 0) goto L37
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L37:
            java.lang.String r0 = "=======wait inboxPopup dismiss==="
            X.C36264ELc.LIZ(r0)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 58
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.getClass()
            r5.LJLJJI = r2
            X.2kY r2 = new X.2kY
            r2.<init>(r1, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L58
            return r4
        L58:
            r0 = r6
            goto L23
        L5a:
            X.M0T r5 = new X.M0T
            r5.<init>(r6, r8)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.Bv0(X.ELg, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Cv0(X.C68722mq r9, X.InterfaceC67352kd<? super X.EnumC55811LvL> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.M0U
            if (r0 == 0) goto L6e
            r6 = r10
            X.M0U r6 = (X.M0U) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r3 = r6.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L43
            if (r0 != r5) goto L74
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM r2 = r6.LJLIL
            X.C141335gf.LIZJ(r3)
        L23:
            X.LvL r3 = (X.EnumC55811LvL) r3
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "suspend finish for tooltip disapprearType: "
            r1.append(r0)
            if (r3 == 0) goto L41
            java.lang.String r0 = r3.getValue()
        L34:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36264ELc.LIZ(r0)
            r2.LLD = r4
            return r3
        L41:
            r0 = r4
            goto L34
        L43:
            X.C141335gf.LIZJ(r3)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 563(0x233, float:7.89E-43)
            r1.<init>(r9, r0)
            r8.setState(r1)
            long r2 = r9.LJ
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 + r0
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 59
            r1.<init>(r8, r0)
            r6.LJLIL = r8
            r6.LJLJJI = r5
            X.2kY r0 = new X.2kY
            r0.<init>(r1, r4)
            java.lang.Object r3 = X.C74209TAn.LIZJ(r2, r0, r6)
            if (r3 != r7) goto L6c
            return r7
        L6c:
            r2 = r8
            goto L23
        L6e:
            X.M0U r6 = new X.M0U
            r6.<init>(r8, r10)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.Cv0(X.2mq, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(X.C36268ELg r6, X.InterfaceC67352kd r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.M0W
            if (r0 == 0) goto L5f
            r4 = r7
            X.M0W r4 = (X.M0W) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L65
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            if (r6 == 0) goto L20
            X.M0N r1 = r6.LIZIZ
            X.M0N r0 = X.M0N.ICON_UPDATE_START
            if (r1 == r0) goto L3a
            X.M0N r0 = X.M0N.ICON_SHOW_ANIMATION_START
            if (r1 == r0) goto L3a
            X.M0N r0 = X.M0N.ICON_STAY_START
            if (r1 == r0) goto L3a
            X.M0N r0 = X.M0N.ICON_HIDE_ANIMATION_START
            if (r1 != r0) goto L20
        L3a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cancel last icon show process："
            r1.append(r0)
            X.M0N r0 = r6.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36264ELc.LIZ(r0)
            X.XKQ r0 = r6.LIZLLL
            if (r0 == 0) goto L20
            r4.getClass()
            r4.LJLJI = r2
            java.lang.Object r0 = X.C79146V4k.LJIJI(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L5f:
            X.M0W r4 = new X.M0W
            r4.<init>(r5, r7)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.iv0(X.ELg, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(X.C36268ELg r6, X.InterfaceC67352kd r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.M0X
            if (r0 == 0) goto L5b
            r4 = r7
            X.M0X r4 = (X.M0X) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L61
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            if (r6 == 0) goto L20
            X.M0N r1 = r6.LIZIZ
            X.M0N r0 = X.M0N.TOOLTIP_UPDATE_START
            if (r1 == r0) goto L36
            X.M0N r0 = X.M0N.TOOLTIP_SHOW_START
            if (r1 == r0) goto L36
            X.M0N r0 = X.M0N.TOOLTIP_SHOW_PENDING
            if (r1 != r0) goto L20
        L36:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cancel last tooltip show process："
            r1.append(r0)
            X.M0N r0 = r6.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36264ELc.LIZ(r0)
            X.XKQ r0 = r6.LIZLLL
            if (r0 == 0) goto L20
            r4.getClass()
            r4.LJLJI = r2
            java.lang.Object r0 = X.C79146V4k.LJIJI(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L5b:
            X.M0X r4 = new X.M0X
            r4.<init>(r5, r7)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.jv0(X.ELg, X.2kd):java.lang.Object");
    }

    public final List<BasicInfo> mv0(List<BasicInfo> list, List<BasicInfo> list2) {
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (BasicInfo basicInfo : list) {
                BasicInfo basicInfo2 = basicInfo;
                if (list2 != null) {
                    Iterator<BasicInfo> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BasicInfo next = it.next();
                        BasicInfo basicInfo3 = next;
                        if (o.LJ(basicInfo3.getId(), basicInfo2.getId()) && basicInfo3.getGroup() == basicInfo2.getGroup()) {
                            if (next == null) {
                            }
                        }
                    }
                }
                arrayList.add(basicInfo);
            }
        }
        return arrayList;
    }

    public final void yv0(ReachCfg reachCfg, boolean z) {
        C78565UsT.LJJIJIIJI(this, MBB.INSTANCE, new EC7(reachCfg, z, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zv0(android.graphics.Bitmap r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.M0R
            if (r0 == 0) goto L50
            r5 = r8
            X.M0R r5 = (X.M0R) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L56
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            r0.LL = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 560(0x230, float:7.85E-43)
            r1.<init>(r7, r0)
            r6.setState(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 56
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r2
            X.2kY r2 = new X.2kY
            r2.<init>(r1, r3)
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L4e
            return r4
        L4e:
            r0 = r6
            goto L23
        L50:
            X.M0R r5 = new X.M0R
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.zv0(android.graphics.Bitmap, X.2kd):java.lang.Object");
    }

    public static boolean qv0(ReachCfg reachCfg, ReachCfg reachCfg2, DiversionData diversionData, C36268ELg c36268ELg) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        if (c36268ELg != null && c36268ELg.LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (reachCfg != null) {
            str = reachCfg.getNoticeId();
        } else {
            str = null;
        }
        if (reachCfg2 != null) {
            str2 = reachCfg2.getNoticeId();
        }
        boolean LJ = o.LJ(str, str2);
        if (reachCfg == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (diversionData == null || diversionData.getShowCount() == null || diversionData.getShowCount().intValue() < 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder LIZLLL = C00F.LIZLLL("isTooltipShowFailed: ", z, " isReachCfgSame: ", LJ, " isNewReachCfgNull: ");
        LIZLLL.append(z2);
        LIZLLL.append(" isTooltipNotShowed: ");
        LIZLLL.append(z3);
        C36264ELc.LIZ(X1D.LIZIZ(LIZLLL));
        if (z) {
            return true;
        }
        if (LJ) {
            return false;
        }
        if (z2) {
            return true;
        }
        return z3;
    }

    public final void sv0(CustomDotResponse customDotResponse, DiversionData diversionData, boolean z, boolean z2) {
        CountCfg countCfg;
        EnumC56125M0z enumC56125M0z;
        EnumC55932LxI enumC55932LxI;
        DiversionEntranceResCfg config;
        if (customDotResponse != null) {
            DiversionEntranceRes LJJ = C73340SqO.LJJ(diversionData);
            Integer num = null;
            if (LJJ != null && (config = LJJ.getConfig()) != null) {
                countCfg = config.getRedDot();
            } else {
                countCfg = null;
            }
            Map LIZIZ = M05.LIZIZ(diversionData, z, z2, this.LJLJLLL);
            M06 LIZLLL = M05.LIZLLL(customDotResponse, diversionData);
            M08 LIZJ = M05.LIZJ(countCfg);
            if (countCfg != null) {
                num = countCfg.getCount();
            }
            if (this.LJLJLLL == 0) {
                enumC56125M0z = EnumC56125M0z.MALL_TAB;
            } else {
                enumC56125M0z = EnumC56125M0z.MALL_TOP_TAB;
            }
            C55931LxH c55931LxH = this.LJLJJI;
            if (c55931LxH == null || (enumC55932LxI = c55931LxH.LIZ()) == null) {
                enumC55932LxI = EnumC55932LxI.NONE;
            }
            M05.LJII(LIZLLL, LIZJ, num, enumC56125M0z, enumC55932LxI, customDotResponse.getLogExtraMap(), LIZIZ);
        }
    }

    public final void vv0(boolean z, boolean z2, boolean z3, InterfaceC88471Ynr<? super Boolean, ? super InterfaceC67352kd<? super Response<CustomDotResponse>>, ? extends Object> interfaceC88471Ynr) {
        long j;
        XKQ LJJIJIIJI;
        boolean z4 = this.LJLJLJ;
        boolean z5 = false;
        this.LJLJLJ = false;
        C36268ELg c36268ELg = this.LJLJJL;
        C36268ELg c36268ELg2 = new C36268ELg();
        if (c36268ELg != null) {
            j = c36268ELg.LIZ;
        } else {
            j = 0;
        }
        c36268ELg2.LIZ = j + 1;
        c36268ELg2.LJ = z4;
        M0N m0n = M0N.API_REQUEST_START;
        c36268ELg2.LIZIZ(m0n);
        c36268ELg2.LJFF = z2;
        if (c36268ELg != null) {
            z5 = c36268ELg.LJIIJ;
        }
        c36268ELg2.LJIIJ = z5;
        Set<M0N> set = c36268ELg2.LIZJ;
        set.add(M0N.IDLE);
        set.add(m0n);
        this.LJLJJL = c36268ELg2;
        if (c36268ELg != null && c36268ELg.LIZIZ == m0n) {
            if (c36268ELg.LJ || c36268ELg.LJFF) {
                c36268ELg.LJI = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mark old job：isColdStart:");
                LIZ.append(c36268ELg.LJ);
                LIZ.append("，isClick:");
                LIZ.append(c36268ELg.LJFF);
                C36264ELc.LIZ(X1D.LIZIZ(LIZ));
            } else {
                XKQ xkq = c36268ELg.LIZLLL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                C36264ELc.LIZ("old api request are canceled");
            }
        }
        LJJIJIIJI = C78565UsT.LJJIJIIJI(this, MBB.INSTANCE, new C36262ELa(c36268ELg2, interfaceC88471Ynr, z4, this, c36268ELg, z2, z3, z, null));
        c36268ELg2.LIZLLL = LJJIJIIJI;
    }

    public static /* synthetic */ void xv0(CustomDotVM customDotVM, CustomDotResponse customDotResponse, CustomDotResponse customDotResponse2, DiversionData diversionData, boolean z) {
        customDotVM.wv0(customDotResponse, customDotResponse2, diversionData, z, false, false);
    }

    public final void kv0(IconCfg iconCfg, IconCfg iconCfg2, CountCfg countCfg, CountCfg countCfg2, boolean z) {
        C78565UsT.LJJIJIIJI(this, MBB.INSTANCE, new EC6(this, iconCfg, iconCfg2, countCfg, countCfg2, z, null));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object nv0(com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse r44, boolean r45, X.C36268ELg r46, X.C36268ELg r47, X.InterfaceC67352kd<? super X.C76800UCe> r48) {
        /*
            Method dump skipped, instructions count: 3338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM.nv0(com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse, boolean, X.ELg, X.ELg, X.2kd):java.lang.Object");
    }

    public final void wv0(CustomDotResponse customDotResponse, CustomDotResponse customDotResponse2, DiversionData diversionData, boolean z, boolean z2, boolean z3) {
        EnumC56125M0z enumC56125M0z;
        EnumC55932LxI enumC55932LxI;
        CountCfg countConfig;
        Integer num;
        EnumC56125M0z position;
        EnumC56108M0i disappearType;
        DiversionEntranceRes LJJ;
        DiversionEntranceResCfg config;
        Integer num2 = null;
        if (customDotResponse2 != null) {
            if (diversionData == null || (LJJ = C73340SqO.LJJ(diversionData)) == null || (config = LJJ.getConfig()) == null || (countConfig = config.getRedDot()) == null) {
                countConfig = customDotResponse2.getCountConfig();
            }
            Map LIZIZ = M05.LIZIZ(diversionData, z2, z3, this.LJLJLLL);
            M06 redDotType = M05.LIZLLL(customDotResponse2, diversionData);
            M08 LIZJ = M05.LIZJ(countConfig);
            if (countConfig != null) {
                num = countConfig.getCount();
            } else {
                num = null;
            }
            if (this.LJLJLLL == 0) {
                position = EnumC56125M0z.MALL_TAB;
            } else {
                position = EnumC56125M0z.MALL_TOP_TAB;
            }
            Map<String, Object> logExtraMap = customDotResponse2.getLogExtraMap();
            if (z) {
                disappearType = EnumC56108M0i.CLICK;
            } else {
                disappearType = EnumC56108M0i.OTHER;
            }
            o.LJIIIZ(redDotType, "redDotType");
            o.LJIIIZ(position, "position");
            o.LJIIIZ(disappearType, "disappearType");
            if (redDotType != M06.NONE) {
                C56092Lzs c56092Lzs = C56092Lzs.LIZ;
                HashMap LIZJ2 = C03660Ck.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
                LIZJ2.put("red_dot_type", redDotType.getValue());
                if (LIZJ != null) {
                    LIZJ2.put("red_dot_number_type", LIZJ.getValue());
                }
                if (num != null) {
                    num.intValue();
                    LIZJ2.put("red_dot_number", num);
                }
                LIZJ2.put("position", position.getValue());
                LIZJ2.put("disappear_type", disappearType.getValue());
                if (logExtraMap != null) {
                    LIZJ2.putAll(logExtraMap);
                }
                if (LIZIZ != null) {
                    LIZJ2.putAll(LIZIZ);
                }
                c56092Lzs.getClass();
                C56092Lzs.LJIILIIL("tiktokec_red_dot_disappear", LIZJ2);
            }
            C36264ELc.LIZ("red dot dismiss report");
        }
        if (customDotResponse != null) {
            if (customDotResponse.getIconConfig() != null || (customDotResponse != null && customDotResponse.getCountConfig() != null)) {
                M06 LIZLLL = M05.LIZLLL(customDotResponse, null);
                M08 LIZJ3 = M05.LIZJ(customDotResponse.getCountConfig());
                CountCfg countConfig2 = customDotResponse.getCountConfig();
                if (countConfig2 != null) {
                    num2 = countConfig2.getCount();
                }
                if (this.LJLJLLL == 0) {
                    enumC56125M0z = EnumC56125M0z.MALL_TAB;
                } else {
                    enumC56125M0z = EnumC56125M0z.MALL_TOP_TAB;
                }
                C55931LxH c55931LxH = this.LJLJJI;
                if (c55931LxH == null || (enumC55932LxI = c55931LxH.LIZ()) == null) {
                    enumC55932LxI = EnumC55932LxI.NONE;
                }
                M05.LJII(LIZLLL, LIZJ3, num2, enumC56125M0z, enumC55932LxI, customDotResponse.getLogExtraMap(), null);
                C36264ELc.LIZ("red dot show report");
            }
        }
    }
}
