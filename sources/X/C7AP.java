package X;

import android.animation.AnimatorSet;
import android.text.Editable;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7AP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AP extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoQuickCommentAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C7AP LJLIL = new C7AP();

    public C7AP() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoQuickCommentAssem videoQuickCommentAssem, C43I<? extends C195357lb> c43i) {
        Editable text;
        VideoQuickCommentAssem selectSubscribe = videoQuickCommentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i != null) && selectSubscribe.LJLLL) {
            if (C79488VHo.LIZIZ()) {
                C224748ru c224748ru = selectSubscribe.LLII;
                if (c224748ru != null && (text = c224748ru.getText()) != null && text.length() != 0) {
                    selectSubscribe.q4(null);
                    C224748ru c224748ru2 = selectSubscribe.LLII;
                    if (c224748ru2 != null) {
                        c224748ru2.setText("");
                    }
                }
                C181407Aa c181407Aa = (C181407Aa) selectSubscribe.LLIIIZ.getValue();
                AnimatorSet animatorSet = c181407Aa.LIZ;
                if (animatorSet != null && animatorSet.isRunning()) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = c181407Aa.LIZIZ;
                if (animatorSet2 != null && animatorSet2.isRunning()) {
                    animatorSet2.cancel();
                }
            } else {
                selectSubscribe.q4(null);
                C224748ru c224748ru3 = selectSubscribe.LLII;
                if (c224748ru3 != null) {
                    c224748ru3.setText("");
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
