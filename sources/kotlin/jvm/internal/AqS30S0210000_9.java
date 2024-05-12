package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1DI;
import X.C27484AqW;
import X.C36351EOl;
import X.C36352EOm;
import X.C36354EOo;
import X.C36355EOp;
import X.C54362LVe;
import X.C55551Lr9;
import X.C55552LrA;
import X.C55964Lxo;
import X.C55970Lxu;
import X.C55978Ly2;
import X.C56363MAd;
import X.C56364MAe;
import X.C5RG;
import X.C61878OQg;
import X.C76800UCe;
import X.C78857UxB;
import X.C7MY;
import X.C9KK;
import X.EnumC57435MgR;
import X.InterfaceC88472Yns;
import X.MB4;
import X.MCT;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.roaming.NearbyRegionListFragment;
import com.ss.android.ugc.aweme.roaming.NearbyRegionListV1Response;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public class AqS30S0210000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS30S0210000_9 aqS30S0210000_9, Object obj) {
        EnumC57435MgR followStatus = (EnumC57435MgR) obj;
        o.LJIIIZ(followStatus, "followStatus");
        RelationButton relationButton = (RelationButton) aqS30S0210000_9.l0;
        C27484AqW.LIZIZ(relationButton, new AqS52S0110000_9(aqS30S0210000_9.z2, relationButton, 3));
        ((AbsRecUserCell) aqS30S0210000_9.l1).a0(followStatus);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS30S0210000_9 aqS30S0210000_9, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((NearbyRegionListFragment) aqS30S0210000_9.l0, new AqS175S0100000_9((NearbyRegionListV1Response) aqS30S0210000_9.l1, 262));
        if (!aqS30S0210000_9.z2) {
            assemble.wv0((NearbyRegionListFragment) aqS30S0210000_9.l0, C55551Lr9.LJLIL);
        }
        assemble.wv0((NearbyRegionListFragment) aqS30S0210000_9.l0, C9KK.LJLIL);
        assemble.wv0((NearbyRegionListFragment) aqS30S0210000_9.l0, C55552LrA.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS30S0210000_9 aqS30S0210000_9, Object obj) {
        String str;
        String str2;
        C56364MAe c56364MAe;
        boolean z;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            th = th.getCause();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invokeOnCompletion cause=");
        LIZ.append(th);
        MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ));
        if (th instanceof C36351EOl) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("empty ");
            LIZ2.append(th.getMessage());
            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ2));
            Context context = (Context) aqS30S0210000_9.l0;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            C56363MAd.LJFF(context, c61878OQg, true, true);
            C56363MAd.LJFF(context, c61878OQg, false, true);
        } else if (th instanceof C36352EOm) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("default camera ");
            LIZ3.append(th.getMessage());
            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ3));
            Context context2 = (Context) aqS30S0210000_9.l0;
            C61878OQg c61878OQg2 = C61878OQg.INSTANCE;
            C56363MAd.LJFF(context2, c61878OQg2, true, false);
            C56363MAd.LJFF(context2, c61878OQg2, false, false);
        } else if (th instanceof C36354EOo) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("story camera ");
            LIZ4.append(th.getMessage());
            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ4));
            Context context3 = (Context) aqS30S0210000_9.l0;
            C61878OQg c61878OQg3 = C61878OQg.INSTANCE;
            C56363MAd.LJ(context3, c61878OQg3, true);
            C56363MAd.LJ(context3, c61878OQg3, false);
        } else if (th instanceof C36355EOp) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("exception ");
            LIZ5.append(th.getMessage());
            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ5));
        } else {
            MB4 mb4 = (MB4) aqS30S0210000_9.l1;
            if (mb4.LJLILLLLZI != null) {
                C56364MAe c56364MAe2 = mb4.LJLIL;
                String str3 = null;
                if (c56364MAe2 != null) {
                    str = c56364MAe2.LJLIL;
                } else {
                    str = null;
                }
                if (C78857UxB.LJJJIL(str)) {
                    C56364MAe c56364MAe3 = mb4.LJLIL;
                    if (c56364MAe3 != null) {
                        str2 = c56364MAe3.LJLILLLLZI;
                    } else {
                        str2 = null;
                    }
                    if (C78857UxB.LJJJIL(str2)) {
                        C56364MAe c56364MAe4 = mb4.LJLIL;
                        if (c56364MAe4 != null) {
                            str3 = c56364MAe4.LJLJI;
                        }
                        if (C78857UxB.LJJJIL(str3) && (c56364MAe = mb4.LJLIL) != null && c56364MAe.LJLJJI >= 0) {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("isEffective: ");
                            LIZ6.append((MB4) aqS30S0210000_9.l1);
                            MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ6));
                            Context context4 = (Context) aqS30S0210000_9.l0;
                            MB4 mb42 = (MB4) aqS30S0210000_9.l1;
                            Bitmap bitmap = mb42.LJLILLLLZI;
                            if (bitmap != null) {
                                int[] LIZJ = C56363MAd.LIZJ(context4, true);
                                if (LIZJ.length == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    MCT.LIZ("StoryWidgetMgr-updateWidgetWithAwemeInternal", "update large widgets");
                                    C56363MAd.LJI(context4, mb42, LIZJ, R.layout.he, ((C5RG) C56363MAd.LIZJ.getValue()).LIZ(context4, bitmap, C7MY.LIZIZ(276), C7MY.LIZIZ(276), C7MY.LIZIZ(18)));
                                }
                                int[] LIZJ2 = C56363MAd.LIZJ(context4, false);
                                if (LIZJ2.length != 0) {
                                    MCT.LIZ("StoryWidgetMgr-updateWidgetWithAwemeInternal", "update small widgets");
                                    C56363MAd.LJI(context4, mb42, LIZJ2, R.layout.hg, ((C5RG) C56363MAd.LIZJ.getValue()).LIZ(context4, bitmap, C7MY.LIZIZ(132), C7MY.LIZIZ(132), C7MY.LIZIZ(12)));
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("end: consumeAbleForceToEmpty=");
        LIZ7.append(aqS30S0210000_9.z2);
        MCT.LIZ("StoryWidgetMgr-refreshWidgetInternal", X1D.LIZIZ(LIZ7));
        C56363MAd.LJFF = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS30S0210000_9 aqS30S0210000_9, Object obj) {
        List<ToolEntryVO> LIZ;
        C55978Ly2 oldState = (C55978Ly2) obj;
        o.LJIIIZ(oldState, "oldState");
        ShopMainViewModel shopMainViewModel = (ShopMainViewModel) aqS30S0210000_9.l0;
        shopMainViewModel.getClass();
        boolean z = false;
        int LJIILIIL = C54362LVe.LJIILIIL(210);
        int LJIILIIL2 = C54362LVe.LJIILIIL(214);
        if (LJIILIIL > 0 || LJIILIIL2 > 0) {
            z = true;
        }
        shopMainViewModel.LJLJLLL = z;
        ShopMainViewModel shopMainViewModel2 = (ShopMainViewModel) aqS30S0210000_9.l0;
        shopMainViewModel2.LJLL = (Notice) aqS30S0210000_9.l1;
        shopMainViewModel2.LJLLI = aqS30S0210000_9.z2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("UpdateToolPanel messageNotify ");
        C1DI.LIZJ(LIZ2, ((ShopMainViewModel) aqS30S0210000_9.l0).LJLJLLL, LIZ2, 3);
        int i = C55970Lxu.LIZ[((ShopMainViewModel) aqS30S0210000_9.l0).lv0().LJLJJL.ordinal()];
        if (i != 1) {
            if (i == 2 && (LIZ = oldState.LJLJLLL.LIZ()) != null) {
                ((ShopMainViewModel) aqS30S0210000_9.l0).setState(new AqS175S0100000_9(((ShopMainViewModel) aqS30S0210000_9.l0).sv0(LIZ, (Notice) aqS30S0210000_9.l1, Boolean.valueOf(aqS30S0210000_9.z2)), (List<PoiCategory>) 556));
            }
        } else {
            List<ToolEntryVO> LIZ3 = oldState.LJLL.LIZ();
            if (LIZ3 != null) {
                C55964Lxo c55964Lxo = null;
                List sv0 = ((ShopMainViewModel) aqS30S0210000_9.l0).sv0(LIZ3, null, null);
                C55964Lxo LIZ4 = oldState.LJLJJLL.LIZ();
                if (LIZ4 != null) {
                    ((ShopMainViewModel) aqS30S0210000_9.l0).getClass();
                    c55964Lxo = C55964Lxo.LIZ(LIZ4, Boolean.valueOf(ShopMainViewModel.rv0(sv0)));
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("UpdateToolPanel new user toolPanel setState message notify ");
                C1DI.LIZJ(LIZ5, ((ShopMainViewModel) aqS30S0210000_9.l0).LJLJLLL, LIZ5, 3);
                ((ShopMainViewModel) aqS30S0210000_9.l0).setState(new AqS140S0200000_9(c55964Lxo, (C55964Lxo) sv0, (List<ToolEntryVO>) 85));
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0210000_9(Context context, MB4 mb4, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = mb4;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0210000_9(ShopMainViewModel shopMainViewModel, Notice notice, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = shopMainViewModel;
        this.l1 = notice;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS30S0210000_9(RelationButton relationButton, RelationButton relationButton2, AbsRecUserCell<ITEM> absRecUserCell, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = relationButton;
        this.l1 = relationButton2;
        this.z2 = absRecUserCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0210000_9(NearbyRegionListFragment nearbyRegionListFragment, boolean z, NearbyRegionListV1Response nearbyRegionListV1Response, int i) {
        super(1);
        this.$t = i;
        this.l0 = nearbyRegionListFragment;
        this.z2 = z;
        this.l1 = nearbyRegionListV1Response;
    }
}
