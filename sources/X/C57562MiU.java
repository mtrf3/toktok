package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.MiU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57562MiU extends C62415OeZ {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ String LIZIZ;

    public C57562MiU(String str, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        ShareExtServiceImpl.LJJLIIJ().LJIIJ(this.LIZ);
        if (C59522Vg.LIZ()) {
            String str = this.LIZIZ;
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C70592pr(context, str, null), 2);
                return;
            }
            return;
        }
        C77266UUc.LIZIZ.LJFF(context, this.LIZIZ, 0, "download");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c5, code lost:
    
        r4.LJI("is_multi_content", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        r2 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015e, code lost:
    
        if (r6 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        r4.LJIIIZ(r1, r0);
        r7 = r14.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r7 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r2 = r5.LJII(r14.LIZ, r4);
        X.C222578oP.LIZJ(r2, r14.LIZ, null, null, 14);
        X.C78596Usy.LJII(r14.LIZ, r2);
        X.FMX.LJIIL("share_video", ((X.C188727au) r2).LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r7.getContentOriginalType() == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r1 = r7.getContentOriginalType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
    
        if (r1 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0197, code lost:
    
        if (r1 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019a, code lost:
    
        if (r1 == 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019c, code lost:
    
        r4.LJI("is_original", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e7, code lost:
    
        r8 = "2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ea, code lost:
    
        r8 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ec, code lost:
    
        r8 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a1, code lost:
    
        r0 = r7.getShootTabName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a5, code lost:
    
        if (r0 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r0.length() != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01db, code lost:
    
        if (r7.getContentOriginalType() != 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
    
        r4.LJI("shoot_tab_name", r7.getShootTabName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b1, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b7, code lost:
    
        if (r0.length() != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        r4.LJI("publish_content_type", r7.getContentType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bd, code lost:
    
        if (r7.getContentSizeType() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c3, code lost:
    
        if (r7.getContentSizeType() != 2) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC62225ObV r15, boolean r16, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r17, android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57562MiU.LIZ(X.ObV, boolean, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, android.content.Context):void");
    }
}
