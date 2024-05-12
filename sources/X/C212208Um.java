package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.8Um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212208Um implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final C43I<Integer> LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final C43I<C76800UCe> LJLJJLL;
    public final C43I<C76800UCe> LJLJL;
    public final C43I<String> LJLJLJ;
    public final C43I<C76800UCe> LJLJLLL;
    public final C43I<C76800UCe> LJLL;
    public final C43I<C76800UCe> LJLLI;
    public final C43I<String> LJLLILLLL;
    public final C43I<String> LJLLJ;
    public final C43I<Float> LJLLL;
    public final Double LJLLLL;
    public final C43I<Long> LJLLLLLL;
    public final C43I<Aweme> LJLZ;
    public final C43I<C210108Mk> LJZ;
    public final C43I<C8LI> LJZI;
    public final C43I<String> LJZL;
    public final C43I<Boolean> LL;
    public final C43I<String> LLD;
    public final C43I<OSZ<String, Float>> LLF;
    public final C43I<String> LLFF;

    public C212208Um() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C212208Um)) {
            return false;
        }
        C212208Um c212208Um = (C212208Um) obj;
        return o.LJ(this.LJLIL, c212208Um.LJLIL) && o.LJ(this.LJLILLLLZI, c212208Um.LJLILLLLZI) && o.LJ(this.LJLJI, c212208Um.LJLJI) && o.LJ(this.LJLJJI, c212208Um.LJLJJI) && o.LJ(this.LJLJJL, c212208Um.LJLJJL) && o.LJ(this.LJLJJLL, c212208Um.LJLJJLL) && o.LJ(this.LJLJL, c212208Um.LJLJL) && o.LJ(this.LJLJLJ, c212208Um.LJLJLJ) && o.LJ(this.LJLJLLL, c212208Um.LJLJLLL) && o.LJ(this.LJLL, c212208Um.LJLL) && o.LJ(this.LJLLI, c212208Um.LJLLI) && o.LJ(this.LJLLILLLL, c212208Um.LJLLILLLL) && o.LJ(this.LJLLJ, c212208Um.LJLLJ) && o.LJ(this.LJLLL, c212208Um.LJLLL) && o.LJ(this.LJLLLL, c212208Um.LJLLLL) && o.LJ(this.LJLLLLLL, c212208Um.LJLLLLLL) && o.LJ(this.LJLZ, c212208Um.LJLZ) && o.LJ(this.LJZ, c212208Um.LJZ) && o.LJ(this.LJZI, c212208Um.LJZI) && o.LJ(this.LJZL, c212208Um.LJZL) && o.LJ(this.LL, c212208Um.LL) && o.LJ(this.LLD, c212208Um.LLD) && o.LJ(this.LLF, c212208Um.LLF) && o.LJ(this.LLFF, c212208Um.LLFF);
    }

    public final String toString() {
        return "VideoPlayState(playAnimationEvent=" + this.LJLIL + ", pauseAnimationEvent=" + this.LJLILLLLZI + ", stopAnimationEvent=" + this.LJLJI + ", livePauseAnimationEvent=" + this.LJLJJI + ", liveResumeAnimationEvent=" + this.LJLJJL + ", onRenderReadyEvent=" + this.LJLJJLL + ", onSurfaceAvailableEvent=" + this.LJLJL + ", onRenderFirstFrameEvent=" + this.LJLJLJ + ", onPlayCompletedFirstTime=" + this.LJLJLLL + ", onStoryPlayCompletedFirstTime=" + this.LJLL + ", onPhotoPlayCompletedFirstTime=" + this.LJLLI + ", onPausePlayEvent=" + this.LJLLILLLL + ", onResumePlayEvent=" + this.LJLLJ + ", playProgressEvent=" + this.LJLLL + ", playGetDurationEvent=" + this.LJLLLL + ", playPositionEvent=" + this.LJLLLLLL + ", resumePlayEvent=" + this.LJLZ + ", storyPlayProgressEvent=" + this.LJZ + ", onShowDownloadProgressEvent=" + this.LJZI + ", onPlayCompleted=" + this.LJZL + ", musicCapsuleCancelEvent=" + this.LL + ", onSeekCompletedEvent=" + this.LLD + ", onSpeedChanged=" + this.LLF + ", onPlayStopEvent=" + this.LLFF + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, C40328FsC.LIZIZ(this.LJLJI, C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31);
        C43I<C76800UCe> c43i = this.LJLJJLL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        C43I<C76800UCe> c43i2 = this.LJLJL;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<String> c43i3 = this.LJLJLJ;
        if (c43i3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C43I<C76800UCe> c43i4 = this.LJLJLLL;
        if (c43i4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C43I<C76800UCe> c43i5 = this.LJLL;
        if (c43i5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        C43I<C76800UCe> c43i6 = this.LJLLI;
        if (c43i6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c43i6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        C43I<String> c43i7 = this.LJLLILLLL;
        if (c43i7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c43i7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        C43I<String> c43i8 = this.LJLLJ;
        if (c43i8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c43i8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        C43I<Float> c43i9 = this.LJLLL;
        if (c43i9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = c43i9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Double d = this.LJLLLL;
        if (d == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = d.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        C43I<Long> c43i10 = this.LJLLLLLL;
        if (c43i10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = c43i10.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        C43I<Aweme> c43i11 = this.LJLZ;
        if (c43i11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = c43i11.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        C43I<C210108Mk> c43i12 = this.LJZ;
        if (c43i12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = c43i12.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        C43I<C8LI> c43i13 = this.LJZI;
        if (c43i13 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = c43i13.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        C43I<String> c43i14 = this.LJZL;
        if (c43i14 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = c43i14.hashCode();
        }
        int LIZIZ2 = C40328FsC.LIZIZ(this.LL, (i15 + hashCode15) * 31, 31);
        C43I<String> c43i15 = this.LLD;
        if (c43i15 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = c43i15.hashCode();
        }
        int i16 = (LIZIZ2 + hashCode16) * 31;
        C43I<OSZ<String, Float>> c43i16 = this.LLF;
        if (c43i16 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = c43i16.hashCode();
        }
        int i17 = (i16 + hashCode17) * 31;
        C43I<String> c43i17 = this.LLFF;
        if (c43i17 != null) {
            i = c43i17.hashCode();
        }
        return i17 + i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C212208Um(int r27) {
        /*
            r26 = this;
            X.43I r2 = new X.43I
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2.<init>(r1)
            X.43I r3 = new X.43I
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.<init>(r0)
            X.43I r4 = new X.43I
            r4.<init>(r1)
            X.43I r5 = new X.43I
            r5.<init>(r1)
            X.43I r6 = new X.43I
            r6.<init>(r1)
            r7 = 0
            X.43I r0 = new X.43I
            r0.<init>(r1)
            r1 = r26
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r22 = r0
            r23 = r7
            r24 = r7
            r25 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212208Um.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C212208Um(C43I<Boolean> playAnimationEvent, C43I<Integer> pauseAnimationEvent, C43I<Boolean> stopAnimationEvent, C43I<Boolean> livePauseAnimationEvent, C43I<Boolean> liveResumeAnimationEvent, C43I<C76800UCe> c43i, C43I<C76800UCe> c43i2, C43I<String> c43i3, C43I<C76800UCe> c43i4, C43I<C76800UCe> c43i5, C43I<C76800UCe> c43i6, C43I<String> c43i7, C43I<String> c43i8, C43I<Float> c43i9, Double d, C43I<Long> c43i10, C43I<? extends Aweme> c43i11, C43I<C210108Mk> c43i12, C43I<C8LI> c43i13, C43I<String> c43i14, C43I<Boolean> musicCapsuleCancelEvent, C43I<String> c43i15, C43I<OSZ<String, Float>> c43i16, C43I<String> c43i17) {
        o.LJIIIZ(playAnimationEvent, "playAnimationEvent");
        o.LJIIIZ(pauseAnimationEvent, "pauseAnimationEvent");
        o.LJIIIZ(stopAnimationEvent, "stopAnimationEvent");
        o.LJIIIZ(livePauseAnimationEvent, "livePauseAnimationEvent");
        o.LJIIIZ(liveResumeAnimationEvent, "liveResumeAnimationEvent");
        o.LJIIIZ(musicCapsuleCancelEvent, "musicCapsuleCancelEvent");
        this.LJLIL = playAnimationEvent;
        this.LJLILLLLZI = pauseAnimationEvent;
        this.LJLJI = stopAnimationEvent;
        this.LJLJJI = livePauseAnimationEvent;
        this.LJLJJL = liveResumeAnimationEvent;
        this.LJLJJLL = c43i;
        this.LJLJL = c43i2;
        this.LJLJLJ = c43i3;
        this.LJLJLLL = c43i4;
        this.LJLL = c43i5;
        this.LJLLI = c43i6;
        this.LJLLILLLL = c43i7;
        this.LJLLJ = c43i8;
        this.LJLLL = c43i9;
        this.LJLLLL = d;
        this.LJLLLLLL = c43i10;
        this.LJLZ = c43i11;
        this.LJZ = c43i12;
        this.LJZI = c43i13;
        this.LJZL = c43i14;
        this.LL = musicCapsuleCancelEvent;
        this.LLD = c43i15;
        this.LLF = c43i16;
        this.LLFF = c43i17;
    }

    public static C212208Um LIZ(C212208Um c212208Um, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, C43I c43i8, C43I c43i9, C43I c43i10, C43I c43i11, C43I c43i12, C43I c43i13, C43I c43i14, Double d, C43I c43i15, C43I c43i16, C43I c43i17, C43I c43i18, C43I c43i19, C43I c43i20, C43I c43i21, C43I c43i22, C43I c43i23, int i) {
        C43I c43i24 = c43i23;
        C43I musicCapsuleCancelEvent = c43i20;
        C43I c43i25 = c43i18;
        C43I c43i26 = c43i17;
        C43I c43i27 = c43i16;
        C43I c43i28 = c43i6;
        C43I liveResumeAnimationEvent = c43i5;
        Double d2 = d;
        C43I livePauseAnimationEvent = c43i4;
        C43I stopAnimationEvent = c43i3;
        C43I playAnimationEvent = c43i;
        C43I c43i29 = c43i19;
        C43I pauseAnimationEvent = c43i2;
        C43I c43i30 = c43i14;
        C43I c43i31 = c43i7;
        C43I c43i32 = c43i8;
        C43I c43i33 = c43i9;
        C43I c43i34 = c43i22;
        C43I c43i35 = c43i15;
        C43I c43i36 = c43i21;
        C43I c43i37 = c43i10;
        C43I c43i38 = c43i11;
        C43I c43i39 = c43i12;
        C43I c43i40 = c43i13;
        if ((i & 1) != 0) {
            playAnimationEvent = c212208Um.LJLIL;
        }
        if ((i & 2) != 0) {
            pauseAnimationEvent = c212208Um.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            stopAnimationEvent = c212208Um.LJLJI;
        }
        if ((i & 8) != 0) {
            livePauseAnimationEvent = c212208Um.LJLJJI;
        }
        if ((i & 16) != 0) {
            liveResumeAnimationEvent = c212208Um.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i28 = c212208Um.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i31 = c212208Um.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i32 = c212208Um.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c43i33 = c212208Um.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c43i37 = c212208Um.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i38 = c212208Um.LJLLI;
        }
        if ((i & 2048) != 0) {
            c43i39 = c212208Um.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i40 = c212208Um.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c43i30 = c212208Um.LJLLL;
        }
        if ((i & 16384) != 0) {
            d2 = c212208Um.LJLLLL;
        }
        if ((32768 & i) != 0) {
            c43i35 = c212208Um.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            c43i27 = c212208Um.LJLZ;
        }
        if ((131072 & i) != 0) {
            c43i26 = c212208Um.LJZ;
        }
        if ((262144 & i) != 0) {
            c43i25 = c212208Um.LJZI;
        }
        if ((524288 & i) != 0) {
            c43i29 = c212208Um.LJZL;
        }
        if ((1048576 & i) != 0) {
            musicCapsuleCancelEvent = c212208Um.LL;
        }
        if ((2097152 & i) != 0) {
            c43i36 = c212208Um.LLD;
        }
        if ((4194304 & i) != 0) {
            c43i34 = c212208Um.LLF;
        }
        if ((i & 8388608) != 0) {
            c43i24 = c212208Um.LLFF;
        }
        c212208Um.getClass();
        o.LJIIIZ(playAnimationEvent, "playAnimationEvent");
        o.LJIIIZ(pauseAnimationEvent, "pauseAnimationEvent");
        o.LJIIIZ(stopAnimationEvent, "stopAnimationEvent");
        o.LJIIIZ(livePauseAnimationEvent, "livePauseAnimationEvent");
        o.LJIIIZ(liveResumeAnimationEvent, "liveResumeAnimationEvent");
        o.LJIIIZ(musicCapsuleCancelEvent, "musicCapsuleCancelEvent");
        C43I c43i41 = c43i34;
        C43I c43i42 = c43i24;
        C43I c43i43 = c43i40;
        C43I c43i44 = c43i30;
        return new C212208Um(playAnimationEvent, pauseAnimationEvent, stopAnimationEvent, livePauseAnimationEvent, liveResumeAnimationEvent, c43i28, c43i31, c43i32, c43i33, c43i37, c43i38, c43i39, c43i43, c43i44, d2, c43i35, c43i27, c43i26, c43i25, c43i29, musicCapsuleCancelEvent, c43i36, c43i41, c43i42);
    }
}
