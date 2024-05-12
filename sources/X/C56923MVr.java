package X;

import Y.ARunnableS0S0104000_3;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MVr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56923MVr implements MWC {
    public static final C56923MVr LIZ = new C56923MVr();

    public static String LIZLLL(User user) {
        if (user == null) {
            return "";
        }
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    return "";
                }
                return "2";
            }
            return "1";
        }
        if (followerStatus == 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "3";
    }

    @Override // X.MWC
    public final boolean LIZ(List<? extends User> list, boolean z) {
        if (MSH.LJI(list, z) != null) {
            return true;
        }
        return false;
    }

    @Override // X.MWC
    public final void LIZIZ(AnonymousClass976 anonymousClass976, List<? extends User> list, View view) {
        OSZ<User, EnumC35456Dvo> osz;
        if (list != null) {
            osz = MSH.LJI(list, true);
        } else {
            osz = null;
        }
        if (anonymousClass976 != null) {
            if (view != null) {
                if (osz != null) {
                    if (view.getVisibility() != 0) {
                        V1B.LJLZ(view);
                        if (anonymousClass976.LJLLLL == null) {
                            View findViewById = view.findViewById(R.id.h5g);
                            o.LJIIIIZZ(findViewById, "container.findViewById(R…fication_name_append_add)");
                            anonymousClass976.setPrefixView((TuxTextView) findViewById);
                        }
                    }
                    User first = osz.getFirst();
                    anonymousClass976.LJJI(first.getFollowStatus(), first.getFollowerStatus());
                    return;
                }
            } else {
                return;
            }
        } else if (view == null) {
            return;
        }
        V1B.LJLLLLLL(view);
    }

    @Override // X.MWC
    public final void LIZJ(C57446Mgc textView, String accountType, List<? extends User> list, boolean z, String str) {
        OSZ<User, EnumC35456Dvo> LJI;
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(accountType, "accountType");
        textView.setVisibility(8);
        if (list == null || (LJI = MSH.LJI(list, z)) == null) {
            return;
        }
        textView.setVisibility(0);
        if (LJI.getSecond() != EnumC35456Dvo.SEPARATE_MATCHED_FRIEND) {
            return;
        }
        ((View) textView.getParent()).post(new ARunnableS0S0104000_3(textView, C7MY.LIZIZ(4), C7MY.LIZIZ(2), C7MY.LIZIZ(4), C7MY.LIZIZ(8), 0));
        C56760MPk.LJIIL("show", accountType, "inbox_interaction_message", LJI.getFirst(), C56760MPk.LIZ(str));
    }
}
