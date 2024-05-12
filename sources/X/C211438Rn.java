package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryGestureEducationComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211438Rn extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryGestureEducationComponent, C43I<? extends String>, C76800UCe> {
    public static final C211438Rn LJLIL = new C211438Rn();

    public C211438Rn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryGestureEducationComponent storyGestureEducationComponent, C43I<? extends String> c43i) {
        String aid;
        StoryGestureEducationComponent selectSubscribe = storyGestureEducationComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Aweme aweme = selectSubscribe.LLFFF;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            C211498Rt c211498Rt = (C211498Rt) selectSubscribe.LLF.getValue();
            if (o.LJ(c211498Rt.LJI, aid)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("duplicated aid for ");
                LIZ.append(aid);
                C221018lt.LJFF("StoryGestureEducation", X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("start counting down for ");
                LIZ2.append(aid);
                C221018lt.LJFF("StoryGestureEducation", X1D.LIZIZ(LIZ2));
                XKQ xkq = c211498Rt.LIZLLL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                c211498Rt.LJFF.clear();
                c211498Rt.LIZJ(true);
                c211498Rt.LJI = aid;
                c211498Rt.LIZLLL();
            }
        }
        return C76800UCe.LIZ;
    }
}
