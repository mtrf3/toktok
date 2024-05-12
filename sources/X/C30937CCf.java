package X;

import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.CCf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30937CCf extends AbstractC38127Exn<JSONObject, Object> {
    public DialogFragment LJLIL;
    public Activity LJLILLLLZI;
    public final CNV LJLJI;
    public final SparkContext LJLJJI;

    public C30937CCf(CNV cnv) {
        this.LJLJI = cnv;
    }

    public C30937CCf(Activity activity) {
        this.LJLILLLLZI = activity;
    }

    public C30937CCf(DialogFragment dialogFragment) {
        this.LJLIL = dialogFragment;
    }

    public C30937CCf(SparkContext sparkContext) {
        this.LJLJJI = sparkContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        SparkContext sparkContext;
        InterfaceC40159FpT LJIILL;
        Reference reference;
        Activity activity;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("container_list");
        String optString = jSONObject2.optString("animation_type");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String containerId = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(containerId)) {
                    IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
                    UOS uos = UOS.ID;
                    if (iShortTouchService.vr(uos, containerId) != null) {
                        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(uos, containerId);
                    }
                    C30892CAm c30892CAm = C30893CAn.LIZ;
                    c30892CAm.getClass();
                    o.LJIIIZ(containerId, "containerId");
                    BaseDialogFragment baseDialogFragment = (BaseDialogFragment) ((ConcurrentHashMap) c30892CAm.LIZIZ).get(containerId);
                    if (baseDialogFragment != 0) {
                        if (baseDialogFragment instanceof HybridDialogFragment) {
                            HybridDialogFragment hybridDialogFragment = (HybridDialogFragment) baseDialogFragment;
                            if (!TextUtils.isEmpty(optString)) {
                                hybridDialogFragment.LLJIJIL = optString;
                            }
                        }
                        if (baseDialogFragment instanceof CNL) {
                            ((CNL) baseDialogFragment).Gf(optString);
                        }
                        View view = baseDialogFragment.getView();
                        if (view != null) {
                            view.post(new IDRunnableS6S0101000(1, baseDialogFragment, 4));
                        } else {
                            baseDialogFragment.dismissAllowingStateLoss();
                        }
                    }
                    C30939CCh c30939CCh = C30938CCg.LIZ;
                    c30939CCh.getClass();
                    Reference reference2 = (Reference) ((ConcurrentHashMap) c30939CCh.LIZ).get(containerId);
                    if (reference2 != null && reference2.get() != null && (reference = (Reference) ((ConcurrentHashMap) c30939CCh.LIZ).get(containerId)) != null && (activity = (Activity) reference.get()) != null) {
                        activity.finish();
                    }
                    ConcurrentHashMap<String, WeakReference<SparkContext>> concurrentHashMap = C30874C9u.LIZ;
                    WeakReference<SparkContext> weakReference = concurrentHashMap.get(containerId);
                    if (weakReference != null && (sparkContext = weakReference.get()) != null && (LJIILL = sparkContext.LJIILL()) != null) {
                        LJIILL.close();
                    }
                    concurrentHashMap.remove(containerId);
                    ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).IB(containerId);
                }
            }
        } else if (this.LJLJJI != null) {
            if (jSONObject2.optInt("enable_go_back", 0) == 1) {
                C12850ev c12850ev = C12840eu.LIZ;
                String str = this.LJLJJI.containerId;
                Iterator it = ((ArrayList) c12850ev.LIZIZ).iterator();
                while (it.hasNext()) {
                    C12830et c12830et = (C12830et) it.next();
                    InterfaceC32911Qx interfaceC32911Qx = (InterfaceC32911Qx) ((HashMap) c12830et.LJFF).get(str);
                    if (interfaceC32911Qx != null) {
                        c12830et.LIZIZ(interfaceC32911Qx);
                        break;
                    }
                }
            }
            C12850ev c12850ev2 = C12840eu.LIZ;
            String str2 = this.LJLJJI.containerId;
            Iterator it2 = ((ArrayList) c12850ev2.LIZIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    C12830et c12830et2 = (C12830et) it2.next();
                    if (((HashMap) c12830et2.LJFF).get(str2) != null) {
                        c12830et2.LIZ();
                        break;
                    }
                } else {
                    InterfaceC40159FpT LJIILL2 = this.LJLJJI.LJIILL();
                    if (LJIILL2 != null) {
                        LJIILL2.close();
                        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).IB(this.LJLJJI.containerId);
                    }
                }
            }
        } else {
            CNV cnv = this.LJLJI;
            if (cnv != null) {
                cnv.close();
            } else {
                DialogFragment dialogFragment = this.LJLIL;
                if (dialogFragment != null) {
                    dialogFragment.dismissAllowingStateLoss();
                    this.LJLIL = null;
                } else {
                    Activity activity2 = this.LJLILLLLZI;
                    if (activity2 != null) {
                        activity2.finish();
                        this.LJLILLLLZI = null;
                    } else {
                        AbstractC38127Exn.terminate();
                    }
                }
            }
        }
        return null;
    }
}
