package X;

import Y.ACListenerS37S0200000_2;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5iO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142405iO implements InterfaceC82688Wcm, InterfaceC82689Wcn {
    public final Context LIZ;
    public final List<C136305Wo> LIZIZ;
    public final InterfaceC142415iP LIZJ;
    public final WHL LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final LinearLayout LJI;
    public InterfaceC82683Wch LJII;
    public boolean LJIIIIZZ;

    public final void LIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJII;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public final boolean LIZJ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJII;
        if (interfaceC82683Wch != null) {
            return interfaceC82683Wch.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC82688Wcm
    public final void onDismiss() {
        if (this.LJIIIIZZ) {
            this.LJIIIIZZ = false;
        } else {
            this.LIZJ.onCancel();
        }
    }

    @Override // X.InterfaceC82689Wcn
    public final void onShow() {
        this.LIZJ.onShow();
    }

    public final void LIZIZ(List<C136305Wo> list) {
        String string;
        LinearLayout linearLayout;
        int i = 0;
        int i2 = 0;
        for (C136305Wo c136305Wo : list) {
            i2++;
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.LJFF);
            LinearLayout linearLayout2 = new LinearLayout(this.LIZ);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            Context context = linearLayout2.getContext();
            o.LJIIIIZZ(context, "context");
            linearLayout2.setMinimumWidth((int) C74275TDb.LIZIZ(context, 156.0f));
            if (c136305Wo.LJLJLJ) {
                linearLayout2.setAlpha(1.0f);
            } else {
                linearLayout2.setAlpha(0.4f);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart((int) c136305Wo.LJLL.getFirst().floatValue());
            layoutParams2.setMarginEnd((int) c136305Wo.LJLL.getSecond().floatValue());
            TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, i);
            tuxTextView.setTextColorRes(c136305Wo.LJLJI);
            tuxTextView.setTuxFont(42);
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView.setMinimumWidth((int) C74275TDb.LIZIZ(context2, 104.0f));
            Context context3 = tuxTextView.getContext();
            o.LJIIIIZZ(context3, "context");
            tuxTextView.setMaxWidth((int) C74275TDb.LIZIZ(context3, 198.0f));
            tuxTextView.setMaxLines(1);
            tuxTextView.setGravity(16);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setText(tuxTextView.getContext().getString(c136305Wo.LJLILLLLZI));
            Context context4 = tuxTextView.getContext();
            o.LJIIIIZZ(context4, "context");
            if (c136305Wo.LJLJLLL) {
                if (LIZLLL(context4, tuxTextView)) {
                    tuxTextView.setTuxFont(62);
                }
            } else {
                tuxTextView.measure((int) C74275TDb.LIZIZ(context4, 198.0f), View.MeasureSpec.makeMeasureSpec(0, LiveLayoutPreloadThreadPriority.DEFAULT));
                tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                Layout layout = tuxTextView.getLayout();
                if (layout != null && layout.getEllipsisCount(tuxTextView.getLineCount() - 1) > 0) {
                    tuxTextView.setTuxFont(62);
                }
            }
            tuxTextView.setLayoutParams(layoutParams2);
            if (c136305Wo.LJLJLLL) {
                if (LIZLLL(this.LIZ, tuxTextView)) {
                    string = this.LIZ.getString(c136305Wo.LJLILLLLZI);
                    o.LJIIIIZZ(string, "context.getString(item.textId)");
                    float LIZIZ = C74275TDb.LIZIZ(this.LIZ, 172.0f);
                    int length = string.length();
                    while (true) {
                        length--;
                        if (length <= 0) {
                            break;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        String substring = string.substring(0, length);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        LIZ.append(substring);
                        LIZ.append("...");
                        String str = X1D.LIZIZ(LIZ);
                        o.LJIIIZ(str, "str");
                        tuxTextView.setText(str);
                        tuxTextView.measure(0, 0);
                        if (tuxTextView.getMeasuredWidth() <= LIZIZ) {
                            string = str;
                            break;
                        }
                    }
                } else {
                    string = this.LIZ.getString(c136305Wo.LJLILLLLZI);
                    o.LJIIIIZZ(string, "{\n            context.ge…ng(item.textId)\n        }");
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_arrow_up_right_in_rec_ltr;
                c2068389v.LJ = Integer.valueOf(R.attr.dl);
                c2068389v.LIZJ = (int) C74275TDb.LIZIZ(this.LIZ, 14.0f);
                c2068389v.LIZIZ = (int) C74275TDb.LIZIZ(this.LIZ, 14.0f);
                C8FR LIZIZ2 = c2068389v.LIZIZ(2, this.LIZ);
                SpannableString spannableString = new SpannableString(C42398GkU.LIZIZ(string, '$'));
                if (s.LJJJLZIJ(string, "...", false)) {
                    LIZIZ2.LIZIZ(0, 0, C74275TDb.LJFF(this.LIZ));
                } else {
                    LIZIZ2.LIZIZ((int) C74275TDb.LIZIZ(this.LIZ, 4.0f), 0, C74275TDb.LJFF(this.LIZ));
                }
                spannableString.setSpan(LIZIZ2, spannableString.length() - 1, spannableString.length(), 33);
                tuxTextView.setText(spannableString);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) C74275TDb.LIZIZ(this.LIZ, 20.0f), (int) C74275TDb.LIZIZ(this.LIZ, 20.0f));
            if (C74275TDb.LJFF(this.LIZ)) {
                layoutParams3.setMarginEnd((int) C74275TDb.LIZIZ(this.LIZ, 12.0f));
            } else {
                layoutParams3.setMarginStart((int) C74275TDb.LIZIZ(this.LIZ, 12.0f));
            }
            if (c136305Wo.LJLIL > 0) {
                TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
                tuxIconView.setIconRes(c136305Wo.LJLIL);
                tuxIconView.setTintColorRes(c136305Wo.LJLJJI);
                tuxIconView.setLayoutParams(layoutParams3);
                tuxIconView.setLayoutDirection(0);
                linearLayout2.addView(tuxIconView, 0);
                linearLayout2.addView(tuxTextView, 1);
            } else {
                linearLayout2.addView(tuxTextView);
            }
            linearLayout2.setClickable(true);
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS37S0200000_2(c136305Wo, this, 12));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) C74275TDb.LIZIZ(this.LIZ, 0.5f));
            View view = new View(this.LIZ);
            view.setLayoutParams(layoutParams4);
            Integer LJI = C79045V0n.LJI(R.attr.dh, this.LIZ);
            if (LJI != null) {
                view.setBackgroundColor(LJI.intValue());
            }
            LinearLayout linearLayout3 = this.LJI;
            if (linearLayout3 != null) {
                linearLayout3.addView(linearLayout2);
            }
            if (i2 != list.size() && (linearLayout = this.LJI) != null) {
                linearLayout.addView(view);
            }
        }
    }

    public final void LJ(View anchorView) {
        ViewParent parent;
        ViewGroup viewGroup;
        o.LJIIIZ(anchorView, "anchorView");
        if (LIZJ()) {
            return;
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null && (parent = linearLayout.getParent()) != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LJI, viewGroup);
        }
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d_, this.LIZ);
        C142425iQ c142425iQ = new C142425iQ(this.LIZ);
        c142425iQ.LIZ.LIZIZ = anchorView;
        c142425iQ.LIZ.LJIIIIZZ = C7MY.LIZIZ(8);
        LinearLayout linearLayout2 = this.LJI;
        o.LJII(linearLayout2, "null cannot be cast to non-null type android.view.View");
        C82682Wcg c82682Wcg = c142425iQ.LIZ;
        c82682Wcg.LJIJ = linearLayout2;
        c82682Wcg.LJIIL = false;
        c82682Wcg.LJIIJ = 200L;
        c142425iQ.LJIIIIZZ(LJIIIIZZ);
        c142425iQ.LJIIJ(null, true);
        c142425iQ.LJI(this.LIZLLL);
        C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
        c82682Wcg2.LJII = -1001L;
        c82682Wcg2.LJFF = this.LJ;
        InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
        this.LJII = LIZJ;
        LIZJ.LJ(this);
        InterfaceC82683Wch interfaceC82683Wch = this.LJII;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.LIZIZ(this);
        }
        InterfaceC82683Wch interfaceC82683Wch2 = this.LJII;
        if (interfaceC82683Wch2 != null) {
            interfaceC82683Wch2.show();
        }
    }

    public final void LJFF(List<C136305Wo> list) {
        if (this.LIZIZ.containsAll(list) && list.containsAll(this.LIZIZ)) {
            return;
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LIZIZ(list);
    }

    public static boolean LIZLLL(Context context, TuxTextView tuxTextView) {
        tuxTextView.measure((int) C74275TDb.LIZIZ(context, 180.0f), View.MeasureSpec.makeMeasureSpec(0, LiveLayoutPreloadThreadPriority.DEFAULT));
        tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
        Layout layout = tuxTextView.getLayout();
        if (layout == null || layout.getEllipsisCount(tuxTextView.getLineCount() - 1) <= 0) {
            return false;
        }
        return true;
    }

    public C142405iO(Context context, List<C136305Wo> list, InterfaceC142415iP clickListener, WHL position, int i, int i2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(clickListener, "clickListener");
        o.LJIIIZ(position, "position");
        this.LIZ = context;
        this.LIZIZ = list;
        this.LIZJ = clickListener;
        this.LIZLLL = position;
        this.LJ = i;
        this.LJFF = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C74275TDb.LIZIZ(context, 156.0f));
        linearLayout.setGravity(16);
        this.LJI = linearLayout;
        LIZIZ(list);
    }
}
