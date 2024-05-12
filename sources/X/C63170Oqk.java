package X;

/* renamed from: X.Oqk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63170Oqk implements InterfaceC63353Oth<C63120Opw> {
    public final /* synthetic */ String LJLIL;

    public C63170Oqk(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(C63120Opw c63120Opw) {
        C63120Opw LJIIIZ;
        C63120Opw c63120Opw2 = c63120Opw;
        if (c63120Opw2 != null && (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLIL)) != null) {
            LJIIIZ.setUnreadCount(c63120Opw2.getUnreadCount());
            LJIIIZ.setReadIndex(c63120Opw2.getReadIndex());
            LJIIIZ.setReadIndexV2(c63120Opw2.getReadIndexV2());
            LJIIIZ.setReadBadgeCount(c63120Opw2.getReadBadgeCount());
            if (LJIIIZ.getReadBadgeCount() > 0) {
                LJIIIZ.getLocalExt().put("s:read_badge_count_update", "1");
            }
            LJIIIZ.setUnreadSelfMentionedMessages(c63120Opw2.getUnreadSelfMentionedMessages());
            C115284fk.LJIILIIL().LJIJI(3, LJIIIZ);
        }
    }
}
