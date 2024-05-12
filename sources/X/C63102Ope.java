package X;

import Y.IDCSpanS34S0100000_10;
import Y.IDObjectS182S0100000_10;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.AcademySurveyQuestion;
import com.bytedance.android.live.broadcast.model.SurveyAnswer;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ope, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63102Ope implements InterfaceC50599JtT {
    public final /* synthetic */ C63103Opf LJLIL;

    public C63102Ope(C63103Opf c63103Opf) {
        this.LJLIL = c63103Opf;
    }

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        int i2;
        SurveyQuestionOption surveyQuestionOption;
        ViewStub viewStub;
        View view2;
        String str;
        String string;
        Integer LJI;
        List<SurveyQuestionOption> list;
        View view3;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        RecyclerView recyclerView;
        View view4;
        TuxTextView tuxTextView2;
        TuxIconView tuxIconView2;
        SY4 sy4;
        TuxTextView tuxTextView3;
        TuxTextView tuxTextView4;
        Integer num;
        int i3;
        List<SurveyQuestionOption> list2;
        List<SurveyQuestionOption> list3;
        C63103Opf c63103Opf = this.LJLIL;
        C51767KTj c51767KTj = c63103Opf.LJLLJ;
        if (c51767KTj != null) {
            c51767KTj.LJLIL = i;
            c51767KTj.notifyDataSetChanged();
        }
        if (i >= 0) {
            AcademySurveyQuestion academySurveyQuestion = c63103Opf.LJLILLLLZI;
            if (academySurveyQuestion != null && (list3 = academySurveyQuestion.options) != null) {
                i2 = list3.size();
            } else {
                i2 = 4;
            }
            if (i >= i2) {
                return;
            }
            AcademySurveyQuestion academySurveyQuestion2 = c63103Opf.LJLILLLLZI;
            if (academySurveyQuestion2 != null && (list2 = academySurveyQuestion2.options) != null) {
                surveyQuestionOption = (SurveyQuestionOption) ListProtector.get(list2, i);
            } else {
                surveyQuestionOption = null;
            }
            AcademySurveyQuestion academySurveyQuestion3 = c63103Opf.LJLILLLLZI;
            if (academySurveyQuestion3 != null) {
                if (surveyQuestionOption != null) {
                    num = Integer.valueOf(surveyQuestionOption.optionIndex);
                } else {
                    num = null;
                }
                C63100Opc.LIZJ = String.valueOf(num);
                String str2 = academySurveyQuestion3.questionId;
                int i4 = academySurveyQuestion3.questionType;
                Integer[] numArr = new Integer[2];
                if (surveyQuestionOption != null) {
                    i3 = surveyQuestionOption.optionIndex;
                } else {
                    i3 = -1;
                }
                numArr[0] = Integer.valueOf(i3);
                numArr[1] = -1;
                C63100Opc.LIZIZ = new SurveyAnswer(str2, i4, C47261Igj.LJJIJIL(numArr));
            }
            if (surveyQuestionOption == null || (viewStub = c63103Opf.LJLLILLLL) == null || (view2 = c63103Opf.LJLJLJ) == null) {
                return;
            }
            view2.setVisibility(4);
            if (c63103Opf.LJLLL == null) {
                c63103Opf.LJLLL = new C63104Opg();
            }
            C63104Opg c63104Opg = c63103Opf.LJLLL;
            if (c63104Opg == null) {
                return;
            }
            Context context = c63103Opf.LJLJI;
            Aweme aweme = c63103Opf.LJLJJI;
            String questionType = String.valueOf(surveyQuestionOption.optionIndex);
            View view5 = c63103Opf.LJLJL;
            String str3 = c63103Opf.LJLLLL;
            String str4 = c63103Opf.LJLZ;
            Long l = c63103Opf.LJZI;
            String str5 = c63103Opf.LJLLLLLL;
            o.LJIIIZ(questionType, "questionType");
            c63104Opg.LIZIZ();
            if (context == null || aweme == null) {
                return;
            }
            c63104Opg.LJFF = context;
            c63104Opg.LJIJI = c63103Opf;
            c63104Opg.LIZ = surveyQuestionOption;
            c63104Opg.LJII = view5;
            c63104Opg.LIZIZ = str3;
            c63104Opg.LIZJ = str5;
            c63104Opg.LIZLLL = str4;
            c63104Opg.LJ = l;
            C63100Opc.LIZLLL = questionType;
            if (c63104Opg.LJI == null) {
                View inflate = viewStub.inflate();
                c63104Opg.LJI = inflate;
                if (inflate != null) {
                    inflate.setVisibility(8);
                }
                View view6 = c63104Opg.LJI;
                if (view6 != null) {
                    view3 = view6.findViewById(R.id.b68);
                } else {
                    view3 = null;
                }
                c63104Opg.LJIIIIZZ = view3;
                View view7 = c63104Opg.LJI;
                if (view7 != null) {
                    tuxIconView = (TuxIconView) view7.findViewById(R.id.eb1);
                } else {
                    tuxIconView = null;
                }
                c63104Opg.LJIIIZ = tuxIconView;
                View view8 = c63104Opg.LJI;
                if (view8 != null) {
                    tuxTextView = (TuxTextView) view8.findViewById(R.id.mo6);
                } else {
                    tuxTextView = null;
                }
                c63104Opg.LJIIJ = tuxTextView;
                View view9 = c63104Opg.LJI;
                if (view9 != null) {
                    recyclerView = (RecyclerView) view9.findViewById(R.id.gax);
                } else {
                    recyclerView = null;
                }
                c63104Opg.LJIIJJI = recyclerView;
                View view10 = c63104Opg.LJI;
                if (view10 != null) {
                    view4 = view10.findViewById(R.id.eor);
                } else {
                    view4 = null;
                }
                c63104Opg.LJIIL = view4;
                View view11 = c63104Opg.LJI;
                if (view11 != null) {
                    tuxTextView2 = (TuxTextView) view11.findViewById(R.id.ep4);
                } else {
                    tuxTextView2 = null;
                }
                c63104Opg.LJIILIIL = tuxTextView2;
                View view12 = c63104Opg.LJI;
                if (view12 != null) {
                    tuxIconView2 = (TuxIconView) view12.findViewById(R.id.beq);
                } else {
                    tuxIconView2 = null;
                }
                c63104Opg.LJIILJJIL = tuxIconView2;
                View view13 = c63104Opg.LJI;
                if (view13 != null) {
                    sy4 = (SY4) view13.findViewById(R.id.azi);
                } else {
                    sy4 = null;
                }
                c63104Opg.LJIILLIIL = sy4;
                View view14 = c63104Opg.LJI;
                if (view14 != null) {
                    tuxTextView3 = (TuxTextView) view14.findViewById(R.id.dxa);
                } else {
                    tuxTextView3 = null;
                }
                c63104Opg.LJIIZILJ = tuxTextView3;
                View view15 = c63104Opg.LJI;
                if (view15 != null) {
                    tuxTextView4 = (TuxTextView) view15.findViewById(R.id.i4h);
                } else {
                    tuxTextView4 = null;
                }
                c63104Opg.LJIJ = tuxTextView4;
            }
            View view16 = c63104Opg.LJIIIIZZ;
            if (view16 != null) {
                C16880lQ.LJIIJ(c63104Opg.LJIJJLI, view16);
            }
            TuxIconView tuxIconView3 = c63104Opg.LJIIIZ;
            if (tuxIconView3 != null) {
                C16880lQ.LJJJ(tuxIconView3, c63104Opg.LJIJJLI);
            }
            View view17 = c63104Opg.LJII;
            if (view17 != null) {
                C16880lQ.LJIIJ(c63104Opg.LJIJJLI, view17);
            }
            TuxTextView tuxTextView5 = c63104Opg.LJIIJ;
            if (tuxTextView5 != null) {
                SurveyQuestionOption surveyQuestionOption2 = c63104Opg.LIZ;
                if (surveyQuestionOption2 != null) {
                    str = surveyQuestionOption2.helpText;
                } else {
                    str = null;
                }
                tuxTextView5.setText(str);
            }
            View view18 = c63104Opg.LJIIL;
            if (view18 != null) {
                C16880lQ.LJIIJ(c63104Opg.LJIJJLI, view18);
            }
            TuxTextView tuxTextView6 = c63104Opg.LJIILIIL;
            if (tuxTextView6 != null) {
                tuxTextView6.addTextChangedListener(new IDObjectS182S0100000_10(c63104Opg, 1));
            }
            TuxIconView tuxIconView4 = c63104Opg.LJIILJJIL;
            if (tuxIconView4 != null) {
                C16880lQ.LJJJ(tuxIconView4, c63104Opg.LJIJJLI);
            }
            SY4 sy42 = c63104Opg.LJIILLIIL;
            if (sy42 != null) {
                sy42.setText(context.getString(R.string.n6t));
                C16880lQ.LJJIZ(sy42, c63104Opg.LJIJJLI);
            }
            TuxTextView tuxTextView7 = c63104Opg.LJIIZILJ;
            if (tuxTextView7 != null) {
                tuxTextView7.setText(R.string.hg1);
                C16880lQ.LJJJJI(tuxTextView7, c63104Opg.LJIJJLI);
            }
            RecyclerView recyclerView2 = c63104Opg.LJIIJJI;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.survey.AcademySecondarySurveyViewHelper$bindOptionView$1$linearLayoutManager$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                    public final boolean LJIL() {
                        return false;
                    }
                });
                SurveyQuestionOption surveyQuestionOption3 = c63104Opg.LIZ;
                if (surveyQuestionOption3 != null && (list = surveyQuestionOption3.subOptions) != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    arrayList.addAll(list);
                    C51769KTl c51769KTl = new C51769KTl(context, arrayList);
                    c63104Opg.LJIJJ = c51769KTl;
                    c51769KTl.LJLJJI = new C63101Opd(c63104Opg, c51769KTl, arrayList);
                    recyclerView2.setAdapter(c51769KTl);
                }
            }
            View view19 = c63104Opg.LJI;
            if (view19 != null) {
                view19.setVisibility(0);
            }
            View view20 = c63104Opg.LJII;
            if (view20 != null) {
                view20.setVisibility(0);
            }
            View view21 = c63104Opg.LJIIIIZZ;
            if (view21 != null) {
                view21.setVisibility(0);
            }
            TuxIconView tuxIconView5 = c63104Opg.LJIIIZ;
            if (tuxIconView5 != null) {
                tuxIconView5.setVisibility(0);
            }
            TuxTextView tuxTextView8 = c63104Opg.LJIIJ;
            if (tuxTextView8 != null) {
                tuxTextView8.setVisibility(0);
            }
            RecyclerView recyclerView3 = c63104Opg.LJIIJJI;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            View view22 = c63104Opg.LJIIL;
            if (view22 != null) {
                view22.setVisibility(8);
            }
            SY4 sy43 = c63104Opg.LJIILLIIL;
            if (sy43 != null) {
                sy43.setVisibility(0);
            }
            TuxTextView tuxTextView9 = c63104Opg.LJIIZILJ;
            if (tuxTextView9 != null) {
                tuxTextView9.setVisibility(0);
            }
            TuxTextView tuxTextView10 = c63104Opg.LJIJ;
            if (tuxTextView10 != null) {
                tuxTextView10.setVisibility(0);
            }
            Context context2 = c63104Opg.LJFF;
            if (context2 != null && (string = context2.getString(R.string.n6l)) != null) {
                int length = string.length();
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (string.charAt(i5) == '[') {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                int i6 = i5 - 1;
                int length2 = string.length();
                int i7 = 0;
                while (true) {
                    if (i7 < length2) {
                        if (string.charAt(i7) == ']') {
                            break;
                        } else {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                int i8 = i7 - 1;
                SpannableString spannableString = new SpannableString(ujb.o.LJJJJZ(ujb.o.LJJJJZ(string, "[", "", false), "]", "", false));
                if (i6 >= 0 && i8 >= 0) {
                    if (i6 > i8) {
                        i8 = i6;
                        i6 = i8;
                    }
                    spannableString.setSpan(new T5U(72, false), i6, i8, 34);
                    spannableString.setSpan(new IDCSpanS34S0100000_10(c63104Opg, 2), i6, i8, 34);
                    Context context3 = c63104Opg.LJFF;
                    if (context3 != null && (LJI = C79045V0n.LJI(R.attr.dl, context3)) != null) {
                        spannableString.setSpan(new ForegroundColorSpan(LJI.intValue()), i6, i8, 34);
                    }
                }
                TuxTextView tuxTextView11 = c63104Opg.LJIJ;
                if (tuxTextView11 != null) {
                    tuxTextView11.setMovementMethod(LinkMovementMethod.getInstance());
                }
                TuxTextView tuxTextView12 = c63104Opg.LJIJ;
                if (tuxTextView12 != null) {
                    tuxTextView12.setText(spannableString);
                }
            }
            C63110Opm.LIZJ(true, false, false, "", questionType, "", "", "", l, str5, str3);
        }
    }
}
