package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.MOq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56740MOq extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MusNewNotificationFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56740MOq(MusNewNotificationFragment musNewNotificationFragment) {
        super(0);
        this.LJLIL = musNewNotificationFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Intent intent;
        Fragment mv0;
        MusNewNotificationFragment musNewNotificationFragment = this.LJLIL;
        musNewNotificationFragment.getClass();
        ActivityC45651qj mo49getActivity = musNewNotificationFragment.mo49getActivity();
        o.LJI(mo49getActivity);
        CommonPageFragment kv0 = C84193Sd.LIZ(mo49getActivity).kv0();
        if (kv0 != null && s.LJJJLZIJ(C16880lQ.LJLLJ(kv0.getClass()), "MainPageFragment", false) && (mv0 = C116694i1.LIZ(musNewNotificationFragment.mo49getActivity()).mv0()) != null && mv0 == musNewNotificationFragment) {
            C12460eI.LJIIIIZZ(musNewNotificationFragment, null);
        }
        super/*com.ss.android.ugc.common.component.fragment.ComponentFragment*/.onResume();
        AX5.LIZ = (String) MusNewNotificationFragment.LLIIIJ.getValue();
        this.LJLIL.Rl(true);
        MusNewNotificationFragment musNewNotificationFragment2 = this.LJLIL;
        if (musNewNotificationFragment2.isViewValid()) {
            Bundle Il = musNewNotificationFragment2.Il();
            String string = Il.getString("label");
            String string2 = Il.getString("uid");
            if (Il.getBoolean("is_from_push", false) && musNewNotificationFragment2.LJLLI != C56702MNe.LIZ) {
                C56736MOm c56736MOm = musNewNotificationFragment2.LJLJLJ;
                if (c56736MOm != null) {
                    ((LiveData) c56736MOm.LJLJJL.LJLIL.getValue()).postValue(Integer.valueOf(C56702MNe.LIZ));
                }
                musNewNotificationFragment2.m6((C56732MOi) ListProtector.get(musNewNotificationFragment2.LJLJLLL, 0));
            }
            if (AX6.LIZIZ() && INB.LIZIZ()) {
                Bundle arguments = musNewNotificationFragment2.getArguments();
                if (arguments != null) {
                    arguments.putString("label", "");
                }
            } else {
                ActivityC45651qj mo49getActivity2 = musNewNotificationFragment2.mo49getActivity();
                if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null) {
                    intent.putExtra("label", "");
                }
            }
            if (TextUtils.equals(string, "follow_request")) {
                SmartRoute buildRoute = SmartRouter.buildRoute(musNewNotificationFragment2.getContext(), "aweme://follow_request");
                buildRoute.withParam("label", string);
                buildRoute.withParam("uid", string2);
                Intent buildIntent = buildRoute.buildIntent();
                C78598Ut0.LJIJJ(buildIntent, musNewNotificationFragment2);
                musNewNotificationFragment2.startActivityForResult(buildIntent, 1024);
            }
        }
        MusNewNotificationFragment musNewNotificationFragment3 = this.LJLIL;
        if (musNewNotificationFragment3.LJLLLL) {
            musNewNotificationFragment3.LJ();
            this.LJLIL.LJLLLL = false;
        }
        this.LJLIL.getClass();
        this.LJLIL.getClass();
        this.LJLIL.getClass();
        this.LJLIL.Hl().LJ("notification_page");
        MusNewNotificationFragment musNewNotificationFragment4 = this.LJLIL;
        if (musNewNotificationFragment4.LJLLI == C56702MNe.LIZ && musNewNotificationFragment4.LJLLLLLL) {
            musNewNotificationFragment4.LJLLILLLL.incrementAndGet();
            this.LJLIL.Kl().startFetchLive();
        }
        return C76800UCe.LIZ;
    }
}
