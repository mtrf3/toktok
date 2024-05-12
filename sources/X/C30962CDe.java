package X;

import Y.ACListenerS31S0300000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import kotlin.jvm.internal.o;

/* renamed from: X.CDe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30962CDe extends CDI {
    public final /* synthetic */ C30963CDf LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30962CDe(C30963CDf c30963CDf, ViewGroup parent) {
        super(new C47061t0(parent.getContext()));
        o.LJIIIZ(parent, "parent");
        this.LJLIL = c30963CDf;
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        C47061t0 c47061t0;
        o.LJIIIZ(holder, "holder");
        EmoteModel emoteModel = (EmoteModel) ORZ.LJLLLLLL(i, this.LJLIL.LJLJJI);
        View view = holder.itemView;
        if (!(view instanceof C47061t0) || (c47061t0 = (C47061t0) view) == null || emoteModel == null) {
            return;
        }
        int LIZ = C15380j0.LIZ(48.0f);
        C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(emoteModel.image);
        LJIIIZ.LJIJI = Boolean.TRUE;
        LJIIIZ.LJ = LIZ;
        LJIIIZ.LJFF = LIZ;
        LJIIIZ.LJIIJJI(c47061t0);
        C16880lQ.LJJI(c47061t0, new ACListenerS31S0300000_5(this.LJLIL, c47061t0, emoteModel, 29));
    }
}
