package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.model.VoteResponseData;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCP implements Z8D {
    public final /* synthetic */ SelectPollViewModel LIZ;

    @Override // X.Z8D
    public final void onSuccess() {
        ((LiveData) this.LIZ.LJLJJL.getValue()).setValue(new VoteResponseData());
    }

    public CCP(SelectPollViewModel selectPollViewModel) {
        this.LIZ = selectPollViewModel;
    }

    @Override // X.Z8D
    public final void onFailed(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LIZ.gv0().setValue(e);
    }
}
