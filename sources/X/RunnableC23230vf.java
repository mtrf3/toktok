package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebMessagePort;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.lobby.vk.VkAuth;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23230vf implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        switch (this.LJLIL) {
            case 0:
                C23250vh.m0setRippleState$lambda2((C23250vh) this.LJLILLLLZI);
                return;
            case 1:
                C30868C9o.LIZLLL(R.string.sw5, ((C37691dt) this.LJLILLLLZI).LJLILLLLZI);
                return;
            case 2:
                LiveRoomFragment liveRoomFragment = (LiveRoomFragment) this.LJLILLLLZI;
                if (liveRoomFragment.LLILIL && (liveRoomFragment.LLIL || liveRoomFragment.LLIIII.LJLJJL != 0)) {
                    return;
                }
                liveRoomFragment.LLILIL = true;
                B57.LIZ.LIZ().LIZIZ(new Event("live_room_auto_page_down", 264, EnumC28203B5b.BussinessApiCall));
                C80797VnN c80797VnN = liveRoomFragment.LLF;
                if (c80797VnN.LJLJJLL == null || c80797VnN.LJLJL >= r0.getCount() - 1) {
                    return;
                }
                c80797VnN.setCurrentItemWithDefaultVelocity(c80797VnN.LJLJL + 1);
                return;
            case 3:
                VkAuth vkAuth = ((M6W) this.LJLILLLLZI).LIZJ;
                C66498Q7y.LIZIZ(vkAuth.LJLJJL, vkAuth.LJLJI.LIZIZ, 2);
                return;
            case 4:
                WebMessagePort webMessagePort = ((WebViewPort) this.LJLILLLLZI).LIZJ;
                if (webMessagePort != null) {
                    webMessagePort.close();
                    return;
                }
                return;
            case 5:
                AnonymousClass745 anonymousClass745 = (AnonymousClass745) this.LJLILLLLZI;
                int width = anonymousClass745.LJZI.getWidth();
                int LIZJ = (int) KL2.LIZJ(anonymousClass745.LJZI.getContext(), 80.0f);
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII((ConstraintLayout) anonymousClass745.LJLILLLLZI);
                if (C90193gN.LIZ()) {
                    anonymousClass064.LJI(R.id.mh7, 7);
                    anonymousClass064.LJI(R.id.mh7, 6);
                    anonymousClass064.LJIIIIZZ(R.id.mh7, 6, R.id.f9r, 7);
                    anonymousClass064.LJIIIIZZ(R.id.mh7, 7, R.id.e1x, 7);
                    anonymousClass064.LJIJJ(0.0f, R.id.mh7);
                    anonymousClass745.LJZI.setTextAlignment(5);
                }
                if (width < LIZJ) {
                    anonymousClass064.LJIILL(R.id.mh7).LIZLLL.LJJJJLI = LIZJ;
                }
                anonymousClass064.LJI(R.id.l8c, 6);
                anonymousClass064.LJI(R.id.l8c, 7);
                anonymousClass064.LJI(R.id.mh7, 7);
                anonymousClass064.LJIIIZ(R.id.l8c, 6, R.id.mh7, 7, C32151Nz.LJIILLIIL(8));
                anonymousClass064.LJIIIIZZ(R.id.mh7, 7, R.id.l8c, 6);
                anonymousClass064.LJIIIIZZ(R.id.l8c, 7, R.id.e1x, 6);
                anonymousClass064.LIZIZ((ConstraintLayout) anonymousClass745.LJLILLLLZI);
                return;
            case 6:
                Activity activity = (Activity) this.LJLILLLLZI;
                activity.getClass();
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIIZZ(R.string.piy);
                c26045AKb.LJIIJ();
                return;
            case 7:
                DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) this.LJLILLLLZI;
                detailFragmentPanel.LJLIL(detailFragmentPanel.getCurrentAweme());
                return;
            case 8:
                BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) this.LJLILLLLZI;
                C80796VnM c80796VnM = baseListFragmentPanel.mViewPager;
                if (c80796VnM != null && c80796VnM.getOffscreenPageLimit() == 0) {
                    baseListFragmentPanel.mViewPager.setOffscreenPageLimit(1);
                    return;
                }
                return;
            case 9:
                ITG itg = (ITG) this.LJLILLLLZI;
                itg.getClass();
                Object[] objArr = new Object[3];
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("os_volume:");
                IZL izl = itg.LIZ.LIZIZ;
                float f2 = -1.0f;
                if (izl != null) {
                    f = izl.LJJJJLI();
                } else {
                    f = -1.0f;
                }
                LIZ.append(f);
                objArr[0] = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("player_volume:");
                IZL izl2 = itg.LIZ.LIZIZ;
                if (izl2 != null) {
                    f2 = izl2.LJLZ;
                }
                LIZ2.append(f2);
                objArr[1] = X1D.LIZIZ(LIZ2);
                objArr[2] = itg.LIZ.LJI;
                SimRadar.keyScan("SimplifyPlayerImpl", "keyConfig", objArr);
                return;
            case 10:
                ((VideoRecordPermissionActivity) this.LJLILLLLZI).LLIIIILZ();
                return;
            default:
                Context context = (Context) this.LJLILLLLZI;
                if (C38566FBq.LIZ == 0) {
                    QQQ.LIZJ(context).onPause();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC23230vf(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
