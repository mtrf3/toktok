package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEAudioBeatTracking;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141945he implements C56E {
    public final InterfaceC70422pa LIZ;
    public final Context LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C62822Ol8 LIZLLL;
    public XKQ LJ;
    public NLEAudioBeatTracking LJFF;
    public InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super List<Integer>, C76800UCe> LJI;
    public AVMusic LJII;
    public long LJIIIIZZ;

    @Override // X.C56E
    public final void LIZIZ() {
        if (this.LJ == null) {
            return;
        }
        NLEAudioBeatTracking nLEAudioBeatTracking = this.LJFF;
        if (nLEAudioBeatTracking != null) {
            NLEMediaPublicJniJNI.NLEAudioBeatTracking_notifyStop(nLEAudioBeatTracking.LIZ, nLEAudioBeatTracking);
        }
        XKQ xkq = this.LJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super List<Integer>, C76800UCe> interfaceC88473Ynt = this.LJI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Boolean.FALSE, Boolean.TRUE, C61878OQg.INSTANCE);
        }
        this.LJ = null;
        this.LJI = null;
        this.LJFF = null;
        long currentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
        AVMusic aVMusic = this.LJII;
        if (aVMusic != null) {
            LIZLLL(false, -1, aVMusic, EnumC141975hh.NONE, currentTimeMillis);
        }
        H7C.LJI(3, "music", null, "cancelGenerate: call");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super java.lang.String> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C141965hg
            if (r0 == 0) goto L92
            r7 = r10
            X.5hg r7 = (X.C141965hg) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r0 = r7.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r2 = r7.LJLJJI
            r5 = 0
            r6 = 2
            r1 = 1
            if (r2 == 0) goto L47
            if (r2 == r1) goto L72
            if (r2 != r6) goto L99
            boolean r3 = r7.LJLIL
            X.C141335gf.LIZJ(r0)
        L26:
            java.lang.String r0 = (java.lang.String) r0
        L28:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = "fetchAlgorithmModel2: isSuccess:"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = "  path:"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r3 = X.X1D.LIZIZ(r2)
            java.lang.String r2 = "music"
            r1 = 3
            X.H7C.LJI(r1, r2, r5, r3)
            return r0
        L47:
            X.C141335gf.LIZJ(r0)
            r7.LJLJJI = r1
            X.XKS r4 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r7)
            r4.<init>(r1, r0)
            r4.LJIIL()
            com.ss.android.ugc.effectmanager.DownloadableModelSupport r3 = com.ss.android.ugc.effectmanager.DownloadableModelSupport.getInstance()
            java.lang.String r0 = "bt_espresso_mobile_offline"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            X.5hi r1 = new X.5hi
            r1.<init>()
            r0 = 0
            r3.fetchResourcesWithModelNames(r0, r2, r1)
            java.lang.Object r0 = r4.LJIIJJI()
            if (r0 != r8) goto L75
            return r8
        L72:
            X.C141335gf.LIZJ(r0)
        L75:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            if (r3 == 0) goto L8f
            X.XIA r1 = X.C78613UtF.LIZJ
            X.5hf r0 = new X.5hf
            r0.<init>(r5)
            r7.LJLIL = r3
            r7.LJLJJI = r6
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r7)
            if (r0 != r8) goto L26
            return r8
        L8f:
            java.lang.String r0 = ""
            goto L28
        L92:
            X.5hg r7 = new X.5hg
            r7.<init>(r9, r10)
            goto L12
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141945he.LIZJ(X.2kd):java.lang.Object");
    }

    public C141945he(AudioBeatsPanelFragment scope, Context context, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(scope, "scope");
        this.LIZ = scope;
        this.LIZIZ = context;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = C221108m2.LIZIZ(C142015hl.LJLIL);
    }

    @Override // X.C56E
    public final void LIZ(NLESegmentAudio nLESegmentAudio, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22, IDqS427S0100000_2 iDqS427S0100000_2) {
        this.LJI = iDqS427S0100000_2;
        this.LJ = XKX.LIZLLL(this.LIZ, C36636EZk.LIZ, null, new C141935hd(aqS152S0100000_2, this, iDqS427S0100000_2, aqS152S0100000_22, nLESegmentAudio, null), 2);
    }

    public static void LIZLLL(boolean z, int i, AVMusic aVMusic, EnumC141975hh enumC141975hh, long j) {
        String str;
        C145995oB c145995oB = new C145995oB();
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c145995oB.LJI("status", str);
        c145995oB.LJI("music_id", aVMusic.getMusicId());
        c145995oB.LJI("music_name", aVMusic.musicName);
        c145995oB.LIZ(aVMusic.getDuration(), "music_duration");
        c145995oB.LJI("duration", String.valueOf(j));
        String str2 = "";
        if (!z) {
            if (i != -3) {
                if (i != -2) {
                    if (i == -1) {
                        str2 = "user_cancel";
                    }
                } else {
                    str2 = "net_error";
                }
            } else {
                str2 = "algorithm_error";
            }
            c145995oB.LIZLLL("error_msg", str2);
        } else {
            int i2 = C141995hj.LIZ[enumC141975hh.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str2 = "local_algorithm";
                    }
                } else {
                    str2 = "music_info";
                }
            } else {
                str2 = "local_cache";
            }
            c145995oB.LIZLLL("get_from", str2);
        }
        FMX.LJIIL("auto_beat_loading_success", c145995oB.LIZ);
    }
}
