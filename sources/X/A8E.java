package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.PaidContentAnchorInAppSetting;
import java.util.List;

/* loaded from: classes5.dex */
public final class A8E {
    public static java.util.Map<String, IapProductGetResult.Item> LIZIZ;
    public static List<String> LIZJ;
    public static boolean LIZLLL;
    public static long LJI;
    public static final A8E LIZ = new A8E();
    public static MutableLiveData<A8N> LJ = new MutableLiveData<>();
    public static String LJFF = "";
    public static final C77770Ufe LJII = new C77770Ufe(new A8F(), new A8J());
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(A7H.LJLIL);

    static {
        PaidContentAnchorInAppSetting.LIZ.getClass();
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        PaidContentAnchorInAppSetting.IAPKeys iAPKeys = PaidContentAnchorInAppSetting.LIZIZ;
        PaidContentAnchorInAppSetting.IAPKeys iAPKeys2 = (PaidContentAnchorInAppSetting.IAPKeys) LIZLLL2.LJIIIIZZ("paid_content", PaidContentAnchorInAppSetting.IAPKeys.class, iAPKeys);
        if (iAPKeys2 != null) {
            iAPKeys = iAPKeys2;
        }
        LIZJ = iAPKeys.iAPIDs;
    }
}
