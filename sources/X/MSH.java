package X;

import Y.ARunnableS23S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(MSI.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(AnonymousClass941.LJLIL);
    public static Drawable LIZJ;

    public static final Resources LIZJ() {
        Resources resources;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (resources = topActivity.getResources()) == null) {
            return EF7.LIZIZ().getResources();
        }
        return resources;
    }

    public static final User LIZIZ(List<? extends User> list) {
        User user;
        boolean z = false;
        if (list != null && list.size() == 1) {
            z = true;
        }
        if (!z || (user = (User) ORZ.LJLLLL(list)) == null || user.getMatchedFriendStruct() == null) {
            return null;
        }
        return user;
    }

    public static final String LIZLLL(AtMe atMe) {
        String string;
        String string2;
        int subType = atMe.getSubType();
        if (subType != 2) {
            if (subType != 7) {
                if (subType != 54) {
                    if (subType != 55) {
                        Aweme aweme = atMe.getAweme();
                        if (aweme != null && aweme.isPhotoMode() && C8SG.LIZIZ.LJJIFFI()) {
                            string2 = LIZJ().getQuantityString(R.plurals.gj, 3);
                        } else {
                            string2 = LIZJ().getString(R.string.ix7);
                        }
                        o.LJIIIIZZ(string2, "if (aweme?.isPhotoMode =…musically_tips)\n        }");
                        return string2;
                    }
                } else {
                    C53578L1a.LIZ.getClass();
                    if (C53578L1a.LIZ()) {
                        string = LIZJ().getString(R.string.ivy);
                    } else {
                        string = LIZJ().getString(R.string.ix7);
                    }
                    o.LJIIIIZZ(string, "{\n            if (StoryE…musically_tips)\n        }");
                    return string;
                }
            } else {
                String string3 = LIZJ().getString(R.string.ix8);
                o.LJIIIIZZ(string3, "resources.getString(R.st…_mentioned_in_react_tips)");
                return string3;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZJ().getString(R.string.ixa));
        LIZ2.append(' ');
        LIZ2.append(atMe.getContent());
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:
    
        if (r9 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.OSJ<java.lang.String, java.lang.Integer, java.lang.Integer> LJFF(com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r10) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MSH.LJFF(com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice):X.OSJ");
    }

    public static final String LJ(int i, List list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (list.size() == 1) {
            return MVR.LIZIZ((User) ORZ.LJLLJ(list), true);
        }
        if (list.size() == 2 && 1 <= i && i < 4) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(MVR.LIZIZ((User) ListProtector.get(list, 0), true));
            LIZ2.append(' ');
            LIZ2.append((String) LIZ.getValue());
            LIZ2.append(' ');
            LIZ2.append(MVR.LIZIZ((User) ListProtector.get(list, 1), true));
            return X1D.LIZIZ(LIZ2);
        }
        if (list.size() == 3 || (i == 3 && list.size() > 3)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(MVR.LIZIZ((User) ListProtector.get(list, 0), true));
            LIZ3.append(", ");
            LIZ3.append(MVR.LIZIZ((User) ListProtector.get(list, 1), true));
            LIZ3.append(' ');
            LIZ3.append((String) LIZ.getValue());
            LIZ3.append(' ');
            LIZ3.append(MVR.LIZIZ((User) ListProtector.get(list, 2), true));
            return X1D.LIZIZ(LIZ3);
        }
        if (list.size() <= 1) {
            return "";
        }
        String string = LIZJ().getString(R.string.ixb);
        o.LJIIIIZZ(string, "resources.getString(R.st…notification_multi_users)");
        String LIZIZ2 = Q8U.LIZIZ(new Object[]{Integer.valueOf(Math.max(i, list.size()) - 2)}, 1, string, "format(format, *args)");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(MVR.LIZIZ((User) ListProtector.get(list, 0), true));
        LIZ4.append(", ");
        LIZ4.append(MVR.LIZIZ((User) ListProtector.get(list, 1), true));
        LIZ4.append(' ');
        return C0MT.LIZ(LIZ4, (String) LIZ.getValue(), ' ', LIZIZ2, LIZ4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.OSZ<com.ss.android.ugc.aweme.profile.model.User, X.EnumC35456Dvo> LJI(java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r5, boolean r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L13
            if (r5 == 0) goto L49
            com.ss.android.ugc.aweme.profile.model.User r2 = LIZIZ(r5)
            if (r2 == 0) goto L13
            X.OSZ r1 = new X.OSZ
            X.Dvo r0 = X.EnumC35456Dvo.SEPARATE_MATCHED_FRIEND
            r1.<init>(r2, r0)
            return r1
        L13:
            if (r5 == 0) goto L49
            java.lang.Object r3 = X.ORZ.LJLLLL(r5)
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.ss.android.ugc.aweme.profile.model.User) r3
        L1b:
            X.Ol8 r0 = X.DW8.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4b
            r2 = 1
            if (r5 == 0) goto L4b
            int r0 = r5.size()
            if (r0 != r2) goto L4b
            if (r3 == 0) goto L4b
            int r1 = r3.getFollowStatus()
            r0 = 2
            if (r1 == r0) goto L41
            int r0 = r3.getFollowStatus()
            if (r0 != r2) goto L4b
        L41:
            X.OSZ r1 = new X.OSZ
            X.Dvo r0 = X.EnumC35456Dvo.SEPARATE_MATCHED_FRIEND
            r1.<init>(r3, r0)
            return r1
        L49:
            r3 = r4
            goto L1b
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MSH.LJI(java.util.List, boolean):X.OSZ");
    }

    public static final void LIZ(List<? extends User> list, View itemView, int i, View.OnClickListener avatarClickListener, View.OnClickListener moreClickListener) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(avatarClickListener, "avatarClickListener");
        o.LJIIIZ(moreClickListener, "moreClickListener");
        if (list == null || list.isEmpty()) {
            return;
        }
        int min = Math.min(list.size() - 1, ((List) LIZIZ.getValue()).size());
        int i2 = 0;
        while (i2 < min) {
            C71799SFv c71799SFv = (C71799SFv) itemView.findViewById(((Number) ListProtector.get((List) LIZIZ.getValue(), i2)).intValue());
            i2++;
            User user = (User) ListProtector.get(list, i2);
            c71799SFv.setVisibility(0);
            if (!C53752L7s.LIZJ() || !o.LJ(c71799SFv.getTag(), user)) {
                c71799SFv.setTag(user);
                if ((C53752L7s.LIZIZ() & 2) == 2) {
                    C37179EiV.LJFF.post(new ARunnableS23S0200000_4(c71799SFv, user, 42));
                } else {
                    C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(user.getAvatarThumb()), null, false, null, 126);
                }
                C16880lQ.LJJIL(c71799SFv, avatarClickListener);
                if (C53341Kwb.LIZ()) {
                    MVR.LIZ(c71799SFv, MVP.AVATAR, C32151Nz.LJIIZILJ(16));
                }
            }
        }
        int size = ((List) LIZIZ.getValue()).size();
        while (min < size) {
            ((ImageView) itemView.findViewById(((Number) ListProtector.get((List) LIZIZ.getValue(), min)).intValue())).setVisibility(4);
            min++;
        }
        TuxIconView tuxIconView = (TuxIconView) itemView.findViewById(R.id.lu0);
        if (list.size() >= 5 && i > 5) {
            tuxIconView.setVisibility(0);
            Context context = itemView.getContext();
            if (LIZJ == null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_ellipsis_horizontal;
                c2068389v.LIZIZ = C7MY.LIZIZ(20);
                c2068389v.LIZJ = C7MY.LIZIZ(20);
                c2068389v.LJ = Integer.valueOf(R.attr.gv);
                o.LJIIIIZZ(context, "context");
                SY9 LIZ2 = c2068389v.LIZ(context);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ck);
                c110614Vt.LJII = C7MY.LIZIZ(32);
                c110614Vt.LJI = C7MY.LIZIZ(32);
                c110614Vt.LIZJ = C61328O5c.LIZJ(16);
                LIZJ = C26338AVi.LJIIJ(LIZ2, c110614Vt.LIZ(context));
            }
            tuxIconView.setImageDrawable(LIZJ);
            C16880lQ.LJJJ(tuxIconView, moreClickListener);
            return;
        }
        tuxIconView.setVisibility(4);
    }
}
