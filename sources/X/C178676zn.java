package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.6zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178676zn {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(ViewGroup viewGroup, M89 m89, Aweme aweme, View.OnClickListener onClickListener) {
        int i = 0;
        if (viewGroup == null || aweme == null) {
            return false;
        }
        C1792571t c1792571t = (C1792571t) viewGroup.findViewById(R.id.d23);
        C1792571t c1792571t2 = c1792571t;
        if (c1792571t == null) {
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "container.context");
            ConstraintLayout constraintLayout = new ConstraintLayout(context, null, i) { // from class: X.71t
                public static final /* synthetic */ int LJLJJL = 0;
                public final C62822Ol8 LJLIL;
                public final C62822Ol8 LJLILLLLZI;
                public final C62822Ol8 LJLJI;
                public final C62822Ol8 LJLJJI;

                private final View getBackgroundView() {
                    Object value = this.LJLIL.getValue();
                    o.LJIIIIZZ(value, "<get-backgroundView>(...)");
                    return (View) value;
                }

                private final TuxTextView getCommentText() {
                    Object value = this.LJLJI.getValue();
                    o.LJIIIIZZ(value, "<get-commentText>(...)");
                    return (TuxTextView) value;
                }

                private final SmartAvatarImageView getIvAvatar() {
                    Object value = this.LJLILLLLZI.getValue();
                    o.LJIIIIZZ(value, "<get-ivAvatar>(...)");
                    return (SmartAvatarImageView) value;
                }

                private final TuxTextView getReplyButton() {
                    Object value = this.LJLJJI.getValue();
                    o.LJIIIIZZ(value, "<get-replyButton>(...)");
                    return (TuxTextView) value;
                }

                public final void LJJLJLI(M89 m892) {
                    if (m892 != null) {
                        String exposeAvatarUrl = m892.getExposeAvatarUrl();
                        if (exposeAvatarUrl != null) {
                            W5F LJIIIIZZ = W5U.LJIIIIZZ(exposeAvatarUrl);
                            LJIIIIZZ.LJJIIJ = getIvAvatar();
                            C16880lQ.LLJJJ(LJIIIIZZ);
                        }
                        String exposeCommentText = m892.getExposeCommentText();
                        if (exposeCommentText != null) {
                            getCommentText().setText(exposeCommentText);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, r8, i);
                    int i2;
                    new LinkedHashMap();
                    this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 94));
                    this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 96));
                    this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 95));
                    this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 97));
                    View rootView = ViewGroup.inflate(context, R.layout.pe, this);
                    o.LJIIIIZZ(rootView, "rootView");
                    View backgroundView = getBackgroundView();
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
                    c110614Vt.LIZJ = C61328O5c.LIZJ(40);
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    backgroundView.setBackground(c110614Vt.LIZ(context2));
                    TuxTextView commentText = getCommentText();
                    commentText.setTuxFont(42);
                    Context context3 = commentText.getContext();
                    o.LJIIIIZZ(context3, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.dj, context3);
                    if (LJI != null) {
                        i2 = LJI.intValue();
                    } else {
                        i2 = 0;
                    }
                    commentText.setTextColor(i2);
                    TuxTextView replyButton = getReplyButton();
                    replyButton.setTuxFont(42);
                    Context context4 = replyButton.getContext();
                    o.LJIIIIZZ(context4, "context");
                    Integer LJI2 = C79045V0n.LJI(R.attr.dl, context4);
                    replyButton.setTextColor(LJI2 != null ? LJI2.intValue() : 0);
                    FMX.LJIIL("show_bottom_reply_comment_box", new C188727au().LIZ);
                }
            };
            constraintLayout.setId(R.id.d23);
            viewGroup.addView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
            c1792571t2 = constraintLayout;
        }
        c1792571t2.LJJLJLI(m89);
        c1792571t2.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
        return true;
    }
}
