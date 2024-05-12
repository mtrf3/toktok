package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ln */
/* loaded from: classes2.dex */
public final class C82473Ln {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC82843My LIZLLL(C3L4 c3l4) {
        if (C81413Hl.LJ(c3l4)) {
            return new C82483Lo(R.attr.gp);
        }
        if (c3l4.LJLLL && c3l4.LJLLILLLL == 0) {
            return new C82493Lp(1, R.attr.gp);
        }
        return new C82493Lp(c3l4.LJLLILLLL, R.attr.gp);
    }

    public static C82493Lp LJ(C3LK c3lk) {
        if (c3lk.LJLLILLLL <= 0) {
            return null;
        }
        return new C82493Lp(c3lk.LJLLILLLL, 0, 2, null);
    }

    public static AbstractC82843My LJFF(C3L4 session) {
        boolean z;
        AbstractC82843My c82483Lo;
        C82493Lp c82493Lp;
        IMUser LJIJI;
        boolean z2;
        boolean z3;
        IMUser LJIJI2;
        o.LJIIIZ(session, "session");
        if (C55888Lwa.LIZIZ.LJJI(true)) {
            if (session.LJLLILLLL > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((session instanceof C3L5) && ((C3L5) session).LLIIII == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && !session.LJLLJ) {
                return null;
            }
            if (z3 && z2) {
                if (C81413Hl.LJ(session)) {
                    c82483Lo = new C82483Lo(0, 1, null);
                    return c82483Lo;
                }
                c82493Lp = new C82493Lp(session.LJLLILLLL, 0, 2, null);
                return c82493Lp;
            }
            if (session.LL || ((session instanceof C3L3) && (LJIJI2 = ((C3L3) session).LJIJI()) != null && LJIJI2.isBlock())) {
                return LIZLLL(session);
            }
            if (C81413Hl.LJ(session)) {
                c82483Lo = new C82483Lo(0, 1, null);
            } else {
                if (z2) {
                    c82493Lp = new C82493Lp(session.LJLLILLLL, 0, 2, null);
                    return c82493Lp;
                }
                if (session.LJLLL) {
                    c82483Lo = new C82493Lp(1, 0, 2, null);
                } else {
                    c82483Lo = new C82483Lo(0, 1, null);
                }
            }
            return c82483Lo;
        }
        if (session.LJLLILLLL > 0) {
            z = true;
        } else {
            z = false;
            if (!session.LJLLJ) {
                return null;
            }
        }
        if (session.LL || ((session instanceof C3L3) && (LJIJI = ((C3L3) session).LJIJI()) != null && LJIJI.isBlock())) {
            return LIZLLL(session);
        }
        if (C81413Hl.LJ(session)) {
            c82483Lo = new C82483Lo(0, 1, null);
        } else {
            if (z) {
                c82493Lp = new C82493Lp(session.LJLLILLLL, 0, 2, null);
                return c82493Lp;
            }
            if (session.LJLLL) {
                c82483Lo = new C82493Lp(1, 0, 2, null);
            } else {
                c82483Lo = new C82483Lo(0, 1, null);
            }
        }
        return c82483Lo;
    }

    public static /* synthetic */ boolean LJII(C63120Opw c63120Opw) {
        return LJI(c63120Opw, new C43001GuD());
    }

    public static boolean LJI(C63120Opw c63120Opw, C43001GuD deps) {
        o.LJIIIZ(deps, "deps");
        if (c63120Opw == null) {
            C34B.LJI("SessionConverter", "conversation convert fail cause null");
            return false;
        }
        if (c63120Opw.getLastShowMessage() == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("conversation convertToChat fail cause lastMessage is null! conv id is ");
            LIZ2.append(c63120Opw.getConversationId());
            LIZ2.append(" is single chat ");
            LIZ2.append(c63120Opw.isSingleChat());
            LIZ2.append(" last message property: ");
            AnonymousClass325.LIZ.getClass();
            LIZ2.append(AnonymousClass325.LJ(c63120Opw));
            C34B.LJI("SessionConverter", X1D.LIZIZ(LIZ2));
            C82223Ko c82223Ko = C99033ud.Companion;
            String conversationId = c63120Opw.getConversationId();
            c82223Ko.getClass();
            if (!C82223Ko.LIZ(conversationId)) {
                return false;
            }
            return true;
        }
        if (c63120Opw.isGroupChat()) {
            return true;
        }
        if (!c63120Opw.isSingleChat()) {
            return false;
        }
        if (C81273Gx.LIZLLL(c63120Opw.getConversationId()) > 0) {
            return true;
        }
        C34B.LJI("SessionConverter", "conversation convertToChat fail cause cid is illegal,uid parse fail");
        return false;
    }

    public static long LIZ(C63120Opw c63120Opw, LastMessageProperty lastMessageProperty, boolean z) {
        long j;
        AnonymousClass325.LIZ.getClass();
        long LIZLLL = AnonymousClass325.LIZLLL(lastMessageProperty);
        C109544Rq lastShowMessage = c63120Opw.getLastShowMessage();
        if (lastShowMessage != null) {
            j = lastShowMessage.getCreatedAt();
        } else {
            j = 0;
        }
        if (LIZLLL < j) {
            LIZLLL = j;
        }
        if (!z && c63120Opw.isStickTop()) {
            long updatedTime = c63120Opw.getUpdatedTime();
            if (LIZLLL < updatedTime) {
                return updatedTime;
            }
            return LIZLLL;
        }
        return LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0215, code lost:
    
        if (r16.isFiltered() != false) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024a  */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.3L4, X.3L3, X.3L5] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C3L5 LIZIZ(X.C63120Opw r16, X.C43001GuD r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82473Ln.LIZIZ(X.Opw, X.GuD, boolean, int):X.3L5");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ff, code lost:
    
        if (r9 != null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0304, code lost:
    
        r0 = r13.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0308, code lost:
    
        if (r0 == null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030a, code lost:
    
        r8 = r0.substring(2);
        kotlin.jvm.internal.o.LJIIIIZZ(r8, "this as java.lang.String).substring(startIndex)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0319, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r8, "love") == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031b, code lost:
    
        r8 = "❤️";
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0321, code lost:
    
        if (r9.length() != 0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0323, code lost:
    
        r0 = X.EF7.LIZIZ().getString(com.zhiliaoapp.musically.R.string.pt_, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0332, code lost:
    
        if (r0 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0334, code lost:
    
        r12.LLFZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0338, code lost:
    
        r0 = X.EF7.LIZIZ().getString(com.zhiliaoapp.musically.R.string.pt8, r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x034a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0302, code lost:
    
        if (r13 != null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r10 == null) goto L211;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZJ(X.C63120Opw r11, X.C3L5 r12, com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty r13, com.ss.android.ugc.aweme.im.service.model.IMUser r14, X.C43001GuD r15) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82473Ln.LIZJ(X.Opw, X.3L5, com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty, com.ss.android.ugc.aweme.im.service.model.IMUser, X.GuD):java.lang.CharSequence");
    }
}
