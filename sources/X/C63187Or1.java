package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Or1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63187Or1 implements InterfaceC63353Oth<List<C109544Rq>> {
    public final /* synthetic */ String LJLIL;

    public C63187Or1(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(List<C109544Rq> list) {
        List<C109544Rq> list2 = list;
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        String str = this.LJLIL;
        LIZLLL.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LIZLLL.LIZJ(str, new C63254Os6(list2));
    }
}