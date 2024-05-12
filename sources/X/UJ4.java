package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveFollowCardVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJ4 extends GroupableElementSpecImpl {
    public final DataChannel LJLIL;
    public final C5H3 LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;

    public final Handler LIZJ() {
        return (Handler) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJ4(LayeredElementContext layeredElementContext) {
        super(R.id.i_x);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext.getDataChannel();
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(UJ9.INSTANCE);
        this.LJLJJI = true;
        addSceneObserver(new UJ5(this));
        addSceneObserver(new UJ6(this));
        addSceneObserver(new UJ7(this));
        addSceneObserver(new UJ3(this));
        addSceneObserver(new UJ0(this));
        addSceneObserver(new UJ1(this));
        addSceneObserver(new UJA(this));
        addSceneObserver(new C76971UIt(this));
        addSceneObserver(new C76975UIx(this));
        addSceneObserver(new C76977UIz(this));
        addSceneObserver(new C76970UIs(this));
        addSceneObserver(new UJ8(this));
    }

    public final void LIZ(int i, boolean z) {
        int i2;
        boolean z2;
        if (z) {
            i2 = (~i) & this.LJLJJL;
        } else {
            i2 = i | this.LJLJJL;
        }
        this.LJLJJL = i2;
        DataChannel dataChannel = this.LJLIL;
        if (this.LJLJI == 0 && this.LJLJJI && i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        dataChannel.rv0(ProgrammedLiveFollowCardVisibilityChannel.class, new C29594BjS(z2));
    }

    public final void LIZIZ(int i, boolean z) {
        int i2;
        LIZJ().removeCallbacksAndMessages(null);
        if (z) {
            i2 = (~i) & this.LJLJI;
        } else {
            i2 = i | this.LJLJI;
        }
        this.LJLJI = i2;
        boolean z2 = false;
        if (z) {
            this.LJLJJI = false;
            LIZJ().postDelayed(new ARunnableS49S0100000_13(this, 1), 20000L);
            return;
        }
        DataChannel dataChannel = this.LJLIL;
        if (i2 == 0 && this.LJLJJI && this.LJLJJL == 0) {
            z2 = true;
        }
        dataChannel.rv0(ProgrammedLiveFollowCardVisibilityChannel.class, new C29594BjS(z2));
    }
}
