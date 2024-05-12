package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Feb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39485Feb extends C08Z {
    public NavigationConfig LIZ;

    public C39485Feb(NavigationConfig config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        String str;
        boolean z;
        Object LIZ;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        if (this.LIZ.enable) {
            Object tag = v.getTag(R.id.ni3);
            String str2 = null;
            if (tag != null) {
                if (!(tag instanceof String)) {
                    tag = null;
                }
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || !ujb.o.LJJJLIIL(str, "Fragment#", false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Fragment#");
                LIZ2.append(C16880lQ.LJLLILLLL(f.getClass()));
                v.setTag(R.id.ni3, X1D.LIZIZ(LIZ2));
            }
            if (this.LIZ.enableRouterRecord) {
                C39483FeZ.LIZIZ.getClass();
                try {
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (f.mo49getActivity() != null) {
                    ActivityC45651qj mo49getActivity = f.mo49getActivity();
                    if (mo49getActivity != null) {
                        str2 = C16880lQ.LJLLILLLL(mo49getActivity.getClass());
                    }
                    String LJLLILLLL = C16880lQ.LJLLILLLL(f.getClass());
                    if (str2 != null && str2.length() != 0 && LJLLILLLL != null && LJLLILLLL.length() != 0) {
                        ConcurrentHashMap<String, List<String>> concurrentHashMap = C39483FeZ.LIZ;
                        if (concurrentHashMap.containsKey(str2)) {
                            List<String> list = concurrentHashMap.get(str2);
                            if (list != null) {
                                list.add(LJLLILLLL);
                            } else {
                                list = new ArrayList<>();
                            }
                            concurrentHashMap.put(str2, list);
                        } else {
                            concurrentHashMap.put(str2, C47261Igj.LJJIJIL(LJLLILLLL));
                        }
                        LIZ = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ);
                        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                        if (m10exceptionOrNullimpl != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("FragmentRecorder error occur. ");
                            LIZ3.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                            X1D.LIZIZ(LIZ3);
                        }
                    }
                }
            }
        }
        super.onFragmentViewCreated(fm, f, v, bundle);
    }
}
