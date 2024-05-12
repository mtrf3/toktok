package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.IDqS437S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6E {
    public final C76696U8e LIZ;
    public final C76703U8l LIZIZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<Layout, Boolean> LIZLLL;
    public final InterfaceC88472Yns<LayoutDSLConfig, C76800UCe> LJ;
    public final InterfaceC88473Ynt<Layout, String, Boolean, C76800UCe> LJFF;
    public final InterfaceC88472Yns<String, C76800UCe> LJI;

    public final void LIZIZ() {
        Layout LIZJ = this.LIZIZ.LIZJ(false);
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZJ;
        Boolean bool = Boolean.TRUE;
        interfaceC88472Yns.invoke(bool);
        this.LJI.invoke("onReplyAgreeInviteMessageReceived");
        if (LIZJ != null && !this.LIZ.getLocalVisibleRect(new Rect())) {
            this.LJFF.invoke(LIZJ, "onReplyAgreeInviteMessageReceived", bool);
        }
    }

    public final void LIZ(String str, LayoutDSLConfig layoutDSLConfig) {
        this.LJI.invoke(str);
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZJ;
        Boolean bool = Boolean.TRUE;
        interfaceC88472Yns.invoke(bool);
        this.LJ.invoke(layoutDSLConfig);
        Layout LIZJ = this.LIZIZ.LIZJ(false);
        if (LIZJ != null && !this.LIZ.getLocalVisibleRect(new Rect())) {
            this.LJFF.invoke(LIZJ, "anchorProcessReplyApplySuccess", bool);
        }
    }

    public U6E(C76696U8e layoutView, C76703U8l dataCenter, AqS179S0100000_13 aqS179S0100000_13, AqS179S0100000_13 aqS179S0100000_132, AqS179S0100000_13 aqS179S0100000_133, IDqS437S0100000_13 iDqS437S0100000_13, C75521TkT logger) {
        o.LJIIIZ(layoutView, "layoutView");
        o.LJIIIZ(dataCenter, "dataCenter");
        o.LJIIIZ(logger, "logger");
        this.LIZ = layoutView;
        this.LIZIZ = dataCenter;
        this.LIZJ = aqS179S0100000_13;
        this.LIZLLL = aqS179S0100000_132;
        this.LJ = aqS179S0100000_133;
        this.LJFF = iDqS437S0100000_13;
        this.LJI = logger;
    }
}
