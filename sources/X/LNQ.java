package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LNQ implements InterfaceC54202LPa {
    public final /* synthetic */ GlobalAcViewModel LIZ;

    public LNQ(GlobalAcViewModel globalAcViewModel) {
        this.LIZ = globalAcViewModel;
    }

    @Override // X.InterfaceC54202LPa
    public final void LIZ(UgAwemeActivitySetting ugAwemeActivitySetting) {
        WeakReference<ViewGroup> weakReference;
        ViewGroup viewGroup;
        ActivityC45651qj activityC45651qj;
        if (ugAwemeActivitySetting != null) {
            WeakReference<ActivityC45651qj> weakReference2 = this.LIZ.LJLILLLLZI;
            ActivityC45651qj activityC45651qj2 = null;
            if (weakReference2 != null && weakReference2.get() != null && (weakReference = this.LIZ.LJLIL) != null && weakReference.get() != null) {
                GlobalAcViewModel globalAcViewModel = this.LIZ;
                WeakReference<ViewGroup> weakReference3 = this.LIZ.LJLIL;
                if (weakReference3 != null) {
                    viewGroup = weakReference3.get();
                } else {
                    viewGroup = null;
                }
                o.LJI(viewGroup);
                WeakReference<ActivityC45651qj> weakReference4 = this.LIZ.LJLILLLLZI;
                if (weakReference4 != null) {
                    activityC45651qj = weakReference4.get();
                } else {
                    activityC45651qj = null;
                }
                o.LJI(activityC45651qj);
                globalAcViewModel.LJLJJI = new C77397UZd(viewGroup, activityC45651qj, ugAwemeActivitySetting);
                GlobalAcViewModel globalAcViewModel2 = this.LIZ;
                C77397UZd c77397UZd = globalAcViewModel2.LJLJJI;
                if (c77397UZd != null) {
                    WeakReference<ActivityC45651qj> weakReference5 = globalAcViewModel2.LJLILLLLZI;
                    if (weakReference5 != null) {
                        activityC45651qj2 = weakReference5.get();
                    }
                    c77397UZd.LIZJ(activityC45651qj2);
                }
            }
        }
    }
}
