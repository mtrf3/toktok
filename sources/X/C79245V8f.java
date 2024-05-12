package X;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;

/* renamed from: X.V8f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79245V8f implements InterfaceC78910Uy2 {
    public final /* synthetic */ DownloadLiveReplayMethod.Params LIZ;
    public final /* synthetic */ DownloadLiveReplayMethod LIZIZ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        this.LIZIZ.LJJI((String) ListProtector.get(this.LIZ.urls, 0), 4, null);
        HashMap hashMap = new HashMap();
        hashMap.put("refuse_permission", strArr);
        C0K2.LJII(1, "ttlive_replay_permission", hashMap);
        C0NB.LIZIZ("DownloadLiveReplayMethod.class", "onPermissionDenied: ");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    @Override // X.InterfaceC78910Uy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String... r20) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79245V8f.LIZLLL(java.lang.String[]):void");
    }

    public C79245V8f(DownloadLiveReplayMethod downloadLiveReplayMethod, DownloadLiveReplayMethod.Params params) {
        this.LIZIZ = downloadLiveReplayMethod;
        this.LIZ = params;
    }
}
