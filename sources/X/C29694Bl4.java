package X;

import Y.ARunnableS41S0100000_5;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherBackgroundImageOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherMaskLayerOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerLayoutShouldFillSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerLayoutShouldNotFillSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerNewLayoutTopicIdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bl4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29694Bl4 implements InterfaceC28740BPs {
    public final Room LIZ;
    public final ObsBroadcastFragment LIZIZ;
    public final DataChannel LIZJ;
    public B35 LIZLLL;
    public View LJ;
    public C47061t0 LJFF;
    public C47061t0 LJI;
    public ViewOnClickListenerC29222BdS LJII;
    public boolean LJIIIIZZ;
    public C31482CXe LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;
    public final ActivityC45651qj LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.InterfaceC28740BPs
    public final void d(C28272B7s parameter) {
        o.LJIIIZ(parameter, "parameter");
    }

    @Override // X.InterfaceC28740BPs
    public final void f() {
    }

    @Override // X.InterfaceC28740BPs
    public final void g() {
    }

    @Override // X.InterfaceC28740BPs
    public final void h(String str) {
    }

    @Override // X.InterfaceC28740BPs
    public final void j() {
    }

    @Override // X.InterfaceC28740BPs
    public final void k() {
    }

    @Override // X.InterfaceC28740BPs
    public final void l(String str) {
    }

    @Override // X.InterfaceC28740BPs
    public final void m(long j, long j2) {
    }

    @Override // X.InterfaceC28740BPs
    public final void n() {
    }

    @Override // X.InterfaceC28740BPs
    public final void o() {
    }

    public final void LIZJ() {
        C47061t0 c47061t0;
        int LJIIIZ = KL2.LJIIIZ(this.LJIIL);
        if (LJIIIZ == 0) {
            return;
        }
        float LJIIJJI = KL2.LJIIJJI(this.LJIIL) / LJIIIZ;
        if (this.LIZ.background != null) {
            if (Build.VERSION.SDK_INT >= 23 && (c47061t0 = this.LJI) != null) {
                c47061t0.setForeground(null);
            }
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C15650jR.LIZ().LJIIIZ(this.LIZ.background).LJIIJJI(this.LJI);
                return;
            } else {
                C31665Cbl.LJ(this.LIZ.background, this.LJI);
                return;
            }
        }
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C78720Uuy LJIIIZ2 = C15650jR.LIZ().LJIIIZ(this.LIZ.getOwner().getAvatarThumb());
            LJIIIZ2.LJIILL = LJIIJJI;
            LJIIIZ2.LJIILLIIL = 5;
            LJIIIZ2.LJIIJJI(this.LJI);
            return;
        }
        C31665Cbl.LJFF(this.LJI, this.LIZ.getOwner().getAvatarThumb(), new C78739UvH(LJIIJJI));
    }

    public final void LIZLLL() {
        if (this.LJIIL != null) {
            ViewOnClickListenerC29222BdS viewOnClickListenerC29222BdS = this.LJII;
            if (viewOnClickListenerC29222BdS == null) {
                ActivityC45651qj activityC45651qj = this.LJIIL;
                o.LJI(activityC45651qj);
                List<String> list = this.LIZ.getStreamUrl().pushUrlList;
                o.LJIIIIZZ(list, "mRoom.streamUrl.pushUrlList");
                String str = (String) ORZ.LJLLLL(list);
                if (str == null) {
                    str = this.LIZ.getStreamUrl().LIZ();
                }
                viewOnClickListenerC29222BdS = new ViewOnClickListenerC29222BdS(activityC45651qj, this.LIZ, str);
            }
            this.LJII = viewOnClickListenerC29222BdS;
            C29306Beo.LJJJJIZL(viewOnClickListenerC29222BdS);
        }
    }

    @Override // X.InterfaceC28740BPs
    public final void c() {
        if (!this.LJIIIIZZ) {
            C29306Beo.LJJLJLI(this.LJFF);
            C29306Beo.LJJLJLI(this.LJ);
            C29306Beo.LJI(this.LJI);
        }
    }

    public final void LIZ(boolean z) {
        C73411SrX c73411SrX;
        ViewOnClickListenerC29222BdS viewOnClickListenerC29222BdS = this.LJII;
        if (viewOnClickListenerC29222BdS != null) {
            C29306Beo.LJJJJ(viewOnClickListenerC29222BdS);
        }
        if (z) {
            ViewOnClickListenerC29222BdS viewOnClickListenerC29222BdS2 = this.LJII;
            if (viewOnClickListenerC29222BdS2 != null && (c73411SrX = viewOnClickListenerC29222BdS2.LJLZ) != null && !c73411SrX.isDisposed()) {
                viewOnClickListenerC29222BdS2.LJLZ.dispose();
            }
            this.LJII = null;
        }
    }

    @Override // X.InterfaceC28740BPs
    public final void onError(Exception exc) {
        LIZIZ(-1, exc.toString());
        C29689Bkz.LIZ.LJIIL(new AqS171S0100000_5(exc, 861));
    }

    public final void LIZIZ(int i, String str) {
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        C29702BlC LIZJ = C18230nb.LIZJ("ttlive_play_obs_error");
        LIZJ.LJFF(Integer.valueOf(i), "error_code");
        LIZJ.LJII("error_msg", str);
        LIZJ.LJI(Long.valueOf(this.LIZ.getOwnerUserId()), "user_id");
        LIZJ.LJII("stream_data", this.LIZ.getMultiStreamData());
        LIZJ.LJIIIZ();
    }

    @Override // X.InterfaceC28740BPs
    public final void e(long j, long j2) {
        C29306Beo.LJI(this.LJFF);
        C29306Beo.LJI(this.LJ);
        C29306Beo.LJJLJLI(this.LJI);
        C11000bw c11000bw = this.LIZIZ.LJLLLLLL;
        if (c11000bw != null) {
            c11000bw.LJ();
            C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_start_play_obs_all");
            LIZLLL.LJI = true;
            LIZLLL.LJIIIZ();
            if (this.LJIIJ) {
                if (this.LJIILIIL) {
                    this.LJIILIIL = false;
                    C29689Bkz.LIZ.LJIIL(new AqS171S0100000_5(this, 862));
                    return;
                } else {
                    C29689Bkz.LIZ.LJIIL(C29693Bl3.LJLIL);
                    return;
                }
            }
            return;
        }
        o.LJIJI("mStatusService");
        throw null;
    }

    @Override // X.InterfaceC28740BPs
    public final void i(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        LIZIZ(i, errorMsg);
    }

    @Override // X.InterfaceC28740BPs
    public final void onVideoSizeChanged(int i, int i2) {
        FrameLayout.LayoutParams layoutParams;
        long j;
        int i3;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        V92 hierarchy;
        C47061t0 c47061t0;
        View view;
        View findViewById;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (i > i2) {
            C31482CXe c31482CXe = this.LJIIIZ;
            if (c31482CXe != null) {
                layoutParams2 = c31482CXe.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            int LJIIJJI = KL2.LJIIJJI(this.LJIIL);
            marginLayoutParams.width = LJIIJJI;
            marginLayoutParams.height = (i2 * LJIIJJI) / i;
            marginLayoutParams.topMargin = (int) KL2.LIZJ(this.LJIIL, 130.0f);
            C31482CXe c31482CXe2 = this.LJIIIZ;
            if (c31482CXe2 != null) {
                c31482CXe2.setLayoutParams(marginLayoutParams);
            }
            if (!this.LJIILJJIL) {
                if (!TtliveGameOtherMaskLayerOptimizeSetting.INSTANCE.showMaskLayer()) {
                    ActivityC45651qj activityC45651qj = this.LJIIL;
                    if (activityC45651qj != null) {
                        view = activityC45651qj.findViewById(R.id.eq5);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    ActivityC45651qj activityC45651qj2 = this.LJIIL;
                    if (activityC45651qj2 != null && (findViewById = activityC45651qj2.findViewById(R.id.if2)) != null) {
                        findViewById.setVisibility(8);
                    }
                }
                int value = TtliveGameOtherBackgroundImageOptimizeSetting.INSTANCE.getValue();
                if (value != 1) {
                    if (value != 2) {
                        LIZJ();
                    } else {
                        if (Build.VERSION.SDK_INT >= 23 && (c47061t0 = this.LJI) != null) {
                            c47061t0.setForeground(null);
                        }
                        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 338));
                    }
                } else {
                    C47061t0 c47061t02 = this.LJI;
                    if (c47061t02 != null && (hierarchy = c47061t02.getHierarchy()) != null) {
                        hierarchy.LJIILL(null, 1);
                    }
                    C47061t0 c47061t03 = this.LJI;
                    if (c47061t03 != null) {
                        c47061t03.setBackgroundColor(-16777216);
                    }
                }
                this.LJIILJJIL = true;
                return;
            }
            return;
        }
        C31482CXe c31482CXe3 = this.LJIIIZ;
        if (c31482CXe3 != null) {
            layoutParams3 = c31482CXe3.getLayoutParams();
        }
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams3) == null) {
            return;
        }
        boolean LJJIJIIJIL = ORY.LJJIJIIJIL(String.valueOf(this.LIZ.getOwnerUserId()), LivePlayerLayoutShouldFillSetting.INSTANCE.getValue());
        boolean LJJIJIIJIL2 = ORY.LJJIJIIJIL(String.valueOf(this.LIZ.getOwnerUserId()), LivePlayerLayoutShouldNotFillSetting.INSTANCE.getValue());
        long[] value2 = LivePlayerNewLayoutTopicIdSetting.INSTANCE.getValue();
        Long l = this.LIZ.hashtag.id;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        if (!ORY.LJJIJIIJI(j, value2) ? LJJIJIIJIL2 : !LJJIJIIJIL) {
            if (i > 0 && i2 > 0 && this.LJIIIZ != null) {
                C47061t0 c47061t04 = this.LJFF;
                if (c47061t04 != null) {
                    i3 = c47061t04.getHeight();
                } else {
                    i3 = 0;
                }
                int LJIIL = C15380j0.LJIIL();
                if (i3 > 0 && LJIIL > 0) {
                    float f = i;
                    float f2 = i2;
                    int i4 = (int) ((LJIIL / f) * f2);
                    int LIZJ = (int) KL2.LIZJ(this.LJIIL, 130.0f);
                    if (i4 + LIZJ <= i3) {
                        layoutParams.topMargin = LIZJ;
                        layoutParams.width = LJIIL;
                        layoutParams.height = i4;
                        layoutParams.gravity = 1;
                    } else if (i4 <= i3) {
                        layoutParams.topMargin = 0;
                        layoutParams.width = LJIIL;
                        layoutParams.height = i4;
                        layoutParams.gravity = 17;
                    } else {
                        layoutParams.topMargin = 0;
                        layoutParams.width = (int) ((i3 / f2) * f);
                        layoutParams.height = i3;
                        layoutParams.gravity = 1;
                    }
                }
            }
        }
        C31482CXe c31482CXe4 = this.LJIIIZ;
        if (c31482CXe4 != null) {
            c31482CXe4.setLayoutParams(layoutParams);
        }
        if (!this.LJIILJJIL) {
            LIZJ();
            this.LJIILJJIL = true;
        }
    }

    public C29694Bl4(Room room, ObsBroadcastFragment fragment, DataChannel dataChannel) {
        boolean z;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = room;
        this.LIZIZ = fragment;
        this.LIZJ = dataChannel;
        if (room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJ = z;
        this.LJIIL = fragment.mo49getActivity();
        this.LJIILIIL = true;
    }
}
