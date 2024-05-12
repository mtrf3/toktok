package X;

import Y.ARunnableS0S2110000_5;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetV2;

/* loaded from: classes6.dex */
public final class B9B implements VCA {
    public final /* synthetic */ SwitchDefinitionTipsWidgetV2 LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    public B9B(SwitchDefinitionTipsWidgetV2 switchDefinitionTipsWidgetV2, String str, String str2) {
        this.LIZ = switchDefinitionTipsWidgetV2;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.VCA
    public final void LIZ(boolean z) {
        SwitchDefinitionTipsWidgetV2 switchDefinitionTipsWidgetV2 = this.LIZ;
        switchDefinitionTipsWidgetV2.LJLILLLLZI.post(new ARunnableS0S2110000_5(z, switchDefinitionTipsWidgetV2, this.LIZIZ, this.LIZJ, 1));
    }
}
