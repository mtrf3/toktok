package X;

import androidx.activity.ComponentActivity;

/* loaded from: classes11.dex */
public final /* synthetic */ class OSA extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public OSA(ActivityC45651qj activityC45651qj) {
        super(0, activityC45651qj, ActivityC45651qj.class, "onBackPressed", "onBackPressed()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ((ComponentActivity) this.receiver).onBackPressed();
        return C76800UCe.LIZ;
    }
}
