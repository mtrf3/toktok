package X;

import Y.ACListenerS31S0300000_5;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import uw.c0;

/* loaded from: classes6.dex */
public final class CUU<MODEL extends c0<? extends CR6>> extends CSE<MODEL> {
    public final TextView LJLZ;
    public final TextView LJZ;
    public final View LJZI;
    public final View LJZL;
    public final View LL;

    @Override // X.CSE
    public final View N() {
        View findViewById = this.itemView.findViewById(R.id.bq4);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.common_layout)");
        return findViewById;
    }

    @Override // X.CSE, X.CSF
    public final void onViewDetachedFromWindow() {
        ViewGroup viewGroup;
        super.onViewDetachedFromWindow();
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C03510Bv.LIZIZ(viewGroup);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CUU(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        TextView textView = (TextView) itemView.findViewById(R.id.lpq);
        this.LJLZ = textView;
        this.LJZ = (TextView) itemView.findViewById(R.id.lpp);
        this.LJZI = itemView.findViewById(R.id.lss);
        this.LJZL = itemView.findViewById(R.id.lst);
        this.LL = itemView.findViewById(R.id.lsr);
        Drawable LIZIZ = C04270Et.LIZIZ(itemView.getContext(), R.drawable.dci);
        if (LIZIZ != null) {
            LIZIZ.setBounds(0, 0, C15380j0.LIZ(12.0f), C15380j0.LIZ(12.0f));
        } else {
            LIZIZ = null;
        }
        textView.setCompoundDrawablesRelative(LIZIZ, null, null, null);
    }

    public final void Q(MODEL model) {
        boolean z;
        C018905p c018905p;
        C018905p c018905p2;
        C018905p c018905p3;
        C018905p c018905p4;
        C018905p c018905p5;
        C018905p c018905p6;
        C018905p c018905p7;
        CU2 LJJLI = model.LJJLI();
        if (LJJLI != null && LJJLI.LIZ) {
            z = true;
        } else {
            z = false;
        }
        User user = null;
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
            if ((layoutParams instanceof C018905p) && (c018905p7 = (C018905p) layoutParams) != null) {
                c018905p7.bottomToBottom = -1;
                this.LJLJLLL.setLayoutParams(c018905p7);
            }
            ViewGroup.LayoutParams layoutParams2 = this.LJZ.getLayoutParams();
            if ((layoutParams2 instanceof C018905p) && (c018905p6 = (C018905p) layoutParams2) != null) {
                c018905p6.topToBottom = R.id.text;
                this.LJZ.setLayoutParams(c018905p6);
            }
            ViewGroup.LayoutParams layoutParams3 = this.LJZI.getLayoutParams();
            if ((layoutParams3 instanceof C018905p) && (c018905p5 = (C018905p) layoutParams3) != null) {
                c018905p5.topToTop = -1;
                c018905p5.bottomToBottom = R.id.ecz;
                c018905p5.setMarginEnd(C15380j0.LIZ(1.0f));
                ((ViewGroup.MarginLayoutParams) c018905p5).bottomMargin = C15380j0.LIZ(1.0f);
                c018905p5.startToStart = -1;
                c018905p5.endToEnd = R.id.ecz;
                this.LJZI.setLayoutParams(c018905p5);
            }
            if (model.LJJLJ() != null) {
                this.LJZI.setVisibility(0);
                this.LJLL.setCutoutRadius(C15380j0.LIZ(8.0f));
                this.LJLL.setCutoutStartOffset(C15380j0.LIZ(12.0f));
                this.LJLL.setCutoutTopOffset(C15380j0.LIZ(12.0f));
            } else {
                this.LJZI.setVisibility(4);
                this.LJLL.setCutoutRadius(0.0f);
                this.LJLL.setCutoutStartOffset(0.0f);
                this.LJLL.setCutoutTopOffset(0.0f);
            }
            this.LJZ.setVisibility(0);
            CQQ cqq = this.LJLILLLLZI;
            if (cqq != null && cqq.LJFF) {
                TextView textView = this.LJZ;
                textView.setText(textView.getContext().getResources().getString(R.string.mdg, C13670gF.LIZJ().LJFF(C05170If.LIZ(model.getUser()))));
            } else {
                TextView textView2 = this.LJZ;
                Resources resources = textView2.getContext().getResources();
                Object[] objArr = new Object[1];
                C13670gF LIZJ = C13670gF.LIZJ();
                CQQ cqq2 = this.LJLILLLLZI;
                if (cqq2 != null) {
                    user = cqq2.LJII;
                }
                objArr[0] = LIZJ.LJFF(C05170If.LIZ(user));
                textView2.setText(resources.getString(R.string.mdi, objArr));
            }
            this.LJLZ.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = this.LJLJLLL.getLayoutParams();
        if ((layoutParams4 instanceof C018905p) && (c018905p4 = (C018905p) layoutParams4) != null) {
            c018905p4.bottomToBottom = 0;
            this.LJLJLLL.setLayoutParams(c018905p4);
        }
        ViewGroup.LayoutParams layoutParams5 = this.LJZ.getLayoutParams();
        if ((layoutParams5 instanceof C018905p) && (c018905p3 = (C018905p) layoutParams5) != null) {
            c018905p3.topToBottom = 0;
            this.LJZ.setLayoutParams(c018905p3);
        }
        this.LJZI.setVisibility(4);
        this.LJZ.setVisibility(8);
        this.LJLL.setCutoutRadius(0.0f);
        CQQ cqq3 = this.LJLILLLLZI;
        if (cqq3 != null && cqq3.LJFF) {
            ViewGroup.LayoutParams layoutParams6 = this.LJZI.getLayoutParams();
            if ((layoutParams6 instanceof C018905p) && (c018905p2 = (C018905p) layoutParams6) != null) {
                c018905p2.topToTop = R.id.lpq;
                c018905p2.bottomToBottom = R.id.lpq;
                c018905p2.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) c018905p2).bottomMargin = 0;
                c018905p2.startToStart = R.id.lpq;
                c018905p2.endToEnd = -1;
                this.LJZI.setLayoutParams(c018905p2);
            }
            this.LJLZ.setVisibility(0);
            return;
        }
        ViewGroup.LayoutParams layoutParams7 = this.LJZI.getLayoutParams();
        if ((layoutParams7 instanceof C018905p) && (c018905p = (C018905p) layoutParams7) != null) {
            c018905p.topToTop = -1;
            c018905p.bottomToBottom = R.id.ecz;
            c018905p.setMarginEnd(C15380j0.LIZ(1.0f));
            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C15380j0.LIZ(1.0f);
            c018905p.startToStart = -1;
            c018905p.endToEnd = R.id.ecz;
            this.LJZI.setLayoutParams(c018905p);
        }
        this.LJLZ.setVisibility(8);
    }

    @Override // X.CSF
    public final void M(CQQ cqq, CRD crd, List payloads) {
        Object obj;
        CU2 LJJLI;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        CQO model = (CQO) crd;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(payloads, "payloads");
        super.M(cqq, model, payloads);
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
            C03510Bv.LIZIZ(viewGroup2);
        }
        Iterator it = payloads.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof CU4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            View view2 = this.itemView;
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                C1CT c1ct = new C1CT();
                C1CR c1cr = new C1CR();
                c1cr.LJLJJLL.add(this.LJLJLLL);
                c1cr.LJLJI = 200L;
                c1ct.LJJIJL(c1cr);
                C40581iY c40581iY = new C40581iY();
                c40581iY.LJLJJLL.add(this.LJZ);
                c40581iY.LJLJI = 200L;
                c1ct.LJJIJL(c40581iY);
                C40241i0 c40241i0 = new C40241i0(1);
                c40241i0.LJLJJLL.add(this.LJZI);
                c40241i0.LJLJI = 200L;
                c1ct.LJJIJL(c40241i0);
                C03510Bv.LIZ(viewGroup, c1ct);
            }
        }
        if (!cqq.LJFF || cqq.LIZIZ() != 2 || ((LJJLI = model.LJJLI()) != null && LJJLI.LIZ)) {
            C16880lQ.LJIJI(this.LJLZ, null);
        } else {
            C16880lQ.LJIJI(this.LJLZ, new ACListenerS31S0300000_5(cqq, model, this, 33));
        }
        Q(model);
    }
}
