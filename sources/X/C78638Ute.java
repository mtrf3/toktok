package X;

/* renamed from: X.Ute, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78638Ute extends AbstractC78640Utg {
    public final String LJ;
    public final String LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78638Ute(String str) {
        super(4, "visible");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        this.LJ = str;
        this.LJFF = curUserId;
    }
}
