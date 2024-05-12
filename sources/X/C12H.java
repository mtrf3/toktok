package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.12H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12H extends LinearLayout {
    public final boolean LJLIL;
    public final ImageView LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public DataChannel LJLJJL;

    public final int getIconWidth() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12H(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        ImageModel avatarLarge;
        new LinkedHashMap();
        boolean isExperimentGroup = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();
        this.LJLIL = isExperimentGroup;
        this.LJLJI = C15380j0.LIZ(24.0f);
        View.inflate(activityC45651qj, R.layout.dkr, this);
        ImageView imageView = (ImageView) findViewById(R.id.f51);
        this.LJLILLLLZI = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.e35);
        if (isExperimentGroup) {
            if (imageView != null) {
                C87277YNd.LJJIIZ(imageView);
            }
            B83 LIZ = B83.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && (avatarLarge = interfaceC05190Ih.getAvatarLarge()) != null) {
                C15640jQ.LJIIIIZZ(imageView2, avatarLarge);
                return;
            }
            if (imageView2 != null) {
                C87277YNd.LJJIIZ(imageView2);
            }
            if (imageView == null) {
                return;
            }
            C87277YNd.LJJIJ(imageView);
            return;
        }
        if (imageView2 == null) {
            return;
        }
        C87277YNd.LJJIIZ(imageView2);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        if (!this.LJLIL) {
            this.LJLJJL = dataChannel;
            if (dataChannel != null) {
                dataChannel.mv0(NetworkStatus.class, this, new IDqS416S0100000(this, 345));
            }
        }
    }

    public final void setIconWidth(int i) {
        this.LJLJI = i;
    }
}
