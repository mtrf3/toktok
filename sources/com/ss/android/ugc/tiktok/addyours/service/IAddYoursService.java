package com.ss.android.ugc.tiktok.addyours.service;

import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C198657qv;
import X.C221728n2;
import X.C235769Nc;
import X.InterfaceC67352kd;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import java.util.List;

/* loaded from: classes4.dex */
public interface IAddYoursService {
    Object LIZ(long j, InterfaceC67352kd<? super AddYoursStickerStruct> interfaceC67352kd);

    AbstractC186347Ta LIZIZ(Context context);

    AbstractC186377Td LIZJ(Context context);

    boolean LIZLLL();

    Object LJ(List list, long j, String str, C198657qv c198657qv);

    void LJFF(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activityC45651qj);

    IInterceptor LJI();

    Object LJII(Aweme aweme, Object obj);

    OSZ<String, String>[] LJIIIIZZ(Aweme aweme);

    void LJIIIZ(C221728n2 c221728n2);

    void LJIIJ(ActivityC45651qj activityC45651qj, Aweme aweme, AddYourRecordParam addYourRecordParam);

    void LJIIJJI(AddYoursStickerStruct addYoursStickerStruct, C221728n2 c221728n2);

    void LJIIL(Context context, Aweme aweme, TextExtraStruct textExtraStruct, String str);

    void LJIILIIL(Context context, Bundle bundle, String str, String str2, String str3);

    AddYoursNoticeVideosResp LJIILJJIL(int i, long j, long j2, String str);

    AddYoursStickerStruct LJIILL(String str, AddYoursStickerStruct addYoursStickerStruct);

    void LJIILLIIL(Context context, AddYoursTopic addYoursTopic, Aweme aweme, Integer num, List<AddYoursAvatar> list, boolean z, String str, String str2, int i, String str3);
}
