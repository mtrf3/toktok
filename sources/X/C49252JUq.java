package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JUq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49252JUq implements NIZ {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49251JUp LIZ;

    @Override // X.NIZ
    public final ViewGroup LJJI() {
        ViewGroup viewGroup = this.LIZ.LLII;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("mTopVideoAdInsideBottomLayout");
        throw null;
    }

    @Override // X.NIZ
    public final ViewGroup LJJII() {
        ViewGroup viewGroup = this.LIZ.LLIIIILZ;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("mTopVideoAdMaskLayout");
        throw null;
    }

    @Override // X.NIZ
    public final ViewGroup LJJJJI() {
        ViewGroup viewGroup = this.LIZ.LLIIII;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("mTopVideoAdOutsideBottomLayout");
        throw null;
    }

    @Override // X.NIZ
    public final void LJJJJL() {
        C48887JGp c48887JGp = this.LIZ.LJZ;
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core != null) {
                core.LLLJIL();
                return;
            }
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    @Override // X.NIZ
    public final void LJJJJZI() {
        C48887JGp c48887JGp = this.LIZ.LJZ;
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core != null) {
                core.LLLLLJLJLL();
                return;
            }
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    @Override // X.NIZ
    public final String getEnterFrom() {
        return this.LIZ.LJLJL().LJFF;
    }

    public C49252JUq(ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp) {
        this.LIZ = viewOnAttachStateChangeListenerC49251JUp;
    }

    @Override // X.NIZ
    public final void LJJJJIZL(Integer num) {
        Integer valueOf;
        TopVideoHolderVM Q = this.LIZ.Q();
        Q.getClass();
        if (num != null) {
            if (num.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.gkd);
            } else if (num.intValue() == 2) {
                valueOf = Integer.valueOf(R.string.exk);
            }
            Q.LJLJI.postValue(new C35719E0d(valueOf, num, false));
        }
        valueOf = null;
        Q.LJLJI.postValue(new C35719E0d(valueOf, num, false));
    }
}
