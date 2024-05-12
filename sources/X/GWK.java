package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.image.ui.ImageEditActivity;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWK extends AbstractC29891Fh<InterfaceC146395op> implements InterfaceC146395op, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC146395op LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final String LJLJJI;

    static {
        TBT tbt = new TBT(GWK.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    private final VideoPublishEditModel LJJLI() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJJL[0]);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        Activity activity = (Activity) ORY.LJJJLZIJ(activityStack);
        if (activity == null || LJJLI().mShootWay == null) {
            return;
        }
        if (o.LJ(activity.getClass().getName(), ImageEditActivity.class.getName())) {
            IConfigService configService = AVExternalServiceImpl.LIZ().configService();
            String str = LJJLI().mShootWay;
            o.LJIIIIZZ(str, "editModel.mShootWay");
            configService.mobUserExitEditAction(str, this.LJLJJI);
            return;
        }
        if (activity instanceof SAAActivity) {
            SAAActivity sAAActivity = (SAAActivity) activity;
            if ((sAAActivity.LLIIIILZ() instanceof VideoEditContainerScene) || (sAAActivity.LLIIIILZ() instanceof ImageEditRootScene)) {
                IConfigService configService2 = AVExternalServiceImpl.LIZ().configService();
                String str2 = LJJLI().mShootWay;
                o.LJIIIIZZ(str2, "editModel.mShootWay");
                configService2.mobUserExitEditAction(str2, this.LJLJJI);
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC146395op getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public GWK(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        String str = LJJLI().newDraftId;
        o.LJIIIIZZ(str, "editModel.newDraftId");
        this.LJLJJI = str;
    }
}
