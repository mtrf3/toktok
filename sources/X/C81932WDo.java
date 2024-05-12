package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;

/* renamed from: X.WDo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81932WDo extends UF5 {
    public final /* synthetic */ PreviewImageScene LIZ;

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
    }

    public C81932WDo(PreviewImageScene previewImageScene) {
        this.LIZ = previewImageScene;
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        this.LIZ.LJLL = System.currentTimeMillis();
    }
}
