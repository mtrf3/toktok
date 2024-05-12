package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report.ReportTitleBarAssem;

/* renamed from: X.4YS, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4YS extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C4YS(ReportTitleBarAssem reportTitleBarAssem) {
        super(0, reportTitleBarAssem, ReportTitleBarAssem.class, "onCrossClick", "onCrossClick()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C8W0 c8w0 = (C8W0) this.receiver;
        c8w0.getClass();
        ActivityC45651qj LIZ = C212428Vi.LIZ(c8w0);
        if (LIZ != null) {
            LIZ.onBackPressed();
        }
        return C76800UCe.LIZ;
    }
}
