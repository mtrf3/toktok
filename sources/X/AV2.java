package X;

import android.content.Context;
import android.text.SpannableString;

/* loaded from: classes5.dex */
public final class AV2 extends AbstractC65781Prl implements InterfaceC65784Pro<SpannableString> {
    public final /* synthetic */ Context LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AV2(Context context) {
        super(0);
        this.LJLIL = context;
    }

    @Override // X.InterfaceC65784Pro
    public final SpannableString invoke() {
        SpannableString spannableString = new SpannableString(" ");
        C72769ShB LJJIJIIJI = C78977Uz7.LJJIJIIJI(this.LJLIL, null, 62);
        int i = AI8.LLI;
        LJJIJIIJI.LIZJ = i;
        int i2 = AI8.LLIFFJFJJ;
        LJJIJIIJI.LJI = i2;
        LJJIJIIJI.setBounds(0, 0, i2 + i, i);
        LJJIJIIJI.LIZ();
        spannableString.setSpan(new C8FR(LJJIJIIJI, 3), 0, spannableString.length(), 33);
        return spannableString;
    }
}
