package X;

import Y.ACListenerS10S2100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174596tD {
    public static EnumC177726yG LJIIIIZZ;
    public static Boolean LJIIIZ;
    public final C176996x5 LIZ;
    public final IKeyboardInputPanelAssemAbility LIZIZ;
    public final TextView LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final ViewGroup LJFF;
    public final SmartImageView LJI;
    public boolean LJII;

    static {
        new C174076sN();
    }

    public final void LIZ() {
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.LIZLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        SmartImageView smartImageView = this.LJI;
        if (smartImageView != null) {
            smartImageView.setVisibility(8);
        }
        C176996x5 c176996x5 = this.LIZ;
        if (c176996x5 != null) {
            c176996x5.LJJJLL();
        }
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbility = this.LIZIZ;
        if (iKeyboardInputPanelAssemAbility != null) {
            iKeyboardInputPanelAssemAbility.Cl(null);
        }
        this.LJII = false;
    }

    public final void LIZIZ(Aweme aweme, String str) {
        int i;
        String str2;
        LIZ();
        if (LJIIIIZZ == EnumC177726yG.SELF_DEFAULT_UPVOTE) {
            if (o.LJ(LJIIIZ, Boolean.TRUE)) {
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (str == null) {
                    str = "";
                }
                C71Y.LIZLLL("CommentUpvoteUtil", "showUpvotePanel");
                this.LJII = true;
                TextView textView = this.LIZJ;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                View view = this.LIZLLL;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.LJ;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = this.LJ;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS10S2100000_3(this, str, str2, 2), view3);
                }
            }
            SmartImageView smartImageView = this.LJI;
            if (smartImageView != null) {
                Context context = smartImageView.getContext();
                V92 hierarchy = smartImageView.getHierarchy();
                if (hierarchy != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_repost;
                    c2068389v.LIZIZ = C7MY.LIZIZ(16);
                    c2068389v.LIZJ = C7MY.LIZIZ(16);
                    o.LJIIIIZZ(context, "context");
                    hierarchy.LJIILL(c2068389v.LIZ(context), 1);
                }
                V8L v8l = smartImageView.getHierarchy().LIZJ;
                if (v8l == null) {
                    v8l = new V8L();
                }
                v8l.LIZLLL(KL2.LIZJ(context, 1.0f));
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.cl, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                v8l.LJFF = i;
                smartImageView.getHierarchy().LJIL(v8l);
                smartImageView.setVisibility(0);
            }
        }
        C176996x5 c176996x5 = this.LIZ;
        if (c176996x5 != null) {
            c176996x5.LJJJLL();
        }
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbility = this.LIZIZ;
        if (iKeyboardInputPanelAssemAbility != null) {
            iKeyboardInputPanelAssemAbility.Cl(null);
        }
    }

    public C174596tD(ViewGroup mCommentUpvoteViewWrapper, C176996x5 c176996x5, IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbility) {
        o.LJIIIZ(mCommentUpvoteViewWrapper, "mCommentUpvoteViewWrapper");
        this.LIZ = c176996x5;
        this.LIZIZ = iKeyboardInputPanelAssemAbility;
        this.LIZJ = (TextView) mCommentUpvoteViewWrapper.findViewById(R.id.w1);
        this.LIZLLL = mCommentUpvoteViewWrapper.findViewById(R.id.f20);
        this.LJ = mCommentUpvoteViewWrapper.findViewById(R.id.ezq);
        this.LJFF = (ViewGroup) mCommentUpvoteViewWrapper.findViewById(R.id.w0);
        this.LJI = (SmartImageView) mCommentUpvoteViewWrapper.findViewById(R.id.fc7);
    }
}
