package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedPreload;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LTC implements InterfaceC84349X8n {
    public final /* synthetic */ C72242sW LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C72242sW LIZLLL;

    @Override // X.InterfaceC84349X8n
    public final void LIZ(X8W trigger) {
        o.LJIIIZ(trigger, "trigger");
        Bundle bundle = new Bundle();
        C72242sW c72242sW = this.LIZ;
        String str = this.LIZIZ;
        String str2 = this.LIZJ;
        bundle.putLong("start_time", c72242sW.element);
        bundle.putString(WM7.SCENE_SERVICE, str);
        bundle.putString("aweme_ids", str2);
        trigger.LIZIZ(bundle, FriendsFeedPreload.class, new LTB(this.LIZIZ, this.LIZLLL, this.LIZ));
    }

    public LTC(C72242sW c72242sW, String str, String str2, C72242sW c72242sW2) {
        this.LIZ = c72242sW;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c72242sW2;
    }
}
