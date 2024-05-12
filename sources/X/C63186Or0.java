package X;

import android.text.TextUtils;

/* renamed from: X.Or0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63186Or0 implements InterfaceC63353Oth<Long> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C63120Opw LJLILLLLZI;
    public final /* synthetic */ C63261OsD LJLJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Long l) {
        Long l2 = l;
        C63322OtC.LJFF("LoadHistoryHandlerpull onCallback");
        if (l2.longValue() == -1) {
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            String str = this.LJLIL;
            LIZLLL.getClass();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LIZLLL.LIZJ(str, new C63254Os6(null));
            return;
        }
        this.LJLJI.LJIILIIL(l2.longValue(), this.LJLILLLLZI);
    }

    public C63186Or0(C63261OsD c63261OsD, String str, C63120Opw c63120Opw) {
        this.LJLJI = c63261OsD;
        this.LJLIL = str;
        this.LJLILLLLZI = c63120Opw;
    }
}
