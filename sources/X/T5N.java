package X;

import Y.ACListenerS32S0100000_12;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5N implements InterfaceC203737z7, Observer<Boolean> {
    public final View LJLIL;
    public final T5P LJLILLLLZI;
    public final TextView LJLJI;
    public final ChallengeDetailParam LJLJJI;
    public final C203727z6 LJLJJL;
    public Challenge LJLJJLL;
    public T5H LJLJL;
    public boolean LJLJLJ;

    public final void LIZIZ() {
        C203727z6 c203727z6 = this.LJLJJL;
        Object[] objArr = new Object[3];
        objArr[0] = 3;
        Challenge challenge = this.LJLJJLL;
        if (challenge != null) {
            objArr[1] = challenge.getCid();
            objArr[2] = Integer.valueOf(!this.LJLJLJ ? 1 : 0);
            c203727z6.LJIILL(objArr);
            this.LJLJLJ = !this.LJLJLJ;
            this.LJLILLLLZI.LIZIZ();
            return;
        }
        o.LJIJI("mData");
        throw null;
    }

    public final void LIZJ() {
        int i;
        T5P t5p = this.LJLILLLLZI;
        if (this.LJLJLJ) {
            i = R.drawable.bod;
        } else {
            i = R.drawable.boe;
        }
        t5p.setImageResource(i);
    }

    public final void LIZLLL() {
        int i;
        HT5.LIZJ(this.LJLJLJ);
        TextView textView = this.LJLJI;
        if (textView != null) {
            if (this.LJLJLJ) {
                i = R.string.bgf;
            } else {
                i = R.string.bg3;
            }
            textView.setText(i);
        }
    }

    @Override // X.InterfaceC203737z7
    public final void ix() {
        Challenge challenge = this.LJLJJLL;
        if (challenge != null) {
            challenge.setCollectStatus(this.LJLJLJ ? 1 : 0);
            Challenge challenge2 = this.LJLJJLL;
            if (challenge2 != null) {
                C2U8.LIZ(new C213538Zp(challenge2));
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
        this.LJLJLJ = !this.LJLJLJ;
        LIZJ();
        LIZLLL();
    }

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
        if (str == null) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
    }

    public final void LIZ(T5H headerParam, Challenge data) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(headerParam, "headerParam");
        this.LJLJJLL = data;
        this.LJLJL = headerParam;
        boolean z = true;
        if (data.getCollectStatus() != 1) {
            z = false;
        }
        this.LJLJLJ = z;
        LIZJ();
        LIZLLL();
    }

    public T5N(View view, T5P t5p, TextView textView, ChallengeDetailParam challengeDetailParam) {
        this.LJLIL = view;
        this.LJLILLLLZI = t5p;
        this.LJLJI = textView;
        this.LJLJJI = challengeDetailParam;
        C203727z6 c203727z6 = new C203727z6();
        this.LJLJJL = c203727z6;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 156), view);
        t5p.setOnStateChangeListener(new T5O(this));
        c203727z6.LJLILLLLZI = this;
        Activity LIZIZ = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        NextLiveData<Boolean> nextLiveData = ((DetailViewModel) ViewModelProviders.of((ActivityC45651qj) LIZIZ).get(DetailViewModel.class)).LJLIL;
        Activity LIZIZ2 = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        nextLiveData.observe((C1AU) LIZIZ2, this);
    }
}
