package X;

import android.view.View;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCN implements View.OnClickListener {
    public final /* synthetic */ NormalSelectPollWidget LJLIL;
    public final /* synthetic */ PollOptionInfo LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public CCN(NormalSelectPollWidget normalSelectPollWidget, PollOptionInfo pollOptionInfo, long j) {
        this.LJLIL = normalSelectPollWidget;
        this.LJLILLLLZI = pollOptionInfo;
        this.LJLJI = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConstraintProperty constraintPropertyById;
        this.LJLIL.LJZI(false);
        LayeredElementContext layeredElementContext = this.LJLIL.getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(this.LJLIL.getId())) != null) {
            constraintPropertyById.alpha(0.3f);
        }
        if (this.LJLIL.dataChannel.kv0(RoomChannel.class) == null) {
            return;
        }
        NormalSelectPollWidget normalSelectPollWidget = this.LJLIL;
        String str = this.LJLILLLLZI.displayContent;
        normalSelectPollWidget.getClass();
        o.LJIIIZ(str, "<set-?>");
        normalSelectPollWidget.LJLJI = str;
        NormalSelectPollWidget normalSelectPollWidget2 = this.LJLIL;
        normalSelectPollWidget2.LJLJJI = this.LJLILLLLZI.optionIndex;
        SelectPollViewModel selectPollViewModel = normalSelectPollWidget2.LJLLILLLL;
        if (selectPollViewModel != null) {
            Object kv0 = normalSelectPollWidget2.dataChannel.kv0(RoomChannel.class);
            o.LJI(kv0);
            long id = ((Room) kv0).getId();
            long j = this.LJLJI;
            int i = this.LJLILLLLZI.optionIndex;
            NormalSelectPollWidget lifecycleOwner = this.LJLIL;
            o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
            C29306Beo.LJJIIJZLJL(lifecycleOwner, null, new CCM(id, j, i, selectPollViewModel, null), 3);
        }
        this.LJLIL.LJLZ();
    }
}
