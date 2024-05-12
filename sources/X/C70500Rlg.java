package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpBottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rlg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70500Rlg implements IPdpStarter {
    public static Object LIZLLL;
    public C73411SrX LIZIZ;
    public long LIZJ = -1;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (r1.enable == X.EnumC53634L3e.Style2.getValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r1.enable == X.EnumC53633L3d.STYLE2.getValue()) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.ActivityC45651qj r24, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r25) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70500Rlg.LIZIZ(X.1qj, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }

    public static final boolean LIZ(ActivityC45651qj activityC45651qj, C70006Rdi c70006Rdi, IPdpStarter.PdpEnterParam pdpEnterParam, long j) {
        ProductPackStruct productPackStruct;
        String str;
        if (c70006Rdi.LIZLLL != null) {
            if (TextUtils.isEmpty(pdpEnterParam.getChainKey()) && (productPackStruct = c70006Rdi.LIZLLL) != null && (str = productPackStruct.chainKey) != null) {
                HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
                if (visitReportParams != null) {
                    visitReportParams.put("chain_key", str);
                }
                pdpEnterParam.setChainKey(str);
            }
            InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
            C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
            String req = c70006Rdi.LIZ;
            c69995RdX.getClass();
            o.LJIIIZ(req, "req");
            C69995RdX.LJLJLJ.remove(req);
            C69995RdX.LJLJLLL.remove(req);
            LIZJ(activityC45651qj, pdpEnterParam, c70006Rdi.LIZLLL, j, c70006Rdi.LIZIZ, 0);
            return true;
        }
        return false;
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, long j, int i, int i2) {
        if (pdpEnterParam.getFullScreen()) {
            Intent intent = new Intent(activityC45651qj, (Class<?>) PdpActivity.class);
            intent.putExtra("CLICK_TIMESTAMP", j);
            intent.putExtra("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
            intent.putExtra("PREFETCH_TYPE", i);
            intent.putExtra("ERROR_CODE", i2);
            String preTrackNodeId = pdpEnterParam.getPreTrackNodeId();
            if (preTrackNodeId != null) {
                C1A8.LJIJI(preTrackNodeId, new AqS53S1200000_12(productPackStruct, intent, preTrackNodeId, 22));
            }
            C16880lQ.LIZLLL(activityC45651qj, intent);
            u.LJJIIJZLJL("open pdp full", pdpEnterParam.getTrackParams());
        } else {
            if (activityC45651qj.isFinishing() || activityC45651qj.isDestroyed()) {
                return;
            }
            new C70414RkI(activityC45651qj, pdpEnterParam);
            PdpFragment pdpFragment = new PdpFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("full_screen", pdpEnterParam.getFullScreen());
            bundle.putLong("CLICK_TIMESTAMP", j);
            bundle.putLong("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
            bundle.putInt("PREFETCH_TYPE", i);
            bundle.putInt("ERROR_CODE", i2);
            String preTrackNodeId2 = pdpEnterParam.getPreTrackNodeId();
            if (preTrackNodeId2 != null) {
                C1A8.LJIJI(preTrackNodeId2, new AqS53S1200000_12(productPackStruct, bundle, preTrackNodeId2, 21));
            }
            pdpFragment.setArguments(bundle);
            pdpFragment.LJLJJLL = pdpEnterParam.getBizType();
            ASL LIZ = C249109q6.LIZ(3);
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLLILLLL = pdpFragment;
            tuxSheet.LJLILLLLZI = pdpFragment;
            tuxSheet.LLD = true;
            PdpBottomSheetBehavior pdpBottomSheetBehavior = new PdpBottomSheetBehavior();
            TuxSheet tuxSheet2 = LIZ.LIZ;
            tuxSheet2.LLFZ = pdpBottomSheetBehavior;
            tuxSheet2.LJZI = false;
            tuxSheet2.LJZL = true;
            tuxSheet2.LJLLL = null;
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            tuxSheet2.show(supportFragmentManager, "pdp_fragment");
            FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
            if (LJIIZILJ != null) {
                LJIIZILJ.LJ(true);
            }
            PdpFragment.LLIIJLIL = true;
            u.LJJIIJZLJL("open pdp half", pdpEnterParam.getTrackParams());
        }
        HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
        if (visitReportParams != null) {
            PdpApi.LIZ.getClass();
            visitReportParams.put("click_time_millis", Long.valueOf(System.currentTimeMillis()));
            visitReportParams.put("request_time_millis", Long.valueOf(System.currentTimeMillis()));
            ((PdpApi) C70091Rf5.LIZIZ.create(PdpApi.class)).reportEnterPdp(visitReportParams).LJJL(T16.LIZ()).LJJJLZIJ(new InterfaceC64592gB() { // from class: X.9EX
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9EY
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, C70563Rmh.LIZ, new InterfaceC64592gB() { // from class: X.9EZ
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        C78565UsT.LJJIIZI(activityC45651qj, MBB.INSTANCE, new C27569Art(pdpEnterParam, null));
    }

    public static /* synthetic */ void LIZLLL(C70500Rlg c70500Rlg, ActivityC45651qj activityC45651qj, IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, long j, int i) {
        c70500Rlg.getClass();
        LIZJ(activityC45651qj, pdpEnterParam, productPackStruct, j, i, 0);
    }
}
