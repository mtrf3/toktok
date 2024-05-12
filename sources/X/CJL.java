package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJL implements View.OnTouchListener {
    public final /* synthetic */ EmoteModel LJLIL;
    public final /* synthetic */ CJJ LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public CJL(int i, EmoteModel emoteModel, CJJ cjj) {
        this.LJLIL = emoteModel;
        this.LJLILLLLZI = cjj;
        this.LJLJI = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        CJO cjo;
        if (this.LJLIL.readOnly || (cjo = this.LJLILLLLZI.LJLILLLLZI) == null) {
            return false;
        }
        o.LJIIIIZZ(v, "v");
        o.LJIIIIZZ(event, "event");
        return cjo.LJJIJIIJI(v, event, this.LJLJI, this.LJLIL);
    }
}
