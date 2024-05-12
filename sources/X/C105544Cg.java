package X;

import X.C0AC;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS4S0201000_1;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.emoji.sysemoji.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105544Cg extends BaseEmojiGridAdapter<C105454Bx> implements InterfaceC105584Ck {
    public final LifecycleOwner LJLJJLL;
    public final C4CM LJLJL;
    public final VWD LJLJLJ;
    public final C105534Cf LJLJLLL;
    public final InterfaceC88472Yns<C0AC, C76800UCe> LJLL;
    public int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final int LJLZ() {
        return R.layout.atm;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final int LJZL() {
        View view;
        C105534Cf c105534Cf = this.LJLJLLL;
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
        int i2 = this.LJLLJ;
        int i3 = this.LJLLI;
        int i4 = this.LJLIL;
        if (i == 0) {
            i = KL2.LJIIJJI(this.LJLJI);
        }
        return (int) ((((i - (i3 * 2.0d)) * 1.0f) / i4) - i2);
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final void LJZI(C4CM c4cm) {
        final int i;
        super.LJZI(c4cm);
        ViewGroup.LayoutParams layoutParams = c4cm.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C105534Cf c105534Cf = this.LJLJLLL;
        if (c105534Cf != null) {
            Integer valueOf = Integer.valueOf(c105534Cf.LIZIZ);
            if (valueOf.intValue() > 0) {
                this.LJLLI = valueOf.intValue();
            }
        }
        int i2 = this.LJLLI;
        marginLayoutParams.setMargins(i2, 0, i2, 0);
        C105534Cf c105534Cf2 = this.LJLJLLL;
        if (c105534Cf2 != null && c105534Cf2.LIZ) {
            i = (int) (((KL2.LJIIJJI(this.LJLJI) - (this.LJLLI * 2.0d)) + c105534Cf2.LIZJ) / (r8 + this.LJLLJ));
        } else {
            i = this.LJLIL;
        }
        c4cm.setLayoutManager(new WrapGridLayoutManager(i) { // from class: com.ss.android.ugc.aweme.emoji.sysemoji.SystemSmallEmojiGridAdapter$setup$lm$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final void LJLJJL(C0AC state) {
                o.LJIIIZ(state, "state");
                super.LJLJJL(state);
                this.LJLL.invoke(state);
            }
        });
        C105534Cf c105534Cf3 = this.LJLJLLL;
        if (c105534Cf3 != null && c105534Cf3.LJ) {
            c4cm.post(new ARunnableS4S0201000_1(i, this, c4cm, 8));
        } else {
            LL(i, c4cm);
        }
        c4cm.setAdapter(this);
        c4cm.setItemViewCacheSize(14);
        c4cm.setHasFixedSize(true);
    }

    @Override // X.C8HS
    public final void setData(List<C105454Bx> list) {
        super.setData(list);
        Context context = this.LJLJL.getContext();
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return;
        }
        final C105664Cs c105664Cs = new C105664Cs(activity, this.LJLJL);
        c105664Cs.LIZLLL = this;
        final List<C105454Bx> data = getData();
        if (data != null) {
            C4CM c4cm = this.LJLJL;
            final VWD vwd = this.LJLJLJ;
            final int i = this.LJLLJ;
            c4cm.LJIIJ(new C0A5(c105664Cs, vwd, data, i) { // from class: X.4Cl
                public final C105664Cs LJLIL;
                public final VWD LJLILLLLZI;
                public final List<C105454Bx> LJLJI;
                public long LJLJJI;
                public final int LJLJJL;
                public int LJLJJLL;
                public float LJLJL;
                public float LJLJLJ;
                public final float LJLJLLL;
                public boolean LJLL;

                @Override // X.C0A5
                public final void LIZIZ(boolean z) {
                }

                public final void LIZLLL(VWD vwd2) {
                    Context context2 = vwd2.getContext();
                    while (!(context2 instanceof Activity)) {
                        if (context2 instanceof ContextWrapper) {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        } else {
                            return;
                        }
                    }
                    if (context2 == null) {
                        return;
                    }
                    vwd2.setSwipeEnabled(true);
                    this.LJLJJLL = -1;
                }

                @Override // X.C0A5
                public final void LIZ(RecyclerView rv, MotionEvent e) {
                    o.LJIIIZ(rv, "rv");
                    o.LJIIIZ(e, "e");
                    int action = e.getAction();
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3 || !this.LJLIL.isShowing()) {
                                return;
                            }
                            LIZLLL(this.LJLILLLLZI);
                            this.LJLIL.dismiss();
                            return;
                        }
                        if (!this.LJLIL.isShowing()) {
                            return;
                        }
                        C105664Cs c105664Cs2 = this.LJLIL;
                        Emoji emoji = ((C105454Bx) ListProtector.get(this.LJLJI, this.LJLJJLL)).LIZJ;
                        o.LJII(emoji, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                        c105664Cs2.LIZ((ImSysEmojiModel) emoji, e, null);
                        return;
                    }
                    if (!this.LJLIL.isShowing()) {
                        return;
                    }
                    C105664Cs c105664Cs3 = this.LJLIL;
                    Emoji emoji2 = ((C105454Bx) ListProtector.get(this.LJLJI, this.LJLJJLL)).LIZJ;
                    o.LJII(emoji2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                    c105664Cs3.LIZ((ImSysEmojiModel) emoji2, e, null);
                    LIZLLL(this.LJLILLLLZI);
                }

                @Override // X.C0A5
                public final boolean LIZJ(RecyclerView recyclerView, MotionEvent e) {
                    View LJJIJIIJI;
                    int absoluteAdapterPosition;
                    int i2;
                    o.LJIIIZ(recyclerView, "recyclerView");
                    o.LJIIIZ(e, "e");
                    if (!(recyclerView instanceof C4CM) || (LJJIJIIJI = recyclerView.LJJIJIIJI(e.getX(), e.getY())) == null) {
                        return false;
                    }
                    RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(LJJIJIIJI);
                    if (!(LJJJJJL instanceof C105564Ci) || (absoluteAdapterPosition = LJJJJJL.getAbsoluteAdapterPosition()) == -1) {
                        return false;
                    }
                    int action = e.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                if (action == 3 && this.LJLIL.isShowing()) {
                                    LIZLLL(this.LJLILLLLZI);
                                    this.LJLIL.dismiss();
                                }
                            } else {
                                if (Math.abs(e.getRawX() - this.LJLJL) > this.LJLJLLL || Math.abs(e.getRawY() - this.LJLJLJ) > this.LJLJLLL) {
                                    this.LJLL = true;
                                }
                                if (this.LJLL) {
                                    return false;
                                }
                                int i3 = this.LJLJJLL;
                                if (i3 != absoluteAdapterPosition) {
                                    this.LJLJJLL = -1;
                                    return false;
                                }
                                if (i3 != -1 && this.LJLJJI != 0 && System.currentTimeMillis() - this.LJLJJI > this.LJLJJL && !this.LJLIL.isShowing() && this.LJLJJLL == absoluteAdapterPosition) {
                                    LJJIJIIJI.performHapticFeedback(0);
                                    if (absoluteAdapterPosition <= this.LJLJI.size()) {
                                        C105664Cs c105664Cs2 = this.LJLIL;
                                        Emoji emoji = ((C105454Bx) ListProtector.get(this.LJLJI, absoluteAdapterPosition)).LIZJ;
                                        o.LJII(emoji, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                                        c105664Cs2.LIZ((ImSysEmojiModel) emoji, e, LJJIJIIJI);
                                    }
                                    C105664Cs c105664Cs3 = this.LJLIL;
                                    View contentView = c105664Cs3.getContentView();
                                    int width = c105664Cs3.getWidth();
                                    int i4 = 1073741824;
                                    if (width == -2) {
                                        i2 = 0;
                                    } else {
                                        i2 = 1073741824;
                                    }
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), i2);
                                    int height = c105664Cs3.getHeight();
                                    if (height == -2) {
                                        i4 = 0;
                                    }
                                    contentView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), i4));
                                    C105664Cs c105664Cs4 = this.LJLIL;
                                    c105664Cs4.getClass();
                                    Rect rect = new Rect();
                                    LJJIJIIJI.getGlobalVisibleRect(rect);
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("anchor  ");
                                    LIZ.append(rect);
                                    C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ));
                                    Rect rect2 = new Rect();
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("contentRect  ");
                                    LIZ2.append(rect2);
                                    C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ2));
                                    Rect rect3 = new Rect();
                                    c105664Cs4.LIZ.getWindow().getDecorView().getGlobalVisibleRect(rect3);
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("decorView  ");
                                    LIZ3.append(rect3);
                                    C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ3));
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("contentView.measuredWidth  ");
                                    LIZ4.append(c105664Cs4.getContentView().getMeasuredWidth());
                                    C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ4));
                                    int i5 = (-(c105664Cs4.getContentView().getMeasuredWidth() - LJJIJIIJI.getMeasuredWidth())) / 2;
                                    int measuredHeight = (-LJJIJIIJI.getMeasuredHeight()) - c105664Cs4.getContentView().getMeasuredHeight();
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("showAsDropDown   ");
                                    LIZ5.append(i5);
                                    LIZ5.append("  ");
                                    LIZ5.append(measuredHeight);
                                    C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ5));
                                    int i6 = measuredHeight - 21;
                                    if (C4XM.LIZ()) {
                                        C56308M8a.LIZ();
                                    }
                                    C46318IFu.LIZ.getClass();
                                    if (C46318IFu.LIZ()) {
                                        try {
                                            C56308M8a.LIZIZ();
                                            Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c105664Cs4));
                                            WindowManager.LayoutParams attributes = window.getAttributes();
                                            int i7 = attributes.flags;
                                            boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                                            C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                                            attributes.flags &= -16777217;
                                            c105664Cs4.showAsDropDown(LJJIJIIJI, i5, i6);
                                            C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                                            attributes.flags = i7;
                                        } catch (Throwable unused) {
                                            c105664Cs4.showAsDropDown(LJJIJIIJI, i5, i6);
                                        }
                                    } else {
                                        c105664Cs4.showAsDropDown(LJJIJIIJI, i5, i6);
                                    }
                                    this.LJLILLLLZI.setSwipeEnabled(false);
                                    return true;
                                }
                            }
                        } else {
                            LIZLLL(this.LJLILLLLZI);
                        }
                    } else {
                        this.LJLJL = e.getRawX();
                        this.LJLJLJ = e.getRawY();
                        this.LJLJJI = System.currentTimeMillis();
                        this.LJLJJLL = absoluteAdapterPosition;
                        this.LJLL = false;
                    }
                    return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    o.LJIIIZ(vwd, "viewPager");
                    this.LJLIL = c105664Cs;
                    this.LJLILLLLZI = vwd;
                    this.LJLJI = data;
                    this.LJLJJL = 150;
                    this.LJLJJLL = -1;
                    this.LJLJL = -1.0f;
                    this.LJLJLJ = -1.0f;
                    this.LJLJLLL = i / 2.0f;
                }
            });
        }
    }

    @Override // X.InterfaceC105584Ck
    public final void LJLLILLLL(ImSysEmojiModel imSysEmojiModel, String emoji) {
        o.LJIIIZ(emoji, "emoji");
        imSysEmojiModel.getPosition();
        List<C105454Bx> data = getData();
        if (data == null) {
            return;
        }
        Emoji emoji2 = ((C105454Bx) ListProtector.get(data, imSysEmojiModel.getPosition())).LIZJ;
        o.LJII(emoji2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
        ((ImSysEmojiModel) emoji2).setPreviewEmoji(emoji);
        LJLLLLLL().LIZLLL(emoji);
        notifyItemChanged(imSysEmojiModel.getPosition());
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter
    public final void LJZ(BaseEmojiGridAdapter<C105454Bx>.a aVar, int i) {
        List<C105454Bx> data = getData();
        if (data != null && (!data.isEmpty()) && aVar != null) {
            C105454Bx c105454Bx = (C105454Bx) ListProtector.get(data, i);
            C105564Ci c105564Ci = (C105564Ci) aVar;
            if (!TextUtils.isEmpty(c105454Bx.LIZIZ)) {
                if (c105564Ci.LJLILLLLZI == null) {
                    return;
                }
                Emoji emoji = c105454Bx.LIZJ;
                o.LJII(emoji, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                ImSysEmojiModel imSysEmojiModel = (ImSysEmojiModel) emoji;
                imSysEmojiModel.setPosition(i);
                c105564Ci.LJLILLLLZI.setText(imSysEmojiModel.getPreviewEmoji());
                c105564Ci.LJLILLLLZI.setContentDescription(this.LJLJI.getString(R.string.g25, c105454Bx.LIZIZ));
            }
            TextView textView = c105564Ci.LJLILLLLZI;
            if (textView != null) {
                textView.post(new ARunnableS37S0100000_1(aVar, 81));
            }
            View view = aVar.itemView;
            if (view != null) {
                C16880lQ.LJIIJ(new ACListenerS36S0200000_1(this, c105454Bx, 36), view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r1 == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL(int r10, androidx.recyclerview.widget.RecyclerView r11) {
        /*
            r9 = this;
            X.4Cf r0 = r9.LJLJLLL
            if (r0 == 0) goto L40
            boolean r1 = r0.LIZ
            r0 = 1
            if (r1 != r0) goto L40
        L9:
            r4 = -1
            if (r0 == 0) goto L2f
            X.4CD r5 = new X.4CD
            int r8 = r9.LJLLJ
            android.content.Context r0 = r9.LJLJI
            int r0 = X.KL2.LJIIJJI(r0)
            double r2 = (double) r0
            int r0 = r9.LJLLI
            double r0 = (double) r0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r6
            double r2 = r2 - r0
            int r8 = r8 * r10
            double r0 = (double) r8
            double r2 = r2 - r0
            int r0 = r10 + (-1)
            double r0 = (double) r0
            double r2 = r2 / r0
            int r1 = (int) r2
            int r0 = r9.LJLLILLLL
            r5.<init>(r10, r1, r0)
            r11.LJII(r5, r4)
        L2e:
            return
        L2f:
            X.4CD r3 = new X.4CD
            int r2 = r9.LJLIL
            int r1 = r9.LJZL()
            int r0 = r9.LJLLILLLL
            r3.<init>(r2, r1, r0)
            r11.LJII(r3, r4)
            goto L2e
        L40:
            r0 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105544Cg.LL(int, androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJI), R.layout.atm, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        return new C105564Ci(itemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105544Cg(LifecycleOwner owner, C4CM c4cm, VWD viewPager, C105534Cf c105534Cf, AqS167S0100000_1 aqS167S0100000_1) {
        super(owner);
        int LIZJ;
        Integer num;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(viewPager, "viewPager");
        this.LJLJJLL = owner;
        this.LJLJL = c4cm;
        this.LJLJLJ = viewPager;
        this.LJLJLLL = c105534Cf;
        this.LJLL = aqS167S0100000_1;
        this.LJLLI = (int) KL2.LIZJ(this.LJLJI, 14.0f);
        this.LJLLILLLL = (int) KL2.LIZJ(this.LJLJI, 24.0f);
        if (c105534Cf != null && (num = c105534Cf.LIZLLL) != null) {
            LIZJ = num.intValue();
        } else {
            LIZJ = (int) KL2.LIZJ(this.LJLJI, 29.0f);
        }
        this.LJLLJ = LIZJ;
    }
}
