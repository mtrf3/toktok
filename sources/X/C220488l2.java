package X;

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
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8l2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220488l2 implements IAddYoursService {
    public static final C220488l2 LIZIZ = new C220488l2();
    public final /* synthetic */ IAddYoursService LIZ = AddYoursServiceImpl.LJIJ();

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LIZ(long j, InterfaceC67352kd<? super AddYoursStickerStruct> interfaceC67352kd) {
        return this.LIZ.LIZ(j, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AbstractC186347Ta LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AbstractC186377Td LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZJ(context);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJ(List list, long j, String str, C198657qv c198657qv) {
        return this.LIZ.LJ(list, j, str, c198657qv);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJFF(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJFF(c235769Nc, viewStub, activity);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final IInterceptor LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJII(Aweme aweme, Object obj) {
        return this.LIZ.LJII(aweme, obj);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final OSZ<String, String>[] LJIIIIZZ(Aweme aweme) {
        return this.LIZ.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIIZ(C221728n2 listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJIIIZ(listener);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIJ(ActivityC45651qj activity, Aweme aweme, AddYourRecordParam addYourRecordParam) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.LJIIJ(activity, aweme, addYourRecordParam);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIJJI(AddYoursStickerStruct addYoursStickerStruct, C221728n2 listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJIIJJI(addYoursStickerStruct, listener);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIL(Context context, Aweme aweme, TextExtraStruct textExtraStruct, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        this.LIZ.LJIIL(context, aweme, textExtraStruct, eventType);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIILIIL(Context context, Bundle bundle, String questionId, String str, String enterFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJIILIIL(context, bundle, questionId, str, enterFrom);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AddYoursNoticeVideosResp LJIILJJIL(int i, long j, long j2, String str) {
        return this.LIZ.LJIILJJIL(i, j, j2, str);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AddYoursStickerStruct LJIILL(String str, AddYoursStickerStruct addYoursSticker) {
        o.LJIIIZ(addYoursSticker, "addYoursSticker");
        return this.LIZ.LJIILL(str, addYoursSticker);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIILLIIL(Context context, AddYoursTopic topic, Aweme aweme, Integer num, List<AddYoursAvatar> list, boolean z, String str, String str2, int i, String str3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(topic, "topic");
        this.LIZ.LJIILLIIL(context, topic, aweme, num, list, z, str, str2, i, str3);
    }
}
