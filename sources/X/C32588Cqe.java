package X;

/* renamed from: X.Cqe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32588Cqe implements InterfaceC19890qH {
    public final /* synthetic */ C32603Cqt LJLIL;

    public C32588Cqe(C32603Cqt c32603Cqt) {
        this.LJLIL = c32603Cqt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.CrO, O] */
    @Override // X.InterfaceC19890qH
    public final void onShow() {
        ((C32537Cpp) this.LJLIL.LJLIL.gv0(C32591Cqh.class)).LIZ = new C32634CrO(true, 0L, 4);
        this.LJLIL.LIZLLL(new C32633CrN(EnumC32608Cqy.UNLOCK, EnumC32627CrH.BUBBLE, this.LJLIL.LJLLLL));
        B52.LIZIZ("gift_guide_bubble_show", new OSZ("show_reason", "event_unlock"));
    }
}
