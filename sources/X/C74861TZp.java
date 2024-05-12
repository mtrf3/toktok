package X;

import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestZoomLayoutBugfixSetting;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import kotlin.jvm.internal.o;

/* renamed from: X.TZp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74861TZp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJII;
    public final C74996Tc0 LIZ;
    public final C74995Tbz LIZIZ;
    public final String LIZJ;
    public final C31657Cbd LIZLLL;
    public final C74647TRj LJ;
    public final C74864TZs LJFF;
    public final C74866TZu LJI;

    static {
        TBT tbt = new TBT(C74861TZp.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C65352Pkq.LIZ.getClass();
        LJII = new InterfaceC74236TBo[]{tbt};
    }

    public final void LIZ(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        if (interfaceC65784Pro.invoke().booleanValue()) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            String str = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUserLeft: linkMicId=");
            LIZ.append(this.LIZ.LIZ.LIZJ);
            LIZ.append(", and invoke onReceiveLinkScreenChangeMessage");
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILIIL.getClass();
            C0NE.LJII(str, LIZIZ);
            C74996Tc0 c74996Tc0 = this.LIZ;
            String str2 = c74996Tc0.LIZ.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            C74865TZt.LIZ(c74996Tc0, str2, null, true, EnumC74929Tav.FROM_AUTO_SHRINK_GUEST_WHEN_GUEST_LEAVE, 4);
            C74864TZs c74864TZs = this.LJFF;
            LinkScreenChangeMessage linkScreenChangeMessage = new LinkScreenChangeMessage();
            linkScreenChangeMessage.messageType = 2;
            LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = new LinkerEnlargeStatusSynContent();
            linkerEnlargeStatusSynContent.isEnlarge = 0;
            linkerEnlargeStatusSynContent.enlargeLinkmicId = "";
            linkerEnlargeStatusSynContent.scene = 3;
            linkScreenChangeMessage.enlargeStatusSyn = linkerEnlargeStatusSynContent;
            c74864TZs.s1(linkScreenChangeMessage);
        }
    }

    public C74861TZp(C74996Tc0 zoomAnchorPresent, C74995Tbz c74995Tbz) {
        InterfaceC75441TjB R6;
        InterfaceC76652U6m LJZL;
        o.LJIIIZ(zoomAnchorPresent, "zoomAnchorPresent");
        this.LIZ = zoomAnchorPresent;
        this.LIZIZ = c74995Tbz;
        this.LIZJ = "ZoomAnchorMessageHandler";
        C31657Cbd c31657Cbd = new C31657Cbd("LINK_MESSAGE_CENTER");
        this.LIZLLL = c31657Cbd;
        C74647TRj c74647TRj = new C74647TRj(this);
        this.LJ = c74647TRj;
        C74864TZs c74864TZs = new C74864TZs(this);
        this.LJFF = c74864TZs;
        C74866TZu c74866TZu = new C74866TZu(this);
        this.LJI = c74866TZu;
        C8E.LJ().e3(c74647TRj);
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c31657Cbd.LIZ(this, LJII[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(c74864TZs);
        }
        if (MultiGuestZoomLayoutBugfixSetting.INSTANCE.getValue() && (R6 = C8E.LJ().R6()) != null && (LJZL = R6.LJZL()) != null) {
            LJZL.LJJIIZ(c74866TZu);
        }
    }
}
