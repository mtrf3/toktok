package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryUploadProgressComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221898nJ extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryUploadProgressComponent, C43I<? extends C70012ov>, C76800UCe> {
    public static final C221898nJ LJLIL = new C221898nJ();

    public C221898nJ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryUploadProgressComponent storyUploadProgressComponent, C43I<? extends C70012ov> c43i) {
        C70012ov c70012ov;
        C222928oy LJJLIIIJJIZ;
        Aweme item;
        StoryUploadProgressComponent selectSubscribe = storyUploadProgressComponent;
        C43I<? extends C70012ov> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c70012ov = (C70012ov) c43i2.LIZ) != null) {
            selectSubscribe.Y3().setVisibility(8);
            selectSubscribe.LLFII = c70012ov.LJLJI;
            FeedCollectionViewPagerAbility u4 = selectSubscribe.u4();
            Aweme aweme = null;
            String str = null;
            aweme = null;
            aweme = null;
            if (u4 != null && (LJJLIIIJJIZ = u4.LJJLIIIJJIZ()) != null && (item = LJJLIIIJJIZ.getItem(c70012ov.LJLJI)) != null) {
                C43921HLp c43921HLp = C43921HLp.LIZ;
                String scheduleId = item.getScheduleId();
                if (scheduleId == null) {
                    scheduleId = "";
                }
                C221958nP LJI = c43921HLp.LJI(scheduleId);
                if (LJI != null) {
                    int i = C221918nL.LIZ[LJI.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            selectSubscribe.Y3().setVisibility(8);
                        } else {
                            C221988nS.LIZ(selectSubscribe.Y3(), EnumC221998nT.UPLOAD_FAIL, 0.0f, LJI.LIZJ);
                            String scheduleId2 = item.getScheduleId();
                            Aweme aweme2 = selectSubscribe.LLFZ;
                            if (aweme2 != null) {
                                str = aweme2.getScheduleId();
                            }
                            if (!o.LJ(str, scheduleId2)) {
                                c43921HLp.getClass();
                                C222578oP.LJIIJJI(C43921HLp.LJIILL(scheduleId2));
                            }
                        }
                    } else if (C54838Lfe.LJIILIIL(item) && L1F.LIZIZ()) {
                        C221988nS.LIZ(selectSubscribe.Y3(), selectSubscribe.r4(LJI.LIZ, item.getScheduleId()), LJI.LIZ, null);
                    } else {
                        C221988nS.LIZ(selectSubscribe.Y3(), EnumC221998nT.UPLOADING, LJI.LIZ, null);
                    }
                }
                aweme = item;
            }
            selectSubscribe.LLFZ = aweme;
        }
        return C76800UCe.LIZ;
    }
}
