package Y;

import X.AbstractC196927o8;
import X.C196957oB;
import X.C224748ru;
import X.C34K;
import X.C71Y;
import X.EnumC196967oC;
import X.InterfaceC1793272a;
import X.InterfaceC65784Pro;
import X.SYL;
import android.view.View;
import com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS20S0500000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCListenerS243S0100000_3 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS243S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS243S0100000_3 iDCListenerS243S0100000_3, View v) {
        o.LJIIIZ(v, "v");
        C71Y.LIZ("xjcccccccc", "repost line attach window ");
        v.postDelayed(new ARunnableS39S0100000_3((AqS20S0500000_3) iDCListenerS243S0100000_3.l0, 6), 3000L);
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS243S0100000_3 iDCListenerS243S0100000_3, View v) {
        o.LJIIIZ(v, "v");
        SYL e4 = ((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).e4();
        if (e4 != null) {
            e4.LJIIJJI(((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).LLI);
        }
        SYL e42 = ((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).e4();
        if (e42 != null) {
            e42.addOnLayoutChangeListener(((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).LLII);
        }
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS243S0100000_3 iDCListenerS243S0100000_3, View v) {
        o.LJIIIZ(v, "v");
        C71Y.LIZ("xjcccccccc", "repost line detach window ");
        v.removeOnAttachStateChangeListener(iDCListenerS243S0100000_3);
        v.removeCallbacks(new ARunnableS39S0100000_3((AqS20S0500000_3) iDCListenerS243S0100000_3.l0, 6));
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS243S0100000_3 iDCListenerS243S0100000_3, View v) {
        o.LJIIIZ(v, "v");
        SYL e4 = ((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).e4();
        if (e4 != null) {
            e4.LJJLL(((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).LLI);
        }
        SYL e42 = ((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).e4();
        if (e42 != null) {
            e42.removeOnLayoutChangeListener(((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).LLII);
        }
        NowAreaMonitorViewModel c4 = ((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).c4();
        C196957oB areaState = C196957oB.LIZIZ;
        c4.getClass();
        o.LJIIIZ(areaState, "areaState");
        c4.setStateImmediate(new AqS169S0100000_3((AbstractC196927o8) areaState, 31));
        ((NowAreaMonitorAssem) iDCListenerS243S0100000_3.l0).g4(EnumC196967oC.INVALID);
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS243S0100000_3 iDCListenerS243S0100000_3, View v) {
        o.LJIIIZ(v, "v");
        ((InterfaceC65784Pro) iDCListenerS243S0100000_3.l0).invoke();
    }

    public IDCListenerS243S0100000_3(InterfaceC1793272a interfaceC1793272a, View view, C224748ru c224748ru, C34K c34k, int i) {
        this.$t = i;
        this.l0 = new AqS20S0500000_3(this, interfaceC1793272a, view, c224748ru, c34k, 0);
    }
}
