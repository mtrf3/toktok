package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.86f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2058986f extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoAuthorInfoRelationAssem, String, C76800UCe> {
    public static final C2058986f LJLIL = new C2058986f();

    public C2058986f() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, String str) {
        int i;
        VideoAuthorInfoRelationAssem selectSubscribe = videoAuthorInfoRelationAssem;
        String str2 = str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxTextView tuxTextView = selectSubscribe.LLFZ;
        if (tuxTextView != null) {
            C2059186h.LIZ(tuxTextView, str2);
            TuxTextView tuxTextView2 = selectSubscribe.LLFZ;
            if (tuxTextView2 != null) {
                Context context = selectSubscribe.getContext();
                if ((context != null && C79004UzY.LJJIJIIJI(context)) || str2 == null || str2.length() == 0) {
                    i = 8;
                } else {
                    i = 0;
                }
                tuxTextView2.setVisibility(i);
                if (C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(selectSubscribe))) {
                    TuxTextView tuxTextView3 = selectSubscribe.LLFZ;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        TuxTextView tuxTextView4 = selectSubscribe.LLFZ;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTuxFont(72);
                        } else {
                            o.LJIJI("postTimeView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("postTimeView");
                        throw null;
                    }
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("postTimeView");
            throw null;
        }
        o.LJIJI("postTimeView");
        throw null;
    }
}
