package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;

/* renamed from: X.Bbw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29128Bbw extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C29128Bbw(Object obj) {
        super(0, obj, PreviewStartLiveWidget.class, "onGoLiveFail", "onGoLiveFail()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC30359Bvn LJIILIIL;
        PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) this.receiver;
        if (previewStartLiveWidget.LLFF() && (LJIILIIL = C87277YNd.LJIILIIL(previewStartLiveWidget.dataChannel)) != null) {
            LJIILIIL.LJJ();
        }
        DialogC31813Ce9 dialogC31813Ce9 = previewStartLiveWidget.LJLL;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        return C76800UCe.LIZ;
    }
}
