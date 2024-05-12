package com.ss.android.ugc.aweme.topic.book.recommend;

import X.AbstractC13940gg;
import X.C13930gf;
import X.C184817Nd;
import X.C184867Ni;
import X.C1DI;
import X.C7OG;
import X.C7PV;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookRecommendSearchCell extends PowerCell<C184817Nd> {
    public C184867Ni LJLIL;
    public TopicRecommendListVM LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        C7OG.LIZJ(C7PV.BOOK, this.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AbstractC13940gg(this) { // from class: X.7Ne
            public InterfaceC65784Pro<String> LJ;
            public final float LJFF = 0.001f;
            public final C184837Nf LJI;

            @Override // X.AbstractC13940gg
            public final boolean LJI() {
                return false;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC19530ph LJ() {
                return this.LJI;
            }

            @Override // X.AbstractC13940gg
            public final float LJIIIZ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.7Nf] */
            {
                this.LJ = new AqS153S0100000_3(this, 1067);
                this.LJI = new InterfaceC19530ph() { // from class: X.7Nf
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        boolean z;
                        String str;
                        TopicRawInfo topicRawInfo;
                        TopicRawInfo topicRawInfo2;
                        C188727au c188727au;
                        o.LJIIIZ(itemID, "itemID");
                        C184817Nd item = BookRecommendSearchCell.this.getItem();
                        if (item != null) {
                            z = o.LJ(item.LJLJJI, Boolean.FALSE);
                        } else {
                            z = false;
                        }
                        String str2 = null;
                        r2 = null;
                        java.util.Map<String, String> map = null;
                        str2 = null;
                        if (z) {
                            C184817Nd item2 = BookRecommendSearchCell.this.getItem();
                            if (item2 != null && (c188727au = item2.LJLJI) != null) {
                                map = c188727au.LIZ;
                            }
                            FMX.LJIIL("trending_words_show", map);
                            return;
                        }
                        C184817Nd item3 = BookRecommendSearchCell.this.getItem();
                        if (item3 != null && (topicRawInfo2 = item3.LJLIL) != null) {
                            str = topicRawInfo2.id;
                        } else {
                            str = null;
                        }
                        C184817Nd item4 = BookRecommendSearchCell.this.getItem();
                        if (item4 != null && (topicRawInfo = item4.LJLIL) != null) {
                            str2 = topicRawInfo.title;
                        }
                        C184847Ng.LIZJ("topic_recommend_page", str, str2);
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (kotlin.jvm.internal.o.LJ(X.C7OG.LIZIZ(r4, r0), java.lang.Boolean.TRUE) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        r1 = com.zhiliaoapp.musically.R.raw.icon_bookmark_fill;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0196, code lost:
    
        r1 = com.zhiliaoapp.musically.R.raw.icon_bookmark;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0192, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3.isCollected, java.lang.Boolean.TRUE) != false) goto L32;
     */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.7Ni, X.7OJ] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C184817Nd r13) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.csk, viewGroup, false, "from(parent.context)\n   …info_item, parent, false)");
    }
}
