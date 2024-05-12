package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.7aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188687aq {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (r9 > (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r3 = r10.getDesc()
            java.lang.String r0 = "originDesc"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            int r0 = r3.length()
            r7 = 1
            if (r0 != 0) goto L18
            java.lang.String r0 = ""
            return r0
        L18:
            java.util.List r0 = r10.getTextExtra()
            if (r0 == 0) goto L50
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r0 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r0
            int r0 = r0.getType()
            if (r0 != r7) goto L27
            r4.add(r1)
            goto L27
        L3e:
            Y.IDComparatorS31S0000000_3 r1 = new Y.IDComparatorS31S0000000_3
            r0 = 0
            r1.<init>(r0)
            java.util.List r8 = X.ORZ.LLILII(r1, r4)
            if (r8 == 0) goto L50
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L51
        L50:
            return r3
        L51:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r6 = r8.size()
            r10 = 0
            r9 = 0
        L5c:
            if (r10 >= r6) goto Le2
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r10)
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r2
            int r5 = r10 + 1
            int r0 = r8.size()
            if (r5 >= r0) goto L7f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r5)
            com.ss.android.ugc.aweme.model.TextExtraStruct r0 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r0
            int r1 = r0.getEnd()
            int r0 = r2.getStart()
            int r0 = r0 - r7
            if (r1 != r0) goto L7f
        L7d:
            r10 = r5
            goto L5c
        L7f:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r9)
            com.ss.android.ugc.aweme.model.TextExtraStruct r0 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r0
            int r1 = r0.getEnd()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r10)
            com.ss.android.ugc.aweme.model.TextExtraStruct r0 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r0
            int r9 = r0.getStart()
            int r0 = r4.length()
            int r1 = java.lang.Math.min(r1, r0)
            int r0 = r4.length()
            java.lang.String r1 = r4.substring(r1, r0)
            java.lang.String r0 = "descBuilder.substring(\n ….length\n                )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.CharSequence r0 = ujb.s.LJZI(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto Le2
            if (r9 <= r7) goto Ld1
            int r0 = r4.length()
            if (r0 < r9) goto Ld4
            int r2 = r9 + (-1)
            char r1 = r4.charAt(r2)
            r0 = 35
            if (r1 != r0) goto Ld4
            int r0 = r4.length()
            r4.delete(r2, r0)
        Lcf:
            r9 = r5
            goto L7d
        Ld1:
            r0 = -1
            if (r9 <= r0) goto Lcf
        Ld4:
            int r0 = r4.length()
            if (r9 >= r0) goto Lcf
            int r0 = r4.length()
            r4.delete(r9, r0)
            goto Lcf
        Le2:
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "descBuilder.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.CharSequence r0 = ujb.s.LJZI(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto Lfa
        Lf9:
            return r3
        Lfa:
            java.lang.String r3 = r4.toString()
            java.lang.String r0 = "{\n            descBuilder.toString()\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            goto Lf9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188687aq.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static UrlModel LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        Video video = aweme.getVideo();
        if (video != null) {
            UrlModel cover = aweme.getVideo().getCover();
            if (cover == null || cover.getUrlList() == null || cover.getUrlList().isEmpty()) {
                UrlModel aiCover = aweme.getVideo().getAiCover();
                if (aiCover == null || aiCover.getUrlList() == null || aiCover.getUrlList().isEmpty()) {
                    return video.getOriginCover();
                }
                return video.getAiCover();
            }
            return video.getCover();
        }
        return null;
    }
}
