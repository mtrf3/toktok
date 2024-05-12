package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.dataChannel.AudienceCustomToolBarAnimatorStart;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowCustomPollToolBarAlert;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCustomPollMigrateShortTouchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C16 extends C1E1 {
    public final DataChannel LIZ;
    public final EnumC30212BtQ LIZIZ;
    public final InterfaceC30237Btp LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public EnumC29605Bjd LJIIIZ;
    public final Handler LJIIJ;
    public final C15540jG LJIIJJI;
    public final C15540jG LJIIL;

    public final C47061t0 LJI() {
        return (C47061t0) this.LJII.getValue();
    }

    public final C47061t0 LJII() {
        return (C47061t0) this.LJI.getValue();
    }

    public final void LJIIIIZZ() {
        this.LJIIJ.removeCallbacksAndMessages(null);
        this.LJIIIZ = EnumC29605Bjd.NONE;
        View view = (View) this.LJIIIIZZ.getValue();
        if (view != null) {
            C29306Beo.LJI(view);
        }
    }

    public final void LJIIIZ() {
        TextView textView;
        Room room;
        TextView textView2;
        EnumC30212BtQ enumC30212BtQ = this.LIZIZ;
        EnumC30212BtQ enumC30212BtQ2 = EnumC30212BtQ.SINGLE;
        V92 v92 = null;
        if (enumC30212BtQ == enumC30212BtQ2) {
            InterfaceC30237Btp interfaceC30237Btp = this.LIZJ;
            if (interfaceC30237Btp != null && (textView2 = (TextView) interfaceC30237Btp.LIZ(R.id.ldm)) != null) {
                textView2.setText(C15380j0.LJIILJJIL(R.string.oij));
            }
        } else {
            InterfaceC30237Btp interfaceC30237Btp2 = this.LIZJ;
            if (interfaceC30237Btp2 != null && (textView = (TextView) interfaceC30237Btp2.LIZ(R.id.ldm)) != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.lz1));
            }
        }
        View view = (View) this.LJFF.getValue();
        if (view != null) {
            C29306Beo.LJJLJLI(view);
        }
        C47061t0 LJII = LJII();
        if (LJII != null) {
            C29306Beo.LJI(LJII);
        }
        View view2 = (View) this.LJIIIIZZ.getValue();
        if (view2 != null) {
            C29306Beo.LJI(view2);
        }
        C47061t0 LJII2 = LJII();
        if (LJII2 != null) {
            v92 = LJII2.getHierarchy();
        }
        if (v92 != null) {
            v92.LJIILLIIL(0);
        }
        C47061t0 LJII3 = LJII();
        if (LJII3 != null) {
            C15540jG c15540jG = this.LJIIJJI;
            c15540jG.getClass();
            c15540jG.LIZ = LJII3;
        }
        if (!LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
            if (this.LIZIZ == enumC30212BtQ2) {
                C15540jG c15540jG2 = this.LJIIJJI;
                String LIZ = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                c15540jG2.getClass();
                c15540jG2.LIZIZ = LIZ;
                C15540jG c15540jG3 = this.LJIIJJI;
                c15540jG3.getClass();
                c15540jG3.LIZJ = "ttlive_toolbar_custom_poll.webp";
            } else {
                C15540jG c15540jG4 = this.LJIIJJI;
                String LIZ2 = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                c15540jG4.getClass();
                c15540jG4.LIZIZ = LIZ2;
                C15540jG c15540jG5 = this.LJIIJJI;
                c15540jG5.getClass();
                c15540jG5.LIZJ = "ttlive_toolbar_interaction.webp";
            }
            this.LJIIJJI.LIZIZ();
            C15540jG c15540jG6 = this.LJIIL;
            String LIZ3 = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
            c15540jG6.getClass();
            c15540jG6.LIZIZ = LIZ3;
            C15540jG c15540jG7 = this.LJIIL;
            c15540jG7.getClass();
            c15540jG7.LIZJ = "ttlive_custom_poll_mini_card.webp";
            this.LJIIL.LIZIZ();
            C47061t0 LJI = LJI();
            if (LJI != null) {
                LJI.getHierarchy().LJIILLIIL(0);
                C15540jG c15540jG8 = this.LJIIL;
                c15540jG8.getClass();
                c15540jG8.LIZ = LJI;
            }
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.lv0(dataChannel.LJLJJI, AudienceCustomToolBarAnimatorStart.class, new AqS171S0100000_5(this, 58));
                dataChannel.lv0(this.LIZ.LJLJJI, ShowCustomPollToolBarAlert.class, new AqS171S0100000_5(this, 59));
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                C30627C0h.LJIILLIIL(room.getId(), this);
            }
        }
    }

    public final void LJIIJ() {
        Room room;
        this.LJIIJ.removeCallbacksAndMessages(null);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            C30627C0h.LJIJ(room.getId(), this);
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZIZ(C04120Ee c04120Ee) {
        LJIIIIZZ();
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LJFF(C04120Ee c04120Ee) {
        if (c04120Ee.LJIIIIZZ == EnumC04110Ed.CANCEL && !C29306Beo.LJIIJ(this.LIZ)) {
            LJIIJJI(EnumC29605Bjd.CUSTOM_POLL);
        }
    }

    public final void LJIIJJI(EnumC29605Bjd enumC29605Bjd) {
        View LIZ;
        if (LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
            return;
        }
        this.LJIIJ.removeCallbacksAndMessages(null);
        this.LJIIIZ = enumC29605Bjd;
        InterfaceC30237Btp interfaceC30237Btp = this.LIZJ;
        if (interfaceC30237Btp != null && (LIZ = interfaceC30237Btp.LIZ(R.id.ld5)) != null) {
            LIZ.setVisibility(0);
        }
        this.LJIIJ.postDelayed(new ARunnableS41S0100000_5(this, 16), 10000L);
    }

    public C16(DataChannel dataChannel, EnumC30212BtQ type, InterfaceC30237Btp interfaceC30237Btp) {
        o.LJIIIZ(type, "type");
        this.LIZ = dataChannel;
        this.LIZIZ = type;
        this.LIZJ = interfaceC30237Btp;
        this.LJFF = C221108m2.LIZIZ(new AqS155S0100000_5(this, 22));
        this.LJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 21));
        this.LJII = C221108m2.LIZIZ(new AqS155S0100000_5(this, 20));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 19));
        this.LJIIIZ = EnumC29605Bjd.NONE;
        this.LJIIJ = new Handler(C16880lQ.LLJJJJ());
        C15540jG c15540jG = new C15540jG();
        c15540jG.LJFF = false;
        c15540jG.LJIIL = true;
        c15540jG.LJ = new C17(this);
        this.LJIIJJI = c15540jG;
        C15540jG c15540jG2 = new C15540jG();
        c15540jG2.LJFF = false;
        c15540jG2.LJIIL = true;
        c15540jG2.LJ = new C18(this);
        this.LJIIL = c15540jG2;
    }
}
