package X;

import android.animation.Animator;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Thi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75350Thi extends C75352Thk {
    public final /* synthetic */ C75349Thh LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        TextView textView = this.LJLIL.onlineTicketAnimation;
        if (textView != null) {
            textView.setVisibility(8);
            TextView textView2 = this.LJLIL.mOnlineTicket;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                TextView textView3 = this.LJLIL.mOnlineTicket;
                if (textView3 != null) {
                    textView3.setText(this.LJLILLLLZI);
                    if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                        C75349Thh c75349Thh = this.LJLIL;
                        TextView textView4 = c75349Thh.mOnlineTicket;
                        if (textView4 != null) {
                            c75349Thh.setWidth(textView4, this.LJLJI);
                        } else {
                            o.LJIJI("mOnlineTicket");
                            throw null;
                        }
                    } else {
                        C75349Thh c75349Thh2 = this.LJLIL;
                        TextView textView5 = c75349Thh2.mOnlineTicket;
                        if (textView5 != null) {
                            c75349Thh2.setWidth(textView5, this.LJLJJI);
                        } else {
                            o.LJIJI("mOnlineTicket");
                            throw null;
                        }
                    }
                    C75349Thh c75349Thh3 = this.LJLIL;
                    View view = c75349Thh3.fanTicketContainerInner;
                    if (view != null) {
                        c75349Thh3.setWidth(view, -2);
                    }
                    C75349Thh c75349Thh4 = this.LJLIL;
                    View view2 = c75349Thh4.fanTicketContainer;
                    if (view2 != null) {
                        c75349Thh4.setWidth(view2, -2);
                        return;
                    }
                    return;
                }
                o.LJIJI("mOnlineTicket");
                throw null;
            }
            o.LJIJI("mOnlineTicket");
            throw null;
        }
        o.LJIJI("onlineTicketAnimation");
        throw null;
    }

    public C75350Thi(C75349Thh c75349Thh, String str, int i, int i2) {
        this.LJLIL = c75349Thh;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
