package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8e8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216208e8 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C216208e8 LJLIL = new C216208e8();

    public C216208e8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends Aweme> c43i) {
        View view;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            if (selectSubscribe.LLIIL == null) {
                ViewGroup viewGroup = selectSubscribe.LLIILII;
                if (viewGroup != null) {
                    view = viewGroup.getChildAt(0);
                } else {
                    view = null;
                }
                selectSubscribe.LLIIL = view;
            }
            selectSubscribe.A4();
        }
        return C76800UCe.LIZ;
    }
}
