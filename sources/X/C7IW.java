package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.IDqS182S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7IW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IW {
    public static final C7IW LIZ = new C7IW();

    public static void LIZIZ(C183937Jt c183937Jt, User user) {
        String str;
        if (AV1.LJIJ(user)) {
            String string = c183937Jt.getContext().getString(C7HV.LIZIZ.LJIIJ(R.string.pud, R.string.q3g));
            o.LJIIIIZZ(string, "bubble.context.getString(strRes)");
            c183937Jt.LJJLL(string, null, false);
        } else {
            String string2 = c183937Jt.getContext().getString(C7HV.LIZIZ.LJIIJ(R.string.puc, R.string.q3f));
            o.LJIIIIZZ(string2, "bubble.context.getString(strRes)");
            if (user == null || (str = user.getNickname()) == null) {
                str = "";
            }
            c183937Jt.LJJLL(string2, str, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r2, X.C119624mk r3, com.ss.android.ugc.aweme.base.model.UrlModel r4) {
        /*
            if (r4 == 0) goto L9
            X.C78765Uvh.LJFF(r3, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1a
        L9:
            X.89v r1 = new X.89v
            r1.<init>()
            r0 = 2131755571(0x7f100233, float:1.9142025E38)
            r1.LIZ = r0
            X.SY9 r0 = r1.LIZ(r2)
            r3.setImageDrawable(r0)
        L1a:
            r0 = 0
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7IW.LIZ(android.content.Context, X.4mk, com.ss.android.ugc.aweme.base.model.UrlModel):void");
    }

    public static void LIZJ(C183937Jt bubble, UpvoteStruct upvoteStruct, InterfaceC181487Ai bubbleContext) {
        String str;
        o.LJIIIZ(bubble, "bubble");
        o.LJIIIZ(upvoteStruct, "upvoteStruct");
        o.LJIIIZ(bubbleContext, "bubbleContext");
        if (o.LJ(bubble.getTag(), upvoteStruct)) {
            return;
        }
        bubble.setTag(UpvoteStruct.copy$default(upvoteStruct, null, null, null, 0L, 0, 0, null, false, 0, false, null, 0, false, null, null, false, null, 0L, false, 0, 0, null, false, null, null, false, 67108863, null));
        bubble.setAvatar(new IDqS182S0200000_3(bubble, upvoteStruct, 0));
        bubble.setAvatarEndText(0L);
        if (C1FP.LJII(upvoteStruct)) {
            Aweme aweme = bubbleContext.f2().getAweme();
            if (!C7HO.LIZIZ(aweme) || !C7HO.LIZ(aweme) || !bubbleContext.LJLLLL() || !AV1.LJIJ(upvoteStruct.getUser())) {
                LIZIZ(bubble, upvoteStruct.getUser());
                return;
            } else {
                bubble.setButton(2);
                return;
            }
        }
        if (C1FP.LJIILL(upvoteStruct)) {
            str = bubble.getContext().getString(R.string.dih);
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (upvoteStruct.hasImag…ation_xNotifBody) else \"\"");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(upvoteStruct.getText());
        LIZ2.append(' ');
        LIZ2.append(str);
        bubble.LJJLL(X1D.LIZIZ(LIZ2), null, true);
    }

    public static void LJ(long j, C183937Jt c183937Jt, List list) {
        User user = null;
        if (j == 1) {
            UpvoteStruct upvoteStruct = (UpvoteStruct) ORZ.LJLLLLLL(0, list);
            if (upvoteStruct != null) {
                user = upvoteStruct.getUser();
            }
            LIZIZ(c183937Jt, user);
            return;
        }
        String quantityString = c183937Jt.getResources().getQuantityString(C7HV.LIZIZ.LJIIJ(R.plurals.rd, R.plurals.s5), (int) j);
        o.LJIIIIZZ(quantityString, "bubble.resources.getQuan…ng(strRes, total.toInt())");
        String LLLZ = C16880lQ.LLLZ(quantityString, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        c183937Jt.LJJLL(LLLZ, null, false);
    }

    public static void LIZLLL(C183937Jt bubble, List upvoteList, long j, InterfaceC181487Ai bubbleContext) {
        o.LJIIIZ(bubble, "bubble");
        o.LJIIIZ(upvoteList, "upvoteList");
        o.LJIIIZ(bubbleContext, "bubbleContext");
        bubble.setTag(upvoteList);
        bubble.setAvatar(new C7IX(j, bubble, upvoteList));
        bubble.getUpvoteCornerMark().setVisibility(8);
        if (!C7IP.LIZ(upvoteList)) {
            bubble.setAvatarEndText(0L);
            if (j == 0) {
                bubble.setButton(1);
                return;
            } else {
                LJ(j, bubble, upvoteList);
                return;
            }
        }
        bubble.setAvatarEndText(0L);
        LJ(j, bubble, upvoteList);
    }
}
