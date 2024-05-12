package X;

import com.ss.android.videoshop.layer.stub.BaseVideoLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public abstract class YSB extends BaseVideoLayer implements YT6 {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public final List<Integer> LJLJI = new ArrayList();
    public final List<YT8> LJLJJI = new ArrayList();

    public YSB() {
        this.LJLIL = true;
        this.LJLIL = true;
    }

    @Override // X.YT6
    public final boolean LIZJ(YT8 yt8) {
        if (this.LJLILLLLZI || !this.LJLIL) {
            return handleVideoEvent(yt8);
        }
        if (yt8 == null) {
            return false;
        }
        if (((ArrayList) this.LJLJI).contains(Integer.valueOf(yt8.getType()))) {
            if (!this.LJLILLLLZI && this.LJLIL) {
                addViews();
                this.LJLILLLLZI = true;
            }
            Iterator it = ((ArrayList) this.LJLJJI).iterator();
            while (it.hasNext()) {
                handleVideoEvent((YT8) it.next());
            }
            return handleVideoEvent(yt8);
        }
        if (getSupportEvents().contains(Integer.valueOf(yt8.getType()))) {
            ((ArrayList) this.LJLJJI).add(yt8);
        }
        return false;
    }

    @Override // com.ss.android.videoshop.layer.stub.BaseVideoLayer, X.YSA
    public final void onRegister(YTH yth) {
        if (!this.LJLIL) {
            super.onRegister(yth);
        } else {
            setHost(yth);
            this.mLayerStateInquirer = createLayerStateInquirer();
        }
    }
}
