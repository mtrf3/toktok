package com.bytedance.android.livesdk.actionhandler;

import X.BNV;
import X.BNY;
import X.BNZ;
import X.BTK;
import X.BTM;
import X.BTN;
import X.BTO;
import X.BTP;
import X.BTQ;
import X.BTR;
import X.BTT;
import X.BTX;
import X.BTY;
import X.BTZ;
import X.C10950br;
import X.C28670BNa;
import X.C28672BNc;
import X.C28673BNd;
import X.C28674BNe;
import X.C28675BNf;
import X.C28678BNi;
import X.C28830BTe;
import X.C28869BUr;
import X.C73969T1h;
import X.C77123UOp;
import X.C77903Uhn;
import X.C78253UnR;
import X.C78886Uxe;
import X.Q7L;
import X.T16;
import X.U4A;
import X.UCH;
import Y.AfS17S0001000_5;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.actionhandler.schema.handler.LiveRankingListDialogSchemaHandler;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridContainerForceUseSparkSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ActionHandlerService implements IActionHandlerService {
    public BTY LJLIL;
    public final C77903Uhn LJLILLLLZI = new C77903Uhn(0);
    public volatile boolean LJLJI = false;

    public final synchronized void LIZLLL() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        LJ();
        LJFF();
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C10950br.LIZ(this);
    }

    public final void LJ() {
        this.LJLILLLLZI.LIZJ(new BTN(new C28830BTe()));
        BTY bty = new BTY();
        this.LJLIL = bty;
        this.LJLILLLLZI.LIZJ(new BTR(bty));
        if (!LiveHybridContainerForceUseSparkSetting.getValue()) {
            this.LJLILLLLZI.LIZJ(new BTT(new U4A(), new C78253UnR(), new C28869BUr(), new BNV()));
        }
        this.LJLILLLLZI.LIZJ(new BTO(new UCH()));
        this.LJLILLLLZI.LIZJ(new BTQ(new C77123UOp()));
        this.LJLILLLLZI.LIZJ(new BTM(new C28678BNi()));
        this.LJLILLLLZI.LIZJ(new BTP(new C78886Uxe()));
        this.LJLILLLLZI.LIZJ(new BNY());
        this.LJLILLLLZI.LIZJ(BTK.LIZIZ);
        this.LJLILLLLZI.LIZJ(new C28670BNa());
    }

    public ActionHandlerService() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        LIZLLL();
    }

    public final void LJFF() {
        if (LiveHybridContainerForceUseSparkSetting.getValue()) {
            this.LJLILLLLZI.LIZJ(BTX.LIZIZ);
        }
        this.LJLILLLLZI.LIZJ(new BNZ());
        this.LJLILLLLZI.LIZJ(new LiveRankingListDialogSchemaHandler());
        this.LJLILLLLZI.LIZJ(new C28674BNe());
        this.LJLILLLLZI.LIZJ(new C28672BNc());
        this.LJLILLLLZI.LIZJ(C28675BNf.LIZIZ);
        this.LJLILLLLZI.LIZJ(new C28673BNd());
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean canHandle(Uri uri) {
        LIZLLL();
        C77903Uhn c77903Uhn = this.LJLILLLLZI;
        c77903Uhn.getClass();
        o.LJIIIZ(uri, "uri");
        BTZ btz = (BTZ) ((Map) c77903Uhn.LIZ).get(uri.getHost());
        if (btz != null && btz.LIZ(uri)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean showUserProfile(long j) {
        LIZLLL();
        this.LJLIL.getClass();
        BTY.LIZ(j, null, null);
        return true;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handle(Context context, String str) {
        return LIZ(context, UriProtector.parse(str), true);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handleWithoutHost(Context context, String str) {
        return LIZ(context, UriProtector.parse(str), false);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handle(Context context, Uri uri) {
        return LIZ(context, uri, true);
    }

    public final boolean LIZ(Context context, Uri uri, boolean z) {
        LIZLLL();
        return this.LJLILLLLZI.LIZIZ(context, uri, z, null);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        LIZLLL();
        return this.LJLILLLLZI.LIZIZ(context, uri, false, map);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final boolean showUserProfile(long j, String str, Map<String, String> map) {
        LIZLLL();
        this.LJLIL.getClass();
        BTY.LIZ(j, str, map);
        return true;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public final void postReportReason(long j, long j2, long j3, String str) {
        ((ActionHandlerApi) Q7L.LIZIZ(ActionHandlerApi.class)).postReportReasons(j, j2, j3, str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS17S0001000_5(0, 0), new AfS17S0001000_5(0, 1));
    }
}
