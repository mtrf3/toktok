package X;

import com.ss.android.ugc.gamora.editorpro.guide.EditorProGuideTargetUserApi;

/* renamed from: X.6E0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6E0 extends AbstractC65781Prl implements InterfaceC65784Pro<EditorProGuideTargetUserApi.Api> {
    public static final C6E0 LJLIL = new C6E0();

    public C6E0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.gamora.editorpro.guide.EditorProGuideTargetUserApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EditorProGuideTargetUserApi.Api invoke() {
        return C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, EditorProGuideTargetUserApi.Api.class);
    }
}
