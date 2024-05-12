package X;

import android.text.Editable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.6y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177616y5 implements C33Q {
    public final Aweme LJLIL;
    public final User LJLILLLLZI;
    public final C43I<Comment> LJLJI;
    public final AbstractC177926ya LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final C177256xV LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final C43I<BaseResponse> LJLLILLLL;
    public final boolean LJLLJ;
    public final C43I<Editable> LJLLL;
    public final C43I<Boolean> LJLLLL;
    public final C43I<Boolean> LJLLLLLL;
    public final C43I<OSZ<Boolean, Boolean>> LJLZ;
    public final String LJZ;
    public final boolean LJZI;
    public final C177806yO LJZL;
    public final C43I<Boolean> LL;
    public final boolean LLD;
    public final EnumC177696yD LLF;
    public final int LLFF;
    public final CommentVideoModel.Type LLFFF;
    public final C174046sK LLFII;
    public final C43I<Boolean> LLFZ;
    public final boolean LLI;
    public final boolean LLIFFJFJJ;
    public final boolean LLII;
    public final boolean LLIIII;
    public final boolean LLIIIILZ;
    public final boolean LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;
    public final C43I<Integer> LLIIJI;

    public C177616y5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C177616y5)) {
            return false;
        }
        C177616y5 c177616y5 = (C177616y5) obj;
        return o.LJ(this.LJLIL, c177616y5.LJLIL) && o.LJ(this.LJLILLLLZI, c177616y5.LJLILLLLZI) && o.LJ(this.LJLJI, c177616y5.LJLJI) && o.LJ(this.LJLJJI, c177616y5.LJLJJI) && this.LJLJJL == c177616y5.LJLJJL && this.LJLJJLL == c177616y5.LJLJJLL && this.LJLJL == c177616y5.LJLJL && this.LJLJLJ == c177616y5.LJLJLJ && o.LJ(this.LJLJLLL, c177616y5.LJLJLLL) && this.LJLL == c177616y5.LJLL && this.LJLLI == c177616y5.LJLLI && o.LJ(this.LJLLILLLL, c177616y5.LJLLILLLL) && this.LJLLJ == c177616y5.LJLLJ && o.LJ(this.LJLLL, c177616y5.LJLLL) && o.LJ(this.LJLLLL, c177616y5.LJLLLL) && o.LJ(this.LJLLLLLL, c177616y5.LJLLLLLL) && o.LJ(this.LJLZ, c177616y5.LJLZ) && o.LJ(this.LJZ, c177616y5.LJZ) && this.LJZI == c177616y5.LJZI && o.LJ(this.LJZL, c177616y5.LJZL) && o.LJ(this.LL, c177616y5.LL) && this.LLD == c177616y5.LLD && o.LJ(null, null) && this.LLF == c177616y5.LLF && this.LLFF == c177616y5.LLFF && this.LLFFF == c177616y5.LLFFF && o.LJ(this.LLFII, c177616y5.LLFII) && o.LJ(this.LLFZ, c177616y5.LLFZ) && this.LLI == c177616y5.LLI && this.LLIFFJFJJ == c177616y5.LLIFFJFJJ && this.LLII == c177616y5.LLII && this.LLIIII == c177616y5.LLIIII && this.LLIIIILZ == c177616y5.LLIIIILZ && this.LLIIIJ == c177616y5.LLIIIJ && this.LLIIIL == c177616y5.LLIIIL && this.LLIIIZ == c177616y5.LLIIIZ && o.LJ(this.LLIIJI, c177616y5.LLIIJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        User user = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (user == null ? 0 : user.hashCode())) * 31;
        C43I<Comment> c43i = this.LJLJI;
        int hashCode3 = (this.LJLJJI.hashCode() + ((hashCode2 + (c43i == null ? 0 : c43i.hashCode())) * 31)) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.LJLJJLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((((i2 + i3) * 31) + this.LJLJL) * 31) + this.LJLJLJ) * 31;
        C177256xV c177256xV = this.LJLJLLL;
        int hashCode4 = (i4 + (c177256xV == null ? 0 : c177256xV.hashCode())) * 31;
        boolean z3 = this.LJLL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode4 + i5) * 31;
        boolean z4 = this.LJLLI;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        C43I<BaseResponse> c43i2 = this.LJLLILLLL;
        int hashCode5 = (i8 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        boolean z5 = this.LJLLJ;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode5 + i9) * 31;
        C43I<Editable> c43i3 = this.LJLLL;
        int hashCode6 = (i10 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<Boolean> c43i4 = this.LJLLLL;
        int hashCode7 = (hashCode6 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<Boolean> c43i5 = this.LJLLLLLL;
        int hashCode8 = (hashCode7 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<OSZ<Boolean, Boolean>> c43i6 = this.LJLZ;
        int hashCode9 = (hashCode8 + (c43i6 == null ? 0 : c43i6.hashCode())) * 31;
        String str = this.LJZ;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z6 = this.LJZI;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode10 + i11) * 31;
        C177806yO c177806yO = this.LJZL;
        int hashCode11 = (i12 + (c177806yO == null ? 0 : c177806yO.hashCode())) * 31;
        C43I<Boolean> c43i7 = this.LL;
        int hashCode12 = (hashCode11 + (c43i7 == null ? 0 : c43i7.hashCode())) * 31;
        boolean z7 = this.LLD;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int hashCode13 = (this.LLFFF.hashCode() + ((((this.LLF.hashCode() + ((hashCode12 + i13) * 31 * 31)) * 31) + this.LLFF) * 31)) * 31;
        C174046sK c174046sK = this.LLFII;
        int hashCode14 = (hashCode13 + (c174046sK == null ? 0 : c174046sK.hashCode())) * 31;
        C43I<Boolean> c43i8 = this.LLFZ;
        int hashCode15 = (hashCode14 + (c43i8 == null ? 0 : c43i8.hashCode())) * 31;
        boolean z8 = this.LLI;
        int i14 = z8;
        if (z8 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode15 + i14) * 31;
        boolean z9 = this.LLIFFJFJJ;
        int i16 = z9;
        if (z9 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z10 = this.LLII;
        int i18 = z10;
        if (z10 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z11 = this.LLIIII;
        int i20 = z11;
        if (z11 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z12 = this.LLIIIILZ;
        int i22 = z12;
        if (z12 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        boolean z13 = this.LLIIIJ;
        int i24 = z13;
        if (z13 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        boolean z14 = this.LLIIIL;
        int i26 = z14;
        if (z14 != 0) {
            i26 = 1;
        }
        int i27 = (((i25 + i26) * 31) + (this.LLIIIZ ? 1 : 0)) * 31;
        C43I<Integer> c43i9 = this.LLIIJI;
        return i27 + (c43i9 != null ? c43i9.hashCode() : 0);
    }

    public final String toString() {
        return "CommentInputVMStateV2(currentAweme=" + this.LJLIL + ", user=" + this.LJLILLLLZI + ", comment=" + this.LJLJI + ", panelType=" + this.LJLJJI + ", isShowKeyboard=" + this.LJLJJL + ", softKeyboardStatus=" + this.LJLJJLL + ", keyboardHeight=" + this.LJLJL + ", inputAreaHeight=" + this.LJLJLJ + ", replyCommentState=" + this.LJLJLLL + ", showRepostLine=" + this.LJLL + ", showReplyWithVideo=" + this.LJLLI + ", commentError=" + this.LJLLILLLL + ", isInputtingContent=" + this.LJLLJ + ", inputContent=" + this.LJLLL + ", updateGiftPanelCoin=" + this.LJLLLL + ", enableMentionState=" + this.LJLLLLLL + ", tryMention=" + this.LJLZ + ", enterMethod=" + this.LJZ + ", inputVisible=" + this.LJZI + ", showHorizontalEmojiPanel=" + this.LJZL + ", updateExposeEmoji=" + this.LL + ", showInputMode=" + this.LLD + ", currentInputContent=null, commentInputViewStatus=" + this.LLF + ", userInputState=" + this.LLFF + ", commentVideoModelType=" + this.LLFFF + ", commentEvent=" + this.LLFII + ", updateHint=" + this.LLFZ + ", hasPhoto=" + this.LLI + ", videoStatus=" + this.LLIFFJFJJ + ", atStatus=" + this.LLII + ", emojiStatus=" + this.LLIIII + ", giftStatus=" + this.LLIIIILZ + ", imageStatus=" + this.LLIIIJ + ", reachMentionLimit=" + this.LLIIIL + ", pendingAutoPop=" + this.LLIIIZ + ", photoPageStatus=" + this.LLIIJI + ')';
    }

    public /* synthetic */ C177616y5(int i) {
        this(null, null, null, C177916yZ.LIZ, false, false, 0, 0, null, false, false, null, false, null, null, null, null, null, true, null, null, false, EnumC177696yD.AVAILABLE, 0, CommentVideoModel.Type.NONE, null, null, false, false, true, true, false, true, false, false, null);
    }

    public static C177616y5 LIZ(C177616y5 c177616y5, Aweme aweme, AbstractC177926ya abstractC177926ya, boolean z, int i, int i2, C177256xV c177256xV, boolean z2, boolean z3, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C177806yO c177806yO, C43I c43i5, boolean z4, EnumC177696yD enumC177696yD, C174046sK c174046sK, C43I c43i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, C43I c43i7, int i3, int i4) {
        User user;
        C43I<Comment> c43i8;
        boolean z11;
        boolean z12;
        C43I<BaseResponse> c43i9;
        String str;
        boolean z13;
        int i5;
        CommentVideoModel.Type commentVideoModelType;
        boolean z14;
        boolean z15;
        C43I c43i10 = c43i7;
        C177256xV c177256xV2 = c177256xV;
        boolean z16 = z8;
        boolean z17 = z3;
        boolean z18 = z7;
        boolean z19 = z4;
        boolean z20 = z5;
        int i6 = i2;
        int i7 = i;
        C43I c43i11 = c43i6;
        AbstractC177926ya panelType = abstractC177926ya;
        Aweme aweme2 = aweme;
        boolean z21 = z10;
        C43I c43i12 = c43i2;
        boolean z22 = z;
        C174046sK c174046sK2 = c174046sK;
        C43I c43i13 = c43i4;
        boolean z23 = z2;
        boolean z24 = z9;
        EnumC177696yD commentInputViewStatus = enumC177696yD;
        C43I c43i14 = c43i;
        C43I c43i15 = c43i3;
        boolean z25 = z6;
        C177806yO c177806yO2 = c177806yO;
        C43I c43i16 = c43i5;
        if ((i3 & 1) != 0) {
            aweme2 = c177616y5.LJLIL;
        }
        if ((i3 & 2) != 0) {
            user = c177616y5.LJLILLLLZI;
        } else {
            user = null;
        }
        if ((i3 & 4) != 0) {
            c43i8 = c177616y5.LJLJI;
        } else {
            c43i8 = null;
        }
        if ((i3 & 8) != 0) {
            panelType = c177616y5.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            z11 = c177616y5.LJLJJL;
        } else {
            z11 = false;
        }
        if ((i3 & 32) != 0) {
            z22 = c177616y5.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            i7 = c177616y5.LJLJL;
        }
        if ((i3 & 128) != 0) {
            i6 = c177616y5.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            c177256xV2 = c177616y5.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            z23 = c177616y5.LJLL;
        }
        if ((i3 & 1024) != 0) {
            z12 = c177616y5.LJLLI;
        } else {
            z12 = false;
        }
        if ((i3 & 2048) != 0) {
            c43i9 = c177616y5.LJLLILLLL;
        } else {
            c43i9 = null;
        }
        if ((i3 & 4096) != 0) {
            z17 = c177616y5.LJLLJ;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            c43i14 = c177616y5.LJLLL;
        }
        if ((i3 & 16384) != 0) {
            c43i12 = c177616y5.LJLLLL;
        }
        if ((32768 & i3) != 0) {
            c43i15 = c177616y5.LJLLLLLL;
        }
        if ((65536 & i3) != 0) {
            c43i13 = c177616y5.LJLZ;
        }
        if ((131072 & i3) != 0) {
            str = c177616y5.LJZ;
        } else {
            str = null;
        }
        if ((262144 & i3) != 0) {
            z13 = c177616y5.LJZI;
        } else {
            z13 = false;
        }
        if ((524288 & i3) != 0) {
            c177806yO2 = c177616y5.LJZL;
        }
        if ((1048576 & i3) != 0) {
            c43i16 = c177616y5.LL;
        }
        if ((2097152 & i3) != 0) {
            z19 = c177616y5.LLD;
        }
        if ((4194304 & i3) != 0) {
            c177616y5.getClass();
        }
        if ((8388608 & i3) != 0) {
            commentInputViewStatus = c177616y5.LLF;
        }
        if ((16777216 & i3) != 0) {
            i5 = c177616y5.LLFF;
        } else {
            i5 = 0;
        }
        if ((33554432 & i3) != 0) {
            commentVideoModelType = c177616y5.LLFFF;
        } else {
            commentVideoModelType = null;
        }
        if ((67108864 & i3) != 0) {
            c174046sK2 = c177616y5.LLFII;
        }
        if ((134217728 & i3) != 0) {
            c43i11 = c177616y5.LLFZ;
        }
        if ((268435456 & i3) != 0) {
            z20 = c177616y5.LLI;
        }
        if ((536870912 & i3) != 0) {
            z25 = c177616y5.LLIFFJFJJ;
        }
        if ((1073741824 & i3) != 0) {
            z14 = c177616y5.LLII;
        } else {
            z14 = false;
        }
        if ((i3 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            z18 = c177616y5.LLIIII;
        }
        if ((i4 & 1) != 0) {
            z16 = c177616y5.LLIIIILZ;
        }
        if ((i4 & 2) != 0) {
            z24 = c177616y5.LLIIIJ;
        }
        if ((i4 & 4) != 0) {
            z21 = c177616y5.LLIIIL;
        }
        if ((i4 & 8) != 0) {
            z15 = c177616y5.LLIIIZ;
        } else {
            z15 = false;
        }
        if ((i4 & 16) != 0) {
            c43i10 = c177616y5.LLIIJI;
        }
        c177616y5.getClass();
        o.LJIIIZ(panelType, "panelType");
        o.LJIIIZ(commentInputViewStatus, "commentInputViewStatus");
        o.LJIIIZ(commentVideoModelType, "commentVideoModelType");
        return new C177616y5(aweme2, user, c43i8, panelType, z11, z22, i7, i6, c177256xV2, z23, z12, c43i9, z17, c43i14, c43i12, c43i15, c43i13, str, z13, c177806yO2, c43i16, z19, commentInputViewStatus, i5, commentVideoModelType, c174046sK2, c43i11, z20, z25, z14, z18, z16, z24, z21, z15, c43i10);
    }

    public C177616y5(Aweme aweme, User user, C43I c43i, AbstractC177926ya panelType, boolean z, boolean z2, int i, int i2, C177256xV c177256xV, boolean z3, boolean z4, C43I c43i2, boolean z5, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, String str, boolean z6, C177806yO c177806yO, C43I c43i7, boolean z7, EnumC177696yD commentInputViewStatus, int i3, CommentVideoModel.Type commentVideoModelType, C174046sK c174046sK, C43I c43i8, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C43I c43i9) {
        o.LJIIIZ(panelType, "panelType");
        o.LJIIIZ(commentInputViewStatus, "commentInputViewStatus");
        o.LJIIIZ(commentVideoModelType, "commentVideoModelType");
        this.LJLIL = aweme;
        this.LJLILLLLZI = user;
        this.LJLJI = c43i;
        this.LJLJJI = panelType;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = i;
        this.LJLJLJ = i2;
        this.LJLJLLL = c177256xV;
        this.LJLL = z3;
        this.LJLLI = z4;
        this.LJLLILLLL = c43i2;
        this.LJLLJ = z5;
        this.LJLLL = c43i3;
        this.LJLLLL = c43i4;
        this.LJLLLLLL = c43i5;
        this.LJLZ = c43i6;
        this.LJZ = str;
        this.LJZI = z6;
        this.LJZL = c177806yO;
        this.LL = c43i7;
        this.LLD = z7;
        this.LLF = commentInputViewStatus;
        this.LLFF = i3;
        this.LLFFF = commentVideoModelType;
        this.LLFII = c174046sK;
        this.LLFZ = c43i8;
        this.LLI = z8;
        this.LLIFFJFJJ = z9;
        this.LLII = z10;
        this.LLIIII = z11;
        this.LLIIIILZ = z12;
        this.LLIIIJ = z13;
        this.LLIIIL = z14;
        this.LLIIIZ = z15;
        this.LLIIJI = c43i9;
    }
}
