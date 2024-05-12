package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.MGm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56528MGm extends AbstractC225718tT {
    public static final C56529MGn Companion = new C56529MGn();
    public ForumStruct LJLIL;
    public String LJLILLLLZI;
    public WeakReference<ActivityC45651qj> LJLJI;
    public Aweme LJLJJI;

    @Override // X.AbstractC225718tT, X.MGV
    public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
        return false;
    }

    public final WeakReference<ActivityC45651qj> getActivity() {
        return this.LJLJI;
    }

    public final ForumStruct getQuestion() {
        return this.LJLIL;
    }

    public final String getSource() {
        return this.LJLILLLLZI;
    }

    public final Aweme getToJumpAweme() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public void onJumpToDetail(String aid) {
        o.LJIIIZ(aid, "aid");
        super.onJumpToDetail(aid);
    }

    public final void setActivity(WeakReference<ActivityC45651qj> weakReference) {
        this.LJLJI = weakReference;
    }

    public final void setQuestion(ForumStruct forumStruct) {
        this.LJLIL = forumStruct;
    }

    public final void setSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.LJLJJI = aweme;
    }

    public C56528MGm(ForumStruct forumStruct, String source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = forumStruct;
        this.LJLILLLLZI = source;
    }

    @Override // X.AbstractC225718tT
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme != null && aweme.getNewLiveRoomData() != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(aweme, "aweme");
        this.LJLJJI = aweme;
        param.LIZ = "qa_detail";
        param.LIZIZ = "question_id";
        return param;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C56563MHv c56563MHv = new C56563MHv();
        if (activityC45651qj != null) {
            QuestionDetailViewModel questionDetailViewModel = (QuestionDetailViewModel) ViewModelProviders.of(activityC45651qj).get(QuestionDetailViewModel.class);
            questionDetailViewModel.getClass();
            questionDetailViewModel.LJLILLLLZI.setValue(new OSZ<>(Integer.valueOf(i), c56563MHv));
        }
        c56563MHv.LJLIL.LIZLLL = this.LJLIL;
        String source = this.LJLILLLLZI;
        o.LJIIIZ(source, "source");
        TextUtils.isEmpty(source);
        C56527MGl c56527MGl = new C56527MGl(this, activityC45651qj);
        c56527MGl.LJJ(c56563MHv);
        return c56527MGl;
    }

    public /* synthetic */ C56528MGm(ForumStruct forumStruct, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(forumStruct, (i & 2) != 0 ? "" : str);
    }

    @Override // X.AbstractC225718tT
    public AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup parent, int i, final String str, final MH9 mh9) {
        o.LJIIIZ(parent, "parent");
        final View LIZ = C28289B8j.LIZ(parent, R.layout.ako, parent, false);
        return new C220538l7(LIZ, str, mh9) { // from class: X.8lJ
            @Override // X.C220538l7
            public final void a0(Aweme data, int i2, boolean z, Bundle arguments) {
                o.LJIIIZ(data, "data");
                o.LJIIIZ(arguments, "arguments");
                super.a0(data, i2, z, arguments);
                if (data.getLabelMusicStarterText() != null) {
                    String labelMusicStarterText = data.getLabelMusicStarterText();
                    o.LJIIIIZZ(labelMusicStarterText, "data.labelMusicStarterText");
                    if (labelMusicStarterText.length() != 0) {
                        this.LJLLL.setVisibility(0);
                        if (!TextUtils.isEmpty(data.getLabelMusicStarterText())) {
                            this.LJLLL.setText(data.getLabelMusicStarterText());
                        }
                    }
                }
                if (data.isPgcShow()) {
                    if (data.getTextTopLabels() != null && data.getTextTopLabels().size() > 0) {
                        this.LJLLILLLL.setVisibility(0);
                        this.LJLLI.setVisibility(8);
                        C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(data.getTextTopLabels(), 0));
                        return;
                    }
                    return;
                }
                if (data.getMusicStarter() != null || data.getOriginAuthor() != null || !TextUtils.equals(this.LJLJLLL, "qa_detail") || data.getIsTop() != 1) {
                    return;
                }
                if (data.getTextTopLabels() != null && data.getTextTopLabels().size() > 0) {
                    this.LJLLILLLL.setVisibility(0);
                    this.LJLLI.setVisibility(8);
                    C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(data.getTextTopLabels(), 0));
                } else {
                    this.LJLLILLLL.setVisibility(8);
                    this.LJLLI.setVisibility(0);
                    C78765Uvh.LJI(this.LJLLI, data.getLabelTop(), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
                }
            }
        };
    }
}
