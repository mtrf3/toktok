package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wdf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82743Wdf extends AbstractC56012Ht<C82750Wdm, C82746Wdi> implements G7O {
    public final C0IB<Boolean> LJLIL;
    public final ShortVideoContext LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Keva LJLJJL;

    @Override // X.AbstractC56012Ht, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (e1.LIZ(31744, "camera_and_mic_auth_all_in_one", true, false)) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.LJLJJL.getBoolean("show_permission_page", false)) {
            add(R.id.bs8, (WM7) this.LJLJJI.getValue(), "MusicShareToStoryUIPanelScene");
        } else {
            add(R.id.bs8, (WM7) this.LJLJI.getValue(), "RecordPermissionUIScene");
        }
        this.LJLJJL.storeBoolean("show_permission_page", true);
    }

    public C82743Wdf(C0IB<Boolean> relayoutEvent, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = relayoutEvent;
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 165));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 164));
        this.LJLJJL = Keva.getRepo("show_permission_statement_repo");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.bvn, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
