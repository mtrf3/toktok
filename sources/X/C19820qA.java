package X;

import android.os.Handler;
import com.bytedance.android.common.setting.ShowLowPerformanceTipsDuration;
import com.bytedance.android.livesdk.livesetting.broadcast.PerLiveShowMaxNumberSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.GameLiveFloatBallTipsUpdateEvent;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* renamed from: X.0qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19820qA {
    public static final int LJFF = PerLiveShowMaxNumberSetting.INSTANCE.getValue();
    public static final long LJI = ShowLowPerformanceTipsDuration.INSTANCE.getDuration() * 1000;
    public final DataChannel LIZ;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public final AtomicLong LIZJ = new AtomicLong(0);
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final C19790q7 LJ = new C19790q7();

    public C19820qA(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(EnumC18150nT type, long j, boolean z) {
        int i;
        String tipContent;
        String str;
        C19790q7 c19790q7 = this.LJ;
        synchronized (c19790q7) {
            o.LJIIIZ(type, "type");
            int i2 = C19780q6.LIZ[type.ordinal()];
            i = 0;
            if (i2 == 1) {
                C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.O2;
                c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
                c19790q7.LJ.set(true);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        c19790q7.LIZLLL = false;
                    }
                } else {
                    c19790q7.LIZIZ = false;
                }
            } else {
                c19790q7.LIZJ = false;
            }
        }
        int[] iArr = C19810q9.LIZIZ;
        int i3 = iArr[type.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        i = EnumC264412a.LIVE_TIP_SAVE_MODE_TIPS.ordinal();
                    }
                } else {
                    i = EnumC264412a.LIVE_TIP_HIGH_TEMPERATURE_TIPS.ordinal();
                }
            } else {
                i = EnumC264412a.LIVE_TIP_LOW_BATTERY_TIPS.ordinal();
            }
        } else {
            i = EnumC264412a.LIVE_TIP_LOW_DEVICE_TIPS.ordinal();
        }
        int i4 = iArr[type.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        tipContent = "";
                    } else {
                        tipContent = C15380j0.LJIILJJIL(R.string.n1j);
                    }
                } else {
                    tipContent = C15380j0.LJIILJJIL(R.string.n1o);
                }
            } else {
                tipContent = C15380j0.LJIILJJIL(R.string.n1c);
            }
        } else {
            tipContent = C15380j0.LJIILJJIL(R.string.n1d);
        }
        o.LJIIIIZZ(tipContent, "tipContent");
        this.LIZ.qv0(GameLiveFloatBallTipsUpdateEvent.class, new C1X1(i, tipContent));
        DataChannel dataChannel = this.LIZ;
        int i5 = iArr[type.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        str = "";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str = "2";
                }
            } else {
                str = "1";
            }
        } else {
            str = "3";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_performance_window_show");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, dataChannel)).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        C06490Nh.LIZLLL(LIZ, str, "type", "overlay", "position");
        if (z) {
            this.LIZLLL.getAndAdd(1);
            this.LIZJ.set(System.currentTimeMillis());
        }
    }
}
