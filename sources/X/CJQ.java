package X;

import Y.ACListenerS31S0300000_5;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJQ extends CJT {
    public final C47061t0 LJLIL;
    public final /* synthetic */ CJR LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJQ(CJR cjr, View view) {
        super(view);
        this.LJLILLLLZI = cjr;
        View findViewById = view.findViewById(R.id.f2j);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_emote)");
        this.LJLIL = (C47061t0) findViewById;
    }

    @Override // X.CJT
    public final void L(CJT holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (!(holder instanceof CJQ)) {
            return;
        }
        Object obj = ListProtector.get(this.LJLILLLLZI.LJLIL, i);
        o.LJIIIIZZ(obj, "quickCommentList[position]");
        EmoteModel emoteModel = ((QuickChatContent) obj).emote;
        if (emoteModel == null) {
            return;
        }
        C31665Cbl.LJ(emoteModel.image, ((CJQ) holder).LJLIL);
        View view = holder.itemView;
        CJR cjr = this.LJLILLLLZI;
        C16880lQ.LJIIJ(new ACListenerS31S0300000_5(cjr.LJLJI, emoteModel, cjr, 17), view);
    }
}
