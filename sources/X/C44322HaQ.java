package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HaQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44322HaQ extends AbstractC44341Haj {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;

    static {
        TBT tbt = new TBT(C44322HaQ.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C44322HaQ.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0, c65351Pkp), C61845OOz.LIZJ(C44322HaQ.class, "viewModelProvider", "getViewModelProvider()Landroidx/lifecycle/ViewModelProvider;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC44341Haj
    public final long LIZ() {
        return 9L;
    }

    public final ShortVideoContext LIZLLL() {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ((ViewModelProvider) this.LJLJJL.LIZ(this, LJLJJLL[2])).get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "viewModelProvider.get(Sh…s.java).shortVideoContext");
        return shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44322HaQ(C82622Wbi context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = UCI.LJI(this.LJLIL, ActivityC45651qj.class, null);
        UCI.LJI(this.LJLIL, C44343Hal.class, null);
        this.LJLJJL = UCI.LJI(this.LJLIL, ViewModelProvider.class, null);
    }

    @Override // X.AbstractC44341Haj
    public final void LIZIZ(int i, long j, String str) {
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String str2 = "";
        String optString = jSONObject.optString("username", "");
        String optString2 = jSONObject.optString("uid", "");
        int optInt = jSONObject.optInt("status", -1);
        if (optInt != 0) {
            if (optInt == 1) {
                str2 = ((Context) this.LJLJJI.LIZ(this, LJLJJLL[0])).getString(R.string.r82, optString);
            }
        } else {
            str2 = ((Context) this.LJLJJI.LIZ(this, LJLJJLL[0])).getString(R.string.r7h, optString);
        }
        o.LJIIIIZZ(str2, "when (status) {\n        …\"\n            }\n        }");
        if (str2.length() > 0) {
            LIZJ(new AqS74S1100000_7(this, str2, 15));
        }
        LIZJ(new C44321HaP(optInt, this, optString, optString2));
    }
}
