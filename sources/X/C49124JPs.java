package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JPs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49124JPs extends JPO implements JQX, JP7, JSO {
    public static final /* synthetic */ int LLFII = 0;
    public final JIB LJLJLLL;
    public final JGU LJLL;
    public final ViewGroup LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public Integer LJLLL;
    public C49125JPt LJLLLL;
    public SearchStateViewModel LJLLLLLL;
    public TuxTextView LJLZ;
    public ConstraintLayout LJZ;
    public LinearLayout LJZI;
    public TuxTextView LJZL;
    public TuxIconView LL;
    public LinearLayout LLD;
    public int LLF;
    public final C62822Ol8 LLFF;
    public final int LLFFF;

    @Override // X.JP7
    public final int LIZ() {
        return 72;
    }

    @Override // X.JP7
    public final SearchResultParam LJLJLLL() {
        return null;
    }

    @Override // X.JP7
    public final Aweme LJLLILLLL(int i, String str) {
        return null;
    }

    @Override // X.JQX
    public final void LJLLLL() {
    }

    @Override // X.JP7
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.JP7
    public final void LLIIL() {
    }

    @Override // X.JP7
    public final void LLJIJIL() {
    }

    @Override // X.JQX
    public final JP7 LLLLIIL() {
        return this;
    }

    @Override // X.JP7
    public final boolean LLLLILI() {
        return false;
    }

    @Override // X.JSO
    public final boolean LLLLLLL() {
        return true;
    }

    @Override // X.JP7
    public final Aweme getCurrentAweme() {
        return null;
    }

    @Override // X.JQX
    public final InterfaceC48907JHj getPlayerView() {
        return null;
    }

    @Override // X.JSO
    public final int q() {
        return 18;
    }

    @Override // X.JQX
    public final C49128JPw LJJLJ() {
        AbstractC49155JQx abstractC49155JQx;
        Integer num;
        Rect LIZIZ;
        int i;
        Rect LIZIZ2;
        C49113JPh LJIIL;
        C49153JQv LIZIZ3;
        C49125JPt c49125JPt = this.LJLLLL;
        Integer num2 = null;
        if (c49125JPt == null) {
            return null;
        }
        Context LJIIIIZZ = c49125JPt.LJIIIIZZ();
        C49125JPt c49125JPt2 = this.LJLLLL;
        if (c49125JPt2 != null && (LJIIL = c49125JPt2.LJIIL()) != null && (LIZIZ3 = LJIIL.LIZIZ()) != null) {
            abstractC49155JQx = LIZIZ3.LIZJ;
        } else {
            abstractC49155JQx = null;
        }
        if (C26338AVi.LIZJ(LJIIIIZZ)) {
            int LJJJJL = C63081OpJ.LJJJJL(LJIIIIZZ);
            if (abstractC49155JQx != null && (LIZIZ2 = abstractC49155JQx.LIZIZ()) != null) {
                i = LIZIZ2.right;
            } else {
                i = 0;
            }
            num = Integer.valueOf(LJJJJL - i);
        } else if (abstractC49155JQx != null && (LIZIZ = abstractC49155JQx.LIZIZ()) != null) {
            num = Integer.valueOf(LIZIZ.left);
        } else {
            num = null;
        }
        if (abstractC49155JQx != null) {
            num2 = Integer.valueOf(abstractC49155JQx.LIZ());
        }
        return new C49128JPw(num2, num);
    }

    @Override // X.JP7
    public final int LJLLI() {
        if (this.itemView.getLayoutParams() instanceof C1BU) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            return ((C1BU) layoutParams).LJLIL;
        }
        return -1;
    }

    @Override // X.JSO
    public final View a() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.JSO
    public final JSL h() {
        C49189JSf c49189JSf = new C49189JSf();
        c49189JSf.LJIIJ = new C49127JPv(this);
        return c49189JSf;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        C49125JPt c49125JPt = this.LJLLLL;
        if (c49125JPt != null && c49125JPt.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // X.JP7
    public final int LJLL() {
        if (getAdapterPosition() < 0) {
            return this.LLF;
        }
        return getAdapterPosition();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return LLZL();
    }

    @Override // X.JP7
    public final int LLJJJ() {
        if (getAdapterPosition() < 0) {
            return this.LLF;
        }
        return getAdapterPosition();
    }

    @Override // X.JQX
    public final boolean LLZL() {
        if (C34470Dfu.LIZIZ() != 1 && C34470Dfu.LIZIZ() != 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        return this.LJLLI;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LJLLL;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LJLLILLLL;
    }

    @Override // X.JPO, X.InterfaceC49148JQq
    public final void LLLLLIL() {
        JSM.LIZLLL(this);
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LJLLL = Integer.valueOf(i);
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        C0A2 c0a2;
        int i;
        RecyclerView LJIIJJI;
        RecyclerView LJIIJJI2;
        o.LJIIIZ(info, "info");
        C49125JPt c49125JPt = this.LJLLLL;
        LinearLayoutManager linearLayoutManager = null;
        if (c49125JPt != null && (LJIIJJI2 = c49125JPt.LJIIJJI()) != null) {
            c0a2 = LJIIJJI2.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (c0a2 instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) c0a2;
        }
        C49125JPt c49125JPt2 = this.LJLLLL;
        if (c49125JPt2 != null && (LJIIJJI = c49125JPt2.LJIIJJI()) != null) {
            i = LJIIJJI.getPaddingStart();
        } else {
            i = 0;
        }
        Integer num = info.LIZ;
        Integer num2 = info.LIZIZ;
        if (num != null && num2 != null) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            if (linearLayoutManager != null) {
                linearLayoutManager.LJFF(intValue2, intValue - i);
            }
            this.LJLLI.postDelayed(new ARunnableS44S0100000_8(this, 90), 200L);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.JPO, X.InterfaceC49148JQq
    public final void y(long j) {
        JSM.LJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    @Override // X.JSO
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        JSM.LIZIZ(this, aweme, c49196JSm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49124JPs(View itemView, JIB containerStatusProvider, JGU jgu) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
        this.LJLJLLL = containerStatusProvider;
        this.LJLL = jgu;
        View findViewById = itemView.findViewById(R.id.je8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…rch_aweme_card_container)");
        this.LJLLI = (ViewGroup) findViewById;
        this.LJLLJ = "";
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 497));
        this.LLFFF = C7MY.LIZIZ(12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6, r23.LJLLJ) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r24, X.JQA r25, int r26) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49124JPs.Q(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, X.JQA, int):void");
    }
}
