package X;

/* renamed from: X.TBa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74222TBa extends AbstractC74231TBj implements InterfaceC74226TBe {
    public abstract /* synthetic */ Object get();

    @Override // X.AbstractC74233TBl
    public final InterfaceC74234TBm computeReflected() {
        C65352Pkq.LIZ.getClass();
        return this;
    }

    @Override // X.InterfaceC74226TBe
    public Object getDelegate() {
        return ((InterfaceC74226TBe) getReflected()).getDelegate();
    }

    @Override // X.AbstractC74231TBj
    public TBY getGetter() {
        ((InterfaceC74226TBe) getReflected()).getGetter();
        return null;
    }

    @Override // X.InterfaceC65784Pro
    public Object invoke() {
        return get();
    }

    public AbstractC74222TBa() {
    }

    @Override // X.AbstractC74231TBj
    public /* bridge */ /* synthetic */ InterfaceC39094FVy getGetter() {
        getGetter();
        return null;
    }

    public AbstractC74222TBa(Object obj) {
        super(obj);
    }

    public AbstractC74222TBa(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
