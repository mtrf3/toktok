package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class JVA implements View.OnLongClickListener {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ JV9 LJLILLLLZI;

    public JVA(ActivityC45651qj activityC45651qj, JV9 jv9) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = jv9;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        JV9 jv9 = this.LJLILLLLZI;
        C49604JdQ.LJI(activityC45651qj, jv9.LJLJI, jv9.LJLIL.wordRecord, "click_recom");
        return true;
    }
}
