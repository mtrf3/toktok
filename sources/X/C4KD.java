package X;

import Y.ACListenerS36S0200000_1;
import Y.AUListenerS65S0101000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4KD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KD {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C4KP.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C4KO.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C4KI.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C4KM.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C4KL.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C4KK.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C4KJ.LJLIL);
    public static final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C4KN.LJLIL);
    public static final C62822Ol8 LJIIL = C221108m2.LIZIZ(C4KH.LJLIL);
    public C4KE LIZIZ;
    public C1029242e LIZLLL;
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public final List<AbstractC105864Dm> LIZJ = new ArrayList();

    public static String LIZ(C4KD c4kd) {
        List<AbstractC105864Dm> actionList = c4kd.LIZJ;
        c4kd.getClass();
        o.LJIIIZ(actionList, "actionList");
        return ORZ.LLD(actionList, ", ", null, null, C105874Dn.LJLIL, 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45, types: [X.4KE, java.lang.Runnable] */
    public final C4S3 LIZIZ(final View messageView, final boolean z, final Rect recyclerViewRect, int i, final String str, final boolean z2, final boolean z3, final C4LI onEmojiSelected, final C4KQ c4kq, final int i2) {
        boolean z4;
        Rect LIZJ;
        boolean z5;
        ViewGroup viewGroup;
        View view;
        int i3;
        int i4;
        int i5;
        boolean z6;
        int i6;
        float scaleY;
        int i7;
        int max;
        int intValue;
        View view2;
        View findViewById;
        View findViewById2;
        C4KE c4ke;
        final int i8 = i;
        o.LJIIIZ(messageView, "messageView");
        o.LJIIIZ(recyclerViewRect, "recyclerViewRect");
        o.LJIIIZ(onEmojiSelected, "onEmojiSelected");
        if (c4kq != null && (c4ke = this.LIZIZ) != null) {
            this.LIZ.removeCallbacksAndMessages(c4ke);
        }
        C1029242e c1029242e = this.LIZLLL;
        if (c1029242e != null && c1029242e.LIZ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && i2 < 5) {
            ?? r2 = new Runnable() { // from class: X.4KE
                public final void LIZ() {
                    C4S3 LIZIZ = C4KD.this.LIZIZ(messageView, z, recyclerViewRect, i8, str, z2, z3, onEmojiSelected, c4kq, i2 + 1);
                    C4KQ c4kq2 = c4kq;
                    if (c4kq2 != null) {
                        c4kq2.LIZ(LIZIZ, C4KD.LIZ(C4KD.this));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            this.LIZIZ = r2;
            messageView.postDelayed(r2, 100L);
            return null;
        }
        if (!(messageView instanceof C4H9) || (LIZJ = ((C4H9) messageView).getCustomLongPressVisibleRect()) == null) {
            LIZJ = C73098SmU.LIZJ(messageView);
        }
        int i9 = LIZJ.top;
        int i10 = LIZJ.bottom;
        int height = messageView.getHeight() + i9;
        int i11 = recyclerViewRect.bottom;
        Context context = messageView.getContext();
        o.LJIIIIZZ(context, "messageView.context");
        if (i11 < (C63081OpJ.LJJJJJL(context) * 2) / 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i9 > i8 || i8 > i10) {
            i8 = i10;
        }
        ViewParent parent = messageView.getParent();
        if (parent instanceof ViewGroup) {
            do {
                viewGroup = (ViewGroup) parent;
                if (viewGroup == null) {
                    break;
                }
                if (viewGroup.findViewById(R.id.g2w) != null) {
                    break;
                }
                parent = viewGroup.getParent();
            } while (parent instanceof ViewGroup);
        }
        viewGroup = null;
        Object parent2 = messageView.getParent();
        if (parent2 instanceof ViewGroup) {
            View view3 = (View) parent2;
            while (view3 != null) {
                view = view3.findViewById(R.id.nn);
                if (view == null) {
                    Object parent3 = view3.getParent();
                    if (!(parent3 instanceof ViewGroup)) {
                        break;
                    }
                    view3 = (View) parent3;
                } else {
                    break;
                }
            }
        }
        view = null;
        if (viewGroup != null && (findViewById2 = viewGroup.findViewById(R.id.mzt)) != null && findViewById2.getVisibility() == 0) {
            Rect LIZJ2 = C73098SmU.LIZJ(findViewById2);
            if (LIZJ2.top > C4KF.LIZJ()) {
                i9 = Math.min(LIZJ2.top, i9);
            }
        }
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.g2w)) != null && findViewById.getVisibility() == 0) {
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            i10 = Math.max(rect.bottom, i10);
            i3 = findViewById.getHeight();
        } else {
            i3 = 0;
        }
        if (view != null && view.getVisibility() == 8) {
            i5 = ((Number) LJII.getValue()).intValue();
        } else {
            int intValue2 = ((Number) LJII.getValue()).intValue();
            if (view != null) {
                i4 = view.getHeight();
            } else {
                i4 = 0;
            }
            i5 = intValue2 - i4;
        }
        if (!z5 && z && (recyclerViewRect.bottom - height) - i3 <= i5 && messageView.getHeight() <= ((Number) LJIIIIZZ.getValue()).intValue()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (viewGroup != null) {
            i6 = viewGroup.getPaddingBottom();
        } else {
            i6 = 0;
        }
        int i12 = i5 - ((recyclerViewRect.bottom - height) - i3);
        ValueAnimator duration = ValueAnimator.ofInt(0, i12).setDuration(150L);
        o.LJIIIIZZ(duration, "ofInt(0, additionalPadding).setDuration(150)");
        if (z6) {
            duration.removeAllUpdateListeners();
            duration.addUpdateListener(new AUListenerS65S0101000_1(i6, viewGroup, 1));
            duration.start();
        }
        if (z) {
            Object parent4 = messageView.getParent();
            if ((parent4 instanceof View) && (view2 = (View) parent4) != null) {
                scaleY = view2.getScaleY();
            } else {
                scaleY = messageView.getScaleY();
            }
        } else {
            scaleY = messageView.getScaleY();
        }
        int height2 = (int) (((messageView.getHeight() / scaleY) - messageView.getHeight()) / 2);
        Context context2 = messageView.getContext();
        o.LJIIIIZZ(context2, "messageView.context");
        int LJJJJLI = C63081OpJ.LJJJJLI(context2);
        int LIZJ3 = (i9 - C4KF.LIZJ()) - LJJJJLI;
        if (z6) {
            i7 = i12;
        } else {
            i7 = 0;
        }
        int max2 = Math.max(LIZJ3 - i7, 0) - height2;
        if (z6 || z5) {
            max = (height - Math.max(i9, C4KF.LIZJ())) + i3;
            if (z6) {
                i8 -= i12;
            }
        } else {
            max = i10 - Math.max(i9, C4KF.LIZJ());
        }
        int max3 = Math.max(LJJJJLI - ((Number) LJFF.getValue()).intValue(), i8 - ((Number) LJI.getValue()).intValue()) - LJJJJLI;
        Context context3 = messageView.getContext();
        o.LJIIIIZZ(context3, "messageView.context");
        C4S3 c4s3 = new C4S3(context3, max2, max, max3, !z3, z2);
        c4s3.LJIILIIL = new C1030342p(this, z6, duration, viewGroup, i6);
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c4s3));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i13 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c4s3.showAtLocation(messageView, 0, 0, 0);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i13;
            } catch (Throwable unused) {
                c4s3.showAtLocation(messageView, 0, 0, 0);
            }
        } else {
            c4s3.showAtLocation(messageView, 0, 0, 0);
        }
        View findViewById3 = c4s3.LJII.findViewById(R.id.cuq);
        o.LJIIIIZZ(findViewById3, "emojiPanel.findViewById(…_selection_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        RecyclerView recyclerView2 = c4s3.LJIILJJIL;
        recyclerView.setAdapter(new AbstractC029409q<C4LG>(str, onEmojiSelected) { // from class: X.4LF
            public final String LJLIL;
            public final C4LI LJLILLLLZI;
            public final C62822Ol8 LJLJI;

            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return ((List) this.LJLJI.getValue()).size();
            }

            {
                o.LJIIIZ(onEmojiSelected, "callback");
                this.LJLIL = str;
                this.LJLILLLLZI = onEmojiSelected;
                this.LJLJI = C221108m2.LIZIZ(C4LJ.LJLIL);
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(C4LG c4lg, int i14) {
                Drawable LIZ;
                C4LG holder = c4lg;
                o.LJIIIZ(holder, "holder");
                String text = (String) ListProtector.get((List) this.LJLJI.getValue(), i14);
                o.LJIIIZ(text, "text");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                spannableStringBuilder.setSpan(new C156756Df(), 0, text.length(), 33);
                holder.LJLIL.setText(spannableStringBuilder.toString());
                holder.LJLILLLLZI = text;
                C4LI callback = this.LJLILLLLZI;
                o.LJIIIZ(callback, "callback");
                C16880lQ.LJJJJI(holder.LJLIL, new ACListenerS36S0200000_1(callback, holder, 59));
                boolean LJ2 = o.LJ(text, this.LJLIL);
                TuxTextView tuxTextView = holder.LJLIL;
                if (!LJ2) {
                    LIZ = null;
                } else {
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
                    c110614Vt.LIZJ = Float.valueOf(C1DF.LJIIIIZZ(8));
                    Context context4 = holder.LJLIL.getContext();
                    o.LJIIIIZZ(context4, "emojiView.context");
                    LIZ = c110614Vt.LIZ(context4);
                }
                tuxTextView.setBackground(LIZ);
            }

            @Override // X.AbstractC029409q
            public final C4LG onCreateViewHolder(ViewGroup parent5, int i14) {
                o.LJIIIZ(parent5, "parent");
                Context context4 = parent5.getContext();
                o.LJIIIIZZ(context4, "parent.context");
                TuxTextView tuxTextView = new TuxTextView(context4, null, 6, 0);
                tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(C17N.LJIILL(44.0d), C17N.LJIILL(44.0d)));
                tuxTextView.setTextAlignment(4);
                tuxTextView.setGravity(17);
                tuxTextView.LJJJ(28.0f);
                C4LG c4lg = new C4LG(tuxTextView);
                C0AX.LIZ(parent5, c4lg.itemView, R.id.lj7);
                View view4 = c4lg.itemView;
                if (view4 != null) {
                    view4.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent5));
                }
                try {
                    if (c4lg.itemView.getParent() != null) {
                        boolean z7 = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z7 = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused2) {
                        }
                        if (z7) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C4LG.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(parent5.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i14);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c4lg.itemView.getParent();
                            if (viewGroup2 != null) {
                                C16880lQ.LJLLL(c4lg.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C4LG.class.getName();
                return c4lg;
            }
        });
        final boolean LIZIZ = C90193gN.LIZIZ(recyclerView.getContext());
        AbstractC029409q adapter = recyclerView.getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionselector.IMReactionPanelEmojiAdapter");
        final int itemCount = adapter.getItemCount();
        recyclerView.LJII(new AbstractC030309z(itemCount, LIZIZ) { // from class: X.4KG
            public final int LJLIL;
            public final boolean LJLILLLLZI;

            {
                this.LJLIL = itemCount;
                this.LJLILLLLZI = LIZIZ;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect2, View view4, RecyclerView recyclerView3, C0AC c0ac) {
                T28.LJ(rect2, "outRect", view4, "view", recyclerView3, "parent", c0ac, "state");
                if (this.LJLILLLLZI) {
                    int LJJJJJ = RecyclerView.LJJJJJ(view4);
                    if (LJJJJJ == 0) {
                        rect2.right = C4KF.LIZIZ();
                        return;
                    } else if (LJJJJJ == this.LJLIL - 1) {
                        rect2.right = C4KF.LIZ();
                        rect2.left = C4KF.LIZIZ();
                        return;
                    } else {
                        rect2.right = C4KF.LIZ();
                        return;
                    }
                }
                int LJJJJJ2 = RecyclerView.LJJJJJ(view4);
                if (LJJJJJ2 == 0) {
                    rect2.left = C4KF.LIZIZ();
                } else if (LJJJJJ2 == this.LJLIL - 1) {
                    rect2.left = C4KF.LIZ();
                    rect2.right = C4KF.LIZIZ();
                } else {
                    rect2.left = C4KF.LIZ();
                }
            }
        }, -1);
        Object parent5 = recyclerView.getParent().getParent();
        o.LJII(parent5, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View view4 = (View) parent5;
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        AbstractC029409q adapter2 = recyclerView.getAdapter();
        o.LJII(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionselector.IMReactionPanelEmojiAdapter");
        if (adapter2.getItemCount() == 12) {
            intValue = ((Number) LJIIJJI.getValue()).intValue();
        } else {
            intValue = ((Number) LJIIL.getValue()).intValue();
        }
        layoutParams.width = intValue;
        view4.setLayoutParams(layoutParams);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        Context context4 = recyclerView2.getContext();
        o.LJIIIIZZ(context4, "actionRv.context");
        C105854Dl c105854Dl = new C105854Dl(context4);
        List<AbstractC105864Dm> list = this.LIZJ;
        o.LJIIIZ(list, "list");
        List LLJI = ORZ.LLJI(list);
        if (!C65777Prh.LJI(LLJI)) {
            LLJI = null;
        }
        ((ArrayList) c105854Dl.LJLILLLLZI).clear();
        if (LLJI != null) {
            ((ArrayList) c105854Dl.LJLILLLLZI).addAll(LLJI);
        }
        c105854Dl.notifyDataSetChanged();
        recyclerView2.setAdapter(c105854Dl);
        if (c4kq != null) {
            c4kq.LIZ(c4s3, LIZ(this));
        }
        return c4s3;
    }
}
