package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCO implements ViewModelProvider.Factory {
    public final /* synthetic */ AbsSelectPollWidget LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public CCO(AbsSelectPollWidget absSelectPollWidget) {
        this.LIZ = absSelectPollWidget;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        DataChannel dataChannel = this.LIZ.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        return new SelectPollViewModel(dataChannel);
    }
}
