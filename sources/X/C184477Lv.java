package X;

import Y.ACListenerS23S0100000_3;
import Y.AObserverS67S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.7Lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184477Lv {
    public final C200847uS LIZ;
    public int LIZIZ;
    public final C62822Ol8 LIZJ;

    public final float LIZ() {
        return ((Number) this.LIZJ.getValue()).floatValue();
    }

    public C184477Lv(C200847uS c200847uS) {
        User author;
        ViewGroup viewGroup;
        this.LIZ = c200847uS;
        View LIZJ = C38619FDr.LIZJ(c200847uS.LIZIZ, R.layout.c1y, null);
        ViewGroup viewGroup2 = c200847uS.LJ;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.e3v)) != null) {
            viewGroup.addView(LIZJ);
        }
        Aweme aweme = c200847uS.LIZJ;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            W5F LJI = C1JX.LJI(author);
            LJI.LJIILIIL(J7H.LIZ(100));
            int LIZJ2 = (int) KL2.LIZJ(c200847uS.LIZIZ, 28.0f);
            int LIZJ3 = (int) KL2.LIZJ(c200847uS.LIZIZ, 28.0f);
            LJI.LJII = LIZJ2;
            LJI.LJIIIIZZ = LIZJ3;
            LJI.LJJIJIIJIL = true;
            LJI.LJJIIJ = (SmartImageView) LIZJ.findViewById(R.id.acf);
            LJI.LJ();
            View findViewById = LIZJ.findViewById(R.id.dki);
            if (findViewById != null) {
                OUP.LJJJJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), findViewById);
            }
            TextView textView = (TextView) LIZJ.findViewById(R.id.h1j);
            if (textView != null) {
                textView.setText(author.getNickname());
            }
            RelationButton relationButton = (RelationButton) LIZJ.findViewById(R.id.iuh);
            if (relationButton != null) {
                C184387Lm.LIZ(relationButton, author, c200847uS);
            }
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) LIZJ.findViewById(R.id.acf);
            if (smartAvatarImageView != null) {
                C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS23S0100000_3(this, 189));
            }
            TuxTextView tuxTextView = (TuxTextView) LIZJ.findViewById(R.id.h1j);
            if (tuxTextView != null) {
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 190));
            }
        }
        c200847uS.LJII.LLIIL.observe(c200847uS.LIZIZ, new AObserverS67S0200000_3(LIZJ, this, 8));
        this.LIZJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1468));
    }
}
