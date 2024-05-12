package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.6zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178336zF implements C33Q {
    public final Aweme LJLIL;
    public final User LJLILLLLZI;
    public final C43I<Comment> LJLJI;
    public final AbstractC177926ya LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final boolean LJLJL;
    public final int LJLJLJ;
    public final C178136yv LJLJLLL;
    public final C43I<BaseResponse> LJLL;
    public final C43I<Boolean> LJLLI;
    public final C43I<String> LJLLILLLL;
    public final boolean LJLLJ;
    public final C43I<Editable> LJLLL;
    public final C43I<Boolean> LJLLLL;
    public final C43I<OSZ<Boolean, Boolean>> LJLLLLLL;
    public final String LJLZ;
    public final boolean LJZ;
    public final boolean LJZI;
    public final boolean LJZL;

    public C178336zF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C178336zF)) {
            return false;
        }
        C178336zF c178336zF = (C178336zF) obj;
        return o.LJ(this.LJLIL, c178336zF.LJLIL) && o.LJ(this.LJLILLLLZI, c178336zF.LJLILLLLZI) && o.LJ(this.LJLJI, c178336zF.LJLJI) && o.LJ(this.LJLJJI, c178336zF.LJLJJI) && this.LJLJJL == c178336zF.LJLJJL && this.LJLJJLL == c178336zF.LJLJJLL && this.LJLJL == c178336zF.LJLJL && this.LJLJLJ == c178336zF.LJLJLJ && o.LJ(this.LJLJLLL, c178336zF.LJLJLLL) && o.LJ(this.LJLL, c178336zF.LJLL) && o.LJ(this.LJLLI, c178336zF.LJLLI) && o.LJ(this.LJLLILLLL, c178336zF.LJLLILLLL) && this.LJLLJ == c178336zF.LJLLJ && o.LJ(this.LJLLL, c178336zF.LJLLL) && o.LJ(this.LJLLLL, c178336zF.LJLLLL) && o.LJ(this.LJLLLLLL, c178336zF.LJLLLLLL) && o.LJ(this.LJLZ, c178336zF.LJLZ) && this.LJZ == c178336zF.LJZ && this.LJZI == c178336zF.LJZI && this.LJZL == c178336zF.LJZL;
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
        int i2 = (((hashCode3 + i) * 31) + this.LJLJJLL) * 31;
        boolean z2 = this.LJLJL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + this.LJLJLJ) * 31;
        C178136yv c178136yv = this.LJLJLLL;
        int hashCode4 = (i4 + (c178136yv == null ? 0 : c178136yv.hashCode())) * 31;
        C43I<BaseResponse> c43i2 = this.LJLL;
        int hashCode5 = (hashCode4 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<Boolean> c43i3 = this.LJLLI;
        int hashCode6 = (hashCode5 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<String> c43i4 = this.LJLLILLLL;
        int hashCode7 = (hashCode6 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        boolean z3 = this.LJLLJ;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode7 + i5) * 31;
        C43I<Editable> c43i5 = this.LJLLL;
        int hashCode8 = (i6 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<Boolean> c43i6 = this.LJLLLL;
        int hashCode9 = (hashCode8 + (c43i6 == null ? 0 : c43i6.hashCode())) * 31;
        C43I<OSZ<Boolean, Boolean>> c43i7 = this.LJLLLLLL;
        int hashCode10 = (hashCode9 + (c43i7 == null ? 0 : c43i7.hashCode())) * 31;
        String str = this.LJLZ;
        int hashCode11 = (hashCode10 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z4 = this.LJZ;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode11 + i7) * 31;
        boolean z5 = this.LJZI;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        return ((i8 + i9) * 31) + (this.LJZL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowCommentInputVMState(currentAweme=");
        sb.append(this.LJLIL);
        sb.append(", user=");
        sb.append(this.LJLILLLLZI);
        sb.append(", comment=");
        sb.append(this.LJLJI);
        sb.append(", panelType=");
        sb.append(this.LJLJJI);
        sb.append(", isShowKeyboard=");
        sb.append(this.LJLJJL);
        sb.append(", inputPos=");
        sb.append(this.LJLJJLL);
        sb.append(", softKeyboardStatus=");
        sb.append(this.LJLJL);
        sb.append(", keyboardHeight=");
        sb.append(this.LJLJLJ);
        sb.append(", replyCommentState=");
        sb.append(this.LJLJLLL);
        sb.append(", commentError=");
        sb.append(this.LJLL);
        sb.append(", closeCommentKeyboard=");
        sb.append(this.LJLLI);
        sb.append(", openCommentKeyboard=");
        sb.append(this.LJLLILLLL);
        sb.append(", isInputtingContent=");
        sb.append(this.LJLLJ);
        sb.append(", inputContent=");
        sb.append(this.LJLLL);
        sb.append(", enableMentionState=");
        sb.append(this.LJLLLL);
        sb.append(", tryMention=");
        sb.append(this.LJLLLLLL);
        sb.append(", enterMethod=");
        sb.append(this.LJLZ);
        sb.append(", inputVisible=");
        sb.append(this.LJZ);
        sb.append(", showHorizontalEmojiPanel=");
        sb.append(this.LJZI);
        sb.append(", commentPanelVisible=");
        return C08880Wm.LIZJ(sb, this.LJZL, ')');
    }

    public /* synthetic */ C178336zF(int i) {
        this(null, null, null, C177916yZ.LIZ, false, 0, false, 0, null, null, null, null, false, null, null, null, null, true, true, false);
    }

    public static C178336zF LIZ(C178336zF c178336zF, Aweme aweme, C43I c43i, AbstractC177926ya abstractC177926ya, boolean z, int i, C178136yv c178136yv, C43I c43i2, C43I c43i3, C43I c43i4, boolean z2, C43I c43i5, C43I c43i6, C43I c43i7, String str, boolean z3, boolean z4, boolean z5, int i2) {
        User user;
        boolean z6;
        int i3;
        boolean z7 = z5;
        C178136yv c178136yv2 = c178136yv;
        boolean z8 = z;
        boolean z9 = z4;
        int i4 = i;
        Aweme aweme2 = aweme;
        C43I c43i8 = c43i;
        C43I c43i9 = c43i2;
        C43I c43i10 = c43i3;
        C43I c43i11 = c43i4;
        String str2 = str;
        boolean z10 = z2;
        C43I c43i12 = c43i5;
        C43I c43i13 = c43i6;
        AbstractC177926ya panelType = abstractC177926ya;
        C43I c43i14 = c43i7;
        boolean z11 = z3;
        if ((i2 & 1) != 0) {
            aweme2 = c178336zF.LJLIL;
        }
        if ((i2 & 2) != 0) {
            user = c178336zF.LJLILLLLZI;
        } else {
            user = null;
        }
        if ((i2 & 4) != 0) {
            c43i8 = c178336zF.LJLJI;
        }
        if ((i2 & 8) != 0) {
            panelType = c178336zF.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            z6 = c178336zF.LJLJJL;
        } else {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            i3 = c178336zF.LJLJJLL;
        } else {
            i3 = 0;
        }
        if ((i2 & 64) != 0) {
            z8 = c178336zF.LJLJL;
        }
        if ((i2 & 128) != 0) {
            i4 = c178336zF.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            c178136yv2 = c178336zF.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            c43i9 = c178336zF.LJLL;
        }
        if ((i2 & 1024) != 0) {
            c43i10 = c178336zF.LJLLI;
        }
        if ((i2 & 2048) != 0) {
            c43i11 = c178336zF.LJLLILLLL;
        }
        if ((i2 & 4096) != 0) {
            z10 = c178336zF.LJLLJ;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            c43i12 = c178336zF.LJLLL;
        }
        if ((i2 & 16384) != 0) {
            c43i13 = c178336zF.LJLLLL;
        }
        if ((32768 & i2) != 0) {
            c43i14 = c178336zF.LJLLLLLL;
        }
        if ((65536 & i2) != 0) {
            str2 = c178336zF.LJLZ;
        }
        if ((131072 & i2) != 0) {
            z11 = c178336zF.LJZ;
        }
        if ((262144 & i2) != 0) {
            z9 = c178336zF.LJZI;
        }
        if ((i2 & 524288) != 0) {
            z7 = c178336zF.LJZL;
        }
        c178336zF.getClass();
        o.LJIIIZ(panelType, "panelType");
        int i5 = i4;
        C178136yv c178136yv3 = c178136yv2;
        C43I c43i15 = c43i9;
        C43I c43i16 = c43i10;
        return new C178336zF(aweme2, user, c43i8, panelType, z6, i3, z8, i5, c178136yv3, c43i15, c43i16, c43i11, z10, c43i12, c43i13, c43i14, str2, z11, z9, z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C178336zF(Aweme aweme, User user, C43I<? extends Comment> c43i, AbstractC177926ya panelType, boolean z, int i, boolean z2, int i2, C178136yv c178136yv, C43I<? extends BaseResponse> c43i2, C43I<Boolean> c43i3, C43I<String> c43i4, boolean z3, C43I<? extends Editable> c43i5, C43I<Boolean> c43i6, C43I<OSZ<Boolean, Boolean>> c43i7, String str, boolean z4, boolean z5, boolean z6) {
        o.LJIIIZ(panelType, "panelType");
        this.LJLIL = aweme;
        this.LJLILLLLZI = user;
        this.LJLJI = c43i;
        this.LJLJJI = panelType;
        this.LJLJJL = z;
        this.LJLJJLL = i;
        this.LJLJL = z2;
        this.LJLJLJ = i2;
        this.LJLJLLL = c178136yv;
        this.LJLL = c43i2;
        this.LJLLI = c43i3;
        this.LJLLILLLL = c43i4;
        this.LJLLJ = z3;
        this.LJLLL = c43i5;
        this.LJLLLL = c43i6;
        this.LJLLLLLL = c43i7;
        this.LJLZ = str;
        this.LJZ = z4;
        this.LJZI = z5;
        this.LJZL = z6;
    }
}
