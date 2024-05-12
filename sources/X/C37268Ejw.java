package X;

import com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi;

/* renamed from: X.Ejw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37268Ejw extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C37268Ejw LJLIL = new C37268Ejw();

    public C37268Ejw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        InterfaceC09240Xw LIZIZ;
        EditorProGuidanceDeviceScoreApi editorProGuidanceDeviceScoreApi;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ(EF7.LJIIIZ)) != null && (editorProGuidanceDeviceScoreApi = (EditorProGuidanceDeviceScoreApi) LIZIZ.LJIILJJIL(EditorProGuidanceDeviceScoreApi.class)) != null) {
            i = editorProGuidanceDeviceScoreApi.getValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
