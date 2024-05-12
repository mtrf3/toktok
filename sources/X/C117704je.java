package X;

import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContentExtra;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117704je {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(C109544Rq c109544Rq, InterfaceC41771GaN interfaceC41771GaN, C117994k7 c117994k7) {
        String uuid = c109544Rq.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        C117874jv.LJIIIIZZ(interfaceC41771GaN, uuid);
        c109544Rq.setMsgStatus(3);
        C106674Gp.LJIILIIL(c109544Rq);
        C117984k6.LIZ(false, c117994k7);
    }

    public static PictureCardTemplate LIZ(String str, String str2, Integer num, Integer num2) {
        int i;
        int i2;
        String str3 = str;
        String str4 = str2;
        if (str4 == null) {
            str4 = "";
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        if (str3 == null) {
            str3 = "";
        }
        return new PictureCardTemplate(new ImageComponent(C61878OQg.INSTANCE, str3, new ResolutionComponent(i, i2), str4, (IconTypeComponent) null, 36), C87277YNd.LJIILJJIL(R.string.emj), new BaseRequestComponent(new QueryDataComponent(str3, C113554cx.LJJLIIIIJ(new OSZ("decrypt_key", str4), new OSZ("image_width", String.valueOf(i)), new OSZ("image_height", String.valueOf(i2))))), 78);
    }

    public static void LIZIZ(C109544Rq c109544Rq, String str, C117814jp c117814jp, InterfaceC88472Yns interfaceC88472Yns) {
        C117814jp LIZIZ = C117814jp.LIZIZ(c117814jp, str, 0, 0, null, null, null, 126);
        interfaceC88472Yns.invoke(LIZIZ);
        c109544Rq.setAttachments(LIZIZ.LIZ(c109544Rq.getUuid()));
        C106674Gp.LJIILIIL(c109544Rq);
    }

    public static void LIZJ(C109544Rq c109544Rq, C117914jz c117914jz, C117814jp c117814jp, InterfaceC88472Yns interfaceC88472Yns) {
        C117814jp LIZIZ = C117814jp.LIZIZ(c117814jp, c117914jz.LJLIL, c117914jz.LJLILLLLZI, c117914jz.LJLJI, null, null, EnumC117804jo.SYNTHESISED, 50);
        interfaceC88472Yns.invoke(LIZIZ);
        c109544Rq.setContentPB(LIZ(null, null, Integer.valueOf(c117914jz.LJLILLLLZI), Integer.valueOf(c117914jz.LJLJI)).encode());
        c109544Rq.setAttachments(LIZIZ.LIZ(c109544Rq.getUuid()));
        C106674Gp.LJIILIIL(c109544Rq);
    }

    public static void LJ(C109544Rq c109544Rq, C117814jp c117814jp, C118004k8 c118004k8, InterfaceC41771GaN interfaceC41771GaN, C117994k7 c117994k7, InterfaceC88472Yns interfaceC88472Yns) {
        String str;
        int i;
        int i2;
        DMEncryptedImageContent dMEncryptedImageContent;
        DMEncryptedImageContentExtra extra;
        DMEncryptedImageContent dMEncryptedImageContent2;
        DMEncryptedImageContentExtra extra2;
        DMEncryptedImageContent dMEncryptedImageContent3;
        String uuid = c109544Rq.getUuid();
        o.LJIIIIZZ(uuid, "msg.uuid");
        C117874jv.LJIIIIZZ(interfaceC41771GaN, uuid);
        H4F h4f = c118004k8.LIZIZ;
        if (h4f != null && (dMEncryptedImageContent3 = (DMEncryptedImageContent) h4f.LIZIZ) != null) {
            str = dMEncryptedImageContent3.getUri();
        } else {
            str = null;
        }
        C76732zl c76732zl = new C76732zl();
        if (h4f != null && (dMEncryptedImageContent2 = (DMEncryptedImageContent) h4f.LIZIZ) != null && (extra2 = dMEncryptedImageContent2.getExtra()) != null) {
            i = extra2.getWidth();
        } else {
            i = c117814jp.LIZJ;
        }
        c76732zl.element = i;
        C76732zl c76732zl2 = new C76732zl();
        if (h4f != null && (dMEncryptedImageContent = (DMEncryptedImageContent) h4f.LIZIZ) != null && (extra = dMEncryptedImageContent.getExtra()) != null) {
            i2 = extra.getHeight();
        } else {
            i2 = c117814jp.LIZLLL;
        }
        c76732zl2.element = i2;
        if (c76732zl.element <= 0 || i2 <= 0) {
            c76732zl.element = c117814jp.LIZJ;
            c76732zl2.element = c117814jp.LIZLLL;
        }
        if (h4f == null || str == null || str.length() == 0) {
            c109544Rq.setMsgStatus(3);
            C106674Gp.LJIILIIL(c109544Rq);
        } else {
            C78857UxB.LJJJJI(new C117734jh(c117814jp, h4f, c76732zl, c76732zl2, interfaceC88472Yns, c109544Rq, c117994k7, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(String sessionId, C117814jp templateWrapper, boolean z, boolean z2, BaseShortVideoContext baseShortVideoContext, C117994k7 c117994k7, String str, int i) {
        String str2 = str;
        boolean z3 = z2;
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
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
            str2 = null;
        }
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(templateWrapper, "templateWrapper");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = templateWrapper;
        if (C117954k3.LIZ && z && !z3 && C78685UuP.LJJJZ(templateWrapper.LJFF)) {
            C111214Yb.LIZJ("PhotoMsgSender", "fast send");
            C4MW c4mw = (C4MW) C88903eI.LIZ();
            c4mw.LIZ.LIZIZ = sessionId;
            c4mw.LJFF(LIZ(templateWrapper.LJFF, templateWrapper.LJ, Integer.valueOf(templateWrapper.LIZJ), Integer.valueOf(templateWrapper.LIZLLL)));
            java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("is_fast_send", "1"));
            if (str2 != null) {
                LJJLIIIIJ.put("enter_from", "notification_page");
                LJJLIIIIJ.put("enter_method", str2);
            }
            C4MX c4mx = c4mw.LIZ;
            c4mx.LJII = LJJLIIIIJ;
            c4mx.LJIIIZ = 1;
            c4mw.LIZ.LJ = templateWrapper.LIZ(null);
            c4mw.LIZ("private_image");
            c4mw.LJII(C1GE.LJIIZILJ(null, new AqS183S0100000_1(c117994k7, 66), new IDqS426S0100000_1(c117994k7, 10), 39));
            return;
        }
        C4MW c4mw2 = (C4MW) C88903eI.LIZ();
        c4mw2.LIZ.LIZIZ = sessionId;
        c4mw2.LJFF(LIZ("", "", Integer.valueOf(((C117814jp) c68322mC.element).LIZJ), Integer.valueOf(((C117814jp) c68322mC.element).LIZLLL)));
        c4mw2.LIZ.LJIIIZ = 0;
        c4mw2.LIZ.LJ = templateWrapper.LIZ(null);
        c4mw2.LIZ("private_image");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z3 && baseShortVideoContext2 != null) {
            String creationId = baseShortVideoContext2.getCreationId();
            o.LJIIIIZZ(creationId, "editModel.creationId");
            linkedHashMap.put("s:media_creation_uuid", creationId);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_from", "notification_page");
            linkedHashMap.put("enter_method", str2);
        }
        c4mw2.LIZ.LJII = linkedHashMap;
        c4mw2.LIZJ(C1GE.LJIIZILJ(new C117854jt(z3, templateWrapper, baseShortVideoContext2, c68322mC, c117994k7), null, null, 62));
    }
}
