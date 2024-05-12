package com.ss.android.ugc.aweme.topic.movie.detail;

import X.C16880lQ;
import X.C214298b3;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C7RF;
import X.C7RN;
import X.C8FR;
import X.C90193gN;
import X.C9BE;
import X.O6R;
import X.SY9;
import X.X1D;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS199S0200000_3;

/* loaded from: classes4.dex */
public final class MovieDescAssem extends DynamicAssem {
    public final C214298b3 LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.csf;
    }

    public MovieDescAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MovieDetailVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1072), C7RF.INSTANCE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Integer num;
        Double d;
        SY9 sy9;
        int i;
        String str2;
        Double d2;
        String str3;
        Context context;
        Double d3;
        o.LJIIIZ(view, "view");
        MovieDetail LIZ = ((C7RN) ((AssemViewModel) this.LJLJLLL.getValue()).getState()).LJLIL.LIZ();
        if (LIZ != null) {
            str = LIZ.desc;
            num = LIZ.year;
            d = LIZ.rating;
        } else {
            str = null;
            num = null;
            d = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            sy9 = new SY9(context2, R.drawable.brw);
            sy9.setBounds(0, 0, C7MY.LIZIZ(28), O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        } else {
            sy9 = null;
        }
        C8FR c8fr = new C8FR(sy9, 2);
        c8fr.LIZIZ(C7MY.LIZIZ(6), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), C90193gN.LIZ());
        ((TuxTextView) _$_findCachedViewById(R.id.kp9)).setTuxFont(52);
        TextView textView = (TextView) _$_findCachedViewById(R.id.kp9);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i == 0 || d == null || d.doubleValue() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            if (num != null && num.intValue() != 0) {
                str2 = String.valueOf(num);
            } else if (d == null || d.doubleValue() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                str2 = "";
            } else {
                if (d != null) {
                    d2 = Double.valueOf(((int) (d.doubleValue() * 10)) / 10.0d);
                } else {
                    d2 = null;
                }
                str2 = String.valueOf(d2);
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(num);
            LIZ2.append(" · ");
            if (d != null) {
                d3 = Double.valueOf(((int) (10 * d.doubleValue())) / 10.0d);
            } else {
                d3 = null;
            }
            LIZ2.append(d3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(num);
            LIZ3.append(" · ");
            int length = X1D.LIZIZ(LIZ3).length();
            spannableStringBuilder.setSpan(c8fr, length - 1, length, 17);
            str2 = spannableStringBuilder;
        }
        textView.setText(str2);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.title);
        if (LIZ != null) {
            str3 = LIZ.title;
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.c84);
        if ((str == null || str.length() == 0) && ((context = tuxTextView.getContext()) == null || (str = context.getString(R.string.i8v)) == null)) {
            str = "";
        }
        tuxTextView.setText(str);
        C16880lQ.LJIIJ(new IDaS199S0200000_3(tuxTextView, this, 3), tuxTextView);
    }
}
