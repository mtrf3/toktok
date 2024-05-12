package com.bytedance.android.live.design.view.sheet.action;

import X.C0KE;
import X.C0KG;
import X.C0KI;
import X.C16340kY;
import X.C16360ka;
import X.C16880lQ;
import X.C259910h;
import X.C2A6;
import X.C30081Ga;
import X.C30091Gb;
import X.C30111Gd;
import X.C30131Gf;
import X.C47091t3;
import X.InterfaceC16710l9;
import Y.IDCListenerS83S0200000;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class LiveActionSheetDialog extends LiveFixedHeightSheetDialog {
    public static final /* synthetic */ int LLFZ = 0;
    public LinearLayout LL;
    public View LLD;
    public TextView LLF;
    public final List<C30081Ga> LLFF;
    public CharSequence LLFFF;
    public C30091Gb LLFII;

    @Override // com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJJIIJ() {
        View view = this.LLD;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (((ArrayList) this.LLFF).size() > 0 && ((ArrayList) ((C30081Ga) ListProtector.get(this.LLFF, 0)).LIZIZ).size() > 0) {
                C0KG c0kg = ((C30091Gb) ListProtector.get(((C30081Ga) ListProtector.get(this.LLFF, 0)).LIZIZ, 0)).LIZIZ;
                if (TextUtils.isEmpty(this.LLFFF) && (c0kg instanceof C30131Gf) && ((C30131Gf) c0kg).LIZLLL != null) {
                    marginLayoutParams.topMargin = this.LLD.getContext().getResources().getDimensionPixelSize(R.dimen.xk);
                    this.LLD.setLayoutParams(marginLayoutParams);
                }
            }
            marginLayoutParams.topMargin = 0;
            this.LLD.setLayoutParams(marginLayoutParams);
        }
    }

    public final void LJJIIJZLJL() {
        if (this.LLF != null) {
            if (!TextUtils.isEmpty(this.LLFFF)) {
                this.LLF.setText(this.LLFFF);
                this.LLF.setVisibility(0);
            } else {
                this.LLF.setVisibility(8);
            }
        }
        LJJIIJ();
    }

    public final int LJJIIZI(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((ArrayList) ((C30081Ga) ListProtector.get(this.LLFF, i3)).LIZIZ).size() * 2;
        }
        return i2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C16880lQ.LLLZIIL(R.layout.bpk, getLayoutInflater(), null), new ViewGroup.LayoutParams(-1, -2));
        this.LLF = (TextView) findViewById(R.id.ot);
        this.LL = (LinearLayout) findViewById(R.id.oq);
        final int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.xj);
        final int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.xc);
        C16360ka.LJIJJ(this.LL, new InterfaceC16710l9() { // from class: X.1TS
            @Override // X.InterfaceC16710l9
            public final C16800lI LIZ(View view, C16800lI c16800lI) {
                int i = dimensionPixelSize;
                int i2 = dimensionPixelSize2;
                if (view != null) {
                    if (c16800lI.LIZ.LJIIIZ().LIZLLL <= 0) {
                        i = i2;
                    }
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
                }
                return c16800lI;
            }
        });
        C16340kY.LIZJ(this.LL);
        View findViewById = findViewById(R.id.os);
        this.LLD = findViewById;
        if (this.LLF == null || this.LL == null || findViewById == null) {
            return;
        }
        LJJIIJZLJL();
        for (int i = 0; i < ((ArrayList) this.LLFF).size(); i++) {
            LJJII(i, LJJIIZI(i), (C30081Ga) ListProtector.get(this.LLFF, i));
        }
        LinearLayout linearLayout = this.LL;
        if (linearLayout == null || this.LLFII == null) {
            return;
        }
        LJJIII(linearLayout.getChildCount(), this.LLFII);
        LJJIFFI(false, this.LL.getChildCount(), this.LLFII);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C18Z, android.app.Dialog
    public final void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C18Z, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.LLFFF = charSequence;
        LJJIIJZLJL();
    }

    public LiveActionSheetDialog(Context context, C2A6 c2a6) {
        super(context, c2a6);
        List<C0KG> list;
        boolean z;
        this.LLFF = new ArrayList();
        this.LLFFF = null;
        List<C0KI> list2 = c2a6.LIZJ;
        if (list2 != null && !((ArrayList) list2).isEmpty()) {
            Iterator it = ((ArrayList) c2a6.LIZJ).iterator();
            while (it.hasNext()) {
                C0KI c0ki = (C0KI) it.next();
                int size = ((ArrayList) this.LLFF).size();
                if (size >= 0 && size <= ((ArrayList) this.LLFF).size() && c0ki != null && (list = c0ki.LIZIZ) != null && !list.isEmpty()) {
                    C30081Ga c30081Ga = new C30081Ga();
                    Iterator<C0KG> it2 = c0ki.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) c30081Ga.LIZIZ).add(new C30091Gb(it2.next()));
                    }
                    if (size == ((ArrayList) this.LLFF).size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ListProtector.add(this.LLFF, size, c30081Ga);
                    if (this.LL != null) {
                        if (z && size > 0) {
                            LJJIII(LJJIIZI(size) - 1, (C0KE) ListProtector.get(this.LLFF, size - 1));
                        }
                        LJJII(size, LJJIIZI(size), c30081Ga);
                    }
                    LJJIIJ();
                }
            }
        }
        C30111Gd c30111Gd = c2a6.LIZLLL;
        if (c30111Gd != null) {
            this.LLFII = new C30091Gb(c30111Gd);
        }
    }

    public final void LJJIII(int i, C0KE c0ke) {
        if (c0ke.LIZ == null) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.y3)));
            view.setBackgroundColor(C259910h.LIZIZ(R.attr.bmi, view.getContext()));
            this.LL.addView(view, i);
            c0ke.LIZ = view;
        }
    }

    public final void LJJIIZ(C0KG c0kg, C47091t3 c47091t3) {
        if (c0kg instanceof C30131Gf) {
            c47091t3.setIcon(((C30131Gf) c0kg).LIZLLL);
        }
        c47091t3.setText(c0kg.LIZ);
        C16880lQ.LJJIFFI(c47091t3, new IDCListenerS83S0200000(c0kg, this, 9));
        c47091t3.setEnabled(true);
        int i = c0kg.LIZIZ;
        c47091t3.LJLJI.LLLLZLLIL(i);
        c47091t3.LJLJL.LLLLZLLIL(i);
    }

    public LiveActionSheetDialog(Context context, int i) {
        super(context, i);
        this.LLFF = new ArrayList();
    }

    public final void LJJIFFI(boolean z, int i, C30091Gb c30091Gb) {
        C0KG c0kg = c30091Gb.LIZIZ;
        C47091t3 c47091t3 = new C47091t3(getContext(), null);
        c47091t3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LJJIIZ(c0kg, c47091t3);
        this.LL.addView(c47091t3, i);
        c30091Gb.LIZJ = c47091t3;
        if (z) {
            int i2 = i + 1;
            if (c30091Gb.LIZ == null) {
                View view = new View(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.wx));
                C0KG c0kg2 = c30091Gb.LIZIZ;
                if ((c0kg2 instanceof C30131Gf) && ((C30131Gf) c0kg2).LIZLLL != null) {
                    int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.xi);
                    layoutParams.rightMargin = dimensionPixelSize;
                    layoutParams.leftMargin = dimensionPixelSize;
                }
                view.setLayoutParams(layoutParams);
                view.setBackgroundColor(C259910h.LIZIZ(R.attr.bn5, view.getContext()));
                this.LL.addView(view, i2);
                c30091Gb.LIZ = view;
            }
        }
    }

    public final void LJJII(int i, int i2, C30081Ga c30081Ga) {
        List<C30091Gb> list = c30081Ga.LIZIZ;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            boolean z = true;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i3 >= ((ArrayList) c30081Ga.LIZIZ).size() - 1) {
                z = false;
            }
            LJJIFFI(z, i2, (C30091Gb) ListProtector.get(arrayList, i3));
            i2 += 2;
            i3++;
        }
        if (i < ((ArrayList) this.LLFF).size() - 1) {
            LJJIII(LJJIIZI(i + 1) - 1, c30081Ga);
        }
    }
}
