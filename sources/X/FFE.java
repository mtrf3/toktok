package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.ABTask;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;
import kotlin.jvm.internal.o;
import n59.m0;

/* loaded from: classes7.dex */
public final class FFE extends FF6 {
    public final Application LIZ;
    public final AppBuildConfig LIZIZ;

    @Override // X.FKD
    public final void onCreate() {
        ((m0) ServiceManager.get().getService(m0.class)).LIZJ();
    }

    @Override // X.FKD
    public final void LIZ(Context context) {
        EF1.LIZ(this.LIZ, this.LIZIZ);
    }

    @Override // X.FKD
    public final Resources LJ(Resources resources) {
        o.LJIIIZ(resources, "resources");
        TiktokSkinHelper.LIZ(resources);
        return resources;
    }

    @Override // X.FKD
    public final void LJI(Context context) {
        this.LIZIZ.LJIIIZ();
        Librarian.LIZLLL(context, "31.5.3", new FFF());
        C38732FIa.LIZ(context);
        ConfigMock.INSTANCE.init(context);
        new ABTask().run(context);
    }

    public FFE(Application mApplication, AwemeAppBuildConfig awemeAppBuildConfig) {
        o.LJIIIZ(mApplication, "mApplication");
        this.LIZ = mApplication;
        this.LIZIZ = awemeAppBuildConfig;
    }
}
