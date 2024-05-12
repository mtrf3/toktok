package X;

/* renamed from: X.VCr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79361VCr extends C78596Usy {
    public static final String LJLLI;
    public static final C79364VCu LJLLILLLL;

    static {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("CREATE TABLE IF NOT EXISTS ", "node_optimizer", " (", "domain", " text not null,");
        YE1.LIZLLL(LIZLLL, "network_type", " text,", "ips", " text ,");
        YE1.LIZLLL(LIZLLL, "ttl", " integer,", "expand_value", " text ,");
        YE1.LIZLLL(LIZLLL, "update_time", " text,", "create_time", " timestamp not null default (datetime('now','localtime')))");
        LJLLI = X1D.LIZIZ(LIZLLL);
        LJLLILLLL = new C79364VCu();
    }
}
