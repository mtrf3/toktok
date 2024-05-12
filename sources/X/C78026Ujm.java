package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ujm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78026Ujm extends CZA<C78025Ujl, C78027Ujn> {
    public final int LIZLLL;
    public final InterfaceC65784Pro<Object> LJ;

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C78027Ujn holder = (C78027Ujn) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            C16880lQ.LJIIJ(null, holder.itemView);
            CountDownTimerC77998UjK countDownTimerC77998UjK = holder.LL;
            if (countDownTimerC77998UjK != null) {
                countDownTimerC77998UjK.cancel();
            }
            CountDownTimerC77998UjK countDownTimerC77998UjK2 = holder.LL;
            if (countDownTimerC77998UjK2 == null) {
                return;
            }
            countDownTimerC77998UjK2.LIZ = null;
        }
    }

    public C78026Ujm(int i, AqS163S0100000_13 aqS163S0100000_13) {
        super(R.layout.d9d, Boolean.FALSE);
        this.LIZLLL = i;
        this.LJ = aqS163S0100000_13;
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        Text text;
        boolean z;
        boolean z2;
        boolean z3;
        C78027Ujn holder = (C78027Ujn) viewHolder;
        C78025Ujl data = (C78025Ujl) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        int i = this.LIZLLL;
        InterfaceC65784Pro<Object> callback = this.LJ;
        o.LJIIIZ(callback, "callback");
        Text text2 = null;
        if (holder.LJLLLL != i) {
            holder.LJLLLL = i;
            holder.LJLLLLLL = false;
            holder.LJLZ = false;
            holder.LJZ = false;
            holder.LJZI = true;
            C78029Ujp c78029Ujp = new C78029Ujp(holder, callback);
            holder.LJZL = data.LIZJ;
            CountDownTimerC77998UjK countDownTimerC77998UjK = holder.LL;
            if (countDownTimerC77998UjK != null) {
                countDownTimerC77998UjK.cancel();
            }
            CountDownTimerC77998UjK countDownTimerC77998UjK2 = holder.LL;
            if (countDownTimerC77998UjK2 != null) {
                countDownTimerC77998UjK2.LIZ = null;
            }
            CountDownTimerC77998UjK countDownTimerC77998UjK3 = new CountDownTimerC77998UjK(holder.LJZL * 1000);
            countDownTimerC77998UjK3.start();
            countDownTimerC77998UjK3.LIZ = c78029Ujp;
            holder.LL = countDownTimerC77998UjK3;
        }
        TextView textView = holder.LJLIL;
        RankListV2Response.BriefDescription briefDescription = data.LIZIZ;
        if (briefDescription != null) {
            text = briefDescription.title;
        } else {
            text = null;
        }
        String obj2 = CXJ.LJFF(text, "").toString();
        boolean z4 = C31512CYi.LIZIZ;
        C78934UyQ.LJJIIJZLJL(textView, obj2, z4);
        C78934UyQ.LJJIIJZLJL(holder.LJLILLLLZI, C15380j0.LJIILL(R.string.ooi, Integer.valueOf(data.LJII)), z4);
        TextView textView2 = holder.LJLJI;
        RankListV2Response.BriefDescription briefDescription2 = data.LIZIZ;
        if (briefDescription2 != null) {
            text2 = briefDescription2.rule;
        }
        C78934UyQ.LJJIIJZLJL(textView2, CXJ.LJFF(text2, "").toString(), z4);
        int i2 = data.LJI;
        if (i2 != 1) {
            if (i2 != 2) {
                C15620jO.LIZ(holder.LJLJJLL, R.drawable.d2c);
            } else {
                C15620jO.LIZ(holder.LJLJJLL, R.drawable.d2e);
            }
        } else {
            C15620jO.LIZ(holder.LJLJJLL, R.drawable.d2c);
        }
        holder.LJLJJLL.setVisibility(0);
        int i3 = data.LJFF;
        if (i3 != 2) {
            if (i3 == 3) {
                holder.LJLJL.setVisibility(8);
                holder.LJLIL.setVisibility(0);
                holder.LJLILLLLZI.setTextColor(C15380j0.LIZIZ(R.color.cn));
                holder.LJLJI.setTextColor(C15380j0.LIZIZ(R.color.cn));
                ImageView imageView = holder.LJLJJI;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C15380j0.LIZ(4.0f);
                    imageView.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
        } else {
            holder.LJLJL.setVisibility(0);
            holder.LJLIL.setVisibility(8);
            holder.LJLILLLLZI.setTextColor(C15380j0.LIZIZ(R.color.ck));
            holder.LJLJI.setTextColor(C15380j0.LIZIZ(R.color.cs));
            ImageView imageView2 = holder.LJLJJI;
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = C15380j0.LIZ(5.0f);
                imageView2.setLayoutParams(marginLayoutParams2);
                long j = holder.LJZL;
                long j2 = 86400;
                long j3 = j / j2;
                long j4 = j % j2;
                long j5 = 3600;
                long j6 = j4 / j5;
                long j7 = j4 % j5;
                long j8 = 60;
                long j9 = j7 / j8;
                long j10 = j7 % j8;
                holder.LJLJLJ.setText(C78027Ujn.L(j3));
                holder.LJLLI.setText(C78027Ujn.L(j9));
                if (C15380j0.LJIIZILJ()) {
                    holder.LJLL.setText(C78027Ujn.L(j10));
                    holder.LJLLILLLL.setText(C78027Ujn.L(j6));
                } else {
                    holder.LJLL.setText(C78027Ujn.L(j6));
                    holder.LJLLILLLL.setText(C78027Ujn.L(j10));
                }
                holder.LJLJLLL.setText(C15380j0.LJII(R.plurals.qa, (int) j3));
                holder.LJLLJ.setText(":");
                holder.LJLLL.setText(":");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (holder.LJZI) {
            int i4 = data.LJ;
            long j11 = data.LIZLLL;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.H2;
                        Boolean LIZ = c30554Byw.LIZ();
                        if (LIZ != null) {
                            z3 = LIZ.booleanValue();
                        } else {
                            z3 = false;
                        }
                        holder.LJZ = z3;
                        if (z3 && !C78027Ujn.N(i4, j11)) {
                            holder.LJZ = false;
                        }
                        if (!holder.LJZ) {
                            c30554Byw.LIZJ(Boolean.TRUE);
                        }
                    }
                } else {
                    C30554Byw<Boolean> c30554Byw2 = InterfaceC30442Bx8.G2;
                    Boolean LIZ2 = c30554Byw2.LIZ();
                    if (LIZ2 != null) {
                        z2 = LIZ2.booleanValue();
                    } else {
                        z2 = false;
                    }
                    holder.LJLZ = z2;
                    if (z2 && !C78027Ujn.N(i4, j11)) {
                        holder.LJLZ = false;
                    }
                    if (!holder.LJLZ) {
                        c30554Byw2.LIZJ(Boolean.TRUE);
                    }
                }
            } else {
                C30554Byw<Boolean> c30554Byw3 = InterfaceC30442Bx8.F2;
                Boolean LIZ3 = c30554Byw3.LIZ();
                if (LIZ3 != null) {
                    z = LIZ3.booleanValue();
                } else {
                    z = false;
                }
                holder.LJLLLLLL = z;
                if (z && !C78027Ujn.N(i4, j11)) {
                    holder.LJLLLLLL = false;
                }
                if (!holder.LJLLLLLL) {
                    c30554Byw3.LIZJ(Boolean.TRUE);
                }
            }
            holder.LJZI = false;
        }
        int i5 = data.LJ;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    if (!holder.LJZ) {
                        holder.P();
                    } else {
                        holder.M();
                    }
                }
            } else if (!holder.LJLZ) {
                holder.P();
            } else {
                holder.M();
            }
        } else if (!holder.LJLLLLLL) {
            holder.P();
        } else {
            holder.M();
        }
        C16880lQ.LJIIJ(new C78028Ujo(holder, data, callback), holder.itemView);
    }

    @Override // X.CZA
    public final C78027Ujn LJI(View view, ViewGroup viewGroup) {
        return new C78027Ujn(view);
    }
}
