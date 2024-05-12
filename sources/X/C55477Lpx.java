package X;

import Y.AfS61S0100000_9;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55477Lpx extends C55478Lpy {
    @Override // X.C55478Lpy
    public final void LIZIZ(M89 feedParam) {
        o.LJIIIZ(feedParam, "feedParam");
        String aid = feedParam.getAid();
        String uid = feedParam.getUid();
        String obj = C47261Igj.LJJIJ(uid).toString();
        o.LJI(uid);
        long parseLong = CastLongProtector.parseLong(uid);
        o.LJI(aid);
        String LLILLIZIL = C44384HbQ.LLILLIZIL(new InsertStory(parseLong, CastLongProtector.parseLong(aid)));
        C55480Lq0.LIZIZ.LIZLLL(249372176, 4);
        C78999UzT.LJFF(StoryApi.LIZIZ.getUserStoriesSingle(obj, LLILLIZIL).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS61S0100000_9(this, 37), new AfS61S0100000_9(this, 38)), this.LJLIL);
    }
}
