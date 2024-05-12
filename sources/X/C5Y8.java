package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Y8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Y8 extends AbstractC65781Prl implements InterfaceC88472Yns<C5Y5, C5Y5> {
    public final /* synthetic */ AbstractC143275jn LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5Y8(AbstractC143275jn abstractC143275jn, boolean z, boolean z2, boolean z3, String str) {
        super(1);
        this.LJLIL = abstractC143275jn;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C5Y5 invoke(C5Y5 c5y5) {
        Number number;
        C5Y5 setState = c5y5;
        o.LJIIIZ(setState, "$this$setState");
        String string = C78688UuS.LJIJJ(this.LJLIL).getString(R.string.b4_);
        float f = 100;
        int i = (int) (this.LJLIL.LLIZ().voiceVolume * f);
        int i2 = (int) (this.LJLIL.LLIZ().musicVolume * f);
        AudioRecorderParam audioRecorderParam = this.LJLIL.LLIZ().veAudioRecorderParam;
        if (audioRecorderParam != null) {
            number = Float.valueOf(audioRecorderParam.getRecordVolume());
        } else {
            number = 0;
        }
        int intValue = number.intValue() * 100;
        boolean z = this.LJLILLLLZI;
        boolean z2 = this.LJLJI;
        boolean z3 = this.LJLJJI;
        String str = this.LJLJJL;
        o.LJIIIIZZ(string, "getString(R.string.accompany)");
        return C5Y5.LIZ(setState, i, i2, intValue, z, z2, z3, str, string, null, 256);
    }
}
