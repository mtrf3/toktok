package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterPunishCardOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;

/* loaded from: classes14.dex */
public final class UEI extends UED {
    @Override // X.UED
    public final void L(int i) {
    }

    public UEI(UEF uef, View view) {
        super(view);
        AbstractC28931Bp abstractC28931Bp;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ig4);
        UEJ uej = uef.LJLIL;
        Context context = uef.LJLIL.getContext();
        o.LJIIIIZZ(context, "context");
        UEJ uej2 = uef.LJLIL;
        DataChannel dataChannel = uej2.LJLIL;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = uej2.LJLJLLL;
        uej.LJLLL = new UEQ(context, dataChannel, realtimeLiveCenterDetailData != null ? realtimeLiveCenterDetailData.violationRecords : null);
        AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
        if ((itemAnimator instanceof C40171ht) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator) != null) {
            abstractC28931Bp.LJI = false;
        }
        recyclerView.setAdapter(uef.LJLIL.LJLLL);
        uef.LJLIL.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C29306Beo.LJJLIIIJJI(view.findViewById(R.id.la9), LiveCenterPunishCardOptSetting.INSTANCE.isEnable());
        C29306Beo.LJJLIIIJJI(view.findViewById(R.id.la1), !r2.isEnable());
    }
}
