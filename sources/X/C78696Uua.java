package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import defpackage.b1;
import java.io.File;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Uua, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78696Uua {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final ActivityC45651qj LIZIZ;

    public final void LIZ() {
        File[] listFiles;
        C78697Uub LJI = C78697Uub.LJI();
        M8Y m8y = new M8Y(this);
        LJI.getClass();
        if (!R3A.LJII()) {
            C78697Uub.LJ(C78697Uub.LJLJJL);
            return;
        }
        LJI.LJLJJI = m8y;
        StringBuilder LIZ = X1D.LIZ();
        String str = C78697Uub.LJLJJL;
        LIZ.append(str);
        String str2 = File.separator;
        LIZ.append(str2);
        LIZ.append(C38352F3k.LIZJ(C78697Uub.LJFF()));
        LIZ.append(".zip");
        File file = new File(X1D.LIZIZ(LIZ));
        if (file.exists()) {
            StringBuilder LIZJ = b1.LIZJ(str, str2);
            LIZJ.append(C38352F3k.LIZJ(C78697Uub.LJFF()));
            File file2 = new File(X1D.LIZIZ(LIZJ));
            if (file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length != 0 && R3A.LJI() != null && R3A.LJI().resEntity != null) {
                String str3 = R3A.LJI().resEntity.md5;
                if (file.exists() && TextUtils.equals(C38352F3k.LIZIZ(file), str3)) {
                    StringBuilder LIZJ2 = b1.LIZJ(str, str2);
                    LIZJ2.append(C38352F3k.LIZJ(C78697Uub.LJFF()));
                    LJI.LJLILLLLZI = X1D.LIZIZ(LIZJ2);
                    InterfaceC54215LPn interfaceC54215LPn = LJI.LJLJJI;
                    if (interfaceC54215LPn != null) {
                        interfaceC54215LPn.LIZ();
                        return;
                    }
                }
            }
        }
        C78697Uub.LJ(str);
        String LJFF = C78697Uub.LJFF();
        if (TextUtils.isEmpty(LJFF)) {
            return;
        }
        StringBuilder LIZJ3 = b1.LIZJ(str, str2);
        LIZJ3.append(C38352F3k.LIZJ(LJFF));
        LJI.LJLJI = X1D.LIZIZ(LIZJ3);
        StringBuilder LIZ2 = X1D.LIZ();
        C0MT.LJ(LIZ2, LJI.LJLJI, ".zip", LIZ2);
        C37247Ejb.LIZIZ.getClass();
        C37246Eja.LIZIZ(str);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with(LJFF);
        StringBuilder LIZ3 = X1D.LIZ();
        with.LIZJ = b1.LIZIZ(LJFF, LIZ3, ".zip", LIZ3);
        with.LJIIJ = "legacy_festival_res";
        with.LJII = downloadServiceManager.getRetryExpCount();
        with.LJ = str;
        with.LJIIL = LJI;
        with.LIZJ();
    }

    @QD3
    public final void onFestivalDataEvent(C36495ETz c36495ETz) {
        LIZ();
        C45400Hro.LIZ = new C78698Uuc();
        C45399Hrn.LJFF().LJII();
    }

    public C78696Uua(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = activityC45651qj;
        EventBus.LIZJ().LJIILJJIL(this);
    }
}
