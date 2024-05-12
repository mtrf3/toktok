package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UX5 extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final UX5 INSTANCE = new UX5();

    public UX5() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ARN it) {
        o.LJIIIZ(it, "it");
        it.LIZ().LIZIZ(null);
        C45820Hya.LIZIZ("upload_video_music_authorization_guide_popup_click", "cancel");
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(ARN arn) {
        invoke2(arn);
        return C76800UCe.LIZ;
    }
}
