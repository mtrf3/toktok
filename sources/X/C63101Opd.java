package X;

import android.view.View;
import com.bytedance.android.live.broadcast.model.SurveyAnswer;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Opd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63101Opd implements InterfaceC50599JtT {
    public final /* synthetic */ C63104Opg LJLIL;
    public final /* synthetic */ C51769KTl LJLILLLLZI;
    public final /* synthetic */ ArrayList<SurveyQuestionOption> LJLJI;

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        boolean z;
        View view2;
        View view3;
        List<Integer> list;
        C51769KTl c51769KTl = this.LJLIL.LJIJJ;
        if (c51769KTl != null) {
            c51769KTl.LJLIL = i;
        }
        this.LJLILLLLZI.notifyDataSetChanged();
        SY4 sy4 = this.LJLIL.LJIILLIIL;
        if (sy4 != null) {
            sy4.setEnabled(true);
            sy4.setClickable(true);
            sy4.setButtonVariant(0);
        }
        Object obj = ListProtector.get(this.LJLJI, i);
        o.LJIIIIZZ(obj, "data[position]");
        SurveyQuestionOption surveyQuestionOption = (SurveyQuestionOption) obj;
        SurveyAnswer surveyAnswer = C63100Opc.LIZIZ;
        if (surveyAnswer != null && (list = surveyAnswer.optionIndexes) != null) {
            ListProtector.set(list, 1, Integer.valueOf(surveyQuestionOption.optionIndex));
        }
        C63100Opc.LJ = i;
        C63104Opg c63104Opg = this.LJLIL;
        c63104Opg.getClass();
        int i2 = surveyQuestionOption.type;
        EnumC05470Jj enumC05470Jj = EnumC05470Jj.TEXT;
        if (i2 == enumC05470Jj.getType()) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? (view2 = c63104Opg.LJIIL) == null || view2.getVisibility() != 8 : (view3 = c63104Opg.LJIIL) == null || view3.getVisibility() != 0) {
            View view4 = c63104Opg.LJIIL;
            if (view4 != null) {
                if (z) {
                    view4.setVisibility(0);
                } else {
                    view4.setVisibility(8);
                }
            }
        }
        C63104Opg c63104Opg2 = this.LJLIL;
        c63104Opg2.getClass();
        if (surveyQuestionOption.type == enumC05470Jj.getType()) {
            TuxTextView tuxTextView = c63104Opg2.LJIILIIL;
            if (tuxTextView != null) {
                tuxTextView.setText(c63104Opg2.LJIILL);
            }
            if (c63104Opg2.LJIILL.length() > 0) {
                TuxIconView tuxIconView = c63104Opg2.LJIILJJIL;
                if (tuxIconView == null) {
                    return;
                }
                tuxIconView.setVisibility(0);
                return;
            }
            TuxIconView tuxIconView2 = c63104Opg2.LJIILJJIL;
            if (tuxIconView2 == null) {
                return;
            }
            tuxIconView2.setVisibility(8);
        }
    }

    public C63101Opd(C63104Opg c63104Opg, C51769KTl c51769KTl, ArrayList<SurveyQuestionOption> arrayList) {
        this.LJLIL = c63104Opg;
        this.LJLILLLLZI = c51769KTl;
        this.LJLJI = arrayList;
    }
}
