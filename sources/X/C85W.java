package X;

import defpackage.q;

/* renamed from: X.85W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85W extends AbstractC65781Prl implements InterfaceC65784Pro<OJD> {
    public static final C85W LJLIL = new C85W();

    public C85W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final OJD invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(\\d+)|[a-zA-ZÀ-ÿĀ-ſƀ-ɏɐ-ʯḀ-ỿЀ-ӿԀ-ԯഀ-ൿ]+|");
        LIZ.append('[');
        LIZ.append("⺀-\u2eff⼀-\u2fdf\u3000-〿㇀-\u31ef㈀-㋿㌀-㏿㐀-㿿䀀-䶿一-俿倀-忿怀-濿瀀-翿耀-迿退-鿿豈-\ufaff");
        LIZ.append("\u3040-ゟ゠-ヿㇰ-ㇿ㆐-㆟");
        LIZ.append("ᄀ-ᇿ\u3130-\u318fꥠ-\ua97f가-꿿뀀-뿿쀀-쿿퀀-\ud7afힰ-\ud7ff");
        return new OJD(q.LIZIZ(LIZ, "[\\p{InThai}]", ']', LIZ), EnumC249289qO.IGNORE_CASE);
    }
}
