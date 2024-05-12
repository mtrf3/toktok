package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.766, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass766 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        if (r5 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.M89 r5) {
        /*
            r2 = 1
            r1 = 0
            if (r5 == 0) goto L9e
            boolean r0 = r5.isStoryPage()
            if (r0 != r2) goto Lb
            return r1
        Lb:
            int r0 = X.AnonymousClass768.LIZ()
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L9b
            r3 = 1
        L15:
            java.lang.String r1 = r5.getExposeCommentType()
            java.lang.String r0 = "MENTION"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L99
            java.lang.String r0 = r5.getExposeAvatarUrl()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L99
            java.lang.String r0 = r5.getExposeUserName()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L99
            java.lang.String r0 = r5.getExposeCommentText()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L99
            r0 = 1
        L40:
            if (r3 == 0) goto L94
            if (r0 == 0) goto L94
            r4 = 1
        L45:
            int r0 = X.AnonymousClass768.LIZ()
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L92
            r3 = 1
        L4f:
            java.lang.String r1 = r5.getExposeCommentType()
            java.lang.String r0 = "COMMENT"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L67
            java.lang.String r1 = r5.getExposeCommentType()
            java.lang.String r0 = "REPLY"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L90
        L67:
            java.lang.String r0 = r5.getExposeAvatarUrl()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L90
            java.lang.String r0 = r5.getExposeUserName()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L90
            java.lang.String r0 = r5.getExposeCommentText()
            boolean r0 = X.C78857UxB.LJJJIL(r0)
            if (r0 == 0) goto L90
            r0 = 1
        L86:
            if (r3 == 0) goto L97
            if (r0 == 0) goto L97
            r0 = 1
        L8b:
            if (r4 != 0) goto L9f
            if (r0 == 0) goto L9e
            goto L9f
        L90:
            r0 = 0
            goto L86
        L92:
            r3 = 0
            goto L4f
        L94:
            r4 = 0
            if (r5 != 0) goto L45
        L97:
            r0 = 0
            goto L8b
        L99:
            r0 = 0
            goto L40
        L9b:
            r3 = 0
            goto L15
        L9e:
            r2 = 0
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass766.LIZIZ(X.M89):boolean");
    }

    public static boolean LIZJ(Aweme aweme, M89 m89) {
        String str;
        boolean z;
        Integer num;
        String str2;
        boolean z2;
        String str3;
        AnonymousClass767 anonymousClass767;
        if (aweme == null) {
            return false;
        }
        String str4 = null;
        if (m89 != null) {
            str = m89.getFrom();
        } else {
            str = null;
        }
        if (TextUtils.equals("from_profile_self", str) || (m89 != null && m89.isMyProfile())) {
            z = true;
        } else {
            z = false;
        }
        if (m89 != null) {
            num = Integer.valueOf(m89.getPageType());
            str2 = m89.getEventType();
        } else {
            num = null;
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (num != null) {
            num.intValue();
        }
        boolean LIZIZ = LIZIZ(m89);
        if (valueOf != null) {
            z2 = valueOf.booleanValue();
        } else {
            z2 = false;
        }
        if (m89 == null || (str3 = m89.getPhotoMode()) == null) {
            str3 = "";
        }
        boolean LIZ2 = LIZ(aweme, str2, str3, z2);
        if (m89 != null) {
            str4 = m89.getFrom();
        }
        if (o.LJ(str4, "from_publish_add_video")) {
            anonymousClass767 = AnonymousClass767.NEITHER;
        } else if (LIZIZ) {
            if (LIZ2) {
                int LIZ3 = AnonymousClass768.LIZ() & 24;
                if (LIZ3 != 0) {
                    if (LIZ3 != 8) {
                        if (LIZ3 != 16) {
                            if (LIZ3 != 24) {
                                anonymousClass767 = AnonymousClass767.BOTH;
                            } else {
                                anonymousClass767 = AnonymousClass767.BOTH;
                            }
                        } else {
                            anonymousClass767 = AnonymousClass767.SHOW_BUBBLELIST;
                        }
                    } else {
                        anonymousClass767 = AnonymousClass767.SHOW_EXPOSE_COMMENT;
                    }
                } else {
                    anonymousClass767 = AnonymousClass767.BOTH;
                }
            } else {
                anonymousClass767 = AnonymousClass767.SHOW_EXPOSE_COMMENT;
            }
        } else if (LIZ2) {
            anonymousClass767 = AnonymousClass767.SHOW_BUBBLELIST;
        } else {
            anonymousClass767 = AnonymousClass767.NEITHER;
        }
        if (anonymousClass767 != AnonymousClass767.BOTH && anonymousClass767 != AnonymousClass767.SHOW_EXPOSE_COMMENT) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(Aweme aweme, String str, String str2, boolean z) {
        Integer valueOf;
        int hashCode;
        if (aweme != null && !aweme.isScheduleVideo() && !aweme.getIsTikTokStory() && ((valueOf = Integer.valueOf(aweme.getAwemeType())) == null || valueOf.intValue() != 40)) {
            if (!((RBX) HG3.LJIILL()).isMe(aweme.getAuthorUid()) || !C76A.LIZ()) {
                return false;
            }
            if (z || ((str != null && ((hashCode = str.hashCode()) == -1939110810 ? str.equals("creator_tools_page") : hashCode == -562830579 ? str.equals("personal_homepage") : !(hashCode != 1745098676 || !str.equals("live_take_page")))) || ((o.LJ(str, "inner_push") || o.LJ(str, "notification_page") || o.LJ(str, "message") || o.LJ(str2, "lemon8")) && (AnonymousClass768.LIZ() & 1) == 1))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
