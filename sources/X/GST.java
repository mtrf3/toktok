package X;

import android.text.InputFilter;
import android.view.View;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GST implements InputFilter {
    public boolean LJLIL;
    public final int LJLILLLLZI;
    public final GSU LJLJI;
    public final C11S LJLJJI;
    public final boolean LJLJJL;
    public G7C LJLJJLL;
    public final int LJLJL = ((Number) C41552GSm.LIZ.getValue()).intValue();

    public static boolean LIZ() {
        C78934UyQ.LJLIL.LIZLLL().getClass();
        return AnonymousClass842.LIZ();
    }

    public final void LIZIZ(String str) {
        if (this.LJLJJL) {
            return;
        }
        C11S c11s = this.LJLJJI;
        c11s.getClass();
        if ((o.LJ(c11s.LIZJ, str) && System.currentTimeMillis() < c11s.LIZ) || str.length() <= 0) {
            return;
        }
        View view = (View) c11s.LIZIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(str);
        C78915Uy7.LJJIJ(view, 0, creativeToastBuilder);
        c11s.LIZJ = str;
        c11s.LIZ = System.currentTimeMillis() + new C26046AKc(0).LJLIL.LJ;
        G7C g7c = this.LJLJJLL;
        if (g7c == null) {
            return;
        }
        C164236cV.LIZJ(((GSU) g7c.LIZ).LJZ);
    }

    public GST(int i, GSU gsu, boolean z) {
        this.LJLILLLLZI = i;
        this.LJLJI = gsu;
        this.LJLJJI = new C11S(gsu);
        this.LJLJJL = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        r5 = r5 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f8, code lost:
    
        return r9.subSequence(r10, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a7, code lost:
    
        if (r6 != r10) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a9, code lost:
    
        LIZIZ(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ac, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ad, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e2, code lost:
    
        r3 = r12.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e8, code lost:
    
        if (r3.length != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ea, code lost:
    
        r8.LJLJI.setAddVideoChain(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ef, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00f4, code lost:
    
        if (LIZ() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00f6, code lost:
    
        r3 = r8.LJLJI.getNoAdTagText().replace("\n", "").length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0105, code lost:
    
        r3 = r8.LJLJI.getNoAdTagText().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0058, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r9.length() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r10 != r11) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8.LJLJI.LJLLI == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        return r12.subSequence(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (LIZ() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r9.toString().endsWith("\n") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        r8.LJLJI.setAddVideoChain(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        r3 = (com.ss.android.ugc.aweme.lexical.platform.span.AdSpan[]) r12.getSpans(0, r12.length(), com.ss.android.ugc.aweme.lexical.platform.span.AdSpan.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (android.text.TextUtils.isEmpty(r8.LJLJI.getAdTag()) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (LIZ() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        r3 = r12.toString().replace("\n", "").length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r5 = ((r8.LJLILLLLZI - r3) + r14) - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r8.LJLJJL == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r5 = ((r8.LJLJL - r3) + r14) - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        r3 = r8.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r3.LJLLI == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        if (r5 >= 5000) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        r5 = 5000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (r5 < (r11 - r10)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        if (r3.LJZI == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        r3.setAddChainSuccess(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        r1 = r8.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        if (r1.LL == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
    
        r1.setRepasteUrlSuccess(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        r8.LJLJI.setAddVideoChain(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (r5 > 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        if (android.text.TextUtils.isEmpty(r9) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        LIZIZ(X.C41050G9e.LIZ(r8.LJLILLLLZI));
        r8.LJLIL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
    
        r2 = r8.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        if (r2.LL == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
    
        r2.setRepasteUrlSuccess(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        r8.LJLJI.setAddVideoChain(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
    
        if (r3.LJZI == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        r3.setAddVideoChain(false);
        r7 = (android.text.Editable) r9;
        r3 = (com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan[]) r7.getSpans(0, r7.length(), com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
    
        if (r3 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014b, code lost:
    
        if (r3.length <= 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014d, code lost:
    
        r7.removeSpan(r3[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
    
        r3 = (X.C8FD[]) r7.getSpans(0, r7.length(), X.C8FD.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        if (r3 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
    
        if (r3.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
    
        r7.removeSpan(r3[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        r3 = (android.text.style.StyleSpan[]) r7.getSpans(0, r7.length(), android.text.style.StyleSpan.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
    
        if (r3 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (r3.length <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
    
        r7.removeSpan(r3[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017e, code lost:
    
        r3 = r8.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0182, code lost:
    
        if (r3.LL == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0184, code lost:
    
        r3.setRepasteUrlSuccess(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0187, code lost:
    
        r5 = r5 + r10;
        r7 = X.C41050G9e.LIZ(r8.LJLILLLLZI);
        r8.LJLIL = true;
        java.util.Objects.requireNonNull(r9);
        r6 = r5 - 1;
        r0 = r9.charAt(r6);
        r3 = java.lang.Character.getType(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a1, code lost:
    
        if (java.lang.Character.isHighSurrogate(r0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
    
        if (r3 != 28) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ae, code lost:
    
        LIZIZ(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
    
        if (LIZ() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b7, code lost:
    
        r0 = r9.subSequence(r10, r5).toString();
        r0.toString();
        r6 = r0.length() - r0.replace("\n", "").length();
        r3 = r9.subSequence(r5, r9.length()).toString();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
    
        if (r4 >= r3.length()) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e2, code lost:
    
        if (r6 <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ea, code lost:
    
        if (r3.charAt(r4) == '\n') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ec, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ee, code lost:
    
        r2 = r2 + 1;
        r4 = r4 + 1;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r9, int r10, int r11, android.text.Spanned r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GST.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
