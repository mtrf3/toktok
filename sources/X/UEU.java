package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public abstract class UEU extends RecyclerView.ViewHolder {
    public abstract void L(UEU ueu, RealtimeViolationRecord realtimeViolationRecord);

    public abstract void M(long j);

    public UEU(View view) {
        super(view);
    }
}
