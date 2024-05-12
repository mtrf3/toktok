package com.ss.android.ugc.feed.platform.container.info;

import X.C213688a4;
import X.C214348b8;
import X.C241249dQ;
import X.C52552Kjs;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8ON;
import X.C8OV;
import X.C8OX;
import X.C8OY;
import X.C8YN;
import X.EnumC210578Of;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public final class FeedInfoAreaContainer extends BaseContainer<VContainerProtocol, FeedInfoAreaContainer> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final EnumC210578Of LLFZ;
    public boolean LLI;

    static {
        TBT tbt = new TBT(FeedInfoAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(FeedInfoAreaContainer.class, "infoAreaVM", "getInfoAreaVM()Lcom/ss/android/ugc/feed/platform/container/info/FeedInfoAreaVM;", 0, c65351Pkp)};
    }

    public final synchronized void n4() {
        if (this.LLI) {
            return;
        }
        C78926UyI.LJFF(this, new AqS169S0100000_3(this, 592));
        if (this.LL != null) {
            InterfaceC115514g7 interfaceC115514g7 = this.LLFFF;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIFFJFJJ;
            ((ConstraintSizeVM) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[0])).kv0((ViewGroup) getContainerView());
            ConstraintSizeVM constraintSizeVM = (ConstraintSizeVM) this.LLFFF.LIZ(this, interfaceC74236TBoArr[0]);
            View containerView = getContainerView();
            constraintSizeVM.getClass();
            if (!C52552Kjs.LIZ()) {
                ConstraintSizeVM.nv0(R.id.n9m, C8ON.LIZIZ(), containerView);
            } else {
                ConstraintSizeVM.nv0(R.id.n9m, C8ON.LIZ(), containerView);
            }
            ConstraintSizeVM constraintSizeVM2 = (ConstraintSizeVM) this.LLFFF.LIZ(this, interfaceC74236TBoArr[0]);
            View containerView2 = getContainerView();
            constraintSizeVM2.getClass();
            ConstraintSizeVM.nv0(R.id.gw_, C8ON.LIZIZ(), containerView2);
        }
        this.LLI = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJIIJ(this, (AssemViewModel) this.LLFII.LIZ(this, LLIFFJFJJ[1]), new TBT() { // from class: X.8OZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C210538Ob) obj).LJLIL);
            }
        }, new TBT() { // from class: X.8Oa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C210538Ob) obj).LJLILLLLZI);
            }
        }, C213688a4.LIZLLL(), C8OV.LJLIL, 8);
    }

    public FeedInfoAreaContainer() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1314), null, C8OX.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedInfoAreaVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 1315), null, C8OY.INSTANCE, null, null);
        this.LLFZ = EnumC210578Of.FEED_INFO_AREA_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void e4() {
        super.e4();
        n4();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLFZ;
    }
}
