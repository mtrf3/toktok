package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106544Gc extends PagerAdapter {
    public final InterfaceC106584Gg LJLILLLLZI;
    public final InterfaceC106614Gj LJLJI;
    public final C106554Gd LJLJJI = new C106554Gd();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        Iterator it = ((List) this.LJLJI.LIZ().LIZLLL).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((InterfaceC105334Bl) it.next()).LIZIZ();
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.4Gf] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, final ViewGroup viewGroup) {
        List<C105454Bx> arrayList;
        int i2;
        View view;
        C106554Gd c106554Gd = this.LJLJJI;
        InterfaceC106614Gj interfaceC106614Gj = this.LJLJI;
        ?? r5 = new C3UR() { // from class: X.4Gf
            @Override // X.C3UR
            public final void LIZJ(C32V c32v, boolean z) {
            }

            @Override // X.C3UR
            public final void LJ(Context context) {
            }

            @Override // X.C3UR
            public final void LIZIZ() {
                C106544Gc.this.LJLILLLLZI.LLLLLZIL();
            }

            @Override // X.C3UR
            public final void LIZLLL(String str) {
                C106544Gc.this.LJLILLLLZI.LIZJ(1, 0, str);
            }

            @Override // X.C3UR
            public final void j2(CommentPersonalizedEmoji commentPersonalizedEmoji) {
                C106544Gc.this.LJLILLLLZI.LIZIZ(commentPersonalizedEmoji, 1, 0);
            }

            @Override // X.C3UR
            public final void LIZ(View view2, C105454Bx c105454Bx) {
                C106544Gc.this.LJLILLLLZI.LIZ(view2, c105454Bx);
            }
        };
        c106554Gd.getClass();
        C59678NbW LIZ = interfaceC106614Gj.LIZ();
        if (i < 0) {
            LIZ.getClass();
        } else {
            Iterator it = ((List) LIZ.LIZLLL).iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) it.next();
                i3 += interfaceC105334Bl.LIZIZ();
                if (i < i3) {
                    if (interfaceC105334Bl.LIZLLL()) {
                        if (i < 0) {
                            arrayList = new ArrayList<>();
                        } else {
                            Iterator it2 = ((List) LIZ.LIZLLL).iterator();
                            int i4 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    InterfaceC105334Bl interfaceC105334Bl2 = (InterfaceC105334Bl) it2.next();
                                    if (i < interfaceC105334Bl2.LIZIZ() + i4) {
                                        arrayList = interfaceC105334Bl2.LIZJ(i - i4);
                                        break;
                                    }
                                    i4 += interfaceC105334Bl2.LIZIZ();
                                } else {
                                    arrayList = new ArrayList<>();
                                    break;
                                }
                            }
                            int i5 = 0;
                            for (InterfaceC105334Bl interfaceC105334Bl3 : (List) LIZ.LIZLLL) {
                                if (i < interfaceC105334Bl3.LIZIZ() + i5) {
                                    i2 = i - i5;
                                    break;
                                }
                                i5 += interfaceC105334Bl3.LIZIZ();
                            }
                        }
                        i2 = 0;
                        String LLLZ = C16880lQ.LLLZ(c106554Gd.LIZ, new Object[]{interfaceC105334Bl.LJII(), String.valueOf(i2)});
                        C106564Ge remove = c106554Gd.LIZIZ.remove(LLLZ);
                        if (remove != null) {
                            c106554Gd.LIZIZ.put(LLLZ, remove);
                            view = remove.LIZIZ;
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                C16880lQ.LJLLL(view, (ViewGroup) parent);
                            }
                            if (viewGroup.indexOfChild(view) < 0) {
                                viewGroup.addView(view);
                            }
                            C106554Gd.LIZ(remove, arrayList, r5, LIZ, i);
                        } else {
                            C106564Ge c106564Ge = new C106564Ge(viewGroup, interfaceC105334Bl.LJ());
                            c106554Gd.LIZIZ.put(LLLZ, c106564Ge);
                            view = c106564Ge.LIZIZ;
                            if (viewGroup.indexOfChild(view) < 0) {
                                viewGroup.addView(view);
                            }
                            C106554Gd.LIZ(c106564Ge, arrayList, r5, LIZ, i);
                        }
                    }
                }
            }
        }
        view = new C105324Bk().LLIIZ(viewGroup);
        if (viewGroup.indexOfChild(view) < 0) {
            viewGroup.addView(view);
        }
        return view;
    }

    public C106544Gc(InterfaceC106584Gg interfaceC106584Gg, InterfaceC106614Gj interfaceC106614Gj, VWD vwd) {
        this.LJLILLLLZI = interfaceC106584Gg;
        this.LJLJI = interfaceC106614Gj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        C16880lQ.LJLLL((View) obj, viewGroup);
    }
}
