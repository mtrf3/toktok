package X;

import Y.ARunnableS1S0500000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.7ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188627ak extends LinearLayout {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final View LJLIL;
    public TuxTextView LJLILLLLZI;
    public C199897sv LJLJI;
    public C199897sv LJLJJI;
    public C199897sv LJLJJL;
    public final TuxTextView LJLJJLL;
    public String LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C188627ak(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setNickNameBold(String str) {
    }

    public final C199897sv getLeftRelativeAvatar() {
        return this.LJLJJL;
    }

    public final C199897sv getRelativeAvatar() {
        return this.LJLJI;
    }

    public final TuxTextView getTvDesc() {
        return this.LJLILLLLZI;
    }

    public final TuxTextView getTvDescTextOnly() {
        return this.LJLJJLL;
    }

    public final C199897sv getVerticalRelativeAvatar() {
        return this.LJLJJI;
    }

    private final void setAvatarView(MutualStruct mutualStruct) {
        this.LJLJI.setVisibility(0);
        this.LJLJJL.setVisibility(8);
        this.LJLJJI.setVisibility(8);
        this.LJLJI.LIZ(mutualStruct);
    }

    private final void setLeftAvatarView(MutualStruct mutualStruct) {
        this.LJLJI.setVisibility(8);
        C199897sv c199897sv = this.LJLJJL;
        setVisibility(0);
        c199897sv.setAvatarSizeModel(32);
        c199897sv.LIZIZ(mutualStruct);
        this.LJLJJI.setVisibility(8);
    }

    private final void setTextSuggestStr(MutualStruct mutualStruct) {
        this.LJLILLLLZI.setVisibility(0);
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList != null && !userList.isEmpty()) {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            tuxTextView.setText(C188617aj.LIZ(context, Integer.valueOf(mutualStruct.getMutualType())));
            return;
        }
        this.LJLILLLLZI.setText(LIZIZ(mutualStruct.getTotal()));
    }

    private final void setTextWithoutNum(MutualStruct mutualStruct) {
        String str;
        String nickname;
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList != null && userList.isEmpty()) {
            this.LJLILLLLZI.setText(LIZIZ(mutualStruct.getTotal()));
            return;
        }
        this.LJLILLLLZI.setVisibility(0);
        List<MutualUser> userList2 = mutualStruct.getUserList();
        if (userList2 == null) {
            userList2 = C61878OQg.INSTANCE;
        }
        MutualUser mutualUser = (MutualUser) ListProtector.get(userList2, 0);
        String str2 = "";
        if (mutualUser == null || (str = mutualUser.getNickname()) == null) {
            str = "";
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        String LIZ = C188617aj.LIZ(context, Integer.valueOf(mutualStruct.getMutualType()));
        if (userList2.size() > 1) {
            MutualUser mutualUser2 = (MutualUser) ListProtector.get(userList2, 1);
            if (mutualUser2 != null && (nickname = mutualUser2.getNickname()) != null) {
                str2 = nickname;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(' ');
            LIZ2.append(str);
            LIZ2.append(',');
            LIZ2.append(str2);
            LIZ2.append(' ');
            str2 = X1D.LIZIZ(LIZ2);
        } else if (userList2.size() == 1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ);
            LIZ3.append(' ');
            LIZ3.append(str);
            LIZ3.append(' ');
            str2 = X1D.LIZIZ(LIZ3);
        }
        this.LJLILLLLZI.setText(str2);
        setNickNameBold(LIZ);
    }

    public final String LIZIZ(int i) {
        String quantityString = getResources().getQuantityString(R.plurals.j9, i, Integer.valueOf(i));
        o.LJIIIIZZ(quantityString, "resources.getQuantityStr…riends_tag, count, count)");
        return quantityString;
    }

    public final void setDarkMode(boolean z) {
        this.LJLJI.setDarkMode(z);
    }

    public final void setLeftRelativeAvatar(C199897sv c199897sv) {
        o.LJIIIZ(c199897sv, "<set-?>");
        this.LJLJJL = c199897sv;
    }

    public final void setRelativeAvatar(C199897sv c199897sv) {
        o.LJIIIZ(c199897sv, "<set-?>");
        this.LJLJI = c199897sv;
    }

    public final void setRootBackground(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LJLIL.setBackground(drawable);
    }

    public final void setSocialVideoTag(boolean z) {
        this.LJLJI.setSocialVideoTag(z);
    }

    public final void setTextColor(int i) {
        this.LJLILLLLZI.setTextColor(i);
    }

    public final void setTuxTextSize(int i) {
        this.LJLILLLLZI.setTuxFont(i);
        this.LJLJJLL.setTuxFont(i);
    }

    public final void setTvDesc(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLILLLLZI = tuxTextView;
    }

    public final void setTvMaxWidth(int i) {
        this.LJLILLLLZI.setMaxWidth(i);
    }

    public final void setVerticalRelativeAvatar(C199897sv c199897sv) {
        o.LJIIIZ(c199897sv, "<set-?>");
        this.LJLJJI = c199897sv;
    }

    public final void LIZ(MutualStruct mutualStruct, int i) {
        if (mutualStruct == null || mutualStruct.getTotal() <= 0) {
            return;
        }
        if (i != -4) {
            switch (i) {
                case 1:
                    LJFF(mutualStruct, 1, 1);
                    return;
                case 2:
                    LJFF(mutualStruct, 1, 2);
                    return;
                case 3:
                    LJFF(mutualStruct, 2, 2);
                    return;
                case 4:
                    setTextSuggestStr(mutualStruct);
                    setAvatarView(mutualStruct);
                    return;
                case 5:
                    setTextWithoutNum(mutualStruct);
                    setAvatarView(mutualStruct);
                    return;
                case 6:
                    setTextSuggestStr(mutualStruct);
                    this.LJLJI.LIZ(mutualStruct);
                    this.LJLJI.setVisibility(8);
                    return;
                case 7:
                    setTextSuggestStr(mutualStruct);
                    this.LJLJI.setAvatarSizeModel(22);
                    setAvatarView(mutualStruct);
                    return;
                case 8:
                    LIZLLL(mutualStruct, 17);
                    this.LJLJI.setVisibility(8);
                    this.LJLJJL.setVisibility(8);
                    C199897sv c199897sv = this.LJLJJI;
                    setVisibility(0);
                    c199897sv.setAvatarSizeModel(36);
                    c199897sv.LIZ(mutualStruct);
                    return;
                case 9:
                    LIZLLL(mutualStruct, 17);
                    return;
                case 10:
                    LIZLLL(mutualStruct, 8388611);
                    setLeftAvatarView(mutualStruct);
                    return;
                default:
                    this.LJLILLLLZI.setVisibility(8);
                    this.LJLJI.setVisibility(8);
                    return;
            }
        }
        setTuxTextSize(71);
        this.LJLJI.setAvatarSizeModel(14);
        setAvatarView(mutualStruct);
        setTextSuggestStr(mutualStruct);
    }

    public final void LIZJ(int i, int i2) {
        this.LJLJI.LJFF(i, i2);
    }

    public final void LIZLLL(MutualStruct mutualStruct, int i) {
        int i2;
        MutualUser mutualUser;
        String nickname;
        final String str;
        MutualUser mutualUser2;
        String nickname2;
        MutualUser mutualUser3;
        this.LJLILLLLZI.setTextColorRes(R.attr.gu);
        boolean z = true;
        if (this.LJLJL.length() == 0) {
            setTextSuggestStr(mutualStruct);
            return;
        }
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || userList.isEmpty()) {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            String str2 = this.LJLJL;
            if (str2.length() == 0) {
                str2 = LIZIZ(mutualStruct.getTotal());
            }
            tuxTextView.setText(str2);
            return;
        }
        this.LJLILLLLZI.setMaxLines(2);
        this.LJLILLLLZI.setGravity(i);
        this.LJLILLLLZI.setVisibility(0);
        List<MutualUser> userList2 = mutualStruct.getUserList();
        if (userList2 != null) {
            i2 = userList2.size();
        } else {
            i2 = 0;
        }
        final String str3 = "";
        if (i2 >= 2) {
            if (s.LJJJLZIJ(this.LJLJL, "{0}", false) && s.LJJJLZIJ(this.LJLJL, "{1}", false)) {
                List<MutualUser> userList3 = mutualStruct.getUserList();
                if (userList3 == null || (mutualUser3 = (MutualUser) ListProtector.get(userList3, 0)) == null || (str = mutualUser3.getNickname()) == null) {
                    str = "";
                }
                List<MutualUser> userList4 = mutualStruct.getUserList();
                if (userList4 != null && (mutualUser2 = (MutualUser) ListProtector.get(userList4, 1)) != null && (nickname2 = mutualUser2.getNickname()) != null) {
                    str3 = nickname2;
                }
                String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(this.LJLJL, "{0}", str, false), "{1}", str3, false);
                StringBuilder LIZLLL = C06540Nm.LIZLLL("firsName = ", str, ", secondName = ", str3, "\n recReasonWithPlaceHolder = ");
                LIZLLL.append(this.LJLJL);
                C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZLLL));
                this.LJLILLLLZI.setText(LJJJJZ);
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("enable_ellipsis_nickname", true);
                } catch (Throwable unused) {
                }
                if (!z) {
                    C221018lt.LIZ("TTRecUser", "disable ellipsis nick name");
                    return;
                } else {
                    this.LJLILLLLZI.post(new Runnable() { // from class: X.7al
                        public final void LIZ() {
                            Object LIZ;
                            int lineCount;
                            int i3;
                            C188627ak c188627ak = C188627ak.this;
                            String str4 = str;
                            String str5 = str3;
                            try {
                                lineCount = c188627ak.getTvDesc().getLineCount();
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("lineCount = ");
                                LIZ2.append(lineCount);
                                C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZ2));
                            } catch (Throwable th) {
                                LIZ = C141335gf.LIZ(th);
                                C3C5.m7constructorimpl(LIZ);
                            }
                            if (lineCount <= 0) {
                                return;
                            }
                            Layout layout = c188627ak.getTvDesc().getLayout();
                            if (layout != null) {
                                i3 = layout.getEllipsisCount(lineCount - 1);
                            } else {
                                i3 = 0;
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("ellipsizeCount = ");
                            LIZ3.append(i3);
                            C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZ3));
                            if (i3 <= 0) {
                                return;
                            }
                            int length = str4.length();
                            int length2 = str5.length();
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("firstNameLength = ");
                            LIZ4.append(length);
                            LIZ4.append(" and secondNameLength = ");
                            LIZ4.append(length2);
                            C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZ4));
                            if (i3 >= length + length2 + 6) {
                                return;
                            }
                            int i4 = i3 + 3;
                            String str6 = "...";
                            if (length2 <= i4) {
                                if (length2 != i4 && (i3 - length2) + 3 > 0) {
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    String substring = str4.substring(0, (length - i3) - 3);
                                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    LIZ5.append(substring);
                                    LIZ5.append("...");
                                    str4 = X1D.LIZIZ(LIZ5);
                                }
                            } else {
                                StringBuilder LIZ6 = X1D.LIZ();
                                String substring2 = str5.substring(0, (length2 - i3) - 3);
                                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                LIZ6.append(substring2);
                                LIZ6.append("...");
                                str6 = X1D.LIZIZ(LIZ6);
                            }
                            String LJJJJZ2 = ujb.o.LJJJJZ(ujb.o.LJJJJZ(c188627ak.LJLJL, "{0}", str4, false), "{1}", str6, false);
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append("summary:\n replaceNickNameA    = ");
                            LIZ7.append(str4);
                            LIZ7.append("\n replaceNickNameB    = ");
                            LIZ7.append(str6);
                            LIZ7.append("\n resultReason2       = ");
                            LIZ7.append(LJJJJZ2);
                            C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZ7));
                            c188627ak.getTvDesc().setText(LJJJJZ2);
                            LIZ = C76800UCe.LIZ;
                            C3C5.m7constructorimpl(LIZ);
                            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                            if (m10exceptionOrNullimpl != null) {
                                C221018lt.LIZJ("TTRecUserMutual", "ellipsize fail", m10exceptionOrNullimpl);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (i2 == 1 && s.LJJJLZIJ(this.LJLJL, "{0}", false)) {
            List<MutualUser> userList5 = mutualStruct.getUserList();
            if (userList5 != null && (mutualUser = (MutualUser) ListProtector.get(userList5, 0)) != null && (nickname = mutualUser.getNickname()) != null) {
                str3 = nickname;
            }
            this.LJLJL = ujb.o.LJJJJZ(this.LJLJL, "{0}", str3, false);
            StringBuilder LIZIZ = C25620zW.LIZIZ("firsName = ", str3, "\n recReasonWithPlaceHolder = ");
            LIZIZ.append(this.LJLJL);
            C221018lt.LIZ("TTRecUser", X1D.LIZIZ(LIZIZ));
            this.LJLILLLLZI.setText(this.LJLJL);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C188627ak(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            X.Ol8 r0 = X.C33688DKa.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 2131561490(0x7f0d0c12, float:1.8748382E38)
            if (r0 == 0) goto L8c
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L8c
            android.app.Activity r3 = (android.app.Activity) r3
            r0 = 1
            X.C16970lZ.LIZJ(r1, r3, r2, r0)
        L29:
            r0 = 2131371812(0x7f0a2724, float:1.836367E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.mutual_relation_root)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LJLIL = r1
            r0 = 2131379022(0x7f0a434e, float:1.8378293E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.tv_desc)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r2.LJLILLLLZI = r1
            r0 = 2131374547(0x7f0a31d3, float:1.8369217E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.relative_user_avatar)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.7sv r1 = (X.C199897sv) r1
            r2.LJLJI = r1
            r0 = 2131374549(0x7f0a31d5, float:1.836922E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.relative_user_avatar_vertical)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.7sv r1 = (X.C199897sv) r1
            r2.LJLJJI = r1
            r0 = 2131374548(0x7f0a31d4, float:1.8369219E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.relative_user_avatar_left)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.7sv r1 = (X.C199897sv) r1
            r2.LJLJJL = r1
            r0 = 2131379028(0x7f0a4354, float:1.8378305E38)
            android.view.View r1 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.tv_desc_txt_only)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r2.LJLJJLL = r1
            java.lang.String r0 = ""
            r2.LJLJL = r0
            return
        L8c:
            android.view.View.inflate(r3, r1, r2)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188627ak.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void LJFF(MutualStruct mutualStruct, int i, int i2) {
        String nickname;
        int size;
        String str;
        this.LJLILLLLZI.setVisibility(0);
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null) {
            userList = C61878OQg.INSTANCE;
        }
        int total = mutualStruct.getTotal();
        this.LJLILLLLZI.setMaxLines(i);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new StringBuilder();
        C68322mC c68322mC2 = new C68322mC();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        ?? LIZ = C188617aj.LIZ(context, Integer.valueOf(mutualStruct.getMutualType()));
        c68322mC2.element = LIZ;
        StringBuilder sb = (StringBuilder) c68322mC.element;
        sb.append((String) LIZ);
        sb.append(" ");
        String str2 = "";
        if (i2 > 1 && total > 1) {
            int i3 = 0;
            for (MutualUser mutualUser : userList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    MutualUser mutualUser2 = mutualUser;
                    StringBuilder sb2 = (StringBuilder) c68322mC.element;
                    if (mutualUser2 == null || (str = mutualUser2.getNickname()) == null) {
                        str = "";
                    }
                    sb2.append(str);
                    if (i3 != userList.size() - 1) {
                        ((StringBuilder) c68322mC.element).append(", ");
                    } else {
                        ((StringBuilder) c68322mC.element).append(" ");
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            StringBuilder sb3 = (StringBuilder) c68322mC.element;
            MutualUser mutualUser3 = (MutualUser) ListProtector.get(userList, 0);
            if (mutualUser3 != null && (nickname = mutualUser3.getNickname()) != null) {
                str2 = nickname;
            }
            sb3.append(str2);
            sb3.append(" ");
        }
        ((StringBuilder) c68322mC.element).length();
        C76732zl c76732zl = new C76732zl();
        if (i2 == 1) {
            size = total - 1;
        } else {
            size = total - userList.size();
        }
        c76732zl.element = size;
        if (size > 99) {
            c76732zl.element = 99;
        }
        if (c76732zl.element > 0) {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            StringBuilder sb4 = (StringBuilder) c68322mC.element;
            sb4.append(getContext().getString(R.string.ptl, Integer.valueOf(c76732zl.element)));
            tuxTextView.setText(sb4);
        } else {
            this.LJLILLLLZI.setText((CharSequence) c68322mC.element);
        }
        this.LJLILLLLZI.post(new ARunnableS1S0500000_3(this, c68322mC, c76732zl, mutualStruct, c68322mC2, 1));
    }

    public static void LJ(C188627ak c188627ak, Integer num, Integer num2, Integer num3, Integer num4) {
        C26338AVi.LJIIIIZZ(c188627ak.LJLIL, num, num2, num3, num4, true);
    }
}
