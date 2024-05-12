package X;

import com.bytedance.android.livesdk.survey.ISurveyService;
import com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget;

/* renamed from: X.UlT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78131UlT extends AbstractC65781Prl implements InterfaceC65784Pro<SurveyCardWidget> {
    public static final C78131UlT LJLIL = new C78131UlT();

    public C78131UlT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SurveyCardWidget invoke() {
        return ((ISurveyService) CN1.LIZ(ISurveyService.class)).vh0();
    }
}
