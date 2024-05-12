package X;

import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.api.network.UniversalPopupApi;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.Eck, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36822Eck implements InterfaceC36824Ecm {
    public boolean LIZ;
    public UniversalPopupApi LIZIZ;

    @Override // X.InterfaceC36824Ecm
    public final C10K<UniversalPopupResponse> LIZ(int i) {
        String str;
        UniversalPopupApi universalPopupApi = this.LIZIZ;
        if (universalPopupApi != null) {
            if (!this.LIZ) {
                str = "/aweme/v1";
            } else {
                str = "/tiktok/v1/kids";
            }
            C10K LJ = universalPopupApi.getUniversalPopup(str, i).LJ(new C10I() { // from class: X.8GH
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0289, code lost:
                
                    r34 = r5.booleanValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x0292, code lost:
                
                    X.C47261Igj.LJJJJJ();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0296, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
                
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
                
                    r11.add(new com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup(r18, r19, r20, r21, r22, r13, r24, "", r2, r12.isSubPopUp(), r12.getFirstButtonHighlight(), null, 2048, null));
                    r3 = true;
                    r1 = 10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x01db, code lost:
                
                    r18 = r12.getBusiness();
                    r19 = r12.getPolicyVersion();
                    r20 = r12.getStyle();
                    r21 = r12.getTitle();
                    r22 = r12.getBody();
                    r24 = r12.getIcon_url();
                    r3 = r12.getPolicyLinkList();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x01f9, code lost:
                
                    if (r3 != null) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x021c, code lost:
                
                    r2 = new java.util.ArrayList(X.C32I.LJJL(r3, r1));
                    r7 = r3.iterator();
                    r5 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x022e, code lost:
                
                    if (r7.hasNext() == false) goto L112;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x0230, code lost:
                
                    r1 = r7.next();
                    r6 = r5 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x0236, code lost:
                
                    if (r5 < 0) goto L108;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x0238, code lost:
                
                    r1 = r1;
                    r4 = r1.getName();
                    r27 = java.lang.String.valueOf(r5 + r14);
                    r28 = r1.getLink();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
                
                    if (r28 != null) goto L89;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
                
                    r28 = "";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x024d, code lost:
                
                    r29 = X.C8GI.LINK_TYPE_INTERNAL.getValue();
                    r5 = r1.getApprove();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x0257, code lost:
                
                    if (r5 != null) goto L97;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x0259, code lost:
                
                    r34 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x025b, code lost:
                
                    r5 = r1.getOperation();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
                
                    if (r5 != null) goto L96;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x0261, code lost:
                
                    r31 = -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0263, code lost:
                
                    r2.add(new com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupBodyLinkList(r4, new com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction(r27, r28, r29, r1.getExtra(), r31, r1.getDismiss(), null, r34, null, null, 832, null)));
                    r5 = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x0284, code lost:
                
                    r31 = r5.intValue();
                 */
                @Override // X.C10I
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object then(X.C10K r40) {
                    /*
                        Method dump skipped, instructions count: 697
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C8GH.then(X.10K):java.lang.Object");
                }
            }, PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("UniversalPopupDefaultLoader")), null);
            o.LJIIIIZZ(LJ, "sApi.getUniversalPopup(a…rs.newCachedThreadPool())");
            return LJ;
        }
        o.LJIJI("sApi");
        throw null;
    }

    @Override // X.InterfaceC36824Ecm
    public final C10K LIZIZ(int i, String business, java.util.Map map) {
        String str;
        Integer LJJIL;
        o.LJIIIZ(business, "business");
        UniversalPopupApi universalPopupApi = this.LIZIZ;
        if (universalPopupApi != null) {
            if (!this.LIZ) {
                str = "/aweme/v1";
            } else {
                str = "/tiktok/v1/kids";
            }
            Integer valueOf = Integer.valueOf(i);
            String str2 = (String) map.get("policy_version");
            String str3 = (String) map.get("style");
            String str4 = (String) map.get("extra");
            String str5 = (String) map.get("operation");
            if (str5 == null) {
                LJJIL = null;
            } else {
                LJJIL = C38350F3i.LJJIL(str5);
            }
            C10K<TContinuationResult> LJ = universalPopupApi.universalPopupApprove(str, business, valueOf, str2, str3, str4, LJJIL).LJ(new EU1(1), PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("UniversalPopupDefaultLoader")), null);
            o.LJIIIIZZ(LJ, "sApi.universalPopupAppro…rs.newCachedThreadPool())");
            return LJ;
        }
        o.LJIJI("sApi");
        throw null;
    }
}
