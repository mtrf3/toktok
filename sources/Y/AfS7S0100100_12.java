package Y;

import X.A90;
import X.C239149a2;
import X.C30868C9o;
import X.C72152STk;
import X.C72153STl;
import X.C72164STw;
import X.C72991Skl;
import X.C73078SmA;
import X.EnumC72154STm;
import X.EnumC72156STo;
import X.InterfaceC64592gB;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.ResponseQuickGenerate;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.ScheduleAutoDownloadData;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;

/* loaded from: classes13.dex */
public class AfS7S0100100_12 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        Boolean bool;
        ScheduleAutoDownloadData scheduleAutoDownloadData;
        ScheduleAutoDownloadResponse scheduleAutoDownloadResponse = (ScheduleAutoDownloadResponse) obj;
        ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0).LL = false;
        if (scheduleAutoDownloadResponse != null && (scheduleAutoDownloadData = scheduleAutoDownloadResponse.data) != null) {
            bool = Boolean.valueOf(scheduleAutoDownloadData.scheduleSuccess);
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0).Jl("livesdk_live_replay_download_schedule_succeed", null);
            ((C239149a2) ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0)._$_findCachedViewById(R.id.g0f)).LIZJ();
            C73078SmA.LIZ(afS7S0100100_12.j1, "");
            ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0).Hl(R.string.mal);
            return;
        }
        ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0).Hl(R.string.ma_);
    }

    public static final void accept$1(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0).Jl("livesdk_live_replay_download_schedule_cancel", null);
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0;
        liveReplayVideoPlayerDialogFragment.LL = false;
        ((C239149a2) liveReplayVideoPlayerDialogFragment._$_findCachedViewById(R.id.g0f)).LIZIZ();
        C73078SmA.LIZIZ(afS7S0100100_12.j1);
        ((LiveReplayVideoPlayerDialogFragment) afS7S0100100_12.l0).Hl(R.string.mar);
    }

    public static final void accept$2(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        if (!((LiveReplayVideoClipActivity) afS7S0100100_12.l0).LL.isEmpty()) {
            C30868C9o.LIZJ(R.string.nxe);
        }
        C72991Skl.LIZIZ("fail", String.valueOf(afS7S0100100_12.j1));
        A90 a90 = ((LiveReplayVideoClipActivity) afS7S0100100_12.l0).LJLLL;
        if (a90 != null) {
            a90.dismiss();
        }
        ((LinkedHashMap) ((LiveReplayVideoClipActivity) afS7S0100100_12.l0).LL).clear();
    }

    public static final void accept$3(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        Integer num;
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) obj;
        ((C72152STk) afS7S0100100_12.l0).aigcResult = responseQuickGenerate;
        if (responseQuickGenerate != null && responseQuickGenerate.status_code == 0) {
            C72164STw.LIZ(EnumC72154STm.AIGC_NET_GEN_MORE, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - afS7S0100100_12.j1), null, null, null, 56);
        } else {
            EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_GEN_MORE;
            EnumC72156STo enumC72156STo = EnumC72156STo.FAIL;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - afS7S0100100_12.j1);
            ResponseQuickGenerate responseQuickGenerate2 = ((C72152STk) afS7S0100100_12.l0).aigcResult;
            String str = null;
            if (responseQuickGenerate2 != null) {
                num = Integer.valueOf(responseQuickGenerate2.status_code);
            } else {
                num = null;
            }
            String valueOf2 = String.valueOf(num);
            ResponseQuickGenerate responseQuickGenerate3 = ((C72152STk) afS7S0100100_12.l0).aigcResult;
            if (responseQuickGenerate3 != null) {
                str = responseQuickGenerate3.status_msg;
            }
            C72164STw.LIZ(enumC72154STm, enumC72156STo, valueOf, null, valueOf2, str, 8);
        }
        ((C72152STk) afS7S0100100_12.l0).LIZ();
    }

    public static final void accept$4(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        C72164STw.LIZ(EnumC72154STm.AIGC_NET_GEN_MORE, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - afS7S0100100_12.j1), null, null, ((Throwable) obj).getMessage(), 24);
        ((C72152STk) afS7S0100100_12.l0).LIZ();
    }

    public static final void accept$5(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        Integer num;
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) obj;
        ((C72153STl) afS7S0100100_12.l0).aigcResult = responseQuickGenerate;
        if (responseQuickGenerate != null && responseQuickGenerate.status_code == 0) {
            C72164STw.LIZ(EnumC72154STm.AIGC_NET_FAST_GEN, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - afS7S0100100_12.j1), null, null, null, 56);
        } else {
            EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_FAST_GEN;
            EnumC72156STo enumC72156STo = EnumC72156STo.FAIL;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - afS7S0100100_12.j1);
            ResponseQuickGenerate responseQuickGenerate2 = ((C72153STl) afS7S0100100_12.l0).aigcResult;
            String str = null;
            if (responseQuickGenerate2 != null) {
                num = Integer.valueOf(responseQuickGenerate2.status_code);
            } else {
                num = null;
            }
            String valueOf2 = String.valueOf(num);
            ResponseQuickGenerate responseQuickGenerate3 = ((C72153STl) afS7S0100100_12.l0).aigcResult;
            if (responseQuickGenerate3 != null) {
                str = responseQuickGenerate3.status_msg;
            }
            C72164STw.LIZ(enumC72154STm, enumC72156STo, valueOf, null, valueOf2, str, 8);
        }
        ((C72153STl) afS7S0100100_12.l0).LIZ();
    }

    public static final void accept$6(AfS7S0100100_12 afS7S0100100_12, Object obj) {
        C72164STw.LIZ(EnumC72154STm.AIGC_NET_FAST_GEN, EnumC72156STo.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - afS7S0100100_12.j1), null, null, ((Throwable) obj).getMessage(), 24);
        ((C72153STl) afS7S0100100_12.l0).LIZ();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS7S0100100_12(long r2, X.C72152STk r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS7S0100100_12.<init>(long, X.STk, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS7S0100100_12(long r2, X.C72153STl r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS7S0100100_12.<init>(long, X.STl, int):void");
    }

    public AfS7S0100100_12(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
