package com.ss.android.ugc.aweme.main.bottomobserver;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C188727au;
import X.C3SZ;
import X.C42625Go9;
import X.C45804HyK;
import X.C46276IEe;
import X.C46751IWl;
import X.C84193Sd;
import X.IWF;
import X.QD3;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BottomPublishObserver implements GenericLifecycleObserver, View.OnClickListener {
    public final ActivityC45651qj LJLIL;
    public final TabChangeManager LJLILLLLZI;
    public final HomePageDataViewModel LJLJI;
    public long LJLJJI;
    public CreativityToolsPluginUpdater LJLJJL;
    public final IHomePageService LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ec A[EDGE_INSN: B:123:0x03ec->B:124:0x03ec BREAK  A[LOOP:0: B:116:0x03bd->B:122:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0099  */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v24, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver.LIZIZ():void");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        CreativityToolsPluginUpdater creativityToolsPluginUpdater = this.LJLJJL;
        if (creativityToolsPluginUpdater != null && creativityToolsPluginUpdater.LIZ) {
            creativityToolsPluginUpdater.LIZ = false;
        }
        C42625Go9.LIZJ(this);
    }

    public BottomPublishObserver(Context context) {
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        this.LJLIL = LJJIFFI;
        this.LJLILLLLZI = C116694i1.LIZ(LJJIFFI);
        C84193Sd.LIZ(LJJIFFI);
        this.LJLJI = C3SZ.LIZ(LJJIFFI);
        this.LJLJJLL = (IHomePageService) ServiceManager.get().getService(IHomePageService.class);
        this.LJLJLJ = -1L;
        MainPageFragmentImpl.LJI().LJ(this);
        C42625Go9.LIZIZ(this);
    }

    public final boolean LIZ(String str) {
        if (this.LJLJI.LJLJLLL != null && (o.LJ("HOME", this.LJLILLLLZI.nv0()) || o.LJ("FRIENDS_TAB", this.LJLILLLLZI.nv0()))) {
            Aweme aweme = this.LJLJI.LJLJLLL;
            o.LJI(aweme);
            if (!aweme.isAd()) {
                Aweme aweme2 = this.LJLJI.LJLJLLL;
                o.LJI(aweme2);
                if (aweme2.getStory() == null && !o.LJ(str, "homepage_now")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableOpenStopVideoPlayerOpti() && ((C46751IWl) IWF.LJJLIIIIJ().LJJIJIL().getPlayState()).LIZ()) {
            this.LJLJL = true;
            this.LJLJLJ = System.currentTimeMillis();
            IWF.LJJLIIIIJ().LJIILJJIL();
            return;
        }
        LIZIZ();
    }

    @QD3
    public final void onVideoPlayerEvent(C46276IEe status) {
        o.LJIIIZ(status, "status");
        if (status.LJLIL == 4 && this.LJLJL) {
            IAVMobService aVMobService = AVExternalServiceImpl.LIZ().getAVMobService();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("type", "tool_performance_pause_feed_video_player");
            c188727au.LJ(System.currentTimeMillis() - this.LJLJLJ, "totaltime");
            aVMobService.onEventV3("tool_performance_operation_cost_time", c188727au.LIZ);
            this.LJLJL = false;
            LIZIZ();
        }
    }
}
