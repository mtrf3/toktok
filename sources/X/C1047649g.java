package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate$checkShowUnreadMessageTips$shouldShowIndicatorDeffer$1", f = "UnreadIndicatorDelegate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.49g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047649g extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C1047549f LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047649g(C1047549f c1047549f, long j, long j2, long j3, InterfaceC67352kd<? super C1047649g> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c1047549f;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1047649g(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String valueOf;
        String valueOf2;
        C141335gf.LIZJ(obj);
        final C1047549f c1047549f = this.LJLIL;
        if (c1047549f.LLFZ != null) {
            long j = this.LJLILLLLZI;
            long j2 = this.LJLJI;
            final long j3 = this.LJLJJI;
            boolean z = true;
            if (j > (r0.LLILLJJLI() - r0.LLILL()) + 1) {
                if (j2 > 99) {
                    valueOf = c1047549f.LJZI.getString(R.string.h_c);
                } else {
                    valueOf = String.valueOf(j2);
                }
                o.LJIIIIZZ(valueOf, "if (unreadCount > 99) {\n…ount.toString()\n        }");
                c1047549f.LLFFF.setText(c1047549f.LJZI.getResources().getQuantityString(c1047549f.LJLJJLL.LJ(), (int) j2, valueOf));
                if (j3 > 0) {
                    if (j3 > 99) {
                        valueOf2 = c1047549f.LJZI.getString(R.string.h_c);
                    } else {
                        valueOf2 = String.valueOf(j3);
                    }
                    o.LJIIIIZZ(valueOf2, "if (unreadMentionCount >….toString()\n            }");
                    TextView textView = c1047549f.LLFII;
                    if (textView != null) {
                        Resources resources = c1047549f.LJZI.getResources();
                        c1047549f.LJLJJLL.LIZLLL();
                        textView.setText(resources.getQuantityString(R.plurals.dd, (int) j3, valueOf2));
                    }
                    C17N.LJJLIIIJJI(c1047549f.LLFF);
                } else {
                    View invisible = c1047549f.LLFF;
                    o.LJIIIZ(invisible, "$this$invisible");
                    invisible.setVisibility(4);
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1047549f.LLD, "translationX", C1DF.LJIIIIZZ(LiveTryModeCountDownThresholdSetting.DEFAULT), 0.0f);
                ofFloat.setDuration(240L);
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.49l
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C34B.LJI("UnreadMessageTips", "showUnreadMessageTips: onAnimationEnd");
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        if (j3 > 0) {
                            C17N.LJJLIIIJJI(c1047549f.LLFII);
                        }
                        C17N.LJJLIIIJJI(c1047549f.LLD);
                        C34B.LJI("UnreadMessageTips", "showUnreadMessageTips: onAnimationStart");
                    }
                });
                ofFloat.start();
                c1047549f.LLIFFJFJJ = ofFloat;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
