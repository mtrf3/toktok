package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenterImplKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$initAdapter$layoutManager$1;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS97S0300000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JVd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49265JVd extends JVP {
    public final RecyclerView LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final InterfaceC49279JVr LLII;
    public final C62822Ol8 LLIIII;

    public final C49825Jgz LLIIIL() {
        return (C49825Jgz) this.LLI.getValue();
    }

    @Override // X.JVP
    public final int LLF(int i) {
        InterfaceC49264JVc interfaceC49264JVc = (InterfaceC49264JVc) ((HashMap) this.LLIIII.getValue()).get(Integer.valueOf(i));
        if (interfaceC49264JVc != null) {
            return interfaceC49264JVc.LIZJ();
        }
        return -1;
    }

    @Override // X.JVP, X.C4II
    public final int getBasicItemViewType(int i) {
        InterfaceC49871Jhj interfaceC49871Jhj;
        InterfaceC49871Jhj interfaceC49871Jhj2;
        Object obj;
        Integer valueOf;
        InterfaceC49285JVx interfaceC49285JVx;
        List<T> list = this.mmItems;
        if (list != 0 && (interfaceC49871Jhj = (SearchMixFeed) ORZ.LJLLLLLL(i, list)) != null) {
            C65776Prg LIZ = C65352Pkq.LIZ(InterfaceC49871Jhj.class);
            if ((interfaceC49871Jhj instanceof InterfaceC49285JVx) && (interfaceC49285JVx = (InterfaceC49285JVx) interfaceC49871Jhj) != null) {
                interfaceC49871Jhj2 = interfaceC49285JVx.LIZIZ();
            } else {
                interfaceC49871Jhj2 = null;
            }
            InterfaceC49871Jhj interfaceC49871Jhj3 = (InterfaceC49871Jhj) T2R.LJIL(interfaceC49871Jhj2, LIZ);
            if (interfaceC49871Jhj3 != null) {
                interfaceC49871Jhj = interfaceC49871Jhj3;
            }
            Iterator it = ((List) this.LLIFFJFJJ.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((InterfaceC49264JVc) obj).LJJLIL(interfaceC49871Jhj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC49264JVc interfaceC49264JVc = (InterfaceC49264JVc) obj;
            if (interfaceC49264JVc != null && (valueOf = Integer.valueOf(interfaceC49264JVc.LIZ())) != null) {
                return valueOf.intValue();
            }
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.JVP, X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof SearchCardViewHolder) {
            ((SearchCardViewHolder) holder).LJJJJIZL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JVP, X.JWN
    public final void LJIJJ(RecyclerView.ViewHolder holder, int i) {
        InterfaceC49871Jhj c49274JVm;
        SearchMixFeed searchMixFeed;
        InterfaceC49285JVx interfaceC49285JVx;
        o.LJIIIZ(holder, "holder");
        super.LJIJJ(holder, i);
        if (holder instanceof SearchCardViewHolder) {
            List<T> list = this.mmItems;
            InterfaceC49871Jhj interfaceC49871Jhj = null;
            if (list != 0 && (searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i, list)) != 0) {
                C65776Prg LIZ = C65352Pkq.LIZ(InterfaceC49871Jhj.class);
                if ((searchMixFeed instanceof InterfaceC49285JVx) && (interfaceC49285JVx = (InterfaceC49285JVx) searchMixFeed) != null) {
                    interfaceC49871Jhj = interfaceC49285JVx.LIZIZ();
                }
                c49274JVm = (InterfaceC49871Jhj) T2R.LJIL(interfaceC49871Jhj, LIZ);
                if (c49274JVm == null) {
                    c49274JVm = searchMixFeed;
                }
                InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ((InterfaceC55100Ljs) holder);
                JQA LLIFFJFJJ = LLIFFJFJJ(i, searchMixFeed);
                View view = holder.itemView;
                o.LJIIIIZZ(view, "holder.itemView");
                ISearchContextAbility LJJJJJ = C17N.LJJJJJ(view);
                if (LJJJJJ != null) {
                    String str = LLIFFJFJJ.LJFF;
                    LJJJJJ.j4(new C49584Jd6(LLIFFJFJJ.LJIIIIZZ, 0, str, Integer.valueOf(LLIFFJFJJ.LJIIL), Boolean.TRUE, searchMixFeed.providerDocIdStr));
                }
                if (LJIJ != null) {
                    C55247LmF.LIZIZ(LJIJ, new JNM(LLIFFJFJJ), JNM.class, "source_default_key");
                }
            } else {
                c49274JVm = new C49274JVm();
            }
            ((SearchCardViewHolder) holder).L(i, c49274JVm);
        }
    }

    @Override // X.JVP, X.JWN
    public final RecyclerView.ViewHolder LJJJJL(int i, ViewGroup parent) {
        SearchCardViewHolder LIZIZ;
        o.LJIIIZ(parent, "parent");
        InterfaceC49264JVc interfaceC49264JVc = (InterfaceC49264JVc) ((HashMap) this.LLIIII.getValue()).get(Integer.valueOf(i));
        if (interfaceC49264JVc == null || (LIZIZ = interfaceC49264JVc.LIZIZ(parent)) == null) {
            return super.LJJJJL(i, parent);
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r1 >= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        if (r3 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLIIIZ(int r9, X.InterfaceC49871Jhj r10) {
        /*
            r8 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.util.List<T> r0 = r8.mmItems
            if (r0 == 0) goto L11
            if (r9 < 0) goto L11
            int r0 = r0.size()
            if (r9 <= r0) goto L13
        L11:
            r0 = 0
            return r0
        L13:
            java.util.List<T> r1 = r8.mmItems
            r7 = 0
            if (r1 == 0) goto Lcd
            int r0 = r9 + (-1)
            java.lang.Object r5 = X.ORZ.LJLLLLLL(r0, r1)
        L1e:
            java.util.List<T> r0 = r8.mmItems
            if (r0 == 0) goto Lca
            java.lang.Object r4 = X.ORZ.LJLLLLLL(r9, r0)
        L26:
            X.JVo r2 = new X.JVo
            r2.<init>(r10)
            java.util.List<T> r0 = r8.mmItems
            if (r0 == 0) goto L32
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r0, r9, r2)
        L32:
            r6 = 1
            if (r5 == 0) goto Lb1
            X.Jgz r0 = r8.LLIIIL()
            if (r0 == 0) goto Lc8
            java.util.List r0 = r0.getItems()
            if (r0 == 0) goto Lc8
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L4b:
            X.Jgz r0 = r8.LLIIIL()
            if (r0 == 0) goto L60
            java.util.List r1 = r0.getItems()
            if (r1 == 0) goto L60
            if (r3 == 0) goto Laf
            int r0 = r3.intValue()
        L5d:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, r0, r2)
        L60:
            X.Jgz r0 = r8.LLIIIL()
            if (r0 == 0) goto Lad
            X.Jf5 r3 = r0.LLD
        L68:
            if (r5 == 0) goto L99
            if (r3 == 0) goto L93
            java.util.List r0 = r3.LJIIIIZZ()
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L7a:
            if (r7 == 0) goto L97
            int r1 = r7.intValue()
            if (r1 < 0) goto L93
        L82:
            java.util.List r0 = r3.LJIIIIZZ()
            int r0 = r0.size()
            if (r1 > r0) goto L93
            java.util.List r0 = r3.LJIIIIZZ()
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r0, r1, r2)
        L93:
            r8.notifyItemInserted(r9)
            return r6
        L97:
            r1 = r9
            goto L82
        L99:
            if (r4 == 0) goto Laa
            if (r3 == 0) goto L93
            java.util.List r0 = r3.LJIIIIZZ()
            int r0 = r0.indexOf(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L7a
        Laa:
            if (r3 == 0) goto L93
            goto L7a
        Lad:
            r3 = r7
            goto L68
        Laf:
            r0 = r9
            goto L5d
        Lb1:
            if (r4 == 0) goto Lc8
            X.Jgz r0 = r8.LLIIIL()
            if (r0 == 0) goto Lc8
            java.util.List r0 = r0.getItems()
            if (r0 == 0) goto Lc8
            int r0 = r0.indexOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L4b
        Lc8:
            r3 = r7
            goto L4b
        Lca:
            r4 = r7
            goto L26
        Lcd:
            r5 = r7
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49265JVd.LLIIIZ(int, X.Jhj):boolean");
    }

    @Override // X.JVP
    public final void LLIIII(Aweme aweme, boolean z, String str, long j, long j2) {
        if (this.LLII.LIZIZ(aweme, z, j, j2)) {
            return;
        }
        super.LLIIII(aweme, z, str, j, j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49265JVd(JYP jyp, Fragment fragment, RecyclerView recyclerView, SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1, JWH jwh, JYO jyo, InterfaceC191547fS loadMoreFunction) {
        super(recyclerView, jwh, jyo, loadMoreFunction);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(loadMoreFunction, "loadMoreFunction");
        this.LLFZ = recyclerView;
        SearchServiceCenterImplKt.LIZLLL(fragment, fragment, jyp, new AqS174S0100000_8(this, 68));
        SearchServiceCenterImplKt.LIZJ(fragment, this, searchJediMixFeedFragment$initAdapter$layoutManager$1);
        SearchServiceCenterImplKt.LIZIZ(fragment, recyclerView, searchJediMixFeedFragment$initAdapter$layoutManager$1);
        this.LLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 127));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS97S0300000_8(fragment, this, searchJediMixFeedFragment$initAdapter$layoutManager$1, 0));
        this.LLII = SearchServiceCenterImplKt.LJ(fragment, (ArrayList) C221108m2.LIZIZ(new AqS158S0100000_8(this, 125)).getValue());
        this.LLIIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 128));
    }
}
