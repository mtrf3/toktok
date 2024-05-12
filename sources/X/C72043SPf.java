package X;

import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.tiktok.tpsc.data.restriction.PrivacyRestrictionApi;

/* renamed from: X.SPf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72043SPf {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C72054SPq.LJLIL);
    public static final ICLACaptionService LIZIZ = CaptionServiceImpl.LJIILIIL();

    public static void LIZ() {
        C63081OpJ.LJJLIIIJ(((PrivacyRestrictionApi) LIZ.getValue()).fetchPrivacyRestriction(), "/tiktok/privacy/setting/restriction/v1").LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(C72040SPc.LJLIL, C72058SPu.LJLIL);
    }

    public static void LIZJ(String str) {
        C63081OpJ.LJJLIIIJ(((PrivacyRestrictionApi) LIZ.getValue()).updateAgreement(str), "/tiktok/privacy/agreement/record/agree/v1").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(SNF.LJLIL, SNG.LJLIL);
    }

    public static void LIZIZ(int i, String str) {
        C63081OpJ.LJJLIIIJ(((PrivacyRestrictionApi) LIZ.getValue()).updateAgreement(str, i), "/tiktok/privacy/agreement/record/agree/v1").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Fr
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9Fs
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
