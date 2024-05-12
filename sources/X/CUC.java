package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class CUC extends LinearLayout implements LifecycleOwner {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public int LJLIL;

    public abstract void LJI(CQP cqp);

    public abstract boolean LJII();

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJ(boolean z);

    public abstract void LJIIJJI(boolean z);

    public abstract void LJIIL();

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL(ChatMessage chatMessage, ChatMessage chatMessage2);

    public void LJIILL(int i) {
    }

    public void LJIILLIIL(int i) {
    }

    public abstract int getCurTabMsg();

    public abstract void setMsgBtnActive(boolean z);

    public abstract void setTipsView(View view);

    public int getState() {
        return this.LJLIL;
    }

    public void setState(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CUC(Context context, DataChannel dataChannel) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        new LinkedHashMap();
        this.LJLIL = 2;
    }
}
