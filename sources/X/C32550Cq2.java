package X;

import Y.IDcS37S0100000_5;
import android.os.Handler;
import android.os.SystemClock;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.OffsetGridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.base.utils.lazy.WidgetLifecycleAwareLazy;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelCacheOptSettings;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Cq2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32550Cq2 implements InterfaceC32521CpZ<AbstractC32126CjC> {
    public final /* synthetic */ C32676Cs4 LIZ;

    public C32550Cq2(C32676Cs4 c32676Cs4) {
        this.LIZ = c32676Cs4;
    }

    @Override // X.InterfaceC32521CpZ
    public final void LIZ(AbstractC32126CjC abstractC32126CjC) {
        C32580CqW c32580CqW;
        DataChannel dataChannel;
        C32506CpK<AbstractC32350Cmo> c32506CpK;
        C0A2 c0a2;
        GridLayoutManager gridLayoutManager;
        AbstractC32126CjC data = abstractC32126CjC;
        o.LJIIIZ(data, "data");
        if (data instanceof C32127CjD) {
            C32127CjD c32127CjD = (C32127CjD) data;
            Runnable runnable = c32127CjD.LIZ;
            if (runnable != null) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(runnable, 10L);
            }
            this.LIZ.LJIL(null, null, false);
            C32676Cs4 c32676Cs4 = this.LIZ;
            List list = c32127CjD.LIZIZ;
            String str = c32127CjD.LIZJ;
            c32676Cs4.getClass();
            C32694CsM.LJIIIZ = SystemClock.uptimeMillis();
            c32676Cs4.LLILLIZIL = 1;
            C32128CjE c32128CjE = C32129CjF.LIZ;
            if (c32128CjE.LJIIZILJ) {
                list = C61878OQg.INSTANCE;
            }
            if (!C32696CsO.LIZJ()) {
                RunnableC31065CHd runnableC31065CHd = c32676Cs4.LJLZ;
                if (runnableC31065CHd != null) {
                    c0a2 = runnableC31065CHd.getLayoutManager();
                } else {
                    c0a2 = null;
                }
                if ((c0a2 instanceof OffsetGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) c0a2) != null) {
                    gridLayoutManager.LLIILII = new IDcS37S0100000_5(c32676Cs4, 0);
                }
            }
            if (list.isEmpty()) {
                C32674Cs2 c32674Cs2 = new C32674Cs2(c32676Cs4, str);
                c32676Cs4.LLJILLL = c32674Cs2;
                c32676Cs4.LJJIIZI(str, c32674Cs2);
            } else {
                c32676Cs4.LJJJJJ(0, list);
                if (!LiveGiftPanelCacheOptSettings.INSTANCE.removeFetchAfterPanelOpened()) {
                    c32676Cs4.LJJIIZI(str, null);
                }
            }
            Room room = c32676Cs4.LLIL;
            if (room != null) {
                long id = room.getId();
                if (C32147CjX.LIZ(id)) {
                    ConcurrentHashSet<Long> concurrentHashSet = C32147CjX.LIZ;
                    if (!concurrentHashSet.contains(Long.valueOf(id))) {
                        C32147CjX.LIZIZ(true, room);
                    }
                    concurrentHashSet.add(Long.valueOf(id));
                }
            }
            C32694CsM.LJIIJ = SystemClock.uptimeMillis();
            GiftLeafRootViewModel LJJIJLIJ = this.LIZ.LJJIJLIJ();
            if (LJJIJLIJ != null && (c32506CpK = LJJIJLIJ.LJLJJL) != null) {
                c32506CpK.LIZ(new C32351Cmp());
            }
            if (this.LIZ.LJJIJIIJI() == 1) {
                C32792Ctw.LIZLLL(this.LIZ.LLI);
            }
            if (C32296Clw.LIZ) {
                C32296Clw.LIZJ = true;
            }
            C32676Cs4 c32676Cs42 = this.LIZ;
            GiftLeafRootViewModel LJJIJLIJ2 = c32676Cs42.LJJIJLIJ();
            if ((LJJIJLIJ2 == null || (dataChannel = LJJIJLIJ2.LJLIL) == null || !C29306Beo.LJJII(dataChannel)) && (c32580CqW = c32676Cs42.LJLJJL) != null && c32580CqW.getFragment() != null) {
                C65776Prg LIZ = C65352Pkq.LIZ(LiveCPCViewModel.class);
                AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(c32676Cs42, LIZ, 65);
                C76907UGh.LJ(c32676Cs42, (LiveCPCViewModel) new WidgetLifecycleAwareLazy(c32676Cs42, aqS151S0200000_4, new AqS72S0400000_12(c32676Cs42, aqS151S0200000_4, LIZ, C32551Cq3.INSTANCE, 0)).getValue(), c32676Cs42.LLJI, false, new AqS171S0100000_5(c32676Cs42, 5));
            }
            Keva keva = C32112Ciy.LIZ;
            keva.storeBoolean("sp_is_gift_panel_dismiss_uploaded", false);
            String value = c32128CjE.LJ;
            o.LJIIIZ(value, "value");
            keva.storeString("sp_gift_panel_dismiss_enter_from", value);
            return;
        }
        if (!(data instanceof C32125CjB)) {
            return;
        }
        C32676Cs4 c32676Cs43 = this.LIZ;
        List<GiftPage> giftPages = ((C32125CjB) data).LIZ;
        c32676Cs43.getClass();
        o.LJIIIZ(giftPages, "giftPages");
        c32676Cs43.LJJJJJ(1, giftPages);
    }
}
