package com.ss.android.ugc.aweme.service;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C107794Kx;
import X.C2MA;
import X.C41759GaB;
import X.EnumC1806777f;
import X.EnumC197427ow;
import X.EnumC198697qz;
import X.SIT;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.Map;

/* loaded from: classes17.dex */
public interface INowsTabService {
    boolean LIZ();

    boolean LIZIZ(Aweme aweme);

    boolean LIZJ();

    void LIZLLL();

    void LJ(int i);

    int LJFF(ActivityC45651qj activityC45651qj, Aweme aweme);

    void LJI(ActivityC45651qj activityC45651qj, Fragment fragment);

    boolean LJII();

    SIT LJIIIIZZ(EnumC198697qz enumC198697qz, ActivityC45651qj activityC45651qj, Fragment fragment);

    void LJIIIZ(Context context, Bundle bundle, Map<String, String> map);

    int LJIIJ(ActivityC45651qj activityC45651qj, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData, EnumC1806777f enumC1806777f, Comment comment);

    void LJIIJJI(Context context, Bundle bundle, boolean z, EnumC197427ow enumC197427ow);

    boolean LJIIL();

    boolean LJIILIIL();

    boolean LJIILJJIL(C2MA c2ma);

    int LJIILL();

    void LJIILLIIL();

    String LJIIZILJ(Aweme aweme);

    void LJIJ(int i);

    void LJIJI();

    boolean LJIJJ();

    void LJIJJLI(C41759GaB c41759GaB, PublishModel publishModel);

    void LJIL();

    void LJJ(PublishModel publishModel, CreateAwemeResponse createAwemeResponse, ActivityC45651qj activityC45651qj);

    void LJJI(PublishModel publishModel, boolean z);

    void LJJIFFI(C107794Kx c107794Kx);

    boolean LJJII();

    void onPublishProgress(int i, PublishModel publishModel);

    AbstractC73672Svk<BaseResponse> setNowVisibility(String str, int i);
}
