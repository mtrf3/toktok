package X;

import com.bytedance.nita.Nita$beginDynamicInflate$1;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.FUv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39065FUv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, ActivityC45651qj activity, DetailAwemeListFragment lifecycleOwner) {
        int i;
        int i2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C16990lb c16990lb = C16970lZ.LIZ;
        if (c16990lb == null || !c16990lb.LJ) {
            return;
        }
        try {
            if (((Number) FV9.LIZ.getValue()).intValue() == 1 || ((i2 = FV9.LIZIZ) < 4 && i2 != 0)) {
                i = C79537VJl.LIZIZ;
            } else {
                i = C79537VJl.LIZJ;
            }
            C39067FUx c39067FUx = C39067FUx.LIZ;
            EnumC38909FOv schedulerType = EnumC38909FOv.AT_ONCE;
            o.LJIIJ(schedulerType, "schedulerType");
            Nita$beginDynamicInflate$1 nita$beginDynamicInflate$1 = new Nita$beginDynamicInflate$1(str, c39067FUx, schedulerType);
            nita$beginDynamicInflate$1.LJLILLLLZI = activity;
            nita$beginDynamicInflate$1.LJLJJI = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(nita$beginDynamicInflate$1);
            nita$beginDynamicInflate$1.LJLIL.add(Integer.valueOf(R.layout.ako));
            nita$beginDynamicInflate$1.LJLJI = i;
            nita$beginDynamicInflate$1.LJIIIIZZ();
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preload view failed: ");
            LIZ2.append(V0N.LJJIJL(e));
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DetailPreloadVH", X1D.LIZIZ(LIZ2));
        }
    }
}
