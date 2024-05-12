package X;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.api.creator.StreamResolution;

/* renamed from: X.Bcs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC29186Bcs implements View.OnClickListener {
    public final /* synthetic */ C29187Bct LJLIL;
    public final /* synthetic */ C29185Bcr LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ StreamResolution LJLJJL;

    public ViewOnClickListenerC29186Bcs(C29187Bct c29187Bct, C29185Bcr c29185Bcr, int i, int i2, StreamResolution streamResolution) {
        this.LJLIL = c29187Bct;
        this.LJLILLLLZI = c29185Bcr;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = streamResolution;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!((CompoundButton) this.LJLIL.itemView.findViewById(R.id.ijc)).isChecked()) {
            C29185Bcr c29185Bcr = this.LJLILLLLZI;
            int i = c29185Bcr.LJLJI;
            int i2 = this.LJLJI;
            if (i != i2) {
                c29185Bcr.LJLJI = i2;
                Integer valueOf = Integer.valueOf(this.LJLJJI);
                DataChannel dataChannel = c29185Bcr.LJLILLLLZI;
                if (dataChannel != null && valueOf != null) {
                    dataChannel.rv0(SelectedStreamResolutionChannel.class, Integer.valueOf(valueOf.intValue()));
                }
                int i3 = this.LJLILLLLZI.LJLJJLL;
                if (i3 > 0 && this.LJLJJL.minBitRate > i3 * 1000) {
                    C30868C9o.LIZJ(R.string.nri);
                }
                this.LJLILLLLZI.notifyDataSetChanged();
            }
        }
    }
}
