package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MqE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58042MqE extends F9E implements InterfaceC87283bg {
    public final C58041MqD LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public C58042MqE(C58041MqD c58041MqD, String platforms, String skipPlatforms, boolean z) {
        o.LJIIIZ(platforms, "platforms");
        o.LJIIIZ(skipPlatforms, "skipPlatforms");
        this.LJLIL = c58041MqD;
        this.LJLILLLLZI = platforms;
        this.LJLJI = skipPlatforms;
        this.LJLJJI = z;
    }
}
