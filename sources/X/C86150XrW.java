package X;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.live.GoLiveActivity;
import com.ss.android.ugc.aweme.live.GoLiveManager;
import com.ss.android.ugc.aweme.live.Live;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XrW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C86150XrW extends TBS implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public C86150XrW(GoLiveActivity goLiveActivity) {
        super(1, goLiveActivity, GoLiveActivity.class, "goLive", "goLive(Landroid/os/Bundle;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bundle bundle) {
        Fragment fragment;
        C30721C3x c30721C3x;
        InterfaceC12610eX interfaceC12610eX;
        Bundle bundle2 = bundle;
        GoLiveActivity goLiveActivity = (GoLiveActivity) this.receiver;
        goLiveActivity.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(1);
        }
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(1);
            }
        }
        Window window = goLiveActivity.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        int i = 0;
        if (LiveOverdrawOptimizeSettings.INSTANCE.enable()) {
            goLiveActivity.getWindow().getDecorView().setBackgroundResource(0);
        }
        goLiveActivity.LLFZ();
        if (!goLiveActivity.LJLLI) {
            C29306Beo.LJI(goLiveActivity._$_findCachedViewById(R.id.bw5));
        }
        goLiveActivity.LLIIIJ(EnumC32529Cph.BROADCAST);
        goLiveActivity.LJLJJI = null;
        goLiveActivity.getWindow().setSoftInputMode(2);
        goLiveActivity.LJLJJL = Live.getService().createLiveBroadcastFragment(goLiveActivity.LJLL, bundle2);
        GoLiveManager goLiveManager = goLiveActivity.LJLIL;
        if (goLiveManager != null && (interfaceC12610eX = goLiveManager.LJLJLJ) != null) {
            ((C30514ByI) interfaceC12610eX).LJLL = EnumC30414Bwg.EVENT_PAGE_BROADCAST;
        }
        FragmentManager supportFragmentManager = goLiveActivity.getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        InterfaceC30302Bus interfaceC30302Bus = goLiveActivity.LJLJJL;
        if (interfaceC30302Bus != null && (fragment = interfaceC30302Bus.getFragment()) != null) {
            LIZ.LJIIJ(fragment, null, R.id.dm7);
            LIZ.LJIILJJIL();
            Live.getService().setBroadcastActivity(goLiveActivity);
            C0IT.LIZJ(goLiveActivity);
            GoLiveManager goLiveManager2 = goLiveActivity.LJLIL;
            if (goLiveManager2 != null && (c30721C3x = goLiveManager2.LJLJLLL) != null) {
                DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
                dataChannelGlobal2.getClass();
                dataChannelGlobal2.jv0(c30721C3x);
                c30721C3x.LJIIJJI = null;
                c30721C3x.LJIIL = null;
            }
            C62822Ol8 c62822Ol8 = C46375IHz.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() >= 0) {
                RunnableC62611Ohj runnableC62611Ohj = goLiveActivity.LJLJLJ;
                int intValue = ((Number) c62822Ol8.getValue()).intValue();
                if (intValue >= 0 && (i = intValue) > 60) {
                    i = 60;
                }
                C30326BvG.LIZJ(runnableC62611Ohj, goLiveActivity, i * 1000);
            }
        }
        return C76800UCe.LIZ;
    }
}
