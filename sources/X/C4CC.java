package X;

import X.C0AC;
import X.C4CC;
import Y.ARunnableS20S0200000_1;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CC extends BaseEmojiGridAdapter<C105454Bx> {
    public final LifecycleOwner LJLJJLL;
    public final C105534Cf LJLJL;
    public final int LJLJLJ;
    public final InterfaceC88472Yns<C0AC, C76800UCe> LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final int LJLZ() {
        return R.layout.ath;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final int LJZL() {
        View view;
        C105534Cf c105534Cf = this.LJLJL;
        int i = 0;
        if (c105534Cf != null && c105534Cf.LJ) {
            RecyclerView recyclerView = this.LJLJJI;
            Object obj = null;
            if (recyclerView != null) {
                obj = recyclerView.getParent();
            }
            if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
                i = view.getWidth();
            }
        }
        int i2 = this.LJLLI;
        int i3 = this.LJLL;
        int i4 = this.LJLILLLLZI;
        if (i == 0) {
            i = KL2.LJIIJJI(this.LJLJI);
        }
        return (int) ((((i - (i3 * 2.0d)) * 1.0f) / i4) - i2);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final void LJZI(C4CM c4cm) {
        super.LJZI(c4cm);
        ViewGroup.LayoutParams layoutParams = c4cm.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        int i = this.LJLL;
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, 0, i, 0);
        final int i2 = this.LJLILLLLZI;
        c4cm.setLayoutManager(new WrapGridLayoutManager(i2) { // from class: com.ss.android.ugc.aweme.emoji.emojiPageV2.SystemBigGridAdapter$setup$lm$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final void LJLJJL(C0AC state) {
                o.LJIIIZ(state, "state");
                super.LJLJJL(state);
                C4CC.this.LJLJLLL.invoke(state);
            }
        });
        C105534Cf c105534Cf = this.LJLJL;
        if (c105534Cf != null && c105534Cf.LJ) {
            c4cm.post(new ARunnableS20S0200000_1(this, c4cm, 46));
        } else {
            LL(c4cm);
        }
        c4cm.setAdapter(this);
    }

    public final void LL(RecyclerView recyclerView) {
        AbstractC030309z c4cd;
        if (C88963eO.LIZIZ() && !C88963eO.LIZJ()) {
            final int max = Math.max(0, LJZL());
            final int LIZIZ = C7MY.LIZIZ(12);
            c4cd = new AbstractC030309z(max, LIZIZ) { // from class: X.4D4
                public final int LJLIL;
                public final int LJLILLLLZI;
                public final boolean LJLJI = C90193gN.LIZIZ(EF7.LIZIZ());

                {
                    this.LJLIL = max;
                    this.LJLILLLLZI = LIZIZ;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                    GridLayoutManager gridLayoutManager;
                    C1BU c1bu;
                    int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state", view);
                    if (LIZJ < 0) {
                        return;
                    }
                    C0A2 layoutManager = recyclerView2.getLayoutManager();
                    if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
                        return;
                    }
                    int i = gridLayoutManager.LLIIIL;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(layoutParams instanceof C1BU) || (c1bu = (C1BU) layoutParams) == null) {
                        return;
                    }
                    int i2 = c1bu.LJLIL;
                    int i3 = c1bu.LJLILLLLZI;
                    if (LIZJ < i && i2 + i3 <= i) {
                        rect.top = this.LJLILLLLZI;
                    }
                    if (i3 == i) {
                        rect.top = this.LJLILLLLZI;
                        rect.bottom = C7MY.LIZIZ(8);
                    } else {
                        rect.bottom = this.LJLILLLLZI;
                    }
                    int i4 = this.LJLIL;
                    int i5 = (i2 * i4) / i;
                    int i6 = i4 - (((i2 + i3) * i4) / i);
                    rect.left = i5;
                    rect.right = i6;
                    if (this.LJLJI) {
                        rect.left = i6;
                        rect.right = i5;
                    }
                }
            };
        } else {
            c4cd = new C4CD(this.LJLILLLLZI, LJZL(), this.LJLLILLLL);
        }
        recyclerView.LJII(c4cd, -1);
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        List<C105454Bx> data = getData();
        if (data != null) {
            obj = ListProtector.get(data, i);
        } else {
            obj = null;
        }
        if (obj instanceof C72042sC) {
            return 1002;
        }
        return 1001;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null && C88963eO.LIZIZ() && !C88963eO.LIZJ()) {
            gridLayoutManager.LLJLILLLLZIIL(new AbstractC028509h() { // from class: X.4CF
                @Override // X.AbstractC028509h
                public final int LJFF(int i) {
                    int itemViewType = C4CC.this.getItemViewType(i);
                    if (itemViewType == 1001 || itemViewType != 1002) {
                        return 1;
                    }
                    return C4CC.this.LJLILLLLZI;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f5, code lost:
    
        if ((!r0.isEmpty()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if ((!r0.isEmpty()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if ((!r0.isEmpty()) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00cd, code lost:
    
        if ((!r0.isEmpty()) != false) goto L36;
     */
    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ(com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter<X.C105454Bx>.a r22, int r23) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4CC.LJZ(com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter$a, int):void");
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1002) {
            TuxTextView tuxTextView = new TuxTextView(this.LJLJI, null, 6, 0);
            tuxTextView.setTuxFont(61);
            tuxTextView.setTextColorRes(R.attr.gx);
            return new C4CH(tuxTextView);
        }
        return super.onCreateBasicViewHolder(viewGroup, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4CC(LifecycleOwner owner, C105534Cf c105534Cf, int i, AqS167S0100000_1 aqS167S0100000_1) {
        super(owner);
        o.LJIIIZ(owner, "owner");
        this.LJLJJLL = owner;
        this.LJLJL = c105534Cf;
        this.LJLJLJ = i;
        this.LJLJLLL = aqS167S0100000_1;
        this.LJLL = (int) KL2.LIZJ(this.LJLJI, 16.0f);
        this.LJLLI = (int) KL2.LIZJ(this.LJLJI, 68.0f);
        this.LJLLILLLL = (int) KL2.LIZJ(this.LJLJI, 24.0f);
    }
}
