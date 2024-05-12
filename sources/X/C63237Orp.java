package X;

/* renamed from: X.Orp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63237Orp implements InterfaceC63344OtY {
    public final /* synthetic */ C63220OrY LIZ;

    public C63237Orp(C63222Ora c63222Ora) {
        this.LIZ = c63222Ora;
    }

    @Override // X.InterfaceC63344OtY
    public final void LIZ(C63120Opw c63120Opw) {
        if (c63120Opw != null && this.LIZ.LJLIL.equals(c63120Opw.getConversationId())) {
            C63322OtC.LJFF("MessageModel onMemberChange");
            C63220OrY c63220OrY = this.LIZ;
            c63220OrY.LJIJ(c63220OrY.LJLIL, null, null);
        }
    }
}
