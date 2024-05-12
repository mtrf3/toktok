package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.experiment.LibraryCategory;
import com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryViewModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.S4o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71506S4o {
    public final ViewGroup LIZ;
    public final InterfaceC65784Pro<InterfaceC74487TLf<ProviderEffect>> LIZIZ;
    public final ActivityC45651qj LIZJ;
    public RecyclerView LIZLLL;
    public C71486S3u LJ;
    public boolean LJFF;
    public final int LJI = 1;
    public final int LJII = 2;
    public C74053T4n LJIIIIZZ;
    public int LJIIIZ;
    public View LJIIJ;
    public final LibraryCategoryViewModel LJIIJJI;
    public final LibraryCategory[] LJIIL;
    public final C5H3 LJIILIIL;

    public final void LIZ(boolean z) {
        View view = this.LJIIJ;
        if (view == null) {
            return;
        }
        if (this.LIZLLL == null) {
            View findViewById = view.findViewById(R.id.fqc);
            o.LJIIIIZZ(findViewById, "content.findViewById(R.i…ibrary_category_tab_list)");
            this.LIZLLL = (RecyclerView) findViewById;
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                RecyclerView recyclerView2 = this.LIZLLL;
                if (recyclerView2 != null) {
                    recyclerView2.LJJLJ(i);
                } else {
                    o.LJIJI("customCategoryTabs");
                    throw null;
                }
            }
            if (z) {
                RecyclerView recyclerView3 = this.LIZLLL;
                if (recyclerView3 != null) {
                    C26338AVi.LJI(recyclerView3, 0, null, 0, null, false, 26);
                    RecyclerView recyclerView4 = this.LIZLLL;
                    if (recyclerView4 != null) {
                        recyclerView4.setLayoutManager(new WrapLinearLayoutManager(0));
                        RecyclerView recyclerView5 = this.LIZLLL;
                        if (recyclerView5 != null) {
                            recyclerView5.LJII(new C71488S3w(), -1);
                        } else {
                            o.LJIJI("customCategoryTabs");
                            throw null;
                        }
                    } else {
                        o.LJIJI("customCategoryTabs");
                        throw null;
                    }
                } else {
                    o.LJIJI("customCategoryTabs");
                    throw null;
                }
            } else {
                RecyclerView recyclerView6 = this.LIZLLL;
                if (recyclerView6 != null) {
                    C26338AVi.LJI(recyclerView6, AnonymousClass391.LIZJ(16), null, AnonymousClass391.LIZJ(16), null, false, 26);
                    RecyclerView recyclerView7 = this.LIZLLL;
                    if (recyclerView7 != null) {
                        recyclerView7.setLayoutManager(new GridLayoutManager(this.LJII, 1, false));
                        RecyclerView recyclerView8 = this.LIZLLL;
                        if (recyclerView8 != null) {
                            final int i2 = this.LJII;
                            final int LIZIZ = C7MY.LIZIZ(8);
                            recyclerView8.LJII(new AbstractC030309z(i2, LIZIZ) { // from class: X.3y7
                                public final int LJLIL;
                                public final int LJLILLLLZI;
                                public final boolean LJLJI = false;

                                {
                                    this.LJLIL = i2;
                                    this.LJLILLLLZI = LIZIZ;
                                }

                                @Override // X.AbstractC030309z
                                public final void LJ(Rect rect, View view2, RecyclerView recyclerView9, C0AC c0ac) {
                                    int LIZJ = C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView9, "parent", c0ac, "state", view2);
                                    int i3 = LIZJ % this.LJLIL;
                                    if (this.LJLJI) {
                                        if (!C90193gN.LIZ()) {
                                            int i4 = this.LJLILLLLZI;
                                            int i5 = this.LJLIL;
                                            rect.left = i4 - ((i3 * i4) / i5);
                                            rect.right = ((i3 + 1) * i4) / i5;
                                        } else {
                                            int i6 = this.LJLILLLLZI;
                                            int i7 = this.LJLIL;
                                            rect.right = i6 - ((i3 * i6) / i7);
                                            rect.left = ((i3 + 1) * i6) / i7;
                                        }
                                        if (LIZJ < this.LJLIL) {
                                            rect.top = this.LJLILLLLZI;
                                        }
                                        rect.bottom = this.LJLILLLLZI;
                                        return;
                                    }
                                    if (!C90193gN.LIZ()) {
                                        int i8 = this.LJLILLLLZI;
                                        int i9 = this.LJLIL;
                                        rect.left = (i3 * i8) / i9;
                                        rect.right = i8 - (((i3 + 1) * i8) / i9);
                                    } else {
                                        int i10 = this.LJLILLLLZI;
                                        int i11 = this.LJLIL;
                                        rect.right = (i3 * i10) / i11;
                                        rect.left = i10 - (((i3 + 1) * i10) / i11);
                                    }
                                    if (LIZJ < this.LJLIL) {
                                        return;
                                    }
                                    rect.top = this.LJLILLLLZI;
                                }
                            }, -1);
                        } else {
                            o.LJIJI("customCategoryTabs");
                            throw null;
                        }
                    } else {
                        o.LJIJI("customCategoryTabs");
                        throw null;
                    }
                } else {
                    o.LJIJI("customCategoryTabs");
                    throw null;
                }
            }
            LibraryCategory[] libraryCategoryArr = this.LJIIL;
            int length = libraryCategoryArr.length;
            if (!z && length > 1) {
                libraryCategoryArr = (LibraryCategory[]) ORY.LJJLIIIJILLIZJL(libraryCategoryArr, C78842Uww.LJJ(this.LJI, length)).toArray(new LibraryCategory[0]);
            }
            C71486S3u c71486S3u = new C71486S3u(libraryCategoryArr, z, new AqS194S0100000_12(this, 261));
            this.LJ = c71486S3u;
            RecyclerView recyclerView9 = this.LIZLLL;
            if (recyclerView9 != null) {
                recyclerView9.setAdapter(c71486S3u);
                return;
            } else {
                o.LJIJI("customCategoryTabs");
                throw null;
            }
        }
        o.LJIJI("customCategoryTabs");
        throw null;
    }

    public final void LIZIZ(int i) {
        if (i < 0 || i >= this.LJIIL.length) {
            return;
        }
        C71486S3u c71486S3u = this.LJ;
        if (c71486S3u != null) {
            c71486S3u.LJLJJI = i;
            c71486S3u.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            recyclerView.LJLI(i);
        }
        this.LJIIIZ = i;
        LibraryCategory currentCategory = this.LJIIL[i];
        LibraryCategoryViewModel libraryCategoryViewModel = this.LJIIJJI;
        libraryCategoryViewModel.getClass();
        o.LJIIIZ(currentCategory, "currentCategory");
        libraryCategoryViewModel.setState(new AqS178S0100000_12(currentCategory, 289));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71506S4o(android.view.ViewGroup r4, kotlin.jvm.internal.AqS162S0100000_12 r5, X.ActivityC45651qj r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r4
            r3.LIZIZ = r5
            r3.LIZJ = r6
            r0 = 1
            r3.LJI = r0
            r0 = 2
            r3.LJII = r0
            X.6ek r1 = X.C163726bg.LIZJ(r4)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryViewModel.class
            com.bytedance.jedi.arch.JediViewModel r1 = r1.LIZ(r0)
            java.lang.String r0 = "of(contentView)\n        …oryViewModel::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryViewModel) r1
            r3.LJIIJJI = r1
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "tt_library_categories_materials"
            java.lang.Class<com.ss.android.ugc.aweme.experiment.LibraryCategoryConfig> r0 = com.ss.android.ugc.aweme.experiment.LibraryCategoryConfig.class
            r2.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.aweme.experiment.LibraryCategoryConfig r0 = (com.ss.android.ugc.aweme.experiment.LibraryCategoryConfig) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.experiment.LibraryCategory[] r0 = r0.getCategories()
            if (r0 != 0) goto L43
            goto L40
        L3c:
            r0 = move-exception
            X.H78.LJ(r0)
        L40:
            r0 = 0
            com.ss.android.ugc.aweme.experiment.LibraryCategory[] r0 = new com.ss.android.ugc.aweme.experiment.LibraryCategory[r0]
        L43:
            r3.LJIIL = r0
            X.8m0 r2 = X.EnumC221088m0.NONE
            kotlin.jvm.internal.AqS162S0100000_12 r1 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 1210(0x4ba, float:1.696E-42)
            r1.<init>(r3, r0)
            X.5H3 r0 = X.C221108m2.LIZ(r2, r1)
            r3.LJIILIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71506S4o.<init>(android.view.ViewGroup, kotlin.jvm.internal.AqS162S0100000_12, X.1qj):void");
    }
}
