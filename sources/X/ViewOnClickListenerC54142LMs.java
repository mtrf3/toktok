package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import java.util.HashSet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LMs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC54142LMs implements View.OnClickListener, InterfaceC56322M8o {
    public final Context LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public String LJLLI;

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "inbox";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return this.LJLILLLLZI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    public final void LIZJ() {
        LifecycleCoroutineScope lifecycleScope;
        if (C59522Vg.LIZ()) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
            if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C70752q7(this, null), 2);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LIZIZ(this.LJLIL, "notification_page", this);
            return;
        }
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        UQF LJJIJIIJIL = c77266UUc.LJJIJIIJIL(2, false);
        if (LJJIJIIJIL.LJLIL || LJJIJIIJIL.LJLILLLLZI) {
            C54149LMz.LIZ(c77266UUc, LJJIJIIJIL, "notification_page", this.LJLIL, null, 48);
        } else {
            IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LIZIZ(this.LJLIL, "notification_page", this);
        }
    }

    public ViewOnClickListenerC54142LMs(Context context) {
        boolean z;
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        this.LJLILLLLZI = LJJIFFI;
        this.LJLJI = C221108m2.LIZIZ(LGV.INSTANCE);
        this.LJLJJI = C221108m2.LIZIZ(LGS.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(LGU.LJLIL);
        if (C53260KvI.LIZIZ || PrevLoginPlatformService.LJIIL().LJI()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 850));
        this.LJLJLJ = C221108m2.LIZIZ(LIX.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(LK0.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(LIY.LJLIL);
        this.LJLL = LIZIZ;
        LLK llk = new LLK(this);
        if (!C53765L8f.LJIILIIL((String) LIZIZ.getValue())) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init when top ");
        LIZ.append(LJJIFFI);
        C221018lt.LJFF("BottomNotificationObserver", X1D.LIZIZ(LIZ));
        com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).hv0("NOTIFICATION", llk);
        C84193Sd.LIZ(LJJIFFI).qv0(LJJIFFI, C54143LMt.LJLIL);
    }

    public final void LIZ(String str) {
        C221018lt.LJFF("BottomNotificationObserver", "onPageSelected");
        C54502LaE.LIZ("mus_new_notification");
        MMH.LIZ();
        IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().onInboxTabClicked();
        ML4.LIZJ();
        C73040SlY.LJII(EF7.LIZIZ(), "message", "click");
        C116484hg.LIZ("network_status", String.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()), "inbox_message_click");
        C56434MCw c56434MCw = C56652MLg.LIZJ;
        HashSet<Integer> value = c56434MCw.LIZ.getValue();
        if (value != null && value.contains(-1)) {
            c56434MCw.LIZIZ(0);
            C56653MLh c56653MLh = C56652MLg.LIZIZ;
            c56653MLh.LIZIZ = true;
            c56653MLh.LIZ = System.currentTimeMillis();
        }
        SystemClock.uptimeMillis();
        M9Q.LIZJ();
        C54362LVe.LJIJJ(true);
        C54362LVe.LIZIZ(998);
        LRP lrp = LRP.LIZIZ;
        lrp.LJFF();
        lrp.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageSelected curTabName = ");
        LIZ.append(str);
        C221018lt.LJFF("BottomNotificationObserver", X1D.LIZIZ(LIZ));
        if (!o.LJ(str, "NOTIFICATION") && (!C53765L8f.LJIILIIL((String) this.LJLL.getValue()) || !C54072LKa.LIZLLL)) {
            Object value2 = this.LJLJLJ.getValue();
            o.LJIIIIZZ(value2, "<get-mainPageService>(...)");
            ((IMainPageFragment) value2).s4();
        }
        ((IEnterFromService) this.LJLJLLL.getValue()).setEnterFrom("NOTIFICATION");
        FollowFeedServiceImpl.LJIILL().LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC54142LMs.LIZIZ(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x016b A[RETURN] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC54142LMs.onClick(android.view.View):void");
    }
}
