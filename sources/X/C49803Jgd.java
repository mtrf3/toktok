package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Jgd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49803Jgd extends C0A6 {
    public boolean LJLIL;
    public final /* synthetic */ SearchContainerHeaderVM LJLILLLLZI;

    public C49803Jgd(SearchContainerHeaderVM searchContainerHeaderVM) {
        this.LJLILLLLZI = searchContainerHeaderVM;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LJLIL = true;
            return;
        }
        this.LJLIL = false;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int max;
        o.LJIIIZ(recyclerView, "recyclerView");
        C62822Ol8 c62822Ol8 = C49804Jge.LJLJLLL;
        if (((Number) c62822Ol8.getValue()).intValue() == 2 && C46442IKo.LIZ() && i2 < 0 && this.LJLIL) {
            this.LJLILLLLZI.iv0();
        }
        if (((Number) c62822Ol8.getValue()).intValue() == 1 && C46442IKo.LIZ() && this.LJLIL) {
            SearchContainerHeaderVM searchContainerHeaderVM = this.LJLILLLLZI;
            searchContainerHeaderVM.LLFF = false;
            searchContainerHeaderVM.iv0();
        }
        StringBuilder LJ = C7MY.LJ("dy = ", i2, "    researchLayoutHasTranslationY = ");
        LJ.append(this.LJLILLLLZI.LLD);
        X1D.LIZIZ(LJ);
        SearchContainerHeaderVM searchContainerHeaderVM2 = this.LJLILLLLZI;
        int i3 = searchContainerHeaderVM2.LLF;
        if (searchContainerHeaderVM2.LJLJI && o.LJ(searchContainerHeaderVM2.LJZL.getValue(), Boolean.FALSE)) {
            SearchContainerHeaderVM searchContainerHeaderVM3 = this.LJLILLLLZI;
            EnumC49652JeC enumC49652JeC = searchContainerHeaderVM3.LJLLLL;
            EnumC49652JeC enumC49652JeC2 = EnumC49652JeC.START;
            if (enumC49652JeC != enumC49652JeC2 && searchContainerHeaderVM3.LJLLLLLL != enumC49652JeC2 && this.LJLIL) {
                if (i2 > 0) {
                    max = Math.min(searchContainerHeaderVM3.LLD + i2, i3);
                } else {
                    max = Math.max(searchContainerHeaderVM3.LLD + i2, 0);
                }
                UC7.LIZLLL("research onScrolled = finalScroll = ", max);
                SearchContainerHeaderVM searchContainerHeaderVM4 = this.LJLILLLLZI;
                searchContainerHeaderVM4.LLD = max;
                searchContainerHeaderVM4.LJLJJLL.setValue(Integer.valueOf(-max));
            }
        }
    }
}
