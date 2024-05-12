package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.4Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105244Bc extends AbstractC105384Bq implements InterfaceC106614Gj, C4FT {
    public final InterfaceC105344Bm LJLJI;
    public final LifecycleOwner LJLJJI;
    public final LinearLayoutManager LJLJJL;
    public final C4BX LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public int LJLJLLL;
    public final C105234Bb LJLL;

    @Override // X.InterfaceC106614Gj
    public final C59678NbW LIZ() {
        return null;
    }

    public final VWD LJ() {
        return (VWD) this.LJLJL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1.getLeft() < 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        ((androidx.recyclerview.widget.RecyclerView) r5.LJLJLJ.getValue()).LJLI(r5.LJLJJLL.LJII);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r4 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r1.getRight() > ((android.view.View) r5.LJLJLJ.getValue()).getWidth()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r5 = this;
            int r1 = r5.LJLJLLL
            X.4BX r0 = r5.LJLJJLL
            int r0 = r0.LJII
            if (r1 == r0) goto L27
            X.Ol8 r0 = r5.LJLJLJ
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.09q r0 = r0.getAdapter()
            if (r0 == 0) goto L19
            r0.notifyDataSetChanged()
        L19:
            X.4BX r0 = r5.LJLJJLL
            int r1 = r0.LJII
            r0 = -1
            r4 = 0
            if (r1 != r0) goto L28
        L21:
            X.4BX r0 = r5.LJLJJLL
            int r0 = r0.LJII
            r5.LJLJLLL = r0
        L27:
            return
        L28:
            int r0 = r5.LJLJLLL
            r3 = 1
            if (r1 >= r0) goto L5b
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LJLJJL
            int r2 = r0.LLILL()
            int r0 = r5.LJLJLLL
            if (r2 != r0) goto L38
            r4 = 1
        L38:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LJLJJL
            android.view.View r1 = r0.LJJIJIL(r2)
            int r0 = r5.LJLJLLL
            int r0 = r0 - r3
            if (r2 != r0) goto L87
            if (r1 == 0) goto L87
            int r0 = r1.getLeft()
            if (r0 >= 0) goto L87
        L4b:
            X.Ol8 r0 = r5.LJLJLJ
            java.lang.Object r1 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.4BX r0 = r5.LJLJJLL
            int r0 = r0.LJII
            r1.LJLI(r0)
            goto L21
        L5b:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LJLJJL
            int r2 = r0.LLILLJJLI()
            int r0 = r5.LJLJLLL
            if (r2 != r0) goto L66
            r4 = 1
        L66:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.LJLJJL
            android.view.View r1 = r0.LJJIJIL(r2)
            int r0 = r5.LJLJLLL
            int r0 = r0 + 1
            if (r2 != r0) goto L87
            if (r1 == 0) goto L87
            int r1 = r1.getRight()
            X.Ol8 r0 = r5.LJLJLJ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getWidth()
            if (r1 <= r0) goto L87
            goto L4b
        L87:
            if (r4 == 0) goto L21
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105244Bc.LJFF():void");
    }

    @Override // X.C4FT
    public final void LIZJ(C105734Cz emojiData) {
        o.LJIIIZ(emojiData, "emojiData");
        LinkedHashMap<Resources, List<Emoji>> linkedHashMap = C4FF.LJLJJI.LIZIZ;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            this.LJLJJLL.LJ();
            PagerAdapter adapter = LJ().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        if (emojiData.LIZ == NaviStatusCode.SUCCESS) {
            onPageSelected(this.LJLJJLL.LJII);
        }
    }

    public final void LIZLLL(int i) {
        boolean z;
        C4BX c4bx = this.LJLJJLL;
        if (c4bx.LJII == -1) {
            z = true;
        } else {
            z = false;
        }
        c4bx.LIZLLL(i);
        LJ().setCurrentItem(this.LJLJJLL.LJII, false);
        if (z) {
            LJFF();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4FT
    public final void LIZIZ(Resources resources, List<? extends Emoji> list) {
        o.LJIIIZ(resources, "resources");
        if (!C79004UzY.LJJIFFI(list)) {
            int LIZJ = this.LJLJJLL.LIZJ();
            for (int i = 0; i < LIZJ; i++) {
                InterfaceC105334Bl LIZIZ = this.LJLJJLL.LIZIZ(i);
                if (LIZIZ.LJ() == 2) {
                    C4BZ c4bz = (C4BZ) LIZIZ;
                    if (o.LJ(c4bz.LIZJ, resources)) {
                        c4bz.LIZIZ = list;
                        C4BX c4bx = this.LJLJJLL;
                        c4bx.LIZLLL(c4bx.LJII);
                        PagerAdapter adapter = LJ().getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        LJ().setCurrentItem(this.LJLJJLL.LJII, false);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.4Bb, X.0C3] */
    public C105244Bc(InterfaceC105344Bm interfaceC105344Bm, C105394Br c105394Br, LifecycleOwner lifecycleOwner, ViewGroup viewGroup) {
        super(viewGroup, R.layout.q0);
        int i;
        this.LJLJI = interfaceC105344Bm;
        this.LJLJJI = lifecycleOwner;
        int i2 = c105394Br.LJII;
        if (i2 > 0) {
            C78886Uxe.LJJLIIIJ(i2, this.LJLIL);
        }
        this.LJLIL.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.LJLJJL = linearLayoutManager;
        C48841JEv.LIZ(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 16));
        this.LJLJJLL = new C4BX(c105394Br);
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 900));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 901));
        this.LJLJLJ = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS151S0100000_1(this, 902));
        ?? r5 = new C1CZ() { // from class: X.4Bb
            @Override // X.C1CZ, X.C0C3
            public final void onPageSelected(int i3) {
                C105244Bc.this.LJLJJLL.LIZLLL(i3);
                C105244Bc.this.LJFF();
                InterfaceC105334Bl interfaceC105334Bl = C105244Bc.this.LJLJJLL.LIZIZ;
                if (interfaceC105334Bl != null) {
                    Integer valueOf = Integer.valueOf(interfaceC105334Bl.LJ());
                    if (valueOf.intValue() == 2) {
                        valueOf.intValue();
                        if (!interfaceC105334Bl.LIZLLL()) {
                            Resources resources = ((C4BZ) interfaceC105334Bl).LIZJ;
                            o.LJIIIIZZ(resources, "emojiType as EmojiType).resourcesModel");
                            C4FD.LJLIL.LJ(resources);
                        }
                    }
                }
            }
        };
        this.LJLL = r5;
        VWD LJ = LJ();
        VWD emojiPager = LJ();
        o.LJIIIIZZ(emojiPager, "emojiPager");
        LJ.setAdapter(new C4BY(interfaceC105344Bm, emojiPager, this, lifecycleOwner));
        ((RecyclerView) LIZIZ.getValue()).setLayoutManager(linearLayoutManager);
        ((RecyclerView) LIZIZ.getValue()).setAdapter(new C105274Bf(this));
        LJ().addOnPageChangeListener(r5);
        View view = (View) LIZIZ2.getValue();
        if (c105394Br.LJFF) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        ((View) LIZIZ2.getValue()).setBackgroundColor(C04330Ez.LIZIZ(((View) LIZIZ2.getValue()).getContext(), R.color.ar));
        PagerAdapter adapter = LJ().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (c105394Br.LIZ) {
            ArrayList arrayList = (ArrayList) C4FF.LJLJL;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            C4FF.LIZ(false, false);
        }
    }
}
