package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import kotlin.jvm.internal.o;

/* renamed from: X.460, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass460<CONTENT extends BaseContent> extends AbstractC1041546x implements G27 {
    public CONTENT LLIIIILZ;
    public SystemContent LLIIIJ;

    public float n0() {
        return 0.5f;
    }

    public void o0() {
    }

    public abstract void p0(C109544Rq c109544Rq, C109544Rq c109544Rq2, CONTENT content, int i);

    public final int m0() {
        float f;
        float n0;
        C99033ud c99033ud;
        C53948LFg LIZJ = C53946LFe.LIZJ(this.itemView.getContext(), null);
        if (LIZJ.LJFF && (c99033ud = this.LJLLL) != null && c99033ud.isBookMode()) {
            n0 = n0() * LIZJ.LIZIZ;
            f = 0.7f;
        } else {
            f = LIZJ.LIZIZ;
            n0 = n0();
        }
        return (int) (n0 * f);
    }

    @Override // X.AbstractC1041546x
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLL != null) {
            CONTENT content = this.LLIIIILZ;
            if (content != null && content.getExtContent() != null) {
                CONTENT content2 = this.LLIIIILZ;
                o.LJI(content2);
                C101323yK.LIZ(content2.getExtContent());
            } else {
                SystemContent systemContent = this.LLIIIJ;
                if (systemContent != null) {
                    C101323yK.LIZ(systemContent);
                }
            }
        }
        if (LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm")) {
            C9XU.LIZJ(this);
        }
    }

    @Override // X.AbstractC1041546x
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm")) {
            C9XU.LIZLLL(this);
        }
    }

    @Override // X.AbstractC1041546x
    public void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass460(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        if (LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm")) {
            o0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    @Override // X.AbstractC1041546x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(X.C109544Rq r7, X.C109544Rq r8, X.C109544Rq r9, int r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass460.P(X.4Rq, X.4Rq, X.4Rq, int):void");
    }
}
