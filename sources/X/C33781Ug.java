package X;

import android.text.style.CharacterStyle;
import com.bytedance.android.livesdk.hotword.ui.HotWordBackgroundSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33781Ug extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final CharacterStyle LJLJJL;
    public final int LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), this.LJLJJL, Integer.valueOf(this.LJLJJLL)};
    }

    public C33781Ug(String keywordTrigger, long j, int i, int i2, HotWordBackgroundSpan hotWordBackgroundSpan) {
        o.LJIIIZ(keywordTrigger, "keywordTrigger");
        this.LJLIL = keywordTrigger;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = hotWordBackgroundSpan;
        this.LJLJJLL = 33;
    }
}
