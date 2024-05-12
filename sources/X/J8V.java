package X;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.b1;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class J8V implements InterfaceC75414Tik, C07G {
    public static PlayerTypeAbConfig LJLIL = null;
    public static Boolean LJLILLLLZI = null;
    public static String LJLJI = null;
    public static int LJLJJI = -1;
    public static boolean LJLJJL = true;
    public static boolean LJLJJLL = false;
    public static String LJLJL = null;
    public static int LJLJLJ = -1;
    public static boolean LJLJLLL = true;

    public static boolean LJIIL() {
        try {
            if (LJLJI == null) {
                LJLJI = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            LJLJI = null;
        }
        if (LJLJI != null && LJLJI.toLowerCase().startsWith("mt")) {
            return true;
        }
        return false;
    }

    public static TIF LJFF() {
        EnumC44267HYx requestSource = EnumC44267HYx.MANUAL_SET;
        o.LJIIIZ(requestSource, "requestSource");
        return new TIF(null, -1, requestSource, null);
    }

    public static int LJIIIZ() {
        return C00F.LIZ(31744, 0, "player_vc_strategy_delay_opt", true);
    }

    public static final boolean LIZLLL() {
        if (a.LJIILL().LIZIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL() {
        if (C36152EGu.LJ()) {
            return ((Boolean) C33839DPv.LIZJ.getValue()).booleanValue();
        }
        if (C00F.LIZ(31744, 0, "player_preload_v3", true) != 1) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "play";
        }
        StringBuilder LIZJ = b1.LIZJ(str, "_");
        int i = LJLJLJ + 1;
        LJLJLJ = i;
        LIZJ.append(i);
        return X1D.LIZIZ(LIZJ);
    }

    public static final C145995oB LJII(AVETParameter aVETParameter) {
        String str;
        String str2;
        String str3;
        String contentType;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (aVETParameter == null || (str = aVETParameter.getCreationId()) == null) {
            str = "";
        }
        c145995oB.LJI("creation_id", str);
        if (aVETParameter == null || (str2 = aVETParameter.getShootWay()) == null) {
            str2 = "";
        }
        c145995oB.LJI("shoot_way", str2);
        if (aVETParameter == null || (str3 = aVETParameter.getContentSource()) == null) {
            str3 = "";
        }
        c145995oB.LJI("content_source", str3);
        if (aVETParameter != null && (contentType = aVETParameter.getContentType()) != null) {
            str4 = contentType;
        }
        c145995oB.LJI("content_type", str4);
        c145995oB.LJI("placeholder_enter_from", "video_edit_page");
        return c145995oB;
    }

    public static final Fragment LJIIIIZZ(LifecycleOwner current) {
        o.LJIIIZ(current, "current");
        if (current instanceof Fragment) {
            return (Fragment) current;
        }
        if (current instanceof ActivityC45651qj) {
            return null;
        }
        if (current instanceof C91Z) {
            Fragment Ks0 = ((C91Z) current).Ks0();
            if (Ks0 != null) {
                return LJIIIIZZ(Ks0);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static String LJIIJ(Video video) {
        VideoUrlModel playAddr;
        if (video != null && (playAddr = video.getPlayAddr()) != null) {
            if (playAddr.getSourceId() == null) {
                return "nullid";
            }
            return playAddr.getSourceId();
        }
        return "null";
    }

    public static boolean LJIIJJI(boolean z) {
        if (LJLIL == null) {
            LJLIL = C47285Ih7.LIZ();
        }
        PlayerTypeAbConfig playerTypeAbConfig = LJLIL;
        if (playerTypeAbConfig == null) {
            return false;
        }
        if (z) {
            if (playerTypeAbConfig.bytevc1DecodeType != 1) {
                return false;
            }
        } else if (playerTypeAbConfig.h264DecodeType != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    public static int LIZJ(VideoUrlModel videoUrlModel, IYN iyn) {
        if (iyn != null && (iyn.getHdrType() == 1 || iyn.getHdrType() == 2)) {
            return 1;
        }
        if (videoUrlModel != null && videoUrlModel.isHaveHdr() && iyn != null && iyn.getHdrType() == 0) {
            return -1;
        }
        return 0;
    }

    public static final void LJIILJJIL(MutableLiveData mutableLiveData, Object obj) {
        o.LJIIIZ(mutableLiveData, "<this>");
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto replyInvite error = ");
        LIZ.append(error);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "MultiRefuseManager");
    }

    @Override // X.C07G
    public void LIZ(C45631qh v, int i, int i2, int i3, int i4) {
        o.LJIIIZ(v, "v");
        throw null;
    }

    public static TID LJI(Effect createSelectedRequest, int i, EnumC44267HYx enumC44267HYx, List list, Bundle bundle, InterfaceC74398THu interfaceC74398THu, InterfaceC43949HMr interfaceC43949HMr, int i2, boolean z, TNY tny, int i3) {
        boolean z2 = z;
        int i4 = i2;
        EnumC44267HYx requestSource = enumC44267HYx;
        int i5 = i;
        List autoDownload = list;
        Bundle bundle2 = bundle;
        InterfaceC74398THu interfaceC74398THu2 = interfaceC74398THu;
        InterfaceC43949HMr interfaceC43949HMr2 = interfaceC43949HMr;
        if ((i3 & 1) != 0) {
            i5 = -1;
        }
        if ((i3 & 2) != 0) {
            requestSource = EnumC44267HYx.UI_CLICK;
        }
        if ((i3 & 4) != 0) {
            autoDownload = C61878OQg.INSTANCE;
        }
        TNY tny2 = null;
        if ((i3 & 8) != 0) {
            bundle2 = null;
        }
        if ((i3 & 16) != 0) {
            interfaceC74398THu2 = null;
        }
        if ((i3 & 32) != 0) {
            interfaceC43949HMr2 = null;
        }
        if ((i3 & 64) != 0) {
            i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if ((i3 & 128) != 0) {
            z2 = true;
        }
        if ((i3 & 256) == 0) {
            tny2 = tny;
        }
        o.LJIIIZ(createSelectedRequest, "$this$createSelectedRequest");
        o.LJIIIZ(requestSource, "requestSource");
        o.LJIIIZ(autoDownload, "autoDownload");
        return new TID(createSelectedRequest, i5, requestSource, autoDownload, bundle2, interfaceC74398THu2, interfaceC43949HMr2, i4, z2, tny2);
    }
}
