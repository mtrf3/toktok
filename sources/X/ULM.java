package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULM extends GroupableElementSpecImpl {
    public final DataChannel LJLIL;
    public final C5H3 LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULM(LayeredElementContext layeredElementContext) {
        super(R.id.i_x);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext.getDataChannel();
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(ULN.INSTANCE);
        this.LJLJJI = true;
        addSceneObserver(new ULL(this));
    }
}
