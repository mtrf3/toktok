package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.82B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82B implements C33Q {
    public final C43I<Integer> LJLIL;
    public final C43I<C195357lb> LJLILLLLZI;
    public final C43I<Integer> LJLJI;
    public final C43I<C195357lb> LJLJJI;
    public final C43I<C76800UCe> LJLJJL;
    public final C43I<Integer> LJLJJLL;
    public final C43I<C76800UCe> LJLJL;
    public final C43I<C76800UCe> LJLJLJ;
    public final C43I<Aweme> LJLJLLL;
    public final C43I<VideoItemParams> LJLL;
    public final C43I<VideoItemParams> LJLLI;
    public final C43I<C90U> LJLLILLLL;
    public final C43I<C86710Y1i> LJLLJ;
    public final C43I<Boolean> LJLLL;
    public final C43I<Integer> LJLLLL;
    public final C43I<Boolean> LJLLLLLL;
    public final C43I<C76800UCe> LJLZ;
    public final C43I<Integer> LJZ;
    public final C43I<C70012ov> LJZI;
    public final C43I<Boolean> LJZL;
    public final C43I<String> LL;
    public final C43I<Aweme> LLD;
    public final C43I<View> LLF;
    public final C43I<C2301491m> LLFF;
    public final C43I<OSZ<Aweme, PostModeEntranceMechanism>> LLFFF;
    public final C43I<Boolean> LLFII;
    public final C43I<Boolean> LLFZ;

    public C82B() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82B)) {
            return false;
        }
        C82B c82b = (C82B) obj;
        return o.LJ(this.LJLIL, c82b.LJLIL) && o.LJ(this.LJLILLLLZI, c82b.LJLILLLLZI) && o.LJ(this.LJLJI, c82b.LJLJI) && o.LJ(this.LJLJJI, c82b.LJLJJI) && o.LJ(this.LJLJJL, c82b.LJLJJL) && o.LJ(this.LJLJJLL, c82b.LJLJJLL) && o.LJ(this.LJLJL, c82b.LJLJL) && o.LJ(this.LJLJLJ, c82b.LJLJLJ) && o.LJ(this.LJLJLLL, c82b.LJLJLLL) && o.LJ(this.LJLL, c82b.LJLL) && o.LJ(this.LJLLI, c82b.LJLLI) && o.LJ(this.LJLLILLLL, c82b.LJLLILLLL) && o.LJ(this.LJLLJ, c82b.LJLLJ) && o.LJ(this.LJLLL, c82b.LJLLL) && o.LJ(this.LJLLLL, c82b.LJLLLL) && o.LJ(this.LJLLLLLL, c82b.LJLLLLLL) && o.LJ(this.LJLZ, c82b.LJLZ) && o.LJ(this.LJZ, c82b.LJZ) && o.LJ(this.LJZI, c82b.LJZI) && o.LJ(this.LJZL, c82b.LJZL) && o.LJ(this.LL, c82b.LL) && o.LJ(this.LLD, c82b.LLD) && o.LJ(this.LLF, c82b.LLF) && o.LJ(this.LLFF, c82b.LLFF) && o.LJ(this.LLFFF, c82b.LLFFF) && o.LJ(this.LLFII, c82b.LLFII) && o.LJ(this.LLFZ, c82b.LLFZ);
    }

    public final int hashCode() {
        C43I<Integer> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C195357lb> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<Integer> c43i3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<C195357lb> c43i4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<C76800UCe> c43i5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<Integer> c43i6 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (c43i6 == null ? 0 : c43i6.hashCode())) * 31;
        C43I<C76800UCe> c43i7 = this.LJLJL;
        int hashCode7 = (hashCode6 + (c43i7 == null ? 0 : c43i7.hashCode())) * 31;
        C43I<C76800UCe> c43i8 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (c43i8 == null ? 0 : c43i8.hashCode())) * 31;
        C43I<Aweme> c43i9 = this.LJLJLLL;
        int hashCode9 = (hashCode8 + (c43i9 == null ? 0 : c43i9.hashCode())) * 31;
        C43I<VideoItemParams> c43i10 = this.LJLL;
        int hashCode10 = (hashCode9 + (c43i10 == null ? 0 : c43i10.hashCode())) * 31;
        C43I<VideoItemParams> c43i11 = this.LJLLI;
        int hashCode11 = (hashCode10 + (c43i11 == null ? 0 : c43i11.hashCode())) * 31;
        C43I<C90U> c43i12 = this.LJLLILLLL;
        int hashCode12 = (hashCode11 + (c43i12 == null ? 0 : c43i12.hashCode())) * 31;
        C43I<C86710Y1i> c43i13 = this.LJLLJ;
        int hashCode13 = (hashCode12 + (c43i13 == null ? 0 : c43i13.hashCode())) * 31;
        C43I<Boolean> c43i14 = this.LJLLL;
        int hashCode14 = (hashCode13 + (c43i14 == null ? 0 : c43i14.hashCode())) * 31;
        C43I<Integer> c43i15 = this.LJLLLL;
        int hashCode15 = (hashCode14 + (c43i15 == null ? 0 : c43i15.hashCode())) * 31;
        C43I<Boolean> c43i16 = this.LJLLLLLL;
        int hashCode16 = (hashCode15 + (c43i16 == null ? 0 : c43i16.hashCode())) * 31;
        C43I<C76800UCe> c43i17 = this.LJLZ;
        int hashCode17 = (hashCode16 + (c43i17 == null ? 0 : c43i17.hashCode())) * 31;
        C43I<Integer> c43i18 = this.LJZ;
        int hashCode18 = (hashCode17 + (c43i18 == null ? 0 : c43i18.hashCode())) * 31;
        C43I<C70012ov> c43i19 = this.LJZI;
        int hashCode19 = (hashCode18 + (c43i19 == null ? 0 : c43i19.hashCode())) * 31;
        C43I<Boolean> c43i20 = this.LJZL;
        int hashCode20 = (hashCode19 + (c43i20 == null ? 0 : c43i20.hashCode())) * 31;
        C43I<String> c43i21 = this.LL;
        int hashCode21 = (hashCode20 + (c43i21 == null ? 0 : c43i21.hashCode())) * 31;
        C43I<Aweme> c43i22 = this.LLD;
        int hashCode22 = (hashCode21 + (c43i22 == null ? 0 : c43i22.hashCode())) * 31;
        C43I<View> c43i23 = this.LLF;
        int hashCode23 = (hashCode22 + (c43i23 == null ? 0 : c43i23.hashCode())) * 31;
        C43I<C2301491m> c43i24 = this.LLFF;
        int hashCode24 = (hashCode23 + (c43i24 == null ? 0 : c43i24.hashCode())) * 31;
        C43I<OSZ<Aweme, PostModeEntranceMechanism>> c43i25 = this.LLFFF;
        int hashCode25 = (hashCode24 + (c43i25 == null ? 0 : c43i25.hashCode())) * 31;
        C43I<Boolean> c43i26 = this.LLFII;
        int hashCode26 = (hashCode25 + (c43i26 == null ? 0 : c43i26.hashCode())) * 31;
        C43I<Boolean> c43i27 = this.LLFZ;
        return hashCode26 + (c43i27 != null ? c43i27.hashCode() : 0);
    }

    public final String toString() {
        return "VideoViewState(onPageSelectedEvent=" + this.LJLIL + ", onPageUnSelectedEvent=" + this.LJLILLLLZI + ", onHolderSelectedEvent=" + this.LJLJI + ", onHolderUnSelectedEvent=" + this.LJLJJI + ", onMidRollAdUnselectedEvent=" + this.LJLJJL + ", onPageScrollStateChangedEvent=" + this.LJLJJLL + ", onHolderPauseEvent=" + this.LJLJL + ", onHolderResumeEvent=" + this.LJLJLJ + ", doubleClickEvent=" + this.LJLJLLL + ", updateLegacyBackupDataEvent=" + this.LJLL + ", updateLegacyDataEvent=" + this.LJLLI + ", updateCaptionTextEvent=" + this.LJLLILLLL + ", captionPlayerStatusCallback=" + this.LJLLJ + ", onProgressBarStateChangedEvent=" + this.LJLLL + ", onFullScreenLayerClickedEvent=" + this.LJLLLL + ", onToggleClickedEvent=" + this.LJLLLLLL + ", onDetailRefreshEvent=" + this.LJLZ + ", onHolderPauseWithModeEvent=" + this.LJZ + ", onStoryPageSelectedEvent=" + this.LJZI + ", showQAInviteButtonEvent=" + this.LJZL + ", refreshFeedAssemComponent=" + this.LL + ", onBindAweme=" + this.LLD + ", onVideoViewCreate=" + this.LLF + ", onShouldUpdateVideoCaptionPosition=" + this.LLFF + ", requestNavigationToPhotoModeDetailPageEvent=" + this.LLFFF + ", muteIconState=" + this.LLFII + ", onSeeMoreClickEvent=" + this.LLFZ + ')';
    }

    public /* synthetic */ C82B(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82B(C43I<Integer> c43i, C43I<C195357lb> c43i2, C43I<Integer> c43i3, C43I<C195357lb> c43i4, C43I<C76800UCe> c43i5, C43I<Integer> c43i6, C43I<C76800UCe> c43i7, C43I<C76800UCe> c43i8, C43I<? extends Aweme> c43i9, C43I<? extends VideoItemParams> c43i10, C43I<? extends VideoItemParams> c43i11, C43I<C90U> c43i12, C43I<? extends C86710Y1i> c43i13, C43I<Boolean> c43i14, C43I<Integer> c43i15, C43I<Boolean> c43i16, C43I<C76800UCe> c43i17, C43I<Integer> c43i18, C43I<C70012ov> c43i19, C43I<Boolean> c43i20, C43I<String> c43i21, C43I<? extends Aweme> c43i22, C43I<? extends View> c43i23, C43I<C2301491m> c43i24, C43I<? extends OSZ<? extends Aweme, ? extends PostModeEntranceMechanism>> c43i25, C43I<Boolean> c43i26, C43I<Boolean> c43i27) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = c43i6;
        this.LJLJL = c43i7;
        this.LJLJLJ = c43i8;
        this.LJLJLLL = c43i9;
        this.LJLL = c43i10;
        this.LJLLI = c43i11;
        this.LJLLILLLL = c43i12;
        this.LJLLJ = c43i13;
        this.LJLLL = c43i14;
        this.LJLLLL = c43i15;
        this.LJLLLLLL = c43i16;
        this.LJLZ = c43i17;
        this.LJZ = c43i18;
        this.LJZI = c43i19;
        this.LJZL = c43i20;
        this.LL = c43i21;
        this.LLD = c43i22;
        this.LLF = c43i23;
        this.LLFF = c43i24;
        this.LLFFF = c43i25;
        this.LLFII = c43i26;
        this.LLFZ = c43i27;
    }

    public static C82B LIZ(C82B c82b, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, C43I c43i8, C43I c43i9, C43I c43i10, C43I c43i11, C43I c43i12, C43I c43i13, C43I c43i14, C43I c43i15, C43I c43i16, C43I c43i17, C43I c43i18, C43I c43i19, C43I c43i20, C43I c43i21, C43I c43i22, C43I c43i23, C43I c43i24, C43I c43i25, C43I c43i26, C43I c43i27, int i) {
        C43I c43i28 = c43i27;
        C43I c43i29 = c43i25;
        C43I c43i30 = c43i24;
        C43I c43i31 = c43i23;
        C43I c43i32 = c43i18;
        C43I c43i33 = c43i17;
        C43I c43i34 = c43i6;
        C43I c43i35 = c43i20;
        C43I c43i36 = c43i5;
        C43I c43i37 = c43i14;
        C43I c43i38 = c43i4;
        C43I c43i39 = c43i3;
        C43I c43i40 = c43i19;
        C43I c43i41 = c43i;
        C43I c43i42 = c43i2;
        C43I c43i43 = c43i7;
        C43I c43i44 = c43i8;
        C43I c43i45 = c43i15;
        C43I c43i46 = c43i21;
        C43I c43i47 = c43i9;
        C43I c43i48 = c43i10;
        C43I c43i49 = c43i11;
        C43I c43i50 = c43i12;
        C43I c43i51 = c43i26;
        C43I c43i52 = c43i16;
        C43I c43i53 = c43i22;
        C43I c43i54 = c43i13;
        if ((i & 1) != 0) {
            c43i41 = c82b.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i42 = c82b.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i39 = c82b.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i38 = c82b.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i36 = c82b.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i34 = c82b.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i43 = c82b.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i44 = c82b.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c43i47 = c82b.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c43i48 = c82b.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i49 = c82b.LJLLI;
        }
        if ((i & 2048) != 0) {
            c43i50 = c82b.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i54 = c82b.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c43i37 = c82b.LJLLL;
        }
        if ((i & 16384) != 0) {
            c43i45 = c82b.LJLLLL;
        }
        if ((32768 & i) != 0) {
            c43i52 = c82b.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            c43i33 = c82b.LJLZ;
        }
        if ((131072 & i) != 0) {
            c43i32 = c82b.LJZ;
        }
        if ((262144 & i) != 0) {
            c43i40 = c82b.LJZI;
        }
        if ((524288 & i) != 0) {
            c43i35 = c82b.LJZL;
        }
        if ((1048576 & i) != 0) {
            c43i46 = c82b.LL;
        }
        if ((2097152 & i) != 0) {
            c43i53 = c82b.LLD;
        }
        if ((4194304 & i) != 0) {
            c43i31 = c82b.LLF;
        }
        if ((8388608 & i) != 0) {
            c43i30 = c82b.LLFF;
        }
        if ((16777216 & i) != 0) {
            c43i29 = c82b.LLFFF;
        }
        if ((33554432 & i) != 0) {
            c43i51 = c82b.LLFII;
        }
        if ((i & 67108864) != 0) {
            c43i28 = c82b.LLFZ;
        }
        c82b.getClass();
        C43I c43i55 = c43i51;
        C43I c43i56 = c43i28;
        return new C82B(c43i41, c43i42, c43i39, c43i38, c43i36, c43i34, c43i43, c43i44, c43i47, c43i48, c43i49, c43i50, c43i54, c43i37, c43i45, c43i52, c43i33, c43i32, c43i40, c43i35, c43i46, c43i53, c43i31, c43i30, c43i29, c43i55, c43i56);
    }
}
