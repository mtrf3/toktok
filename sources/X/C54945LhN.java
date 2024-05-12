package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LhN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54945LhN extends AbstractC54946LhO {
    public TextView LJLJJI;

    @Override // X.AbstractC54946LhO
    public final String LIZIZ() {
        return "title";
    }

    @Override // X.AbstractC54946LhO
    public final void LJ(DataCenter dataCenter) {
    }

    @Override // X.AbstractC54946LhO
    public final void LJFF() {
    }

    public C54945LhN(View view) {
        super(view);
    }

    @Override // X.AbstractC54946LhO
    public final void LIZ(LV8 lv8) {
        String str;
        User author;
        super.LIZ(lv8);
        TextView textView = this.LJLJJI;
        if (textView == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            if (!TextUtils.isEmpty(author.getUniqueId())) {
                str = author.getUniqueId();
                o.LJIIIIZZ(str, "this.uniqueId");
            } else if (!TextUtils.isEmpty(author.getShortId())) {
                str = author.getShortId();
                o.LJIIIIZZ(str, "this.shortId");
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        LIZ.append(str);
        textView.setText(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC54946LhO
    public final void LIZJ(View view) {
        if (view instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bfq, C16880lQ.LLZIL(viewGroup.getContext()), null);
            this.LJLJJI = (TextView) LLLZIIL.findViewById(R.id.mo6);
            viewGroup.addView(LLLZIIL);
        }
    }
}
