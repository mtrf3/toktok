package com.bytedance.android.livesdk.lynx.ui;

import X.ActivityC45651qj;
import X.C01R;
import X.C30939CCh;
import X.C65232Piu;
import X.C78528Urs;
import X.CN1;
import X.CO5;
import X.COJ;
import X.InterfaceC31238CNu;
import X.OFH;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AbsHybridFragment extends BaseFragment implements COJ, InterfaceC31238CNu {
    public BaseDialogFragment LJLIL;
    public BaseDialogFragment LJLILLLLZI;
    public CO5 LJLJJLL;
    public final String LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public int LJLJI = 2;
    public String LJLJJI = "";
    public String LJLJJL = "";

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract View re();

    public AbsHybridFragment() {
        OFH.LIZLLL.getClass();
        String LJ = OFH.LJ();
        this.LJLJL = LJ;
        OFH.LIZIZ(System.currentTimeMillis(), LJ, "open_time");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ActivityC45651qj mo49getActivity;
        IBrowserService iBrowserService;
        C30939CCh To0;
        super.onDestroy();
        if (this.LJLJI == 1 && (mo49getActivity = mo49getActivity()) != null && (iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class)) != null && (To0 = iBrowserService.To0()) != null) {
            To0.LIZ(mo49getActivity);
        }
        OFH ofh = OFH.LIZLLL;
        String str = this.LJLJL;
        ofh.getClass();
        OFH.LJII(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        Window window;
        ActivityC45651qj mo49getActivity2;
        Window window2;
        ActivityC45651qj mo49getActivity3;
        Window window3;
        super.onActivityCreated(bundle);
        if (this.LJLJI == 1) {
            String str = this.LJLJJL;
            int hashCode = str.hashCode();
            if (hashCode != 830576931) {
                if (hashCode != 1010202942) {
                    if (hashCode != 2003411598 || !str.equals("adjustPan") || (mo49getActivity3 = mo49getActivity()) == null || (window3 = mo49getActivity3.getWindow()) == null) {
                        return;
                    }
                    window3.setSoftInputMode(32);
                    return;
                }
                if (!str.equals("adjustNothing") || (mo49getActivity2 = mo49getActivity()) == null || (window2 = mo49getActivity2.getWindow()) == null) {
                    return;
                }
                window2.setSoftInputMode(48);
                return;
            }
            if (!str.equals("adjustResize") || (mo49getActivity = mo49getActivity()) == null || (window = mo49getActivity.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(18);
        }
    }

    public boolean onBackPressed(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject LIZJ = C65232Piu.LIZJ("action_from", str);
        LIZJ.put("container_id", this.LJLJJI);
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(LIZJ), "GESTURE_SLIDE_TOOGLE_EVENT");
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        String str;
        IBrowserService iBrowserService;
        C30939CCh To0;
        String string;
        super.onCreate(bundle);
        long currentTimeMillis = System.currentTimeMillis();
        OFH ofh = OFH.LIZLLL;
        String str2 = this.LJLJL;
        ofh.getClass();
        OFH.LIZIZ(currentTimeMillis, str2, "container_init_start");
        OFH.LIZJ(this.LJLJL, "container_name", "webcast_oversea");
        String str3 = this.LJLJL;
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments != null && (string = arguments.getString("original_scheme", "")) != null) {
            str4 = string;
        }
        OFH.LIZJ(str3, "schema", str4);
        OFH.LIZJ(this.LJLJL, "container_version", "3060");
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (arguments2.getBoolean("is_dummy_host", false)) {
                i = 1;
            } else {
                i = 2;
            }
            this.LJLJI = i;
            if (i != 1 || (str = this.LJLJJI) == null || str.length() == 0 || mo49getActivity() == null || (iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class)) == null || (To0 = iBrowserService.To0()) == null) {
                return;
            }
            String str5 = this.LJLJJI;
            o.LJI(str5);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            ((ConcurrentHashMap) To0.LIZ).put(str5, new WeakReference(mo49getActivity));
        }
    }
}
