package X;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GrH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42819GrH extends AbstractC42815GrD {
    public final C62822Ol8 LIZJ;
    public RecyclerView LIZLLL;
    public Drawable LJ;
    public final C62822Ol8 LJFF;
    public C113524cu LJI;
    public final C73411SrX LJII;
    public final C62822Ol8 LJIIIIZZ;

    public final C42829GrR LIZ() {
        return (C42829GrR) this.LJIIIIZZ.getValue();
    }

    public final void LJ() {
        C113524cu c113524cu = this.LJI;
        if (c113524cu != null) {
            c113524cu.LJIIIZ();
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LIZJ.getValue();
        if (appCompatTextView != null) {
            appCompatTextView.setCompoundDrawablePadding(((Number) this.LJFF.getValue()).intValue());
            appCompatTextView.setCompoundDrawables(this.LJ, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C42819GrH(X.C42800Gqy r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42819GrH.<init>(X.Gqy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r7.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse r9) {
        /*
            r8 = this;
            r8.LJ()
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r9.items
            int r1 = r0.size()
            r0 = 2
            if (r1 > r0) goto Ld
            return
        Ld:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.Gqy r0 = r8.LIZ
            java.util.List<java.lang.String> r0 = r0.LIZLLL
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
        L1e:
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r9.items
            r4.addAll(r0)
        L23:
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = X.C162496Zh.LJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L99
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r4.iterator()
        L38:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r5 = r6.next()
            r4 = r5
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag r4 = (com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag) r4
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = X.C162496Zh.LJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L4d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag r0 = (com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag) r0
            java.lang.String r1 = r0.getChallengeName()
            java.lang.String r0 = r4.getChallengeName()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4d
            if (r2 != 0) goto L38
        L6a:
            r7.add(r5)
            goto L38
        L6e:
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r9.items
            java.util.Iterator r3 = r0.iterator()
        L74:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag r2 = (com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag) r2
            X.Gqy r0 = r8.LIZ
            java.util.List<java.lang.String> r1 = r0.LIZLLL
            java.lang.String r0 = r2.getChallengeName()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L74
            r4.add(r2)
            goto L74
        L92:
            boolean r0 = X.C65777Prh.LJI(r7)
            if (r0 == 0) goto Lb6
            r4 = r7
        L99:
            X.GrR r1 = r8.LIZ()
            java.lang.String r0 = r9.logId
            if (r0 != 0) goto Lb3
            r1.getClass()
        La4:
            X.GrR r0 = r8.LIZ()
            r0.setData(r4)
            X.GrR r0 = r8.LIZ()
            r0.notifyDataSetChanged()
            return
        Lb3:
            r1.LJLLLL = r0
            goto La4
        Lb6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42819GrH.LIZJ(com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse):void");
    }

    public final void LIZLLL(boolean z) {
        int i;
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            if (z && LIZ().getItemCount() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            recyclerView.setVisibility(i);
            return;
        }
        o.LJIJI("horizontalHashTagList");
        throw null;
    }

    public final void LIZIZ(int i, List<RecommendHashtag> list) {
        String str;
        Object next;
        C76W c76w = new C76W();
        c76w.LIZ("result_type", String.valueOf(i));
        String str2 = this.LIZ.LIZJ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c76w.LIZ("creation_id", str2);
        if (list == null || (str = Integer.valueOf(list.size()).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c76w.LIZ("hashtag_count", str);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<RecommendHashtag> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getChallengeName());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                while (it2.hasNext()) {
                    next = C00F.LIZIZ((String) next, ',', (String) it2.next());
                }
            }
            String str4 = (String) next;
            if (str4 != null) {
                str3 = str4;
            }
        }
        c76w.LIZ("hashtag_list", str3);
        FMX.LJIILJJIL("fetch_recommend_hashtag_result", c76w.LIZIZ());
    }
}
