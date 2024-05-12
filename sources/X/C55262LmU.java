package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.LmU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55262LmU extends AbstractC50421Jqb<AbstractC51036K1g<?, ?>, C51031K1b<AbstractC51036K1g<?, ?>>> {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        int i2;
        if (this.LJLIL) {
            i2 = 1000;
        } else {
            i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        return i2 + i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55262LmU(AbstractC51036K1g abstractC51036K1g, String str) {
        this.mModel = abstractC51036K1g == null ? Z8A.LIZIZ.createAwemeModel() : abstractC51036K1g;
        this.mPresenter = new C51031K1b();
        this.LJLIL = true;
        this.LJLILLLLZI = str;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        int i3 = 1000;
        if (C2060386t.LIZ(feedParam.getSecUid())) {
            PRESENTER presenter = this.mPresenter;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Boolean.TRUE;
            objArr[2] = this.LJLILLLLZI;
            objArr[3] = Integer.valueOf(feedParam.getVideoType());
            if (!this.LJLIL) {
                i3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            objArr[4] = Integer.valueOf(i3);
            presenter.LJIILL(objArr);
            return;
        }
        PRESENTER presenter2 = this.mPresenter;
        Object[] objArr2 = new Object[6];
        objArr2[0] = Integer.valueOf(i);
        objArr2[1] = Boolean.TRUE;
        objArr2[2] = this.LJLILLLLZI;
        objArr2[3] = Integer.valueOf(feedParam.getVideoType());
        if (!this.LJLIL) {
            i3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        objArr2[4] = Integer.valueOf(i3);
        objArr2[5] = feedParam.getSecUid();
        presenter2.LJIILL(objArr2);
    }
}
