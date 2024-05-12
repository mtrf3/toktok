package X;

import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117714jf {
    public static final /* synthetic */ int LIZ = 0;

    public static VideoCardTemplate LIZ(int i, int i2, String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        return new VideoCardTemplate(new VideoCoverComponent((ImageComponent) null, str2, (String) null, (VideoCoverType) null, (ActionLinkComponent) null, new ResolutionComponent(i, i2), 61), C87277YNd.LJIILJJIL(R.string.emm), new BaseRequestComponent(new QueryDataComponent(str2, null, 2)), 18);
    }

    public static void LIZLLL(C109544Rq c109544Rq, InterfaceC41771GaN interfaceC41771GaN, C117994k7 c117994k7) {
        String uuid = c109544Rq.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        C117874jv.LJIIIIZZ(interfaceC41771GaN, uuid);
        c109544Rq.setMsgStatus(3);
        C106674Gp.LJIILIIL(c109544Rq);
        C117984k6.LIZ(false, c117994k7);
    }

    public static void LIZIZ(C109544Rq c109544Rq, String str, C117844js c117844js, InterfaceC88472Yns interfaceC88472Yns) {
        C117844js LIZIZ = C117844js.LIZIZ(c117844js, null, str, null, 0, 0, null, 251);
        interfaceC88472Yns.invoke(LIZIZ);
        c109544Rq.setAttachments(LIZIZ.LIZ(c109544Rq.getUuid()));
        C106674Gp.LJIILIIL(c109544Rq);
    }

    public static void LIZJ(C109544Rq c109544Rq, C117914jz c117914jz, C117844js c117844js, InterfaceC88472Yns interfaceC88472Yns) {
        C117844js LIZIZ = C117844js.LIZIZ(c117844js, c117914jz.LJLIL, null, null, c117914jz.LJLILLLLZI, c117914jz.LJLJI, EnumC117804jo.SYNTHESISED, 142);
        interfaceC88472Yns.invoke(LIZIZ);
        c109544Rq.setContentPB(LIZ(c117914jz.LJLILLLLZI, c117914jz.LJLJI, null).encode());
        c109544Rq.setAttachments(LIZIZ.LIZ(c109544Rq.getUuid()));
        C106674Gp.LJIILIIL(c109544Rq);
    }

    public static void LJ(C109544Rq c109544Rq, C117844js c117844js, C118004k8 c118004k8, InterfaceC41771GaN interfaceC41771GaN, C117994k7 c117994k7, InterfaceC88472Yns interfaceC88472Yns) {
        String str;
        String uuid = c109544Rq.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        C117874jv.LJIIIIZZ(interfaceC41771GaN, uuid);
        G0D g0d = c118004k8.LIZ;
        if (g0d == null || (str = (String) g0d.LJLILLLLZI) == null || str.length() == 0) {
            c109544Rq.setMsgStatus(3);
            C106674Gp.LJIILIIL(c109544Rq);
        } else {
            C78857UxB.LJJJJI(new C117754jj(c117844js, g0d, interfaceC88472Yns, c109544Rq, c117994k7, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(String sessionId, C117844js templateWrapper, boolean z, boolean z2, BaseShortVideoContext baseShortVideoContext, C117994k7 c117994k7, String str, int i) {
        String str2;
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        boolean z3 = z2;
        String str3 = str;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            baseShortVideoContext2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(templateWrapper, "templateWrapper");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = templateWrapper;
        if (!C117954k3.LIZ || !z || z3 || (str2 = templateWrapper.LIZLLL) == null || str2.length() == 0) {
            C4MW c4mw = (C4MW) C88903eI.LIZ();
            c4mw.LIZ.LIZIZ = sessionId;
            c4mw.LJFF(LIZ(templateWrapper.LJ, templateWrapper.LJFF, null));
            c4mw.LIZ.LJIIIZ = 0;
            c4mw.LIZ.LJ = ((AbstractC117924k0) c68322mC.element).LIZ(null);
            c4mw.LIZ("private_video");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z3 && baseShortVideoContext2 != null) {
                String creationId = baseShortVideoContext2.getCreationId();
                o.LJIIIIZZ(creationId, "editModel.creationId");
                linkedHashMap.put("s:media_creation_uuid", creationId);
            }
            if (str3 != null) {
                linkedHashMap.put("enter_method", str3);
                linkedHashMap.put("enter_from", "notification_page");
            }
            if (!linkedHashMap.isEmpty()) {
                c4mw.LIZ.LJII = linkedHashMap;
            }
            c4mw.LIZJ(C1GE.LJIIZILJ(new C117864ju(z3, c68322mC, baseShortVideoContext2, c117994k7), null, null, 62));
            return;
        }
        C111214Yb.LIZJ("VideoMsgSender", "fast send");
        C4MW c4mw2 = (C4MW) C88903eI.LIZ();
        c4mw2.LIZ.LIZIZ = sessionId;
        c4mw2.LJFF(LIZ(templateWrapper.LJ, templateWrapper.LJFF, templateWrapper.LIZLLL));
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("is_fast_send", "1"));
        if (str3 != null) {
            LJJLIIIIJ.put("enter_method", str3);
            LJJLIIIIJ.put("enter_from", "notification_page");
        }
        c4mw2.LIZ.LJII = LJJLIIIIJ;
        c4mw2.LIZ("private_video");
        c4mw2.LIZ.LJIIIZ = 1;
        c4mw2.LIZ.LJ = templateWrapper.LIZ(null);
        c4mw2.LJII(C1GE.LJIIZILJ(null, new AqS183S0100000_1(c117994k7, 67), new IDqS426S0100000_1(c117994k7, 11), 39));
    }
}
