package X;

import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestZoomLayoutBugfixSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.TRk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74648TRk {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIIIIZZ;
    public final AbstractC75001Tc5 LIZ;
    public final C74995Tbz LIZIZ;
    public final String LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C31657Cbd LJ;
    public final C74862TZq LJFF;
    public final C74643TRf LJI;
    public final C74867TZv LJII;

    static {
        TBT tbt = new TBT(C74648TRk.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C65352Pkq.LIZ.getClass();
        LJIIIIZZ = new InterfaceC74236TBo[]{tbt};
    }

    public final void LIZ() {
        InterfaceC75441TjB R6;
        InterfaceC76652U6m LJZL;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) this.LJ.LIZ(this, LJIIIIZZ[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(this.LJFF);
        }
        C8E.LJ().X3(this.LJI);
        if (MultiGuestZoomLayoutBugfixSetting.INSTANCE.getValue() && (R6 = C8E.LJ().R6()) != null && (LJZL = R6.LJZL()) != null) {
            LJZL.LJJJJI(this.LJII);
        }
    }

    public C74648TRk(AbstractC75001Tc5 zoomPresent, C74995Tbz c74995Tbz) {
        InterfaceC75441TjB R6;
        InterfaceC76652U6m LJZL;
        o.LJIIIZ(zoomPresent, "zoomPresent");
        this.LIZ = zoomPresent;
        this.LIZIZ = c74995Tbz;
        this.LIZJ = "Zoom/ZoomGuestMessageHandler";
        this.LIZLLL = C221108m2.LIZIZ(C74646TRi.LJLIL);
        C31657Cbd c31657Cbd = new C31657Cbd("LINK_MESSAGE_CENTER");
        this.LJ = c31657Cbd;
        C74862TZq c74862TZq = new C74862TZq(this);
        this.LJFF = c74862TZq;
        C74643TRf c74643TRf = new C74643TRf(this);
        this.LJI = c74643TRf;
        C74867TZv c74867TZv = new C74867TZv(this);
        this.LJII = c74867TZv;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c31657Cbd.LIZ(this, LJIIIIZZ[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(c74862TZq);
        }
        C8E.LJ().e3(c74643TRf);
        if (MultiGuestZoomLayoutBugfixSetting.INSTANCE.getValue() && (R6 = C8E.LJ().R6()) != null && (LJZL = R6.LJZL()) != null) {
            LJZL.LJJIIZ(c74867TZv);
        }
    }
}
