package X;

import android.content.Context;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y05 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final Y05 LJLIL = new Y05();

    public Y05() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends C195357lb> c43i) {
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            VideoCLACaptionViewModel r4 = selectSubscribe.r4();
            Context context = selectSubscribe.getContext();
            r4.LLFFF = null;
            r4.sv0();
            r4.LJLLI = -1L;
            r4.LL = -1L;
            r4.uv0(context);
            r4.LJLLJ = false;
            r4.LJLLLL = false;
            r4.LJLLLLLL = false;
            r4.LJZ = false;
            r4.LLF = false;
            r4.LLII = null;
            r4.LJLJLLL = null;
            r4.LJZI = -1L;
            r4.LJZL = true;
            if (C52280KfU.LIZ()) {
                r4.setState(C69596RTc.LJLIL);
            }
            C46290IEs.LIZ().LIZLLL(ILM.SWITCH_VIDEO, null, null, null, null);
            C86675Xzz c86675Xzz = selectSubscribe.LLIIIILZ;
            if (c86675Xzz != null) {
                c86675Xzz.LIZ();
            }
            InterfaceC82683Wch interfaceC82683Wch = selectSubscribe.LLI;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
            }
            C86675Xzz c86675Xzz2 = selectSubscribe.LLIIIILZ;
            if (c86675Xzz2 != null) {
                c86675Xzz2.LIZLLL(EnumC86683Y0h.PAGE_UNSELECTED);
            }
        }
        return C76800UCe.LIZ;
    }
}
