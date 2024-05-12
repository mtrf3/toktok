package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202657xN extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C50420Jqa, C76800UCe> {
    public static final C202657xN LJLIL = new C202657xN();

    public C202657xN() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C50420Jqa c50420Jqa) {
        Boolean bool;
        VideoShareAssem selectSubscribeOnAsync = videoShareAssem;
        C50420Jqa c50420Jqa2 = c50420Jqa;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c50420Jqa2 != null) {
            int i = c50420Jqa2.LJLIL;
            if (i == 78) {
                Bundle bundle = c50420Jqa2.LJLJI;
                String str = null;
                if (bundle != null) {
                    bool = Boolean.valueOf(bundle.getBoolean("show_tooltip_after_resume", false));
                } else {
                    bool = null;
                }
                Bundle bundle2 = c50420Jqa2.LJLJI;
                if (bundle2 != null) {
                    str = bundle2.getString("quick_share_aid");
                }
                if (o.LJ(str, C227768wm.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme()))) {
                    if (o.LJ(bool, Boolean.TRUE)) {
                        selectSubscribeOnAsync.LLIIIZ = true;
                    } else if (selectSubscribeOnAsync.LLIIJLIL) {
                        InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
                        ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribeOnAsync);
                        C62846OlW c62846OlW = (C62846OlW) selectSubscribeOnAsync.Y3().findViewById(R.id.jtf);
                        o.LJIIIIZZ(c62846OlW, "contentView.share_iv");
                        shareService.LJIILJJIL(LIZ, c62846OlW);
                    } else {
                        selectSubscribeOnAsync.LLIIJI = true;
                    }
                }
            } else if (i == 29) {
                selectSubscribeOnAsync.LLIIJLIL = true;
                if (selectSubscribeOnAsync.LLIIJI) {
                    selectSubscribeOnAsync.LLIIJI = false;
                    InterfaceC109344Qw shareService2 = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
                    ActivityC45651qj LIZ2 = C212428Vi.LIZ(selectSubscribeOnAsync);
                    C62846OlW c62846OlW2 = (C62846OlW) selectSubscribeOnAsync.Y3().findViewById(R.id.jtf);
                    o.LJIIIIZZ(c62846OlW2, "contentView.share_iv");
                    shareService2.LJIILJJIL(LIZ2, c62846OlW2);
                }
            } else if (i == 3) {
                selectSubscribeOnAsync.LLIIJLIL = false;
            }
        }
        return C76800UCe.LIZ;
    }
}
