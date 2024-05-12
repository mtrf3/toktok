package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ON2 extends LinearLayout implements InterfaceC61792OMy {
    public final RecyclerView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public Option LJLJI;
    public int LJLJJI;
    public ON0 LJLJJL;

    public final Option getChosenOption() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ON2(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = -1;
        View inflate = View.inflate(context, R.layout.aev, this);
        View findViewById = inflate.findViewById(R.id.gax);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.lv_options)");
        this.LJLIL = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.met);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tv_privacy)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
    }

    public final void LIZ(FeedSurvey feedSurvey) {
        Question question;
        o.LJIIIZ(feedSurvey, "feedSurvey");
        Question[] questions = feedSurvey.getQuestions();
        if (questions != null && (question = questions[0]) != null) {
            Context context = getContext();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            SpannableStringBuilder LIZJ = ONM.LIZJ(context, "", AnonymousClass636.LJIIIIZZ(R.attr.do, context2), "");
            if (LIZJ != null) {
                this.LJLILLLLZI.setText(LIZJ);
                this.LJLILLLLZI.setVisibility(0);
            } else {
                this.LJLILLLLZI.setVisibility(8);
            }
            this.LJLILLLLZI.setHighlightColor(0);
            this.LJLILLLLZI.setMovementMethod(LinkMovementMethod.getInstance());
            getContext();
            this.LJLIL.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.survey.CustomSurveyOptionView$bindView$linearLayoutManager$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIL() {
                    return false;
                }
            });
            Option[] options = question.getOptions();
            if (options != null) {
                ArrayList arrayList = new ArrayList(options.length);
                ORS.LJJLIIIJJIZ(arrayList, options);
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                ON6 on6 = new ON6(context3, arrayList);
                on6.LJLJJI = new ON3(this, arrayList, on6);
                this.LJLIL.setAdapter(on6);
            }
        }
    }

    @Override // X.InterfaceC61792OMy
    public void setOptionListener(ON0 mOptionClickListener) {
        o.LJIIIZ(mOptionClickListener, "mOptionClickListener");
        this.LJLJJL = mOptionClickListener;
    }
}
