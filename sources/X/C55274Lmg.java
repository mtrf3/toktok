package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Lmg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55274Lmg implements IEvent {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public boolean LJLJL;
    public Runnable LJLJLJ;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public C55274Lmg(int i, int i2) {
        this(0.0f, 0.0f, i, i2, 0, false);
    }

    public C55274Lmg(float f, int i, float f2, int i2) {
        this(f, f2, i, i2, 0, true);
    }

    public C55274Lmg(boolean z, int i, int i2, int i3) {
        this(0.0f, 0.0f, i, i3, i2, z);
    }

    public C55274Lmg(float f, float f2, int i, int i2, int i3, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = f2;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
    }
}
