package Y;

import X.AbstractC261010s;
import X.AnonymousClass085;
import X.AnonymousClass140;
import X.AnonymousClass141;
import X.AnonymousClass291;
import X.C04020Du;
import X.C04360Fc;
import X.C04740Go;
import X.C08C;
import X.C0GY;
import X.C0RG;
import X.C0VW;
import X.C0WN;
import X.C10610bJ;
import X.C12F;
import X.C16880lQ;
import X.C1QC;
import X.C20480rE;
import X.C274816a;
import X.C28651An;
import X.C28711At;
import X.C28721Au;
import X.C28771Az;
import X.C30522ByQ;
import X.C36241bY;
import X.C36251bZ;
import X.C36581c6;
import X.C37161d2;
import X.C37661dq;
import X.C43731nd;
import X.C76L;
import X.CWR;
import X.InterfaceC026608o;
import X.InterfaceC28232B6e;
import X.RunnableC09050Xd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment;
import com.bytedance.android.livesdk.model.message.PartnershipDropsUpdateMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ThreadPoolExecutor;
import v5.n;

/* loaded from: classes.dex */
public class IDRunnableS2S0300000 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            boolean booleanExtra = ((Intent) this.l0).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = ((Intent) this.l0).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = ((Intent) this.l0).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = ((Intent) this.l0).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)});
            LIZ.getClass();
            C20480rE.LIZ((Context) this.l1, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
            C20480rE.LIZ((Context) this.l1, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
            C20480rE.LIZ((Context) this.l1, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
            C20480rE.LIZ((Context) this.l1, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
        } finally {
            ((BroadcastReceiver.PendingResult) this.l2).finish();
        }
    }

    public final void LIZ$1() {
        AnonymousClass291 anonymousClass291;
        C04740Go c04740Go = (C04740Go) this.l2;
        C0GY c0gy = (C0GY) this.l0;
        C0GY c0gy2 = c04740Go.LJLILLLLZI;
        if (c0gy2 == null || c0gy2 != c0gy) {
            return;
        }
        try {
            C274816a LIZIZ = C04360Fc.LIZIZ(c0gy);
            C0GY c0gy3 = (C0GY) this.l0;
            anonymousClass291 = new AnonymousClass291(c04740Go, LIZIZ, c0gy3.LJII, c0gy3);
        } catch (Throwable unused) {
            anonymousClass291 = null;
        }
        C04740Go c04740Go2 = (C04740Go) this.l2;
        C0GY c0gy4 = (C0GY) this.l0;
        C0GY c0gy5 = c04740Go2.LJLILLLLZI;
        if (c0gy5 == null || c0gy5 != c0gy4) {
            return;
        }
        if (C04020Du.LIZIZ == null) {
            C04020Du.LIZIZ = new Handler(C16880lQ.LLJJJJ());
        }
        C04020Du.LIZIZ.post(new IDRunnableS29S0200000(anonymousClass291, this, 15));
    }

    public final void LIZ$2() {
        RecyclerView recyclerView = (RecyclerView) ((LiveVoiceEffectDialogFragment) this.l0)._$_findCachedViewById(R.id.j_r);
        LiveVoiceEffectDialogFragment liveVoiceEffectDialogFragment = (LiveVoiceEffectDialogFragment) this.l0;
        int i = 0;
        List<Object> list = ((C1QC) ListProtector.get(((C37161d2) ((AbstractC261010s) this.l1)).LIZ, 0)).LJLILLLLZI;
        LiveEffect liveEffect = (LiveEffect) this.l2;
        liveVoiceEffectDialogFragment.getClass();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C30522ByQ c30522ByQ = LiveEffect.Companion;
            LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(list, i2);
            c30522ByQ.getClass();
            if (C30522ByQ.LIZ(liveEffect2, liveEffect)) {
                i = i2;
                break;
            }
            i2++;
        }
        recyclerView.LJLIL(i);
    }

    public final void LIZ$3() {
        try {
            ((C76L) this.l0).get();
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Starting work for %s", new Object[]{((RunnableC09050Xd) this.l2).LJLJJI.LIZJ});
            LIZ.getClass();
            RunnableC09050Xd runnableC09050Xd = (RunnableC09050Xd) this.l2;
            runnableC09050Xd.LJLZ = runnableC09050Xd.LJLJJL.LJ();
            ((C43731nd) this.l1).LJIIJ(((RunnableC09050Xd) this.l2).LJLZ);
        } catch (Throwable th) {
            ((C43731nd) this.l1).LJIIIZ(th);
        }
    }

    public static final void run$0(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            AlertController.LIZJ(((AlertController) iDRunnableS2S0300000.l2).LJIL, (View) iDRunnableS2S0300000.l0, (View) iDRunnableS2S0300000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            AlertController.LIZJ(((AlertController) iDRunnableS2S0300000.l2).LJI, (View) iDRunnableS2S0300000.l0, (View) iDRunnableS2S0300000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            iDRunnableS2S0300000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            iDRunnableS2S0300000.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            InterfaceC28232B6e interfaceC28232B6e = (InterfaceC28232B6e) iDRunnableS2S0300000.l0;
            if (interfaceC28232B6e != null) {
                GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget = (GamePartnershipAudiencePromoteGameCardWidget) iDRunnableS2S0300000.l1;
                interfaceC28232B6e.LIZ(gamePartnershipAudiencePromoteGameCardWidget.context, ((PartnershipDropsUpdateMessage) iDRunnableS2S0300000.l2).dropsId, gamePartnershipAudiencePromoteGameCardWidget.LJLJJL, gamePartnershipAudiencePromoteGameCardWidget.dataChannel, "im_update");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            C36581c6 c36581c6 = (C36581c6) iDRunnableS2S0300000.l0;
            if (c36581c6 != null && c36581c6.LIZIZ()) {
                ((n) iDRunnableS2S0300000.l1).LIZ();
            } else {
                try {
                    try {
                        ((n) iDRunnableS2S0300000.l1).LIZJ(((Callable) iDRunnableS2S0300000.l2).call());
                    } catch (CancellationException unused) {
                        ((n) iDRunnableS2S0300000.l1).LIZ();
                    }
                } catch (Exception e) {
                    ((n) iDRunnableS2S0300000.l1).LIZIZ(e);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            C37661dq c37661dq = (C37661dq) iDRunnableS2S0300000.l0;
            C12F c12f = (C12F) iDRunnableS2S0300000.l1;
            c12f.setParam((CWR) iDRunnableS2S0300000.l2);
            c37661dq.LJIJ(c12f);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            C37661dq c37661dq = (C37661dq) iDRunnableS2S0300000.l0;
            C12F c12f = (C12F) iDRunnableS2S0300000.l1;
            c12f.setParam((CWR) iDRunnableS2S0300000.l2);
            c37661dq.LJIJ(c12f);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        C28651An c28651An = (C28651An) iDRunnableS2S0300000.l0;
        final C08C c08c = (C08C) iDRunnableS2S0300000.l1;
        final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) iDRunnableS2S0300000.l2;
        c28651An.getClass();
        try {
            C28721Au LIZ = AnonymousClass085.LIZ(c28651An.LIZ);
            if (LIZ != null) {
                C28711At c28711At = (C28711At) LIZ.LIZ;
                synchronized (c28711At.LIZLLL) {
                    c28711At.LJFF = threadPoolExecutor;
                }
                LIZ.LIZ.LIZ(new C08C() { // from class: X.1As
                    @Override // X.C08C
                    public final void LIZ(Throwable th) {
                        try {
                            C08C.this.LIZ(th);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }

                    @Override // X.C08C
                    public final void LIZIZ(C08N c08n) {
                        try {
                            C08C.this.LIZIZ(c08n);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }
                });
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            c08c.LIZ(th);
            threadPoolExecutor.shutdown();
        }
    }

    public static final void run$3(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        boolean z;
        try {
            InterfaceC026608o interfaceC026608o = (InterfaceC026608o) iDRunnableS2S0300000.l0;
            Fragment fragment = (Fragment) iDRunnableS2S0300000.l1;
            C10610bJ c10610bJ = (C10610bJ) iDRunnableS2S0300000.l2;
            C28771Az c28771Az = (C28771Az) interfaceC026608o;
            c28771Az.getClass();
            synchronized (c10610bJ) {
                z = c10610bJ.LIZ;
            }
            if (!z) {
                c28771Az.LIZ.LJJLJ(fragment, c10610bJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        boolean z;
        try {
            InterfaceC026608o interfaceC026608o = (InterfaceC026608o) iDRunnableS2S0300000.l0;
            Fragment fragment = (Fragment) iDRunnableS2S0300000.l1;
            C10610bJ c10610bJ = (C10610bJ) iDRunnableS2S0300000.l2;
            C28771Az c28771Az = (C28771Az) interfaceC026608o;
            c28771Az.getClass();
            synchronized (c10610bJ) {
                z = c10610bJ.LIZ;
            }
            if (!z) {
                c28771Az.LIZ.LJJLJ(fragment, c10610bJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            iDRunnableS2S0300000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            iDRunnableS2S0300000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            ((StickerEffectViewModel) iDRunnableS2S0300000.l0).mv0((LiveEffect) iDRunnableS2S0300000.l1, (C0WN) iDRunnableS2S0300000.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            C0RG c0rg = (C0RG) iDRunnableS2S0300000.l2;
            C36241bY c36241bY = (C36241bY) iDRunnableS2S0300000.l0;
            AnonymousClass140 anonymousClass140 = (AnonymousClass140) iDRunnableS2S0300000.l1;
            c0rg.getClass();
            C0RG.LIZ(c36241bY, anonymousClass140);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(IDRunnableS2S0300000 iDRunnableS2S0300000) {
        boolean LIZ;
        try {
            C0RG c0rg = (C0RG) iDRunnableS2S0300000.l2;
            C36251bZ c36251bZ = (C36251bZ) iDRunnableS2S0300000.l0;
            AnonymousClass141 anonymousClass141 = (AnonymousClass141) iDRunnableS2S0300000.l1;
            c0rg.getClass();
            C0RG.LIZIZ(c36251bZ, anonymousClass141);
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS2S0300000(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
