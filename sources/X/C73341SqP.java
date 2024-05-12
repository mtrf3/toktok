package X;

import com.ss.android.ugc.aweme.sticker.image.TemplatesPanelResp;

/* renamed from: X.SqP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73341SqP<T> implements InterfaceC86003Zc<TemplatesPanelResp> {
    public static final C73341SqP LJLIL = new C73341SqP();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<TemplatesPanelResp> interfaceC73573Su9) {
        interfaceC73573Su9.onError(new Exception("image sticker is null"));
    }
}
