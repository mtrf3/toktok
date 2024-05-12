package X;

/* renamed from: X.OqI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63142OqI implements InterfaceC63352Otg<C63120Opw> {
    public final /* synthetic */ String LJLIL;

    @Override // X.InterfaceC63352Otg
    public final C63120Opw LIZIZ() {
        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(this.LJLIL, false);
        if (LJIIIZ != null && LJIIIZ.getUnreadCount() > 0) {
            LJIIIZ.setUnreadCount(0L);
            LJIIIZ.setReadIndex(LJIIIZ.getLastMessageIndex());
            LJIIIZ.setReadIndexV2(LJIIIZ.getMaxIndexV2());
            LJIIIZ.setReadBadgeCount(LJIIIZ.getBadgeCount());
            LJIIIZ.setUnreadSelfMentionedMessages(null);
            if (C63133Oq9.LJIL(LJIIIZ)) {
                C63134OqA.LIZJ(this.LJLIL);
                C63150OqQ.LJIJJLI(this.LJLIL);
                return LJIIIZ;
            }
        }
        return null;
    }

    public C63142OqI(String str) {
        this.LJLIL = str;
    }
}
