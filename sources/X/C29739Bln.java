package X;

import Y.ARunnableS41S0100000_5;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import q03.IDaS485S0100000_5;

/* renamed from: X.Bln, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29739Bln extends C29740Blo {
    public final ViewGroup LJIIIZ;
    public final ViewGroup LJIIJ;
    public final InterfaceC29736Blk LJIIJJI;
    public final LifecycleOwner LJIIL;
    public final DataChannel LJIILIIL;
    public final ImageView LJIILJJIL;
    public final ImageView LJIILL;
    public final C47121t6 LJIILLIIL;
    public final C47121t6 LJIIZILJ;
    public final C29701Eo LJIJ;
    public AnimatorSet LJIJI;
    public AnimatorSet LJIJJ;

    @Override // X.InterfaceC29734Bli
    public final void LJFF() {
    }

    @Override // X.InterfaceC29734Bli
    public final View LJI() {
        return null;
    }

    @Override // X.InterfaceC29734Bli
    public final View LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC29734Bli
    public final void LJIIJ() {
    }

    @Override // X.C29740Blo
    public final void LIZ() {
        DataChannel dataChannel = this.LJIILIIL;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJIIL, FansClubEvent.class, new AqS171S0100000_5(this, 793));
        }
    }

    public final void LJIIJJI() {
        long j;
        KL2.LJIILLIIL(4, this.LJIILL);
        KL2.LJIILLIIL(8, this.LJIIZILJ);
        KL2.LJIILLIIL(0, this.LJIILLIIL);
        C29750Bly c29750Bly = this.LIZLLL;
        if (c29750Bly != null) {
            j = c29750Bly.LJII;
        } else {
            j = 0;
        }
        LJIIL(j);
    }

    @Override // X.InterfaceC29734Bli
    public final void onRelease() {
        C29701Eo c29701Eo = this.LJIJ;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        AnimatorSet animatorSet = this.LJIJI;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJIJI;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.LJIJI;
            if (animatorSet3 != null) {
                C16880lQ.LJLJJL(animatorSet3);
            }
        }
        this.LIZLLL = null;
        this.LJII = false;
        try {
            LiveDialogFragment liveDialogFragment = this.LJI;
            if (liveDialogFragment != null) {
                liveDialogFragment.dismiss();
            }
            this.LJI = null;
        } catch (Throwable unused) {
        }
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static void LIZLLL(View view) {
        Context context;
        C32364Cn2 c32364Cn2 = new C32364Cn2("aweme://roma_redirect/?");
        c32364Cn2.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c32364Cn2.LIZJ("roma_page_key", "roma_schema_page_anchor_main");
        c32364Cn2.LIZJ("show_entrance", "entrance");
        if (view != null && (context = view.getContext()) != null) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(c32364Cn2.LIZLLL()));
        }
    }

    @Override // X.InterfaceC29734Bli
    public final void LJII(Object obj) {
        EnumC29732Blg enumC29732Blg;
        int i;
        double d;
        long j;
        if (obj instanceof EnumC29732Blg) {
            enumC29732Blg = (EnumC29732Blg) obj;
        } else {
            enumC29732Blg = null;
        }
        if (this.LIZJ == enumC29732Blg) {
            return;
        }
        InterfaceC29736Blk interfaceC29736Blk = this.LJIIJJI;
        if (interfaceC29736Blk != null) {
            C29727Blb c29727Blb = (C29727Blb) interfaceC29736Blk;
            if (enumC29732Blg instanceof EnumC29732Blg) {
                c29727Blb.LJIIL = enumC29732Blg;
            }
        }
        this.LIZJ = enumC29732Blg;
        if (enumC29732Blg == null) {
            i = -1;
        } else {
            i = C29733Blh.LIZ[enumC29732Blg.ordinal()];
        }
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                LJIIJJI();
            }
        } else {
            try {
                Double LIZ = InterfaceC30442Bx8.n2.LIZ();
                if (LIZ != null) {
                    d = LIZ.doubleValue();
                } else {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                if (((int) d) <= 2) {
                    this.LJII = true;
                    KL2.LJIILLIIL(4, this.LJIILJJIL);
                    KL2.LJIILLIIL(0, this.LJIILL);
                    KL2.LJIILLIIL(4, this.LJIILLIIL);
                    KL2.LJIILLIIL(8, this.LJIIZILJ);
                    C29750Bly c29750Bly = this.LIZLLL;
                    if (c29750Bly != null) {
                        j = c29750Bly.LJII;
                    } else {
                        j = 0;
                    }
                    LJIIL(j);
                    Handler handler = this.LJ;
                    if (handler != null) {
                        handler.postDelayed(new ARunnableS41S0100000_5(this, 299), this.LJIIIIZZ);
                    }
                }
            } catch (Exception unused) {
            }
            LJIIJJI();
            Handler handler2 = this.LJ;
            if (handler2 != null) {
                handler2.postDelayed(new ARunnableS41S0100000_5(this, 300), this.LJIIIIZZ);
            }
        }
        LIZJ("anchor", true, false, this.LJII);
    }

    public final void LJIIL(long j) {
        C47121t6 c47121t6 = this.LJIILLIIL;
        if (c47121t6 == null) {
            return;
        }
        String LJIILIIL = b.LJIILIIL(j);
        o.LJIIIIZZ(LJIILIIL, "getDisplayCountFloor(fansCount)");
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String upperCase = LJIILIIL.toUpperCase(ENGLISH);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        c47121t6.setText(upperCase);
    }

    public C29739Bln(ViewGroup rootView, ViewGroup viewGroup, InterfaceC29736Blk interfaceC29736Blk, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        ImageView imageView;
        ImageView imageView2;
        C47121t6 c47121t6;
        C47121t6 c47121t62;
        C29701Eo c29701Eo;
        Room room;
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIIIZ = rootView;
        this.LJIIJ = viewGroup;
        this.LJIIJJI = interfaceC29736Blk;
        this.LJIIL = lifecycleOwner;
        this.LJIILIIL = dataChannel;
        this.LIZ = true;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.exp);
        } else {
            imageView = null;
        }
        this.LJIILJJIL = imageView;
        if (viewGroup != null) {
            imageView2 = (ImageView) viewGroup.findViewById(R.id.f2w);
        } else {
            imageView2 = null;
        }
        this.LJIILL = imageView2;
        if (viewGroup != null) {
            c47121t6 = (C47121t6) viewGroup.findViewById(R.id.lzp);
        } else {
            c47121t6 = null;
        }
        this.LJIILLIIL = c47121t6;
        if (viewGroup != null) {
            c47121t62 = (C47121t6) viewGroup.findViewById(R.id.lzo);
        } else {
            c47121t62 = null;
        }
        this.LJIIZILJ = c47121t62;
        if (viewGroup != null) {
            viewGroup.findViewById(R.id.g1o);
            c29701Eo = (C29701Eo) viewGroup.findViewById(R.id.f30);
        } else {
            c29701Eo = null;
        }
        this.LJIJ = c29701Eo;
        if (interfaceC29736Blk != null && c47121t62 != null) {
            c47121t62.setBackgroundResource(R.drawable.chr);
        }
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
            this.LIZLLL = iFansClubService != null ? iFansClubService.yD(room.getOwner()) : null;
        }
        if (viewGroup != null) {
            C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 5), viewGroup);
        }
    }
}
