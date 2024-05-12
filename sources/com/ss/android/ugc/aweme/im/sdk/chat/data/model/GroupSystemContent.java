package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C101253yD;
import X.C101283yG;
import X.C101303yI;
import X.C101313yJ;
import X.C109544Rq;
import X.C116714i3;
import X.C116724i4;
import X.C116734i5;
import X.C16880lQ;
import X.C1DD;
import X.C3IY;
import X.C47261Igj;
import X.C76800UCe;
import X.C79045V0n;
import X.C80763Ey;
import X.C81093Gf;
import X.C84763XOl;
import X.C8HI;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.T5U;
import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class GroupSystemContent extends SystemContent {
    public static final Companion Companion = new Companion();
    public static final Typeface tf = C8HI.LIZJ().LIZLLL("medium");

    @InterfaceC65349Pkn("group_name")
    public String groupName;

    @InterfaceC65349Pkn("max_display_object_users")
    public int maxObjectUsers;

    @InterfaceC65349Pkn("max_display_subject_users")
    public int maxSubjectUsers;

    @InterfaceC65349Pkn("object_users")
    public List<? extends IMUser> objectUsers;

    @InterfaceC65349Pkn("subject_users")
    public List<? extends IMUser> subjectUsers;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String spannableStringBuilder = getNoticeText$default(this, false, false, null, 4, null).toString();
        o.LJIIIIZZ(spannableStringBuilder, "getNoticeText(needClickS…Event = false).toString()");
        return spannableStringBuilder;
    }

    private final SpannableStringBuilder getUnsupportedChatMessage() {
        return new SpannableStringBuilder(EF7.LIZIZ().getString(R.string.gxz));
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getMaxObjectUsers() {
        return this.maxObjectUsers;
    }

    public final int getMaxSubjectUsers() {
        return this.maxSubjectUsers;
    }

    public final List<IMUser> getObjectUsers() {
        return this.objectUsers;
    }

    public final List<IMUser> getSubjectUsers() {
        return this.subjectUsers;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setMaxObjectUsers(int i) {
        this.maxObjectUsers = i;
    }

    public final void setMaxSubjectUsers(int i) {
        this.maxSubjectUsers = i;
    }

    public final void setObjectUsers(List<? extends IMUser> list) {
        this.objectUsers = list;
    }

    public final void setSubjectUsers(List<? extends IMUser> list) {
        this.subjectUsers = list;
    }

    private final SpannableStringBuilder buildSpannableHighlightText(int i, int i2, final InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        ForegroundColorSpan foregroundColorSpan;
        Integer LJI;
        String LIZLLL = C1DD.LIZLLL(i2, "AppContextManager.getApp…).getString(keyPhraseRes)");
        String string = EF7.LIZIZ().getString(i, LIZLLL);
        o.LJIIIIZZ(string, "AppContextManager.getApp…thPlaceholderRes, needle)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int LJJLIIIJL = s.LJJLIIIJL(string, LIZLLL, 0, false, 6);
        if (LJJLIIIJL != -1) {
            int length = LIZLLL.length() + LJJLIIIJL;
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent$buildSpannableHighlightText$customClickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    o.LJIIIZ(view, "view");
                    interfaceC88472Yns.invoke(view);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                }
            }, LJJLIIIJL, length, 18);
            spannableStringBuilder.setSpan(new T5U(62, false), LJJLIIIJL, length, 18);
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJI = C79045V0n.LJI(R.attr.e2, LJIIIIZZ)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            } else {
                foregroundColorSpan = null;
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, LJJLIIIJL, length, 18);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    private final SpannableStringBuilder getSystemUsersSpans(List<? extends IMUser> list, int i, boolean z) {
        int i2;
        Integer LJI;
        int i3 = i;
        if (i3 <= 0) {
            i3 = 1;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        ?? r12 = 0;
        if (LJIIIIZZ != null && (LJI = C79045V0n.LJI(R.attr.gu, LJIIIIZZ)) != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        C81093Gf.LIZ().getClass();
        List LJ = C3IY.LJ(list);
        C116724i4 c116724i4 = new C116724i4();
        ArrayList arrayList = (ArrayList) LJ;
        int size = arrayList.size();
        if (size > i3) {
            size = i3;
        }
        if (arrayList.size() - i3 == 1 && arrayList.size() >= 2) {
            size = arrayList.size() - 2;
        }
        List subList = arrayList.subList(0, size);
        int i4 = 0;
        for (Object obj : subList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                IMUser iMUser = (IMUser) obj;
                String displayName = iMUser.getDisplayName();
                if ((displayName == null || displayName.length() == 0) && (displayName = iMUser.getUid()) == null) {
                    displayName = "";
                }
                if (z) {
                    C101253yD c101253yD = new C101253yD(i2, iMUser, "chat", null);
                    SystemContent.Key key = new SystemContent.Key();
                    key.setAction(9);
                    c101253yD.LJLJJLL = key;
                    Object[] objArr = new Object[2];
                    objArr[r12] = new T5U(62, (boolean) r12);
                    objArr[1] = c101253yD;
                    List spans = C47261Igj.LJJIJIIJI(objArr);
                    o.LJIIIZ(spans, "spans");
                    int length = c116724i4.LIZ.length();
                    C116734i5 c116734i5 = c116724i4.LIZIZ;
                    C116714i3 c116714i3 = c116724i4.LIZ;
                    c116734i5.getClass();
                    C116734i5.LIZ(c116714i3, displayName);
                    int length2 = c116724i4.LIZ.length();
                    Iterator it = spans.iterator();
                    while (it.hasNext()) {
                        c116724i4.LIZ.setSpan(it.next(), length, length2, 33);
                    }
                } else {
                    c116724i4.LIZLLL(displayName);
                }
                if (i4 != subList.size() - 1) {
                    c116724i4.LIZIZ(EF7.LIZIZ().getString(R.string.en3) + ' ');
                }
                i4 = i5;
                r12 = 0;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (arrayList.size() > size) {
            String string = EF7.LIZIZ().getResources().getString(R.string.gy0, "{{%s}}", String.valueOf(arrayList.size() - size));
            o.LJIIIIZZ(string, "AppContextManager.getApp…size - total).toString())");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string);
            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, "{{%s}}", 0, false, 6);
            SpannableStringBuilder replace = spannableStringBuilder.replace(LJJLIIIJL, LJJLIIIJL + 6, (CharSequence) c116724i4.LIZ);
            o.LJIIIIZZ(replace, "result.replace(index, in…R.length, concat.build())");
            return replace;
        }
        return c116724i4.LIZ;
    }

    public final SpannableStringBuilder getNoticeText(boolean z, boolean z2, C109544Rq c109544Rq) {
        IMUser iMUser;
        switch (this.type) {
            case 103101:
                return formatTips$default(this, R.string.gwm, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103102:
                return formatTips(R.string.gwv, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]", "[[1]]"}, getSystemUsersSpans(this.objectUsers, 1, z));
            case 103103:
                return formatTips$default(this, R.string.gww, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103104:
                return formatTips$default(this, R.string.gwy, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103105:
                return formatTips(R.string.gwn, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]", "[[1]]"}, getSystemUsersSpans(this.objectUsers, this.maxObjectUsers, z));
            case 103106:
                SpannableStringBuilder systemUsersSpans = getSystemUsersSpans(this.subjectUsers, 1, z);
                String[] strArr = new String[2];
                strArr[0] = "[[0]]";
                String str = this.groupName;
                if (str == null) {
                    str = "";
                }
                strArr[1] = str;
                return formatTips$default(this, R.string.gwu, systemUsersSpans, strArr, null, 8, null);
            case 103107:
                List<? extends IMUser> list = this.subjectUsers;
                if (list != null && (iMUser = (IMUser) ORZ.LJLLLL(list)) != null && !o.LJ(iMUser.getUid(), C80763Ey.LIZ(false))) {
                    return new SpannableStringBuilder(EF7.LIZIZ().getString(R.string.gws, iMUser.getDisplayName()));
                }
                return new SpannableStringBuilder(EF7.LIZIZ().getString(R.string.gwt));
            case 103108:
                return new SpannableStringBuilder(EF7.LIZIZ().getString(R.string.gu9));
            case 103109:
                if (z2) {
                    C101283yG.LIZIZ(C101313yJ.LIZJ);
                }
                return buildSpannableHighlightText(R.string.gu_, R.string.gua, new GroupSystemContent$getNoticeText$2(z, z2));
            case 103110:
                if (z2) {
                    C101283yG.LIZIZ(C101303yI.LIZJ);
                }
                return buildSpannableHighlightText(R.string.gu7, R.string.gu8, new GroupSystemContent$getNoticeText$3(z, c109544Rq, z2));
            case 103111:
                return formatTips$default(this, R.string.gyv, getSystemUsersSpans(this.objectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            default:
                return getUnsupportedChatMessage();
        }
    }

    private final SpannableStringBuilder formatTips(int i, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2) {
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        try {
            spannableStringBuilder3.append((CharSequence) EF7.LIZIZ().getString(i, Arrays.copyOf(strArr, strArr.length)));
            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder3, "[[0]]", 0, false, 6);
            spannableStringBuilder3.replace(LJJLIIIJL, LJJLIIIJL + 5, (CharSequence) spannableStringBuilder);
            if (spannableStringBuilder2 != null) {
                int LJJLIIIJL2 = s.LJJLIIIJL(spannableStringBuilder3, "[[1]]", 0, false, 6);
                spannableStringBuilder3.replace(LJJLIIIJL2, LJJLIIIJL2 + 5, (CharSequence) spannableStringBuilder2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return spannableStringBuilder3;
    }

    public static /* synthetic */ SpannableStringBuilder getNoticeText$default(GroupSystemContent groupSystemContent, boolean z, boolean z2, C109544Rq c109544Rq, int i, Object obj) {
        if ((i & 4) != 0) {
            c109544Rq = null;
        }
        return groupSystemContent.getNoticeText(z, z2, c109544Rq);
    }

    public static /* synthetic */ SpannableStringBuilder getSystemUsersSpans$default(GroupSystemContent groupSystemContent, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return groupSystemContent.getSystemUsersSpans(list, i, z);
    }

    public static /* synthetic */ SpannableStringBuilder formatTips$default(GroupSystemContent groupSystemContent, int i, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            spannableStringBuilder2 = null;
        }
        return groupSystemContent.formatTips(i, spannableStringBuilder, strArr, spannableStringBuilder2);
    }
}
