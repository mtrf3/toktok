package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.368, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass368 extends AbstractC65781Prl implements InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h> {
    public static final AnonymousClass368 LJLIL = new AnonymousClass368();

    public AnonymousClass368() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC785136h invoke(Activity activity, AbstractC90763hI abstractC90763hI, C3L4 c3l4) {
        final Activity activity2 = activity;
        final AbstractC90763hI cm = abstractC90763hI;
        final C3L4 session = c3l4;
        o.LJIIIZ(activity2, "activity");
        o.LJIIIZ(cm, "cm");
        o.LJIIIZ(session, "session");
        return new AbstractC785136h(activity2, cm, session) { // from class: X.3Et
            public final int LJLJL;
            public final int LJLJLJ;
            public final int LJLJLLL;

            @Override // X.AbstractC785136h
            public final void LIZ() {
                Activity LJIJJ;
                String str;
                IMUser LJIJI;
                final C63120Opw c63120Opw = this.LJLJJI;
                if (c63120Opw == null || (LJIJJ = C45804HyK.LJIJJ(this.LJLIL)) == null) {
                    return;
                }
                C98793uF.LIZLLL(new InterfaceC91483iS(c63120Opw) { // from class: X.3iO
                    public final C63120Opw LIZ;
                    public final int LIZIZ = 5;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C91443iO)) {
                            return false;
                        }
                        C91443iO c91443iO = (C91443iO) obj;
                        return o.LJ(this.LIZ, c91443iO.LIZ) && this.LIZIZ == c91443iO.LIZIZ;
                    }

                    public final int hashCode() {
                        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
                    @Override // X.InterfaceC91483iS
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C98803uG LIZ() {
                        /*
                            r26 = this;
                            r1 = r26
                            X.Opw r0 = r1.LIZ
                            long r2 = r0.getConversationShortId()
                            java.lang.String r6 = java.lang.String.valueOf(r2)
                            X.Opw r0 = r1.LIZ
                            int r2 = r0.getConversationType()
                            int r0 = X.AbstractC63505Ow9.LIZIZ
                            if (r2 != r0) goto La4
                            r5 = 1
                            r12 = 3
                        L18:
                            r10 = 0
                            if (r5 != 0) goto L98
                            X.Opw r0 = r1.LIZ
                            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = X.C79004UzY.LJIIJJI(r0)
                            if (r4 == 0) goto L99
                            com.ss.android.ugc.aweme.base.model.UrlModel r18 = r4.getDisplayAvatar()
                            java.lang.String r17 = r4.getNickName()
                            int r0 = r4.getFollowingCount()
                            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
                            int r0 = r4.getFollowerCount()
                            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
                            int r0 = r4.getFollowStatus()
                            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
                        L43:
                            if (r5 == 0) goto L4d
                            long r2 = X.C98793uF.LIZJ()
                            java.lang.String r6 = java.lang.String.valueOf(r2)
                        L4d:
                            if (r5 == 0) goto L89
                        L4f:
                            java.lang.String r7 = ""
                        L51:
                            java.lang.String r9 = X.C98793uF.LJFF(r4)
                            X.Opw r0 = r1.LIZ
                            java.lang.String r8 = r0.getConversationId()
                            X.Opw r0 = r1.LIZ
                            X.OpQ r0 = r0.getCoreInfo()
                            if (r0 == 0) goto L87
                            java.lang.String r13 = r0.getName()
                        L67:
                            if (r5 == 0) goto L84
                            java.lang.String r11 = "im_group_chat"
                        L6b:
                            int r14 = r1.LIZIZ
                            X.3uG r5 = new X.3uG
                            java.lang.String r0 = "conversationId"
                            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
                            r15 = 0
                            r24 = 198160(0x30610, float:2.77681E-40)
                            r16 = r15
                            r22 = r10
                            r23 = r10
                            r25 = r10
                            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                            return r5
                        L84:
                            java.lang.String r11 = "im"
                            goto L6b
                        L87:
                            r13 = r10
                            goto L67
                        L89:
                            X.Opw r0 = r1.LIZ
                            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = X.C79004UzY.LJIIJJI(r0)
                            if (r0 == 0) goto L4f
                            java.lang.String r7 = r0.getUid()
                            if (r7 != 0) goto L51
                            goto L4f
                        L98:
                            r4 = r10
                        L99:
                            r18 = r10
                            r17 = r10
                            r19 = r10
                            r20 = r10
                            r21 = r10
                            goto L43
                        La4:
                            r5 = 0
                            X.Opw r0 = r1.LIZ
                            boolean r0 = X.C79004UzY.LJJIJIL(r0)
                            if (r0 == 0) goto Lb0
                            r12 = 1
                            goto L18
                        Lb0:
                            r12 = 0
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C91443iO.LIZ():X.3uG");
                    }

                    public final String toString() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("FromConversation(conversation=");
                        LIZ.append(this.LIZ);
                        LIZ.append(", defaultMsgSelectedNumber=");
                        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                    }

                    {
                        this.LIZ = c63120Opw;
                    }
                }, LJIJJ, "8", null, 24);
                HashMap<String, String> hashMap = this.LJLJI.LJZ;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = "chat_list";
                }
                C3L4 session2 = this.LJLJI;
                C85323Wm eventSender = C772831o.LIZ();
                o.LJIIIZ(session2, "session");
                o.LJIIIZ(eventSender, "eventSender");
                C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str);
                if (session2.LJIIIIZZ() == 20) {
                    LIZIZ.put("chat_type", "group");
                } else {
                    LIZIZ.put("chat_type", "private");
                    if ((session2 instanceof C3L3) && (LJIJI = ((C3L3) session2).LJIJI()) != null && C3UE.LIZIZ()) {
                        String recType = LJIJI.getRecType();
                        if (recType == null) {
                            recType = "";
                        }
                        LIZIZ.put("rec_type", recType);
                        LIZIZ.put("relation_tag", String.valueOf(LJIJI.getFollowStatus()));
                    }
                }
                LIZIZ.put("enter_method", "button");
                eventSender.LIZIZ("click_report", LIZIZ);
            }

            @Override // X.AbstractC785136h
            public final int LIZIZ() {
                return this.LJLJLLL;
            }

            @Override // X.AbstractC785136h
            public final int LIZJ() {
                return this.LJLJLJ;
            }

            @Override // X.AbstractC785136h
            public final int LIZLLL() {
                return this.LJLJL;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity2, cm, session);
                IMUser LJIJI;
                o.LJIIIZ(activity2, "activity");
                o.LJIIIZ(cm, "conversationModel");
                o.LJIIIZ(session, "session");
                this.LJLJL = 1;
                this.LJLJLJ = R.string.h8l;
                this.LJLJLLL = R.raw.icon_flag;
                if ((session instanceof C3L3) && C3UE.LIZ() && (LJIJI = ((C3L3) session).LJIJI()) != null) {
                    String recType = LJIJI.getRecType();
                    if ((recType == null || recType.length() == 0) && 1 != 0) {
                        C3FW LIZ = C785836o.LIZ();
                        String uid = LJIJI.getUid();
                        LIZ.getClass();
                        MAFIMUser LIZIZ = C3FW.LIZIZ(uid);
                        if (LIZIZ != null && C78685UuP.LJJJZ(LIZIZ.getRecType())) {
                            LJIJI.setRecType(LIZIZ.getRecType());
                        }
                    }
                }
            }
        };
    }
}
