package X;

import com.ss.android.ugc.aweme.profile.experiment.GuideExpBean;
import kotlin.jvm.internal.o;

/* renamed from: X.9Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235609Mm extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C235609Mm LJLIL = new C235609Mm();

    public C235609Mm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        GuideExpBean guideExpBean = C235599Ml.LIZ;
        LJIIIZ.getClass();
        GuideExpBean guideExpBean2 = (GuideExpBean) FFL.LJIJ(true, "user_profile_guide", 31744, GuideExpBean.class, guideExpBean);
        if (guideExpBean2 != null) {
            guideExpBean = guideExpBean2;
        }
        o.LJIIIIZZ(guideExpBean, "ABManager.getInstance().…p::class.java) ?: DEFAULT");
        return Integer.valueOf(guideExpBean.guideType);
    }
}
