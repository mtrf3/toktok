package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.SMe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C71964SMe extends TBS implements InterfaceC65784Pro<String> {
    public C71964SMe(Object obj) {
        super(0, obj, C71963SMd.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer value;
        Integer valueOf;
        int i;
        int i2;
        C71963SMd c71963SMd = (C71963SMd) this.receiver;
        if (!c71963SMd.LJLLJ && (value = c71963SMd.LJLLILLLL.LJLJI.getValue()) != null) {
            if (value.intValue() == 0) {
                if (C78966Uyw.LJJIJL()) {
                    i2 = R.string.jdc;
                } else {
                    i2 = R.string.blo;
                }
                valueOf = Integer.valueOf(i2);
            } else if (value.intValue() == 1) {
                C71909SKb.LIZ.getClass();
                C71909SKb.LIZJ().LIZ();
                if (C72028SOq.LJIIZILJ()) {
                    i = R.string.gnw;
                } else {
                    i = R.string.jbq;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 3) {
                valueOf = Integer.valueOf(R.string.jdf);
            }
            if (valueOf != null) {
                String string = c71963SMd.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
