package Y;

import X.BCW;
import X.C0WF;
import X.C15380j0;
import X.C28870BUs;
import X.C29306Beo;
import X.C29682Bks;
import X.C29683Bkt;
import X.C51029K0z;
import X.CN1;
import X.InterfaceC06390Mx;
import android.content.Context;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS5S2200000_5 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    public static final void run$0(ARunnableS5S2200000_5 aRunnableS5S2200000_5) {
        ((VideoWidget) aRunnableS5S2200000_5.l2).lambda$initEffectStage1$13(aRunnableS5S2200000_5.s0, aRunnableS5S2200000_5.s1, (C0WF) aRunnableS5S2200000_5.l3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        boolean z2;
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            z = iHostAction.hostInterceptSpark(this.s0);
        } else {
            z = false;
        }
        if (z) {
            BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) this.l2;
            String str = this.s0;
            Context context = (Context) this.l3;
            basePreviewSettingMainFragment.getClass();
            C29682Bks LIZJ = C29683Bkt.LIZJ(str);
            LIZJ.LJIIIZ("bottom");
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(basePreviewSettingMainFragment);
            if (LJIILIIL != null && o.LJ(LJIILIIL.kv0(BCW.class), Boolean.TRUE)) {
                C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f)));
                C29682Bks.LJJ(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJIIL()));
            } else {
                C29682Bks.LJIJI(LIZJ, 8);
                C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJIIJJI()));
                C29682Bks.LJJ(LIZJ, 395);
            }
            LIZJ.LJ(-1);
            String uri = LIZJ.LIZ().toString();
            o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder.…      .build().toString()");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            ((IHybridContainerService) LIZ).Vs0(context, uri, null);
            return;
        }
        BasePreviewSettingMainFragment basePreviewSettingMainFragment2 = (BasePreviewSettingMainFragment) this.l2;
        String str2 = this.s1;
        String str3 = this.s0;
        Context context2 = (Context) this.l3;
        basePreviewSettingMainFragment2.getClass();
        C28870BUs c28870BUs = new C28870BUs(str3);
        c28870BUs.LJIIJ = -1;
        c28870BUs.LJIIIZ = 80;
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(basePreviewSettingMainFragment2);
        if (LJIILIIL2 != null) {
            z2 = o.LJ(LJIILIIL2.kv0(BCW.class), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2) {
            c28870BUs.LIZJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f));
            c28870BUs.LIZIZ = (int) C15380j0.LJIJ(C15380j0.LJIIL());
            c28870BUs.LJIJJ = str2;
            c28870BUs.LJIJJLI = true;
            c28870BUs.LJJIFFI = true;
        } else {
            c28870BUs.LIZ(8, 0, 8);
            c28870BUs.LJIIL = true;
            c28870BUs.LIZJ = (int) C15380j0.LJIJ(C15380j0.LJIIJJI());
            c28870BUs.LIZIZ = 395;
        }
        BaseDialogFragment.wl(C29306Beo.LIZIZ(context2), ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu().LIZ(c28870BUs));
    }

    public final void LIZ$1() {
        boolean z;
        boolean z2;
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            z = iHostAction.hostInterceptSpark(this.s0);
        } else {
            z = false;
        }
        if (z) {
            BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) this.l2;
            String str = this.s0;
            Context context = (Context) this.l3;
            basePreviewSettingMainFragmentSheet.getClass();
            C29682Bks LIZJ = C29683Bkt.LIZJ(str);
            LIZJ.LJIIIZ("bottom");
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet);
            if (LJIILIIL != null && o.LJ(LJIILIIL.kv0(BCW.class), Boolean.TRUE)) {
                C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f)));
                C29682Bks.LJJ(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJIIL()));
            } else {
                C29682Bks.LJIJI(LIZJ, 8);
                C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJIIJJI()));
                C29682Bks.LJJ(LIZJ, 395);
            }
            LIZJ.LJ(-1);
            String uri = LIZJ.LIZ().toString();
            o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder.…      .build().toString()");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            ((IHybridContainerService) LIZ).Vs0(context, uri, null);
            return;
        }
        BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet2 = (BasePreviewSettingMainFragmentSheet) this.l2;
        String str2 = this.s1;
        String str3 = this.s0;
        Context context2 = (Context) this.l3;
        basePreviewSettingMainFragmentSheet2.getClass();
        C28870BUs c28870BUs = new C28870BUs(str3);
        c28870BUs.LJIIJ = -1;
        c28870BUs.LJIIIZ = 80;
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet2);
        if (LJIILIIL2 != null) {
            z2 = o.LJ(LJIILIIL2.kv0(BCW.class), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2) {
            c28870BUs.LIZJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f));
            c28870BUs.LIZIZ = (int) C15380j0.LJIJ(C15380j0.LJIIL());
            c28870BUs.LJIJJ = str2;
            c28870BUs.LJIJJLI = true;
            c28870BUs.LJJIFFI = true;
        } else {
            c28870BUs.LIZ(8, 0, 8);
            c28870BUs.LJIIL = true;
            c28870BUs.LIZJ = (int) C15380j0.LJIJ(C15380j0.LJIIJJI());
            c28870BUs.LIZIZ = 395;
        }
        BaseDialogFragment.wl(C29306Beo.LIZIZ(context2), ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu().LIZ(c28870BUs));
    }

    public static final void run$1(ARunnableS5S2200000_5 aRunnableS5S2200000_5) {
        boolean LIZ;
        try {
            aRunnableS5S2200000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S2200000_5 aRunnableS5S2200000_5) {
        boolean LIZ;
        try {
            aRunnableS5S2200000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S2200000_5(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
