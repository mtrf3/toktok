package X;

import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.AqS69S1100000_1;

/* renamed from: X.41h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1026941h extends AbstractC1036945d<C41D> {
    public final Context LIZIZ;
    public final InterfaceC102323zw LIZJ;
    public C101473yZ LIZLLL;

    @Override // X.AbstractC1036945d
    public final void LIZIZ() {
        TuxSheet tuxSheet;
        TuxSheet tuxSheet2;
        C101473yZ c101473yZ = this.LIZLLL;
        if (c101473yZ != null && (tuxSheet = c101473yZ.LJLJI) != null && !tuxSheet.isStateSaved() && (tuxSheet2 = c101473yZ.LJLJI) != null) {
            tuxSheet2.dismiss();
        }
    }

    public C1026941h(Context context, AnonymousClass420 anonymousClass420) {
        super(C41X.READ_RECEIPT_BOTTOM);
        this.LIZIZ = context;
        this.LIZJ = anonymousClass420;
    }

    @Override // X.AbstractC1036945d
    public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
        String noticeCode = c41d.LIZIZ.getNoticeCode();
        if (noticeCode == null) {
            noticeCode = "";
        }
        EnumC101413yT LJJI = C32151Nz.LJJI(noticeCode);
        C101473yZ c101473yZ = new C101473yZ(this.LIZIZ);
        c101473yZ.LIZIZ(LJJI, new AqS69S1100000_1(this, noticeCode, 2));
        this.LIZLLL = c101473yZ;
        return c101473yZ;
    }

    @Override // X.AbstractC1036945d
    public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        C41D c41d2 = c41d;
        if (!this.LIZ.isDebugMode()) {
            String noticeCode = c41d2.LIZIZ.getNoticeCode();
            if (noticeCode == null) {
                noticeCode = "";
            }
            if (!C32151Nz.LJJIIZ(noticeCode)) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
