package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;

/* renamed from: X.Uj9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77987Uj9 {
    public String LIZ;
    public Throwable LIZIZ;
    public InterfaceC78032Ujs LIZJ;
    public RankTypeV2 LIZLLL = RankTypeV2.LJIILL;

    public final void LIZ(InterfaceC78032Ujs interfaceC78032Ujs) {
        String str = this.LIZ;
        if (str == null) {
            if (this.LIZIZ == null) {
                this.LIZJ = interfaceC78032Ujs;
                return;
            }
        } else {
            interfaceC78032Ujs.LIZIZ(str);
        }
        Throwable th = this.LIZIZ;
        if (th == null) {
            return;
        }
        interfaceC78032Ujs.LIZ(th);
    }
}
