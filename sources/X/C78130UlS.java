package X;

import android.content.Context;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.UlS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78130UlS implements InterfaceC78133UlV {
    public final Context LJLIL;
    public final DataChannel LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public InterfaceC78133UlV LJLJJL;

    @Override // X.InterfaceC78133UlV
    public final void LJJJZ() {
        InterfaceC78133UlV interfaceC78133UlV = this.LJLJJL;
        if (interfaceC78133UlV != null) {
            interfaceC78133UlV.LJJJZ();
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLI() {
        InterfaceC78133UlV interfaceC78133UlV = this.LJLJJL;
        if (interfaceC78133UlV != null) {
            interfaceC78133UlV.LJJLI();
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLIL() {
        InterfaceC78133UlV interfaceC78133UlV = this.LJLJJL;
        if (interfaceC78133UlV != null) {
            interfaceC78133UlV.LJJLIL();
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJZZI() {
        InterfaceC78133UlV interfaceC78133UlV = this.LJLJJL;
        if (interfaceC78133UlV != null) {
            interfaceC78133UlV.LJJZZI();
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJJ(SurveyData surveyData) {
        InterfaceC78133UlV interfaceC78133UlV;
        if (surveyData.showMode.style == 2) {
            interfaceC78133UlV = (DialogC78134UlW) this.LJLJJI.getValue();
        } else {
            interfaceC78133UlV = (SurveyCardWidget) this.LJLJI.getValue();
        }
        this.LJLJJL = interfaceC78133UlV;
        if (interfaceC78133UlV != null) {
            interfaceC78133UlV.LJJJ(surveyData);
        }
    }

    public C78130UlS(Context context, DataChannel dataChannel) {
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        C5H3 LJJIJIIJI = C78996UzQ.LJJIJIIJI(C78131UlT.LJLIL);
        this.LJLJI = LJJIJIIJI;
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 234));
        this.LJLJJL = (SurveyCardWidget) LJJIJIIJI.getValue();
    }
}
