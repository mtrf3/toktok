package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.SpecifiedDisplayText;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CQ6 extends CQO<LikeMessage> implements CS1 {
    public boolean LJIL;
    public final CQI LJJ;

    @Override // X.CS1
    public final CS1 LIZJ() {
        return null;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d3q;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        DataChannel dataChannel;
        C19690px c19690px;
        int i;
        if (this.LJIL && (dataChannel = this.LJIIJJI.LJIIIIZZ) != null && (c19690px = (C19690px) dataChannel.kv0(C54812Dd.class)) != null) {
            Resources resources = this.LJIIJJI.LIZ.getResources();
            if (c19690px.LJII) {
                i = R.string.ngo;
            } else {
                i = R.string.ngr;
            }
            String string = resources.getString(i);
            int indexOf = string.indexOf("%s");
            if (indexOf != -1) {
                User user = getUser();
                LJLLL();
                CharSequence LJIIIIZZ = CXJ.LJIIIIZZ(user, this);
                if (LJIIIIZZ != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, LJIIIIZZ);
                    int LJIIL = LJIIL();
                    spannableStringBuilder.setSpan(LJIILJJIL(LJIIL, user), indexOf, LJIIIIZZ.length() + indexOf, 34);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIL), indexOf, LJIIIIZZ.length() + indexOf, 34);
                    CXJ.LJIIIZ(spannableStringBuilder, 0, spannableStringBuilder.length(), this, false, -1);
                    return spannableStringBuilder;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // X.CQL
    public final boolean LJLJL() {
        return false;
    }

    @Override // X.CQL
    public final boolean LJLJLLL() {
        return true;
    }

    @Override // X.CQL
    public final boolean LJZ() {
        return true;
    }

    @Override // X.CQL
    public final boolean LJZI() {
        return true;
    }

    @Override // X.CQO, X.CQL
    public final Text LJLI() {
        List<SpecifiedDisplayText> list;
        Text text;
        LikeMessage likeMessage = (LikeMessage) this.LJIJJLI;
        if (likeMessage != null && (list = likeMessage.specifiedDisplayText) != null && list.size() > 0) {
            for (SpecifiedDisplayText specifiedDisplayText : likeMessage.specifiedDisplayText) {
                if (specifiedDisplayText != null && specifiedDisplayText.uid == this.LJIIJJI.LIZLLL() && (text = specifiedDisplayText.displayText) != null) {
                    return text;
                }
            }
        }
        return super.LJLI();
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        if (!this.LJIL && super.LL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((LikeMessage) this.LJIJJLI).user;
    }

    @Override // X.CQL, X.InterfaceC31347CRz
    public final boolean LJJJJ() {
        if (LJLJJL()) {
            CQQ cqq = this.LJIIJJI;
            CR6 message = this.LJIJJLI;
            cqq.getClass();
            o.LJIIIZ(message, "message");
            InterfaceC31318CQw<? extends CR6> LJII = cqq.LJIIJ.LJII(message);
            if (LJII instanceof CQ8) {
                CQ8 cq8 = (CQ8) LJII;
                MESSAGE message2 = this.LJIJJLI;
                cq8.getClass();
                o.LJIIIZ(message2, "message");
                if (cq8.LIZ == message2.getMessageId()) {
                    return false;
                }
            }
        }
        return super.LJJJJ();
    }

    @Override // X.CS1
    public final boolean LJIILIIL() {
        return this.LJIL;
    }

    @Override // X.CS1
    public final CQI LJJIJIIJI() {
        return this.LJJ;
    }

    public CQ6(LikeMessage likeMessage) {
        super(likeMessage);
        this.LJJ = new CQI();
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ cqq) {
        CommonMessageData commonMessageData;
        MESSAGE message = this.LJIJJLI;
        if (message.isLocalInsertMsg && (commonMessageData = message.baseMessage) != null && commonMessageData.displayText == null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.n5s);
            Text text = new Text();
            text.key = "pm_mt_msg_viewer";
            text.defaultPattern = LJIILJJIL;
            TextFormat textFormat = new TextFormat();
            textFormat.color = "#ffffff";
            text.defaultFormat = textFormat;
            TextPieceUser textPieceUser = new TextPieceUser();
            textPieceUser.user = ((LikeMessage) this.LJIJJLI).user;
            TextPiece textPiece = new TextPiece();
            textPiece.userValue = textPieceUser;
            TextFormat textFormat2 = new TextFormat();
            textFormat2.color = C16880lQ.LLLZ("#%x", new Object[]{Integer.valueOf(LJIIL())});
            textPiece.format = textFormat2;
            textPiece.type = CXI.USER.getPieceType();
            text.pieces = Collections.singletonList(textPiece);
            this.LJIJJLI.baseMessage.displayText = text;
        }
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
