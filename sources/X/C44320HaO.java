package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HaO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44320HaO extends AbstractC44341Haj {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82632Wbs LJLJJI;

    static {
        TBT tbt = new TBT(C44320HaO.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC44341Haj
    public final long LIZ() {
        return 8L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44320HaO(C82622Wbi context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = UCI.LJI(this.LJLIL, C44343Hal.class, null);
    }

    @Override // X.AbstractC44341Haj
    public final void LIZIZ(int i, long j, String str) {
        SharedARModel sharedARModel;
        if (str == null) {
            return;
        }
        int optInt = new JSONObject(str).optInt("state", -1);
        boolean z = false;
        C44343Hal c44343Hal = (C44343Hal) this.LJLJJI.LIZ(this, LJLJJL[0]);
        c44343Hal.LJIIJ.postValue(Integer.valueOf(optInt));
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ((ViewModelProvider) c44343Hal.LIZLLL.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LJLIL;
        MutableLiveData<Boolean> mutableLiveData = c44343Hal.LJIIJJI;
        if (optInt == 1) {
            z = true;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
        if (optInt == 3 && shortVideoContext != null && (sharedARModel = shortVideoContext.sharedARModel) != null) {
            sharedARModel.setSharedARSessionId(null);
            sharedARModel.setSharedARMultiPlayerUserName(null);
            sharedARModel.setSharedARMultiPlayerUserId(null);
            sharedARModel.setCurrentUserHost(true);
        }
    }
}
