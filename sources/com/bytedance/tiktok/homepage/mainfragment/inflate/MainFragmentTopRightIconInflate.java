package com.bytedance.tiktok.homepage.mainfragment.inflate;

import X.C119624mk;
import X.C42124Gg4;
import X.C51588KMm;
import X.C63144OqK;
import X.C78983UzD;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36101EEv;
import X.LL8;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainFragmentTopRightIconInflate implements InterfaceC36101EEv {
    public ImageView LJLIL;
    public C51588KMm LJLILLLLZI;
    public ImageView LJLJI;
    public TuxIconView LJLJJI;
    public C119624mk LJLJJL;

    @Override // X.InterfaceC36101EEv
    public final int LIZIZ() {
        return R.style.ul;
    }

    @Override // X.EEY
    public final String key() {
        return "MainFragmentTopRightIconInflate";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "inflate_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C63144OqK.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.InterfaceC36101EEv
    public final Class<? extends Activity> LIZ() {
        return HomePageUIFrameServiceImpl.LIZ().getHomePageInflateActivityClass();
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        return EnumC36103EEx.INFLATE;
    }

    public final View LIZLLL(int i, Context context) {
        o.LJIIIZ(context, "context");
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 8) {
                            View view = this.LJLJI;
                            if (view == null) {
                                view = LL8.LIZLLL(context);
                            }
                            this.LJLJI = null;
                            return view;
                        }
                        C119624mk c119624mk = this.LJLJJL;
                        if (c119624mk == null) {
                            c119624mk = LL8.LIZJ(context);
                        }
                        this.LJLJJL = null;
                        return c119624mk;
                    }
                    TuxIconView tuxIconView = this.LJLJJI;
                    if (tuxIconView == null) {
                        tuxIconView = LL8.LIZ(context);
                    }
                    this.LJLJJI = null;
                    return tuxIconView;
                }
                C51588KMm c51588KMm = this.LJLILLLLZI;
                if (c51588KMm == null) {
                    c51588KMm = LL8.LJI(context);
                }
                this.LJLILLLLZI = null;
                return c51588KMm;
            }
            View view2 = this.LJLIL;
            if (view2 == null) {
                view2 = LL8.LJFF(context);
            }
            this.LJLIL = null;
            return view2;
        }
        return IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().getDmEntranceView(context, "homepage_hot");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC36101EEv
    public final void LJFF(Activity activity, Context context) {
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Activity activity5;
        Activity activity6;
        if (activity != null) {
            activity2 = activity;
        } else {
            activity2 = context;
        }
        try {
            this.LJLIL = LL8.LJFF(activity2);
            if (activity != null) {
                activity3 = activity;
            } else {
                activity3 = context;
            }
            this.LJLILLLLZI = LL8.LJI(activity3);
            if (activity != null) {
                activity4 = activity;
            } else {
                activity4 = context;
            }
            this.LJLJI = (ImageView) LL8.LIZLLL(activity4);
            if (activity != null) {
                activity5 = activity;
            } else {
                activity5 = context;
            }
            this.LJLJJI = LL8.LIZ(activity5);
            if (activity != null) {
                activity6 = activity;
            } else {
                activity6 = context;
            }
            this.LJLJJL = LL8.LIZJ(activity6);
            if (activity == null) {
                activity = context;
            }
            C42124Gg4.LIZIZ(activity);
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "MainFragmentTopRightIconInflate error");
        }
    }
}
