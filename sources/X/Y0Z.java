package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0Z extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final Y0Z LJLIL = new Y0Z();

    public Y0Z() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends C76800UCe> c43i) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.r4().sv0();
            C86675Xzz c86675Xzz = selectSubscribe.LLIIIILZ;
            if (c86675Xzz != null) {
                c86675Xzz.LIZLLL(EnumC86683Y0h.HOLDER_PAUSE);
            }
            C86675Xzz c86675Xzz2 = selectSubscribe.LLIIIILZ;
            if (c86675Xzz2 != null) {
                c86675Xzz2.LIZ();
            }
            InterfaceC82683Wch interfaceC82683Wch = selectSubscribe.LLI;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
            }
        }
        return C76800UCe.LIZ;
    }
}
