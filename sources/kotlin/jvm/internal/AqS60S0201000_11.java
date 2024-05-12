package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C68540QvA;
import X.C75792yF;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import com.bytedance.keva.Keva;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.login.trusted.LoginHistoryFeatureStateResponse;
import com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvUser;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class AqS60S0201000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(LoginHistoryFeatureStateResponse loginHistoryFeatureStateResponse) {
        int i;
        String curSecUserId;
        boolean z;
        List arrayList;
        LoginHistoryFeatureStateResponse.Data data;
        if (loginHistoryFeatureStateResponse != null && (data = loginHistoryFeatureStateResponse.data) != null) {
            i = data.status;
        } else {
            i = -1;
        }
        if (i == this.i2 && (curSecUserId = ((LoginMethodService) this.l1).getCurSecUserId()) != null) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            C68540QvA.LIZLLL(curSecUserId, z);
            if (!z) {
                Keva repo = Keva.getRepo("aweme_trusted_users_repo");
                o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
                String json = repo.getString("users_list_json", "");
                o.LJIIIIZZ(json, "json");
                if (json.length() == 0) {
                    arrayList = new ArrayList();
                } else {
                    try {
                        arrayList = C75792yF.LIZLLL(TrustedEnvUser[].class, json);
                    } catch (s unused) {
                        arrayList = new ArrayList();
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (o.LJ(((TrustedEnvUser) next).secUid, curSecUserId)) {
                        if (next != null) {
                            arrayList.remove(next);
                            Keva repo2 = Keva.getRepo("aweme_trusted_users_repo");
                            o.LJIIIIZZ(repo2, "getRepo(REPO_NAME)");
                            repo2.storeString("users_list_json", C75792yF.LIZJ(arrayList));
                        }
                    }
                }
            }
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS60S0201000_11 aqS60S0201000_11, Object obj) {
        aqS60S0201000_11.invoke$0((LoginHistoryFeatureStateResponse) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS60S0201000_11 aqS60S0201000_11, Object obj) {
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) aqS60S0201000_11.l0;
        int i = aqS60S0201000_11.i2;
        Intent intent = (Intent) aqS60S0201000_11.l1;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(102101, "android/media/projection/MediaProjectionManager", "getMediaProjection", mediaProjectionManager, new Object[]{Integer.valueOf(i), intent}, "android.media.projection.MediaProjection", new C65300Pk0(false, "(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;", "5527588878949377496"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return mediaProjectionManager.getMediaProjection(i, intent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS60S0201000_11(int i, int i2, LoginMethodService loginMethodService, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.i2 = i;
        this.l1 = i2;
        this.l0 = loginMethodService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0201000_11(MediaProjectionManager mediaProjectionManager, int i, Intent intent, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = mediaProjectionManager;
        this.i2 = i;
        this.l1 = intent;
    }
}
