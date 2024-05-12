package X;

import Y.ARunnableS20S0200000_1;
import Y.ARunnableS29S0200000_10;
import Y.IDbS168S0200000_1;
import Y.IDbS398S0100000_1;
import Y.IDcS135S0200000_1;
import Y.IDcS13S1100000_1;
import Y.IDcS364S0100000_1;
import Y.IDcS406S0100000_1;
import Y.IDcS407S0100000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120184ne extends AbstractC90763hI {
    public final String LIZIZ;
    public final C64962gm LIZJ;
    public final C62822Ol8 LIZLLL;

    @Override // X.AbstractC90763hI
    public final C63120Opw LIZLLL() {
        return C4WC.LIZIZ.LIZ(this.LIZIZ);
    }

    public final C120014nN LJJ() {
        return (C120014nN) this.LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3C4, java.lang.Object] */
    @Override // X.AbstractC90763hI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C792239a LJI() {
        /*
            r8 = this;
            X.4nN r0 = r8.LJJ()
            r0.getClass()
            X.4fk r1 = X.C115284fk.LJIILIIL()
            java.lang.String r0 = r0.LJLJI
            X.Opw r7 = r1.LJIIIZ(r0)
            r6 = 0
            if (r7 == 0) goto L33
            java.lang.String r5 = r7.getDraftContent()
            java.util.Map r1 = r7.getLocalExt()
            if (r1 == 0) goto L34
            java.lang.String r0 = "local_ext_key_draft_quoted_msg_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L34
            java.lang.Long r4 = X.C38350F3i.LJJIZ(r0)
        L2c:
            boolean r0 = X.C81253Gv.LIZ()
            if (r0 == 0) goto L6f
            goto L36
        L33:
            r5 = r6
        L34:
            r4 = r6
            goto L2c
        L36:
            X.3Ic r0 = new X.3Ic     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Type r3 = r0.getType()     // Catch: java.lang.Throwable -> L5f
            com.google.gson.Gson r2 = X.C75792yF.LIZIZ()     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L5d
            java.util.Map r1 = r7.getLocalExt()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L5d
            java.lang.String r0 = "rich_text_draft"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5f
        L53:
            java.lang.Object r1 = r2.LJII(r0, r3)     // Catch: java.lang.Throwable -> L5f
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L5f
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L5d:
            r0 = r6
            goto L53
        L5f:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L67:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L75
        L6d:
            java.util.List r6 = (java.util.List) r6
        L6f:
            X.39a r0 = new X.39a
            r0.<init>(r5, r4, r6)
            return r0
        L75:
            r6 = r1
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120184ne.LJI():X.39a");
    }

    @Override // X.AbstractC90763hI
    public final void LJII() {
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        String str = this.LIZIZ;
        LJIILIIL.getClass();
        C63356Otk.LJIIIZ().getClass();
        C115284fk.LJIILIIL().LJIIJ(str, new C63223Orb(str));
    }

    @Override // X.AbstractC90763hI
    public final void LJIIJ() {
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationModel queryMemberList:");
        LIZ.append(LJJ.LJLJI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        RunnableC63345OtZ.LJ(new IDcS406S0100000_1(LJJ, 3), new IDbS168S0200000_1(LJJ, 2), false);
    }

    @Override // X.AbstractC90763hI
    public final List<C63089OpR> LJIIJJI() {
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationModel queryMemberListSync:");
        LIZ.append(LJJ.LJLJI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        List<C63089OpR> LJFF = C63124Oq0.LJFF(LJJ.LJLJI);
        if (LJFF == null) {
            return C61878OQg.INSTANCE;
        }
        return LJFF;
    }

    @Override // X.AbstractC90763hI
    public final void LJIILL() {
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        String str = this.LIZIZ;
        LJIILIIL.getClass();
        C63356Otk.LJIIIZ().getClass();
        C115284fk.LJIILIIL().LJIIJ(str, new C63655OyZ());
    }

    @Override // X.AbstractC90763hI
    public final void LJIJ() {
        LJJ().LIZIZ();
    }

    @Override // X.AbstractC90763hI
    public final String LJ() {
        return this.LIZIZ;
    }

    public C120184ne(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZIZ = conversationId;
        this.LIZJ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
        this.LIZLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 981));
    }

    @Override // X.AbstractC90763hI
    public final void LIZJ(IDcS364S0100000_1 iDcS364S0100000_1) {
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        C120164nc c120164nc = new C120164nc(iDcS364S0100000_1);
        c120164nc.LIZJ.LIZIZ = SystemClock.elapsedRealtime();
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ2 == null) {
            c120164nc.LIZIZ(C63622Oy2.LIZJ(-1017));
            return;
        }
        C63269OsL.LJIIJJI(LJIIIZ2.getInboxType(), str);
        C120534oD c120534oD = new C120534oD();
        c120534oD.LIZLLL = str;
        c120534oD.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120534oD.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        DissolveConversationRequestBody build = c120534oD.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJI = build;
        c120164nc.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str, Boolean.TRUE);
    }

    @Override // X.AbstractC90763hI
    public final void LJFF(IDcS364S0100000_1 iDcS364S0100000_1) {
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        C120194nf c120194nf = new C120194nf(iDcS364S0100000_1);
        c120194nf.LIZJ.LIZIZ = SystemClock.elapsedRealtime();
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ2 == null) {
            c120194nf.LIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-1017)));
            return;
        }
        C120524oC c120524oC = new C120524oC();
        c120524oC.LIZLLL = str;
        c120524oC.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120524oC.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        ConversationLeaveRequestBody build = c120524oC.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJIIZ = build;
        c120194nf.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str, Boolean.TRUE);
    }

    @Override // X.AbstractC90763hI
    public final void LJIIL(C4WU observer) {
        o.LJIIIZ(observer, "observer");
        C120014nN LJJ = LJJ();
        LJJ.LJLJJI = observer;
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        String str = LJJ.LJLJI;
        List list = (List) ((ConcurrentHashMap) LIZLLL.LIZJ).get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(LJJ)) {
            int i = 0;
            while (i < list.size() && (ListProtector.get(list, i) == null || LJJ.JG() >= ((InterfaceC120024nO) ListProtector.get(list, i)).JG())) {
                i++;
            }
            ListProtector.add(list, i, LJJ);
        }
        ((ConcurrentHashMap) LIZLLL.LIZJ).put(str, list);
    }

    @Override // X.AbstractC90763hI
    public final C76800UCe LJIILJJIL(C792239a c792239a) {
        java.util.Map<String, String> localExt;
        String str;
        final long currentTimeMillis;
        C120014nN LJJ = LJJ();
        final String str2 = c792239a.LIZ;
        final String str3 = LJJ.LJLJI;
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str3);
        if (LJIIIZ != null && !TextUtils.equals(str2, LJIIIZ.getDraftContent())) {
            if (TextUtils.isEmpty(str2)) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            if (TextUtils.isEmpty(str2)) {
                LJIIIZ.setDraftContent(str2);
                LJIIIZ.setDraftTime(currentTimeMillis);
            }
            C63322OtC.LJFF("ConversationModel saveDraft");
            RunnableC63345OtZ.LIZLLL(new C63137OqD(str3, str2, currentTimeMillis), new InterfaceC63353Oth<Boolean>() { // from class: X.4nh
                @Override // X.InterfaceC63353Oth
                public final void LIZLLL(Boolean bool) {
                    C63120Opw LJIIIZ2;
                    Boolean bool2 = bool;
                    if (bool2 != null && bool2.booleanValue() && (LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str3)) != null) {
                        LJIIIZ2.setDraftContent(str2);
                        LJIIIZ2.setDraftTime(currentTimeMillis);
                        C115284fk.LJIILIIL().LJIJI(9, LJIIIZ2);
                    }
                }
            }, C63346Ota.LIZ());
        }
        C120014nN LJJ2 = LJJ();
        LJJ2.getClass();
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(LJJ2.LJLJI);
        if (LJIIIZ2 == null || (localExt = LJIIIZ2.getLocalExt()) == null) {
            return C76800UCe.LIZ;
        }
        Long l = c792239a.LIZIZ;
        if (l == null || (str = l.toString()) == null) {
            str = "";
        }
        localExt.put("local_ext_key_draft_quoted_msg_id", str);
        if (C81253Gv.LIZ()) {
            List<RichTextInfo> list = c792239a.LIZJ;
            if (list != null) {
                localExt.put("rich_text_draft", C75792yF.LIZJ(list));
            } else {
                localExt.remove("rich_text_draft");
            }
        }
        LJIJJLI(localExt);
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC90763hI
    public final void LJIJI(C4WU observer) {
        o.LJIIIZ(observer, "observer");
        LJJ().LJ(observer);
    }

    @Override // X.AbstractC90763hI
    public final void LJIJJLI(java.util.Map<String, String> map) {
        XKX.LIZLLL(this.LIZJ, null, null, new C81453Hp(this, map, null), 3);
    }

    @Override // X.AbstractC90763hI
    public final void LIZIZ(EnumC96103pu category, InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        o.LJIIIZ(category, "category");
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        if (C115284fk.LJIILIIL().LJIIIZ(LJJ.LJLJI) == null) {
            C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
            c63623Oy3.LIZJ = "conversation is null";
            interfaceC86963bA.LIZIZ(c63623Oy3);
            return;
        }
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        C63534Owc c63534Owc = new C63534Owc(interfaceC86963bA);
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ2 == null) {
            C63623Oy3 c63623Oy32 = new C63375Ou3().LIZ;
            c63623Oy32.LIZJ = "conversation is null";
            c63534Owc.LIZ(c63623Oy32);
            return;
        }
        C120474o7 c120474o7 = new C120474o7();
        c120474o7.LIZLLL = str;
        c120474o7.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120474o7.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        c120474o7.LJIIIZ = category;
        SetConversationSettingInfoRequestBody build = c120474o7.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJ = build;
        c63534Owc.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str, Boolean.FALSE, "s:category");
    }

    @Override // X.AbstractC90763hI
    public final void LJIIIIZZ(InterfaceC86963bA interfaceC86963bA, boolean z) {
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        if (C115284fk.LJIILIIL().LJIIIZ(LJJ.LJLJI) == null) {
            return;
        }
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        C63534Owc c63534Owc = new C63534Owc(interfaceC86963bA);
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        C120474o7 c120474o7 = new C120474o7();
        c120474o7.LIZLLL = str;
        c120474o7.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120474o7.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        c120474o7.LJII = Boolean.valueOf(z);
        SetConversationSettingInfoRequestBody build = c120474o7.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJ = build;
        c63534Owc.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str, Boolean.FALSE, "s:mute");
    }

    @Override // X.AbstractC90763hI
    public final void LJIIIZ(String uid, C81163Gm c81163Gm) {
        o.LJIIIZ(uid, "uid");
        long LJJI = C1GE.LJJI(uid, c81163Gm);
        if (LJJI <= 0) {
            return;
        }
        C120014nN LJJ = LJJ();
        String str = this.LIZIZ;
        String valueOf = String.valueOf(LJJI);
        LJJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationModel queryMember, conversationId:");
        LIZ.append(LJJ.LJLJI);
        LIZ.append(", uid:");
        LIZ.append(valueOf);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(valueOf)) {
            RunnableC63345OtZ.LJ(new C63129Oq5(str, valueOf), new IDbS398S0100000_1(c81163Gm, 5), false);
        }
    }

    @Override // X.AbstractC90763hI
    public final void LJIIZILJ(InterfaceC86963bA interfaceC86963bA, boolean z) {
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        if (C115284fk.LJIILIIL().LJIIIZ(LJJ.LJLJI) == null) {
            return;
        }
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        C63534Owc c63534Owc = new C63534Owc(interfaceC86963bA);
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        C120474o7 c120474o7 = new C120474o7();
        c120474o7.LIZLLL = str;
        c120474o7.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120474o7.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        c120474o7.LJI = Boolean.valueOf(z);
        SetConversationSettingInfoRequestBody build = c120474o7.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJ = build;
        RequestBody build2 = c89453Z8v.build();
        int inboxType = LJIIIZ2.getInboxType();
        Object[] objArr = new Object[3];
        boolean z2 = false;
        objArr[0] = str;
        if (C63308Osy.LJI().LIZLLL().LJIL && z) {
            z2 = true;
        }
        objArr[1] = Boolean.valueOf(z2);
        objArr[2] = "s:stick_on_top";
        c63534Owc.LJIIJJI(inboxType, build2, null, objArr);
    }

    @Override // X.AbstractC90763hI
    public final void LJIJJ(final java.util.Map<String, String> ext, InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        o.LJIIIZ(ext, "ext");
        C120014nN LJJ = LJJ();
        final ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1(interfaceC86963bA, this, 53);
        final String str = LJJ.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationModel updateLocal, conversationId:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        RunnableC63345OtZ.LJ(new IDcS13S1100000_1(str, ext, 0), new InterfaceC63353Oth<Boolean>() { // from class: X.4Mk
            @Override // X.InterfaceC63353Oth
            public final void LIZLLL(Boolean bool) {
                C63120Opw LJIIIZ;
                Boolean bool2 = bool;
                if (bool2 != null && bool2.booleanValue() && (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str)) != null) {
                    LJIIIZ.setLocalExt(ext);
                    C115284fk.LJIILIIL().LJIJI(10, LJIIIZ);
                }
                Runnable runnable = aRunnableS20S0200000_1;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, false);
    }

    @Override // X.AbstractC90763hI
    public final void LJIL(String name, final IDcS364S0100000_1 iDcS364S0100000_1) {
        o.LJIIIZ(name, "name");
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        if (C115284fk.LJIILIIL().LJIIIZ(LJJ.LJLJI) == null) {
            return;
        }
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        AbstractC63515OwJ<C63120Opw> abstractC63515OwJ = new AbstractC63515OwJ<C63120Opw>(iDcS364S0100000_1) { // from class: X.4np
            {
                int value = EnumC63625Oy5.SET_CONVERSATION_CORE_INFO.getValue();
            }

            @Override // X.AbstractC63515OwJ
            public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
                SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody;
                Integer num;
                ResponseBody responseBody = c63622Oy2.LJLJL.body;
                if (responseBody != null && (setConversationCoreInfoResponseBody = responseBody.set_conversation_core_info_body) != null && (num = setConversationCoreInfoResponseBody.status) != null && num.intValue() == EnumC63567Ox9.OP_SUCCEED.getValue() && c63622Oy2.LJLJL.body.set_conversation_core_info_body.conversation_core_info != null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC63515OwJ
            public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
                Object[] objArr = c63622Oy2.LJLJJL;
                final String str2 = (String) objArr[0];
                final String str3 = (String) objArr[1];
                if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
                    RunnableC63345OtZ.LJ(new IDcS407S0100000_10(c63622Oy2.LJLJL.body.set_conversation_core_info_body.conversation_core_info, 11), new InterfaceC63353Oth<C63120Opw>() { // from class: X.4nk
                        @Override // X.InterfaceC63353Oth
                        public final void LIZLLL(C63120Opw c63120Opw) {
                            C63120Opw c63120Opw2 = c63120Opw;
                            if (c63120Opw2 != null) {
                                C115284fk.LJIILIIL().LJIJI(5, c63120Opw2);
                                LIZLLL(c63120Opw2);
                                C115064fO LJII = C63337OtR.LJII(c63622Oy2, true);
                                LJII.LIZJ.put("conversation_id", str2);
                                LJII.LIZJ.put("keys", str3);
                                LJII.LIZ();
                            } else {
                                LIZIZ(C63622Oy2.LIZJ(-3001));
                                C115064fO LJII2 = C63337OtR.LJII(c63622Oy2, false);
                                LJII2.LIZJ.put("conversation_id", str2);
                                LJII2.LIZJ.put("keys", str3);
                                LJII2.LIZ();
                            }
                            aRunnableS29S0200000_10.run();
                        }
                    }, false);
                    return;
                }
                LIZIZ(c63622Oy2);
                aRunnableS29S0200000_10.run();
                C115064fO LJII = C63337OtR.LJII(c63622Oy2, false);
                LJII.LIZJ.put("conversation_id", str2);
                LJII.LIZJ.put("keys", str3);
                LJII.LIZ();
            }
        };
        HashMap hashMap = new HashMap();
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        C120444o4 c120444o4 = new C120444o4();
        c120444o4.LIZLLL = str;
        c120444o4.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120444o4.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        C63685Oz3.LIZIZ(hashMap);
        c120444o4.LJIILJJIL = hashMap;
        c120444o4.LJI = name;
        c120444o4.LJIIJ = Boolean.TRUE;
        SetConversationCoreInfoRequestBody build = c120444o4.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJIL = build;
        abstractC63515OwJ.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str, "s:name");
    }

    @Override // X.AbstractC90763hI
    public final void LIZ(List list, java.util.Map map, IDcS135S0200000_1 iDcS135S0200000_1) {
        C63120Opw LJIIIZ;
        List<Long> LJJIFFI = C1GE.LJJIFFI(list);
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        C63356Otk LJIIIZ2 = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ2.getClass();
        C120274nn c120274nn = new C120274nn(iDcS135S0200000_1);
        if (LJJIFFI == null || LJJIFFI.isEmpty() || (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str)) == null) {
            return;
        }
        long conversationShortId = LJIIIZ.getConversationShortId();
        int conversationType = LJIIIZ.getConversationType();
        int inboxType = LJIIIZ.getInboxType();
        c120274nn.LIZLLL.LIZIZ = SystemClock.elapsedRealtime();
        if (LJJIFFI.isEmpty() || TextUtils.isEmpty(str)) {
            return;
        }
        C120424o2 c120424o2 = new C120424o2();
        c120424o2.LIZLLL = str;
        c120424o2.LJ = Long.valueOf(conversationShortId);
        c120424o2.LJFF = Integer.valueOf(conversationType);
        C63685Oz3.LIZ(LJJIFFI);
        c120424o2.LJI = LJJIFFI;
        C63685Oz3.LIZIZ(map);
        c120424o2.LJII = map;
        ConversationAddParticipantsRequestBody build = c120424o2.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJIIJ = build;
        c120274nn.LJIIJJI(inboxType, c89453Z8v.build(), null, str, LJJIFFI);
    }

    @Override // X.AbstractC90763hI
    public final void LJIILIIL(List list, C93833mF c93833mF, IDcS364S0100000_1 iDcS364S0100000_1) {
        List<Long> LJJIFFI = C1GE.LJJIFFI(list);
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str = LJJ.LJLJI;
        LJIIIZ.getClass();
        C120264nm c120264nm = new C120264nm(iDcS364S0100000_1);
        c120264nm.LIZJ.LIZIZ = SystemClock.elapsedRealtime();
        if (LJJIFFI == null || LJJIFFI.isEmpty()) {
            return;
        }
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str);
        C120434o3 c120434o3 = new C120434o3();
        c120434o3.LIZLLL = str;
        c120434o3.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120434o3.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        C63685Oz3.LIZ(LJJIFFI);
        c120434o3.LJI = LJJIFFI;
        C63685Oz3.LIZIZ(c93833mF);
        c120434o3.LJII = c93833mF;
        ConversationRemoveParticipantsRequestBody build = c120434o3.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJIIJZLJL = build;
        c120264nm.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str, LJJIFFI);
    }

    @Override // X.AbstractC90763hI
    public final void LJIILLIIL(String str, int i, C93833mF c93833mF, IDcS364S0100000_1 iDcS364S0100000_1) {
        long LJJI = C1GE.LJJI(str, iDcS364S0100000_1);
        if (LJJI <= 0) {
            return;
        }
        C120014nN LJJ = LJJ();
        LJJ.getClass();
        if (C115284fk.LJIILIIL().LJIIIZ(LJJ.LJLJI) == null) {
            return;
        }
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        String str2 = LJJ.LJLJI;
        LJIIIZ.getClass();
        C120284no c120284no = new C120284no(iDcS364S0100000_1);
        c120284no.LIZJ.LIZIZ = SystemClock.elapsedRealtime();
        c120284no.LIZJ.LJ.put("role", String.valueOf(i));
        C63120Opw LJIIIZ2 = C115284fk.LJIILIIL().LJIIIZ(str2);
        C120414o1 c120414o1 = new C120414o1();
        c120414o1.LIZLLL = str2;
        c120414o1.LJ = Long.valueOf(LJIIIZ2.getConversationShortId());
        c120414o1.LJFF = Integer.valueOf(LJIIIZ2.getConversationType());
        c120414o1.LJI = Long.valueOf(LJJI);
        c120414o1.LJII = Integer.valueOf(i);
        C63685Oz3.LIZIZ(c93833mF);
        c120414o1.LJIIJ = c93833mF;
        UpdateConversationParticipantRequestBody build = c120414o1.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJIIZI = build;
        c120284no.LJIIJJI(LJIIIZ2.getInboxType(), c89453Z8v.build(), null, str2);
    }
}
