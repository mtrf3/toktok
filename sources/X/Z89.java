package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class Z89 implements INowsTabService {
    public static final Z89 LIZIZ = new Z89();
    public final /* synthetic */ INowsTabService LIZ = NowsTabServiceImpl.LJJIIJ();

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJ(int i) {
        this.LIZ.LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final int LJFF(ActivityC45651qj activityC45651qj, Aweme aweme) {
        return this.LIZ.LJFF(activityC45651qj, aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJI(ActivityC45651qj activityC45651qj, Fragment fragment) {
        this.LIZ.LJI(activityC45651qj, fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final SIT LJIIIIZZ(EnumC198697qz scene, ActivityC45651qj activityC45651qj, Fragment fragment) {
        o.LJIIIZ(scene, "scene");
        return this.LIZ.LJIIIIZZ(scene, activityC45651qj, fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIIIZ(Context context, Bundle bundle, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIIZ(context, bundle, map);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final int LJIIJ(ActivityC45651qj activityC45651qj, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData, EnumC1806777f bubbleType, Comment comment) {
        o.LJIIIZ(bubbleType, "bubbleType");
        return this.LIZ.LJIIJ(activityC45651qj, aweme, nowFeedMobHierarchyData, bubbleType, comment);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIIJJI(Context context, Bundle bundle, boolean z, EnumC197427ow routeType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routeType, "routeType");
        this.LIZ.LJIIJJI(context, bundle, z, routeType);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIILJJIL(C2MA c2ma) {
        return this.LIZ.LJIILJJIL(c2ma);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final int LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIILLIIL() {
        this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final String LJIIZILJ(Aweme aweme) {
        return this.LIZ.LJIIZILJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIJ(int i) {
        this.LIZ.LJIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIJI() {
        this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIJJLI(C41759GaB e, PublishModel publishModel) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJIJJLI(e, publishModel);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIL() {
        this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJJ(PublishModel publishModel, CreateAwemeResponse createAwemeResponse, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(createAwemeResponse, "createAwemeResponse");
        this.LIZ.LJJ(publishModel, createAwemeResponse, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJJI(PublishModel publishModel, boolean z) {
        this.LIZ.LJJI(publishModel, z);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJJIFFI(C107794Kx event) {
        o.LJIIIZ(event, "event");
        this.LIZ.LJJIFFI(event);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void onPublishProgress(int i, PublishModel publishModel) {
        this.LIZ.onPublishProgress(i, publishModel);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final AbstractC73672Svk<BaseResponse> setNowVisibility(String str, int i) {
        return this.LIZ.setNowVisibility(str, i);
    }
}
