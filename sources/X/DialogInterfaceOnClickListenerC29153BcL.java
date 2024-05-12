package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BcL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29153BcL implements DialogInterface.OnClickListener {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ Fragment LJLJJLL;

    public DialogInterfaceOnClickListenerC29153BcL(C34K c34k, Room room, DataChannel dataChannel, Context context, Integer num, Fragment fragment) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = room;
        this.LJLJI = dataChannel;
        this.LJLJJI = context;
        this.LJLJJL = num;
        this.LJLJJLL = fragment;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Boolean, O] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        long j;
        if (this.LJLIL.element) {
            Room room = this.LJLILLLLZI;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C0N7.LJII("click", "cancel", j, this.LJLJI);
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.LJLJJI);
            if (LIZIZ != null) {
                LIZIZ.finish();
            }
            C29182Bco.LIZ().LIZLLL();
            return;
        }
        C0N7.LJIJJLI(this.LJLJI, "cancel");
        Integer num = this.LJLJJL;
        if (num == null || num.intValue() != 0) {
            Integer num2 = this.LJLJJL;
            if (num2 != null && num2.intValue() == 1) {
                DataChannel dataChannel = this.LJLJI;
                ?? r2 = Boolean.TRUE;
                ((C32537Cpp) dataChannel.gv0(C29155BcN.class)).LIZ = r2;
                ((C32537Cpp) this.LJLJI.gv0(BDL.class)).LIZ = r2;
                if (C1XY.LJJIII(C29306Beo.LIZIZ(this.LJLJJI)) && C29137Bc5.LJFF(this.LJLILLLLZI)) {
                    View view = this.LJLJJLL.getView();
                    if (view != null) {
                        C29306Beo.LJIIIZ(view);
                    }
                    dialogInterface.dismiss();
                }
                PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class));
                if (previewStartLiveWidget != null) {
                    previewStartLiveWidget.LL(false);
                }
            }
        } else {
            C29162BcU.LIZIZ(1, null);
            if (C30922CBq.LIZIZ) {
                C0NB.LIZIZ("PreviewContinueLiveHelper", "cancel clicked, ");
            }
            this.LJLJI.rv0(PreviewStartLiveContinueMsgChannel.class, Boolean.TRUE);
            C28957BYb.LJLIL.LIZJ(this.LJLJJI, this.LJLJI);
        }
        C29182Bco.LIZ().LIZLLL();
    }
}
