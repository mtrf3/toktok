package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CQ7 extends CQO<SocialMessage> implements CS1 {
    public boolean LJIL;
    public final CQI LJJ;

    @Override // X.CS1
    public final CS1 LIZJ() {
        return null;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIIIIZZ() {
        if (this.LIZJ || !LJLJJL() || LJJJJ()) {
            return false;
        }
        return true;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        MESSAGE message = this.LJIJJLI;
        if (((SocialMessage) message).action == 1 || ((SocialMessage) message).action == 51) {
            return R.drawable.d2x;
        }
        if (((SocialMessage) message).action == 3) {
            return R.drawable.d5a;
        }
        return R.drawable.d2a;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        int i;
        int i2;
        String string;
        DataChannel dataChannel;
        C19690px c19690px;
        int i3;
        if (this.LJIL && (dataChannel = this.LJIIJJI.LJIIIIZZ) != null && (c19690px = (C19690px) dataChannel.kv0(C54812Dd.class)) != null) {
            Resources resources = this.LJIIJJI.LIZ.getResources();
            if (c19690px.LJII) {
                i3 = R.string.ngm;
            } else {
                i3 = R.string.ngp;
            }
            String string2 = resources.getString(i3);
            int indexOf = string2.indexOf("%s");
            if (indexOf != -1) {
                User user = getUser();
                LJLLL();
                CharSequence LJIIIIZZ = CXJ.LJIIIIZZ(user, this);
                if (LJIIIIZZ != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, LJIIIIZZ);
                    int LJIIL = LJIIL();
                    spannableStringBuilder.setSpan(LJIILJJIL(LJIIL, user), indexOf, LJIIIIZZ.length() + indexOf, 34);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIL), indexOf, LJIIIIZZ.length() + indexOf, 34);
                    CXJ.LJIIIZ(spannableStringBuilder, 0, spannableStringBuilder.length(), this, false, -1);
                    return spannableStringBuilder;
                }
            }
        }
        if (((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90() == null) {
            i = 0;
            i2 = 0;
        } else {
            i = R.color.aao;
            i2 = R.color.a8j;
        }
        SocialMessage socialMessage = (SocialMessage) this.LJIJJLI;
        User user2 = socialMessage.user;
        Context LIZLLL = C15380j0.LIZLLL();
        int i4 = (int) socialMessage.action;
        if (i4 != 1) {
            if (i4 != 3) {
                string = "";
            } else if (Build.VERSION.SDK_INT >= 24) {
                string = C15380j0.LJIILJJIL(R.string.sy8);
            } else {
                string = LIZLLL.getResources().getString(R.string.sy8);
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            string = C15380j0.LJIILJJIL(R.string.l9n);
        } else {
            string = LIZLLL.getResources().getString(R.string.l9n);
        }
        return CPR.LIZLLL(user2, " ", string, i, i2, this);
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        if (!this.LJIL && super.LL()) {
            return true;
        }
        return false;
    }

    public final boolean LLFF() {
        if (((SocialMessage) this.LJIJJLI).action == 1) {
            return true;
        }
        return false;
    }

    public final boolean LLFFF() {
        if (((SocialMessage) this.LJIJJLI).action == 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((SocialMessage) this.LJIJJLI).user;
    }

    @Override // X.CQL, X.InterfaceC31347CRz
    public final boolean LJJJJ() {
        if (LJLJJL()) {
            CQQ cqq = this.LJIIJJI;
            CR6 message = this.LJIJJLI;
            cqq.getClass();
            o.LJIIIZ(message, "message");
            InterfaceC31318CQw<? extends CR6> LJII = cqq.LJIIJ.LJII(message);
            if (LJII instanceof CQ9) {
                CQ9 cq9 = (CQ9) LJII;
                MESSAGE message2 = this.LJIJJLI;
                cq9.getClass();
                o.LJIIIZ(message2, "message");
                if (cq9.LIZ == message2.getMessageId()) {
                    return false;
                }
            }
        }
        return super.LJJJJ();
    }

    @Override // X.CQL
    public final boolean LJLJL() {
        if ((LLFF() || LLFFF()) && !this.LJIJJLI.isLocalInsertMsg) {
            return true;
        }
        return false;
    }

    @Override // X.CQL
    public final boolean LJLJLLL() {
        if (LLFF() || LLFFF()) {
            return true;
        }
        return false;
    }

    @Override // X.CQL
    public final boolean LJZ() {
        if (LLFF() || LLFFF()) {
            return true;
        }
        return false;
    }

    @Override // X.CQL
    public final boolean LJZI() {
        if (LJLJJL()) {
            return false;
        }
        if (!LLFFF() && !LLFF() && ((SocialMessage) this.LJIJJLI).action != 2) {
            return false;
        }
        return true;
    }

    @Override // X.CS1
    public final boolean LJIILIIL() {
        return this.LJIL;
    }

    @Override // X.CS1
    public final CQI LJJIJIIJI() {
        return this.LJJ;
    }

    public CQ7(SocialMessage socialMessage) {
        super(socialMessage);
        this.LJJ = new CQI();
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ cqq) {
        super.LJIILLIIL(cqq);
    }

    @Override // X.CQL
    public final void LJLZ(User user) {
        C29775BmN.LIZIZ(user);
    }

    @Override // X.CQL
    public final void LJLLLLLL(int i, User user) {
        C29775BmN.LIZ(i, user);
    }
}
