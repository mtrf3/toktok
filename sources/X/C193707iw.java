package X;

import Y.ALAdapterS2S0200000_3;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.ss.android.ugc.aweme.nows.feed.ui.NowRelationAreaAssem;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.7iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193707iw extends AbstractC65781Prl implements InterfaceC88471Ynr<NowRelationAreaAssem, RelationStatus, C76800UCe> {
    public static final C193707iw LJLIL = new C193707iw();

    public C193707iw() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowRelationAreaAssem nowRelationAreaAssem, RelationStatus relationStatus) {
        NowRelationAreaAssem selectSubscribe = nowRelationAreaAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (relationStatus != null) {
            if (selectSubscribe.b4()) {
                selectSubscribe.c4();
            } else {
                selectSubscribe.a4().setClickable(false);
                if (selectSubscribe.getContainerView().getVisibility() == 0) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(selectSubscribe.getContainerView(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.setStartDelay(1000L);
                    ofFloat.addListener(new ALAdapterS2S0200000_3(selectSubscribe, ofFloat, 6));
                    ofFloat.start();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
