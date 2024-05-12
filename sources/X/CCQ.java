package X;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;

/* loaded from: classes6.dex */
public final class CCQ extends CountDownTimer {
    public final /* synthetic */ SelectPollViewModel LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        CC4.LIZLLL = false;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        SelectPollViewModel selectPollViewModel = this.LIZ;
        if (selectPollViewModel.LJLILLLLZI == CCC.GIFT) {
            CC4.LIZLLL = true;
        }
        ((LiveData) selectPollViewModel.LJLJLJ.getValue()).postValue(Long.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CCQ(long j, SelectPollViewModel selectPollViewModel) {
        super(j, 1000L);
        this.LIZ = selectPollViewModel;
    }
}
