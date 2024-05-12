package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS294S0100000_1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.IMReactionViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111764a4 extends FrameLayout implements InterfaceC1039746f {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public boolean LJLJJLL;
    public final C111754a3 LJLJL;
    public final IMReactionViewModel LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public InterfaceC111904aI LJLLLL;
    public final ACListenerS21S0100000_1 LJLLLLLL;
    public final ACListenerS21S0100000_1 LJLZ;
    public final IDCListenerS294S0100000_1 LJZ;

    @Override // X.InterfaceC1039746f
    public final void LIZJ() {
        this.LJLJLLL = true;
    }

    private final ViewGroup getContentView() {
        return (ViewGroup) this.LJLIL.getValue();
    }

    private final TuxIconView getEllipseIconView() {
        return (TuxIconView) this.LJLJI.getValue();
    }

    private final TuxTextView getEmojiIconTip() {
        return (TuxTextView) this.LJLILLLLZI.getValue();
    }

    private final TuxIconView getIconView() {
        return (TuxIconView) this.LJLJJI.getValue();
    }

    private final RecyclerView getReactionRecyclerView() {
        return (RecyclerView) this.LJLJJL.getValue();
    }

    public final void LJ() {
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        View.inflate(getContext(), R.layout.b72, this);
        getReactionRecyclerView().setAdapter(this.LJLJL);
        getReactionRecyclerView().setItemAnimator(null);
        RecyclerView reactionRecyclerView = getReactionRecyclerView();
        getContext();
        reactionRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        setClipChildrenState(this);
        ViewGroup contentView = getContentView();
        o.LJIIIIZZ(contentView, "contentView");
        setClipChildrenState(contentView);
        RecyclerView reactionRecyclerView2 = getReactionRecyclerView();
        o.LJIIIIZZ(reactionRecyclerView2, "reactionRecyclerView");
        setClipChildrenState(reactionRecyclerView2);
    }

    @Override // X.InterfaceC1039746f
    public final void LLZ() {
        ((ArrayList) this.LJLJLJ.LJLIL).clear();
    }

    private final void setClipChildrenState(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private final void setEmojiIconAndTipVisibility(boolean z) {
        int i;
        TuxIconView iconView = getIconView();
        o.LJIIIIZZ(iconView, "iconView");
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        iconView.setVisibility(i);
        TuxTextView emojiIconTip = getEmojiIconTip();
        o.LJIIIIZZ(emojiIconTip, "emojiIconTip");
        TuxIconView iconView2 = getIconView();
        o.LJIIIIZZ(iconView2, "iconView");
        if (iconView2.getVisibility() == 0 && !C94823nq.LIZ() && !this.LJLJLLL) {
            i2 = 0;
        }
        emojiIconTip.setVisibility(i2);
        TuxTextView emojiIconTip2 = getEmojiIconTip();
        o.LJIIIIZZ(emojiIconTip2, "emojiIconTip");
        if (emojiIconTip2.getVisibility() == 0) {
            getEmojiIconTip().setText(getContext().getString(R.string.pta));
        }
    }

    @Override // X.InterfaceC1039746f
    public final void LIZLLL(boolean z) {
        this.LJLLJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111764a4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C17N.LJJIJL(new AqS151S0100000_1(this, 918));
        this.LJLILLLLZI = C17N.LJJIJL(new AqS151S0100000_1(this, 920));
        this.LJLJI = C17N.LJJIJL(new AqS151S0100000_1(this, 919));
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 921));
        this.LJLJJL = C17N.LJJIJL(new AqS151S0100000_1(this, 922));
        this.LJLJL = new C111754a3(context);
        this.LJLJLJ = new IMReactionViewModel();
        this.LJLLJ = true;
        this.LJLLLL = C1DF.LJLIL;
        this.LJLLLLLL = new ACListenerS21S0100000_1(this, 191);
        this.LJLZ = new ACListenerS21S0100000_1(this, 192);
        this.LJZ = new IDCListenerS294S0100000_1(this, 3);
        setVisibility(8);
        if (isInEditMode()) {
            LJ();
        }
    }

    @Override // X.InterfaceC1039746f
    public final void LIZ(String str, boolean z) {
        if (o.LJ(this.LJLJLJ.LJLJI, "❤️")) {
            return;
        }
        if (z) {
            performHapticFeedback(0);
        }
        this.LJLJLJ.hv0(str);
        this.LJLLLL.LIZ();
    }

    @Override // X.InterfaceC1039746f
    public final void LIZIZ(C109544Rq c109544Rq, boolean z, String selectedReaction) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        o.LJIIIZ(selectedReaction, "selectedReaction");
        if (C93793mB.LIZLLL(c109544Rq)) {
            return;
        }
        IMReactionViewModel iMReactionViewModel = this.LJLJLJ;
        iMReactionViewModel.LJLILLLLZI = c109544Rq;
        C111814a9 gv0 = IMReactionViewModel.gv0(iMReactionViewModel, selectedReaction);
        boolean isEmpty = gv0.LJLIL.isEmpty();
        int i3 = 8;
        if (this.LJLLL && isEmpty) {
            setVisibility(8);
            return;
        }
        boolean z4 = true;
        if (this.LJLLJ && z && isEmpty) {
            z2 = true;
        } else {
            z2 = false;
            if (isEmpty && 0 == 0) {
                setVisibility(8);
                return;
            }
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(c109544Rq.getConversationId());
        if (LIZ == null) {
            setVisibility(8);
            return;
        }
        LJ();
        setVisibility(0);
        boolean isSelf = c109544Rq.isSelf();
        C49T LIZ2 = C49R.LIZ();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C49V L = LIZ2.L(context, isSelf);
        if (LIZ2.LJLJJLL) {
            i = C7MY.LIZIZ(2);
        } else {
            i = 0;
        }
        setPadding(i, i, i, i);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(40);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        c110614Vt.LIZ = C79045V0n.LJI(C49R.LIZ.LIZLLL, context2);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        setBackground(c110614Vt.LIZ(context3));
        ViewGroup contentView = getContentView();
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, L);
        contentView.setBackground(gradientDrawable);
        setEmojiIconAndTipVisibility(z2);
        RecyclerView reactionRecyclerView = getReactionRecyclerView();
        o.LJIIIIZZ(reactionRecyclerView, "reactionRecyclerView");
        if (!isEmpty) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        reactionRecyclerView.setVisibility(i2);
        TuxIconView iconView = getIconView();
        o.LJIIIIZZ(iconView, "iconView");
        if (iconView.getVisibility() == 0) {
            setOnClickListener(new ViewOnClickListenerC13880ga(this.LJLLLLLL));
        } else {
            setOnClickListener(new ViewOnClickListenerC13880ga(this.LJLZ));
        }
        setOnLongClickListener(this.LJZ);
        RecyclerView reactionRecyclerView2 = getReactionRecyclerView();
        o.LJIIIIZZ(reactionRecyclerView2, "reactionRecyclerView");
        if (reactionRecyclerView2.getVisibility() == 0) {
            C111754a3 c111754a3 = this.LJLJL;
            ACListenerS21S0100000_1 aCListenerS21S0100000_1 = this.LJLZ;
            IDCListenerS294S0100000_1 iDCListenerS294S0100000_1 = this.LJZ;
            c111754a3.LJLJI = aCListenerS21S0100000_1;
            c111754a3.LJLJJI = iDCListenerS294S0100000_1;
        }
        C17N.LJJIIJZLJL(getEllipseIconView());
        List<C111784a6> list = gv0.LJLIL;
        if (!this.LJLLL || (!list.isEmpty())) {
            if (list.size() > 6) {
                z3 = true;
            } else {
                z3 = false;
            }
            TuxIconView ellipseIconView = getEllipseIconView();
            o.LJIIIIZZ(ellipseIconView, "ellipseIconView");
            if (z3) {
                i3 = 0;
            }
            ellipseIconView.setVisibility(i3);
            if (z3) {
                list = ORZ.LLILLL(list, 6);
            }
            C111754a3 c111754a32 = this.LJLJL;
            if (!LIZ.isGroupChat()) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C111784a6> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().LJLJI != 1) {
                            break;
                        }
                    }
                }
                z4 = false;
            }
            c111754a32.LJLLLLLL(list, z4);
        }
        getReactionRecyclerView().requestLayout();
    }
}
