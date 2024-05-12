package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UFk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76884UFk extends AbstractC32054Ci2<IHostSubscription.Params, IHostSubscription.Result> {
    public IHostSubscription.Params LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76884UFk(SparkContext sparkContext) {
        super(sparkContext);
        o.LJIIIZ(sparkContext, "sparkContext");
        this.LJLJJI = 121;
        this.LJLJJL = 122;
    }

    public C76884UFk(BaseFragment baseFragment) {
        super(baseFragment);
        this.LJLJJI = 121;
        this.LJLJJL = 122;
    }

    public final void LJJI(IHostSubscription.Result result, int i) {
        Fragment fragment;
        Context context;
        Resources resources;
        if (result.LIZ != 0 && (fragment = this.LJLILLLLZI) != null && (context = fragment.getContext()) != null && (resources = context.getResources()) != null) {
            int i2 = result.LIZ;
            resources.getQuantityString(R.plurals.kw, i2, Integer.valueOf(i2));
        }
        IHostSubscription.Result.PhotoFile[] photoFileArr = result.originFiles;
        if (photoFileArr != null) {
            if (i == 1) {
                if (result.LIZIZ > 0) {
                    C30868C9o.LIZJ(R.string.l00);
                }
            } else if (photoFileArr.length > result.LIZ) {
                C30868C9o.LIZJ(R.string.l00);
            }
        }
        try {
            finishWithResult(result);
        } catch (Exception unused) {
            finishWithFailure();
        }
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Object obj, C38131Exr context) {
        int i;
        IHostSubscription.Params params = (IHostSubscription.Params) obj;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        this.LJLJI = params;
        IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
        Fragment fragment = this.LJLILLLLZI;
        if (fragment != null) {
            int i2 = this.LJLJJI;
            int i3 = this.LJLJJL;
            IHostSubscription.Params params2 = this.LJLJI;
            if (params2 != null) {
                i = params2.max_count;
            } else {
                i = 0;
            }
            iHostSubscription.gx(fragment, i2, i3, i, params.emotesShowStyle, new C76878UFe(params.min_width, params.min_height, params.max_width, params.max_height, params.max_size), params.logInfo);
        }
    }

    @Override // X.InterfaceC31231CNn
    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
        IHostSubscription.Params params = this.LJLJI;
        if (params != null && (fragment = this.LJLILLLLZI) != null && intent != null) {
            int i3 = params.emotesShowStyle;
            if (i3 != 1 && i3 != 2) {
                LJJI(iHostSubscription.QL(fragment, intent, params), params.emotesShowStyle);
            } else {
                LJJI(iHostSubscription.uV(fragment, iHostSubscription.jy(intent), params, false), params.emotesShowStyle);
            }
        }
    }
}
