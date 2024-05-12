package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.ResumeResp;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* renamed from: X.1E2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1E2 implements RTU, InterfaceC48038ItG {
    public static final C1E2 LJLIL = new C1E2();
    public static final C1E2 LJLILLLLZI = new C1E2();

    public static boolean LIZ(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(InterfaceC88472Yns interfaceC88472Yns) {
        UserStory userStory;
        LYD.LIZ.getClass();
        if (LYD.LIZIZ == null) {
            LYD.LIZIZ = LYD.LIZ();
        }
        Aweme aweme = LYD.LIZIZ;
        o.LJI(aweme);
        Aweme m114clone = aweme.m114clone();
        o.LJIIIIZZ(m114clone, "mineUserStory!!.clone()");
        UserStory userStory2 = m114clone.getUserStory();
        o.LJI(userStory2);
        UserStory userStory3 = (UserStory) interfaceC88472Yns.invoke(userStory2);
        if (userStory3 == m114clone.getUserStory()) {
            C36922EeM.LIZ(new IllegalArgumentException("Must copy"));
        }
        o.LJIIIZ(userStory3, "userStory");
        if (userStory3.getFakeAwemeShell()) {
            return;
        }
        Aweme aweme2 = LYD.LIZIZ;
        if (aweme2 != null) {
            userStory = aweme2.getUserStory();
        } else {
            userStory = null;
        }
        Aweme aweme3 = LYD.LIZIZ;
        if (aweme3 != null) {
            aweme3.setUserStory(userStory3);
        }
        C54808LfA c54808LfA = C54808LfA.LIZLLL;
        Aweme aweme4 = LYD.LIZIZ;
        if (aweme4 == null) {
            aweme4 = LYD.LIZ();
            aweme4.setUserStory(userStory3);
        }
        List LIZJ = C54808LfA.LIZJ(userStory, userStory3);
        if (!(!LIZJ.isEmpty())) {
            return;
        }
        c54808LfA.LIZIZ.onNext(new C54789Ler(LIZJ, userStory3, aweme4, null));
    }

    public static void LIZLLL(InterfaceC04200Em interfaceC04200Em) {
        float f;
        C282719b c282719b = (C282719b) interfaceC04200Em;
        if (!c282719b.LIZIZ.getUseCompatPadding()) {
            c282719b.LIZ(0, 0, 0, 0);
            return;
        }
        Drawable drawable = c282719b.LIZ;
        float f2 = ((C04210En) drawable).LJ;
        float f3 = ((C04210En) drawable).LIZ;
        if (c282719b.LIZIZ.getPreventCornerOverlap()) {
            f = (float) (((1.0d - C04220Eo.LIZ) * f3) + f2);
        } else {
            f = f2;
        }
        int ceil = (int) Math.ceil(f);
        int ceil2 = (int) Math.ceil(C04220Eo.LIZ(f2, f3, c282719b.LIZIZ.getPreventCornerOverlap()));
        c282719b.LIZ(ceil, ceil2, ceil, ceil2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        return new OSZ(GsonProtectorUtils.fromJson(new Gson(), (j) it.data, AudienceRoomInfoResponse.ResponseData.class), it);
    }

    public void LIZIZ(InterfaceC04200Em interfaceC04200Em, float f) {
        C282719b c282719b = (C282719b) interfaceC04200Em;
        C04210En c04210En = (C04210En) c282719b.LIZ;
        boolean useCompatPadding = c282719b.LIZIZ.getUseCompatPadding();
        boolean preventCornerOverlap = c282719b.LIZIZ.getPreventCornerOverlap();
        if (f != c04210En.LJ || c04210En.LJFF != useCompatPadding || c04210En.LJI != preventCornerOverlap) {
            c04210En.LJ = f;
            c04210En.LJFF = useCompatPadding;
            c04210En.LJI = preventCornerOverlap;
            c04210En.LIZJ(null);
            c04210En.invalidateSelf();
        }
        LIZLLL(c282719b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        BaseResponse linkMicResponseResume = (BaseResponse) obj;
        CreateChannelResult createChannelResult = (CreateChannelResult) obj2;
        o.LJIIIZ(linkMicResponseResume, "linkMicResponseResume");
        o.LJIIIZ(createChannelResult, "createChannelResult");
        createChannelResult.resumeResp = (ResumeResp) linkMicResponseResume.data;
        return createChannelResult;
    }
}
