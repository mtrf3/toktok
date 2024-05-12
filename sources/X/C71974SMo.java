package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.SMo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C71974SMo extends TBS implements InterfaceC65784Pro<String> {
    public C71974SMo(Object obj) {
        super(0, obj, C71973SMn.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        C71973SMn c71973SMn = (C71973SMn) this.receiver;
        Integer value = c71973SMn.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 0) {
                if (C78966Uyw.LJJIJL()) {
                    i = R.string.jdc;
                } else {
                    i = R.string.blo;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.p9a);
            }
            if (valueOf != null) {
                String string = c71973SMn.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
