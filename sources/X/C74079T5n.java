package X;

import Y.ACListenerS32S0100000_12;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T5n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74079T5n implements InterfaceC203737z7, Observer<Boolean> {
    public final View LJLIL;
    public final T5P LJLILLLLZI;
    public final TextView LJLJI;
    public final QuestionDetailParam LJLJJI;
    public final C203727z6 LJLJJL;
    public ForumStruct LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
    }

    public final void LIZ() {
        String str;
        String str2;
        String str3 = null;
        if (this.LJLJL) {
            QuestionDetailParam questionDetailParam = this.LJLJJI;
            if (questionDetailParam != null) {
                str2 = questionDetailParam.getId();
            } else {
                str2 = null;
            }
            C188727au LIZ = CK3.LIZ("enter_from", "qa_detail");
            if (str2 != null) {
                LIZ.LJI("question_id", str2);
            }
            FMX.LJIIL("cancel_favorite_qa", LIZ.LIZ);
        } else {
            QuestionDetailParam questionDetailParam2 = this.LJLJJI;
            if (questionDetailParam2 != null) {
                str = questionDetailParam2.getId();
            } else {
                str = null;
            }
            C188727au LIZ2 = CK3.LIZ("enter_from", "qa_detail");
            if (str != null) {
                LIZ2.LJI("question_id", str);
            }
            FMX.LJIIL("favorite_qa", LIZ2.LIZ);
        }
        C203727z6 c203727z6 = this.LJLJJL;
        Object[] objArr = new Object[3];
        objArr[0] = 7;
        ForumStruct forumStruct = this.LJLJJLL;
        if (forumStruct != null) {
            Long id = forumStruct.getId();
            if (id != null) {
                str3 = id.toString();
            }
            objArr[1] = str3;
            objArr[2] = Integer.valueOf(!this.LJLJL ? 1 : 0);
            c203727z6.LJIILL(objArr);
            this.LJLJL = !this.LJLJL;
            this.LJLILLLLZI.LIZIZ();
            return;
        }
        o.LJIJI("mData");
        throw null;
    }

    public final void LIZIZ() {
        int i;
        T5P t5p = this.LJLILLLLZI;
        if (this.LJLJL) {
            i = R.drawable.bod;
        } else {
            i = R.drawable.boe;
        }
        t5p.setImageResource(i);
    }

    public final void LIZJ() {
        int i;
        TextView textView = this.LJLJI;
        if (textView != null) {
            if (this.LJLJL) {
                i = R.string.bgf;
            } else {
                i = R.string.bg3;
            }
            textView.setText(i);
        }
    }

    @Override // X.InterfaceC203737z7
    public final void ix() {
        ForumStruct forumStruct = this.LJLJJLL;
        if (forumStruct != null) {
            forumStruct.setCollectStatus(Integer.valueOf(this.LJLJL ? 1 : 0));
            ForumStruct forumStruct2 = this.LJLJJLL;
            if (forumStruct2 != null) {
                C2U8.LIZ(new C185517Pv(forumStruct2));
                return;
            } else {
                o.LJIJI("mData");
                throw null;
            }
        }
        o.LJIJI("mData");
        throw null;
    }

    @Override // X.InterfaceC203737z7
    public final void aB(Exception exc) {
        C36922EeM.LJFF(exc);
        this.LJLJL = !this.LJLJL;
        LIZIZ();
        LIZJ();
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
    }

    public C74079T5n(View view, T5P t5p, TextView textView, QuestionDetailParam questionDetailParam) {
        this.LJLIL = view;
        this.LJLILLLLZI = t5p;
        this.LJLJI = textView;
        this.LJLJJI = questionDetailParam;
        C203727z6 c203727z6 = new C203727z6();
        this.LJLJJL = c203727z6;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, LiveTryModeCountDownThresholdSetting.DEFAULT), view);
        t5p.setOnStateChangeListener(new C74080T5o(this));
        c203727z6.LJLILLLLZI = this;
        Activity LIZIZ = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        NextLiveData<Boolean> nextLiveData = ((DetailViewModel) ViewModelProviders.of((ActivityC45651qj) LIZIZ).get(DetailViewModel.class)).LJLIL;
        Activity LIZIZ2 = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        nextLiveData.observe((C1AU) LIZIZ2, this);
    }
}
