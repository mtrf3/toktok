package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class HVL implements InterfaceC45547HuB {
    public String LJLIL;
    public String LJLILLLLZI;

    @Override // X.InterfaceC45547HuB
    public abstract /* synthetic */ View.OnClickListener getClickListener();

    @Override // X.InterfaceC45547HuB
    public abstract /* synthetic */ int layoutRes();

    @Override // X.InterfaceC45547HuB
    public abstract /* synthetic */ void setAlbumActivity(Activity activity);

    public final String getCreationID() {
        return this.LJLIL;
    }

    public final String getShootWay() {
        return this.LJLILLLLZI;
    }

    public HVL(EnterStoryParam param) {
        o.LJIIIZ(param, "param");
    }

    public final void setCreationID(String str) {
        this.LJLIL = str;
    }

    public final void setShootWay(String str) {
        this.LJLILLLLZI = str;
    }

    public final void injectMobParam(String shootWay, String creationID) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(creationID, "creationID");
        this.LJLILLLLZI = shootWay;
        this.LJLIL = creationID;
    }
}
