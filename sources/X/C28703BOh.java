package X;

import Y.ACListenerS29S0400000_5;
import Y.ACListenerS31S0300000_5;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BOh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28703BOh extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<Question> LJLIL;
    public Context LJLILLLLZI;
    public CoverImageModel LJLJI;
    public HashMap<Long, Answer> LJLJJI = new HashMap<>();
    public InterfaceC28707BOl LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<Question> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int i2;
        List<Question> list;
        Question question;
        if (this.LJLIL == null || !(!r0.isEmpty())) {
            return 0;
        }
        List<Question> list2 = this.LJLIL;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        if (i2 <= i || (list = this.LJLIL) == null || (question = (Question) ListProtector.get(list, i)) == null) {
            return 0;
        }
        return question.getQuestionType();
    }

    public static void LJLLLLLL(Question question, C47121t6 c47121t6) {
        CharSequence charSequence;
        if (question != null) {
            if (question.getRequired()) {
                SpannableString spannableString = new SpannableString(i0.LJFF("* ", question.getQuestionContent()));
                spannableString.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a_n)), 0, 2, 18);
                spannableString.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.ey)), 3, spannableString.length(), 18);
                c47121t6.setText(spannableString);
                return;
            }
            charSequence = question.getQuestionContent();
        } else {
            charSequence = null;
        }
        c47121t6.setText(charSequence);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Question question;
        List<String> answers;
        boolean z;
        HashSet<String> answers2;
        Question question2;
        List<String> list;
        Question question3;
        List<String> answers3;
        boolean z2;
        HashSet<String> answers4;
        o.LJIIIZ(holder, "holder");
        int itemViewType = getItemViewType(i);
        int i2 = R.id.m52;
        if (itemViewType == 2) {
            if (holder instanceof C28705BOj) {
                C28705BOj c28705BOj = (C28705BOj) holder;
                List<Question> list2 = this.LJLIL;
                if (list2 != null) {
                    question3 = (Question) ListProtector.get(list2, i);
                } else {
                    question3 = null;
                }
                C28703BOh c28703BOh = c28705BOj.LJLJI;
                C47121t6 c47121t6 = c28705BOj.LJLILLLLZI;
                c28703BOh.getClass();
                LJLLLLLL(question3, c47121t6);
                c28705BOj.LJLIL.removeAllViews();
                if (question3 != null && (answers3 = question3.getAnswers()) != null) {
                    C28703BOh c28703BOh2 = c28705BOj.LJLJI;
                    for (String str : answers3) {
                        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ddu, C16880lQ.LLZIL(c28703BOh2.LJLILLLLZI), null);
                        View findViewById = LLLZIIL.findViewById(R.id.c9l);
                        o.LJIIIIZZ(findViewById, "subView.findViewById(R.id.detection_item)");
                        LinearLayout linearLayout = (LinearLayout) findViewById;
                        View findViewById2 = LLLZIIL.findViewById(R.id.m52);
                        o.LJIIIIZZ(findViewById2, "subView.findViewById(R.i…tection_question_content)");
                        ((TextView) findViewById2).setText(str);
                        View findViewById3 = LLLZIIL.findViewById(R.id.b7f);
                        o.LJIIIIZZ(findViewById3, "subView.findViewById(R.id.cb_detection)");
                        C41051jJ c41051jJ = (C41051jJ) findViewById3;
                        Answer answer = c28705BOj.LJLJI.LJLJJI.get(Long.valueOf(question3.getQuestionId()));
                        if (answer != null && (answers4 = answer.getAnswers()) != null && answers4.contains(str)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c41051jJ.setChecked(z2);
                        linearLayout.setTag(str);
                        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS31S0300000_5(c41051jJ, c28705BOj, question3, 35));
                        c28705BOj.LJLIL.addView(LLLZIIL);
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (itemViewType == 3) {
            if (holder instanceof C28704BOi) {
                C28704BOi c28704BOi = (C28704BOi) holder;
                List<Question> list3 = this.LJLIL;
                if (list3 != null) {
                    question2 = (Question) ListProtector.get(list3, i);
                } else {
                    question2 = null;
                }
                C28703BOh c28703BOh3 = c28704BOi.LJLJI;
                C47121t6 c47121t62 = c28704BOi.LJLILLLLZI;
                c28703BOh3.getClass();
                LJLLLLLL(question2, c47121t62);
                c28704BOi.LJLIL.removeAllViews();
                View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.ddt, C16880lQ.LLZIL(c28704BOi.LJLJI.LJLILLLLZI), null);
                View findViewById4 = LLLZIIL2.findViewById(R.id.f1t);
                o.LJIIIIZZ(findViewById4, "subView.findViewById(R.id.iv_detect)");
                View findViewById5 = LLLZIIL2.findViewById(R.id.czn);
                o.LJIIIIZZ(findViewById5, "subView.findViewById(R.id.et_detection_question)");
                TextView textView = (TextView) findViewById5;
                CoverImageModel coverImageModel = c28704BOi.LJLJI.LJLJI;
                if (coverImageModel != null && (list = coverImageModel.urlList) != null && !list.isEmpty() && !C79004UzY.LJJIFFI(list)) {
                    C15490jB.LJII(findViewById4, list, ImageView.ScaleType.CENTER_CROP, null);
                }
                textView.addTextChangedListener(new C28702BOg(c28704BOi, question2));
                c28704BOi.LJLIL.addView(LLLZIIL2);
                return;
            }
            return;
        }
        if (!(holder instanceof C28706BOk)) {
            return;
        }
        C28706BOk c28706BOk = (C28706BOk) holder;
        List<Question> list4 = this.LJLIL;
        if (list4 != null) {
            question = (Question) ListProtector.get(list4, i);
        } else {
            question = null;
        }
        C28703BOh c28703BOh4 = c28706BOk.LJLJI;
        C47121t6 c47121t63 = c28706BOk.LJLILLLLZI;
        c28703BOh4.getClass();
        LJLLLLLL(question, c47121t63);
        c28706BOk.LJLIL.removeAllViews();
        if (question == null || (answers = question.getAnswers()) == null) {
            return;
        }
        C28703BOh c28703BOh5 = c28706BOk.LJLJI;
        for (String str2 : answers) {
            View LLLZIIL3 = C16880lQ.LLLZIIL(R.layout.ddv, C16880lQ.LLZIL(c28703BOh5.LJLILLLLZI), null);
            View findViewById6 = LLLZIIL3.findViewById(R.id.c9l);
            o.LJIIIIZZ(findViewById6, "subView.findViewById(R.id.detection_item)");
            LinearLayout linearLayout2 = (LinearLayout) findViewById6;
            View findViewById7 = LLLZIIL3.findViewById(i2);
            o.LJIIIIZZ(findViewById7, "subView.findViewById(R.i…tection_question_content)");
            TextView textView2 = (TextView) findViewById7;
            View findViewById8 = LLLZIIL3.findViewById(R.id.iof);
            o.LJIIIIZZ(findViewById8, "subView.findViewById(R.id.rb_detection)");
            C41061jK c41061jK = (C41061jK) findViewById8;
            Answer answer2 = c28706BOk.LJLJI.LJLJJI.get(Long.valueOf(question.getQuestionId()));
            if (answer2 != null && (answers2 = answer2.getAnswers()) != null && answers2.contains(str2)) {
                z = true;
            } else {
                z = false;
            }
            c41061jK.setChecked(z);
            textView2.setText(str2);
            linearLayout2.setTag(str2);
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS29S0400000_5(c41061jK, c28706BOk, question, c28703BOh5, 2));
            c28706BOk.LJLIL.addView(LLLZIIL3);
            i2 = R.id.m52;
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c28706BOk;
        o.LJIIIZ(parent, "parent");
        this.LJLILLLLZI = parent.getContext();
        View view = C28289B8j.LIZ(parent, R.layout.ddw, parent, false);
        if (i == 2) {
            o.LJIIIIZZ(view, "view");
            c28706BOk = new C28705BOj(this, view);
        } else if (i == 3) {
            o.LJIIIIZZ(view, "view");
            c28706BOk = new C28704BOi(this, view);
        } else {
            o.LJIIIIZZ(view, "view");
            c28706BOk = new C28706BOk(this, view);
        }
        C0AX.LIZ(parent, c28706BOk.itemView, R.id.lj7);
        View view2 = c28706BOk.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c28706BOk.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c28706BOk.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c28706BOk.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c28706BOk.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c28706BOk.getClass().getName();
        return c28706BOk;
    }
}
