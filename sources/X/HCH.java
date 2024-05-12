package X;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.IPublishPageService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.ITestActivityService;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCH implements IUIService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C43329GzV.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IVideo2GifUIService abilityUiService() {
        return new C43250GyE();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IEditService editService() {
        return new C43699HDb();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IPublishPageService publishService() {
        return new C41980Gdk(this);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IRecordService recordService() {
        return new HPQ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final ITestActivityService schemaTestService() {
        return new HCJ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final void startSuperEntraceActivity(Context context) {
        o.LJIIIZ(context, "context");
        HVE.LIZ.getValue().getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r13v2 */
    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final void startCreation(Context context, CreationConfigModelCompat creationComposerModel) {
        BasicModel basic;
        AddYoursModel addYoursModel;
        AddYoursStickerStruct addYoursStickerStruct;
        String str;
        AddYoursModel addyours;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(creationComposerModel, "creationComposerModel");
        DefaultConstructorMarker defaultConstructorMarker = 0;
        if (o.LJ(creationComposerModel.getPageStack(), "1") && (basic = creationComposerModel.getBasic()) != null && basic.getAddyours() != null) {
            BasicModel basic2 = creationComposerModel.getBasic();
            if (basic2 != null) {
                addYoursModel = basic2.getAddyours();
            } else {
                addYoursModel = null;
            }
            if (!C234869Jq.LIZ() || addYoursModel == null || !(context instanceof ActivityC45651qj)) {
                return;
            }
            boolean LJ = o.LJ(addYoursModel.getAyEnterEdit(), Boolean.TRUE);
            String ayTopicId = addYoursModel.getAyTopicId();
            boolean z = false;
            if (ayTopicId == null || ayTopicId.length() == 0) {
                String ayText = addYoursModel.getAyText();
                if (ayText == null || ayText.length() == 0) {
                    addYoursStickerStruct = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                    Keva.getRepo("add_yours_sticker_edit").storeBoolean("is_first", false);
                    C6SQ.LLIFFJFJJ = false;
                    String uid = currentUser.getUid();
                    o.LJIIIIZZ(uid, "curUser.uid");
                    ListProtector.add(arrayList, 0, new AddYoursAvatar(Long.valueOf(CastLongProtector.parseLong(uid)), currentUser.getAvatarThumb(), currentUser.getNickname()));
                    defaultConstructorMarker = 0;
                    addYoursStickerStruct = new AddYoursStickerStruct(null, null, addYoursModel.getAyText(), null, arrayList, null, null, null, null, 0L, 1003, null);
                    LJ = false;
                }
                IAddYoursStickerRecordService LIZIZ = AddYoursStickerRecordServiceImpl.LIZIZ();
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
                BasicModel basic3 = creationComposerModel.getBasic();
                if (basic3 == null || (addyours = basic3.getAddyours()) == null || (str = addyours.getAyEnterMethod()) == null) {
                    str = "H5";
                }
                LIZIZ.LIZ(activityC45651qj, defaultConstructorMarker, new AddYourRecordParam(addYoursStickerStruct, LJ, z, "H5", "add_yours", str, defaultConstructorMarker, z, z, defaultConstructorMarker, defaultConstructorMarker, defaultConstructorMarker, 3072, defaultConstructorMarker)).LIZLLL();
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "openRecordPage/download");
            buildRoute.withParam("extar_start_creation_type", "start_ay_record");
            buildRoute.withParam("extar_add_yours_params", (Parcelable) addYoursModel);
            buildRoute.open();
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C43583H8p(creationComposerModel, context, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final void startCreationFromDeepLink(Context context, CreationConfigModelCompat creationComposerModel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(creationComposerModel, "creationComposerModel");
        if (o.LJ(creationComposerModel.getPageStack(), "1")) {
            startCreation(context, creationComposerModel);
        }
    }
}
