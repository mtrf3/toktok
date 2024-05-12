package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioPageWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioPageWidgetV2;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bva, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30346Bva extends C0N0 {
    public final C29180Bcm LJLILLLLZI;
    public final C25260yw LJLJI;
    public final java.util.Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final InterfaceC65350Pko<? extends AbstractPreviewLiveStudioPage> getLiveStudioWidgetClass() {
        Boolean bool;
        Class cls;
        C29180Bcm c29180Bcm = this.LJLILLLLZI;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLJJL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            cls = PreviewLiveStudioPageWidgetV2.class;
        } else {
            cls = PreviewLiveStudioPageWidget.class;
        }
        return C65352Pkq.LIZ(cls);
    }

    @Override // X.C0N0
    public final void LIZ() {
        C25260yw c25260yw = this.LJLJI;
        if (c25260yw != null) {
            c25260yw.LIZJ.clear();
            c25260yw.LIZLLL.clear();
            c25260yw.LJI = true;
        }
        if (!C35001Yy.LIZJ(getContext())) {
            C65776Prg sj = C7N.LIZJ().sj();
            if ((sj instanceof InterfaceC65350Pko) && sj != null) {
                C0N9.LIZ(sj, (C31809Ce5) LJFF(R.id.agf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
            }
        }
    }

    @Override // X.C0N0
    public final void LIZIZ() {
        C25260yw c25260yw = this.LJLJI;
        if (c25260yw != null) {
            c25260yw.LJI = false;
        }
    }

    @Override // X.C0N0
    public final void LIZJ() {
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCloseWidget.class), (C31809Ce5) LJFF(R.id.bg2), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(getLiveStudioWidgetClass(), (C31809Ce5) LJFF(R.id.fzk), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSeeMoreDetailWidget.class), (C31809Ce5) LJFF(R.id.jk5), new InterfaceC65350Pko[0], true);
    }

    @Override // X.C0N0
    public final void LIZLLL() {
        C25260yw c25260yw = this.LJLJI;
        if (c25260yw != null) {
            c25260yw.LIZIZ();
        }
    }

    public C30346Bva(Context context, C61 c61) {
        super(context, R.layout.dgj);
        C25260yw c25260yw;
        View findViewById;
        this.LJLILLLLZI = (C29180Bcm) DataChannelGlobal.LJLJJI.mv0(C29053Baj.class);
        if (c61 != null) {
            c25260yw = c61.LIZJ;
        } else {
            c25260yw = null;
        }
        this.LJLJI = c25260yw;
        C47061t0 radio_cover = (C47061t0) LJFF(R.id.ils);
        o.LJIIIIZZ(radio_cover, "radio_cover");
        C22960vE.LIZ(context, radio_cover);
        if (!C259710f.LIZ.LJIIIZ() && (findViewById = findViewById(R.id.i3g)) != null) {
            findViewById.setOnTouchListener(ViewOnTouchListenerC30345BvZ.LJLIL);
        }
    }
}
