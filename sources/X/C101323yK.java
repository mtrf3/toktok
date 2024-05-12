package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3yK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101323yK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SystemContent systemContent) {
        SystemContent.Key[] template;
        java.util.Map<String, String> extra;
        if (systemContent == null || (template = systemContent.getTemplate()) == null || template.length == 0) {
            return;
        }
        SystemContent.Key key = template[0];
        if (SystemContent.LinkTypeExtra.isSafeWarningLink(key)) {
            C775932t.LIZ("show");
        }
        if ((key.getAction() != 3 && key.getAction() != 7) || (extra = key.getExtra()) == null) {
            return;
        }
        String str = extra.get(WM7.SCENE_SERVICE);
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("notice_type", str);
        c1hq.put("process_id", C3Y4.LIZJ);
        onEventV3.LIZIZ("show_chat_notice", c1hq);
    }

    public static void LIZJ(C109544Rq c109544Rq, SystemContent systemContent, AnonymousClass472 noticeTextView, IMUser iMUser, C99033ud c99033ud) {
        o.LJIIIZ(noticeTextView, "noticeTextView");
        LIZIZ(null, c109544Rq, systemContent, noticeTextView, iMUser, AnonymousClass636.LJIIIIZZ(R.attr.e4, EF7.LIZIZ()), -16776961, false, c99033ud);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        r1.setText(r18.getFallbackTips());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        r1 = X.C16880lQ.LLLZ("{{%s}}", java.util.Arrays.copyOf(new java.lang.Object[]{r10.getKey()}, 1));
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "format(format, *args)");
        r8 = ujb.o.LJJJJZ(r8, r1, r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        r7 = new android.text.SpannableStringBuilder(r8);
        r14 = X.C30581Hy.LJJIIJZLJL(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
    
        if (r14.hasNext() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d2, code lost:
    
        r10 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent.Key) r14.next();
        r0 = r10.getKey();
        r9 = r10.getName();
        r3 = r10.getAction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e4, code lost:
    
        if (r0 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ea, code lost:
    
        if (r0.length() != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ef, code lost:
    
        if (r9 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f5, code lost:
    
        if (r9.length() != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f8, code lost:
    
        r6 = ujb.s.LJJLIIIJL(r8, r9, 0, false, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01fd, code lost:
    
        if (r6 >= 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0200, code lost:
    
        r4 = "chat";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0206, code lost:
    
        if (r3 != 13) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0208, code lost:
    
        if (r24 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x020a, code lost:
    
        r0 = r24.getChatType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020e, code lost:
    
        r12 = X.C98583tu.LIZIZ(r0);
        r3 = X.C772831o.LIZ();
        r13 = new X.OSZ[r1];
        r13[0] = new X.OSZ("enter_from", "chat");
        r13[1] = new X.OSZ("chat_type", r12);
        r13[2] = new X.OSZ("platform", "internal");
        r13[3] = new X.OSZ(X.WM7.SCENE_SERVICE, "sensitive_content_nude_filter");
        r3.LIZIZ("show_inline_dm_option", X.C113554cx.LJJL(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029f, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024d, code lost:
    
        if (r17 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024f, code lost:
    
        r3 = java.lang.Integer.valueOf(r17.getMsgType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0257, code lost:
    
        if (r3 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028f, code lost:
    
        if (r3.intValue() != 1802) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0291, code lost:
    
        r4 = "view_picture";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x029a, code lost:
    
        if (r3.intValue() != 1803) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x029c, code lost:
    
        r4 = "view_private_video";
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0259, code lost:
    
        r1 = new X.C101253yD(r21, r20, r4, r24);
        r1.LJLJJLL = r10;
        new java.lang.ref.WeakReference(r16);
        r7.setSpan(r1, r6, r9.length() + r6, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0275, code lost:
    
        if (r23 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ec, code lost:
    
        r4 = 6;
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0277, code lost:
    
        r7.setSpan(new X.T5U(52, true), r6, r9.length() + r6, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a2, code lost:
    
        r0 = (android.widget.TextView) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a8, code lost:
    
        if (r0 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02aa, code lost:
    
        r1 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02af, code lost:
    
        if (r17 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b1, code lost:
    
        r1.putSerializable("msg", r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b6, code lost:
    
        r0 = (android.view.View) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02bc, code lost:
    
        if (r0 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02be, code lost:
    
        r1 = (android.widget.TextView) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c4, code lost:
    
        if (r1 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c6, code lost:
    
        r1 = (android.view.View) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02cc, code lost:
    
        if (r1 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ce, code lost:
    
        r1.setOnLongClickListener(X.ViewOnLongClickListenerC101333yL.LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d3, code lost:
    
        r0 = (android.widget.TextView) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02d9, code lost:
    
        if (r0 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02db, code lost:
    
        r1 = (android.view.View) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02e1, code lost:
    
        if (r1 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e4, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e9, code lost:
    
        r0.setHighlightColor(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ed, code lost:
    
        r1.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02f5, code lost:
    
        r0.setTag(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02f9, code lost:
    
        r0.setText(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x009a, code lost:
    
        if (r8.length() != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x009c, code lost:
    
        r19.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0113, code lost:
    
        r0 = (android.widget.TextView) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0119, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x011b, code lost:
    
        r0 = (android.view.View) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0121, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0123, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0124, code lost:
    
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0128, code lost:
    
        r0.setText(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x007c, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010c, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r17 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        X.C4AF.LIZ.getClass();
        r12 = X.C4AF.LIZIZ();
        kotlin.jvm.internal.o.LJIIIZ(r12, "whitelist");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r12.length != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (X.C4AF.LIZ(r18.getNewTips(), r12) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (X.C4AF.LIZ(r18.getTips(), r12) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        r10 = r18.getTemplate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r10 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        r6 = r10.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (r4 >= r6) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        r0 = r10[r4];
        r1 = X.C4AF.LIZ;
        r0 = r0.getLink();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (X.C4AF.LIZJ(r0, r12) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r10 = r18.getNewTemplate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r6 = r10.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (r4 >= r6) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        r0 = r10[r4];
        r1 = X.C4AF.LIZ;
        r0 = r0.getLink();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
    
        if (X.C4AF.LIZJ(r0, r12) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("setTips found illegal url in tip ");
        r1.append(r8);
        X.C34B.LJI("MessageViewHelper", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0091, code lost:
    
        if (r9 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0094, code lost:
    
        if (r9.length != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        r14 = X.C30581Hy.LJJIIJZLJL(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        r4 = 6;
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        if (r14.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:
    
        r10 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent.Key) r14.next();
        r6 = r10.getName();
        r0 = r10.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (r0 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014e, code lost:
    
        if (r0.length() != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        if (r6 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0157, code lost:
    
        if (r6.length() != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r11 = r10.getAction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015e, code lost:
    
        if (r11 == 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0160, code lost:
    
        if (r11 == 2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0162, code lost:
    
        if (r11 == 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0164, code lost:
    
        if (r11 == 4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0167, code lost:
    
        if (r11 == 5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0169, code lost:
    
        if (r11 == 6) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        if (r11 == 7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
    
        if (r11 == 8) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
    
        if (r11 == 9) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
    
        if (r11 == 12) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017c, code lost:
    
        if (r11 != 13) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a3, code lost:
    
        if (X.C78685UuP.LJJJZ(r18.getFallbackTips()) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        r1 = (android.widget.TextView) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ab, code lost:
    
        if (r1 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ad, code lost:
    
        r1 = (android.view.View) r15.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b3, code lost:
    
        if (r1 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b6, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C102293zt r16, X.C109544Rq r17, com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent r18, X.AnonymousClass472 r19, com.ss.android.ugc.aweme.im.service.model.IMUser r20, int r21, int r22, boolean r23, X.C99033ud r24) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101323yK.LIZIZ(X.3zt, X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent, X.472, com.ss.android.ugc.aweme.im.service.model.IMUser, int, int, boolean, X.3ud):void");
    }
}
