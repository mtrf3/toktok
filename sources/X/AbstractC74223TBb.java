package X;

/* renamed from: X.TBb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74223TBb extends AbstractC74228TBg implements InterfaceC74227TBf {
    public abstract /* synthetic */ Object get();

    public abstract /* synthetic */ void set(Object obj);

    @Override // X.AbstractC74233TBl
    public final InterfaceC74234TBm computeReflected() {
        C65352Pkq.LIZ.getClass();
        return this;
    }

    @Override // X.InterfaceC74226TBe
    public Object getDelegate() {
        return ((InterfaceC74226TBe) getReflected()).getDelegate();
    }

    @Override // X.AbstractC74228TBg, X.AbstractC74231TBj
    public TBY getGetter() {
        ((InterfaceC74226TBe) getReflected()).getGetter();
        return null;
    }

    @Override // X.AbstractC74228TBg
    public InterfaceC74230TBi getSetter() {
        ((InterfaceC74227TBf) getReflected()).getSetter();
        return null;
    }

    @Override // X.InterfaceC65784Pro
    public Object invoke() {
        return get();
    }

    public AbstractC74223TBb() {
    }

    @Override // X.AbstractC74228TBg, X.AbstractC74231TBj
    public /* bridge */ /* synthetic */ InterfaceC39094FVy getGetter() {
        getGetter();
        return null;
    }

    @Override // X.AbstractC74228TBg
    public /* bridge */ /* synthetic */ InterfaceC39095FVz getSetter() {
        getSetter();
        return null;
    }

    public AbstractC74223TBb(Object obj) {
        super(obj);
    }

    public AbstractC74223TBb(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
