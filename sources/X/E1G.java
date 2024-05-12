package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.FriendsPostExp;

/* loaded from: classes7.dex */
public final class E1G extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final E1G LJLIL = new E1G();

    public E1G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((FriendsPostExp.MetaData) FriendsPostExp.LIZIZ.getValue()).enable != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
