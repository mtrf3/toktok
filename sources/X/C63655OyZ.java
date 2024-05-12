package X;

/* renamed from: X.OyZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63655OyZ implements InterfaceC86963bA<C63120Opw> {
    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        C63322OtC.LJI("IMHandlerCenter ", "sendTypingEventInConversation getConversation fail", null);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        C63654OyY c63654OyY = new C63654OyY();
        int inboxType = c63120Opw2.getInboxType();
        String conversationId = c63120Opw2.getConversationId();
        int conversationType = c63120Opw2.getConversationType();
        long conversationShortId = c63120Opw2.getConversationShortId();
        C89453Z8v c89453Z8v = new C89453Z8v();
        C63657Oyb c63657Oyb = new C63657Oyb();
        c63657Oyb.LIZLLL = conversationId;
        c63657Oyb.LJ = Integer.valueOf(conversationType);
        c63657Oyb.LJFF = Long.valueOf(conversationShortId);
        c63657Oyb.LJI = EnumC63669Oyn.TYPING;
        c89453Z8v.LJIILJJIL = c63657Oyb.build();
        c63654OyY.LJIIJJI(inboxType, c89453Z8v.build(), null, new Object[0]);
    }
}
