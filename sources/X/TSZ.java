package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSZ extends F9E {
    public final String LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public TSZ(@InterfaceC74686TSw String disconnectionType) {
        o.LJIIIZ(disconnectionType, "disconnectionType");
        this.LJLIL = disconnectionType;
        this.LJLILLLLZI = 484;
        this.LJLJI = "";
        this.LJLJJI = "";
        this.LJLJJL = "";
        this.LJLJJLL = "";
        this.LJLJL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    }
}
