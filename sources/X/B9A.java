package X;

import Y.ARunnableS0S2110000_5;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;

/* loaded from: classes6.dex */
public final class B9A implements VCA {
    public final /* synthetic */ SwitchDefinitionTipsWidget LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    public B9A(SwitchDefinitionTipsWidget switchDefinitionTipsWidget, String str, String str2) {
        this.LIZ = switchDefinitionTipsWidget;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.VCA
    public final void LIZ(boolean z) {
        SwitchDefinitionTipsWidget switchDefinitionTipsWidget = this.LIZ;
        switchDefinitionTipsWidget.LJLILLLLZI.post(new ARunnableS0S2110000_5(z, switchDefinitionTipsWidget, this.LIZIZ, this.LIZJ, 0));
    }
}
