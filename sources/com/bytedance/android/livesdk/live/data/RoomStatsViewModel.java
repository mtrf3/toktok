package com.bytedance.android.livesdk.live.data;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.live.model.RoomMultiStatsModel;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import java.util.Map;

/* loaded from: classes6.dex */
public class RoomStatsViewModel extends RxViewModel {
    public final MutableLiveData<Map<String, RoomStatsModel>> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Map<String, RoomMultiStatsModel>> LJLJJL = new MutableLiveData<>();
}
