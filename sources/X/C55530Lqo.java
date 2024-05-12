package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileService;
import kotlin.jvm.internal.AqS172S0200000_9;

/* renamed from: X.Lqo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55530Lqo extends AbstractC50421Jqb<C55693LtR, C51031K1b<C55693LtR>> implements InterfaceC55285Lmr {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public InterfaceC55531Lqp LJLJJI;

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void unInit() {
        super.unInit();
        InterfaceC55531Lqp interfaceC55531Lqp = this.LJLJJI;
        if (interfaceC55531Lqp != null) {
            interfaceC55531Lqp.NJ(this.mModel);
        }
    }

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

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean init(Fragment fragment) {
        InterfaceC55531Lqp interfaceC55531Lqp = this.LJLJJI;
        if (interfaceC55531Lqp != null) {
            interfaceC55531Lqp.it0(this.mModel, this.LJLJI);
        }
        return super.init(fragment);
    }

    @Override // X.InterfaceC55285Lmr
    public final void LIZIZ(KRE kre, AqS172S0200000_9 aqS172S0200000_9) {
        this.LJLJJI = CommerceProfileService.LIZJ().LIZIZ(new C55529Lqn(this, kre, aqS172S0200000_9));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55530Lqo(AbstractC51036K1g abstractC51036K1g, boolean z, String str, String str2) {
        this.mModel = abstractC51036K1g instanceof C55693LtR ? abstractC51036K1g : new C55693LtR();
        this.mPresenter = new C51031K1b();
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        int i3 = 1000;
        if (C2060386t.LIZ(m89.getSecUid())) {
            PRESENTER presenter = this.mPresenter;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Boolean.TRUE;
            objArr[2] = this.LJLILLLLZI;
            objArr[3] = Integer.valueOf(m89.getVideoType());
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
        objArr2[3] = Integer.valueOf(m89.getVideoType());
        if (!this.LJLIL) {
            i3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        objArr2[4] = Integer.valueOf(i3);
        objArr2[5] = m89.getSecUid();
        presenter2.LJIILL(objArr2);
    }
}
