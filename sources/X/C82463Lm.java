package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82463Lm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(int i, int i2, boolean z) {
        return (i != 0 || z || i2 == 0 || i2 == 1 || i2 == 15 || i2 == 1030 || i2 == 1031 || i2 == 1032 || i2 >= 4000) ? false : true;
    }

    public static boolean LIZ(C63120Opw conversation, EnumC82443Lk category, EnumC82403Lg filter) {
        boolean LJJII;
        o.LJIIIZ(conversation, "conversation");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(filter, "filter");
        C82223Ko c82223Ko = C99033ud.Companion;
        String conversationId = conversation.getConversationId();
        c82223Ko.getClass();
        if (C82223Ko.LIZ(conversationId)) {
            C96963rI.LIZLLL().getClass();
            if (!C84563To.LIZ()) {
                return false;
            }
        }
        int i = C82453Ll.LIZ[category.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C78983UzD.LJIILL("invalid sessionCategory");
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    LJJII = u.LJJIII(conversation);
                }
            } else {
                LJJII = u.LJJII(conversation);
            }
            if (!LJJII) {
                return false;
            }
        }
        int i2 = C82453Ll.LIZIZ[filter.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && conversation.getConversationType() != AbstractC63505Ow9.LIZ) {
                    return false;
                }
            } else {
                C109544Rq lastShowMessage = conversation.getLastShowMessage();
                if (lastShowMessage == null || !LIZIZ((int) conversation.getUnreadCount(), lastShowMessage.getMsgType(), lastShowMessage.isSelf())) {
                    return false;
                }
            }
        } else if (conversation.getUnreadCount() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(C3L4 session, EnumC82443Lk category, EnumC82403Lg filter) {
        C3L3 c3l3;
        IMUser LJIJI;
        Integer valueOf;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(filter, "filter");
        if (!(session instanceof C3L5)) {
            return false;
        }
        C82223Ko c82223Ko = C99033ud.Companion;
        String LJFF = session.LJFF();
        c82223Ko.getClass();
        if (C82223Ko.LIZ(LJFF)) {
            C96963rI.LIZLLL().getClass();
            if (!C84563To.LIZ()) {
                return false;
            }
        }
        C3L5 c3l5 = (C3L5) session;
        int i = C82453Ll.LIZ[category.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C162476Zf();
                    }
                } else if (c3l5.LLIIII != EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
                    return false;
                }
            } else {
                EnumC96103pu enumC96103pu = c3l5.LLIIII;
                if (enumC96103pu != EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY && enumC96103pu != null) {
                    return false;
                }
            }
        }
        int i2 = C82453Ll.LIZIZ[filter.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (!(c3l5 instanceof C3L3) || (c3l3 = (C3L3) c3l5) == null || (LJIJI = c3l3.LJIJI()) == null || (valueOf = Integer.valueOf(LJIJI.getFollowStatus())) == null) {
                        return false;
                    }
                    if (valueOf.intValue() != 1 && valueOf.intValue() != 2) {
                        return false;
                    }
                }
            } else if (!LIZIZ(c3l5.LJLLILLLL, c3l5.LJLJLLL, c3l5.LLFFF)) {
                return false;
            }
        } else if (c3l5.LJLLILLLL <= 0) {
            return false;
        }
        return true;
    }
}
