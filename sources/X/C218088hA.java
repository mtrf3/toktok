package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerSearchViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8hA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218088hA implements C6CL {
    public static final C218088hA LIZ = new C218088hA();
    public static C218098hB LIZIZ;
    public static InterfaceC88472Yns<? super User, C76800UCe> LIZJ;

    @Override // X.C6CL
    public final Animator LIZLLL() {
        C218098hB c218098hB = LIZIZ;
        if (c218098hB != null) {
            return ObjectAnimator.ofFloat(c218098hB, "alpha", 1.0f, 0.0f);
        }
        o.LJIJI("mentionStickerContainerView");
        throw null;
    }

    @Override // X.C6CL
    public final void LIZ(String str) {
        boolean z;
        C218098hB c218098hB = LIZIZ;
        if (c218098hB != null) {
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c218098hB.LJLIL.setVisibility(0);
                c218098hB.LJLILLLLZI.setVisibility(8);
                MentionStickerSearchViewModel mentionStickerSearchViewModel = c218098hB.LJLJI;
                mentionStickerSearchViewModel.getClass();
                mentionStickerSearchViewModel.LJLILLLLZI = str;
                ((PowerPageSource) mentionStickerSearchViewModel.LJLJJI.getValue()).getOperator().refresh();
                return;
            }
            c218098hB.LJLILLLLZI.setVisibility(0);
            c218098hB.LJLIL.setVisibility(8);
            return;
        }
        o.LJIJI("mentionStickerContainerView");
        throw null;
    }

    @Override // X.C6CL
    public final void LIZIZ(int i) {
        C218098hB c218098hB = LIZIZ;
        if (c218098hB != null) {
            ViewGroup.LayoutParams layoutParams = c218098hB.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).bottomMargin = i;
            C218098hB c218098hB2 = LIZIZ;
            if (c218098hB2 != null) {
                c218098hB2.requestLayout();
                return;
            } else {
                o.LJIJI("mentionStickerContainerView");
                throw null;
            }
        }
        o.LJIJI("mentionStickerContainerView");
        throw null;
    }

    @Override // X.C6CL
    public final void LIZJ(User user) {
        C218098hB c218098hB = LIZIZ;
        if (c218098hB != null) {
            c218098hB.getRecommendViewModel$mention_tag_release().LJLIL = user;
        } else {
            o.LJIJI("mentionStickerContainerView");
            throw null;
        }
    }

    @Override // X.C6CL
    public final void LJ(int i) {
        C218098hB c218098hB = LIZIZ;
        if (c218098hB != null) {
            c218098hB.setVisibility(i);
            if (i == 0) {
                C218098hB c218098hB2 = LIZIZ;
                if (c218098hB2 != null) {
                    c218098hB2.setAlpha(1.0f);
                    return;
                } else {
                    o.LJIJI("mentionStickerContainerView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mentionStickerContainerView");
        throw null;
    }

    @Override // X.C6CL
    public final void LJFF(ViewGroup viewGroup, Context context, boolean z, C6CK c6ck) {
        C218098hB c218098hB = new C218098hB(context);
        LIZIZ = c218098hB;
        LIZJ = c6ck;
        if (viewGroup != null) {
            viewGroup.addView(c218098hB, new FrameLayout.LayoutParams(-1, -2, 80));
        }
    }
}
