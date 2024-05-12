package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multimatch.event.MultiMatchAudienceScoreClickEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TzD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC76435TzD implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC76430Tz8 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public ViewOnClickListenerC76435TzD(ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8, boolean z) {
        this.LJLIL = viewOnClickListenerC76430Tz8;
        this.LJLILLLLZI = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannel;
        ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8 = this.LJLIL;
        C75883TqJ c75883TqJ = viewOnClickListenerC76430Tz8.LJLJL;
        if (c75883TqJ != null && (dataChannel = viewOnClickListenerC76430Tz8.LJLILLLLZI) != null) {
            dataChannel.qv0(MultiMatchAudienceScoreClickEvent.class, new C76436TzE(c75883TqJ, this.LJLILLLLZI));
        }
    }
}
