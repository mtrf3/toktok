package Y;

import X.AbstractC42152GgW;
import X.C76732zl;
import X.G7X;
import androidx.lifecycle.Observer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObserverS37S0400000_7 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS37S0400000_7 aObserverS37S0400000_7, Object obj) {
        Integer it = (Integer) obj;
        C76732zl c76732zl = (C76732zl) aObserverS37S0400000_7.l0;
        o.LJIIIIZZ(it, "it");
        c76732zl.element = it.intValue();
        if (it.intValue() == 100) {
            ((TuxSheet) aObserverS37S0400000_7.l1).dismissAllowingStateLoss();
            ((G7X) aObserverS37S0400000_7.l2).LIZ((AbstractC42152GgW) aObserverS37S0400000_7.l3);
        } else {
            if (it.intValue() != 101) {
                return;
            }
            ((TuxSheet) aObserverS37S0400000_7.l1).dismissAllowingStateLoss();
            ((G7X) aObserverS37S0400000_7.l2).LIZ((AbstractC42152GgW) aObserverS37S0400000_7.l3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a2, code lost:
    
        r6 = (com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00a4, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00a6, code lost:
    
        r3 = r6.hashtag;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a8, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ae, code lost:
    
        if (ujb.o.LJJJJJL(r3) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00e6, code lost:
    
        r5.addHashTag(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00b0, code lost:
    
        r5 = new java.util.ArrayList();
        r11 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00bd, code lost:
    
        if (r11.hasNext() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bf, code lost:
    
        r9 = r11.next();
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d0, code lost:
    
        if (r6.getBusinessType() != X.EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE()) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00e0, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6.getSubtype(), X.EnumC42894GsU.VIDEO_CLIP.getType()) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00e2, code lost:
    
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00ea, code lost:
    
        r6 = X.ORZ.LLILII(new Y.IDComparatorS35S0000000_7(15), r5);
        r5 = new java.util.ArrayList();
        r12 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0102, code lost:
    
        if (r12.hasNext() == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0104, code lost:
    
        r9 = r12.next();
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0115, code lost:
    
        if (r11.getBusinessType() != X.EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE()) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0125, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r11.getSubtype(), X.EnumC42894GsU.GIF.getType()) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0127, code lost:
    
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x012b, code lost:
    
        r5 = X.ORZ.LLILII(new Y.IDComparatorS35S0000000_7(16), r5);
        r11 = new java.util.ArrayList();
        r12 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0143, code lost:
    
        if (r12.hasNext() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0145, code lost:
    
        r9 = r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0156, code lost:
    
        if (r9.getBusinessType() != X.EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE()) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0159, code lost:
    
        r11.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x015d, code lost:
    
        r2 = X.ORZ.LLILII(new Y.IDComparatorS35S0000000_7(17), r11);
        r3 = new java.util.ArrayList();
        r3.addAll(r6);
        r3.addAll(r5);
        r3.addAll(r2);
        r0.LJIILJJIL(r7, r3);
        r2 = r0.LJ().getPublishExtensionDataContainer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0181, code lost:
    
        if (r2 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0183, code lost:
    
        r2 = ((com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene) r2).LLLLJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0189, code lost:
    
        r9 = com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel.fromString(r2);
        r7 = new java.util.ArrayList();
        r12 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019a, code lost:
    
        if (r12.hasNext() == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x019c, code lost:
    
        r2 = (com.ss.android.ugc.aweme.common.AnchorTransData) r12.next();
        r18 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a8, code lost:
    
        if (r2.getCanDelete() == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0301, code lost:
    
        r20 = r2.getBusinessType();
        r21 = r2.getTitle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0309, code lost:
    
        if (r21 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x030b, code lost:
    
        r21 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x030d, code lost:
    
        r22 = r2.getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0311, code lost:
    
        if (r22 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0313, code lost:
    
        r22 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0315, code lost:
    
        r23 = r2.getLanguage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0319, code lost:
    
        if (r23 != null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x031b, code lost:
    
        r23 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x031d, code lost:
    
        r24 = r2.getAnchorContent();
        r3 = r2.getAnchorIcon();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0325, code lost:
    
        if (r3 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0327, code lost:
    
        r3 = r3.getUrlList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x032b, code lost:
    
        if (r3 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x032d, code lost:
    
        r3 = (java.lang.String) com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0333, code lost:
    
        r26 = r2.getAddTime();
        r27 = r2.getExtra();
        r30 = r2.getSubtype();
        r11 = r2.getCanDelete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x034d, code lost:
    
        if (r2.getBusinessType() == X.EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0359, code lost:
    
        if (r2.getBusinessType() != X.EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0363, code lost:
    
        r7.add(new com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo(r20, r21, r22, r23, r24, r3, r26, r27, r18, null, r30, java.lang.Boolean.valueOf(r11), false, 4608, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x035b, code lost:
    
        r18 = java.lang.String.valueOf(r2.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x037f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01b8, code lost:
    
        if (r2.getBusinessType() != X.EnumC42934Gt8.WIKIPEDIA.getTYPE()) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x024b, code lost:
    
        if (r2.getAnchorContent().length() != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x024d, code lost:
    
        r5 = new org.json.JSONObject();
        r5.put("add_from", r0.LJLIL);
        r3 = r5.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "jsonObject.toString()");
        r2.setAnchorContent(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0261, code lost:
    
        r20 = r2.getBusinessType();
        r21 = r2.getTitle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0269, code lost:
    
        if (r21 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x026b, code lost:
    
        r21 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x026d, code lost:
    
        r22 = r2.getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0271, code lost:
    
        if (r22 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0273, code lost:
    
        r22 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0275, code lost:
    
        r23 = r2.getLanguage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0279, code lost:
    
        if (r23 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x027b, code lost:
    
        r23 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x027d, code lost:
    
        r24 = r2.getAnchorContent();
        r3 = r2.getAnchorIcon();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0285, code lost:
    
        if (r3 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0287, code lost:
    
        r3 = r3.getUrlList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x028b, code lost:
    
        if (r3 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x028d, code lost:
    
        r3 = (java.lang.String) com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0293, code lost:
    
        r26 = r2.getAddTime();
        r27 = r2.getExtra();
        r30 = r2.getSubtype();
        r11 = r2.getCanDelete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02ad, code lost:
    
        if (r2.getBusinessType() == X.EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02b9, code lost:
    
        if (r2.getBusinessType() != X.EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02c3, code lost:
    
        r7.add(new com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo(r20, r21, r22, r23, r24, r3, r26, r27, r18, null, r30, java.lang.Boolean.valueOf(r11), false, 4608, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02bb, code lost:
    
        r18 = java.lang.String.valueOf(r2.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02df, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02e1, code lost:
    
        r5 = new org.json.JSONObject(r2.getAnchorContent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02ee, code lost:
    
        if (r5.has("add_from") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02f0, code lost:
    
        r5.put("add_from", r0.LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02f5, code lost:
    
        r3 = r5.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "jsonObject.toString()");
        r2.setAnchorContent(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01ba, code lost:
    
        r3 = new org.json.JSONObject().put("add_from", r0.LJLIL).toString();
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "jsonObject.toString()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01d0, code lost:
    
        r6 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(X.C27739Aud.LJFF(), r2.getAnchorContent(), X.C65330PkU.LIZJ(X.C65352Pkq.LJI(com.ss.android.ugc.aweme.commercialize.anchor.model.WikiAnchor.class)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x01e4, code lost:
    
        if ((r6 instanceof com.ss.android.ugc.aweme.commercialize.anchor.model.WikiAnchor) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01e6, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x01e7, code lost:
    
        r6 = (com.ss.android.ugc.aweme.commercialize.anchor.model.WikiAnchor) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01e9, code lost:
    
        if (r6 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x01eb, code lost:
    
        r5 = r6.lang;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01ed, code lost:
    
        if (r5 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01f3, code lost:
    
        if (r5.length() <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01f5, code lost:
    
        if (r6 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01f7, code lost:
    
        r5 = r6.lang;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01fa, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0384, code lost:
    
        r9.createAnchorInfos = r7;
        r2 = r0.LJ().getPublishExtensionDataContainer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x038e, code lost:
    
        if (r2 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0392, code lost:
    
        ((com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene) r2).w(com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel.toString(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0381, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS37S0400000_7 r33, java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS37S0400000_7.onChanged$1(Y.AObserverS37S0400000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS37S0400000_7(Object obj, C76732zl c76732zl, TuxSheet tuxSheet, G7X g7x, AbstractC42152GgW<?> abstractC42152GgW) {
        this.$t = abstractC42152GgW;
        this.l0 = obj;
        this.l1 = c76732zl;
        this.l2 = tuxSheet;
        this.l3 = g7x;
    }
}
