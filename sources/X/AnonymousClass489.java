package X;

import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.489, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass489 {
    public static boolean LIZJ;
    public static final AnonymousClass489 LIZ = new AnonymousClass489();
    public static final C64962gm LIZIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
    public static final java.util.Map<Long, List<C109544Rq>> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<Long, String> LJ = new LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r0 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r2.put("type", r3);
        r2.put("content", r1);
        r2.put("fallback_info", java.lang.String.valueOf(r5.fallbackInfo.image.iconType.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.lang.String r4, com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate r5) {
        /*
            if (r5 == 0) goto L91
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = ""
            if (r4 != 0) goto Lc
            r4 = r3
        Lc:
            java.lang.String r0 = "scene"
            r2.put(r0, r4)
            com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r0 = r5.baseVideoComponent
            if (r0 == 0) goto L19
            java.lang.String r1 = r0.id
            if (r1 != 0) goto L1a
        L19:
            r1 = r3
        L1a:
            java.lang.String r0 = "aid"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r5.LLZLL()
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent r0 = r0.quotePreviewType
            if (r0 == 0) goto L8f
            int r0 = r0.getValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L31:
            com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent r0 = com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent.PICTURE
            int r1 = r0.getValue()
            if (r4 != 0) goto L70
        L39:
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r5.LLZLL()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.quotePreviewText
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.text
            if (r1 != 0) goto L48
        L47:
            r1 = r3
        L48:
            if (r4 == 0) goto L50
        L4a:
            java.lang.String r0 = r4.toString()
            if (r0 != 0) goto L6e
        L50:
            java.lang.String r0 = "type"
            r2.put(r0, r3)
            java.lang.String r0 = "content"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r0 = r5.fallbackInfo
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.image
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r0 = r0.iconType
            int r0 = r0.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fallback_info"
            r2.put(r0, r1)
        L6d:
            return r2
        L6e:
            r3 = r0
            goto L50
        L70:
            int r0 = r4.intValue()
            if (r0 != r1) goto L39
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r5.LLZLL()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent r0 = r0.quotePicturePreview
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.previewImage
            if (r0 == 0) goto L47
            java.util.List<java.lang.String> r0 = r0.urls
            if (r0 == 0) goto L47
            java.lang.Object r1 = X.ORZ.LJLLLL(r0)
            if (r1 != 0) goto L4a
            goto L47
        L8f:
            r4 = 0
            goto L31
        L91:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass489.LIZ(java.lang.String, com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate):java.util.Map");
    }

    public static void LIZIZ(C109544Rq c109544Rq, List list) {
        if (c109544Rq != null) {
            if (!c109544Rq.isDeleted()) {
                AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C78963Uyt.LJJJ(c109544Rq);
                if (awemeCardTemplate != null) {
                    AnonymousClass489 anonymousClass489 = LIZ;
                    String scene = c109544Rq.getScene();
                    anonymousClass489.getClass();
                    LIZLLL(list, scene, awemeCardTemplate);
                    return;
                }
                return;
            }
            AnonymousClass489 anonymousClass4892 = LIZ;
            String scene2 = c109544Rq.getScene();
            anonymousClass4892.getClass();
            LIZLLL(list, scene2, null);
            return;
        }
        LIZLLL(list, null, null);
    }

    public static void LIZLLL(List list, String str, AwemeCardTemplate awemeCardTemplate) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C109544Rq LIZJ2 = LIZ.LIZJ((C109544Rq) it.next(), str, awemeCardTemplate);
            if (LIZJ2 != null) {
                arrayList.add(LIZJ2);
            }
        }
        if (!arrayList.isEmpty()) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LIZIZ.LIZIZ(arrayList, true);
        }
    }

    public final synchronized C109544Rq LIZJ(C109544Rq c109544Rq, String str, AwemeCardTemplate awemeCardTemplate) {
        C109544Rq m16clone = c109544Rq.m16clone();
        m16clone.setLocalExt(new HashMap(c109544Rq.getLocalExt()));
        String quotedPreviewString = C63682Oz0.LIZ(LIZ(str, awemeCardTemplate));
        if (!o.LJ(c109544Rq.getLocalExt().get("quoted_preview"), quotedPreviewString)) {
            m16clone.addLocalExt("quoted_preview", quotedPreviewString);
            java.util.Map<Long, String> map = LJ;
            Long valueOf = Long.valueOf(m16clone.getMsgId());
            o.LJIIIIZZ(quotedPreviewString, "quotedPreviewString");
            map.put(valueOf, quotedPreviewString);
            return m16clone;
        }
        return null;
    }
}
