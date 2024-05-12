package X;

import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* renamed from: X.Ube, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77522Ube extends AbstractC77528Ubk {
    public String LIZ;
    public final InterfaceC77524Ubg LIZIZ;
    public final UI8 LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77522Ube(CustomErrorExtra customErrorExtra, InterfaceC77524Ubg interfaceC77524Ubg, UI8 ui8) {
        super(interfaceC77524Ubg);
        String toastContent = customErrorExtra.getToastContent();
        this.LIZ = toastContent;
        this.LIZIZ = interfaceC77524Ubg;
        this.LIZJ = ui8;
    }
}
