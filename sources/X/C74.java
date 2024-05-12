package X;

import com.bytedance.android.livesdk.subscribe.model.BubbleInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class C74 implements InterfaceC19890qH {
    public final /* synthetic */ BubbleInfo LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;

    public C74(BubbleInfo bubbleInfo, List<String> list) {
        this.LJLIL = bubbleInfo;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.LJLILLLLZI;
        BubbleInfo bubbleInfo = this.LJLIL;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(String.valueOf(bubbleInfo.bubbleType));
        InterfaceC30442Bx8.X1.LIZJ(arrayList);
        if (this.LJLIL.bubbleType == 5) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_transformation_bubble_show");
            LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
            LIZ.LJJIIJZLJL();
        }
    }
}
